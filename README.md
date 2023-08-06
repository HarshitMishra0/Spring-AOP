# Spring-AOP

This is an example code for the implementation of Spring AOP.

You can reffer the notes below to know the theory about the AOP module of the Spring.

//NOTES STARTS HERE
AOP is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns

Process of applying services or external services as transaction management or logging to our application classes without modifying the code.

The services are also called cross cutting concerns.
 
Cross Cutting Concerns
Logging
Transactions
Security

ASPECT: An aspect is a modularisation of a concern that cuts across multiple classes.

Join Point: Join point is any point in any point in your program such as method execution, exception handling, field access etc. Spring supports only method execution join point.

Advice: Advice represent an action taken by an aspect at particular join point.

Pointcut: It is an expression of AOP that marches join point.  

Dependencies we need to add:
Spring core
Spring Context
Spring AoP
Aspectjrt
Aspectjweaver


If you get error in the path of .xml file, create a new directory in src named resources and move the xml file there

