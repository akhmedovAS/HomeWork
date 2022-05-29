/**
 * Класс описывающий матрицу со сторонами m на n
 */
public class Matrix {
    int[][] twoDisArray = {{0, 12, 4}, {7, 14, 5}, {3, 8, 9}, {45, 3, 7}};

    /**
     *
     * @return получить матрицу
     */
    public int[][] getTwoDisArray() {
        return twoDisArray;
    }

    /**
     *
     * @return получить длину стороны m
     */
    public int getSideMLenght() {
        return twoDisArray.length;
    }

    /**
     *
     * @return получить длину стороны n
     */
    public int getSideNLenght() {
        return twoDisArray[0].length;
    }

    /**
     *
     * @param indexM координаты по стороне m
     * @param indexN координаты по стороне n
     * @return получить значение индекса
     */
    public int getMatrixElement(int indexM, int indexN) {
        return twoDisArray[indexM][indexN];
    }

    /**
     *
     * @param value значение, которое хоти установить в индексе
     * @param indexM координаты по стороне m
     * @param indexN координаты по стороне n
     */
    public void setMatrixElement(int value, int indexM, int indexN) {
        twoDisArray[indexM][indexN] = value;
    }

    /**
     *
     * @param twoDisArr вторая матрица
     * @return новая матрица - результат сложения матриц
     */
    public int[][] addition(int[][] twoDisArr) {
        int[][] newMatrix = new int[4][3];
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                newMatrix[i][j] = twoDisArray[i][j] + twoDisArr[i][j];
            }
        }

        return newMatrix;
    }

    /**
     *
     * @param twoDisArr вторая матрица
     * @return новая матрица - результат умножения матриц
     */
    public int[][] multiplication(int[][] twoDisArr) {
        int[][] newMatrix = new int[4][3];
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                newMatrix[i][j] = twoDisArray[i][j] * twoDisArr[i][j];
            }
        }
        return newMatrix;
    }

    /**
     *
     * метод, печатающий значения индексов матрицы
     */
    void print(int[][] twoDisArray) {
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                System.out.print(twoDisArray[i][j] + " ");
            }
            System.out.println();
        }
    }


}
