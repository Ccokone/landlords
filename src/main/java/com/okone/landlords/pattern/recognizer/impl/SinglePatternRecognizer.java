package com.okone.landlords.pattern.recognizer.impl;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;
import com.okone.landlords.pattern.recognizer.PokerPatternRecognizer;
import com.okone.landlords.pattern.special.SinglePattern;

import java.util.List;

public class SinglePatternRecognizer implements PokerPatternRecognizer {

    @Override
    public PokerPattern recognize(List<Poker> list) {
        if (list.size() == 1) {
            return new SinglePattern(list);
        }
        return null;
    }
}
