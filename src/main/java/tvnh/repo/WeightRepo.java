package tvnh.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tvnh.entity.Weight;


@Repository
public interface WeightRepo extends JpaRepository<Weight, Integer>{

}
