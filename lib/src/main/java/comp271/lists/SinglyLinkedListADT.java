package comp271.lists;

public class SinglyLinkedListADT implements ListADT {

    Node head;
    Node tail;

    public SinglyLinkedListADT() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void append(Integer x) {
        Node newNode = new Node(x);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.head.setNext(this.tail);
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public void prepend(Integer x) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public void insertAfter(Integer w, Integer x) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public boolean remove(Integer x) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public Integer search(Integer x) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public int length() {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        if (this.head != null) {
            builder.append(this.head.getValue());

            Node currentNode = this.head.getNext();
            while (currentNode != null) {
                builder.append(", ").append(currentNode.getValue());
                currentNode = currentNode.getNext();
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
