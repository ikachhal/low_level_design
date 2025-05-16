Decorator Pattern – At a Glance
A structural design pattern that lets you dynamically add behavior or responsibilities to an object 
without altering its class.

Purpose:
To extend an object’s functionality at runtime, without modifying its original code (open-closed principle).

Components:
1. Component – Interface or abstract class defining operations.
2. ConcreteComponent – The original object to be decorated.
3. Decorator – Abstract class that implements Component and holds a reference to a Component.
4. ConcreteDecorator – Adds new behavior before/after delegating to the wrapped component.

Real-World Analogy:
    Think of a coffee:
    Plain coffee = ConcreteComponent
    Add milk, sugar, whipped cream = Decorators that wrap and extend functionality.

When to Use Decorator Pattern:
1. You want to add functionality to an object without altering its class.
2. You want flexible combinations of behaviors (unlike inheritance, which is rigid).
3. You prefer composition over inheritance for extending behavior.
4. You want to avoid class explosion from having every possible feature combo.

Avoid When:
You need to add behavior to all instances globally (consider subclassing or modifying the original class instead).
You’re okay with a less flexible but simpler inheritance-based solution.