package com.datastructures;

/**
 * 单链表
 *
 * @package com.datastructures
 * @auther joker
 * @date 2018/4/26 19:11
 */
public class SingleLinkedList {
    private int data;
    private SingleLinkedList next;

    public SingleLinkedList() {
    }

    public SingleLinkedList(int data) {
        this.data = data;
    }

    private int getData() {
        return data;
    }

    private void setData(int data) {
        this.data = data;
    }

    private SingleLinkedList getNext() {
        return next;
    }

    private void setNext(SingleLinkedList next) {
        this.next = next;
    }

    /**
     * 统计链表长度
     *
     * @param ll
     * @return
     */
    static int listLength(SingleLinkedList ll) {
        int length = 0;
        SingleLinkedList currentNode = ll;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    /**
     * 插入元素
     *
     * @param headNode     要插入的链表节点
     * @param nodeToInsert 插入的链表对象
     * @param position     插入的位置
     * @return
     */
    static SingleLinkedList add(SingleLinkedList headNode, SingleLinkedList nodeToInsert, int position) {
        if (headNode == null)//插入目标链表为空
            return nodeToInsert;
        int size = listLength(headNode);//获取目标链表对象的长度
        if (position > size + 1 || position < 1) {
            System.out.println("位置不存在，这个校验输入，合法为位置为：" + (size + 1));
            return headNode;
        }
        if (position == 1) {// 在链表开始位置插入
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        } else {// 在链表中间或末尾位置插入
            SingleLinkedList preNode = headNode;
            int count = 1;
            while (count < position - 1) {
                preNode = preNode.getNext();
                count++;
            }
            SingleLinkedList currentNode = preNode.getNext();
            nodeToInsert.setNext(currentNode);
            preNode.setNext(nodeToInsert);
        }

        return headNode;
    }

    /**
     * 删除指定元素
     *
     * @param headNode 头元素
     * @param position 指定位置
     * @return
     */
    static SingleLinkedList remove(SingleLinkedList headNode, int position) {
        int size = listLength(headNode);//获取目标链表对象的长度
        if (position > size + 1 || position < 1) {
            System.out.println("位置不存在，这个校验输入，合法为位置为：" + (size + 1));
            return headNode;
        }
        if (position == 1) {//
            SingleLinkedList currentNode = headNode.getNext();
            headNode = null;
            return currentNode;

        } else {// 在链表中间或末尾位置删除
            SingleLinkedList preNode = headNode;
            int count = 1;
            while (count < position) {
                preNode = preNode.getNext();
                count++;
            }
            SingleLinkedList currentNode = preNode.getNext();
            preNode.setNext(currentNode.getNext());
            currentNode = null;
        }

        return headNode;
    }

    public static void main(String[] args) {
        SingleLinkedList l1 = new SingleLinkedList();
        SingleLinkedList ll = new SingleLinkedList();
        ll.setNext(l1);
        System.out.println(listLength(ll));
//        remove(l1, 2);
    }
}
