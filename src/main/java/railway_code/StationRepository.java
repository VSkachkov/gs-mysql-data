package railway_code;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StationRepository extends CrudRepository<Station, Long> {

    List<Station> findByIdIsContaining(long id);
    List<Station> findAllByName(String stationName);

}
