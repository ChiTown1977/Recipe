package com.recipe.recipe.repository;

import com.recipe.recipe.entity.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Daniel Tominov on 1/10/2018
 */
public interface CategoryRepsoitory extends CrudRepository<Category, Long> {
}
