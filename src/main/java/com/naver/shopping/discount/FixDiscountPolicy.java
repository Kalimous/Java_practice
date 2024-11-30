package com.naver.shopping.discount;

import com.naver.shopping.member.Grade;
import com.naver.shopping.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000; // 할인할 고정 금액

    @Override
    public int discount(Member member, int price) {
        // member가 null인 경우 처리
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null");
        }

        // member의 등급이 VIP일 경우에만 할인 적용
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
