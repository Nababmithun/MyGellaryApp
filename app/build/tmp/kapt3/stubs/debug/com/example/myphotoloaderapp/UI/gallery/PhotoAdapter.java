package com.example.myphotoloaderapp.UI.gallery;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.myphotoloaderapp.R;
import com.example.myphotoloaderapp.data.MyPhoto;
import com.example.myphotoloaderapp.databinding.ItemPhotoBinding;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0012\u0013\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$PhotoViewHolder;", "listener", "Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$OnItemPressListener;", "(Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$OnItemPressListener;)V", "getListener", "()Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$OnItemPressListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DIFF_CALLBACK", "OnItemPressListener", "PhotoViewHolder", "app_debug"})
public final class PhotoAdapter extends androidx.paging.PagingDataAdapter<com.example.myphotoloaderapp.data.MyPhoto, com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.PhotoViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.OnItemPressListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.PhotoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.PhotoViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.OnItemPressListener getListener() {
        return null;
    }
    
    public PhotoAdapter(@org.jetbrains.annotations.NotNull()
    com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.OnItemPressListener listener) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$PhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/myphotoloaderapp/databinding/ItemPhotoBinding;", "(Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter;Lcom/example/myphotoloaderapp/databinding/ItemPhotoBinding;)V", "bind", "", "photo", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "app_debug"})
    public final class PhotoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.myphotoloaderapp.databinding.ItemPhotoBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.myphotoloaderapp.data.MyPhoto photo) {
        }
        
        public PhotoViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.myphotoloaderapp.databinding.ItemPhotoBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$OnItemPressListener;", "", "OnItemClick", "", "photo", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "app_debug"})
    public static abstract interface OnItemPressListener {
        
        public abstract void OnItemClick(@org.jetbrains.annotations.NotNull()
        com.example.myphotoloaderapp.data.MyPhoto photo);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/myphotoloaderapp/UI/gallery/PhotoAdapter$DIFF_CALLBACK;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/myphotoloaderapp/data/MyPhoto;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DIFF_CALLBACK extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.myphotoloaderapp.data.MyPhoto> {
        public static final com.example.myphotoloaderapp.UI.gallery.PhotoAdapter.DIFF_CALLBACK INSTANCE = null;
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.myphotoloaderapp.data.MyPhoto oldItem, @org.jetbrains.annotations.NotNull()
        com.example.myphotoloaderapp.data.MyPhoto newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.myphotoloaderapp.data.MyPhoto oldItem, @org.jetbrains.annotations.NotNull()
        com.example.myphotoloaderapp.data.MyPhoto newItem) {
            return false;
        }
        
        private DIFF_CALLBACK() {
            super();
        }
    }
}