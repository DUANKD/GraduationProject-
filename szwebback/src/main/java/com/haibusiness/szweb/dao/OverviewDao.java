package com.haibusiness.szweb.dao;


import com.haibusiness.szweb.entity.Overview;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OverviewDao extends JpaRepository<Overview,Long> {
    Page<Overview> findByTypeAndTitleLikeOrderByUpdateTimeDesc(String type, String title, Pageable pageable);

}
