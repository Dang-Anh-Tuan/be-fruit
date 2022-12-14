package tvnh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tvnh.entity.Color;

@Repository
public interface ColorRepo extends JpaRepository<Color, Integer>{

}
