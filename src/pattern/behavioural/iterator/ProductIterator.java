package pattern.behavioural.iterator;

import java.util.List;

/**
 * @author wudih
 * @date 2019-03-31 17:51
 * @since master
 */
public class ProductIterator<T> implements AbstractIterator {
    private ProductList<T> productList;
    private List<T> products;
    private Integer cursor1;
    private Integer cursor2;

    public ProductIterator(ProductList<T> productList) {
        this.productList = productList;
        this.products = productList.getList();
        this.cursor1 = 0;
        this.cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return cursor1 == products.size();
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public T getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public T getPreviousItem() {
        return products.get(cursor2);
    }
}
