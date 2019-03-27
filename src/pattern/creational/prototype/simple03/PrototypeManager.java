package pattern.creational.prototype.simple03;

import java.util.Hashtable;

/**
 * 原型管理器（使用饿汉式单例实现）
 *
 * @author wudih
 * @date 2019/3/27 17:13
 * @since master
 */
public class PrototypeManager {
    /**
     * 定义一个Hashtable，用于存储原型对象
     */
    private static final Hashtable<String, OfficialDocument> HT = new Hashtable(13);
    private static final PrototypeManager PM = new PrototypeManager();

    // 为Hashtable增加公文对象
    private PrototypeManager() {
        HT.put("far", new FAR());
        HT.put("srs", new SRS());
    }

    // 增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc) {
        HT.put(key, doc);
    }

    // 通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key) {
        return HT.get(key).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return PM;
    }
}
