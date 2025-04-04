package com.bridgelabz;

import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
        // Integer.valueOf to avoid removing by index
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }
}
