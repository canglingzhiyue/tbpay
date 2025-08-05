package com.taobao.application.common;

import android.app.Activity;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IScrollListener {
    public static final int SCROLL_TYPE_FINGER = 1;
    public static final int SCROLL_TYPE_VIEW = 2;

    /* renamed from: com.taobao.application.common.IScrollListener$-CC  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final /* synthetic */ class CC {
        public static void $default$onScrollEnd(IScrollListener iScrollListener, Activity activity, int i, String str) {
        }

        @Deprecated
        public static void $default$onScrollEnd(IScrollListener iScrollListener, Activity activity, String str) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ScrollType {
    }

    void onDoFrame(long j);

    void onScrollEnd(Activity activity, int i, String str);

    @Deprecated
    void onScrollEnd(Activity activity, String str);

    void onScrollStart(Activity activity, int i);

    void onStopMonitorDoFrame();
}
