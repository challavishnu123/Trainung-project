
package com.sves.train.TrainRepository;

import com.sves.train.TrainEntity.TrainEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainRepository extends MongoRepository<TrainEntity, String> {
}
