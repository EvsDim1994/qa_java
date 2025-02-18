import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void testCatGetSound(){
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testCatGetFood() throws Exception {
        List<String> food = List.of("Мясо", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(food);
        Assert.assertEquals(food, cat.getFood());
    }

    @Test(expected = Exception.class)
    public void testCatThrowsException() throws Exception {
        Mockito.when(feline.eatMeat()).thenThrow(new Exception());
        cat.getFood();
    }
}
