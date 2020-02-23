package com.okone.landlords;

/**
 * 单张扑克牌信息
 *
 * @author Cc
 */
public class Poker implements Comparable<Poker> {

    /**
     * 主键ID
     */
    private int id = -1;

    /**
     * 扑克名称，如红桃K
     */
    private String name = "";

    /**
     * 扑克类型：梅花，黑桃，红心，方块
     */
    private int style = 0;

    /**
     * 扑克图片资源
     */
    private String image = "";

    /**
     * 扑克值，大吃小
     */
    private int score = 0;

    /**
     * 扑克连续号，用于支持顺子这类场景，不支持连续为0
     */
    private int order = 0;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style=" + style +
                ", image='" + image + '\'' +
                ", score=" + score +
                ", order=" + order +
                '}';
    }

    @Override
    public int compareTo(Poker o) {
        return Integer.compare(o.score, score);
    }
}
