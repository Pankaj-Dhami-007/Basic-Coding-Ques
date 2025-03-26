class ManualLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    int search(int key, Node head){
         Node temp = head;

         int i =0;
         while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
         }
         return -1;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);


        a.next = b;  // a -> b
        b.next = c;  // b -> c
        c.next = d;  // c -> d
        d.next = e;  // d -> e
        e.next = f;  // e -> f
        f.next = g;  // f -> g
        
        Node head = a;
        Node temp = head;
        
        System.out.println("Manual Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        ManualLinkedList list = new ManualLinkedList();
        System.out.println("Found At index "+list.search(50, a));
    }
}
