package com.taobao.android.detail.ttdetail.inside;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, b> f10766a;

    static {
        kge.a(2043032095);
        f10766a = new ConcurrentHashMap();
    }

    public static void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f5d7ed", new Object[]{str, bVar});
            return;
        }
        i.a("InsideLifecycleRegistrar", "registerInsideLifecycleObserver : " + str);
        if (str == null) {
            return;
        }
        f10766a.put(str, bVar);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        i.a("InsideLifecycleRegistrar", "unregisterInsideLifecycleObserver : " + str);
        if (!f10766a.containsKey(str)) {
            i.a("InsideLifecycleRegistrar", "no key : " + str);
            return;
        }
        f10766a.remove(str);
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("786eb081", new Object[]{str}) : f10766a.get(str);
    }
}
