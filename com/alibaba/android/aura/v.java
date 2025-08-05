package com.alibaba.android.aura;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class v implements y {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile y b;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Integer, List<s>> f2217a = new ConcurrentHashMap<>();

    static {
        kge.a(859209038);
        kge.a(-1067255988);
    }

    public static y a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y) ipChange.ipc$dispatch("3c3ead0f", new Object[0]);
        }
        if (b == null) {
            synchronized (v.class) {
                if (b == null) {
                    b = new v();
                }
            }
        }
        return b;
    }

    @Override // com.alibaba.android.aura.y
    public void a(Context context, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fc9fc7", new Object[]{this, context, sVar});
        } else if (sVar == null) {
        } else {
            int identityHashCode = System.identityHashCode(context);
            List<s> list = this.f2217a.get(Integer.valueOf(identityHashCode));
            if (list == null) {
                list = new ArrayList<>();
                this.f2217a.put(Integer.valueOf(identityHashCode), list);
            }
            synchronized (this.f2217a) {
                a(list, sVar);
            }
        }
    }

    private void a(List<s> list, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0ba540", new Object[]{this, list, sVar});
            return;
        }
        s a2 = a(list, sVar.c().d());
        if (a2 != null) {
            list.remove(a2);
        }
        list.add(sVar);
    }

    private s a(List<s> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("a7b654fa", new Object[]{this, list, str});
        }
        for (s sVar : list) {
            if (str.equals(sVar.c().d())) {
                return sVar;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.aura.y
    public void b(Context context, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e9b6e6", new Object[]{this, context, sVar});
        } else if (sVar == null) {
        } else {
            int identityHashCode = System.identityHashCode(context);
            Iterator<Map.Entry<Integer, List<s>>> it = this.f2217a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, List<s>> next = it.next();
                List<s> value = next.getValue();
                if (identityHashCode == next.getKey().intValue()) {
                    synchronized (this.f2217a) {
                        value.remove(sVar);
                        if (value.isEmpty()) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    @Override // com.alibaba.android.aura.y
    public List<s> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("962721e7", new Object[]{this, context});
        }
        int identityHashCode = System.identityHashCode(context);
        for (Integer num : this.f2217a.keySet()) {
            if (num.intValue() == identityHashCode) {
                return this.f2217a.get(Integer.valueOf(identityHashCode));
            }
        }
        return null;
    }

    @Override // com.alibaba.android.aura.y
    public s a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("4cc13e4b", new Object[]{this, str});
        }
        for (s sVar : b()) {
            if (str.equals(sVar.c().d())) {
                return sVar;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.aura.y
    public List<s> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (List<s> list : this.f2217a.values()) {
            synchronized (this.f2217a) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}
