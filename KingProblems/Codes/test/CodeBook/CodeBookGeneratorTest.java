package CodeBook;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CodeBookGeneratorTest {

    @Test
    public void givenAGeneratorMatrixConstructWholeAlphabetOfCodeWords() throws Exception {

        int height = 7;
        int width =4;
    String matrixDefinition = "1 0 0 0\n" +
            "0 1 0 0\n" +
            "0 0 1 0\n" +
            "0 0 0 1\n" +
            "0 1 1 1\n" +
            "1 0 1 1\n" +
            "1 1 0 10";

        int minimumDistance = 3;

        final CodeBookGenerator codeBookGenerator = new CodeBookGenerator(height,width,matrixDefinition);

        assertThat(codeBookGenerator.minimumDistance(),equalTo(minimumDistance));

    }

}
