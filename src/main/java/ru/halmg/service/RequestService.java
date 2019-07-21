package ru.halmg.service;


import org.springframework.beans.factory.annotation.Autowired;
import ru.halmg.api.ServiceCRUD;
import ru.halmg.model.Request;
import ru.halmg.repository.RequestRepositoryData;

import java.util.List;
import java.util.Optional;

public class RequestService implements ServiceCRUD<String, Request> {

    @Autowired
    private RequestRepositoryData requestRepositoryData;

    @Override
    public void save(Request object) {
        requestRepositoryData.save(object);
    }

    @Override
    public Optional<Request> findById(String id) {
        return requestRepositoryData.findById(id);
    }

    @Override
    public Request update(Request object) {
        return requestRepositoryData.save(object);
    }

    @Override
    public void remove(Request object) {
        requestRepositoryData.delete(object);
    }

    @Override
    public List<Request> findAll() {
        return requestRepositoryData.findAll();
    }
}
