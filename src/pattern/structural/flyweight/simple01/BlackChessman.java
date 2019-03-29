package pattern.structural.flyweight.simple01;

/**
 * 黑色棋子享元类
 *
 * @author wudih
 * @date 2019/3/29 10:59
 * @since master
 */
public class BlackChessman extends Chessman {
    @Override
    String getColor() {
        return "黑色";
    }
}
