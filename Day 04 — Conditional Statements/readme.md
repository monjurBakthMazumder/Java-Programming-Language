# 💻 Java Programming – Day 04: Conditional Statements

Welcome to **Day 04 of Java Programming**! 🎉
Today, we will learn how to **make decisions in Java**. Conditional statements allow your program to **execute different code based on conditions**. This is how your program can **think and react** like humans do.

---

## 🧩 What You’ll Learn Today

1. `if` Statement
2. `if-else` Statement
3. Nested `if`
4. `else-if` Ladder
5. `switch` Statement
6. Decision Making Programs

---

## 1️⃣ `if` Statement

The `if` statement executes a block of code **only if a condition is true**.

```java
int number = 10;

if (number > 0) {
    System.out.println(number + " is positive");
}
```

💡 If the condition is false, the code inside `if` **will not run**.

---

## 2️⃣ `if-else` Statement

The `if-else` statement allows your program to choose **between two paths**.

```java
int number = -5;

if (number >= 0) {
    System.out.println(number + " is non-negative");
} else {
    System.out.println(number + " is negative");
}
```

✅ One block executes if true, another if false.

---

## 3️⃣ Nested `if`

You can put an `if` inside another `if` to **check multiple conditions**.

```java
int number = 75;

if (number > 0) {
    System.out.println("Number is positive");

    if (number % 2 == 0) {
        System.out.println("Number is even");
    } else {
        System.out.println("Number is odd");
    }

} else {
    System.out.println("Number is zero or negative");
}
```

💡 Useful when you need **detailed decisions**.

---

## 4️⃣ `else-if` Ladder

Used to **check multiple conditions in sequence**.

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade: A+");
} else if (marks >= 75) {
    System.out.println("Grade: A");
} else if (marks >= 60) {
    System.out.println("Grade: B");
} else if (marks >= 50) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

💡 Checks **conditions from top to bottom**, stops at the first true condition.

---

## 5️⃣ `switch` Statement

The `switch` statement is useful when **one variable is compared with many values**.

```java
int day = 3;

switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    case 4: System.out.println("Thursday"); break;
    case 5: System.out.println("Friday"); break;
    case 6: System.out.println("Saturday"); break;
    case 7: System.out.println("Sunday"); break;
    default: System.out.println("Invalid Day");
}
```

✅ Often more **readable than multiple if-else statements**.

---

## 6️⃣ Decision Making Programs

Programs can **decide actions based on conditions**.

```java
int age = 18;

// Using if-else
if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}

// Using ternary operator
String eligibility = (age >= 18) ? "Can Vote" : "Cannot Vote";
System.out.println(eligibility);
```

💡 Ternary operator is a **quick way to make decisions** in one line.

---

## ✅ Day 04 Summary

Today you learned:

- `if` Statement – run code only if condition is true
- `if-else` Statement – choose between two paths
- Nested `if` – check multiple conditions inside another
- `else-if` Ladder – check multiple conditions sequentially
- `switch` Statement – compare one variable with many values
- Decision Making Programs – practical examples using conditions

🎯 You are now ready for **Day 05**, where we will explore **Loops in Java**!

---

# Author

**Engr. Md Monjur Bakth Mazumder**

🎓 Diploma in Computer Technology — [Moulvibazar Polytechnic Institute](https://mpi.moulvibazar.gov.bd/)  
🎓 BSc in CSE (Running) — [Sylhet International University](https://siu.edu.bd/)

📧 Email: monjurmbm404@gmail.com

### ⭐ If you find this helpful, don’t forget to **star** the repository!
