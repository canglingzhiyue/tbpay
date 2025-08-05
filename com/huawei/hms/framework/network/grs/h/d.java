package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f7439a = new ConcurrentHashMap(16);

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f7440a;
        private final long b;

        public a(long j, long j2) {
            this.f7440a = j;
            this.b = j2;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.b <= this.f7440a;
        }
    }

    public static a a(String str) {
        Logger.v("RequestUtil", "map size of get is before: " + f7439a.size());
        a aVar = f7439a.get(str);
        Logger.v("RequestUtil", "map size of get is after: " + f7439a.size());
        return aVar;
    }

    public static void a(String str, a aVar) {
        Logger.v("RequestUtil", "map size of put is before: " + f7439a.size());
        f7439a.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after: " + f7439a.size());
    }
}
