package ru.halmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.halmg.model.Request;

public interface RequestRepositoryData extends JpaRepository<Request, String> {
}
