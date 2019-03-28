package pattern.creational.builder.simple01;

/**
 * 游戏角色创建控制器：指挥者
 *
 * @author wudih
 * @date 2019/3/28 9:05
 * @since master
 */
public class ActorController {

    public Actor create(ActorBuilder actorBuilder) {
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildHairstyle();
        actorBuilder.buildSex();
        actorBuilder.buildType();
        Actor actor = actorBuilder.createActor();
        return actor;
    }

}
