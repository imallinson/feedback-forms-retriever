package feedbackformsretriever.rest;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import feedbackformsretriever.persistence.domain.SentCohort;
import feedbackformsretriever.persistence.repository.MongoCohortRepo;

@CrossOrigin
@RequestMapping("${path.base3}")
@RestController
public class SentCohortRest {
	
	@Autowired
	private MongoCohortRepo repo;
	
	@GetMapping("${path.getCohortbyId}")
	public Optional<SentCohort> findCohortByID(@PathVariable String id) {
	    return repo.findById(id);
	}

    @GetMapping("${path.getCohorts}")
    public Collection<SentCohort> getAllCohorts() {
        return repo.findAll();
    }

}
