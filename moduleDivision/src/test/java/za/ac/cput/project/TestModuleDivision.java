package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestModuleDivision extends TestCase {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testModuleDivision() throws Exception {

        ModuleDivision md = new ModuleDivision();
        int answer = md.div(20,10);
        Assert.assertEquals(answer,2);
        double answer1 = md.div(20.00,10.00);
        Assert.assertEquals(answer1,2.00,2);
        float answer2 = md.div(20.00f,10.00f);
        Assert.assertEquals(answer2,2.00,4);

    }

    @After
    public void tearDown() throws Exception {


    }
}
