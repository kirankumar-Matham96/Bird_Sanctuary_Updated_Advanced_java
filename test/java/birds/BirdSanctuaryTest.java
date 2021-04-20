package birds;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BirdSanctuaryTest {
    @Test
    public void givenBirdObject_addToSet_returnTrue() {
        BirdSanctuary sanctuary = BirdSanctuary.getInstance();
        Bird duck = new Duck();
        Assert.assertTrue(sanctuary.addBird(duck));
        Assert.assertEquals(1,duck.getCount());
    }
    
    @Test
    public void givenBirdObjectNull_addTest_returnFalse() {
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(BirdSanctuaryAddException.class);
        BirdSanctuary sanctuary = BirdSanctuary.getInstance();
        sanctuary.addBird(null);
    }
}
