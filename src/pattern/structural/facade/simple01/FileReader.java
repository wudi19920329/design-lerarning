package pattern.structural.facade.simple01;

import java.io.*;

/**
 * 文件读取类
 *
 * @author wudih
 * @date 2019/3/28 15:50
 * @since master
 */
public class FileReader {
    String read(String fileNameSrc) {
        StringBuffer sb = new StringBuffer();
        try (InputStream is = new FileInputStream(fileNameSrc); Reader r = new InputStreamReader(is, "GBK"); BufferedReader bf = new BufferedReader(r);) {
            String data;
            while ((data = bf.readLine()) != null) {
                sb.append(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
