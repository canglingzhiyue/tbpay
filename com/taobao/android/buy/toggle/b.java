package com.taobao.android.buy.toggle;

import android.os.SystemClock;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import tb.arc;
import tb.ard;
import tb.bam;
import tb.bbh;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f9254a;
    private static final Map<String, String> b;
    private static final AtomicLong c;
    private static boolean d;

    public static /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            f();
        }
    }

    static {
        kge.a(-854351682);
        f9254a = EnvironmentSwitcher.a() == 0 ? "202312111115_4962" : "202312111152_2049";
        b = new ConcurrentHashMap();
        c = new AtomicLong(0L);
        d = false;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.buy.toggle.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.d();
                    }
                }
            });
        }
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        String a2 = bam.a("AB_", f9254a, "style", "");
        if (!StringUtils.isEmpty(a2)) {
            b.put("style", a2);
        }
        String a3 = bam.a("AB_", f9254a, c.KEY_POP_CONFIG, "");
        if (a3 == null) {
            return;
        }
        b.put(c.KEY_POP_CONFIG, a3);
        ard a4 = arc.a();
        a4.a("Cached bucket: " + a3);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!b.containsKey(str)) {
            f();
        }
        if (uptimeMillis - c.get() > 60000) {
            c.set(uptimeMillis);
            e();
        }
        return b.get(str);
    }

    public static Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
        }
        String a2 = a("style");
        String a3 = a(c.KEY_POP_CONFIG);
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(a3)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("styleABTest", Collections.singletonMap("style", a2));
        hashMap.put("popConfigABTest", Collections.singletonMap(c.KEY_POP_CONFIG, a3));
        return hashMap;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (!"true".equals(a.a("enableNewStyle", "true"))) {
            return null;
        }
        return a(c.KEY_POP_CONFIG);
    }
}
