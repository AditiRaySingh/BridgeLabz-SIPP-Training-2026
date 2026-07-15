class InsertAfterNode {

    public static void insertAfter(Node current, int trackId) {

        if (current == null)
            return;

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        insertAfter(head.next, 25);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}