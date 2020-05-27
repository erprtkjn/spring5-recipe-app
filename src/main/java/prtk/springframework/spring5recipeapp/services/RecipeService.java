package prtk.springframework.spring5recipeapp.services;

import prtk.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    public Set<Recipe> getRecipes();
}
