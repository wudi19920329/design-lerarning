package pattern.creational.prototype.simple03;

/**
 * 可行性分析报告(Feasibility Analysis Report)类
 *
 * @author wudih
 * @date 2019/3/27 17:12
 * @since master
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
