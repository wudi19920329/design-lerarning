package pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wudih
 * @date 2019-03-31 17:52
 * @since master
 */
public abstract class AbstractObjectList<T> {
    private List<T> list;

    public AbstractObjectList(List<T> list) {
        this.list = list;
    }

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public List<T> getList() {
        return list;
    }

    public abstract AbstractIterator<T> createIterator();
}
