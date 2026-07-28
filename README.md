# Programme - Java Practice Programs

This folder contains Java programs for pattern printing, array operations, and a magic square generator.

## Requirements

- Install JDK 8 or newer
- Open PowerShell, Command Prompt, or any terminal
- Make sure `javac` and `java` are available in your PATH

## General Way to Run a Java Program

1. Open the terminal in the relevant folder.
2. Compile the Java file:
   ```powershell
   javac .\filename.java
   ```
3. Run the compiled program:
   ```powershell
   java ClassName
   ```
4. Enter the required input when the program asks for it.

> Note: Some files use a class name different from the file name. Use the class name shown in the program.

---

## Week 1 - Day 1

Folder: [week-1/day-1](week-1/day-1)

All programs in this folder take a single integer `n` from the user and print a pattern.

### Run commands

```powershell
cd .\week-1\day-1
```

- `p1.java` -> class `p1`

  ```powershell
  javac .\p1.java
  java p1
  ```

  Input: enter one integer `n`

- `p2.java` -> class `p2`

  ```powershell
  javac .\p2.java
  java p2
  ```

  Input: enter one integer `n`

- `p3.java` -> class `p3`

  ```powershell
  javac .\p3.java
  java p3
  ```

  Input: enter one integer `n`

- `p4.java` -> class `p4`

  ```powershell
  javac .\p4.java
  java p4
  ```

  Input: enter one integer `n`

- `p5.java` -> class `p5`

  ```powershell
  javac .\p5.java
  java p5
  ```

  Input: enter one integer `n`

- `p6.java` -> class `p6`

  ```powershell
  javac .\p6.java
  java p6
  ```

  Input: enter one integer `n`

- `p7.java` -> class `p7`

  ```powershell
  javac .\p7.java
  java p7
  ```

  Input: enter one integer `n`

- `p8.java` -> class `p8`

  ```powershell
  javac .\p8.java
  java p8
  ```

  Input: enter one integer `n`

- `p9.java` -> class `p9`
  ```powershell
  javac .\p9.java
  java p9
  ```
  Input: enter one integer `n`

---

## Week 1 - Day 2

Folder: [week-1/day-2](week-1/day-2)

All programs in this folder also take a single integer `n` and print different pattern designs.

### Run commands

```powershell
cd .\week-1\day-2
```

- `p10.java` -> class `p10`

  ```powershell
  javac .\p10.java
  java p10
  ```

  Input: enter one integer `n`

- `p11.java` -> class `p11`

  ```powershell
  javac .\p11.java
  java p11
  ```

  Input: enter one integer `n`

- `p12.java` -> class `p12`

  ```powershell
  javac .\p12.java
  java p12
  ```

  Input: enter one integer `n`

- `p13.java` -> class `p13`

  ```powershell
  javac .\p13.java
  java p13
  ```

  Input: enter one integer `n`

- `p14.java` -> class `p14`

  ```powershell
  javac .\p14.java
  java p14
  ```

  Input: enter one integer `n`

- `p15.java` -> class `p15`

  ```powershell
  javac .\p15.java
  java p15
  ```

  Input: enter one integer `n`

- `p16.java` -> class `p16`

  ```powershell
  javac .\p16.java
  java p16
  ```

  Input: enter one integer `n`

- `p17.java` -> class `p17`

  ```powershell
  javac .\p17.java
  java p17
  ```

  Input: enter one integer `n`

- `p18.java` -> class `p18`
  ```powershell
  javac .\p18.java
  java p18
  ```
  Input: enter one integer `n`

---

## Week 2 - Day 3

Folder: [week-2/day-3](week-2/day-3)

File: `Magicsquare.java`

This program creates a magic square.

### Run commands

```powershell
cd .\week-2\day-3
javac .\Magicsquare.java
java Magicsquare
```

Input required:

- Enter an odd number `n` (for example `3`, `5`, `7`)
- If you enter an even number, the program ends

---

## Week 2 - Day 4

Folder: [week-2/day-4](week-2/day-4)

These programs work with arrays.

### Run commands

```powershell
cd .\week-2\day-4
```

- `Program-1.java` -> class `P1`

  ```powershell
  javac .\Program-1.java
  java P1
  ```

  Input: enter a non-negative size of an array

- `Program-2.java` -> class `P2`

  ```powershell
  javac .\Program-2.java
  java P2
  ```

  Input: first enter array size, then enter each array element

- `Program-3.java` -> class `P3`
  ```powershell
  javac .\Program-3.java
  java P3
  ```
  Input: first enter array size, then enter each string element

---

## Week 2 - Day 1 and Day 2 Text Files

Folders: [week-2/day-1](week-2/day-1) and [week-2/day-2](week-2/day-2)

These files are `.txt` files. They are text-based practice files and do not need compilation or execution.

---

## Quick Tip

If you are running from the project root instead of the program folder, use the full path while compiling:

```powershell
javac .\week-1\day-1\p1.java
java -cp .\week-1\day-1 p1
```
