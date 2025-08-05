package com.taobao.tao.remotebusiness;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class RequestPoolManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, b> f21014a;

    /* loaded from: classes8.dex */
    public interface Type {
        public static final String ANTI = "ANTI";
        public static final String AUTH = "AUTH";
        public static final String DEFAULT = "DEFAULT";
        public static final String SESSION = "SESSION";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes8.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(-1575802069);
        f21014a = new ConcurrentHashMap<>();
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("34ecb6a", new Object[]{str});
        }
        b bVar = f21014a.get(str);
        if (bVar == null) {
            synchronized (RequestPoolManager.class) {
                bVar = f21014a.get(str);
                if (bVar == null) {
                    bVar = new b();
                    f21014a.put(str, bVar);
                }
            }
        }
        return bVar;
    }
}
