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
        
    }

    @Override
    public String remove(int index) {
        IndexOutOfBoundsCheck(index);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
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
}
