package com.junior.url_shortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.url_shortener.entity.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {
    // Define repository methods here
}
