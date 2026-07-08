# Documentation and Structure Instructions for Future Problems

This repository follows a simple structure for each LeetCode problem solution.

## Folder structure to follow for every new problem

Create a new folder inside [problems](.) using the problem name in lowercase and underscores, for example:

- problems/two_sum/
- problems/valid_parentheses/
- problems/merge_two_sorted_lists/

Inside each problem folder, create these files:

1. problem.md
   - Copy the original problem statement from LeetCode.
   - Keep the examples and constraints.
   - This file acts as the documentation source for the problem.

2. Solutions.kt
   - Write the Kotlin solution in a class named Solution.
   - Add comments explaining the logic step by step.
   - Keep the implementation focused on the algorithm.

3. testCases.kt
   - Add a main function.
   - Write sample test cases from the problem statement.
   - Use assertions to verify the result.

## Recommended workflow

1. Create a new folder under [problems](.) with the problem name.
2. Add the problem statement in problem.md.
3. Implement the solution in Solutions.kt.
4. Add sample tests in testCases.kt.
5. Compile and run the code to verify the solution.

## Verification command

Run the following command from the problem folder:

```bash
kotlinc Solutions.kt testCases.kt -include-runtime -d solution.jar && java -jar solution.jar
```

## Notes

- Keep file names consistent across all problems.
- Use clear comments so the logic is easy to understand later.
- Update the documentation whenever the approach or solution changes.
- Treat problem.md as the main documentation file for each problem.
