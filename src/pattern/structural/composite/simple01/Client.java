package pattern.structural.composite.simple01;

/**
 * 客户端类
 *
 * @author wudih
 * @date 2019/3/28 13:49
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        File files = new Folder("图片文件夹");
        files.add(new ImageFile("小龙女.jpg"));
        files.killVirus();
    }
}
