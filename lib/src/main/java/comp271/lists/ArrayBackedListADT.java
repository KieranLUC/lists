package comp271.lists;

public class ArrayBackedListADT implements ListADT {

    private Integer[] myIntegers;
    private int length;

    public ArrayBackedListADT(int initialCapacity) {
        this.myIntegers = new Integer[initialCapacity];
        this.length = 0;
    }


    @Override
    public void append(Integer x) {
       this.myIntegers[this.length] = x;
       this.length++;

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

        if (length > 0) {
            builder.append(myIntegers[0]);
            for (int i = 1; i < length; i++) {
                builder.append(", ").append(myIntegers[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
