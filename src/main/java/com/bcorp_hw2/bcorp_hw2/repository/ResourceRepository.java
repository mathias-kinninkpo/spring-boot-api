package com.bcorp_hw2.bcorp_hw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bcorp_hw2.bcorp_hw2.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
