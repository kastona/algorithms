package com.kastona;

import java.util.Arrays;
import java.util.stream.Stream;

public class LinkedList<T> {


    private Node head;
    private int length = 0;



    private class Node {
        Node next;
        T data;


        public Node(T data) {
            this.data = data;
        }


    }

    public LinkedList(T ...items) {
        var currentNode = new Node(items[0]);

        head = currentNode;

        for(int i = 1; i< items.length; i++) {
            currentNode.next = new Node(items[i]);

            currentNode = currentNode.next;
        }

        length = items.length;

    }


    public void insertAtFront(T data) {
        Node current = head;
        head = new Node(data);
        head.next = current;
        length++;
    }

    public Node removeAtFront() {
        Node removed = head;

        head = removed.next;
        length--;
        return removed;
    }

    public void insertAtBack(T data) {

        if(head == null) {
            head = new Node(data);
        }

        var lastNode = head;


        while(lastNode.next !=null) {
            lastNode = lastNode.next;
        }

        lastNode.next = new Node(data);

        length++;
    }

    public Node removeAtBack() {
        if(head == null) {
            return null;
        }

        if(head.next == null) {
            var temp = head;
            head = null;

            return temp;
        }

        var lastNode = head;
        var previousNode = head;

        while(lastNode.next != null) {
            previousNode = lastNode;
            lastNode = lastNode.next;
        }

        previousNode.next = null;
        length--;
        return lastNode;

    }

    public Node removeAt(int position) {
        if(head == null) {
            return null;
        }


        if(position == 0) {
            return removeAtFront();
        }
        var currentNode = head;
        Node previousNode;
        int p = 0;



        while(currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;

            p++;

            if(p == position) {
                previousNode.next = currentNode.next;

                return currentNode;
            }
        }

        return null;
    }

    public Node findFromEnd(int position) {

        var currentNode = head;
        Node previousNode;
        int length = 0;

        if(head == null) {
            return null;
        }




        while(currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            length++;
        }

        //currentNode is now the tail


        return this.get(length-position);

        

    }

    private Node get(int i) {
        return null;
    }


}
