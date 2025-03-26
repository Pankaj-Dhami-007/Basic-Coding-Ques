class LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;
    static int size = 0;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void addMid(int data, int idx) {
        Node newNode = new Node(data);

        if (idx <= 0) {
            addFirst(data);
            return;
        }
        if (idx >= size) {
            addLast(data);
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    int removeAtFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    int removeAtLast() {
        if (size == 0) {
            System.out.println("Empty");
            return -1;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    void disp() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(100);
        list.addFirst(200);
        list.addFirst(300);
        list.addFirst(400);

        list.disp();
        System.out.println("Head " + list.head.data);
        System.out.println("Tail " + list.tail.data);

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.disp();
        System.out.println("Head " + list.head.data);
        System.out.println("Tail " + list.tail.data);

        list.addMid(1000, 4);
        list.addMid(2000, 4);
        list.addMid(3000, 4);
        list.disp();

        System.out.println(list.size + " Size");

        list.removeAtFirst();
        list.removeAtLast();
        list.disp();
    }
}
