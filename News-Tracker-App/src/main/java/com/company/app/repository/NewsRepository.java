package com.company.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.app.entity.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer>{
	
}
