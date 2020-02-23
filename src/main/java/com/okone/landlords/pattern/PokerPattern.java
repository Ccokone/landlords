package com.okone.landlords.pattern;

import com.okone.landlords.Poker;

import java.util.List;

/**
 * 扑克模版，市面上需要支持：
 * 单牌 （单牌打出）
 *
 * 顺子 （至少5个连续扑克）
 *
 * 对子 （相同值的两个扑克）
 *
 * 连对 （至少3个连续对子）
 *
 * 三个 （相同值的三个扑克）
 *
 * 三带 （三带一，三带二，连续多个三扑克 + 附带/无附带）
 *
 * 四带 （四带2，四带2对）
 *
 * 炸弹 （四个，2王）
 *
 * @author Cc
 */
public abstract class PokerPattern implements Comparable<PokerPattern> {

    protected List<Poker> pokers;

    protected PokerPattern(List<Poker> pokers) {
        this.pokers = pokers;
    }

    public List<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(List<Poker> pokers) {
        this.pokers = pokers;
    }
}
