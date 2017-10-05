package railway_code.repository;

import railway_code.model.Canton;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CantonRepository extends CrudRepository<Canton, Long> {
}
