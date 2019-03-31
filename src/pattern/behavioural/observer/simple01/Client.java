package pattern.behavioural.observer.simple01;

/**
 *
 *
 * @author wudih
 * @date 2019-03-31 19:03
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("金庸群侠");
        Observer observer1 =new ConcreteObserver("杨过");
        Observer observer2 =new ConcreteObserver("令狐冲");
        Observer observer3 =new ConcreteObserver("张无忌");
        Observer observer4 =new ConcreteObserver("段誉");
        allyControlCenter.join(observer1);
        allyControlCenter.join(observer2);
        allyControlCenter.join(observer3);
        allyControlCenter.join(observer4);
        observer1.beAttacked(allyControlCenter);
    }
}
