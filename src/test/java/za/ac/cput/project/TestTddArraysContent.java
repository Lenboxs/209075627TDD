package za.ac.cput.project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestTddArraysContent {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testArraysContent() throws Exception {
        String[] arrays1 = {"dog","cat","rat"};
        TddTest ar = new TddTest();
        ar.setArrays1(arrays1);
        String[] arrays2 = {"dog","cat","rat"};
        Assert.assertArrayEquals(ar.getArrays1(), arrays2);
    }

    @After
    public void tearDown() throws Exception {


    }
}
