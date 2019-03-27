package pattern.creational.factory.simple;

/**
 * 客户端类
 *
 * @author wudih
 * @date 2019/3/27 16:33
 * @since master
 */
public class Client {
    public static void main(String args[]) {
        String type = XmlUtil.getChartType();
        Chart chart = ChartFactory.getChart(type);
        chart.display();
    }
}
