package com.okone.landlords.pattern.recognizer.impl;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;
import com.okone.landlords.pattern.recognizer.PokerPatternRecognizer;
import com.okone.landlords.pattern.special.StraightPattern;

import java.util.List;

public class StraightPatternRecognizer implements PokerPatternRecognizer {

    @Override
    public PokerPattern recognize(List<Poker> list) {
        if (list.size() >= 5) {

            //1、判断poker都是单个，统计score的个数 == list.size() 即可

            //2、判断order无中断。则认为是连续的
            return new StraightPattern(list);
        }
        return null;
    }
}
