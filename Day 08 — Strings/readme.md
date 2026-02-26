# 💻 Java Programming – Day 08: Strings in Java

Welcome to **Day 08 of Java Programming**! 🎉
Today we will learn about **Strings**, which are sequences of characters. Strings are used in almost every program, from displaying messages to processing user input.

---

## 🧩 What You’ll Learn Today

1. String Basics & Declaration
2. Input & Output
3. String Methods
4. Reverse String
5. Palindrome Check
6. StringBuilder Basics

---

## 1️⃣ String Basics & Declaration

- A **String** is a **sequence of characters** stored as an **object**.
- Strings are **immutable**, meaning their value **cannot be changed** once created.

```java id="okmp1d"
String str1 = "Hello";              // Using double quotes
String str2 = new String("World");  // Using constructor
```

---

## 2️⃣ String Input & Output

- Use **Scanner** to take input from the user.
- Print strings using `System.out.println`.

```java id="fwsicn"
Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine(); // reads full line
System.out.println("Hello, " + name + "!");
```

---

## 3️⃣ String Methods

Useful methods to work with strings:

| Method                            | Description                            |
| --------------------------------- | -------------------------------------- |
| `length()`                        | Returns number of characters           |
| `charAt(index)`                   | Returns character at given index       |
| `equals()`                        | Checks equality of two strings         |
| `compareTo()`                     | Compares two strings lexicographically |
| `substring(start,end)`            | Extracts part of the string            |
| `toUpperCase()` / `toLowerCase()` | Converts string case                   |
| `trim()`                          | Removes leading and trailing spaces    |

```java id="cyy35r"
String str = "  Hello Java  ";
System.out.println(str.length());         // 13
System.out.println(str.charAt(6));       // J
System.out.println(str.trim());          // "Hello Java"
System.out.println(str.toUpperCase());   // "  HELLO JAVA  "
System.out.println(str.substring(2,7));  // "Hello"
```

---

## 4️⃣ Reverse String

- Reverse a string using a **loop**:

```java id="zh1o47"
String str = "Hello";
String reversed = "";

for(int i = str.length() - 1; i >= 0; i--){
    reversed += str.charAt(i);
}

System.out.println("Reversed: " + reversed); // "olleH"
```

---

## 5️⃣ Palindrome Check

- A **palindrome** reads the same **forward and backward**.

```java id="sg24w1"
String str = "madam";
String reversed = "";

for(int i = str.length()-1; i >= 0; i--){
    reversed += str.charAt(i);
}

if(str.equals(reversed)){
    System.out.println(str + " is a palindrome");
} else {
    System.out.println(str + " is not a palindrome");
}
```

---

## 6️⃣ StringBuilder Basics

- **StringBuilder** is **mutable**, meaning its content **can be changed**.
- Faster than regular String for modifications.

```java id="5x1mvx"
StringBuilder sb = new StringBuilder("Hello");

// Append
sb.append(" Java");

// Insert
sb.insert(6, "World ");

// Replace
sb.replace(6, 11, "Everyone");

// Delete
sb.delete(6, 14);

// Reverse
sb.reverse();

System.out.println(sb);
```

---

## ✅ Day 08 Summary

Today you learned:

✅ String Basics & Declaration  
✅ Input & Output  
✅ String Methods (`length()`, `charAt()`, `equals()`, `compareTo()`, `substring()`, `toUpperCase()`, `toLowerCase()`, `trim()`)  
✅ Reverse String  
✅ Palindrome Check  
✅ StringBuilder Basics (mutable strings)

Strings are **essential in programming**, and mastering them helps you manipulate text, take input, and solve logic problems easily.

---

# Author

**Md Monjur Bakth Mazumder**  
**Software Engineer | Lead Frontend Developer**

Software Engineer & Lead Frontend Developer at [Qrinux](https://www.qrinux.com/)  
Software Engineer & Lead Frontend Developer at [Boom Box E-Solutions](https://www.boomboxesolutions.com/)

📧 [Email me](mailto:md.monjurmbm2001@gmail.com)  
🌐 [Portfolio](https://mdmonjurbakthmazumder.netlify.app)

Passionate about building clean, maintainable, and scalable applications
