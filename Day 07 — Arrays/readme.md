# 💻 Java Programming – Day 07: Arrays in Java

Welcome to **Day 07 of Java Programming**! 🎉
Today we will explore **Arrays**, one of the most important data structures in Java.
Arrays help you **store multiple values of the same type** and make your programs more organized and efficient.

---

## 🧩 What You’ll Learn Today

1. Array Introduction
2. Declaration & Initialization
3. Memory Concept
4. Input & Output
5. Traversal
6. Sum & Average
7. Maximum & Minimum
8. Linear Search
9. Bubble Sort
10. 2D Arrays & Matrix Input/Output

---

## 1️⃣ Array Introduction

- An **array** is a **collection of elements of the same type**.
- Size is **fixed** and elements are stored in **contiguous memory**.
- Indexing starts from **0**.

```java
int[] numbers = new int[5]; // array to store 5 integers
```

---

## 2️⃣ Declaration & Initialization

You can declare and initialize arrays in different ways:

```java
int[] arr;           // Declaration
arr = new int[5];    // Memory allocation
arr[0] = 10;         // Initialization
int[] arr2 = {1, 2, 3, 4, 5}; // Combined
```

---

## 3️⃣ Array Memory Concept

- Each element occupies **contiguous memory**.
- Access elements using **index**:

```java
int[] arr = {10, 20, 30};
System.out.println(arr[0]); // prints 10
```

---

## 4️⃣ Array Input & Output

Use **Scanner** to take input from the user:

```java
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
for(int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}
```

Print elements using a loop:

```java
for(int num : arr) {
    System.out.print(num + " ");
}
```

---

## 5️⃣ Array Traversal

- Visit **each element** of the array.
- Can use **normal for loop** or **for-each loop**.

```java
for(int i = 0; i < arr.length; i++) { ... }       // normal for loop
for(int num : arr) { ... }                        // for-each loop
```

---

## 6️⃣ Sum & Average

Calculate **sum and average** using loops:

```java
int sum = 0;
for(int num : arr) sum += num;
double average = sum / (double)arr.length;
```

---

## 7️⃣ Maximum & Minimum

Find the **largest and smallest** elements:

```java
int max = arr[0], min = arr[0];
for(int num : arr){
    if(num > max) max = num;
    if(num < min) min = num;
}
```

---

## 8️⃣ Linear Search

Search for an element by checking **each element**:

```java
int key = 30, index = -1;
for(int i = 0; i < arr.length; i++){
    if(arr[i] == key){ index = i; break; }
}
```

---

## 9️⃣ Bubble Sort

Sort array elements by **repeatedly swapping adjacent elements**:

```java
for(int i = 0; i < n-1; i++){
    for(int j = 0; j < n-1-i; j++){
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
```

---

## 🔟 2D Arrays & Matrix Input/Output

- **2D array** = Array of arrays (like a **matrix**)
- Useful for tables, grids, or matrices

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Print using **nested loops**:

```java
for(int i = 0; i < matrix.length; i++){
    for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## ✅ Day 07 Summary

Today you learned:

- Array Introduction
- Declaration & Initialization
- Memory Concept
- Input & Output
- Traversal
- Sum & Average
- Maximum & Minimum
- Linear Search
- Bubble Sort
- 2D Arrays & Matrix Input/Output

🎯 Arrays are essential for storing multiple values efficiently and form the base for advanced data structures.

---


# Author

**Engr. Md Monjur Bakth Mazumder**

🎓 Diploma in Computer Technology — [Moulvibazar Polytechnic Institute](https://mpi.moulvibazar.gov.bd/)  
🎓 BSc in CSE (Running) — [Sylhet International University](https://siu.edu.bd/)

📧 Email: monjurmbm404@gmail.com

### ⭐ If you find this helpful, don’t forget to **star** the repository!