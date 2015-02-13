package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestTddNull extends TestCase{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testNull() throws Exception {
        TddTest n = new TddTest();
        Assert.assertNull(n.getEquality());

    }

    @After
    public void tearDown() throws Exception {


    }
}
