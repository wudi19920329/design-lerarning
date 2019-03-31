package pattern.behavioural.observer.simple01;

/**
 * @author wudih
 * @date 2019-03-31 18:56
 * @since master
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override public String getName() {
        return name;
    }

    @Override public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，" + this.name + "来救你！");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name + "被攻击！");
        allyControlCenter.notifyObserver(name);
    }
}
