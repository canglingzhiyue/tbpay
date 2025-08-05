package com.taobao.android.autosize;

import android.app.Activity;
import android.content.res.Configuration;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public interface OnScreenChangedListener {
    public static final int SCREEN_LANDSCAPE_LAYOUT = 2;
    public static final int SCREEN_PORTRAIT_LAYOUT = 1;

    /* renamed from: com.taobao.android.autosize.OnScreenChangedListener$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static void $default$onActivityChanged(OnScreenChangedListener onScreenChangedListener, Activity activity, int i, Configuration configuration) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ScreenChangeType {
    }

    void onActivityChanged(Activity activity, int i, Configuration configuration);

    void onScreenChanged(int i, Configuration configuration);
}
