package pattern.behavioural.observer.simple01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wudih
 * @date 2019-03-31 18:55
 * @since master
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected final List<Observer> observers = new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + allyName + "战队");
        observers.add(observer);
    }

    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + allyName + "战队");
        observers.remove(observer);
    }

    // 声明抽象通知方法
    public abstract void notifyObserver(String name);

}
