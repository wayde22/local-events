package com.wadestevens.localevents.data;

import com.wadestevens.localevents.models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {
}
