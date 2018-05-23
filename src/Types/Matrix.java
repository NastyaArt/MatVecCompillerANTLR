package Types;

public class Matrix {

    public int rows;
    public int columns;
    public int[][] array;

    public Matrix()
    {
        rows = 0;
        columns = 0;
        array = null;
    }

    public Matrix(int r, int c)
    {
        rows = r;
        columns = c;
        array = new int[r][c];
    }

    public Matrix(int[][] arr){
        rows = arr.length;
        columns = arr[0].length;
        array = arr;
    }

    public void show()
    {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    public int get(int r, int c)
    {
        return array[r][c];
    }

    public int length()
    {
        return rows * columns;
    }

    public Matrix plus(Matrix matr2)
    {
        if (this.rows != matr2.rows || this.columns != matr2.columns)
                throw new RuntimeException("Check matrix size.");
        Matrix matr = new Matrix(rows,columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                matr.array[i][j] = this.array[i][j] + matr2.array[i][j];
        return matr;
    }

    public Matrix minus(Matrix matr2)
    {
        if (this.rows != matr2.rows || this.columns != matr2.columns)
            throw new RuntimeException("Check matrix size.");
        Matrix matr = new Matrix(rows,columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                matr.array[i][j] = this.array[i][j] - matr2.array[i][j];
        return matr;
    }

    public Matrix mult(Matrix matr2)
    {
        if (this.columns != matr2.rows)
            throw new RuntimeException("Check matrix size.");
        Matrix matr = new Matrix(this.rows,matr2.columns);
        for (int i = 0; i < matr.rows; i++)
            for (int j = 0; j < matr.columns; j++)
                for (int k = 0; k < this.columns; k++)
                    matr.array[i][j] += this.array[i][k] * matr2.array[k][j];
        return matr;
    }

    public Matrix mult(int numb)
    {
        Matrix matr = new Matrix(this.rows,this.columns);
        for (int i = 0; i < matr.rows; i++)
            for (int j = 0; j < matr.columns; j++)
                matr.array[i][j] = this.array[i][j] * numb;
        return matr;
    }

    public Matrix(Matrix m) { this(m.array.clone()); }
}
