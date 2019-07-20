package ru.halmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.halmg.model.CategoryThing;

public interface CategoryThingRepositoryData extends JpaRepository<CategoryThing, String> {
}
