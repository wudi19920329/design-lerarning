package pattern.structural.proxy.simple01;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author wudih
 * @date 2019/3/29 14:04
 * @since master
 */
public class XmlUtil {
    public static Searcher getProxy() {
        try {
            // 创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document = builder.parse(pattern.structural.proxy.simple01.XmlUtil.class.getResourceAsStream("config1.xml"));
            // 获取包含图表类型的文本节点
            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            // 通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(node.getNodeValue().trim());
            return (SearchProxy) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
