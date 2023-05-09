package org.example.service;

import org.example.dao.Dao;
import org.example.domain.Member;
import org.example.domain.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Date;

public class MemberRegisterService {

    @Autowired
    @Qualifier("member")
    private Dao dao;

    // 생성자를 통해서 DAO 를 주입해보자!!!!!
//    public MemberRegisterService(Dao dao) { // new MemberDao 가 들어가도 된다.
//        this.dao = dao;
//    }

    // setter 이용해서 Dao 주입.
//    public void setDao(Dao dao) {
//        this.dao = dao;
//    }

    // 등록 처리해주는 메소드를 만들자 :
    // RegisterRequest (email, password, confirmPassword, name)
    public void regist(RegisterRequest request) {

        // email 존재 여부 확인 : map 저장 시 email 을 Key 값으로 사용함.
        Member member =  dao.selectByEmail(request.getEmail());  // Member 객체를 반환하거나 null.

        if(member != null) {
            System.out.println("중복되는 이메일이 있습니다..... 다시 시도하세요.....");
            return;
        }

        // 저장하기 위한 Member 객체 생성.
        Member newMember = new Member();
        newMember.setEmail(request.getEmail());
        newMember.setPassword(request.getPassword());
        newMember.setName(request.getName());
        newMember.setRegDate(new Date());

        // DAO => 저장.
        dao.insert(newMember);

        System.out.println("저장되었습니다.....");
    }



}