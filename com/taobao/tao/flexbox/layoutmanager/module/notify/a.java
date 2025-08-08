package com.taobao.tao.flexbox.layoutmanager.module.notify;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFY_ID = "notifyId";

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, g.b> f20462a = new HashMap<>();

    static {
        kge.a(-249572120);
    }

    public final Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.f20462a.keySet();
    }

    public void a(String str, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
        } else {
            this.f20462a.put(cVar.a("notifyId", String.valueOf(System.currentTimeMillis())), new g.b(cVar));
        }
    }

    public void b(String str, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89deb1ec", new Object[]{this, str, cVar});
            return;
        }
        Set<Map.Entry<String, g.b>> entrySet = this.f20462a.entrySet();
        if (entrySet == null) {
            return;
        }
        Iterator<Map.Entry<String, g.b>> it = entrySet.iterator();
        while (it.hasNext()) {
            if (a(it.next().getValue().f19937a, cVar)) {
                it.remove();
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f20462a.clear();
        }
    }

    public void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        g.b bVar = this.f20462a.get(str);
        if (bVar == null) {
            return;
        }
        bVar.f19937a.c.a(bVar.f19937a, map);
    }

    public static boolean a(g.c cVar, g.c cVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fed33ccc", new Object[]{cVar, cVar2})).booleanValue();
        }
        if (cVar == cVar2) {
            return true;
        }
        String a2 = cVar.a("notifyId", "");
        return !StringUtils.isEmpty(a2) && StringUtils.equals(a2, cVar2.a("notifyId", ""));
    }
}
