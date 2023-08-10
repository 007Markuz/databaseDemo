package com.database.demo.repository;

import com.database.demo.entity.ConfigurationEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<ConfigurationEntity, Long> {

  @Query(
      value = "SELECT a.* FROM CONFIGURATION a LIMIT 1 ",
      nativeQuery = true)
  List<String[]> getElement();

}
