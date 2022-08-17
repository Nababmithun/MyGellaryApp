package com.example.myphotoloaderapp.data;

import com.example.myphotoloaderapp.network.PhotoApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PhotoRepository_Factory implements Factory<PhotoRepository> {
  private final Provider<PhotoApi> apiProvider;

  public PhotoRepository_Factory(Provider<PhotoApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public PhotoRepository get() {
    return newInstance(apiProvider.get());
  }

  public static PhotoRepository_Factory create(Provider<PhotoApi> apiProvider) {
    return new PhotoRepository_Factory(apiProvider);
  }

  public static PhotoRepository newInstance(PhotoApi api) {
    return new PhotoRepository(api);
  }
}
