package operations;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
    
    Addition a;
    
    public AdditionTest() {}
    
    @Before
    public void setUp() {
        a = new Addition();
    }
    
    @Test
    public void testExe() {
        Assert.assertEquals(3, a.exe(2,1));
    }
}
