package pattern.structural.facade.simple01;

import java.util.Base64;

/**
 * 加密外观类
 *
 * @author wudih
 * @date 2019/3/28 15:49
 * @since master
 */
public class EncryptFacade {
    private FileWriter writer;
    private FileReader reader;

    public EncryptFacade() {
        this.writer = new FileWriter();
        this.reader = new FileReader();
    }

    public void encrypt() {
        String plainText = reader.read("D://T.txt");
        writer.write(plainText + "加密了", "D://T1.txt");
    }
}
