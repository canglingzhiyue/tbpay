package com.taobao.android.detail.core.perf;

import android.app.Activity;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.monitor.procedure.s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Long> f9781a;

    static {
        kge.a(401188215);
        f9781a = new ConcurrentHashMap(10);
        emu.a("com.taobao.android.detail.core.perf.TimeTrace");
    }

    public static void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{activity, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            f9781a.put(str, Long.valueOf(SystemClock.uptimeMillis()));
            b.a(activity, "ProductDetail_FirstScreen", str);
        }
    }

    public static void b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635bd785", new Object[]{activity, str});
        } else if (StringUtils.isEmpty(str) || f9781a.get(str) == null) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (f9781a.containsKey(str)) {
                long longValue = f9781a.get(str).longValue();
                f9781a.remove(str);
                i.a("detail.TimeTrace." + str, "spend " + (uptimeMillis - longValue) + "ms");
            }
            b.b(activity, "ProductDetail_FirstScreen", str);
        }
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            f9781a.put(str, Long.valueOf(SystemClock.uptimeMillis()));
            b.a(activity, str2, str);
        }
    }

    public static void b(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fe0a0f", new Object[]{activity, str, str2});
        } else if (StringUtils.isEmpty(str) || f9781a.get(str) == null) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (f9781a.containsKey(str)) {
                long longValue = f9781a.get(str).longValue();
                f9781a.remove(str);
                i.a("detail.TimeTrace." + str, "spend " + (uptimeMillis - longValue) + "ms");
            }
            b.b(activity, str2, str);
        }
    }

    public static void a(Activity activity, String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8658bc84", new Object[]{activity, str, new Long(j), new Long(j2)});
            return;
        }
        com.alibaba.android.spindle.stage.a aVar = new com.alibaba.android.spindle.stage.a();
        aVar.f2422a = str;
        aVar.b = j;
        aVar.c = j2;
        aVar.a();
        i.a("detail.TimeTrace." + str, "spend " + (j2 - j) + "ms");
        b.a(activity, "ProductDetail_FirstScreen", aVar);
    }

    public static void a(Activity activity, String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f322ce", new Object[]{activity, str, str2, new Long(j), new Long(j2)});
            return;
        }
        com.alibaba.android.spindle.stage.a aVar = new com.alibaba.android.spindle.stage.a();
        aVar.f2422a = str;
        aVar.b = j;
        aVar.c = j2;
        aVar.a();
        i.a("detail.TimeTrace." + str, "spend " + (j2 - j) + "ms");
        b.a(activity, str2, aVar);
    }

    public static void a(Activity activity, String str, String str2, long j, long j2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d702f7", new Object[]{activity, str, str2, new Long(j), new Long(j2), map});
            return;
        }
        com.alibaba.android.spindle.stage.a aVar = new com.alibaba.android.spindle.stage.a();
        aVar.f2422a = str;
        aVar.b = j;
        aVar.c = j2;
        aVar.a();
        i.a("detail.TimeTrace." + str, "spend " + (j2 - j) + "ms");
        b.a(activity, str2, aVar, s.f18233a.b(activity), map);
    }
}
