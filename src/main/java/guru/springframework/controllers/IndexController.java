package guru.springframework.controllers;

import guru.springframework.Domain.Category;
import guru.springframework.Domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
//    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepositoryure;
//
//    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepositoryure) {
//        this.categoryRepository = categoryRepository;
//        this.unitOfMeasureRepositoryure = unitOfMeasureRepositoryure;
//    }
//
//    @RequestMapping({"","/","/index"})
//    public String getIndexPage(){
//        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepositoryure.findByDescription("Teaspoon");
//
//        System.out.println("Cat Id is:"+categoryOptional.get().getId());
//        System.out.println("UOM Id is:" + unitOfMeasureOptional.get().getId());
//        return "index";
//    }
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipies", recipeService.getRecipies());
        return "index";
    }
}
