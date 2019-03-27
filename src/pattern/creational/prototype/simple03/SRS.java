package pattern.creational.prototype.simple03;

/**
 * 软件需求规格说明书(Software Requirements Specification)类
 *
 * @author wudih
 * @date 2019/3/27 17:12
 * @since master
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
