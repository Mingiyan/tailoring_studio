package ru.halmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.halmg.model.Thing;

public interface ThingRepositoryData extends JpaRepository<Thing, String> {
}
