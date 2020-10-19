package com.mango.MangoTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mango.MangoTest.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
