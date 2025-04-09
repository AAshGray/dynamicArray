public class DynamicStringList implements StringList {

    private int size = 0;
    private int capacity = 10;
    private String[] array = new String[capacity];


    @Override
    public String get(int index) {
        IndexOutOfBoundsCheck(index);

        return array[index];
    }

    @Override
    public void set(int index, String value) {
        IndexOutOfBoundsCheck(index);

        array[index] = value;
    }

    @Override
    public void add(String value) {
        if (size == capacity) {
            capacity = capacity * 2;
            String[] newArray = new String[capacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = value;
        size++;
    }

    @Override
    public String remove(int index) {
        IndexOutOfBoundsCheck(index);
        String removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = "";
        size--;
        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }
    
    private void IndexOutOfBoundsCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    // added for testing purposes
    // Would have used StringBuilder but wasn't sure if this would count against 'premade methods'
    @Override
    public String toString() {
        String string = "";

        for (int i = 0; i < size; i++) {
            string += array[i];
            if (i < size - 1) {
                string += ", ";
            }
        }

        return string;
    }
}
