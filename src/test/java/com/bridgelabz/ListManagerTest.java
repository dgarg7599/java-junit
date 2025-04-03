package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void shouldAddElementToList(){

        listManager.addElement(list, 3);
        listManager.addElement(list, 2);

        Assertions.assertTrue(list.contains(3));
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void shouldRemoveElementFromList(){
        listManager.removeElement(list, 2);


    }

    @Test
    public void shouldReturnTheSize(){

    }

}
