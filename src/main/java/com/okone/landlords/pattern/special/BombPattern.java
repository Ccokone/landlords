package com.okone.landlords.pattern.special;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;

import java.util.List;

/**
 * 炸弹模式，支持四个相同(score)的牌 or 2王
 */
public class BombPattern extends PokerPattern {

    private int score = 0;

    public BombPattern(List<Poker> pokers) {
        super(pokers);
        this.score = pokers.get(0).getScore();
    }

    @Override
    public int compareTo(PokerPattern pattern) {
        if (pattern instanceof BombPattern) {
            //由于王的score设定上会大于其他扑克牌的score，所以通过score的判断也能解决王炸和普通炸弹区别
            return Integer.compare(score, ((BombPattern) pattern).score);
        }

        //炸弹默认比其他模式都大
        return 1;
    }
}
