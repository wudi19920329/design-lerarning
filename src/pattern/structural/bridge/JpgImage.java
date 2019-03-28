package pattern.structural.bridge;

/**
 * JPG格式图像：扩充抽象类
 *
 * @author wudih
 * @date 2019/3/28 11:10
 * @since master
 */
public class JpgImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析JPG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为JPG。");
    }
}
