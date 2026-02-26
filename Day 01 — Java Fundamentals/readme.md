# 💻 Java Programming – Day 01: Fundamentals

Welcome to **Day 01 of Java Programming**! 🎉
This guide is designed for beginners who are just starting their journey with Java. By the end of this day, you’ll understand **what Java is**, **how it works**, and **how to write and run your first programs**.

---

## 🧩 What You’ll Learn Today

1. **Introduction to Java**
2. **JDK, JRE, JVM Concepts**
3. **Writing Your First Java Program**
4. **Java Program Structure**
5. **Compilation & Execution Process**
6. **Comments in Java**
7. **Output Methods**
8. **Escape Sequences**

Let’s dive in! 🚀

---

## 1️⃣ Introduction to Java

Java is a **powerful programming language** used everywhere — from web development to Android apps and backend systems.

Key features of Java:

* ✅ Object-Oriented
* ✅ Platform Independent – “Write Once, Run Anywhere”
* ✅ Secure & Robust
* ✅ Created by **James Gosling** (Sun Microsystems, 1995)

Java runs on **any operating system** using **JVM (Java Virtual Machine)**, which executes Java bytecode.

**Example: Simple Output**

```java
public class IntroductionToJava {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");
    }
}
```

**Output:**

```
Welcome to Java Programming!
```

---

## 2️⃣ JDK, JRE, JVM

To understand Java programs, you need to know **JDK, JRE, and JVM**:

| Term    | Purpose                                                                                 |
| ------- | --------------------------------------------------------------------------------------- |
| **JDK** | Java Development Kit – used to **develop** programs. Includes compiler, JRE, and tools  |
| **JRE** | Java Runtime Environment – used to **run** programs. Contains JVM and libraries         |
| **JVM** | Java Virtual Machine – executes compiled bytecode, making Java **platform independent** |

**Flow of Java Program:**

```
Java Code (.java) → Compile with javac → Bytecode (.class) → JVM executes
```

**Example Program:**

```java
public class JDK_JRE_JVM {
    public static void main(String[] args) {
        System.out.println("JDK -> Develop");
        System.out.println("JRE -> Run");
        System.out.println("JVM -> Execute");
    }
}
```

---

## 3️⃣ Your First Java Program

Every Java program starts with a **class** and a **main method**.

```java
public class FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

**Output:**

```
Hello World!
```

💡 **Tip:** `main` is the entry point of your program.

---

## 4️⃣ Java Program Structure

A basic Java program consists of:

1. **Class Declaration**
2. **main() Method**
3. **Statements inside main()**

```java
public class JavaProgramStructure {
    public static void main(String[] args) {
        System.out.println("Understanding Java Structure");
    }
}
```

---

## 5️⃣ Compilation & Execution Process

To run a Java program:

1. **Write code** → save as `FileName.java`
2. **Compile** → `javac FileName.java` → generates `FileName.class` (bytecode)
3. **Run** → `java FileName` → JVM executes bytecode

**Example:**

```java
public class CompilationExecutionProcess {
    public static void main(String[] args) {
        System.out.println("Java Compilation Process");
    }
}
```

---

## 6️⃣ Comments in Java

Comments are **notes for programmers**. They are ignored by the compiler.

```java
// Single-line comment

/*
 Multi-line comment
 for explanations
*/

/**
 * Documentation comment
 * Used in API documentation
 */
```

---

## 7️⃣ Output Methods

Java has **three main output methods**:

1. `print()` – prints without a new line
2. `println()` – prints with a new line
3. `printf()` – formatted output

```java
System.out.print("Hello ");
System.out.print("World");

System.out.println();

System.out.println("Using println");

System.out.printf("Age: %d\n", 22);
```

**Output:**

```
Hello World
Using println
Age: 22
```

---

## 8️⃣ Escape Sequences

Escape sequences help format your output:

| Sequence | Description  |
| -------- | ------------ |
| `\n`     | New line     |
| `\t`     | Tab space    |
| `\"`     | Double quote |
| `\\`     | Backslash    |

```java
System.out.println("Hello\nJava");
System.out.println("Name:\tMonjur");
System.out.println("\"Java Programming\"");
System.out.println("C:\\Program Files\\Java");
```

**Output:**

```
Hello
Java
Name:   Monjur
"Java Programming"
C:\Program Files\Java
```

---

## ✅ Day 01 Summary

Today you learned:

* Java Introduction & Features
* Difference between **JDK, JRE, JVM**
* Writing your **first Java program**
* Java program structure
* Compilation & execution process
* Comments in Java
* Output methods: `print`, `println`, `printf`
* Escape sequences

🎯 You’re now ready for **Day 02**, where we will explore **variables, data types, and operators in Java**!

---
Here’s a clean, **beginner-friendly `README.md`** for your **Day 01 — Java Fundamentals**:

---

# 💻 Java Programming – Day 01: Fundamentals

Welcome to **Day 01 of Java Programming**! 🎉
This guide is designed for beginners who are just starting their journey with Java. By the end of this day, you’ll understand **what Java is**, **how it works**, and **how to write and run your first programs**.

