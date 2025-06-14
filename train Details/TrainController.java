package com.sves.train.TrainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sves.train.TrainEntity.TrainEntity;
import com.sves.train.TrainService.TrainService;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService trainService;
   

    @GetMapping
    public List<TrainEntity> getAllTrains() {
        return trainService.getAllTrains();
    }

    @PostMapping
    public TrainEntity addTrain(@RequestBody TrainEntity train) {
        return trainService.saveTrain(train);
    }

    @GetMapping("/{trainNo}")
    public TrainEntity getTrain(@PathVariable String trainNo) {
        return trainService.getTrainById(trainNo);
    }

    @DeleteMapping("/{trainNo}")
    public void deleteTrain(@PathVariable String trainNo) {
        trainService.deleteTrain(trainNo);
    }
}
