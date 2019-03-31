package pattern.behavioural.command.simple02;

/**
 * @author wudih
 * @date 2019-03-31 13:28
 * @since master
 */
public class CalculatorForm {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void compute(Integer value) {
        System.out.println("执行运算结果为：" + command.execute(value));
    }

    public void undo() {
        System.out.println("方法撤销，结果为：" + command.undo());
    }
}
