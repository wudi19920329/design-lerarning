package pattern.creational.builder.simple01;

/**
 * 具体建造者
 *
 * @author wudih
 * @date 2019/3/28 9:04
 * @since master
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setFace("獠牙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
