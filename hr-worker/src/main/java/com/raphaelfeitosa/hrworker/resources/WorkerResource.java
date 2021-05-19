package com.raphaelfeitosa.hrworker.resources;

import java.util.List;

import com.raphaelfeitosa.hrworker.entities.Worker;
import com.raphaelfeitosa.hrworker.repositories.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {

        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {

        Worker obj = workerRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
