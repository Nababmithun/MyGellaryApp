package com.example.myphotoloaderapp.data;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.example.myphotoloaderapp.network.PhotoApi;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myphotoloaderapp/data/PhotoRepository;", "", "api", "Lcom/example/myphotoloaderapp/network/PhotoApi;", "(Lcom/example/myphotoloaderapp/network/PhotoApi;)V", "getApi", "()Lcom/example/myphotoloaderapp/network/PhotoApi;", "setApi", "getSearchResults", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "query", "", "app_debug"})
@javax.inject.Singleton()
public final class PhotoRepository {
    @org.jetbrains.annotations.NotNull()
    private com.example.myphotoloaderapp.network.PhotoApi api;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.myphotoloaderapp.data.MyPhoto>> getSearchResults(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myphotoloaderapp.network.PhotoApi getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.network.PhotoApi p0) {
    }
    
    @javax.inject.Inject()
    public PhotoRepository(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.network.PhotoApi api) {
        super();
    }
}