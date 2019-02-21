package feedbackformsretriever.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import org.bson.types.ObjectId;

import feedbackformsretriever.persistence.domain.SentAccount;
import feedbackformsretriever.persistence.repository.MongoAccountRepo;

@CrossOrigin
@RequestMapping("${path.base}")
@RestController
public class SentAccountRest {
	
	@Autowired
	private MongoAccountRepo repo;

	@GetMapping("${path.getAccounts}")
	public List<SentAccount> getAccounts() {
		return repo.findAll();
	}
	
	
	@GetMapping("${path.getAccountById}")
	public Optional<SentAccount> findDocumentById(@PathVariable String id) {
	    return repo.findById(id);
	}
	
	

	@GetMapping("/test")
	public String test() {
		return "end points work";
	}

}
