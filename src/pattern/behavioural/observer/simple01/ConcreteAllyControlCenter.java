package pattern.behavioural.observer.simple01;

/**
 * @author wudih
 * @date 2019-03-31 18:55
 * @since master
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        observers.stream().filter(o -> !o.getName().equalsIgnoreCase(name)).forEach(Observer::help);
    }
}
