package com.taobao.zcache.core;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.PackUpdateFinishedCallback;
import com.taobao.zcache.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, i> f23642a;
    private static final ConcurrentHashMap<s, Boolean> b;
    private static final AtomicBoolean c;
    private static final ArrayList<i> d;

    static {
        kge.a(424196968);
        f23642a = new HashMap<>();
        d = new ArrayList<>();
        b = new ConcurrentHashMap<>();
        c = new AtomicBoolean(false);
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        final ArrayList arrayList = new ArrayList();
        synchronized (f23642a) {
            i iVar = f23642a.get(str);
            if (iVar != null) {
                arrayList.add(iVar);
            }
            Iterator<i> it = d.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.b == UpdateMatchType.Prefix) {
                    if (str.startsWith(next.f23646a)) {
                        arrayList.add(next);
                    }
                } else if (str.endsWith(next.f23646a)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList.size() <= 0) {
            return;
        }
        e.a(new Runnable() { // from class: com.taobao.zcache.core.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).a(str);
                }
            }
        });
    }

    public static void a(String str, PackUpdateFinishedCallback packUpdateFinishedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8ad954", new Object[]{str, packUpdateFinishedCallback});
            return;
        }
        synchronized (f23642a) {
            i iVar = f23642a.get(str);
            if (iVar == null) {
                iVar = new i(str);
                if (StringUtils.isEmpty(iVar.f23646a)) {
                    return;
                }
                f23642a.put(str, iVar);
                if (iVar.b != UpdateMatchType.Full) {
                    d.add(iVar);
                }
            }
            iVar.a(packUpdateFinishedCallback);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        c.set(true);
        for (Map.Entry<s, Boolean> entry : b.entrySet()) {
            entry.getKey().a(i);
            if (entry.getValue().booleanValue()) {
                b.remove(entry.getKey());
            }
        }
    }

    public static void a(s sVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c175ab3a", new Object[]{sVar, new Boolean(z)});
        } else if (z && c.get()) {
        } else {
            b.put(sVar, Boolean.valueOf(z));
        }
    }
}
