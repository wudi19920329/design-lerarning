package pattern.structural.facade.simple01;

/**
 * 客户端类
 *
 * @author wudih
 * @date 2019/3/28 16:15
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.encrypt();
    }
}
