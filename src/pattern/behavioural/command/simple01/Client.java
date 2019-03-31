package pattern.behavioural.command.simple01;

/**
 * @author wudih
 * @date 2019-03-31 13:14
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow window = new FBSettingWindow("功能键设置");
        FBSettingWindow.FunctionButton button1 = new FBSettingWindow.FunctionButton("功能键1");
        FBSettingWindow.FunctionButton button2 = new FBSettingWindow.FunctionButton("功能键2");
        Command command1 = XmlUtil.getBean(0);
        Command command2 = XmlUtil.getBean(1);
        button1.setCommand(command1);
        button2.setCommand(command2);
        window.addFunctionButton(button1);
        window.addFunctionButton(button2);
        window.display();
        button1.onClick();
        button2.onClick();
    }
}
