package railway_code.repository;

import org.springframework.data.repository.CrudRepository;
import railway_code.model.Train;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TrainRepository extends CrudRepository<Train, Long> {


}
