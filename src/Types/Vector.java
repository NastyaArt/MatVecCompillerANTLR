package Types;

import java.util.ArrayList;
import java.util.List;

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

    public void print()
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
