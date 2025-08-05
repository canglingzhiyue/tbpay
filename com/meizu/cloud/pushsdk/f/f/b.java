package com.meizu.cloud.pushsdk.f.f;

import android.content.Context;
import com.meizu.cloud.pushsdk.f.g.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7969a = "b";
    private String b;
    private String c;
    private String d;
    private int e;
    private final String f = "SQLITE";
    private final AtomicBoolean g = new AtomicBoolean(false);
    private long h;
    private final long i;
    private final long j;
    private final Context k;

    public b(long j, long j2, TimeUnit timeUnit, Context context) {
        this.c = null;
        this.e = 0;
        this.i = timeUnit.toMillis(j);
        this.j = timeUnit.toMillis(j2);
        this.k = context;
        Map c = c();
        if (c != null) {
            try {
                String obj = c.get("userId").toString();
                String obj2 = c.get("sessionId").toString();
                int intValue = ((Integer) c.get("sessionIndex")).intValue();
                this.b = obj;
                this.e = intValue;
                this.c = obj2;
            } catch (Exception e) {
                com.meizu.cloud.pushsdk.f.g.c.b(f7969a, "Exception occurred retrieving session info from file: %s", e.getMessage());
            }
            g();
            f();
            com.meizu.cloud.pushsdk.f.g.c.c(f7969a, "Tracker Session Object created.", new Object[0]);
        }
        this.b = e.a();
        g();
        f();
        com.meizu.cloud.pushsdk.f.g.c.c(f7969a, "Tracker Session Object created.", new Object[0]);
    }

    private Map c() {
        return com.meizu.cloud.pushsdk.f.g.a.a("snowplow_session_vars", this.k);
    }

    private boolean e() {
        return com.meizu.cloud.pushsdk.f.g.a.a("snowplow_session_vars", d(), this.k);
    }

    private void f() {
        this.h = System.currentTimeMillis();
    }

    private void g() {
        this.d = this.c;
        this.c = e.a();
        this.e++;
        String str = f7969a;
        com.meizu.cloud.pushsdk.f.g.c.a(str, "Session information is updated:", new Object[0]);
        com.meizu.cloud.pushsdk.f.g.c.a(str, " + Session ID: %s", this.c);
        com.meizu.cloud.pushsdk.f.g.c.a(str, " + Previous Session ID: %s", this.d);
        com.meizu.cloud.pushsdk.f.g.c.a(str, " + Session Index: %s", Integer.valueOf(this.e));
        e();
    }

    public void a() {
        com.meizu.cloud.pushsdk.f.g.c.a(f7969a, "Checking and updating session information.", new Object[0]);
        if (!e.a(this.h, System.currentTimeMillis(), this.g.get() ? this.j : this.i)) {
            g();
            f();
        }
    }

    public com.meizu.cloud.pushsdk.f.b.b b() {
        com.meizu.cloud.pushsdk.f.g.c.c(f7969a, "Getting session context...", new Object[0]);
        f();
        return new com.meizu.cloud.pushsdk.f.b.b("client_session", d());
    }

    public Map d() {
        HashMap hashMap = new HashMap(8);
        hashMap.put("userId", this.b);
        hashMap.put("sessionId", this.c);
        hashMap.put("previousSessionId", this.d);
        hashMap.put("sessionIndex", Integer.valueOf(this.e));
        hashMap.put("storageMechanism", "SQLITE");
        return hashMap;
    }
}
