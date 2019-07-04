// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.ui.activity;

import com.kotlin.base.ui.activity.BaseMvpActivity;
import com.kotlin.goods.presenter.GoodsListPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class GoodsActivity_MembersInjector implements MembersInjector<GoodsActivity> {
  private final Provider<GoodsListPresenter> mPresenterProvider;

  public GoodsActivity_MembersInjector(Provider<GoodsListPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<GoodsActivity> create(
      Provider<GoodsListPresenter> mPresenterProvider) {
    return new GoodsActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(GoodsActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseMvpActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
