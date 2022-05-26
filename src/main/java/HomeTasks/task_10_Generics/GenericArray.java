package HomeTasks.task_10_Generics;

public class GenericArray<T> {
    private T[] values;

    /********* CONSTRUCTORS ************/
    @SafeVarargs
    public GenericArray(T... values) {
        this.values = values;
    }

    /********** METHODS ****************/
    public T getValue(int index) {
        return values[index];
    }

    public void setValue(T value, int index) {
        values[index] = value;
    }

    public void printInfo(String ArrName) {
        System.out.print(ArrName + ": ");
        for (T t : values) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public void change(int i1, GenericArray<T> Arr2, int i2) {
        T temp = this.getValue(i1);
        this.setValue(Arr2.getValue(i2), i1);
        Arr2.setValue(temp, i2);

    }
}