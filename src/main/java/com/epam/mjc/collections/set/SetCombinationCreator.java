package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> tmp = new HashSet<>(firstSet);

        tmp.retainAll(secondSet);
        for (String s : tmp) {
            if (!thirdSet.contains(s)) {
                hashSet.add(s);
            }
        }

        firstSet.addAll(secondSet);

        for (String s : thirdSet) {
            if (!firstSet.contains(s)) {
                hashSet.add(s);
            }
        }
        return hashSet;
    }
}
