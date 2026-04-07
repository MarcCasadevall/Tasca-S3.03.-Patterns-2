# Fluent Menu Builder
**Description**: A Java implementation of the Builder Design Pattern using Progressive Interfaces to create restaurant menus in a type-safe,
fluent, and expressive way.

## 📌 Exercise Statement
The goal is to design a system that allows building different types of menus (Full, Half, Kids) while enforcing a specific order of selection:
1. Choose the **Menu Type**.
2. Select **Starter** (if applicable) and configure dietary options.
3. Select **Main Course** and configure dietary options.
4. Add an **Extra** (garnish).
5. Choose between **Dessert or Coffee** (exclusive choice).
6. Select **Drink**.

## ✨ Features
- **Type-Safe Navigation**: The IDE guides the user through the steps; you cannot add a drink before a main course.
- **Expressive API**: Use of descriptive methods like `.vegan()` or `.celiac()` instead of passing confusing boolean parameters.
- **Business Logic Enforcement**: Implements the "Dessert OR Coffee" restriction by controlling the interface return types.
- **Flexible Entry Points**: Support for Full, Half, and Kids menus with automatic step skipping.

## 🛠 Technologies
- **Language**: Java 17+
- **Testing**: JUnit 5
- **IDE**: IntelliJ IDEA / Eclipse
- **Version Control**: Git

## 🚀 Installation and Execution
- **Clone the repository**
