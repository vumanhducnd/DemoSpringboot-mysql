package com.crud.demo.repository;
import com.crud.demo.entity.Docgia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocgiaReponsitory extends JpaRepository<Docgia,Long> {

}
