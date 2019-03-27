package pattern.creational.prototype.simple01;

/**
 * 原型接口
 *
 * @author wudih
 * @date 2019/3/27 16:53
 * @since master
 */
public interface Prototype {
    public static class ConcretePrototype implements Prototype {
        /**
         * 成员属性
         */
        private String attr;

        public void setAttr(String attr) {
            this.attr = attr;
        }

        public String getAttr() {
            return this.attr;
        }

        @Override
        public Prototype clone() {
            // 创建新对象
            ConcretePrototype prototype = new ConcretePrototype();
            prototype.setAttr(this.attr);
            return this;
        }
    }

    public static void main(String[] args) {
        ConcretePrototype obj1 = new ConcretePrototype();
        obj1.setAttr("Sunny");
        Prototype obj2 = obj1.clone();
        System.out.println(((ConcretePrototype) obj2).getAttr());
    }
}
