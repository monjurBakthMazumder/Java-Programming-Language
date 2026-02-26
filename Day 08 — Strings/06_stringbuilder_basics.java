/*
========================================
06_stringbuilder_basics.java
========================================
StringBuilder Basics:

✔ Mutable string (can change content)
✔ Faster for modifications
*/

public class stringbuilder_basics {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original: " + sb);

        // Append
        sb.append(" Java");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(6, "World ");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 11, "Everyone");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(6, 14);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}