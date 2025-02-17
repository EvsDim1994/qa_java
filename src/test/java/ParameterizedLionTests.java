import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)
public class ParameterizedLionTests {
    public final String sex;
    public final Boolean expectedHasMane;
    public final int expectedKittens;
    public final List<String> expectedFood;

    public ParameterizedLionTests(String sex, Boolean expectedHasMane, int expectedKittens, List<String> expectedFood) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
        this.expectedKittens = expectedKittens;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {"Самец", true, 2, List.of("Мясо", "Рыба")},
                {"Самка", false, 3, List.of("Мясо", "Рыба")}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLionBehavior() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(expectedKittens);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion(sex, feline);

        // Проверяем наличие гривы
        Assert.assertEquals(expectedHasMane, lion.doesHaveMane());

        // Проверяем количество котят
        Assert.assertEquals(expectedKittens, lion.getKittens());

        // Проверяем еду
        Assert.assertEquals(expectedFood, lion.getFood());
    }
}