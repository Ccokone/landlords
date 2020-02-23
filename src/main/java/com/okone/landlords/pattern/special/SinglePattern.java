package com.okone.landlords.pattern.special;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;

import java.util.List;

/**
 * 单牌模式
 */
public class SinglePattern extends PokerPattern {

    private Poker poker;

    public SinglePattern(List<Poker> list) {
        super(list);
        this.poker = list.get(0);
    }

    public Poker getPoker() {
        return poker;
    }

    public void setPoker(Poker poker) {
        this.poker = poker;
    }

    @Override
    public int compareTo(PokerPattern pattern) {
        if (pattern instanceof SinglePattern) {
            return Integer.compare(poker.getScore(), ((SinglePattern) pattern).poker.getScore());
        }

        //单牌模式默认打不过其他模式
        return -1;
    }
}
