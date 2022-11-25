package org.example.Lesson_21_11.Palindrome;

import java.util.*;


public class PalindromIterator {
    public static void main(String[] args) {
        String s = "worddrow";
        List<Character> list = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverce = list.listIterator(list.size());




        boolean isPalindrome = true;
        while (iterator.hasNext() && reverce.hasPrevious() )
        if (iterator.next() != reverce.previous()) {
            isPalindrome = false;
           break;

        } System.out.println(isPalindrome);
    }
}




