package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Plan;

@Repository
public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
