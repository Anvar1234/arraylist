package org.example.gb;

public interface GBList<T> extends Iterable<T>{
    boolean add(T element);
    int size();
    void remove(int index);
    T get(int index);
    void update(int index, T elemnt);

}
