# Lab Activity 1: Polymorphism

## IT-OOPROG21 — Semi-Finals

This project demonstrates object-oriented programming in Java using a base `Vehicle` class and three vehicle subclasses: `Car`, `Truck`, and `Motorcycle`.

## Polymorphism

The project shows **runtime polymorphism** through method overriding. Each subclass provides its own `startEngine()` and `displayInfo()` methods. In `Main.java`, the objects are stored in a `Vehicle` array; calling these methods on each `Vehicle` reference runs the implementation belonging to that object's actual class.

## Classes and features

- `Vehicle` stores the brand, model, and year, and provides shared vehicle behavior.
- `Car` adds the number of doors.
- `Truck` adds cargo capacity and a six-wheel configuration.
- `Motorcycle` adds engine size in cubic centimeters.
- `Main` creates one car, one motorcycle, and one truck, then demonstrates their overridden methods.

## Recent changes

- Added `startEngine()` to `Vehicle` and overrode it in each subclass.
- Added `displayInfo()` overrides to show each vehicle's additional details.
- Updated the truck example to a 2020 Mitsubishi Fuso Fighter with 8 tons of cargo capacity.
- Removed the method-overloading demonstration from `Main.java` so it focuses on runtime polymorphism.