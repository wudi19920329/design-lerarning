package pattern.behavioural.command.simple01;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能键设置窗口类
 *
 * @author wudih
 * @date 2019-03-31 13:01
 * @since master
 */
public class FBSettingWindow {
    private String title;

    private List<FunctionButton> buttons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button) {
        this.buttons.add(button);
    }

    public void removeFunctionButton(FunctionButton button) {
        this.buttons.remove(button);
    }

    public void display() {
        System.out.println("显示窗口" + this.title);
        System.out.println("显示功能键：");
        buttons.stream().map(FunctionButton::getName).forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    public static class FunctionButton {
        private String name;
        private Command command;

        public FunctionButton(String name) {
            this.name = name;
        }

        public void setCommand(Command command) {
            this.command = command;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void onClick() {
            System.out.println("点击功能键");
            command.execute();
        }
    }
}
