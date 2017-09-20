package org.baeldung.java.rawtypes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RawTypesTest {
    @Test
    public void shouldCreateListUsingRawTypes() {
        @SuppressWarnings("rawtypes")
        List myList = new ArrayList();
        myList.add(new Object());
        myList.add("2");
        myList.add(new Integer(1));
    }
}