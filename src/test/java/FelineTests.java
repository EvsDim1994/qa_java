import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    Feline feline;

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

    @Test(expected = Exception.class)
    public void testFelineThrowsException() throws Exception {
        Mockito.when(feline.eatMeat()).thenThrow(new Exception());
        feline.eatMeat();
    }

}
