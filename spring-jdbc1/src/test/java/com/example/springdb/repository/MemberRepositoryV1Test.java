package com.example.springdb.repository;

import static com.example.springdb.connection.ConnectionConst.*;
import static org.assertj.core.api.Assertions.*;

import java.sql.SQLException;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.springdb.domain.Member;
import com.zaxxer.hikari.HikariDataSource;


class MemberRepositoryV1Test {

    MemberRepositoryV1 memberRepositoryV1;

    @BeforeEach
    void beforeEach() {
        // 기본 DriverManager - 항상 새로운 커넥션을 획득
//        DriverManagerDataSource dataSource = new DriverManagerDataSource(URL, USERNAME, PASSWORD);

        //
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);

        memberRepositoryV1 = new MemberRepositoryV1(dataSource);
    }


    @Test
    void crudTest() throws SQLException, InterruptedException {

        // insert
        Member memberV0 = new Member("memberV0", 10000);
        memberRepositoryV1.save(memberV0);

        // select
        Member findMember = memberRepositoryV1.findById(memberV0.getMemberId());
        assertThat(memberV0).isEqualTo(findMember);

        // update
        memberRepositoryV1.update(20000, findMember.getMemberId());
        Member updateMember = memberRepositoryV1.findById(findMember.getMemberId());
        assertThat(updateMember.getMoney()).isEqualTo(20000);

        // delete
        memberRepositoryV1.delete(memberV0.getMemberId());
        assertThatThrownBy(() -> memberRepositoryV1.findById(memberV0.getMemberId()))
                .isInstanceOf(NoSuchElementException.class);
        Thread.sleep(1000);
    }


}