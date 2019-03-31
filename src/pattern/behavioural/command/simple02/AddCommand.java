package pattern.behavioural.command.simple02;

/**
 * @author wudih
 * @date 2019-03-31 13:24
 * @since master
 */
public class AddCommand extends Command {
    private Adder adder = new Adder();
    private Integer value;

    @Override
    int execute(Integer value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    int undo() {
        return adder.add(-value);
    }
}
