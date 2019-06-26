package com.github.wjingxian;

import com.github.wjingxian.Chance;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ChanceTest {

    Chance chanceA;
    Chance chanceB;

    @Before
    public void setUp() {
        chanceA = new Chance(0.4f);
        chanceB = new Chance(0.6f);
    }

    @Test
    public void should_get_not_chance() {
        // given
        // when

        // then
        assertThat(chanceA.not()).isEqualToComparingFieldByField(new Chance(1 - 0.4f));
    }

    @Test
    public void should_get_or_chance() {
        // given
        // when

        // then
        assertThat(chanceA.and(chanceB)).isEqualToComparingFieldByField(new Chance(0.4f * 0.6f));
    }

    @Test
    public void should_get_and_chance() {
        // given
        // when

        // then
        assertThat(chanceA.or(chanceB)).isEqualToComparingFieldByField(new Chance(0.4f + 0.6f - 0.4f * 0.6f));
    }
}
