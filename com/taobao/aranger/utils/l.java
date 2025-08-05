package com.taobao.aranger.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kak;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f16379a;

    static {
        kge.a(1183286162);
        f16379a = new ConcurrentHashMap<>();
    }

    private static void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{str, new Long(j)});
        } else {
            f16379a.put(str, Long.valueOf(j));
        }
    }

    public static boolean a(String str, long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123b0d6", new Object[]{str, new Long(j)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            kak.b("TimeMeter", "isTimeOut() illegalArguments", new Object[0]);
            return false;
        }
        synchronized (l.class) {
            Long l = f16379a.get(str);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (l != null) {
                if (elapsedRealtime <= l.longValue()) {
                    z = false;
                }
                if (z) {
                    b(str, elapsedRealtime + j);
                }
                return z;
            }
            b(str, elapsedRealtime + j);
            return true;
        }
    }
}
