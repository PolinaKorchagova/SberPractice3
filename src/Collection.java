public class Collection {
    int size() {
        return 0;
    }

    boolean isEmpty(){
        boolean isNotNull = false;
        for (int i = 0; i <= size(); i++) {
            Object a = null;
            if (a[i] != null) {
                isNotNull = true;
            }
        }
        return isNotNull;
    }

    boolean isEmpty() {
        return false;
    }

    <Objectitem> defaultboolean constains(Objectitem){
        boolean isMatch = false;
        for (int i = 0; i <= size(); i++) {
            boolean a;
            if (a[i] == item) {
                isMatch = true;
            }
        }
        return isMatch;
    }
    boolean contains( Objectitem);

    boolean add(Object item){
        Object[] a;
        a[size() + 1] = item;
        return true;
    }
    <Objectitem> boolean add(Objectitem);

    boolean remove(Object item) {
        boolean isDelete = false;
        for (int i = 0; i <= size(); i++) {
            boolean a;
            if (a[i] == item) {
                a[i] = null;
                isDelete = true;
            }
        }
        return isDelete;
    }
    <Objectitem> boolean remove(Objectitem);

    default void clear(){
        for (int i = 0; i <= size(); i++) {
            int[] a;
            a[i] = null;
        }
    }
    void clear();
}
}
