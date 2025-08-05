package com.taobao.metrickit;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile n<String, Integer, Void> f18089a;
    private static final Object b = new Object();
    private static final Map<String, Integer> c = new ConcurrentHashMap();

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
        } else if (f18089a == null) {
            synchronized (b) {
                if (f18089a != null) {
                    f18089a.a(str, Integer.valueOf(i));
                } else {
                    c.put(str, Integer.valueOf(i));
                }
            }
        } else {
            f18089a.a(str, Integer.valueOf(i));
        }
    }

    public static void a(n<String, Integer, Void> nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9e6125", new Object[]{nVar});
            return;
        }
        synchronized (b) {
            f18089a = nVar;
            if (!c.isEmpty()) {
                for (Map.Entry<String, Integer> entry : c.entrySet()) {
                    f18089a.a(entry.getKey(), entry.getValue());
                }
                c.clear();
            }
        }
    }
}
