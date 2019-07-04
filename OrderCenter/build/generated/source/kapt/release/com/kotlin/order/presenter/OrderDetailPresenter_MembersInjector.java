// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.presenter;

import android.content.Context;
import com.kotlin.base.presenter.BasePresenter;
import com.kotlin.order.service.OrderService;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class OrderDetailPresenter_MembersInjector
    implements MembersInjector<OrderDetailPresenter> {
  private final Provider<LifecycleProvider<?>> lifecycleProvider;

  private final Provider<Context> contextProvider;

  private final Provider<OrderService> orderServiceProvider;

  public OrderDetailPresenter_MembersInjector(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<OrderService> orderServiceProvider) {
    assert lifecycleProvider != null;
    this.lifecycleProvider = lifecycleProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert orderServiceProvider != null;
    this.orderServiceProvider = orderServiceProvider;
  }

  public static MembersInjector<OrderDetailPresenter> create(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<OrderService> orderServiceProvider) {
    return new OrderDetailPresenter_MembersInjector(
        lifecycleProvider, contextProvider, orderServiceProvider);
  }

  @Override
  public void injectMembers(OrderDetailPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePresenter) instance).lifecycleProvider = lifecycleProvider.get();
    ((BasePresenter) instance).context = contextProvider.get();
    instance.orderService = orderServiceProvider.get();
  }
}