---

## 🧩 What You’ll Learn Today

1. **Introduction to Java**
2. **JDK, JRE, JVM Concepts**
3. **Writing Your First Java Program**
4. **Java Program Structure**
5. **Compilation & Execution Process**
6. **Comments in Java**
7. **Output Methods**
8. **Escape Sequences**

Let’s dive in! 🚀

---

## 1️⃣ Introduction to Java

Java is a **powerful programming language** used everywhere — from web development to Android apps and backend systems.

Key features of Java:

* ✅ Object-Oriented
* ✅ Platform Independent – “Write Once, Run Anywhere”
* ✅ Secure & Robust
* ✅ Created by **James Gosling** (Sun Microsystems, 1995)

Java runs on **any operating system** using **JVM (Java Virtual Machine)**, which executes Java bytecode.

**Example: Simple Output**

```java
public class IntroductionToJava {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");
    }
}
```

**Output:**

```
Welcome to Java Programming!
```

---

## 2️⃣ JDK, JRE, JVM

To understand Java programs, you need to know **JDK, JRE, and JVM**:

| Term    | Purpose                                                                                 |
| ------- | --------------------------------------------------------------------------------------- |
| **JDK** | Java Development Kit – used to **develop** programs. Includes compiler, JRE, and tools  |
| **JRE** | Java Runtime Environment – used to **run** programs. Contains JVM and libraries         |
| **JVM** | Java Virtual Machine – executes compiled bytecode, making Java **platform independent** |

**Flow of Java Program:**

```
Java Code (.java) → Compile with javac → Bytecode (.class) → JVM executes
```

**Example Program:**

```java
public class JDK_JRE_JVM {
    public static void main(String[] args) {
        System.out.println("JDK -> Develop");
        System.out.println("JRE -> Run");
        System.out.println("JVM -> Execute");
    }
}
```

---

## 3️⃣ Your First Java Program

Every Java program starts with a **class** and a **main method**.

```java
public class FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

**Output:**

```
Hello World!
```

💡 **Tip:** `main` is the entry point of your program.

---

## 4️⃣ Java Program Structure

A basic Java program consists of:

1. **Class Declaration**
2. **main() Method**
3. **Statements inside main()**

```java
public class JavaProgramStructure {
    public static void main(String[] args) {
        System.out.println("Understanding Java Structure");
    }
}
```

---

## 5️⃣ Compilation & Execution Process

To run a Java program:

1. **Write code** → save as `FileName.java`
2. **Compile** → `javac FileName.java` → generates `FileName.class` (bytecode)
3. **Run** → `java FileName` → JVM executes bytecode

**Example:**

```java
public class CompilationExecutionProcess {
    public static void main(String[] args) {
        System.out.println("Java Compilation Process");
    }
}
```

---

## 6️⃣ Comments in Java

Comments are **notes for programmers**. They are ignored by the compiler.

```java
// Single-line comment

/*
 Multi-line comment
 for explanations
*/

/**
 * Documentation comment
 * Used in API documentation
 */
```

---

## 7️⃣ Output Methods

Java has **three main output methods**:

1. `print()` – prints without a new line
2. `println()` – prints with a new line
3. `printf()` – formatted output

```java
System.out.print("Hello ");
System.out.print("World");

System.out.println();

System.out.println("Using println");

System.out.printf("Age: %d\n", 22);
```

**Output:**

```
Hello World
Using println
Age: 22
```

---

## 8️⃣ Escape Sequences

Escape sequences help format your output:

| Sequence | Description  |
| -------- | ------------ |
| `\n`     | New line     |
| `\t`     | Tab space    |
| `\"`     | Double quote |
| `\\`     | Backslash    |

```java
System.out.println("Hello\nJava");
System.out.println("Name:\tMonjur");
System.out.println("\"Java Programming\"");
System.out.println("C:\\Program Files\\Java");
```

**Output:**

```
Hello
Java
Name:   Monjur
"Java Programming"
C:\Program Files\Java
```

---

## ✅ Day 01 Summary

Today you learned:

* Java Introduction & Features
* Difference between **JDK, JRE, JVM**
* Writing your **first Java program**
* Java program structure
* Compilation & execution process
* Comments in Java
* Output methods: `print`, `println`, `printf`
* Escape sequences

🎯 You’re now ready for **Day 02**, where we will explore **variables, data types, and operators in Java**!

---

# Author

**Md Monjur Bakth Mazumder**  
**Software Engineer | Lead Frontend Developer**

Software Engineer & Lead Frontend Developer at [Qrinux](https://www.qrinux.com/)  
Software Engineer & Lead Frontend Developer at [Boom Box E-Solutions](https://www.boomboxesolutions.com/)

📧 [Email me](mailto:md.monjurmbm2001@gmail.com)  
🌐 [Portfolio](https://mdmonjurbakthmazumder.netlify.app)

Passionate about building clean, maintainable, and scalable applications
