package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public interface IDeviceInfo {
    public static final int SCREEN_LARGE = 3;
    public static final int SCREEN_MAX = 4;
    public static final int SCREEN_MEDIUM = 2;
    public static final int SCREEN_MIN = 0;
    public static final int SCREEN_SMALL = 1;
    public static final int SCREEN_UNKNOWN = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface ScreenType {
    }

    Rect a(Activity activity);

    JSONObject a(Context context);

    float b(Context context);

    int b(Activity activity);

    String c(Context context);

    boolean c();

    boolean c(Activity activity);

    boolean e();

    boolean f();

    int g();
}
