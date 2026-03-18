# 💻 Java Programming – Day 05: Loops

Welcome to **Day 05 of Java Programming**! 🎉
Today, we will learn about **loops** — a way to repeat tasks in Java. Loops help us **save time, avoid repetitive code, and handle repetitive tasks efficiently**.

---

## 🧩 What You’ll Learn Today

1. `for` Loop
2. `while` Loop
3. `do-while` Loop
4. Nested Loops
5. `break` Statement
6. `continue` Statement

---

## 1️⃣ `for` Loop

The `for` loop is used when you **know exactly how many times you want to repeat** a block of code.

```java
for(int i = 1; i <= 5; i++) {
    System.out.println("Number: " + i);
}
```

✅ Prints numbers from 1 to 5.
💡 Great for counting, summing, or iterating arrays.

---

## 2️⃣ `while` Loop

The `while` loop repeats a block **as long as a condition is true**.

```java
int i = 1;
while(i <= 5) {
    System.out.println("Number: " + i);
    i++; // increment to avoid infinite loop
}
```

💡 Useful when **number of repetitions is not known beforehand**.

---

## 3️⃣ `do-while` Loop

The `do-while` loop **executes the block at least once**, then checks the condition.

```java
int i = 1;
do {
    System.out.println("Number: " + i);
    i++;
} while(i <= 5);
```

✅ Runs **at least once**, even if the condition is false initially.

---

## 4️⃣ Nested Loops

A **loop inside another loop** is called a nested loop.
Often used for **patterns, tables, or 2D structures**.

```java
// 5x5 star pattern
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= 5; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

💡 Outer loop → rows, Inner loop → columns.

---

## 5️⃣ `break` Statement

The `break` statement **stops the loop immediately**.

```java
for(int i = 1; i <= 10; i++) {
    if(i == 5) {
        break; // exit loop
    }
    System.out.println("Number: " + i);
}
```

✅ Useful to **stop looping when a condition is met**.

---

## 6️⃣ `continue` Statement

The `continue` statement **skips the current iteration** and moves to the next one.

```java
for(int i = 1; i <= 5; i++) {
    if(i == 3) {
        continue; // skip this iteration
    }
    System.out.println("Number: " + i);
}
```

💡 Useful to **skip certain conditions while looping**.

---

## ✅ Day 05 Summary

Today you learned:

- `for` Loop – repeat a block a fixed number of times
- `while` Loop – repeat while condition is true
- `do-while` Loop – run at least once, then check condition
- Nested Loops – loops inside loops for patterns or 2D structures
- `break` Statement – exit loop immediately
- `continue` Statement – skip current iteration

🎯 You are now ready for **Day 06**, where we will explore **Pattern Printing & Logic Building in Java!**

---


# Author

**Engr. Md Monjur Bakth Mazumder**

🎓 Diploma in Computer Technology — [Moulvibazar Polytechnic Institute](https://mpi.moulvibazar.gov.bd/)  
🎓 BSc in CSE (Running) — [Sylhet International University](https://siu.edu.bd/)

📧 Email: monjurmbm404@gmail.com

### ⭐ If you find this helpful, don’t forget to **star** the repository!