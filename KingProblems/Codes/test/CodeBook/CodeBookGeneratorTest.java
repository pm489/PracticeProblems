package CodeBook;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CodeBookGeneratorTest {

    @Test
    public void givenAGeneratorMatrixConstructWholeAlphabetOfCodeWords() throws Exception {

    String matrixDefinition = "7 4\n" +
            "1 0 0 0\n" +
            "0 1 0 0\n" +
            "0 0 1 0\n" +
            "0 0 0 1\n" +
            "0 1 1 1\n" +
            "1 0 1 1\n" +
            "1 1 0 10";

        int totalNumberOfPossibleCodes = (int) Math.pow(2,4);

        final CodeBookGenerator codeBookGenerator = new CodeBookGenerator(matrixDefinition);

        assertThat(codeBookGenerator.sizeOfAlphabet(),equalTo(totalNumberOfPossibleCodes));

    }

}
