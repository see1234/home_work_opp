package HomeWork3;

import java.util.Iterator;
import java.util.LinkedList;


import java.util.Iterator;
import java.util.NoSuchElementException;

    public class MyLinkedList<E> implements Iterable<E> {

        private int size = 0;
        private Node<E> first;
        private Node<E> last;

        @Override
        public Iterator<E> iterator() {
            return new LinkedIterator();
        }

        private class Node<E> {
            E data;
            Node<E> next;
            Node<E> prev;

            Node(E element ,Node<E> next, Node<E> prev) {
                this.data = element;
                this.prev = prev;
                this.next = next;
            }

        }

        class LinkedIterator implements Iterator<E> {

            private Node<E> current;
            private int nextIndex;
            private Node<E> lastReturned;

            LinkedIterator() {
                current = first;
                nextIndex = 0;
            }

            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                lastReturned = current;
                current = current.next;
                nextIndex++;
                return lastReturned.data;
            }
        }
        public String toString() {
            Iterator<E> it = iterator();
            if (! it.hasNext())
                return "[]";

            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (;;) {
                E e = it.next();
                sb.append(e == this ? "(this Collection)" : e);
                if (! it.hasNext())
                    return sb.append(']').toString();
                sb.append(',').append(' ');
            }
        }
        void add(E item) {
            final Node<E> currentLast = last;
            final Node<E> newItem = new Node<E>(item, null, currentLast);

            last = newItem;

            if (first == null && currentLast == null) {
                first = newItem;
            }
            else {
                currentLast.next = newItem;
            }

            size++;
        }


}
