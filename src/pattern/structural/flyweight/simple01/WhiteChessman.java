package pattern.structural.flyweight.simple01;

/**
 * 白色棋子享元类
 *
 * @author wudih
 * @date 2019/3/29 11:00
 * @since master
 */
public class WhiteChessman extends Chessman {
    @Override
    String getColor() {
        return "白色";
    }
}
