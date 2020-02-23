package com.okone.landlords.pattern.recognizer;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;

import java.util.List;

/**
 * 扑克模式识别器
 */
public interface PokerPatternRecognizer {

    PokerPattern recognize(List<Poker> list);
}
