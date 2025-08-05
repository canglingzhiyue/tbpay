package com.taobao.taobaoavsdk.cache.library;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2096200657);
    }

    public static <T> T a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9798556e", new Object[]{t});
        }
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    public static <T> T a(T t, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a12221e4", new Object[]{t, str});
        }
        if (t == null) {
            throw new NullPointerException(str);
        }
        return t;
    }

    public static void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{new Boolean(z), str});
        } else if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
