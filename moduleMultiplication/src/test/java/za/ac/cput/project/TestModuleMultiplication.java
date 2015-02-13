package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestModuleMultiplication extends TestCase{

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testModuleMultiplication() throws Exception {

        ModuleMultiplication mm = new ModuleMultiplication();
        int answer = mm.mul(20, 10);
        Assert.assertEquals(answer, 200);
        double answer1 = mm.mul(20.00, 10.00);
        Assert.assertEquals(answer1,200.00,2);
        float answer2 = mm.mul(20.00f, 10.00f);
        Assert.assertEquals(answer2,200.00,4);

    }

    @After
    public void tearDown() throws Exception {


    }
}
