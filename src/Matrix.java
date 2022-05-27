public class Matrix {
    int[][] twoDisArray = {{0, 12, 4}, {7, 14, 5}, {3, 8, 9}, {45, 3, 7}};

    public int[][] getTwoDisArray() {
        return twoDisArray;
    }

    public int getSideMLenght() {
        return twoDisArray.length;
    }

    public int getSideNLenght() {
        return twoDisArray[0].length;
    }

    public int getMatrixElement(int indexM, int indexN) {
        return twoDisArray[indexM][indexN];
    }

    public void setMatrixElement(int value, int indexM, int indexN) {
        twoDisArray[indexM][indexN] = value;
    }

    public int[][] addition(int[][] twoDisArr) {
        int[][] newMatrix = new int[4][3];
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                newMatrix[i][j] = twoDisArray[i][j] + twoDisArr[i][j];
            }
        }

        return newMatrix;
    }

    public int[][] multiplication(int[][] twoDisArr) {
        int[][] newMatrix = new int[4][3];
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                newMatrix[i][j] = twoDisArray[i][j] * twoDisArr[i][j];
            }
        }
        return newMatrix;
    }

    void print(int[][] twoDisArray) {
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                System.out.print(twoDisArray[i][j] + " ");
            }
            System.out.println();
        }
    }


}
