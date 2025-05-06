Builder Pattern: Pizza Order System


🧱 What is the Builder Pattern?
The Builder Pattern is a creational design pattern that lets you construct complex objects step by step. 
It separates the construction of a complex object from its representation, allowing the same construction process to 
create different representations.

🍕 Why Builder Pattern in Pizza Order System?
In this project, the Builder Pattern is used to create a Pizza object with various optional fields like dough, sauce, 
toppings, cheese, etc., without needing to pass all parameters through a complex constructor.

🛠️ Key Components:
Pizza: The product class with fields like dough, sauce, toppings, etc.
PizzaPrep: The builder class used to construct a Pizza object step by step.

✅ Benefits:

Improves readability and object creation.
Avoids constructor telescoping.
Easily extendable for future customizations (e.g., vegan cheese, gluten-free crust).