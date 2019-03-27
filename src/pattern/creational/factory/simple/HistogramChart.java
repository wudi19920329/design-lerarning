package pattern.creational.factory.simple;

/**
 * 柱状图类：具体产品类
 *
 * @author wudih
 * @date 2019/3/27 16:30
 * @since master
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
