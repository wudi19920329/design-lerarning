package pattern.structural.decorator.simple01;

/**
 * 装饰器类
 *
 * @author wudih
 * @date 2019/3/28 15:18
 * @since master
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
