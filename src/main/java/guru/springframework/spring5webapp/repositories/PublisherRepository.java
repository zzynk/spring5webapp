package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zunk on 02/09/21.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
