package pattern.behavioural.command.simple03;

/**
 * @author wudih
 * @date 2019-03-31 14:04
 * @since master
 */
public class ModifyCommand extends Command {

    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    void execute() {
        configOperator.modify(args);
    }
}
