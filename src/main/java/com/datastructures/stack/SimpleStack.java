package com.datastructures.stack;

import java.io.Serializable;

public class SimpleStack {
    private static char[] a;
    private static int top;

    SimpleStack(int size) {
        a = new char[size];
        top = -1;
    }

    public void push(char k) {
        if (!isFull()) {
            ++top;
            a[top] = k;
            System.out.println("element added in stack:" + k);
        } else System.out.println("stack is full");

    }

    public char pop() {
        char b;
        if (isEmpty()) {
            System.out.println("element popped from stack:" + a[top]);
            b=a[top];
            a[top] = 0;
            --top;
            return b;
        } else System.out.println("stack is empty");
        return 0;
    }

    public boolean isEmpty() {
        return top >= 0;
    }

    public boolean isFull() {
        return top >= a.length - 1;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("element peeked:" + a[top]);
        }
    }
}
