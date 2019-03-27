package pattern.creational.prototype.simple03;

/**
 * 抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 *
 * @author wudih
 * @date 2019/3/27 17:11
 * @since master
 */
public interface OfficialDocument extends Cloneable {
    OfficialDocument clone();

    void display();
}
