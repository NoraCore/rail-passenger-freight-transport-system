package by.issoft.krivonos.train.domens.train;

import java.util.LinkedList;

public class EXample<E> {
    LinkedList list = new LinkedList();

//    public ListIterator<E> listIterator(int index) {
//        checkPositionIndex(index);
//        return new ListItr(index);
//    }
//
//    private class ListItr implements ListIterator<E> {
//        private Node<E> lastReturned;
//        private Node<E> next;
//        private int nextIndex;
//        private int expectedModCount = modCount;
//
//        ListItr(int index) {
//            // assert isPositionIndex(index);
//            next = (index == size) ? null : node(index);
//            nextIndex = index;
//        }
//
//        public boolean hasNext() {
//            return nextIndex < size;
//        }
//
//        public E next() {
//            checkForComodification();
//            if (!hasNext())
//                throw new NoSuchElementException();
//
//            lastReturned = next;
//            next = next.next;
//            nextIndex++;
//            return lastReturned.item;
//        }
//
//        public boolean hasPrevious() {
//            return nextIndex > 0;
//        }
//
//        public E previous() {
//            checkForComodification();
//            if (!hasPrevious())
//                throw new NoSuchElementException();
//
//            lastReturned = next = (next == null) ? last : next.prev;
//            nextIndex--;
//            return lastReturned.item;
//        }
//
//        public int nextIndex() {
//            return nextIndex;
//        }
//
//        public int previousIndex() {
//            return nextIndex - 1;
//        }
//
//        public void remove() {
//            checkForComodification();
//            if (lastReturned == null)
//                throw new IllegalStateException();
//
//            LinkedList.Node<E> lastNext = lastReturned.next;
//            unlink(lastReturned);
//            if (next == lastReturned)
//                next = lastNext;
//            else
//                nextIndex--;
//            lastReturned = null;
//            expectedModCount++;
//        }
//
//        public void set(E e) {
//            if (lastReturned == null)
//                throw new IllegalStateException();
//            checkForComodification();
//            lastReturned.item = e;
//        }
//
//        public void add(E e) {
//            checkForComodification();
//            lastReturned = null;
//            if (next == null)
//                linkLast(e);
//            else
//                linkBefore(e, next);
//            nextIndex++;
//            expectedModCount++;
//        }
//
//        public void forEachRemaining(Consumer<? super E> action) {
//            Objects.requireNonNull(action);
//            while (modCount == expectedModCount && nextIndex < size) {
//                action.accept(next.item);
//                lastReturned = next;
//                next = next.next;
//                nextIndex++;
//            }
//            checkForComodification();
//        }
//
//        final void checkForComodification() {
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//        }
//    }
//
//
//
//    /**
//     * @since 1.6
//     */
//    public Iterator<E> descendingIterator() {
//        return new DescendingIterator();
//    }
//
//    /**
//     * Adapter to provide descending iterators via ListItr.previous
//     */
//    private class DescendingIterator implements Iterator<E> {
//        private final ListItr itr = new ListItr(size());
//        public boolean hasNext() {
//            return itr.hasPrevious();
//        }
//        public E next() {
//            return itr.previous();
//        }
//        public void remove() {
//            itr.remove();
//        }
//    }

}
