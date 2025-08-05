package com.taobao.alivfssdk.fresco.cache.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger;
import tb.kge;

/* loaded from: classes.dex */
public class e implements CacheErrorLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static e f8502a;

    @Override // com.taobao.alivfssdk.fresco.cache.common.CacheErrorLogger
    public void a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544b1d21", new Object[]{this, cacheErrorCategory, str, str2, th});
        }
    }

    static {
        kge.a(-726240941);
        kge.a(1352952625);
        f8502a = null;
    }

    private e() {
    }

    public static synchronized e a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("19090ad3", new Object[0]);
            }
            if (f8502a == null) {
                f8502a = new e();
            }
            return f8502a;
        }
    }
}
