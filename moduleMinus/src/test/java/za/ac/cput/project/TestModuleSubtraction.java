package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestModuleSubtraction extends TestCase{

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testModuleSubtraction() throws Exception {

        ModuleSubtraction ms = new ModuleSubtraction();
        int answer = ms.sub(20, 10);
        Assert.assertEquals(answer, 10);
        double answer1 = ms.sub(20.00, 10.00);
        Assert.assertEquals(answer1, 10.00, 2);
        float answer2 = ms.sub(20.0000f, 10.0000f);
        Assert.assertEquals(answer2, 10.0000, 4);
    }

    @After
    public void tearDown() throws Exception {


    }
}
