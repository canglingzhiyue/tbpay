package com.taobao.android.weex_framework.module.builtin;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final WeakHashMap<Activity, a> b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f16036a = new ConcurrentHashMap();

    static {
        kge.a(-1978220845);
        b = new WeakHashMap<>();
    }

    private static synchronized a a(Activity activity) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e5fbf2fd", new Object[]{activity});
            }
            a aVar = b.get(activity);
            if (aVar == null) {
                aVar = new a();
                b.put(activity, aVar);
            }
            return aVar;
        }
    }

    public static String a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b7b3081c", new Object[]{activity, str}) : a(activity).f16036a.get(str);
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
            return;
        }
        Map<String, String> map = a(activity).f16036a;
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public static void b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635bd785", new Object[]{activity, str});
        } else {
            a(activity).f16036a.remove(str);
        }
    }
}
