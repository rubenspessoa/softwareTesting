package Calculator.Test;

import static

/**
 * Created by rubenspessoa on 29/07/16.
 */
public class CalculatorTest {
    Calculator calc;

    @Before
    public void init() {
        calc = new Calculator();
    }

    @Test
    public void simpleSumTest() {
        int ans = calc.sum(5, 5);
        assertEquals(ans, 10);
    }
}