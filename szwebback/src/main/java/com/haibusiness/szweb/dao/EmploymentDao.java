package com.haibusiness.szweb.dao;


import com.haibusiness.szweb.entity.Employment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentDao extends JpaRepository<Employment,Long> {
    Page<Employment> findByTypeAndTitleLikeOrderByUpdateTimeDesc(String type, String title, Pageable pageable);

}
