package hu.petrik.StackGenericClass;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> StackList;

    public Stack() {
        this.StackList = new ArrayList<>();
        this.StackList = null;
    }

    public boolean push(T element) {
        boolean siker = false;
        if (!this.StackList.contains(element)) {
            this.StackList.add(element);
            siker = true;
        }
        return siker;
    }

    public boolean pop() {
        boolean siker = false;
        if (!this.StackList.isEmpty()) {
            this.StackList.remove((this.StackList.size() - 1));
            siker = true;
        }
        return siker;
    }

    public T top() {
        T elem = null;
        if (!this.StackList.isEmpty()) {
            elem = this.StackList.get((this.StackList.size() - 1));
        }
        return elem;
    }

    public boolean isEmpty() {
        return this.StackList.size() == 0;
    }

    public boolean empty() {
        boolean siker = false;
        if (!this.StackList.isEmpty()) {
            this.StackList = new ArrayList<>();
            siker = false;
        }
        return siker;
    }
}
