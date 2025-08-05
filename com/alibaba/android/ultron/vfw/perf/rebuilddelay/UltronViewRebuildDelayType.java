package com.alibaba.android.ultron.vfw.perf.rebuilddelay;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface UltronViewRebuildDelayType {
    public static final String rebuildWhenIdle = "rebuildWhenIdle";
    public static final String rebuildWhenIdleOrLastItemVisible = "rebuildWhenIdleOrLastItemVisible";
}
