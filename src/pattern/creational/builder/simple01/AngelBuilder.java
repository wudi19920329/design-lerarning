package pattern.creational.builder.simple01;

/**
 * 充当具体建造者
 *
 * @author wudih
 * @date 2019/3/28 9:02
 * @since master
 */
public class AngelBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("美丽");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("翅膀");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("长发");
    }
}
