package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestTddTruth extends TestCase{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testTruth() throws Exception
    {
        TddTest i = new TddTest();
        i.setIntegers(10);
        TddTest i1 = new TddTest();
        i1.setIntegers(9);
        Assert.assertTrue(i.getIntegers() > i1.getIntegers());

    }

    @After
    public void tearDown() throws Exception {


    }
}
