package com.taobao.android.litecreator.util;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LCPerformanceTrace";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f13509a;

    static {
        kge.a(-945054027);
        f13509a = new HashMap();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f13509a.put(str, new a(str, SystemClock.elapsedRealtime()));
        }
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue();
        }
        if (!f13509a.containsKey(str)) {
            return -1L;
        }
        a remove = f13509a.remove(str);
        long elapsedRealtime = SystemClock.elapsedRealtime() - remove.b;
        u.d(TAG, remove.f13510a + " cost:" + elapsedRealtime + "ms");
        return elapsedRealtime;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f13510a;
        public long b;

        static {
            kge.a(534939586);
        }

        public a(String str, long j) {
            this.f13510a = str;
            this.b = j;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return StringUtils.equals(this.f13510a, ((a) obj).f13510a);
            }
            return false;
        }
    }
}
