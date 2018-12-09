package com.backend.panic_nimab.repository;

import com.backend.panic_nimab.model.Mission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MissionRepository extends CrudRepository<Mission, Long>
{
    @Query(value = "select * from mission order by id desc limit 1", nativeQuery = true)
    Mission findLastMission();
}
