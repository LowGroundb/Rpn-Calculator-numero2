# RPN Calculator (Java) — numero2

A Reverse Polish Notation (postfix) calculator. It evaluates expressions using a stack (push numbers, apply operators).

## Build and Run (generic)
```bash
# Compile
javac -d bin $(find src -name "*.java")

# Run (replace Main with your actual main class)
java -cp bin Main
```

## Examples
```text
# (3 + 4) * 2 / 7
3 4 + 2 * 7 /   =&gt; 2

# 5 + ((1 + 2) * 4) - 3
5 1 2 + 4 * + 3 -   =&gt; 14
```

## Ideas / Next steps
- More operators: power (^), unary negation, sqrt
- Input validation and helpful error messages
- REPL mode and file input
- Unit tests
