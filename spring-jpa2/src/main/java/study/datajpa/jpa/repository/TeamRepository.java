package study.datajpa.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.datajpa.jpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
