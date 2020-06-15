package guru.springframework.Domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipies;

    public Category() {
    }


    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Set<Recipe> getRecipies() {
        return this.recipies;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecipies(Set<Recipe> recipies) {
        this.recipies = recipies;
    }

    public String toString() {
        return "Category(id=" + this.getId() + ", description=" + this.getDescription() + ", recipies=" + this.getRecipies() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Category)) return false;
        final Category other = (Category) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$recipies = this.getRecipies();
        final Object other$recipies = other.getRecipies();
        if (this$recipies == null ? other$recipies != null : !this$recipies.equals(other$recipies)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Category;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $recipies = this.getRecipies();
        result = result * PRIME + ($recipies == null ? 43 : $recipies.hashCode());
        return result;
    }
}
