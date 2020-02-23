package com.okone.landlords.service.impl;


import com.okone.landlords.Poker;
import com.okone.landlords.pattern.PokerPattern;
import com.okone.landlords.pattern.PokerPatternMatcher;
import com.okone.landlords.service.PokerService;

import java.util.Collections;
import java.util.List;

public class PokerServiceImpl implements PokerService {

    private PokerPatternMatcher pokerPatternMatcher;

    @Override
    public boolean valid(List<Poker> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Collections.sort(list);

        PokerPattern pattern = pokerPatternMatcher.match(list);
        return pattern != null;
    }

    @Override
    public boolean suppress(List<Poker> current, List<Poker> target) {
        if (current == null || target == null) {
            return false;
        }

        Collections.sort(current);
        Collections.sort(target);

        PokerPattern pattern = pokerPatternMatcher.match(current);
        PokerPattern previousPattern = pokerPatternMatcher.match(target);
        if (pattern == null || previousPattern == null) {
            return false;
        }

        //核心算法
        return pattern.compareTo(previousPattern) > 0;
    }
}
