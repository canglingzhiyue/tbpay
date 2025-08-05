package com.taobao.monitor.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.s;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Object> f18142a = new HashMap();
    private static boolean b = true;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            ProcedureGlobal.a().c(str);
        }
    }

    public static synchronized void a(String str, Object obj) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
            } else if (b) {
                f18142a.put(str, obj);
            } else {
                s.f18233a.d().a(str, obj);
            }
        }
    }

    public static synchronized void a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            if (b) {
                b = false;
                for (Map.Entry<String, Object> entry : f18142a.entrySet()) {
                    s.f18233a.d().a(entry.getKey(), entry.getValue());
                }
                f18142a.clear();
            }
        }
    }
}
