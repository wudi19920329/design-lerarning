package pattern.creational.factory.simple;

/**
 * 饼状图类：具体产品类
 *
 * @author wudih
 * @date 2019/3/27 16:31
 * @since master
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}
