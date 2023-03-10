package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            int discountFixAmount = 1000;
            return discountFixAmount;
        }
        return 0;
    }
}
