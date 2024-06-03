package com.kucharek.fifa;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;


@Repository
public interface MatchRepo extends MongoRepository<Matches, ObjectId>{
}
