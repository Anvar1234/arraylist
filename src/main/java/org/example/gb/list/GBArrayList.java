package org.example.gb.list;

import org.example.gb.GBList;

import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {
    private T[] values;
    private static final int INITCAPACITY = 5;
    private static int countOfElements = 0;

    public GBArrayList() {
        this.values = (T[]) new Object[INITCAPACITY];
    }

    @Override
    public boolean add(T element) {
        try {
            T[] temp = values;
            if (countOfElements == values.length) {
                values = (T[]) new Object[values.length + values.length / 2 + 1];
            }
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[countOfElements] = element;
            countOfElements++;
            return true;

        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void remove(int index) {
        try {
            if (values[index] != null) {
                countOfElements--;
            }
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int countElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, countElementsAfterIndex);

        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public void update(int index, T element) {
        values[index] = element;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(values);
    }

}
