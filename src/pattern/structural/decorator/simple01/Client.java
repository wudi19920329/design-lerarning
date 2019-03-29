package pattern.structural.decorator.simple01;

import java.util.Objects;

/**
 * 客户端类
 *
 * @author wudih
 * @date 2019/3/28 15:21
 * @since master
 */
public class Client {

    public static void main(String[] args) {
        Component window = new Window();
        Component componentDecorator = new ScrollBarDecorator(window);
        componentDecorator.display();
    }

}
