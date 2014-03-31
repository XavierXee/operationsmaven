package operations;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
 
public class DivisionTest {
    
    Division d;
    
    public DivisionTest() {}
    
    @Before
    public void setUp() {
        d = new Division();
    }
    
    @Test
    public void exe() throws BananeException {
        Assert.assertEquals(4, d.exe(6,3));
    }
    
    @Test
    public void exeByZeroGoodExpection() throws BananeException {
        Boolean check = false;
        try {
            d.exe(1,0);
        } catch(BananeException e) { 
            check = true;
            Assert.assertEquals("Caprice du client", e.getMessage());
        }
        Assert.assertTrue(check);
    }
}
