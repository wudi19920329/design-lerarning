package pattern.structural.proxy.simple01;

/**
 * @author wudih
 * @date 2019/3/29 13:58
 * @since master
 */
public class AccessValidator {
    public boolean validate(String userId) {
        if (userId.equals("1")) {
            return true;
        }
        return false;
    }
}
