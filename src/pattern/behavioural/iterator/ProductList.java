package pattern.behavioural.iterator;

import java.util.List;

/**
 * @author wudih
 * @date 2019-03-31 17:52
 * @since master
 */
public class ProductList<T> extends AbstractObjectList {
    public ProductList(List<T> list) {
        super(list);
    }

    @Override
    public AbstractIterator<T> createIterator() {
        return new ProductIterator<T>(this);
    }
}
