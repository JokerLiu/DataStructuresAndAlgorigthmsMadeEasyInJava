package com.runtest;

import com.datastructures.CircularLinkedList;
import com.datastructures.DoubleLinkedList;
import com.datastructures.SingleLinkedList;

/**
 * 数据结构测试类
 *
 * @package com.runtest
 * @auther joker
 * @date 2018/5/4 10:43
 */
public class RunDSTest {
    public static void main(String[] args) {
        CircularLinkedList cll1 = new CircularLinkedList();
        CircularLinkedList cll2 = new CircularLinkedList();
        CircularLinkedList cll3 = new CircularLinkedList();
        CircularLinkedList cll4 = new CircularLinkedList();

        cll1.setNext(cll4);
        cll2.setNext(cll3);
        cll3.setNext(cll4);
        cll4.setNext(cll1);

        System.out.println(cll1.getCLLLength(cll1));

        DoubleLinkedList dll1 = new DoubleLinkedList();
        DoubleLinkedList dll2 = new DoubleLinkedList();
        DoubleLinkedList dll3 = new DoubleLinkedList();
        DoubleLinkedList dll4 = new DoubleLinkedList();

        dll1.setNext(dll2);
        dll2.setPrevious(dll1);
        dll2.setNext(dll3);
        dll3.setPrevious(dll2);
        dll3.setNext(dll4);
        dll4.setPrevious(dll3);

        System.out.println(new DoubleLinkedList().getLength(dll2));

        SingleLinkedList l1 = new SingleLinkedList();
        SingleLinkedList ll = new SingleLinkedList();
        ll.setNext(l1);
        System.out.println(SingleLinkedList.listLength(ll));
//        remove(l1, 2);
    }
}
