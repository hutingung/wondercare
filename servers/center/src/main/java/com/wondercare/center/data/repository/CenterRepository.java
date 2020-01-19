package com.wondercare.center.data.repository;

import com.wondercare.center.data.entity.Center;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CenterRepository extends JpaRepository<Center, Long> {
}
