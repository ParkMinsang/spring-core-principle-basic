package com.example.core.discount;

import com.example.core.member.Grade;
import com.example.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private final int DISCOUNT_FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return DISCOUNT_FIX_AMOUNT;
        }
        return 0;
    }
}
