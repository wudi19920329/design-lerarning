package pattern.structural.bridge;

/**
 * 客户端类
 *
 * @author wudih
 * @date 2019/3/28 11:16
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        Image image = XmlUtil.getBean("image");
        ImageImpl imageImpl = XmlUtil.getBean("os");
        image.setImp(imageImpl);
        image.parseFile("xxx.png");
    }
}
