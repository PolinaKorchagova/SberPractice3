interface ArrayList {
}
public class arrayList implements List{
    int size;
    int capacity = 10;
    Object[] arr = new Object[size];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object item) {
        boolean isMatch = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                isMatch = true;
            }
        }
        return isMatch;
    }

    @Override
    public boolean add(Object item) {
        if (size >= capacity){
            capacity = (capacity*3)/2 + 1;

            Object[] newArr = new Object[capacity];

            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[size] = item;
        size++;
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
    }

    @Override
    public void add(int index, Object item) {
        if (size >= capacity){
            capacity = (capacity*3)/2 + 1;

            Object[] newArr = new Object[capacity];

            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[index] = item;
        size++;
        Object y;
        for(int i = index + 1; i < size - 1; i++){
            y = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = y;
        }
    }

    @Override
    public void set(int index, Object item) {
        if (index == size){
            add(item);
        } else {
            arr[index] = item;
        }
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException{
        if ((!isEmpty())&(arr[index] != null)){
            return arr[index];
        }
        return null;
    }

    @Override
    public int indexOf(Object item) {
        int j = -1;
        boolean isFirst = false;
        for (int i = 0; i < size; i++){
            if ((arr[i] == item)&(isFirst == false)){
                j = i;
                isFirst = true;
            }
        }
        return j;
    }

    @Override
    public int lastIndexOf(Object item) {
        int j = -1;
        for (int i = 0; i < size; i++){
            if (arr[i] == item){
                j = i;
            }
        }
        return j;
    }

    public List subList(int from, int to) throws IndexOutOfBoundsException{
        if (size <= capacity){
            Object[] newArr = new Object[to-from];

            for(int i = from; i < to; i++){
                newArr[i] = arr[i];
            }
            return newArr;
        }
        return null;
    }
}