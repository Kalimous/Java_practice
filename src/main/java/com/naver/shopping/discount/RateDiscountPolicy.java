package com.naver.shopping.discount;
//그리고 FixDiscountPolicy와 비슷하게 dliscount함수를 VIP라면 가격의 10%를 return해주는 함수로 override해줍시다!


import com.naver.shopping.member.Grade;
import com.naver.shopping.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price  * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
