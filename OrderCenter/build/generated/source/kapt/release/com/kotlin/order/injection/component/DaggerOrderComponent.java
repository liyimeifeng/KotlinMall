// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.injection.component;

import android.content.Context;
import com.kotlin.base.injection.component.ActivityComponent;
import com.kotlin.order.data.repository.OrderRepository_Factory;
import com.kotlin.order.injection.module.OrderModule;
import com.kotlin.order.injection.module.OrderModule_ProvideOrderserviceFactory;
import com.kotlin.order.presenter.OrderConfirmPresenter;
import com.kotlin.order.presenter.OrderConfirmPresenter_Factory;
import com.kotlin.order.presenter.OrderConfirmPresenter_MembersInjector;
import com.kotlin.order.presenter.OrderDetailPresenter;
import com.kotlin.order.presenter.OrderDetailPresenter_Factory;
import com.kotlin.order.presenter.OrderDetailPresenter_MembersInjector;
import com.kotlin.order.presenter.OrderListPresenter;
import com.kotlin.order.presenter.OrderListPresenter_Factory;
import com.kotlin.order.presenter.OrderListPresenter_MembersInjector;
import com.kotlin.order.service.OrderService;
import com.kotlin.order.service.impl.OrderServiceImpl;
import com.kotlin.order.service.impl.OrderServiceImpl_Factory;
import com.kotlin.order.service.impl.OrderServiceImpl_MembersInjector;
import com.kotlin.order.ui.activity.OrderConfirmActivity;
import com.kotlin.order.ui.activity.OrderConfirmActivity_MembersInjector;
import com.kotlin.order.ui.activity.OrderDetailActivity;
import com.kotlin.order.ui.activity.OrderDetailActivity_MembersInjector;
import com.kotlin.order.ui.fragment.OrderFragment;
import com.kotlin.order.ui.fragment.OrderFragment_MembersInjector;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerOrderComponent implements OrderComponent {
  private Provider<LifecycleProvider<?>> lifecycleProvider;

  private Provider<Context> contextProvider;

  private MembersInjector<OrderServiceImpl> orderServiceImplMembersInjector;

  private Provider<OrderServiceImpl> orderServiceImplProvider;

  private Provider<OrderService> provideOrderserviceProvider;

  private MembersInjector<OrderConfirmPresenter> orderConfirmPresenterMembersInjector;

  private Provider<OrderConfirmPresenter> orderConfirmPresenterProvider;

  private MembersInjector<OrderConfirmActivity> orderConfirmActivityMembersInjector;

  private MembersInjector<OrderListPresenter> orderListPresenterMembersInjector;

  private Provider<OrderListPresenter> orderListPresenterProvider;

  private MembersInjector<OrderFragment> orderFragmentMembersInjector;

  private MembersInjector<OrderDetailPresenter> orderDetailPresenterMembersInjector;

  private Provider<OrderDetailPresenter> orderDetailPresenterProvider;

  private MembersInjector<OrderDetailActivity> orderDetailActivityMembersInjector;

  private DaggerOrderComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.lifecycleProvider =
        new com_kotlin_base_injection_component_ActivityComponent_lifecycleProvider(
            builder.activityComponent);

    this.contextProvider =
        new com_kotlin_base_injection_component_ActivityComponent_context(
            builder.activityComponent);

    this.orderServiceImplMembersInjector =
        OrderServiceImpl_MembersInjector.create(OrderRepository_Factory.create());

    this.orderServiceImplProvider =
        OrderServiceImpl_Factory.create(orderServiceImplMembersInjector);

    this.provideOrderserviceProvider =
        OrderModule_ProvideOrderserviceFactory.create(
            builder.orderModule, orderServiceImplProvider);

    this.orderConfirmPresenterMembersInjector =
        OrderConfirmPresenter_MembersInjector.create(
            lifecycleProvider, contextProvider, provideOrderserviceProvider);

    this.orderConfirmPresenterProvider =
        OrderConfirmPresenter_Factory.create(orderConfirmPresenterMembersInjector);

    this.orderConfirmActivityMembersInjector =
        OrderConfirmActivity_MembersInjector.create(orderConfirmPresenterProvider);

    this.orderListPresenterMembersInjector =
        OrderListPresenter_MembersInjector.create(
            lifecycleProvider, contextProvider, provideOrderserviceProvider);

    this.orderListPresenterProvider =
        OrderListPresenter_Factory.create(orderListPresenterMembersInjector);

    this.orderFragmentMembersInjector =
        OrderFragment_MembersInjector.create(orderListPresenterProvider);

    this.orderDetailPresenterMembersInjector =
        OrderDetailPresenter_MembersInjector.create(
            lifecycleProvider, contextProvider, provideOrderserviceProvider);

    this.orderDetailPresenterProvider =
        OrderDetailPresenter_Factory.create(orderDetailPresenterMembersInjector);

    this.orderDetailActivityMembersInjector =
        OrderDetailActivity_MembersInjector.create(orderDetailPresenterProvider);
  }

  @Override
  public void inject(OrderConfirmActivity activity) {
    orderConfirmActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(OrderFragment fragment) {
    orderFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OrderDetailActivity activity) {
    orderDetailActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private OrderModule orderModule;

    private ActivityComponent activityComponent;

    private Builder() {}

    public OrderComponent build() {
      if (orderModule == null) {
        this.orderModule = new OrderModule();
      }
      if (activityComponent == null) {
        throw new IllegalStateException(
            ActivityComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerOrderComponent(this);
    }

    public Builder orderModule(OrderModule orderModule) {
      this.orderModule = Preconditions.checkNotNull(orderModule);
      return this;
    }

    public Builder activityComponent(ActivityComponent activityComponent) {
      this.activityComponent = Preconditions.checkNotNull(activityComponent);
      return this;
    }
  }

  private static class com_kotlin_base_injection_component_ActivityComponent_lifecycleProvider
      implements Provider<LifecycleProvider<?>> {
    private final ActivityComponent activityComponent;

    com_kotlin_base_injection_component_ActivityComponent_lifecycleProvider(
        ActivityComponent activityComponent) {
      this.activityComponent = activityComponent;
    }

    @Override
    public LifecycleProvider<?> get() {
      return Preconditions.checkNotNull(
          activityComponent.lifecycleProvider(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_kotlin_base_injection_component_ActivityComponent_context
      implements Provider<Context> {
    private final ActivityComponent activityComponent;

    com_kotlin_base_injection_component_ActivityComponent_context(
        ActivityComponent activityComponent) {
      this.activityComponent = activityComponent;
    }

    @Override
    public Context get() {
      return Preconditions.checkNotNull(
          activityComponent.context(), "Cannot return null from a non-@Nullable component method");
    }
  }
}