package pattern.behavioural.command.simple01;

import pattern.structural.decorator.simple01.Window;

/**
 * @author wudih
 * @date 2019-03-31 12:57
 * @since master
 */
public class MinimizeCommand extends Command {
    private WindowHanlder windowHanlder;

    public MinimizeCommand() {
        this.windowHanlder = new WindowHanlder();
    }

    @Override
    void execute() {
        windowHanlder.display();
    }
}
