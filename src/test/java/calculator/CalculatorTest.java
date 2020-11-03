package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"4 + 4,8", "2 - 20, -18", "4 * 2,8", "3 / 1,3"})
    public void four_point_operation_test(String input, String output) {
        assertThat(calculator.calculate(input)).isEqualTo(output);
    }

    @ParameterizedTest
    @CsvSource({"2 + 1 - 10 * 2 / 7, -2"})
    public void all_four_point_operation_test(String input, String output) {
        assertThat(calculator.calculate(input)).isEqualTo(output);
    }


    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void should_throw_IllegalArgumentException_when_input_is_blank(String input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> calculator.calculate(input))
                .withMessage("input string is blank");
    }

    @Test
    public void should_throw_IllegalArgumentException_when_input_is_null() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> calculator.calculate(null))
                .withMessage("input string is null");
    }

    @ParameterizedTest
    @ValueSource(strings = {"2 ^ 5", "1 & 2", "2 ! 3", "3 # 4", "4 $ 6", "5 % 3"})
    public void should_throw_IllegalArgumentException_when_input_is_not_symbol_four_point_operation(String input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> calculator.calculate(input))
                .withMessage("input is not symbol of four-point operation or Number");
    }
}
