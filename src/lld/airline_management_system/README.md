Airline Management System
A simple Airline Management System designed to demonstrate core OOP principles and design patterns. 
It allows users to search, book, and cancel flight tickets, as well as manage flight schedules and aircraft details. 
Ideal for understanding low-level design and object-oriented architecture.

Requirements:
1. System should allow users to search flights on the basis of source, destination and date.
2. System should allow users to book tickets.
3. System should allow users to cancel tickets.
4. The system should allow adding aircraft details such as name, type, and total capacity. Based on the specified 
   percentages for business, premium economy, and economy classes, the system should automatically generate and assign the corresponding number of seats for each class.
5. System should allow to add flights.
6. System should ensure data consistency and handle concurrent access.

OOPs concept used in project:
1. Classes and Objects: The system is designed using classes and objects to represent different entities like User, Flight, Ticket, etc.
2. Encapsulation: The data members of the classes are encapsulated and accessed through getter and setter methods.
3. AircraftManager: The system uses a manager class to manage the aircraft details and operations like populating aircraft seats, adding aircraft.
4. Single Responsibility Principle: Aircraft and Seat class are segregated so that they can be handled independently. Representing Single Responsibility Principle. 
5. Association: Flight class has aircraft model as a member variable which is used to represent the relationship between flight and aircraft. 
   It represents the association relationship.
