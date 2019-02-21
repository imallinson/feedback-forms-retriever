package feedbackformsretriever.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import feedbackformsretriever.persistence.domain.SentAccount;

@Repository
public interface MongoAccountRepo  extends MongoRepository<SentAccount, String>{
}
