package feedbackformsretriever.persistence.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import feedbackformsretriever.persistence.domain.SentCohort;

public interface MongoCohortRepo extends MongoRepository<SentCohort, String> {
	
    public Optional <SentCohort> findByCohortId(Long id);
    
}
	