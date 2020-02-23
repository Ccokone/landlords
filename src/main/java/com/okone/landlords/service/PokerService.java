package com.okone.landlords.service;


import com.okone.landlords.Poker;

import java.util.List;

public interface PokerService {

    /**
     * 判断当前出牌是否符合规则
     *
     * @param list 牌列表
     * @return 判断结果
     */
    boolean valid(List<Poker> list);

    /**
     * 判断当前出牌是否可以压制指定的牌
     *
     * @param current 当前的牌列表
     * @param target 指定的牌列表
     * @return true表示可以压制
     */
    boolean suppress(List<Poker> current, List<Poker> target);
}
