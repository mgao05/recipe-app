package guru.springframework.Domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryType;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipies;
}
