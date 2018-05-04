package com.datastructures;

/**
 * 循环链表
 *
 * @package com.datastructures
 * @auther joker
 * @date 2018/5/4 10:18
 */
public class CircularLinkedList {
    private int length;
    private CircularLinkedList next;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public CircularLinkedList getNext() {
        return next;
    }

    public void setNext(CircularLinkedList next) {
        this.next = next;
    }

    public int getCLLLength(CircularLinkedList cll) {
        int length = 0;
        CircularLinkedList currentNode = cll;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
            if (cll == currentNode) {// 判断当前节点是否遍历到头节点
//                return length;
                break;
            }
        }
        return length;
    }

}