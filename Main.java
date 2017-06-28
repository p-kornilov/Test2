package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world! :)");
        Table<Integer,String> table = new Table<>();
        System.out.println("Hello, world! :)");
        for (int i = 0;i<10;i++) {
            table.add(i,"Hello-"+i);
        }
        table.remove(5);
        for (int i = 0;i<10;i++) {
            System.out.println(table.get(i));
        }


	// write your code here
    }
}

class Stack<E> {
    private E[] elements;
    private int next_pos;

    Stack(int length) {
        elements = (E[])new Object[length];
        next_pos = 0;
    }

    Stack() {
        this(10);
    }

    boolean push(E element) {
        if (next_pos==elements.length) {
            elements = Arrays.copyOf(elements,elements.length+10);
        }
        elements[next_pos] = element;
        next_pos++;
        return true;
    }

    E pop() {
        if (next_pos > 0) {
            next_pos--;
            return elements[next_pos];
        } else {
            return null;
        }
    }

    boolean isEmpty() {
        return next_pos == 0;
    }
}

class Table<K,V> {
    private ArrayList<Entry<K,V>> table;
    private int next_pos;

    Table() {
        table = new ArrayList<>(100);
        next_pos = 0;
    }

    void add(K key, V value) {
   //     if (next_pos==table.) {
   //         table = Arrays.copyOf(table,table.length+10);
   //     }
        table.add(new Entry(key, value));
        next_pos++;
    }

    boolean remove(K key) {
        for (Entry<K,V> en:table) {
            if (en.key.equals(key)) {
                return table.remove(en);
            }
        }
        return false;
    }

    void set(K key, V value) {
        for (Entry<K,V> en:table) {
            if (en.key.equals(key)) {
                en.value = value;
            }
        }
        add(key,value);
    }

    V get(K key) {
        V fv=null;

        for (Entry<K,V> en:table) {
            if (en.key.equals(key)) {
                fv = en.value;
            }
        }

        return fv;
    }

    class Entry<K,V> {
        K key;
        V value;

        Entry(K key,V value) {
            this.key = key;
            this.value = value;
        }
    }

    class TestClass {
        int i;
        String S;
    }

}