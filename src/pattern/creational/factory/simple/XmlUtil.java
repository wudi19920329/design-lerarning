package pattern.creational.factory.simple;

import com.sun.xml.internal.ws.api.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * xml工具类
 *
 * @author wudih
 * @date 2019/3/27 16:35
 * @since master
 */
public class XmlUtil {
    public static String getChartType() {
        try {
            // 创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document = builder.parse(XmlUtil.class.getResourceAsStream("config.xml"));
            // 获取包含图表类型的文本节点
            NodeList nodeList = document.getElementsByTagName("chartType");
            Node node = nodeList.item(0).getFirstChild();
            return node.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
