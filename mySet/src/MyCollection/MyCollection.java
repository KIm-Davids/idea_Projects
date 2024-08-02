package MyCollection;

public interface MyCollection {
    void add(Object e);
    void remove(Object e);
    int size();
    Object get(int e);
    boolean isEmpty();
    Object[] clear();
    void increaseCapacity();
    boolean contains(Object e);

}
