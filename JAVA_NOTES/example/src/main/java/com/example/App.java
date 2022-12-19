package com.example; 

import java.util.ArrayList;
import java.util.List;

import io.javalin.Javalin;

/*
 * All Maven projects hae their code store inside of a src/main/java directory.
 * The reason we have a "com" package and inside of it there is a package called
 * "example" is because the maven project generates names based on your package
 * structure after the groupId you set when you set up your project. What this
 * means is that all of your Javae code is going to, at a minimum, have a 
 * "package com.example" to start it off in order to let Maven know where 
 * the code is when it builds our application.
 */
public class App 
{
    public static List<String> names = new ArrayList<>();
    public static void main( String[] args ){
        names.add("Billy");
        names.add("Sally");
        names.add("Holly");
        Javalin app = Javalin.create();

        /*
         * The code belows tells Javalin that our web server that is created needs 
         * to be able to handle an HTTP request that ends with /hello. Upon our application
         * recieving this request, the application should return the text "Hello World!" the
         * requester
         */
        app.get("/hello", ctx -> ctx.result("Hello World!"));

        //app.get("/person/{num}")

        app.post("/add", ctx -> {
            //We get the name from the http request boddy and save it to a variable
            String newName = ctx.body();
            //We add a new name to the list of names
            names.add(newName);
            //We tell Javalin we want to return a String message to the requester
            ctx.result("Congrats! You added a new name to the names database");
            //We tell Javalin we want the status code 201 returned in the response
            ctx.status(201);
        });

        app.get("/person/{num}", ctx -> {
            //We use the pathParam method to get the value of the num path parameter
            String numAsString = ctx.pathParam("num");
            //Since the value is a number, we convert the string into an int
            int num = Integer.parseInt((numAsString));
            //We use our newly converted int to access the index position of the name we want
            String person = names.get(num);
            //We tell Javalin to return the name of the person we got
            ctx.result(person);
            //We tell Javalin to set the status code to 200
            ctx.status(200);
        });

        //This is an example of how you could inform the user that the requested
        //information doesn't exist
        app.get("/protectedGet/{num}", ctx -> {
            String numAsString = ctx.pathParam("num");
            //Since the value is a number, we convert the string into an int
            int num = Integer.parseInt((numAsString));
            try {
                String person = names.get(num);
                ctx.result(person);
                ctx.status(200);
            } catch (IndexOutOfBoundsException e) {
                ctx.result("No person found at that index position");
                ctx.status(404);
            }
        });

        app.put("/replace/{num}", ctx -> {
            String numAsString = ctx.pathParam("num");
            //Since the value is a number, we convert the string into an int
            int num = Integer.parseInt((numAsString));
            //We use our newly converted int to access the index position of the name we want
            String replacePerson = ctx.body();
            //We tell Javalin to return the name of the person we got
            names.set(num, replacePerson);
            ctx.result("Replaced person successfully!");
            //We tell Javalin to set the status code to 200
            ctx.status(200);
        });

        app.patch("/update/{num}", ctx -> {
            String numAsString = ctx.pathParam("num");
            int num = Integer.parseInt((numAsString));
            String replacePerson = ctx.body();
            names.set(num, replacePerson);
            ctx.result("Successfully updated the person's information!");
            ctx.status(200);
        });

        app.delete("/clear", ctx -> {
            names.clear();
            ctx.result("All names have been removed from the database");
            ctx.status(200);
        });
        app.start();
    }
}
