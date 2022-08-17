package com.example.myphotoloaderapp.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofit();
  }

  public static AppModule_ProvideRetrofitFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofit() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRetrofit(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideRetrofitFactory INSTANCE = new AppModule_ProvideRetrofitFactory();
  }
}
