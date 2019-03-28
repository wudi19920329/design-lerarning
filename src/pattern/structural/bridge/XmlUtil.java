package pattern.structural.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * xml工具类
 *
 * @author wudih
 * @date 2019/3/28 11:12
 * @since master
 */
public class XmlUtil {
    public static <T> T getBean(String args) {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(XmlUtil.class.getResourceAsStream("config.xml"));
            Node classNode = null;
            NodeList nl = doc.getElementsByTagName("className");
            if (args.equals("image")) {
                // 获取第一个包含类名的节点，即扩充抽象类
                classNode = nl.item(0).getFirstChild();
            } else if (args.equals("os")) {
                // 获取第二个包含类名的节点，即具体实现类
                classNode = nl.item(1).getFirstChild();
            }
            String cName = classNode.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(cName);
            return (T) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
