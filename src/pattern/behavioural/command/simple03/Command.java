package pattern.behavioural.command.simple03;

import java.io.Serializable;

/**
 * @author wudih
 * @date 2019-03-31 13:44
 * @since master
 */
public abstract class Command implements Serializable {
    protected String name;
    protected String args;
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public ConfigOperator getConfigOperator() {
        return configOperator;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    abstract void execute(String args);

    abstract void execute();
}
