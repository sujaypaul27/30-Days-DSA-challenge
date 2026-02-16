GOAL
The goal of this README is to build a deep and practical understanding of Time Complexity and Space Complexity so that you can confidently analyze algorithms, write optimized solutions, and perform well in coding interviews and competitive programming. This document focuses not only on definitions but also on calculation methods, thinking approach, and common mistakes.

WHAT IS TIME COMPLEXITY

Time Complexity describes how the running time of an algorithm grows as the input size (n) increases. It does not measure actual time in seconds. Instead, it measures how the number of operations grows relative to input size.

Time complexity helps us compare algorithms independently of hardware or programming language.

Example intuition:
If input size doubles, does runtime stay same, double, or become four times? That growth behavior is what we measure.

WHAT IS SPACE COMPLEXITY

Space Complexity describes how much extra memory an algorithm uses relative to input size.

Important: Space complexity usually refers to extra space (auxiliary space), not the space required to store the input itself unless explicitly stated.

Example intuition:
If input size increases, does memory usage remain constant or grow proportionally?

BIG-O NOTATION

Big-O notation represents the worst-case growth rate of an algorithm.

Common complexities in increasing order of growth:

O(1) Constant time
O(log n) Logarithmic time
O(n) Linear time
O(n log n) Linearithmic time
O(n^2) Quadratic time
O(2^n) Exponential time

In interviews, you are usually expected to give Big-O worst case unless asked otherwise.

HOW TO CALCULATE TIME COMPLEXITY (STEP-BY-STEP THINKING)

Count how many times the main operation runs.
Express it in terms of input size n.
Drop constants.
Drop lower-order terms.
Keep the highest growing term.

CASE 1: CONSTANT TIME O(1)

Example:

for(int i = 0; i < 10; i++) {
System.out.println("Hello");
}

Even if input size changes, loop runs only 10 times.

Time complexity = O(1)

Hint: If operation count does not depend on n, it is constant time.

CASE 2: LINEAR TIME O(n)

Example:

for(int i = 0; i < n; i++) {
System.out.println(arr[i]);
}

The loop runs n times.

Time complexity = O(n)

Hint: Single loop running from 0 to n usually gives O(n).

CASE 3: NESTED LOOPS O(n^2)

Example:

for(int i = 0; i < n; i++) {
for(int j = 0; j < n; j++) {
System.out.println(i + " " + j);
}
}

Outer loop runs n times.
Inner loop runs n times for each outer iteration.

Total operations = n \* n = n^2

Time complexity = O(n^2)

Hint: Nested loops multiply.

CASE 4: LOGARITHMIC TIME O(log n)

Example:

while(n > 1) {
n = n / 2;
}

Each iteration halves n.

Number of times you can divide n by 2 until it becomes 1 is log n.

Time complexity = O(log n)

Hint: Whenever input reduces by half each time → think logarithmic.

CASE 5: MULTIPLE LOOPS (ADD THEM)

Example:

for(int i = 0; i < n; i++) { }

for(int i = 0; i < n; i++) { }

Total operations = n + n = 2n
Drop constant → O(n)

Hint: Separate loops add, nested loops multiply.

SPACE COMPLEXITY CALCULATION

Example 1:

int sum = 0;

Uses only one variable regardless of n.

Space complexity = O(1)

Example 2:

int[] temp = new int[n];

Array size depends on n.

Space complexity = O(n)

Example 3 (Recursion):

If recursion depth is n, stack space = O(n)

Hint: Recursion uses stack memory. Always check recursion depth.

IMPORTANT POINTS

Ignore constants:
O(2n) becomes O(n)

Ignore lower terms:
O(n^2 + n) becomes O(n^2)

Worst case is usually required.

For nested loops:

If dependent (j = i to n), complexity may be triangular → O(n^2)

If independent → multiply fully

Binary search is O(log n).

Sorting:

Bubble sort → O(n^2)

Merge sort → O(n log n)

COMMON CLARIFICATIONS & DOUBTS

Doubt: If we print inside loop, does printing affect complexity?
Answer: No. Printing is considered O(1) unless specified otherwise.

Doubt: What if loop runs from n to 1?
Answer: Still O(n). Direction does not matter.

Doubt: If loop runs from 0 to n/2?
Answer: n/2 → Drop constant → O(n)

Doubt: What about nested loop like:
for i in n
for j in i

Answer:
Total operations = n(n+1)/2
= (n^2 + n)/2
Drop constants and lower terms → O(n^2)

Doubt: Is recursion always O(n)?
Answer: No. It depends on:

Depth of recursion

Number of recursive calls per level

PATTERN SELECTION GUIDE

If you see:
Single loop → Think O(n)

Nested loop → Think O(n^2)

Divide by 2 repeatedly → Think O(log n)

Two halves recursively → Think O(n log n)

Generate all subsets → Think O(2^n)

LEARNING PHILOSOPHY

Do not memorize complexity.
Always calculate it logically.

Ask yourself:

How many times does this statement run?

What changes as input grows?

Is loop dependent or independent?

Is recursion branching?

Practice by:

Writing dry runs.

Counting iterations manually.

Deriving formula.

Then simplifying.

CURRENT STATUS CHECK

You understand Time Complexity if:

You can calculate nested loops confidently.

You can analyze recursion depth.

You know when to multiply and when to add loops.

You can optimize from O(n^2) to O(n log n) or O(n).

You understand Space Complexity if:

You can identify auxiliary arrays.

You can analyze recursion stack usage.

You know difference between input space and extra space.

FINAL MINDSET

Time Complexity measures growth of operations.
Space Complexity measures growth of memory usage.
Both are about scalability, not actual runtime in seconds.

Master this, and your DSA foundation becomes strong.
