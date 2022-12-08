package com.example;

import java.util.ArrayList;
import java.util.List;

import io.javalin.Javalin;

public class Library {
    /*
     * The default access modifier is given to any variable not given an access modifier
     * such as: Protected, private, or public
     */
    static List<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        Book startingBook = new Book();
        startingBook.setTitle("The Fellowship of the Ring");
        startingBook.setAuthor("J.R.R. Tolkien");
        startingBook.setGenre("Fantasy");
        startingBook.setIsbn(1234567);

        library.add(startingBook);
        
        Javalin app = Javalin.create();

        app.get("/book/{index}", ctx -> {
            //Here you don't HAVE to make a String variable to hold the pathParam, you can just
            //directly pass it into the function/method parseInt
            int index = Integer.parseInt(ctx.pathParam("index"));

            Book book = library.get(index);
            ctx.json(book);
            ctx.status(200);
        });

        app.post("/book", ctx -> {
            //convert the book json in the http request body into a Java Book object
            Book newBook = ctx.bodyAsClass(Book.class);
            //Add the new book into the library
            library.add(newBook);
            //Tell Jaavlin to return a success message
            ctx.result("Book added to the library!");
            ctx.status(201);
        });

        app.patch("/book/{index}", ctx -> {
            int index = Integer.parseInt(ctx.pathParam("index"));
            Book updatedBook = ctx.bodyAsClass(Book.class);
            library.get(index).setAuthor(updatedBook.getAuthor());
            library.get(index).setTitle(updatedBook.getTitle());
            library.get(index).setGenre(updatedBook.getGenre());
            ctx.json(library.get(index));
            ctx.status(200);
        });

        app.put("/book/{index}", ctx -> {
            int index = Integer.parseInt(ctx.pathParam("index"));
            Book updatedBook = ctx.bodyAsClass(Book.class);
            library.set(index, updatedBook);
            ctx.json(library.get(index));
            ctx.status(200);
        });

        app.delete("/book/{index}", ctx -> {
            int index = Integer.parseInt(ctx.pathParam("index"));
            library.remove(index);
            ctx.status(200);
        });

        app.start();
    }
}
