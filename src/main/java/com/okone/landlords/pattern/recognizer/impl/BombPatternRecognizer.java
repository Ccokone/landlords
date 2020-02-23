package com.okone.landlords.pattern.recognizer.impl;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;
import com.okone.landlords.pattern.recognizer.PokerPatternRecognizer;
import com.okone.landlords.pattern.special.BombPattern;

import java.util.List;

public class BombPatternRecognizer implements PokerPatternRecognizer {

    @Override
    public PokerPattern recognize(List<Poker> list) {
        if (list.size() == 2 || list.size() == 4) {

            //1、王炸判断

            //2、连着四个的 score 已有就认为是一个炸弹
            return new BombPattern(list);
        }

        return null;
    }
}
