public class MainMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        matrix.addition(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}});
        System.out.println(matrix.getSideMLenght());
    }

}
