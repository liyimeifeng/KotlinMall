// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.message.injection.component;

import android.content.Context;
import com.kotlin.base.injection.component.ActivityComponent;
import com.kotlin.message.data.repository.MessageRepository_Factory;
import com.kotlin.message.injection.module.MessageModule;
import com.kotlin.message.injection.module.MessageModule_ProvideMessageServiceFactory;
import com.kotlin.message.presenter.MessagePresenter;
import com.kotlin.message.presenter.MessagePresenter_Factory;
import com.kotlin.message.presenter.MessagePresenter_MembersInjector;
import com.kotlin.message.service.MessageService;
import com.kotlin.message.service.impl.MessageServiceImpl;
import com.kotlin.message.service.impl.MessageServiceImpl_Factory;
import com.kotlin.message.service.impl.MessageServiceImpl_MembersInjector;
import com.kotlin.message.ui.fragment.MessageFragment;
import com.kotlin.message.ui.fragment.MessageFragment_MembersInjector;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerMessageComponent implements MessageComponent {
  private Provider<LifecycleProvider<?>> lifecycleProvider;

  private Provider<Context> contextProvider;

  private MembersInjector<MessageServiceImpl> messageServiceImplMembersInjector;

  private Provider<MessageServiceImpl> messageServiceImplProvider;

  private Provider<MessageService> provideMessageServiceProvider;

  private MembersInjector<MessagePresenter> messagePresenterMembersInjector;

  private Provider<MessagePresenter> messagePresenterProvider;

  private MembersInjector<MessageFragment> messageFragmentMembersInjector;

  private DaggerMessageComponent(Builder builder) {
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

    this.messageServiceImplMembersInjector =
        MessageServiceImpl_MembersInjector.create(MessageRepository_Factory.create());

    this.messageServiceImplProvider =
        MessageServiceImpl_Factory.create(messageServiceImplMembersInjector);

    this.provideMessageServiceProvider =
        MessageModule_ProvideMessageServiceFactory.create(
            builder.messageModule, messageServiceImplProvider);

    this.messagePresenterMembersInjector =
        MessagePresenter_MembersInjector.create(
            lifecycleProvider, contextProvider, provideMessageServiceProvider);

    this.messagePresenterProvider =
        MessagePresenter_Factory.create(messagePresenterMembersInjector);

    this.messageFragmentMembersInjector =
        MessageFragment_MembersInjector.create(messagePresenterProvider);
  }

  @Override
  public void inject(MessageFragment fragment) {
    messageFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private MessageModule messageModule;

    private ActivityComponent activityComponent;

    private Builder() {}

    public MessageComponent build() {
      if (messageModule == null) {
        this.messageModule = new MessageModule();
      }
      if (activityComponent == null) {
        throw new IllegalStateException(
            ActivityComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerMessageComponent(this);
    }

    public Builder messageModule(MessageModule messageModule) {
      this.messageModule = Preconditions.checkNotNull(messageModule);
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