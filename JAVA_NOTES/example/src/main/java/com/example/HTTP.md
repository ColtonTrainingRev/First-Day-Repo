# What is HTTP?
Hyper Text Transfer Protocol (http) is the most popular way of transfering information across the web in modern times. It is a request/response system that guarantees a response for every request made. There are a few standard components of an http request that you should be familiar with.
- uri
    - This is the part of the request that tells the web server what information you want
- body
    - Many http requests are going to contain a body: this is the information that is needed to complete whatever request you are making.
- verb
    -The verb of an http request provides context for what you as a requester is trying to accomplish with your http request
        - GET: the requester wants to "get" some information
        - POST: typically used when the requester wants to publish to a web application
        - PUT: Typically used when the requester wants to update all of a chosen resource handled by the web application
        - PATCH: Typically used when athe requester wants to update SOME of a resource handled by the web application
        - DELETE: typically used when the requester wants to delete some resource handled by the web application

You also should be familiar with the following components of an HTTP response:
-body
    -Contains whatever information you requested or an error message
-Status Code
    -This is a number that gives an immediate indication of how your request was handled
    -There are multiple http status levels you can get
        - 100 is informational
        - 200 is success
        - 300 is redirect
        - 400 is user error (client side error)
        - 500 is server error (the developer messed up)
            - 500 is BAD: you don't want 500 status codes being returned to your users

# JSON
Javascript Object Notation (JSON) is one of the most popular ways of formatting information in the http requests (really for any sort of web based communication). At their core, jsons are reall just formatted strings
```json
{
    "keyOne":"value one",
    "keyTwo":2,
    "keyThree":true
}
```
jsons accept three data types: strings, numbers, and booleans.