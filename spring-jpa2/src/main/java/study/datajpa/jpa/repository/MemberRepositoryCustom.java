package study.datajpa.jpa.repository;

import java.util.List;

import study.datajpa.jpa.entity.Member;

public interface MemberRepositoryCustom {
	List<Member> findMemberCustom();
}
