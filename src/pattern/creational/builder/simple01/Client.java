package pattern.creational.builder.simple01;

/**
 * 客户端类
 *
 * @author wudih
 * @date 2019/3/28 9:27
 * @since master
 */
public class Client {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = XmlUtil.getBean();
        ActorController actorController = new ActorController();
        Actor actor = actorController.create(actorBuilder);
        System.out.println(actor.toString());
    }
}
