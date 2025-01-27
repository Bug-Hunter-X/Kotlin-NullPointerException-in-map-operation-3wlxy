# Kotlin NullPointerException in map Operation

This repository demonstrates a common Kotlin error involving NullPointerExceptions when using the `map` function on a list containing nullable values. The `bug.kt` file shows the problematic code, while `bugSolution.kt` presents a corrected version with proper null handling.

## Problem
The original code attempts to double each element in a list using `map`. If the list contains null values, this will lead to a `NullPointerException` at runtime. 

## Solution
The solution employs the `mapNotNull` function, effectively filtering out null values before applying the doubling operation. Alternatively, the `?.let` operator can be used for more concise null handling within the map function itself.