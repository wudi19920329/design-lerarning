package pattern.structural.proxy.simple01;

import java.text.MessageFormat;

/**
 * @author wudih
 * @date 2019/3/29 13:55
 * @since master
 */
public class RealSearcher implements Searcher {
    @Override
    public String search(String userId, String keywords) {
        return MessageFormat.format("用户{0}使用关键词{1}查询商户信息", userId, keywords);
    }
}
