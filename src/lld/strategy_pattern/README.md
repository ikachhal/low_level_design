What is the Strategy Pattern?
The Strategy Pattern is a behavioral design pattern that lets you define a family of algorithms, put each in a separate 
class, and make them interchangeable at runtime.
Instead of hardcoding logic, you delegate the work to a strategy object.

Problem It Solves:
It eliminates long if-else or switch statements that choose behaviors at runtime based on conditions.

Key Components:
Strategy Interface – defines the method each strategy must implement.
Concrete Strategies – actual implementations of the strategy interface.
Context – uses a Strategy object to perform a task.

Real-World Analogy:
Payment System – A customer can pay by Credit Card, PayPal, or UPI. The payment method (strategy) is selected at 
runtime, and each behaves differently.

Benefits:
Reusable, flexible, and extendable algorithms
Easy to add new strategies without changing context
Promotes composition over inheritance