import com.example.Cat;
import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {
    private LionAlex lionAlex;

    @Before
    public void setUp() throws Exception {
        lionAlex = new LionAlex("Самец", feline);
    }
    @Mock
    Feline feline;

    @Test
    public void testAlexGetFriends() {
        Assert.assertEquals(Map.of("Зебра", "Марти",
                "Бегемотиха", "Глория",
                "Жираф", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void testAlexGetPlaceOfLiving() {
        Assert.assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void testAlexGetKittens() {
        Assert.assertEquals(0, lionAlex.getKittens());
    }
}
