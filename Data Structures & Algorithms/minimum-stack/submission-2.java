class MinStack {
  private Deque<Integer> minStack;
  private Deque<Integer> mainStack;
  public MinStack() {
    minStack = new ArrayDeque();
    mainStack = new ArrayDeque();
  }

  public void push(int val) {
    mainStack.push(val);
    if (minStack.peek() != null && minStack.peek() > val) {
      minStack.push(val);
    } else if (minStack.peekFirst()== null) {
        minStack.push(val);
    } 
    else {
      minStack.push(minStack.peek());
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
