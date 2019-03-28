package pattern.structural.composite.simple01;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 *
 * @author wudih
 * @date 2019/3/28 11:49
 * @since master
 */
public class Folder implements File {
    private final List<File> files = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(File file) {
        files.add(file);
    }

    @Override
    public void remove(File file) {
        files.remove(file);
    }

    @Override
    public File getChild(Integer index) {
        return files.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹【" + this.name + "】进行杀毒");
        files.forEach(f -> f.killVirus());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
