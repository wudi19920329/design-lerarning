package pattern.creational.factory.simple;

/**
 * 折线图类：具体产品类
 *
 * @author wudih
 * @date 2019/3/27 16:32
 * @since master
 */
public class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}
