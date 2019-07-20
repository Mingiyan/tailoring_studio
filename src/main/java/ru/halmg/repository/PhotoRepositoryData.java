package ru.halmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.halmg.model.Photo;

public interface PhotoRepositoryData extends JpaRepository<Photo, String> {
}
