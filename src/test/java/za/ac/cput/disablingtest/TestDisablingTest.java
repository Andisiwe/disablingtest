package za.ac.cput.disablingtest;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestDisablingTest extends TestCase {
    public void DISABLED_testDisability() throws Exception{
        DisablingTest dt = new DisablingTest();

        Assert.assertEquals(3, dt.myTest());
    }
}
