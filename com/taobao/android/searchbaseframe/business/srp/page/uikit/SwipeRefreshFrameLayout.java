package com.taobao.android.searchbaseframe.business.srp.page.uikit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import tb.kge;

/* loaded from: classes6.dex */
public class SwipeRefreshFrameLayout {
    public static final int STATUS_EXPAND = 10002;
    public static final int STATUS_FOLD = 10001;
    public static final int STATUS_HIDDEN = 10003;

    @Target({ElementType.PARAMETER, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SceneLayerStatus {
    }

    static {
        kge.a(1500361832);
    }
}
