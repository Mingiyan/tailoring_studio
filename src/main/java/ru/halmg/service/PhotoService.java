package ru.halmg.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.halmg.api.ServiceCRUD;
import ru.halmg.model.Photo;
import ru.halmg.repository.PhotoRepositoryData;

import java.util.List;
import java.util.Optional;

public class PhotoService implements ServiceCRUD<String, Photo> {

    @Autowired
    private PhotoRepositoryData photoRepositoryData;

    @Override
    public void save(Photo object) {
        photoRepositoryData.save(object);
    }

    @Override
    public Optional<Photo> findById(String id) {
        return photoRepositoryData.findById(id);
    }

    @Override
    public Photo update(Photo object) {
        return photoRepositoryData.save(object);
    }

    @Override
    public void remove(Photo object) {
        photoRepositoryData.delete(object);
    }

    @Override
    public List<Photo> findAll() {
        return photoRepositoryData.findAll();
    }
}
