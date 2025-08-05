package com.taobao.android.detail.core.standard.componentlifecycle.page;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface AliSDetailPageLifecycleActivityState {
    public static final int PAUSED = 4;
    public static final int RESUMED = 3;
    public static final int STARTED = 2;
    public static final int STOPPED = 5;
}
