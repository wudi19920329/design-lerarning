package pattern.structural.proxy.simple01;

/**
 * @author wudih
 * @date 2019/3/29 14:10
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        Searcher proxy = XmlUtil.getProxy();
        System.out.println(proxy.search("1", "杨过"));
    }
}
