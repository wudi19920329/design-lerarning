package pattern.behavioural.command.simple01;

/**
 * @author wudih
 * @date 2019-03-31 13:08
 * @since master
 */
public class HelpCommand extends Command {
    private HelpHander helpHander;

    public HelpCommand() {
        this.helpHander = new HelpHander();
    }

    @Override
    void execute() {
        helpHander.display();
    }
}
