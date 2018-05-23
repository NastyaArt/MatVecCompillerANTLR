import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Result {
    public static void main(String[] args) {
        try {
            new Result().start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    private void start() throws Exception
{
Matrix a = new Matrix(new int[][]{{1, 1, 1}, {1, 1, 1}});
Matrix b = new Matrix(new int[][]{{1, 0, 1}, {2, 3, 4}});


show();


show();
Vector vect = new Vector();
while(vect.;
length();


add();
}

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

public class Vector {

    public List<Integer> array;

    public Vector()
    {
        array = new ArrayList();
    }

    public Vector(int n)
    {
        array = new ArrayList(n);
    }

    public Vector(List<Integer> arr)
    {
        array = arr;
    }

    public void show()
    {
        for (int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
        System.out.println();
    }

    public int get(int index)
    {
        return array.get(index);
    }

    public int length()
    {
        return array.size();
    }

    public void add(int elem)
    {
        array.add(elem);
    }

    public void remove(int index)
    {
        array.remove(index);
    }

    public Vector plus(Vector vect2)
    {
        if (this.array.size() != vect2.array.size())
            throw new RuntimeException("Check vector size.");
        Vector vect = new Vector(array.size());
        for (int i = 0; i < vect.length(); i++)
            vect.array.set(i, array.get(i) + vect2.array.get(i));
        return vect;
    }

    public Vector minus(Vector vect2)
    {
        if (this.array.size() != vect2.array.size())
            throw new RuntimeException("Check vector size.");
        Vector vect = new Vector(array.size());
        for (int i = 0; i < vect.length(); i++)
            vect.array.set(i, array.get(i) - vect2.array.get(i));
        return vect;
    }

    public int mult(Vector vect2)
    {
        if (this.array.size() != vect2.array.size())
            throw new RuntimeException("Check vector size.");
        int numb = 0;
        for (int i = 0; i < array.size(); i++)
            numb += array.get(i) * vect2.array.get(i);
        return numb;
    }

    public Vector mult(int numb)
    {
        Vector vect = new Vector(array.size());
        for (int i = 0; i < vect.length(); i++)
            vect.array.set(i, array.get(i) * numb);
        return vect;
    }
}

}