package ru.halmg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "category_tbl")
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"categoryThings"})
public class CategoryThing {

    @Id
    private String categoryId;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryThing")
    private List<Thing> categoryThings;

    {
        this.categoryId = UUID.randomUUID().toString();
    }

    public CategoryThing(String name) {
        this.name = name;
    }
}
