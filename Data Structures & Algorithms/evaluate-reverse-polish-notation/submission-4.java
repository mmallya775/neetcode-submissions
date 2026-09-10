class Solution {
    public int evalRPN(String[] tokens) {
        var stack = new ArrayDeque<Integer>();

        for (String token : tokens) {
            switch (token) {
                case "+", "-", "*", "/" -> {
                    int right = stack.pop();
                    int left = stack.pop();

                    stack.push(switch (token) {
                        case "+" -> left + right;
                        case "-" -> left - right;
                        case "*" -> left * right;
                        case "/" -> left / right;
                        default -> throw new IllegalStateException();
                    });
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}