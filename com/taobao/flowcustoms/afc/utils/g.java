package com.taobao.flowcustoms.afc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArraySet<a> f17190a;

    /* loaded from: classes7.dex */
    public interface a {
        void a(Map<String, Object> map);
    }

    public static /* synthetic */ CopyOnWriteArraySet a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("a936fee1", new Object[0]) : f17190a;
    }

    static {
        kge.a(1227458479);
        f17190a = new CopyOnWriteArraySet<>();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24150cd0", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            f17190a.add(aVar);
        }
    }

    public static void a(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            d.b.a(new Runnable() { // from class: com.taobao.flowcustoms.afc.utils.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Iterator it = g.a().iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).a(map);
                        }
                    } catch (Throwable unused) {
                        c.b("linkx", "AfcFlowStatusHelper === notifyForFlowEnter error");
                    }
                }
            });
        }
    }

    public static void b(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else {
            d.b.a(new Runnable() { // from class: com.taobao.flowcustoms.afc.utils.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Iterator it = g.a().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    } catch (Throwable unused) {
                        c.b("linkx", "AfcFlowStatusHelper === notifyForFlowLeave error");
                    }
                }
            });
        }
    }
}
