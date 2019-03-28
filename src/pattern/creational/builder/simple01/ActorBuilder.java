package pattern.creational.builder.simple01;

/**
 * ActorBuilder充当抽象建造者
 *
 * @author wudih
 * @date 2019/3/28 9:00
 * @since master
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    /**
     * 工厂方法，返回一个完整的游戏角色对象
     * 
     * @return
     * @author wudih
     * @date 2019年03月28日 09:00:43
     * @since 5.8.1
     */
    public Actor createActor() {
        return actor;
    }
}
