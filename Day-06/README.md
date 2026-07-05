# 📅 Day 06 - Array Manipulation & Pattern Recognition

## 🎯 Goal

Strengthen array manipulation skills by solving problems involving nested loops, shifting elements, and comparing multiple arrays while improving logical thinking and debugging skills.

---

# ✅ Programs Completed

## 1️⃣ FindFirstDuplicateElement.java

### 📌 Problem

Find the first duplicate element in an array of five integers. If no duplicate exists, print an appropriate message.

### 🧠 Algorithm

1. Read the array elements.
2. Assume no duplicate has been found.
3. Traverse the array using the first loop.
4. Compare each element with all elements after it.
5. If a duplicate is found:
   - Print the duplicate element.
   - Mark duplicate as found.
   - Exit both loops.
6. If no duplicate is found after checking the complete array, print an appropriate message.

### 💡 Approach

The solution compares every element only with the elements after it. Once the first duplicate is found, both loops terminate immediately to avoid unnecessary comparisons.

### 🏆 Pattern Learned

**Early Exit Pattern**

### ⏱ Time Complexity

```
O(n²)
```

### 💾 Space Complexity

```
O(1)
```

---

## 2️⃣ LeftRotateArray.java

### 📌 Problem

Rotate an array one position to the left without using another array.

### 🧠 Algorithm

1. Store the first element in a temporary variable.
2. Shift every remaining element one position to the left.
3. Place the stored element at the last index.
4. Print the rotated array.

### 💡 Approach

The first element would be lost during shifting, so it is stored temporarily. After shifting all elements left, the stored value is placed at the last position.

### 🏆 Pattern Learned

**Shifting Pattern**

### ⏱ Time Complexity

```
O(n)
```

### 💾 Space Complexity

```
O(1)
```

---

## 3️⃣ FindCommonElements.java

### 📌 Problem

Find and print all common elements between two arrays.

### 🧠 Algorithm

1. Read both arrays.
2. Assume no common element exists.
3. Traverse the first array.
4. For every element, traverse the second array.
5. If both elements are equal:
   - Print the common element.
   - Mark that a common element has been found.
6. After checking all elements, print a message if no common element exists.

### 💡 Approach

Each element of the first array is compared with every element of the second array. This brute-force approach guarantees that every possible pair is checked.

### 🏆 Pattern Learned

**Nested Comparison Pattern**

### ⏱ Time Complexity

```
O(n × m)
```

### 💾 Space Complexity

```
O(1)
```

---

# 🧠 Patterns Learned Today

- ✅ Early Exit Pattern
- ✅ Shifting Pattern
- ✅ Nested Comparison Pattern
- ✅ Mirror Thinking (Left Rotation ↔ Right Rotation)

---

# 💡 Key Learnings

- Learned how to stop nested loops using a boolean variable.
- Understood the importance of meaningful boolean variable names.
- Learned how array rotation works using only one temporary variable.
- Improved understanding of nested loop comparisons.
- Recognized that many problems have opposite (mirror) versions that can be solved with similar logic.

---

# ⚠️ Mistakes Made

- Initially struggled to stop both loops after finding the first duplicate.
- Used an unclear boolean variable name (`istrue`) before replacing it with a meaningful one.
- Accidentally used `System.err.println()` instead of `System.out.println()`.
- Printed the wrong message when using the boolean condition.
- Forgot to close the Scanner in one program.

---

# 🏅 HackerRank Progress

Completed:

- ✅ Java Loops I
- ✅ Java Loops II

---

# 📈 Day Summary

| Category | Progress |
|----------|----------|
| Java Programs Completed | **3** |
| HackerRank Problems Solved | **2** |
| Patterns Learned | **4** |
| GitHub Commits | **3** |

---

# 🌱 Reflection

Today's session focused on improving problem-solving rather than simply writing code.

The biggest achievement was understanding how to debug nested loops, use boolean variables effectively, and recognize patterns that can be reused in future problems.

Another important lesson was learning to think about the algorithm first, write the code independently, and ask for hints only when genuinely needed.

Every solved problem is becoming more than just code—it's becoming a reusable pattern for future interviews and real-world programming.