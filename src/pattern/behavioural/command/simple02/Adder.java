package pattern.behavioural.command.simple02;

/**
 * @author wudih
 * @date 2019-03-31 13:24
 * @since master
 */
public class Adder {
    private Integer num = 0;

    public int add(Integer value) {
        this.num += value;
        return this.num;
    }

}
