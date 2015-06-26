package com.tallgeorge.color.dao;

import com.tallgeorge.color.model.ResultSet;
import org.springframework.data.repository.CrudRepository;

/**
 * JPA repository for the result set model.
 */
public interface JpaResultSetRepository extends CrudRepository<ResultSet, Long> {
}
