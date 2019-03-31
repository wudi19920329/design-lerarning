package pattern.behavioural.iterator;

/**
 * @author wudih
 * @date 2019-03-31 17:51
 * @since master
 */
public interface AbstractIterator<T> {
    void next();

    boolean isLast();

    void previous();

    boolean isFirst();

    T getNextItem();

    T getPreviousItem();
}
