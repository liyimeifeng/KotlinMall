// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.injection.module;

import com.kotlin.goods.service.GoodsService;
import com.kotlin.goods.service.impl.GoodsServiceImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class GoodsModule_ProvideGoodserviceFactory implements Factory<GoodsService> {
  private final GoodsModule module;

  private final Provider<GoodsServiceImpl> goodsServiceProvider;

  public GoodsModule_ProvideGoodserviceFactory(
      GoodsModule module, Provider<GoodsServiceImpl> goodsServiceProvider) {
    assert module != null;
    this.module = module;
    assert goodsServiceProvider != null;
    this.goodsServiceProvider = goodsServiceProvider;
  }

  @Override
  public GoodsService get() {
    return Preconditions.checkNotNull(
        module.provideGoodservice(goodsServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GoodsService> create(
      GoodsModule module, Provider<GoodsServiceImpl> goodsServiceProvider) {
    return new GoodsModule_ProvideGoodserviceFactory(module, goodsServiceProvider);
  }
}