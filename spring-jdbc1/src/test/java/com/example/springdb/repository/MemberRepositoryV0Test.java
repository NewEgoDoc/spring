package com.example.springdb.repository;

import static org.assertj.core.api.Assertions.*;

import java.sql.SQLException;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import com.example.springdb.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class MemberRepositoryV0Test {

    MemberRepositoryV0 memberRepositoryV0 = new MemberRepositoryV0();


    @Test
    void crudTest() throws SQLException {

        // insert
        Member memberV0 = new Member("memberV0", 10000);
        memberRepositoryV0.save(memberV0);

        // select
        Member findMember = memberRepositoryV0.findById(memberV0.getMemberId());
        assertThat(memberV0).isEqualTo(findMember);

        // update
        memberRepositoryV0.update(20000, findMember.getMemberId());
        Member updateMember = memberRepositoryV0.findById(findMember.getMemberId());
        assertThat(updateMember.getMoney()).isEqualTo(20000);

        // delete
        memberRepositoryV0.delete(memberV0.getMemberId());
        assertThatThrownBy(() -> memberRepositoryV0.findById(memberV0.getMemberId()))
                .isInstanceOf(NoSuchElementException.class);
    }

}