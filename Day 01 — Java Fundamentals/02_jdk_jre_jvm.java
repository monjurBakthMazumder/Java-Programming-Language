/*
========================================
JDK, JRE, JVM Explanation
========================================

JDK (Java Development Kit)
---------------------------
✔ Used to DEVELOP Java programs
✔ Contains:
   - Compiler (javac)
   - JRE
   - Development Tools

JRE (Java Runtime Environment)
------------------------------
✔ Used to RUN Java programs
✔ Contains JVM + Libraries

JVM (Java Virtual Machine)
--------------------------
✔ Executes Java Bytecode
✔ Makes Java Platform Independent

Flow:
Java Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM executes program
*/

public class jdk_jre_jvm {

    public static void main(String[] args) {

        System.out.println("JDK -> Develop");
        System.out.println("JRE -> Run");
        System.out.println("JVM -> Execute");
    }
}