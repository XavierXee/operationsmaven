package operations;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class SoustractionTest {
    
    Soustraction s;
    
    public SoustractionTest() {}
    
    @Before
    public void setUp() {
        s = new Soustraction();
    }
    
    @Test
    public void testExe() {
        Assert.assertEquals(3, s.exe(5,2));
    }
}
