package pattern.behavioural.command.simple03;

import java.io.Serializable;

/**
 * @author wudih
 * @date 2019-03-31 14:04
 * @since master
 */
public class ConfigOperator implements Serializable {
    void insert(String args) {
        System.out.println("增加新节点：" + args);
    }

    void modify(String args) {
        System.out.println("修改节点：" + args);

    }

    void delete(String args) {
        System.out.println("删除节点：" + args);
    }

}
