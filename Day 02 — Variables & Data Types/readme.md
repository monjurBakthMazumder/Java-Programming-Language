# 💻 Java Programming – Day 02: Variables & Data Types

Welcome to **Day 02 of Java Programming**! 🎉
Today, we will learn how Java stores information using **variables**, the different **data types**, and how to use **constants**. By the end of this day, you’ll be able to **declare variables, store values, and understand how memory works in Java**.

---

## 🧩 What You’ll Learn Today

1. Variables: declaration & initialization
2. Variable naming rules
3. Primitive data types
4. Constants using `final`
5. Memory basics for primitive types

---

## 1️⃣ Variables in Java

A **variable** is a **named container** in memory that stores data.
Before using a variable, you must **declare it** and optionally **initialize it** with a value.

**Example:**

```java
public class VariablesExample {
    public static void main(String[] args) {
        // Declaration
        int age;

        // Initialization
        age = 22;

        // Declaration + Initialization
        int year = 2026;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
    }
}
```

**Output:**

```
Age: 22
Year: 2026
```

---

## 2️⃣ Variable Naming Rules

When naming variables in Java, follow these rules:

✅ Can contain letters, digits, `_`, `$`   
✅ Must start with a letter, `_`, or `$`   
✅ Cannot start with a digit  
✅ Cannot be a **Java keyword**  
✅ Case-sensitive (`age` ≠ `Age`)

**Example:**

```java
int myAge = 22;   // valid
int _score = 100; // valid
int $price = 50;  // valid
// int 2number = 10; // ❌ invalid
// int class = 5;    // ❌ invalid
```

**Output:**

```
My Age: 22
Score: 100
Price: 50
```

💡 **Tip:** Use meaningful variable names like `studentAge` instead of `a1`.

---

## 3️⃣ Primitive Data Types

Java has **8 built-in (primitive) data types** for storing basic values:

| Type      | Size    | Example      | Description                  |
| --------- | ------- | ------------ | ---------------------------- |
| `byte`    | 1 byte  | 10           | Small integers               |
| `short`   | 2 bytes | 2000         | Medium integers              |
| `int`     | 4 bytes | 100000       | Standard integers            |
| `long`    | 8 bytes | 1000000000L  | Large integers (`L` suffix)  |
| `float`   | 4 bytes | 3.14f        | Decimal numbers (`f` suffix) |
| `double`  | 8 bytes | 3.141592     | Large decimal numbers        |
| `char`    | 2 bytes | 'A'          | Single character             |
| `boolean` | 1 bit   | true / false | Logical values               |

**Example:**

```java
byte b = 10;
short s = 2000;
int i = 100000;
long l = 1000000000L;

float f = 3.14f;
double d = 3.141592;

char c = 'A';
boolean isJavaFun = true;

System.out.println("Byte: " + b);
System.out.println("Int: " + i);
System.out.println("Float: " + f);
System.out.println("Boolean: " + isJavaFun);
```

**Output:**

```
Byte: 10
Int: 100000
Float: 3.14
Boolean: true
```

---

## 4️⃣ Constants in Java

A **constant** is a variable whose value **cannot change** after initialization.

Use the **`final` keyword**:

```java
final double PI = 3.14159;
System.out.println("Value of PI: " + PI);

// PI = 3.14; // ❌ Error! Cannot change a final variable
```

💡 **Tip:** Constants are usually written in **UPPERCASE** for readability.

---

## 5️⃣ Memory Basics for Primitive Types

Each primitive type uses a **fixed amount of memory**:

| Type    | Memory Size                      |
| ------- | -------------------------------- |
| byte    | 1 byte                           |
| short   | 2 bytes                          |
| int     | 4 bytes                          |
| long    | 8 bytes                          |
| float   | 4 bytes                          |
| double  | 8 bytes                          |
| char    | 2 bytes                          |
| boolean | 1 bit (implementation dependent) |

**Example:**

```java
int a = 10;      // 4 bytes
double b = 3.14; // 8 bytes
char c = 'X';    // 2 bytes

System.out.println("Int a: " + a);
System.out.println("Double b: " + b);
System.out.println("Char c: " + c);
```

**Output:**

```
Int a: 10
Double b: 3.14
Char c: X
```

💡 Java automatically manages memory for primitive types — you only need to declare the type.

---

## ✅ Day 02 Summary

Today you learned:

- How to **declare and initialize variables**
- **Variable naming rules** in Java
- **Primitive data types**: int, float, double, char, boolean, byte, short, long
- Using **constants** with `final`
- **Memory basics** for primitive types

🎯 You are now ready for **Day 03**, where we will explore **Type Casting & Operators in Java**!

---


# Author

**Engr. Md Monjur Bakth Mazumder**

🎓 Diploma in Computer Technology — [Moulvibazar Polytechnic Institute](https://mpi.moulvibazar.gov.bd/)  
🎓 BSc in CSE (Running) — [Sylhet International University](https://siu.edu.bd/)

📧 Email: monjurmbm404@gmail.com

### ⭐ If you find this helpful, don’t forget to **star** the repository!