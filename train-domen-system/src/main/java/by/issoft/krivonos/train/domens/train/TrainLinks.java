package by.issoft.krivonos.train.domens.train;

import by.issoft.krivonos.train.domens.wagons.Wagon;

import java.util.*;

public class TrainLinks implements Train {
    private UUID id;
    private int size;
    private int weight;
    private Node<Wagon> head;
    private Node<Wagon> tail;


    @Override
    public int getWeight() {
        return weight;
    }


    @Override
    public String getId() {
        return id.toString();
    }

    @Override
    public Wagon getHead() {
        final Node<Wagon> h = head;
        if (h == null)
            throw new NoSuchElementException();
        return h.element;
    }

    @Override
    public Set<Wagon> getTail() {

        return Set.of();
//                this.stream().skip(1)..collect(Collectors.toSet());
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Wagon> iterator() {
        return new Iterator<Wagon>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Wagon next() {
                return null;
            }
        };
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Wagon wagon) {
        joinTail(wagon);
        return true;
    }


    public Node<Wagon> Node(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        Node<Wagon> e = head;

        if (index < (size >> 1)) {
            for (int i = 0; i <= index; i++)
                e = e.next;
        } else {
            for (int i = size; i > index; i--)
                e = e.prev;
        }

        return e;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Wagon> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private void joinHead(Wagon e) {
        final Node<Wagon> f = head;
        final Node<Wagon> newNode = new Node<Wagon>(e, null, f);
        head = newNode;
        if (f == null)
            tail = newNode;
        else
            f.prev = newNode;
        size++;
    }

    private void joinTail(Wagon e) {
        final Node<Wagon> l = tail;
        final Node<Wagon> newNode = new Node(e, tail, null);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
    }

    void joinBefore(Wagon e, Node<Wagon> succ) {

        final Node<Wagon> pred = succ.prev;
        final Node<Wagon> newNode = new Node<Wagon>(e, pred, succ);
        succ.prev = newNode;
        if (pred == null)
            head = newNode;
        else
            pred.next = newNode;
        size++;

    }

    private Wagon unjoinHead(Node<Wagon> f) {

        final Wagon element = f.element;
        final Node<Wagon> next = f.next;
        f.element = null;
        f.next = null; // help GC
        head = next;
        if (next == null)
            tail = null;
        else
            next.prev = null;
        size--;
        return element;
    }

    private Wagon unjoinTail(Node<Wagon> l) {
        // assert l == tail && l != null;
        final Wagon element = l.element;
        final Node<Wagon> prev = l.prev;
        l.element = null;
        l.prev = null; // help GC
        tail = prev;
        if (prev == null)
            head = null;
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
            head = next;
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

