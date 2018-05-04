package com.datastructures;

/**
 * 双向链表
 *
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

    /**
     * 获取双向链表长度
     * todo 优化：先判断给定节点的位置，然后选择从头遍历还是从尾遍历
     * @param dll
     * @return
     */
    public int getLength(DoubleLinkedList dll) {
        if (dll == null) {
            return 0;
        }

        if (dll.getPrevious() == null && dll.getPrevious() == null) {
            return 1;
        }

        int length = 0;
        DoubleLinkedList firstLL;
        while (dll != null) {
            dll = dll.getPrevious();
            if (dll.getPrevious() == null) {// 获取头节点，往后遍历
                firstLL = dll;
                while (firstLL.getNext() != null) {// 开始遍历
                    length++;
                    firstLL = firstLL.getNext();
                    if (firstLL.getNext() == null && firstLL.getPrevious() != null) { // 尾节点
                        return length + 1;
                    }
                }
            }
        }

        return length;
    }

}