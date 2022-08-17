package com.example.myphotoloaderapp.UI.gallery;

import com.example.myphotoloaderapp.data.PhotoRepository;
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
public final class GalleryViewModel_AssistedFactory_Factory implements Factory<GalleryViewModel_AssistedFactory> {
  private final Provider<PhotoRepository> repositoryProvider;

  public GalleryViewModel_AssistedFactory_Factory(Provider<PhotoRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GalleryViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static GalleryViewModel_AssistedFactory_Factory create(
      Provider<PhotoRepository> repositoryProvider) {
    return new GalleryViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static GalleryViewModel_AssistedFactory newInstance(Provider<PhotoRepository> repository) {
    return new GalleryViewModel_AssistedFactory(repository);
  }
}
