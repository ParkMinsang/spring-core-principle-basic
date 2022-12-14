package com.example.core;

import com.example.core.member.Grade;
import com.example.core.member.Member;
import com.example.core.member.MemberService;
import com.example.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1);
        System.out.println("new Member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
