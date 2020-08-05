package com.javawebdev.bootstrap.repository;

import com.javawebdev.bootstrap.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
