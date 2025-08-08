package com.taobao.android.trade.event;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, d> f15622a;

    static {
        kge.a(-2128913666);
        f15622a = new ConcurrentHashMap<>();
    }

    public static d a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("80903ea2", new Object[]{str}) : a(str, d.c);
    }

    public static d a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("bf6273a5", new Object[]{str, eVar});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (f15622a.containsKey(str)) {
            return f15622a.get(str);
        }
        d dVar = new d(eVar);
        f15622a.put(str, dVar);
        return dVar;
    }

    public static d a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("73be02d0", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return a(obj.getClass().getSimpleName() + obj.hashCode());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str) || !f15622a.containsKey(str)) {
        } else {
            f15622a.get(str).c();
            f15622a.remove(str);
        }
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
        } else if (obj == null) {
        } else {
            b(obj.getClass().getSimpleName() + obj.hashCode());
        }
    }

    public static void a(Object obj, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd07eb2c", new Object[]{obj, event});
            return;
        }
        d a2 = a(obj);
        if (a2 == null) {
            return;
        }
        a2.a(event);
    }

    public static <T extends i> void a(Object obj, Event event, c<T> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca6168b", new Object[]{obj, event, cVar});
            return;
        }
        d a2 = a(obj);
        if (a2 == null) {
            return;
        }
        a2.a(event, cVar);
    }
}
