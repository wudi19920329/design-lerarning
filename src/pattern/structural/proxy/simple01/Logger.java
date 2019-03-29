package pattern.structural.proxy.simple01;

import java.text.MessageFormat;

/**
 * @author wudih
 * @date 2019/3/29 13:59
 * @since master
 */
public class Logger {
    public void log(String userId) {
        System.out.println(MessageFormat.format("更新数据库，用户{0}查询次数加1！", userId));
    }
}
