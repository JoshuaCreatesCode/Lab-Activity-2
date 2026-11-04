Lab Activity 2: Abstraction

IT-OOPROG21 — Semi-Finals

This project demonstrates object-oriented programming in Java using abstraction. It shows how abstract classes and methods can define common behaviors while allowing subclasses to provide their own specific implementations.

Abstraction

The project demonstrates abstraction through an abstract Vehicle class. The base class defines common vehicle properties and abstract methods that must be implemented by its subclasses.

The Car, Truck, and Motorcycle classes extend the Vehicle class and provide their own implementations of the required methods. In Main.java, objects of these subclasses are created and used to demonstrate how abstraction works in Java.

Classes and Features

* Vehicle – An abstract base class that stores the brand, model, and year, and defines common vehicle behavior.
* Car – Extends Vehicle and adds the number of doors.
* Truck – Extends Vehicle and adds cargo capacity and a six-wheel configuration.
* Motorcycle – Extends Vehicle and adds engine size in cubic centimeters.
* Main – Creates a car, motorcycle, and truck to demonstrate abstraction.

Recent Changes

* Converted the Vehicle class into an abstract class.
* Added abstract methods to define common vehicle behaviors.
* Implemented the required abstract methods in Car, Truck, and Motorcycle.
* Applied inheritance to share common vehicle properties and behaviors.
* Updated Main.java to demonstrate abstraction using the vehicle subclasses.