
# Lab.2 Topic: *Structural Design Patterns*

------
## Table of Contents

* [Objectives](#objectives)
* [Some Theory](#theory)
* [Main Tasks](#main-tasks)
* [Implementation](#implementation)
* [Results](#results)
* [Conclusions](#conclusions)
* [Author](#author)
------
## Objectives:

__1. Study and understand the Creational Design Patterns.__

__2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.__

__3. Use some creational design patterns for object instantiation in a sample project.__

## Some Theory :

In software engineering, the creational design patterns are the general solutions that deal with object creation, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by optimizing, hiding or controlling the object creation.

Some examples of this kind of design patterns are :

   * Singleton
   * Builder
   * Prototype
   * Object Pooling
   * Factory Method
   * Abstract Factory
   
## Main tasks :

__1. Choose an OO programming language and a suitable IDE or Editor;__

__2. Select a domain area for the sample project;__

__3. Define the main involved classes and think about what instantiation mechanisms are needed;__

__4. Based on the previous point, implement atleast 3 creational design patterns in your project;__

## Implementation

__In this lab it was implemented a project based on medical center (hospital) human resources data instatiation;__

__This project illustrates the implementation of the following creational design patterns:__
   * Singleton
   * Builder
   * Factory Method
   * Abstract Factory
 
In this lab we have an hospital which has employees that are working in 3 different departments and have a set of attributes like: name, surname, age, salary and job type.
But the idea of mapping a job to a certain employee while instatiating an object of this type depends on some builder methods which are taken by specific factory methods that corresponds to a specific department. In other words, the idea is that
it should be impossible to create a Pediater, for example, in the Surgery department.


## Conclusions

The main goal of this laboratory work was to put into practive Creational Design Patterns.
Generally speaking, design patterns are a very important field of computer science that is important in order to become a developper,
as design patterns are reusable in multiple projects and provide solutions that can help
define and build a good system architecture.

## Author: 

__Malîi Antonela FAF-192__