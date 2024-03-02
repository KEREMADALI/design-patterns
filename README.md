# Design Patterns
This repo contains pseudo samples for 23 well-known design patterns.
Usages can be found under tests.

## Structural Patterns
### Decorator
#### Overview
Decorator is a structural design pattern that lets you attach new behaviors to objects
by placing these objects inside special wrapper objects that contain the behaviors.
#### Sample Notes
Implementors of the EncodingDecorator interface can be used in any order and in any 
combination on run-time.
    
### Bridge
#### Overview
Bridge is a structural design pattern that lets you split a large class or a set of 
closely related classes into two separate hierarchies—abstraction and implementation—which 
can be developed independently of each other.
#### Sample Notes
Thanks to Bridge pattern there is no need to create a new class for every Customer 
and CreditCard combination. Creating a "has-a" relationship between these classes 
separates the implementations of both parties.