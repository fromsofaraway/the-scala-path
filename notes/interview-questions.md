# Scala Interview Questions

## Day 01

**1. Why is `val` preferred over `var`?**  
`val` creates an immutable reference. This increases code reliability and readability, as you're certain the variable won't change. It's especially important in multithreaded environments and when following a functional programming approach. `var` allows mutation, which can lead to unexpected behavior.

**2. What is an expression-oriented language, and how is it more convenient than Java's statement-based approach?**  
In expression-oriented languages like Scala, everything is an expression and returns a value. This enables more concise and functional code. In Java, many constructs are statements without return values (`if`, `for`, etc.), which often requires extra variables and leads to more verbose code.

**3. Why is `match` better than a chain of `if/else` statements?**  
Scala’s `match` is a powerful pattern matching mechanism. It allows handling of different types, values, and data structures (including case classes) with minimal and readable syntax. It's more expressive and scalable than long chains of `if/else`.
