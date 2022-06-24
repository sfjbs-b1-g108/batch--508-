package com.PensionManagment;





import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PensionDetailsRepository extends CrudRepository<PensionDetails, Integer > {

	Optional<PensionDetails> findById(PensionDetails id);

	


	

	

	

	

}
