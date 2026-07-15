class CallStack {

    private static class Node {

        String functionName;
        Node next;

        Node(String name, Node next) {
            this.functionName = name;
            this.next = next;
        }
    }

    private Node top = null;

    public void push(String functionName) {
        top = new Node(functionName, top);
    }

    public String pop() {

        if (isEmpty()) {
            throw new RuntimeException("No Active Call");
        }

        String ans = top.functionName;
        top = top.next;

        return ans;
    }

    public String peek() {

        if (isEmpty()) {
            throw new RuntimeException("Stack Empty");
        }

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validate()");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}