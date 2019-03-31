package pattern.behavioural.command.simple01;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author wudih
 * @date 2019-03-31 13:12
 * @since master
 */
public class XmlUtil {
    public static Command getBean(int i) {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(XmlUtil.class.getResourceAsStream("config.xml"));
            // 获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = null;
            if (0 == i) {
                classNode = nl.item(0).getFirstChild();
            } else {
                classNode = nl.item(1).getFirstChild();
            }
            String cName = classNode.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(cName);
            return (Command) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
