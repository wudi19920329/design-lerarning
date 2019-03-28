package pattern.structural.composite.simple01;

/**
 * 图片文件
 *
 * @author wudih
 * @date 2019/3/28 11:45
 * @since master
 */
public class ImageFile implements File {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(File file) {
        throw new RuntimeException("对不起不支持添加文件");
    }

    @Override
    public void remove(File file) {
        throw new RuntimeException("对不起不支持删除文件");
    }

    @Override
    public File getChild(Integer index) {
        throw new RuntimeException("对不起不支持获取文件");
    }

    @Override
    public void killVirus() {
        System.out.println("killing " + this.name + " virus ....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
