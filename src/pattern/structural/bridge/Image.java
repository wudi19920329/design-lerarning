package pattern.structural.bridge;

/**
 * 抽象图像类
 *
 * @author wudih
 * @date 2019/3/28 10:56
 * @since master
 */
public abstract class Image {
    protected ImageImpl imp;

    public void setImp(ImageImpl imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
