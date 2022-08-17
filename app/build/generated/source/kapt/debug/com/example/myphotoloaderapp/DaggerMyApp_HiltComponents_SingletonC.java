package com.example.myphotoloaderapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.myphotoloaderapp.UI.gallery.GalleryFragment;
import com.example.myphotoloaderapp.UI.gallery.GalleryViewModel_AssistedFactory;
import com.example.myphotoloaderapp.UI.gallery.GalleryViewModel_AssistedFactory_Factory;
import com.example.myphotoloaderapp.data.PhotoRepository;
import com.example.myphotoloaderapp.di.AppModule;
import com.example.myphotoloaderapp.di.AppModule_ProvideApiFactory;
import com.example.myphotoloaderapp.di.AppModule_ProvideRetrofitFactory;
import com.example.myphotoloaderapp.network.PhotoApi;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMyApp_HiltComponents_SingletonC extends MyApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object photoApi = new MemoizedSentinel();

  private volatile Object photoRepository = new MemoizedSentinel();

  private volatile Provider<PhotoRepository> photoRepositoryProvider;

  private DaggerMyApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitFactory.provideRetrofit();
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private PhotoApi getPhotoApi() {
    Object local = photoApi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = photoApi;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideApiFactory.provideApi(getRetrofit());
          photoApi = DoubleCheck.reentrantCheck(photoApi, local);
        }
      }
    }
    return (PhotoApi) local;
  }

  private PhotoRepository getPhotoRepository() {
    Object local = photoRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = photoRepository;
        if (local instanceof MemoizedSentinel) {
          local = new PhotoRepository(getPhotoApi());
          photoRepository = DoubleCheck.reentrantCheck(photoRepository, local);
        }
      }
    }
    return (PhotoRepository) local;
  }

  private Provider<PhotoRepository> getPhotoRepositoryProvider() {
    Object local = photoRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      photoRepositoryProvider = (Provider<PhotoRepository>) local;
    }
    return (Provider<PhotoRepository>) local;
  }

  @Override
  public void injectMyApp(MyApp myApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MyApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public MyApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<GalleryViewModel_AssistedFactory> galleryViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private GalleryViewModel_AssistedFactory getGalleryViewModel_AssistedFactory() {
        return GalleryViewModel_AssistedFactory_Factory.newInstance(DaggerMyApp_HiltComponents_SingletonC.this.getPhotoRepositoryProvider());
      }

      private Provider<GalleryViewModel_AssistedFactory> getGalleryViewModel_AssistedFactoryProvider(
          ) {
        Object local = galleryViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          galleryViewModel_AssistedFactoryProvider = (Provider<GalleryViewModel_AssistedFactory>) local;
        }
        return (Provider<GalleryViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.example.myphotoloaderapp.UI.gallery.GalleryViewModel", (Provider) getGalleryViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApp_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public MyApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectGalleryFragment(GalleryFragment arg0) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public MyApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public MyApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.myphotoloaderapp.UI.gallery.GalleryViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getGalleryViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.myphotoloaderapp.data.PhotoRepository 
        return (T) DaggerMyApp_HiltComponents_SingletonC.this.getPhotoRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
