import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class FelineTests {

    private Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens(){
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithNumbers(){
        Assert.assertEquals(5, feline.getKittens(5));
    }
}
