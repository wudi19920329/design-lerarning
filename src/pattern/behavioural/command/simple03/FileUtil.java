package pattern.behavioural.command.simple03;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author wudih
 * @date 2019-03-31 14:05
 * @since master
 */
public class FileUtil {
    public static void writeCommands(List<Command> commands) {
        try (OutputStream os = new FileOutputStream("E:\\git-projects\\design-lerarning\\src\\pattern\\behavioural\\command\\simple03\\config.log");
                ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(commands);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Command> readCommands() {
        try (InputStream is = new FileInputStream("E:\\git-projects\\design-lerarning\\src\\pattern\\behavioural\\command\\simple03\\config.log");
                ObjectInputStream ois = new ObjectInputStream(is)) {
            return (List<Command>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
