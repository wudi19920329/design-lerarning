package pattern.creational.prototype.simple01;

/**
 * test
 *
 * @author wudih
 * @date 2019/3/27 16:58
 * @since master
 */
public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setName("1");
        Test test1 = test;
        test1.setName("woody");
        System.out.println(test.getName());
    }
}
