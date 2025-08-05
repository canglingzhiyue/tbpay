package android.taobao.windvane.export.network;

import tb.kge;

/* loaded from: classes2.dex */
public class Constants {
    public static final String EVENT_INTERCEPT_TIMEOUT = "interceptTimeout";
    public static final String EVENT_PREFETCH_EXPIRED = "prefetchExpired";
    public static final String EVENT_PREFETCH_TIMING = "prefetchTiming";
    public static final String TAG = "Themis/Performance/RequestPrefetch";

    /* loaded from: classes2.dex */
    public @interface ImagePrefetchMode {
        public static final int BLACK_LIST = 1;
        public static final int DISABLED = 2;
        public static final int WHITE_LIST = 0;
    }

    static {
        kge.a(1219599543);
    }
}
