package com.example.myphotoloaderapp.di;

import com.example.myphotoloaderapp.network.PhotoApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApiFactory implements Factory<PhotoApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PhotoApi get() {
    return provideApi(retrofitProvider.get());
  }

  public static AppModule_ProvideApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiFactory(retrofitProvider);
  }

  public static PhotoApi provideApi(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
