package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetCollectionTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    public void test1() {
        assertThat(numbers.size()).isEqualTo(3);
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void test2(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"1,true", "4,false", "5,false"})
    public void test3(int number, boolean expectedResult) {
        boolean actualResult = numbers.contains(number);
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
