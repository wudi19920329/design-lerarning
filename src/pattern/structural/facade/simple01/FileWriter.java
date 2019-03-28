package pattern.structural.facade.simple01;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 写入文件
 *
 * @author wudih
 * @date 2019/3/28 15:58
 * @since master
 */
public class FileWriter {

    void write(String encryptStr, String fileNameTarget) {
        try (OutputStream os = new FileOutputStream(fileNameTarget)) {
            os.write(encryptStr.getBytes());
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
