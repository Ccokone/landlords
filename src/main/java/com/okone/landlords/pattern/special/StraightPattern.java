package com.okone.landlords.pattern.special;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;

import java.util.List;

/**
 * 顺子模式，至少5个连续扑克牌
 */
public class StraightPattern extends PokerPattern {

    private int combo = 5;

    private int score = 0;

    public StraightPattern(List<Poker> pokerList) {
        super(pokerList);
        this.combo = pokerList.size();
        for (Poker poker : pokerList) {
            score += poker.getScore();
        }
    }

    public int getCombo() {
        return combo;
    }

    public void setCombo(int combo) {
        this.combo = combo;
    }

    @Override
    public String toString() {
        return "StraightPattern{" +
                "combo=" + combo +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(PokerPattern pattern) {
        if (pattern instanceof StraightPattern) {
            StraightPattern o = (StraightPattern) pattern;

            //顺子打顺子，需要数量一致，而且总score更大
            if (this.combo == o.combo) {
                return Integer.compare(score, o.score);
            }
        }

        //顺子模式默认打不过其他模式
        return -1;
    }
}
