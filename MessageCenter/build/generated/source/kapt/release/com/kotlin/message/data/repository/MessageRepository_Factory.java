// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.message.data.repository;

import dagger.internal.Factory;

public final class MessageRepository_Factory implements Factory<MessageRepository> {
  private static final MessageRepository_Factory INSTANCE = new MessageRepository_Factory();

  @Override
  public MessageRepository get() {
    return new MessageRepository();
  }

  public static Factory<MessageRepository> create() {
    return INSTANCE;
  }
}