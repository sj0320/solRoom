package com.solRoom.solspring.repository;

import com.solRoom.solspring.domain.FreeBoard;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BoardRepository extends JpaRepository<FreeBoard, Long> {

}

