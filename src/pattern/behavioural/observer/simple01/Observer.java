package pattern.behavioural.observer.simple01;

/**
 * @author wudih
 * @date 2019-03-31 18:53
 * @since master
 */
public interface Observer {
    String getName();

    void setName(String name);

    void help();

    void beAttacked(AllyControlCenter allyControlCenter);
}
