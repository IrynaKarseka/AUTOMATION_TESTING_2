import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompositePatternTest {
    @Test
    public void addDeveloper() {
        // given
        Developer firstJavaDeveloper = new JavaDeveloper();
        Team team = new Team();
        team.addDeveloper(firstJavaDeveloper);
        //when
        int result = team.developers.size();
        //then
        Assertions.assertEquals(1, result);
    }
}
