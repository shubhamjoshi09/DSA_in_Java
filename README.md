# DSA_in_Java

# Data Structures and Algorithms

Welcome to my DSA learning repository.

## Goal
- Build strong problem-solving skills.
- Master core DSA concepts.
- Learn topic by topic.
- Write clean and optimized code.

## Learning Roadmap

- [ ] Sorting
- [ ] Arrays
- [ ] Strings
- [ ] Searching
- [ ] Linked List
- [ ] Stack
- [ ] Queue
- [ ] Trees
- [ ] Graphs
- [ ] Dynamic Programming

# Sorting Algorithms

This repository contains my implementations of **Sorting Algorithms** in Java as part of my **Data Structures and Algorithms (DSA)** learning journey.

## About

Sorting is the process of arranging elements in a specific order, such as ascending or descending. Understanding sorting algorithms helps build a strong foundation in problem-solving and algorithm design.

## Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest unsorted element moves to its correct position.

| Complexity   | Value |
| ------------ | ----- |
| Best Time    | O(n)  |
| Average Time | O(n²) |
| Worst Time   | O(n²) |
| Space        | O(1)  |

**Properties**

* Stable 
* In-place 
* Comparison-based

* # Selection Sort in Java

## Overview

Selection Sort is a simple comparison-based sorting algorithm. It repeatedly finds the smallest element from the unsorted portion of the array and places it at the beginning.

The algorithm divides the array into two parts:

* **Sorted Part** (left side)
* **Unsorted Part** (right side)

In every iteration, the minimum element is selected from the unsorted part and swapped with the first unsorted element.

---

## How Selection Sort Works

Example array:

```text
[64, 25, 12, 22, 11]
```

### Pass 1

Minimum = **11**

```text
[11, 25, 12, 22, 64]
```

### Pass 2

Minimum = **12**

```text
[11, 12, 25, 22, 64]
```

### Pass 3

Minimum = **22**

```text
[11, 12, 22, 25, 64]
```

### Final Sorted Array

```text
[11, 12, 22, 25, 64]
```

---

## Java Implementation

```java
public class SelectionSort {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
```

### Output

```text
Original Array:
64 25 12 22 11

Sorted Array:
11 12 22 25 64
```

---

## Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | **O(n²)**  |
| Average Case | **O(n²)**  |
| Worst Case   | **O(n²)**  |

---

## Space Complexity

* **Space Complexity:** **O(1)** (In-Place Algorithm)

---

## Characteristics

| Property       | Value            |
| -------------- | ---------------- |
| Algorithm Type | Comparison-Based |
| In-Place       |  Yes            |
| Stable         |  No             |
| Adaptive       |  No             |
| Extra Space    | O(1)             |

---

## Advantages

* Simple and easy to implement.
* Uses constant extra memory.
* Performs fewer swaps than Bubble Sort.
* Suitable for small datasets.

---

## Disadvantages

* Inefficient for large datasets.
* Time complexity remains **O(n²)** even if the array is already sorted.
* Not stable by default.

---

## Applications

* Learning sorting algorithms.
* Small datasets.
* Embedded or memory-constrained systems.
* Situations where minimizing the number of swaps is important.

---

##  Summary

Selection Sort repeatedly finds the smallest element from the unsorted portion of the array and places it in its correct position. Although it is easy to understand and requires only constant extra space, it is not suitable for large datasets due to its **O(n²)** time complexity.

# Recursion in Java

This folder contains Java programs to understand the fundamentals of **Recursion**.

## What is Recursion?

Recursion is a programming technique in which a function calls itself to solve a smaller version of the same problem until a **base case** is reached.

### Structure of Recursion

```java
void recursion() {
    if(baseCondition) {
        return;
    }

    // Work
    recursion();
}
```

---

## Programs Included

| File | Description |
|------|-------------|
| Recursion1.java | Print numbers from 1 to N |
| Recursion2.java | Print numbers from N to 1 |
| Recursion3.java | Print a string in reverse |
| Recursion4.java | Reverse string using recursion |

---

##  Concepts Covered

- Base Case
- Recursive Call
- Call Stack
- Backtracking
- Printing Before Recursion
- Printing After Recursion

---

## Time Complexity

Most recursion problems:

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

> Space complexity is O(n) because each recursive call is stored in the call stack.

---

##  Example

Input

```
abcd
```

Output

```
dcba
```

---

## How to Run

Compile

```bash
javac Recursion4.java
```

Run

```bash
java Recursion4
```

---

## Learning Outcome

After completing these programs, you will understand:

- How recursion works internally.
- Importance of the base case.
- Recursive thinking.
- How the call stack behaves.
- How to solve basic recursion problems.

---

## 🛠 Technologies Used

- Java
- VS Code
- Git & GitHub

---

## Author

**Shubham Joshi**

BCA Graduate | Java | DSA | Web Development

If you found this repository helpful, don't forget to give it a Star.


## Goal
My goal is to master DSA by learning each algorithm from its fundamentals, understanding its complexity, and implementing it from scratch.
