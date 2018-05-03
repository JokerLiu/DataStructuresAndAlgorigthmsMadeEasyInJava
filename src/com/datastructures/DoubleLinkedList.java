package com.datastructures;

/**
 * @package com.datastructures
 * @auther joker
 * @date 2018/5/3 10:28
 */
public class DoubleLinkedList {
    private int data;
    private DoubleLinkedList next;// 下一个节点
    private DoubleLinkedList previous;// 上一个节点

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLinkedList getNext() {
        return next;
    }

    public void setNext(DoubleLinkedList next) {
        this.next = next;
    }

    public DoubleLinkedList getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedList previous) {
        this.previous = previous;
    }
}
