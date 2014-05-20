package CodeBook;

import org.junit.Test;

import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void canCreateAMatrixFromStringForm() {
        Matrix test = Matrix.from("1 2 3");

        assertThat(test.valueAt(0, 0), equalTo(1));
        assertThat(test.valueAt(0, 1), equalTo(2));
        assertThat(test.valueAt(0, 2), equalTo(3));

        Matrix bigger = Matrix.from("1 2 3 \n 4 5 6");
        assertThat(bigger.valueAt(0,1),equalTo(1));
        assertThat(bigger.valueAt(1,2),equalTo(2));
        assertThat(bigger.valueAt(2,3),equalTo(3));
        assertThat(bigger.valueAt(1,1),equalTo(4));
        assertThat(bigger.valueAt(1,2),equalTo(5));
        assertThat(bigger.valueAt(1,3),equalTo(6));
    }

    @Test (expected =  NumberFormatException.class)
    public void canThrowExceptionWhenMatrixIsMalformed() {

        Matrix.from("1 2 3 \n 1 2");

    }

    @Test
    public void canPerformMatrixAndColumnVectorMultiplication() {
        fail();
    }
}
