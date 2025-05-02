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

Core Packages and Classes

1. Aircraft Package
Aircraft: Represents an aircraft with attributes like model, type, and seat configuration.
Seat: Details individual seats, including seat number, type (e.g., economy, business), and status.
AircraftType: Enumerates different types of aircraft.
SeatType: Enumerates seat categories.
SeatStatus: Enumerates the status of a seat (e.g., available, booked).

2. Booking Package
Booking: Handles booking details, including passenger information and seat assignments.
BookingManager: Manages booking operations such as creating and canceling bookings.
BookingStatus: Enumerates the status of a booking (e.g., confirmed, canceled)

3. Flight Package
Flight: Contains flight details like flight number, departure and arrival times, and associated aircraft.
FlightSearch: Facilitates searching for available flights based on criteria.

Relationships and Associations

1. Inheritance:
Classes like BookingManager may inherit from a generic Manager class (not explicitly shown in the provided files).

2. Associations:
Flight ↔ Aircraft: Each flight is associated with a specific aircraft.
Booking ↔ Flight: Bookings are linked to specific flights.
Booking ↔ Seat: Each booking includes seat assignments.

3. Compositions:
Aircraft → Seat: An aircraft is composed of multiple seats; seats do not exist independently of an aircraft.



