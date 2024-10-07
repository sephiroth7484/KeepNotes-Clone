package org.example.services;

import org.example.model.model;
import org.example.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class serviceImpl implements service {

    @Autowired
    repo JPARepoObj;
    @Override
    public void addModel(model m) {
    this.JPARepoObj.save(m);
    }

    @Override
    public List<model> getAllModels() {
        return this.JPARepoObj.findAll();
    }

    @Override
    public Optional<model> getModelById(long id) {
        return this.JPARepoObj.findById(id);
    }
}
