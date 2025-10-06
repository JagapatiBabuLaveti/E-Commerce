package com.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.Entity.FileEntity;

public interface FileRepository extends JpaRepository<FileEntity, Long> {

}
