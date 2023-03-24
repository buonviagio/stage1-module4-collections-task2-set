package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        int element;
        for (Integer i : sourceList) {
            element = i;
            if (i % 2 == 0) {
                while (element % 2 == 0) {
                    hashSet.add(element);
                    element /= 2;
                }
                hashSet.add(element);
            }
            if (i % 2 != 0) {
                hashSet.add(i);
                hashSet.add(i * 2);
            }
        }
        return hashSet;
    }
}
