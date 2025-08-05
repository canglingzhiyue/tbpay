package com.taobao.metrickit;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_MEMORY_COLLECTED = 15;
    public static final int EVENT_POWER_SAVE_MODE_OFF = 93;
    public static final int EVENT_POWER_SAVE_MODE_ON = 92;

    /* renamed from: a  reason: collision with root package name */
    private static b f18090a;
    private static final Object b = new Object();
    private static final Map<Integer, List<a>> c = new HashMap();

    /* loaded from: classes7.dex */
    public interface a {
        void a(int i, Map<String, ?> map);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a(int i, a aVar);
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7dd4c", new Object[]{bVar});
            return;
        }
        synchronized (b) {
            f18090a = bVar;
            for (Map.Entry<Integer, List<a>> entry : c.entrySet()) {
                if (entry.getValue() != null) {
                    for (a aVar : entry.getValue()) {
                        bVar.a(entry.getKey().intValue(), aVar);
                    }
                }
            }
        }
    }

    public static void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25002660", new Object[]{new Integer(i), aVar});
            return;
        }
        b bVar = f18090a;
        if (bVar != null) {
            bVar.a(i, aVar);
        }
        synchronized (b) {
            if (f18090a == null) {
                List<a> list = c.get(Integer.valueOf(i));
                if (list == null) {
                    list = new ArrayList<>();
                    c.put(Integer.valueOf(i), list);
                }
                list.add(aVar);
                return;
            }
            f18090a.a(i, aVar);
        }
    }
}
