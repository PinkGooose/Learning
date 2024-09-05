package lesson10;

public class Matrix implements IMatrix{

    private double[][] nums;

    public Matrix(int row, int col) {
        nums = new double[row][col];
    }

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки");
            return -1;
        }

        if (colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки");
            return -1;
        }

        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки");
            return;
        }

        if (colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки");
            return;
        }

        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы складывать нельзя! Количество строк не совпадает");
            return null;
        }

        if(this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы складывать нельзя! Количество колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for(int i = 0; i < result.getRows(); i++) {
            for(int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы вычитать нельзя! Количество строк не совпадает");
            return null;
        }

        if(this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы вычитать нельзя! Количество колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for(int i = 0; i < result.getRows(); i++) {
            for(int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if(this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Матрицы нельзя умножить! Количество столбцов из первой матрицы должно быть равно количеству строк из второй матрицы!");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for(int i = 0; i < result.getRows(); i++) {
            for(int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, 0);
                for(int k = 0; k < otherMatrix.getRows(); k++) {
                    result.setValueAt(i, j, result.getValueAt(i, j) + this.getValueAt(i, k) + otherMatrix.getValueAt(k, j));
                }
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {

        for(int i = 0; i < getRows(); i++) {
            for(int j = 0; j < getColumns(); j++) {
                if(j == i) {
                    if(getValueAt(i, i) != 1) {
                        return false;
                    }
                } else if(getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
