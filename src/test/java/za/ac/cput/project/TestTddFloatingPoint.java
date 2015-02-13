package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestTddFloatingPoint extends TestCase{

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testFloatingPoint() throws Exception
    {
        TddTest fp = new TddTest();
        fp.setFloatingPoint((float)10.1234);
        Assert.assertEquals(10.1234,fp.getFloatingPoint(),4);
    }

    @After
    public void tearDown() throws Exception {


    }
}
