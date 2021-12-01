package comp271.lists;

public interface ListADT {
    void append(Integer x);
    void prepend(Integer x);
    void insertAfter(Integer w, Integer x);
    boolean remove(Integer x);
    Integer search(Integer x);
    void sort();
    boolean isEmpty();
    int length();
    void push(Integer x);
    void insertBefore(Integer w, Integer x);
    void traversal();
}
