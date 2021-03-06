package com.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.recipe.domain.Recipe;
import com.recipe.service.RecipeService;

@Controller
@RequestMapping("/recipe/")
public class RecipeController {
  @Autowired RecipeService recipeService;
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo, 
      @RequestParam(defaultValue="4") int pageSize,
      Model model) {
    model.addAttribute("list",recipeService.getRecipeList(pageNo, pageSize));
    return "list";
  }
  
  @RequestMapping(path="add",method=RequestMethod.GET)
  public String form() {
    return "recipe/form";
  }
  
  @RequestMapping(path="add",method=RequestMethod.POST)
  public String add(Recipe recipe) {
    recipeService.addRecipe(recipe);
    return "redirect:list.do";
  }
  
  
}
