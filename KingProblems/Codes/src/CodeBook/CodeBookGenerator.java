package CodeBook;

import com.sun.javafx.geom.Matrix3f;

import java.math.BigInteger;

public class CodeBookGenerator {

    private final int height;
    private final int width;
    private final Matrix matrixDefinition;

    public CodeBookGenerator(int height, int width, String matrixDefinition) {


        this.height = height;
        this.width = width;
        this.matrixDefinition = Matrix.from(matrixDefinition);
    }

    public int minimumDistance() {
        int currentMinimum = 10000;

        return 0;
    }
}
