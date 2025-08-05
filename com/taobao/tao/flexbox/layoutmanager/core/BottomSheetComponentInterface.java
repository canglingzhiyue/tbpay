package com.taobao.tao.flexbox.layoutmanager.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public interface BottomSheetComponentInterface {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface State {
        public static final String HALF = "half";
        public static final String HIDDEN = "hidden";
        public static final String INIT = "init";
        public static final String LARGE = "large";
        public static final String SMALL = "small";
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);
    }

    void addBottomSheetStateChangedListener(a aVar);

    boolean isInIdle();

    void removeBottomSheetStateChangedListener(a aVar);
}
