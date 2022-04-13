public interface List extends Collection {

    boolean contains(Object item);

    default void add(int index, Object item) {
        Object[] a;
        a[index] = item;
        for(int i = index + 1; i <= size() + 1; i ++){
            a[i] = a[i+1];
        }
    }
    void add(int index, Object item);

    default void set(int index, Object item){
        Object[] a;
        a[index] = item;
    }
    void set(int index, Object item);

    default Object get(int index) throws IndexOutOfBoundsException{
        if ((isEmpty() == false)&(a[index] != null)){
            return a[index];
        }
        return null;
    }
    Object get(int index);

    default int indexOf(Object item){
        int j = -1;
        boolean isFirst = false;
        for (int i = 0; i <= size(); i++){
            boolean a;
            if ((a[i] == item)&(isFirst == false)){
                j = i;
                isFirst = true;
            }
        }
        return j;
    }
    int indexOf(Object item);

    default int lastIndexOf(Object item){
        int j = -1;
        for (int i = 0; i <= size(); i++){
            boolean a;
            if (a[i] == item){
                j = i;
            }
        }
        return j;
    }
    int lastIndexOf(Object item);

    default Object remove(int index) throws IndexOutOfBoundsException{
        Object copyA;
        Object[] a = new Object[0];
        if (a[index] != null){
            copyA = a[index];
            a[index] = null;
            return copyA;
        }
        return null;
    }

    default List subList(int from, int to) throws IndexOutOfBoundsException{
        return null;
    };
}