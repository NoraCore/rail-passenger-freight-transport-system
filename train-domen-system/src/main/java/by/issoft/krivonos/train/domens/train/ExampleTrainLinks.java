package by.issoft.krivonos.train.domens.train;

import by.issoft.krivonos.train.domens.wagons.Wagon;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ExampleTrainLinks {

    private int size;
    private int weight;
    private Node<Wagon> header;
    private Node<Wagon> tail;

    public ExampleTrainLinks() {
    }


    public Wagon getheader() {
        final Node<Wagon> f = header;
        if (f == null)
            throw new NoSuchElementException();
        return f.element;
    }

    public Wagon gettail() {
        final Node<Wagon> l = tail;
        if (l == null)
            throw new NoSuchElementException();
        return l.element;
    }

    public Wagon removeheader() {
        final Node<Wagon> f = header;
        if (f == null)
            throw new NoSuchElementException();
        return unjoinheader(f);
    }

    public Wagon removetail() {
        final Node<Wagon> l = tail;
        if (l == null)
            throw new NoSuchElementException();
        return unjointail(l);
    }

    public void addheader(Wagon e) {
        joinheader(e);
    }

    public void addtail(Wagon e) {
        jointail(e);
    }

    public boolean contains(Object o) {
        final boolean b = indexOf(o) > 0;
        return b;
    }


    public Iterator iterator() {
        return null;
    }


    public Object[] toArray() {
        return new Object[0];
    }


    public boolean remove(Object o) {
        return false;
    }


    public boolean addAll(Collection c) {
        return false;
    }


    public void clear() {

    }


    public boolean retainAll(Collection c) {
        return false;
    }


    public boolean removeAll(Collection c) {
        return false;
    }


    public boolean containsAll(Collection c) {
        return false;
    }


    public Object[] toArray(Object[] a) {

        return new Object[0];
    }

    private int indexOf(Object o) {
        return 0;
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return false;
    }

    public boolean add(Wagon e) {
        jointail(e);
        return true;
    }


    public Node<Wagon> Node(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        Node<Wagon> e = header;

        if (index < (size >> 1)) {
            for (int i = 0; i <= index; i++)
                e = e.next;
        } else {
            for (int i = size; i > index; i--)
                e = e.prev;
        }

        return e;
    }

    private void joinheader(Wagon e) {
        final Node<Wagon> f = header;
        final Node<Wagon> newNode = new Node<Wagon>(e, null, f);
        header = newNode;
        if (f == null)
            tail = newNode;
        else
            f.prev = newNode;
        size++;

    }

    private void jointail(Wagon e) {
        final Node<Wagon> l = tail;
        final Node<Wagon> newNode = new Node(e, tail, null);
        tail = newNode;
        if (l == null)
            header = newNode;
        else
            l.next = newNode;
        size++;
    }

    void joinBefore(Wagon e, Node<Wagon> succ) {

        final Node<Wagon> pred = succ.prev;
        final Node<Wagon> newNode = new Node<Wagon>(e, pred, succ);
        succ.prev = newNode;
        if (pred == null)
            header = newNode;
        else
            pred.next = newNode;
        size++;

    }

    private Wagon unjoinheader(Node<Wagon> f) {

        final Wagon element = f.element;
        final Node<Wagon> next = f.next;
        f.element = null;
        f.next = null; // help GC
        header = next;
        if (next == null)
            tail = null;
        else
            next.prev = null;
        size--;
        return element;
    }

    private Wagon unjointail(Node<Wagon> l) {
        // assert l == tail && l != null;
        final Wagon element = l.element;
        final Node<Wagon> prev = l.prev;
        l.element = null;
        l.prev = null; // help GC
        tail = prev;
        if (prev == null)
            header = null;
        else
            prev.next = null;
        size--;
        return element;
    }

    private Wagon unjoin(Node<Wagon> x) {
        final Wagon element = x.element;
        final Node<Wagon> next = x.next;
        final Node<Wagon> prev = x.prev;

        if (prev == null) {
            header = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.element = null;
        size--;
        return element;
    }

    private ExampleTrainLinks superClone() {
        try {
            return (ExampleTrainLinks) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public ExampleTrainLinks clone() {
        ExampleTrainLinks clone = superClone();

        clone.header = clone.tail = null;
        clone.size = 0;

        for (Node<Wagon> x = header; x != null; x = x.next)
            clone.add(x.element);

        return clone;
    }


    public int getSize() {
        return 0;
    }

    public int getWeight() {
        return 0;
    }


    public String getId() {
        return "";
    }


    private static class Node<Wagon> {
        Wagon element;
        Node<Wagon> next;
        Node<Wagon> prev;

        Node(Wagon element, Node<Wagon> prev, Node<Wagon> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}


