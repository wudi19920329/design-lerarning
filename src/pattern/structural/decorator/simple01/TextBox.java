package pattern.structural.decorator.simple01;

/**
 * 文本框类：具体构件类
 *
 * @author wudih
 * @date 2019/3/28 15:17
 * @since master
 */
public class TextBox extends Component {
    @Override
    void display() {
        System.out.println("显示文本框");
    }
}
