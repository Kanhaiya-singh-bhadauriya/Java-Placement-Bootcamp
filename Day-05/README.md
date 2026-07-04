# 📅 Day 05 - Arrays Continue

## 🎯 Goal

Strengthen array concepts by solving practical array problems, improving logical thinking, and learning to recognize common problem-solving patterns.

---

# ✅ Programs Completed

## 1️⃣ FrequencyOfElement.java

### 📌 Problem

Find the frequency of a given target element in an array.

### 🧠 Algorithm

1. Create an array.
2. Take input for all elements.
3. Read the target value.
4. Initialize a counter to `0`.
5. Traverse the entire array.
6. Compare each element with the target.
7. If both are equal, increment the counter.
8. Print the final frequency.

### 💡 Approach

This problem requires checking every element exactly once. A single traversal is sufficient to count how many times the target appears.

### 🏆 Pattern Learned

**Counting Pattern**

### ⏱ Time Complexity

```
O(n)
```

### 💾 Space Complexity

```
O(1)
```

---

## 2️⃣ FindMissingNumber.java

### 📌 Problem

Given four distinct numbers from **1 to 5**, find the missing number.

### 🧠 Algorithm

1. Create an array of size 4.
2. Read all four numbers.
3. Calculate the sum of the array.
4. Store the expected total sum (`1+2+3+4+5 = 15`).
5. Subtract the array sum from the expected sum.
6. Print the remaining value as the missing number.

### 💡 Approach

Instead of comparing every number individually, use a mathematical observation. Since the total sum is already known, subtracting the current sum directly reveals the missing element.

### 🏆 Pattern Learned

**Mathematical Observation**

### ⏱ Time Complexity

```
O(n)
```

### 💾 Space Complexity

```
O(1)
```

---

## 3️⃣ MergeTwoArrays.java

### 📌 Problem

Merge two arrays into a third array without using any built-in methods.

### 🧠 Algorithm

1. Read the sizes of both arrays.
2. Create the first and second arrays.
3. Create a third array with combined size.
4. Read elements of the first array.
5. Read elements of the second array.
6. Copy all elements of the first array into the merged array.
7. Copy all elements of the second array after the last index of the first array.
8. Print the merged array.

### 💡 Approach

Store the first array normally. While copying the second array, start filling from index `size1` in the merged array. Convert the merged array index back to the second array index using:

```
i - size1
```

### 🏆 Pattern Learned

**Array Copying**

### ⏱ Time Complexity

```
O(n + m)
```

### 💾 Space Complexity

```
O(n + m)
```

---

# 🟡 Learning Attempt

## CountDuplicateElements.java

This problem was intentionally **not added to GitHub**.

While attempting it, I realized that my current knowledge wasn't enough to solve duplicate handling cleanly without introducing additional techniques.

Instead of memorizing a solution, I decided to revisit this problem later after learning more array patterns.

---

# 🧠 Patterns Learned Today

- ✅ Counting Pattern
- ✅ Mathematical Observation
- ✅ Array Copying
- ✅ Java Formatted Output (`printf`)

---

# 💡 Key Learnings

- A single traversal is enough for many counting problems.
- Mathematics can sometimes replace extra loops.
- Arrays can be merged manually using index manipulation.
- Initialization order matters while creating arrays.
- `printf()` can be used to format output professionally.
- Java syntax problems and algorithmic problems should be treated differently.

---

# ⚠️ Mistakes Made

- Tried to create arrays before reading their sizes.
- Incorrect index calculation while merging arrays.
- Initially struggled to identify unique duplicate elements.
- Confused Java syntax issues with logic-building problems.
- Learned how `Scanner` behaves with different input methods.

---

# 🏅 HackerRank Progress

Completed:

- ✅ Welcome to Java!
- ✅ Java Stdin and Stdout I
- ✅ Java If-Else
- ✅ Java Stdin and Stdout II
- ✅ Java Output Formatting

---

# 📈 Day Summary

| Category | Progress |
|----------|----------|
| Java Programs Completed | **3** |
| Learning Attempts | **1** |
| HackerRank Problems Solved | **2 (Today)** |
| Total HackerRank Problems | **5** |
| GitHub Commits | **3** |

---

# 🌱 Reflection

Today's biggest achievement wasn't solving every problem.

I almost skipped today's session, but I still sat down, completed the remaining HackerRank challenges, improved my understanding of Java formatting, and documented everything I learned.

Every completed day strengthens both my programming skills and my consistency.

**Progress over perfection.**