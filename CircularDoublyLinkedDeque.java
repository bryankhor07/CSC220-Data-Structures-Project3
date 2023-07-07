/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Assignment04PartD.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package assignment04PartD;

public class CircularDoublyLinkedDeque<T> implements DequeInterface<T> {

    private DoublyLinkedNode firstNode; // References node at front of deque
    private DoublyLinkedNode lastNode; // References node at back of deque

    @Override
    public void addToFront(T newEntry) { // Adding to the front of a nonempty deque
        DoublyLinkedNode newNode = new DoublyLinkedNode(null, newEntry, firstNode);
        if (isEmpty())
            lastNode = newNode;
        else
            firstNode.setPreviousNode(newNode);
        firstNode = newNode;
    }

    @Override
    public void addToBack(T newEntry) { // Adding to the back of a deque
        DoublyLinkedNode newNode = new DoublyLinkedNode(lastNode, newEntry, null);
        if (isEmpty())
            firstNode = newNode;
        else
            lastNode.setNextNode(newNode);
        lastNode = newNode;
    }

    @Override
    public T removeFront() { // Removing the front of a deque containing at least two entries
        T front = getFront(); // Might throw EmptyQueueException
        // Assertion: firstNode != null
        firstNode = firstNode.getNextNode();
        if (firstNode == null)
            lastNode = null;
        else
            firstNode.setPreviousNode(null);
        return front;
    }

    @Override
    public T removeBack() { // Removing the back of a deque
        T back = getBack(); // Might throw EmptyQueueException;
        // Assertion: lastNode != null
        lastNode = lastNode.getPreviousNode();
        if (lastNode == null)
            firstNode = null;
        else
            lastNode.setNextNode(null);
        return back;
    }

    @Override
    public T getFront() { // Retrieving the front
        if (isEmpty())
            throw new EmptyQueueException();
        else
            return firstNode.getData();
    }

    @Override
    public T getBack() { // Retrieving the back
        if (isEmpty())
            throw new EmptyQueueException();
        else
            return lastNode.getData();
    }

    @Override
    public boolean isEmpty() { // Check if the queue is emtpy
        return (firstNode == null) && (lastNode == null);
    }

    @Override
    public void clear() { // Clear the queue
        firstNode = null;
        lastNode = null;
    }

    private class DoublyLinkedNode {
        private T data; // Deque entry
        private DoublyLinkedNode next; // Link to next node
        private DoublyLinkedNode previous; // Link to previous node

        public DoublyLinkedNode(DoublyLinkedNode previous, T data, DoublyLinkedNode next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public DoublyLinkedNode getNextNode() {
            return next;
        }

        public void setNextNode(DoublyLinkedNode next) {
            this.next = next;
        }

        public DoublyLinkedNode getPreviousNode() {
            return previous;
        }

        public void setPreviousNode(DoublyLinkedNode previous) {
            this.previous = previous;
        }
    } // end DoublyLinkedNode

} // end CircularDoublyLinkedDeque
