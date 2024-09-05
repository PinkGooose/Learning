package lesson10;

public class Main {
    public static void main(String[] args) {

        double[][] forA = {{1, 0, 0},
                           {0, 1, 0},
                           {0, 0, 1}};

        double[][] forB = {{3, 3, 3},
                           {3, 5, 3},
                           {3, 3, 3}};

        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);

        System.out.println(a.isIdentityMatrix());
        System.out.println(b.isIdentityMatrix());
    }
}
