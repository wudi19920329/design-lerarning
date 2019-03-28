package pattern.creational.builder.simple01;

/**
 * 充当具体建造者
 *
 * @author wudih
 * @date 2019/3/28 9:01
 * @since master
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setSex("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("卷发");
    }
}
