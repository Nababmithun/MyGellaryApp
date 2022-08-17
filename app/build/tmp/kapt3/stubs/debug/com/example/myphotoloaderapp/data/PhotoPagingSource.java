package com.example.myphotoloaderapp.data;

import androidx.paging.PagingSource;
import com.example.myphotoloaderapp.network.PhotoApi;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myphotoloaderapp/data/PhotoPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "api", "Lcom/example/myphotoloaderapp/network/PhotoApi;", "query", "", "(Lcom/example/myphotoloaderapp/network/PhotoApi;Ljava/lang/String;)V", "getApi", "()Lcom/example/myphotoloaderapp/network/PhotoApi;", "setApi", "(Lcom/example/myphotoloaderapp/network/PhotoApi;)V", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PhotoPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.example.myphotoloaderapp.data.MyPhoto> {
    @org.jetbrains.annotations.NotNull()
    private com.example.myphotoloaderapp.network.PhotoApi api;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String query;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.myphotoloaderapp.data.MyPhoto>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myphotoloaderapp.network.PhotoApi getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.network.PhotoApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public PhotoPagingSource(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.network.PhotoApi api, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        super();
    }
}