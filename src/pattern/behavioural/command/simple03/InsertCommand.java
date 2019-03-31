package pattern.behavioural.command.simple03;

/**
 * @author wudih
 * @date 2019-03-31 13:44
 * @since master
 */
public class InsertCommand extends Command {
    public InsertCommand(String name) {
        super(name);
    }

    @Override
    void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    @Override
    void execute() {
        configOperator.insert(args);
    }
}
