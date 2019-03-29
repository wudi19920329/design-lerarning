package pattern.structural.flyweight.simple01;

/**
 * 抽象享元棋子类
 *
 * @author wudih
 * @date 2019/3/29 10:58
 * @since master
 */
public abstract class Chessman {

    abstract String getColor();

    void display(Coordinates coordinates) {
        System.out.println("棋子颜色" + this.getColor() + "位置" + coordinates);
    }
}
