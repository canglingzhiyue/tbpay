package com.ut.mini;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.rqk;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f24144a;
    private static long b;

    static {
        kge.a(553169860);
        f24144a = 0L;
        b = 0L;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        synchronized (o.class) {
            f24144a++;
        }
    }

    public static long b() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        synchronized (o.class) {
            j = f24144a;
        }
        return j;
    }

    public static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        synchronized (o.class) {
            map.put("utpvid", "" + f24144a);
            map.put("utpvid-b", "" + b);
            b = f24144a;
        }
        return map;
    }

    public static Map<String, String> a(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5be173f", new Object[]{new Integer(i), map});
        }
        if (i != 2001) {
            return map;
        }
        if (map == null) {
            return null;
        }
        synchronized (o.class) {
            f24144a++;
            map.put("utpvid", "" + f24144a);
            map.put("utpvid-b", "" + b);
            b = f24144a;
        }
        return map;
    }

    public static Map<String, String> b(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1c96d700", new Object[]{new Integer(i), map});
        }
        if (map == null) {
            return null;
        }
        if (i != 19999 && i != 1010 && !rqk.getInstance().isInForeground()) {
            map.put("utbg", "1");
        }
        if (i == 2001) {
            return map;
        }
        synchronized (o.class) {
            if (i != 19999) {
                map.put("utpvid", "" + f24144a);
                map.remove("utpvid-b");
            } else {
                map.remove("utpvid");
                map.remove("utpvid-b");
            }
        }
        return map;
    }
}
