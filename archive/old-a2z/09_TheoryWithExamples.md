# #9 — Theory with Examples

## Time Complexity

Time complexity describes how the running work of an algorithm changes
with respect to input size.

It is represented using Big-O notation.

## Rules

1. Consider worst-case complexity.
2. Ignore constant terms.
3. Ignore lower-order terms.

## Examples

### Single Loop

for (int i = 0; i < N; i++) {
    // work
}

Time: O(N)

### Nested Loops

for (int i = 0; i < N; i++) {
    for (int j = 0; j < N; j++) {
        // work
    }
}

Time: O(N²)

### Triangular Loop

Total iterations:

1 + 2 + ... + N

= N(N + 1) / 2

Time: O(N²)

## Space Complexity

Space complexity represents memory usage.

Space can be considered as:

- Input space
- Auxiliary space

Example:

Reversing an array using two pointers:

Time: O(N)
Auxiliary Space: O(1)