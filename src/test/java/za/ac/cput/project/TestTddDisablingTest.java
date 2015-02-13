package za.ac.cput.project;

import org.junit.*;

/**
 * Created by student on 2015/02/13.
 */
public class TestTddDisablingTest {

    @Before
    public void setUp() throws Exception {


    }
    @Ignore
    @Test
    public void testDisablingTest() throws Exception {

        TddTest i = new TddTest();
        i.setIntegers(10);
        TddTest i1 = new TddTest();
        i1.setIntegers(9);
        Assert.assertFalse(i.getIntegers() < i1.getIntegers());

    }

    @Test
    public void testDisablingTest2() throws Exception {

        TddTest i = new TddTest();
        i.setIntegers(111);
        TddTest i1 = new TddTest();
        i1.setIntegers(110);
        Assert.assertFalse(i.getIntegers() < i1.getIntegers());
        System.out.println("disabling the test2");
    }
    @After
    public void tearDown() throws Exception {


    }
}
