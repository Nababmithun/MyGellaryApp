package com.example.myphotoloaderapp.Util.Common;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.IdRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Extension method to set Status Bar Color and Status Bar Icon Color Type(dark/light)
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myphotoloaderapp/Util/Common/StatusIconColorType;", "", "(Ljava/lang/String;I)V", "Dark", "Light", "app_debug"})
public enum StatusIconColorType {
    /*public static final*/ Dark /* = new Dark() */,
    /*public static final*/ Light /* = new Light() */;
    
    StatusIconColorType() {
    }
}