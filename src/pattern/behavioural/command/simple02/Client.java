package pattern.behavioural.command.simple02;

/**
 *
 *
 * @author wudih
 * @date 2019-03-31 13:29
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        Command command = new AddCommand();
        form.setCommand(command);
        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
