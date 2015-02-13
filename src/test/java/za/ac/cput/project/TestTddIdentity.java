package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestTddIdentity extends TestCase{

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testIdentity() throws Exception {
        TddTest s = new TddTest();
        s.setEquality("len");
        TddTest s1 = new TddTest();
        s1 = s;
        Assert.assertEquals(s, s1);

    }

    @After
    public void tearDown() throws Exception {


    }
}
