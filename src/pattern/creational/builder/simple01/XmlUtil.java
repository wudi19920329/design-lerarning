package pattern.creational.builder.simple01;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * xml工具类
 *
 * @author wudih
 * @date 2019/3/28 9:17
 * @since master
 */
public class XmlUtil {
    public static ActorBuilder getBean() {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(XmlUtil.class.getResourceAsStream("config.xml"));
            // 获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            // 通过类名生成实例对象并将其返回
            ActorBuilder actorBuilder = (ActorBuilder) Class.forName(cName).newInstance();
            return actorBuilder;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
