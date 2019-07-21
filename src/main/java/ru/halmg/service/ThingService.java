package ru.halmg.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.halmg.api.ServiceCRUD;
import ru.halmg.model.Thing;
import ru.halmg.repository.ThingRepositoryData;

import java.util.List;
import java.util.Optional;

public class ThingService implements ServiceCRUD<String, Thing> {

    @Autowired
    private ThingRepositoryData thingRepositoryData;

    @Override
    public void save(Thing object) {
        thingRepositoryData.save(object);
    }

    @Override
    public Optional<Thing> findById(String id) {
        return thingRepositoryData.findById(id);
    }

    @Override
    public Thing update(Thing object) {
        return thingRepositoryData.save(object);
    }

    @Override
    public void remove(Thing object) {
        thingRepositoryData.delete(object);
    }

    @Override
    public List<Thing> findAll() {
        return thingRepositoryData.findAll();
    }
}
