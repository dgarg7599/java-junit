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

        //Should match the size of list after adding the element
        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void shouldRemoveElementFromList(){
        listManager.addElement(list, 3);
        listManager.addElement(list, 5);

        listManager.removeElement(list, 5);

        //Verify the element is removed or not
        Assertions.assertEquals(1, list.size());
        Assertions.assertFalse(list.contains(5));
    }

    @Test
    public void shouldReturnTheSize(){
        Assertions.assertEquals(0, listManager.getSize(list));
        listManager.addElement(list, 3);
        listManager.addElement(list, 5);

        Assertions.assertEquals(2, listManager.getSize(list));
    }

}
