
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ChanceTest {

    Chance chanceA;
    Chance chanceB;
    Chance chance;

    @Before
    public void setUp() {
        chanceA = new Chance(0.4f);
        chanceB = new Chance(0.6f);
        chance = new Chance();
    }

    @Test
    public void should_get_not_chance() {
        // given
        // when

        // then
        assertThat(chance.not(chanceA)).isEqualToComparingFieldByField(new Chance(1 - 0.4f));
    }

    @Test
    public void should_get_or_chance() {
        // given
        // when

        // then
        assertThat(chance.and(chanceA, chanceB)).isEqualToComparingFieldByField(new Chance(0.4f * 0.6f));
    }

    @Test
    public void should_get_and_chance() {
        // given
        // when

        // then
        assertThat(chance.or(chanceA, chanceB)).isEqualToComparingFieldByField(new Chance(0.4f + 0.6f - 0.4f * 0.6f));
    }
}
