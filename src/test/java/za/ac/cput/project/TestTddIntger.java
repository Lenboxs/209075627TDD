package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestTddIntger extends TestCase {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testInteger() throws Exception
    {
        TddTest i = new TddTest();
        i.setIntegers(10);
        Assert.assertEquals(10,i.getIntegers());

    }

    @After
    public void tearDown() throws Exception {


    }
}
