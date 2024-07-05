package lab6;

import lab5.*;

public class AnimalLinkedList {
    private class Node {
        Animal element;
        Node prev;
        Node next;

        Node(Animal element, Node next, Node prev) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    private int size;
    private Node header;
    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.prev = header;
        header.next = header;
        size = 0;
    }

 
    private void add(Animal animal, Node node) 
    { 
    	Node newNode = new Node(animal, node, node.prev);
    	newNode.prev.next = newNode; 
    	newNode.next.prev = newNode; 
    	size++; 
    }

    public void add(Animal animal) {
        add(animal, header);
    }

    private Node findNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current;
        if (index < (size / 2)) {
            current = header.next;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = header;
            for (int i = size; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    public Animal get(int index) {
        return findNodeByIndex(index).element;
    }
    public void addAll(AnimalArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            add(arrayList.get(i), header);
        }
    }


    public void set(int index, Animal element) {
    	if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node currentNode = findNodeByIndex(index);
        Node newNode = new Node(element, currentNode.next, currentNode.prev);
        if (currentNode.prev != null) {
            currentNode.prev.next = newNode;
        }
        if (currentNode.next != null) {
            currentNode.next.prev = newNode;
        }

        if (currentNode == header.next) {
            header.next = newNode;
        }

        if (currentNode == header.prev) {
            header.prev = newNode;
        }

        currentNode.prev = null;
        currentNode.next = null;
    }

   
    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

  
    public void clear() {
        header.next = header.prev = header;
        size = 0;
    }


    public String toString() {
    	if (isEmpty()) {
            return "AnimalLinkedList is empty";
        }
    	String s = "[";
        Node current = header.next;
        while (current != header) {
            s += current.element;
            current = current.next;
            if (current != header) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

}

