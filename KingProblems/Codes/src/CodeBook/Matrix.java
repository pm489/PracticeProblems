package CodeBook;

import java.lang.reflect.Array;

public class Matrix {

    private Integer[][] matrixArray;

    private Matrix(Integer[][] matrixArray) {
        this.matrixArray = matrixArray;
    }

    public static Matrix from(String matrixDefinition) {
        String[] rows = matrixDefinition.split("\n");
        int height = rows.length;
        int width = rows[0].split(" ").length;
        Integer[][] tmp = new Integer[height][width] ;

        for (int i = 0; i < rows.length; i++) {
            String[] row = rows[i].split(" ");
            for (int j = 0; j < row.length; j++) {

                Integer value = Integer.valueOf(row[j]);
                tmp[i][j] = value;
            }
        }
        return new Matrix(tmp);
    }

    public Integer valueAt(int xCoordinate, int yCoordinate) {
        return matrixArray[xCoordinate][yCoordinate];
    }
}
