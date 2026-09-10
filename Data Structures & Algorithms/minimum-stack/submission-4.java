class MinStack {
  // Maintain two dequques, one to store actual data
  // another to maintain minimum elements until now.
  // So when you pop you pop from both to get the current
  // minimum value
  private Deque<Integer> minStack;
  private Deque<Integer> mainStack;
  public MinStack() {
    minStack = new ArrayDeque();
    mainStack = new ArrayDeque();
  }

  public void push(int val) {
    mainStack.push(val);

    if (minStack.isEmpty()) {
        minStack.push(val);
    } else {
        minStack.push(Math.min(val,minStack.peek()));
    }
  }

  public void pop() {
    mainStack.pop();
    minStack.pop();
  }

  public int top() {
    return mainStack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}
