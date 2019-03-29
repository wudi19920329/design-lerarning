package pattern.structural.flyweight.simple01;

import java.util.Hashtable;

/**
 * 享元工厂类
 *
 * @author wudih
 * @date 2019/3/29 11:01
 * @since master
 */
public class ChessmanFactory {
    private final static ChessmanFactory INSTANCE = new ChessmanFactory();
    private final static Hashtable<String, Chessman> HASHTABLE = new Hashtable<>();
    static {
        HASHTABLE.put("b", new BlackChessman());
        HASHTABLE.put("w", new WhiteChessman());
    }


    public static Chessman getChessman(String color) {
        return HASHTABLE.get(color);
    }

}
