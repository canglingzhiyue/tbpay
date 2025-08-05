package com.taobao.infoflow.core.engine.env.protocol;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IInfoFlowDarkMode {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface TBDrawType {
        public static final int BACKGROUND = 2;
        public static final int FOREGROUND_DRAWABLE = 1;
        public static final int FOREGROUND_TEXT = 0;
        public static final int UNSPECIFIED = 3;
    }

    boolean a(Context context);
}
