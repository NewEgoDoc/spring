package study.datajpa.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.datajpa.jpa.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
