package comp271.lists;

public class DoublyLinkedList {
    Node head;
    public class Node {
        int info;
        Node previous;
        Node next;

        Node(int num){
            info = num;
        }
    }
    public void push(int newNumber){
    Node newNode = new Node(newNumber);
    newNode.next = head;
    newNode.previous = null;

    if (head != null)
        head.previous = newNode;
    head = newNode;
    }

    public void insertBefore(Node nextNode, int newInfo){
        Node newNode = new Node(newInfo);
        newNode.previous = nextNode.previous;
        newNode.next = nextNode;
    }

    public void insertAfter(Node previousNode, int newInfo){
     Node newNode = new Node(newInfo);
         newNode.next = previousNode.next;
         previousNode.next = newNode;
         newNode.previous = previousNode;
    }
    public void append(int newInfo) {
         Node newNode = new Node(newInfo);
         Node last = head;
         newNode.next = null;

      if (head == null) {
          newNode.previous = null;
          head = newNode;
          return;
          //I don't know if this is necessary? I use the Princeton Java guide for reference and I can't figure out if append needs existing data so I figured better safe than sorry
      }
      while (last.next != null)
      last = last.next;
      last.next = newNode;
      newNode.previous = last;
      //I had this as an else statement and it wouldn't compile and after about an hour of crying I changed it to a while and now I hate everything
  }
    public void traversal (Node node){
        Node last = null;
        System.out.println("This is the array in forward traversal.");
        while (node != null){
            last = node;
            node = node.next;
        }
        System.out.println("This is the array in reverse traversal.");
        while (last != null){
            System.out.print(last.info + " ");
            last = last.previous;
        }
}
  }


