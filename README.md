# Design Patterns
This repo contains pseudo samples for 23 well-known design patterns.
Usages can be found under tests.

## Structural Patterns
### Decorator
#### Overview
Decorator is a structural design pattern that lets you attach new behaviors to objects
by placing these objects inside special wrapper objects that contain the behaviors.
#### Notes on implementation
Implementors of the EncodingDecorator interface can be used in any order and in any 
combination on run-time.
    
### Bridge
#### Overview
Bridge is a structural design pattern that lets you split a large class or a set of 
closely related classes into two separate hierarchies—abstraction and implementation—which 
can be developed independently of each other.
#### Notes on implementation
Thanks to Bridge pattern there is no need to create a new class for every Customer 
and CreditCard combination. Creating a "has-a" relationship between these classes 
separates the implementations of both parties.

### Facade
#### Overview
Facade is a structural design pattern that provides a simplified interface to a library, 
a framework, or any other complex set of classes.

### Proxy
### Overview
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. 
A proxy controls access to the original object, allowing you to perform something either before or after 
the request gets through to the original object.
#### Notes on implementation
Atm class acts as a proxy in front of the bank system. Updates the customer data on bank after finalizing 
the transaction

## Factory Method
### Overview
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, 
but allows subclasses to alter the type of objects that will be created.

## Prototype
### Overview
Prototype is a creational design pattern that lets you copy existing objects without making your 
code dependent on their classes.
