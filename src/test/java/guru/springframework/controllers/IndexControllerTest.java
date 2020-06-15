package guru.springframework.controllers;

import guru.springframework.Domain.Recipe;
import guru.springframework.services.RecipeServiceImpl;
import org.aspectj.weaver.patterns.IVerificationRequired;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    @Mock
    RecipeServiceImpl recipeService;
    @Mock
    Model model;

    IndexController controller;

    @Before
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new IndexController(recipeService);
    }


    @Test
    void getIndexPage() throws Exception{

        //given
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());
        recipes.add(new Recipe());

        when(recipeService.getRecipies()).thenReturn(recipes);

        //when
        String viewName = controller.getIndexPage(model);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
        //then
        assertEquals("index", viewName);
        verify(recipeService, times(1)).getRecipies();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());

        Set<Recipe> setInController = argumentCaptor.getValue();
        assertEquals(2,setInController.size());
    }




}