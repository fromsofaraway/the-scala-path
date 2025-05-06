### Day 2 — Scala Syntax Basics and Core Constructs

---

### 📌 Variable Declarations

```scala
val x = 42       // immutable value
var y = 10       // mutable variable
y = 15           // OK
// x = 50       // Compilation error
```

---

### 📌 Function Declaration

```scala
def greet(name: String): String =
  s"Hello, $name!"
```

---

### 📌 Conditional Expressions

```scala
val age = 18
val status = if age >= 18 then "adult" else "minor"
```

---

### 📌 Match Expression (Pattern Matching)

```scala
val code = 404
val message = code match
  case 200 => "OK"
  case 404 => "Not found"
  case _   => "Unknown"
```

---

### 📌 Loops

```scala
for i <- 1 to 5 do println(i)
```

---

