package pattern.structural.decorator.simple01;

/**
 * 滚动条装饰类
 *
 * @author wudih
 * @date 2019/3/28 15:20
 * @since master
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");

    }
}
