void backtrack(parameters) {

    // 1. Base condition
    if (baseCondition) {
        result.add(new ArrayList<>(currentState));
        return;
    }

    // 2. Try all choices
    for (int i = start; i < choices.length; i++) {

        // 3. Make choice
        currentState.add(choices[i]);

        // 4. Recurse
        backtrack(updated parameters);

        // 5. Undo choice (BACKTRACK)
        currentState.remove(currentState.size() - 1);
    }
}
