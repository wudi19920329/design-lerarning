package pattern.behavioural.command.simple02;

/**
 * @author wudih
 * @date 2019-03-31 13:23
 * @since master
 */
public abstract class Command {
    abstract int execute(Integer value);

    abstract int undo();
}
