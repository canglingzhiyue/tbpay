package com.alibaba.analytics.core.logbuilder;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f2086a;
    private long b;
    private String c;
    private String d = "";
    private final AtomicInteger e = new AtomicInteger(0);
    private final AtomicInteger f = new AtomicInteger(0);
    private final Set<String> g = new HashSet();
    private final Set<String> h = new HashSet();
    private final HashMap<String, AtomicInteger> i = new HashMap<>();
    private final AtomicInteger j = new AtomicInteger(0);

    static {
        kge.a(1225060620);
        f2086a = new f();
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6fb8f885", new Object[0]) : f2086a;
    }

    private f() {
        d();
    }

    public synchronized long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        apr.b("SessionTimeAndIndexMgr", "changeSession");
        d();
    }

    public synchronized void a(String str, Map<String, String> map) {
        int i;
        int incrementAndGet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if ("1".equals(com.alibaba.analytics.core.config.f.a().a("ut_old_index"))) {
            map.put(LogField.RESERVE3.toString(), String.format("%s%06d", this.d, Integer.valueOf(this.e.incrementAndGet())));
            map.put(LogField.START_SESSION_TIMESTAMP.toString(), this.c);
            return;
        }
        long j = 0;
        if (!this.g.contains(str)) {
            i = this.f.incrementAndGet();
        } else {
            i = this.f.get();
        }
        long j2 = i;
        if (this.h.contains(str)) {
            AtomicInteger atomicInteger = this.i.get(str);
            if (atomicInteger != null) {
                incrementAndGet = atomicInteger.incrementAndGet();
            }
            map.put(LogField.RESERVE3.toString(), String.format("%s%06d,%s%06d", this.d, Long.valueOf(j2), this.d, Long.valueOf(j)));
            map.put(LogField.START_SESSION_TIMESTAMP.toString(), this.c);
        }
        incrementAndGet = this.j.incrementAndGet();
        j = incrementAndGet;
        map.put(LogField.RESERVE3.toString(), String.format("%s%06d,%s%06d", this.d, Long.valueOf(j2), this.d, Long.valueOf(j)));
        map.put(LogField.START_SESSION_TIMESTAMP.toString(), this.c);
    }

    private synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = System.currentTimeMillis();
        this.c = "" + this.b;
        if (!TextUtils.isEmpty(this.c)) {
            if (this.c.length() >= 2) {
                this.d = this.c.substring(this.c.length() - 2);
            } else {
                this.d = this.c;
            }
        }
        this.e.set(0);
        this.f.set(0);
        this.g.clear();
        this.g.add("65501");
        this.g.add("65502");
        this.g.add("65503");
        this.g.add("19998");
        this.g.add("19997");
        this.h.clear();
        this.h.add("1010");
        this.h.add("1023");
        this.h.add("2001");
        this.h.add("2101");
        this.h.add("2201");
        this.h.add("2202");
        this.h.add("65501");
        this.h.add("65502");
        this.h.add("65503");
        this.h.add("19998");
        this.h.add("19997");
        this.h.add("2006");
        this.i.clear();
        this.i.put("1010", new AtomicInteger(0));
        this.i.put("1023", new AtomicInteger(0));
        this.i.put("2001", new AtomicInteger(0));
        this.i.put("2101", new AtomicInteger(0));
        this.i.put("2201", new AtomicInteger(0));
        this.i.put("2202", new AtomicInteger(0));
        this.i.put("65501", new AtomicInteger(0));
        this.i.put("65502", new AtomicInteger(0));
        this.i.put("65503", new AtomicInteger(0));
        this.i.put("19998", new AtomicInteger(0));
        this.i.put("19997", new AtomicInteger(0));
        this.i.put("2006", new AtomicInteger(0));
        this.j.set(0);
    }
}
