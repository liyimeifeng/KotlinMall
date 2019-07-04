// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.injection.module;

import com.kotlin.goods.service.CategoryService;
import com.kotlin.goods.service.impl.CategoryServiceImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class CategoryModule_ProvideCategoryServiceFactory
    implements Factory<CategoryService> {
  private final CategoryModule module;

  private final Provider<CategoryServiceImpl> categoryServiceProvider;

  public CategoryModule_ProvideCategoryServiceFactory(
      CategoryModule module, Provider<CategoryServiceImpl> categoryServiceProvider) {
    assert module != null;
    this.module = module;
    assert categoryServiceProvider != null;
    this.categoryServiceProvider = categoryServiceProvider;
  }

  @Override
  public CategoryService get() {
    return Preconditions.checkNotNull(
        module.provideCategoryService(categoryServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CategoryService> create(
      CategoryModule module, Provider<CategoryServiceImpl> categoryServiceProvider) {
    return new CategoryModule_ProvideCategoryServiceFactory(module, categoryServiceProvider);
  }
}
