package pattern.behavioural.command.simple03;

import pattern.structural.composite.simple01.File;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wudih
 * @date 2019-03-31 14:05
 * @since master
 */
public class ConfigSettingWindow {
    private List<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args) {
        command.execute(args);
        commands.add(command);
    }

    public void save() {
        FileUtil.writeCommands(commands);
    }

    public void recover() {
        List<Command> list = FileUtil.readCommands();
        for (Object obj : list) {
            ((Command)obj).execute();
        }
    }
}
