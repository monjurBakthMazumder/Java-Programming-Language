# 💻 Java Programming – Day 03: Type Casting & Operators

Welcome to **Day 03 of Java Programming**! 🎉
Today, we will learn how to **convert data types** and use **operators** in Java. Operators help us perform **calculations, comparisons, and logical operations**, while type casting lets us **convert values between different data types**.

---

## 🧩 What You’ll Learn Today

1. Type Casting (Implicit & Explicit)
2. Arithmetic Operators
3. Assignment Operators
4. Relational Operators
5. Logical Operators
6. Unary Operators
7. Bitwise Operators
8. Ternary Operator

---

## 1️⃣ Type Casting

Type casting is **converting one data type to another**.

**Types:**

- **Implicit Casting (Widening):** Small → Large type (automatic)
- **Explicit Casting (Narrowing):** Large → Small type (manual)

```java id="type_casting_example"
int a = 100;
double b = a; // Implicit Casting
System.out.println("Implicit Casting (int to double): " + b);

double x = 9.78;
int y = (int)x; // Explicit Casting
System.out.println("Explicit Casting (double to int): " + y);
```

**Output:**

```
Implicit Casting (int to double): 100.0
Explicit Casting (double to int): 9
```

💡 **Tip:** Widening happens automatically, narrowing needs `(type)`.

---

## 2️⃣ Arithmetic Operators

Used for **mathematical calculations**:

| Operator | Meaning             |
| -------- | ------------------- |
| `+`      | Addition            |
| `-`      | Subtraction         |
| `*`      | Multiplication      |
| `/`      | Division            |
| `%`      | Modulus (remainder) |

```java id="arithmetic_example"
int a = 10, b = 3;

System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("a / b = " + (a / b));
System.out.println("a % b = " + (a % b));
```

---

## 3️⃣ Assignment Operators

Combine **assignment with operations**:

| Operator | Meaning           |
| -------- | ----------------- |
| `=`      | Assign value      |
| `+=`     | Add & assign      |
| `-=`     | Subtract & assign |
| `*=`     | Multiply & assign |
| `/=`     | Divide & assign   |
| `%=`     | Modulus & assign  |

```java id="assignment_example"
int a = 10;
a += 5;  // a = a + 5
System.out.println("a += 5: " + a);
```

---

## 4️⃣ Relational Operators

Used to **compare values**:

| Operator | Meaning               |
| -------- | --------------------- |
| `==`     | Equal to              |
| `!=`     | Not equal             |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |

```java id="relational_example"
int a = 10, b = 20;
System.out.println("a < b: " + (a < b));
System.out.println("a == b: " + (a == b));
```

---

## 5️⃣ Logical Operators

Used to **combine or invert boolean values**:

| Operator | Meaning |     |     |
| -------- | ------- | --- | --- |
| `&&`     | AND     |     |     |
| `        |         | `   | OR  |
| `!`      | NOT     |     |     |

```java id="logical_example"
boolean a = true, b = false;
System.out.println("a && b: " + (a && b)); // false
System.out.println("a || b: " + (a || b)); // true
System.out.println("!a: " + (!a));         // false
```

---

## 6️⃣ Unary Operators

Used for **single operand operations**:

| Operator | Meaning     |
| -------- | ----------- |
| `+`      | Positive    |
| `-`      | Negative    |
| `++`     | Increment   |
| `--`     | Decrement   |
| `!`      | Logical NOT |

```java id="unary_example"
int a = 5;
System.out.println("a++: " + (a++));  // Post-increment
System.out.println("--a: " + (--a));  // Pre-decrement
```

---

## 7️⃣ Bitwise Operators

Operate on **binary representations**:

| Operator | Meaning     |     |
| -------- | ----------- | --- |
| `&`      | AND         |     |
| `        | `           | OR  |
| `^`      | XOR         |     |
| `~`      | NOT         |     |
| `<<`     | Left Shift  |     |
| `>>`     | Right Shift |     |

```java id="bitwise_example"
int a = 5, b = 3; // 0101 & 0011
System.out.println("a & b: " + (a & b)); // 1
System.out.println("a | b: " + (a | b)); // 7
```

---

## 8️⃣ Ternary Operator

A **shortcut for if-else**:

```
condition ? value_if_true : value_if_false
```

```java id="ternary_example"
int a = 10, b = 20;
String result = (a > b) ? "a is greater" : "b is greater";
System.out.println(result);

int max = (a > b) ? a : b;
System.out.println("Maximum: " + max);
```

**Output:**

```
b is greater
Maximum: 20
```

---

## ✅ Day 03 Summary

Today you learned:

- **Type Casting:** Implicit & Explicit
- **Arithmetic Operators:** +, -, \*, /, %
- **Assignment Operators:** +=, -=, \*=, /=, %=
- **Relational Operators:** ==, !=, >, <, >=, <=
- **Logical Operators:** &&, ||, !
- **Unary Operators:** +, -, ++, --, !
- **Bitwise Operators:** &, |, ^, ~, <<, >>
- **Ternary Operator:** `condition ? value_if_true : value_if_false`

🎯 You are now ready for **Day 04**, where we will explore **Control Flow Statements in Java**!

---

# Author

**Md Monjur Bakth Mazumder**  
**Software Engineer | Lead Frontend Developer**

Software Engineer & Lead Frontend Developer at [Qrinux](https://www.qrinux.com/)  
Software Engineer & Lead Frontend Developer at [Boom Box E-Solutions](https://www.boomboxesolutions.com/)

📧 [Email me](mailto:md.monjurmbm2001@gmail.com)  
🌐 [Portfolio](https://mdmonjurbakthmazumder.netlify.app)

Passionate about building clean, maintainable, and scalable applications
