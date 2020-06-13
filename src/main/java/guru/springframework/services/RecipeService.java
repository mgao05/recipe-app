package guru.springframework.services;

import guru.springframework.Domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipies();
}
