package com.lhfff.cardealerapi.repository;

import com.lhfff.cardealerapi.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("PostRepository")
public interface PostRepository extends MongoRepository<Post, String> {
}
