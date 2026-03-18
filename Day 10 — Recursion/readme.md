# 💻 Java Programming – Day 10: Recursion in Java

Welcome to **Day 10 of Java Programming**! 🎉
Today we will learn about **recursion**, a powerful technique where a **method calls itself** to solve problems. Recursion is useful for **repetitive tasks, mathematical problems, and logical challenges**.

---

## 🧩 What You’ll Learn Today

1. Recursion Concept
2. Function Call Stack Idea
3. Base Case & Recursive Case
4. Factorial Using Recursion
5. Fibonacci Series Using Recursion
6. Recursive Problem Solving (Array Sum, String Reverse)

---

## 1️⃣ Recursion Concept

- **Recursion** is when a method **calls itself**.
- Always requires a **base case** to **stop the recursion**.

```java id="rec1"
static void sayHello(int times) {
    if(times <= 0) return; // Base case
    System.out.println("Hello!");
    sayHello(times - 1);    // Recursive call
}

sayHello(5); // Prints "Hello!" 5 times
```

---

## 2️⃣ Function Call Stack

- Each recursive call is **pushed onto the call stack**.
- **Last In, First Out (LIFO)**: The last call executes first when returning.

```java id="stack1"
static void countDown(int n) {
    if(n <= 0) {
        System.out.println("Done!");
        return;
    }
    System.out.println(n);
    countDown(n - 1); // recursive call
    System.out.println("Returning from n = " + n); // stack unwinds
}

countDown(5);
```

---

## 3️⃣ Base Case & Recursive Case

- **Base Case:** stops recursion.
- **Recursive Case:** continues recursion.

```java id="base1"
static int sum(int n) {
    if(n == 0) return 0;      // Base Case
    return n + sum(n - 1);    // Recursive Case
}

int result = sum(5); // 5+4+3+2+1 = 15
System.out.println("Sum of first 5 numbers: " + result);
```

---

## 4️⃣ Factorial Using Recursion

- Factorial: `n! = n * (n-1)!`
- Base case: `0! = 1`

```java id="fact1"
static int factorial(int n) {
    if(n == 0) return 1;           // Base Case
    return n * factorial(n - 1);   // Recursive Case
}

System.out.println("Factorial of 5 is " + factorial(5));
```

---

## 5️⃣ Fibonacci Series Using Recursion

- Fibonacci: `F(n) = F(n-1) + F(n-2)`
- Base cases: `F(0) = 0`, `F(1) = 1`

```java id="fib1"
static int fibonacci(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}

for(int i = 0; i < 10; i++) {
    System.out.print(fibonacci(i) + " ");
}
```

---

## 6️⃣ Recursive Problem Solving Examples

### Sum of Array Using Recursion

```java id="arrayrec"
static int sumArray(int[] arr, int n) {
    if(n <= 0) return 0;
    return sumArray(arr, n-1) + arr[n-1];
}

int[] numbers = {1,2,3,4,5};
System.out.println("Sum of array: " + sumArray(numbers, numbers.length));
```

### Reverse a String Using Recursion

```java id="strrec"
static String reverseString(String str) {
    if(str.isEmpty()) return ""; // Base Case
    return reverseString(str.substring(1)) + str.charAt(0);
}

String text = "Java";
System.out.println("Reversed: " + reverseString(text));
```

---

## ✅ Day 10 Summary

Today you learned:

✅ Recursion Concept  
✅ Function Call Stack Idea  
✅ Base Case & Recursive Case  
✅ Factorial Using Recursion  
✅ Fibonacci Series Using Recursion  
✅ Recursive Problem Solving (Array Sum, String Reverse)

> **Pro Tip:** Recursion makes code **shorter and cleaner** for repetitive and mathematical problems, but always ensure a **base case** to prevent infinite loops.

---


# Author

**Engr. Md Monjur Bakth Mazumder**

🎓 Diploma in Computer Technology — [Moulvibazar Polytechnic Institute](https://mpi.moulvibazar.gov.bd/)  
🎓 BSc in CSE (Running) — [Sylhet International University](https://siu.edu.bd/)

📧 Email: monjurmbm404@gmail.com

### ⭐ If you find this helpful, don’t forget to **star** the repository!