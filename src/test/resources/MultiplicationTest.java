package operations;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {
    
    Multiplication m;
    
    public MultiplicationTest() {}
    
    @Before
    public void setUp() {
        m = new Multiplication();
    }
    
    @Test
    public void testExe() {
        Assert.assertEquals(20, m.exe(4,5));
    }
}
