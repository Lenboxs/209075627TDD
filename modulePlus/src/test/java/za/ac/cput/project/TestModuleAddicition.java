package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestModuleAddicition extends TestCase{

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testModuleAddicition() throws Exception {

        ModuleAddicition ma = new ModuleAddicition();
        int answer = ma.add(20, 10);
        Assert.assertEquals(answer, 30);
        double answer1 = ma.add(20.00, 10.00);
        Assert.assertEquals(answer1,30.00,2);
        float answer2 = ma.add(20.00f, 10.00f);
        Assert.assertEquals(answer2,30.00,4);

    }

    @After
    public void tearDown() throws Exception {


    }
}
