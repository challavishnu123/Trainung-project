package com.sves.train.TrainService;
import com.sves.train.TrainEntity.TrainEntity;
import com.sves.train.TrainRepository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    @Autowired
    private TrainRepository trainRepo;

    public List<TrainEntity> getAllTrains() {
        return trainRepo.findAll();
    }

    public TrainEntity saveTrain(TrainEntity train) {
        return trainRepo.save(train);
    }

    public TrainEntity getTrainById(String trainNo) {
        return trainRepo.findById(trainNo).orElse(null);
    }

    public void deleteTrain(String trainNo) {
        trainRepo.deleteById(trainNo);
    }
}
