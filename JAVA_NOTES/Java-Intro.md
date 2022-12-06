# Java
Java is a well known enterprise programming language. As a language it is well designed to scale in size and capabilities. There are a few key details you should know about language:
- Java is a **strongly typed language**
    - once a data type is set, it cannot be changed
- Java is a **statically typed language**
    - You must declare the data type you are working with every time you create data in your Java application
-Java has automatic memory management
    - Java will handle all memory management and garbage collection for you
    - Garbage collection is the removal of data from memory that we are no longer using
- Write once, run anywhere
    - A machine containing a JRE/JVM can run any Java programs.
    - Any code written on a JVM can be run on any other OS containing a JVM.
## JDK, JRE, JVM
The Java Development Kit (JDK) contains the libraries and tools we need to be able to write our Java applications. One of the key tools we need is the Java compiler which allows us to turn our source code (.java files) into bite files (.class files)
A Java Runtime Environment (JRE) is provided with the JDK when you download it. A JRE is what is needed to actually be able to run your Java application. The JRE contains the runtime libraries necessary for your code to execute. Contained within the JRE is the Java Virtual Machine (JVM) which is the tool that actually handles ensuring your code will run on your machine.

The JVM is the tool that takes the byte code (.class files) and turns it into machine readable data understood by your particular operating system (OS). Keep in mind, all JVMs are found within theri respective Java Runtime Environment.