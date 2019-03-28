package pattern.structural.composite.simple01;

/**
 * 文件接口
 *
 * @author wudih
 * @date 2019/3/28 11:41
 * @since master
 */
public interface File {
    void add(File file);

    void remove(File file);

    File getChild(Integer index);

    void killVirus();
}
