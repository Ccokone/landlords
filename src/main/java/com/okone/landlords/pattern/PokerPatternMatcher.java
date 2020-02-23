package com.okone.landlords.pattern;

import com.okone.landlords.Poker;
import com.okone.landlords.pattern.recognizer.PokerPatternRecognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * 扑克模式识别器
 *
 * @author Cc
 */
public class PokerPatternMatcher {

    private List<PokerPatternRecognizer> recognizerList = new ArrayList<>();

    /**
     * 根据给定的扑克牌列表（已排序）匹配到对应的模式，没找到则认为不符合该出牌规则
     *
     * @param pokerList 扑克牌列表
     * @return 对应的模式，没找到则认为不符合该出牌规则
     */
    public PokerPattern match(List<Poker> pokerList) {
        for (PokerPatternRecognizer recognizer : recognizerList) {
            PokerPattern pattern = recognizer.recognize(pokerList);
            if (pattern != null) {
                return pattern;
            }
        }
        return null;
    }
}
