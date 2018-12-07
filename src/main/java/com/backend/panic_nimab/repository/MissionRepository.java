package com.backend.panic_nimab.repository;

import com.backend.panic_nimab.model.Mission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MissionRepository extends CrudRepository<Mission, Long>
{

}
