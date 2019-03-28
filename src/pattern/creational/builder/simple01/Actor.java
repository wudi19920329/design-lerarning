package pattern.creational.builder.simple01;

/**
 * Actor充当复杂产品
 *
 * @author wudih
 * @date 2019/3/28 8:58
 * @since master
 */
public class Actor {
    /**
     * 角色类型
     */
    private String type;
    /**
     * 性别
     */
    private String sex;
    /**
     * 脸型
     */
    private String face;
    /**
     * 服装
     */
    private String costume;
    /**
     * 发型
     */
    private String hairstyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Actor{");
        sb.append("type='").append(type).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", face='").append(face).append('\'');
        sb.append(", costume='").append(costume).append('\'');
        sb.append(", hairstyle='").append(hairstyle).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
