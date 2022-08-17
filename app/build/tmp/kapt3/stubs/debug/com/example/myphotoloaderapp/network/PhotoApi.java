package com.example.myphotoloaderapp.network;

import com.example.myphotoloaderapp.BuildConfig;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/myphotoloaderapp/network/PhotoApi;", "", "searchPhoto", "Lcom/example/myphotoloaderapp/network/PhotoResponse;", "query", "", "page", "", "perPage", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface PhotoApi {
    public static final com.example.myphotoloaderapp.network.PhotoApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCESS_KEY = "XVnsZlEUSduNJux8gHGWYb27hhTeOOiSrq-HerXrDnM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.unsplash.com/";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/photos")
    @retrofit2.http.Headers(value = {"Accept-Version: v1", "Authorization: Client-ID XVnsZlEUSduNJux8gHGWYb27hhTeOOiSrq-HerXrDnM"})
    public abstract java.lang.Object searchPhoto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.myphotoloaderapp.network.PhotoResponse> p3);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/myphotoloaderapp/network/PhotoApi$Companion;", "", "()V", "ACCESS_KEY", "", "BASE_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCESS_KEY = "XVnsZlEUSduNJux8gHGWYb27hhTeOOiSrq-HerXrDnM";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.unsplash.com/";
        
        private Companion() {
            super();
        }
    }
}