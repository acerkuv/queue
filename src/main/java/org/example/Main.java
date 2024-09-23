package org.example;

import java.util.*;

import static java.lang.System.*;

public class Main {
    static List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    public static void main(String[] args) {

        out.println("Числовой массив " + list);
        out.println("Очередь " + myQueue(list));
        out.println("Стек " +myDeque(list));
    }
    private static List<Integer> myQueue(List<Integer> t){
            Deque<Integer> deque = new ArrayDeque<>();
            List<Integer> myTempList = new ArrayList<>();
            for (int i: t) deque.add(i);
            while (!deque.isEmpty()){
                myTempList.add(deque.remove());            }

    return myTempList;
    }
    //Stack
    private static List<Integer> myDeque(List<Integer> t){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        List<Integer> myTempList2 = new ArrayList<>();
        for (int i: t) deque.add(i);
        while (!deque.isEmpty()){
            myTempList2.add(deque.pollLast());
        }
        return myTempList2;
    }
}