package calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CalculatorTest {
    @DisplayName("두 개의 정수를 더한 결과를 반환할 수 있다.")
    @Test
    void testAdd() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.add(3,6);

        // then
        //assertEquals(9,actual);
        assertThat(actual).isEqualTo(9);
    }

    @DisplayName("두 개의 정수를 뺀 결과를 반환할 수 있다.")
    @Test
    void testSubstract() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.substract(3,6);

        // then
        //assertEquals(-3, actual);
        assertThat(actual).isEqualTo(-3);
    }

    @DisplayName("두 개의 정수를 곱한 결과를 반환할 수 있다.")
    @Test
    void testMultiply() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.multiply(3,6);

        // then
        //assertEquals(18,actual);
        assertThat(actual).isEqualTo(18);
    }

    @DisplayName("두 개의 정수를 나눈 결과를 반환할 수 있다.")
    @Test
    void testDivide() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.divide(3,6);

        // then
        //assertEquals(0,actual);
        assertThat(actual).isEqualTo(0);
    }

    @DisplayName("\"\" => 0")
    @Test
    void testCalStr1() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.calculate_str("");

        // then
        //assertEquals(0,actual);
        assertThat(actual).isEqualTo(0);
    }

    @DisplayName("\"1,2\" => 3")
    @Test
    void testCalStr2() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.calculate_str("1,2");

        // then
        //assertEquals(3,actual);
        assertThat(actual).isEqualTo(3);
    }

    @DisplayName("\"1,2,3\" => 6")
    @Test
    void testCalStr3() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.calculate_str("1,2,3");

        // then
        //assertEquals(6,actual);
        assertThat(actual).isEqualTo(6);
    }

    @DisplayName("\"1,2:3\" => 6")
    @Test
    void testCalStr4() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.calculate_str("1,2:3");

        // then
        //assertEquals(6,actual);
        assertThat(actual).isEqualTo(6);
    }

    @DisplayName("//;\\n1;2;3")
    @Test
    void testCalStr5() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.calculate_str("//;\\n1;2;3");

        // then
        //assertEquals(6,actual);
        assertThat(actual).isEqualTo(6);
    }
}