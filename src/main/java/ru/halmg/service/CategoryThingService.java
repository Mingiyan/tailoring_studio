package ru.halmg.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.halmg.api.ServiceCRUD;
import ru.halmg.model.CategoryThing;
import ru.halmg.repository.CategoryThingRepositoryData;

import java.util.List;
import java.util.Optional;

public class CategoryThingService implements ServiceCRUD<String, CategoryThing> {

    @Autowired
    private CategoryThingRepositoryData categoryThingRepositoryData;

    @Override
    public void save(CategoryThing object) {
        categoryThingRepositoryData.save(object);
    }

    @Override
    public Optional<CategoryThing> findById(String id) {
        return categoryThingRepositoryData.findById(id);
    }

    @Override
    public CategoryThing update(CategoryThing object) {
        return categoryThingRepositoryData.save(object);
    }

    @Override
    public void remove(CategoryThing object) {
        categoryThingRepositoryData.delete(object);
    }

    @Override
    public List<CategoryThing> findAll() {
        return categoryThingRepositoryData.findAll();
    }
}
