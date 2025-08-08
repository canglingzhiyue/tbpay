package com.taobao.android.behavix.feature;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAIKVStoreage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.jcm;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEHAVIX_IPV_FEATURE_NAME = "ipv";
    private static c c;
    private static List<b> d;

    /* renamed from: a  reason: collision with root package name */
    private final String f9185a = "BehaviXFeatureManager";
    private Map<Object, List<String>> b = new HashMap();
    private final jcm e;

    static {
        kge.a(259026798);
    }

    private c() {
        d = new ArrayList();
        this.e = new jcm();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("a54c800c", new Object[0]);
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.e.b();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e.c();
        }
    }

    public synchronized void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4607527", new Object[]{this, bVar});
            return;
        }
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(d);
            arrayList.add(bVar);
            if (arrayList.size() > 50) {
                arrayList.remove(0);
            }
            d = arrayList;
        }
    }

    public List<b> a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fee3ccab", new Object[]{this, str, new Long(j), str2});
        }
        ArrayList<b> arrayList = new ArrayList(d);
        ArrayList arrayList2 = new ArrayList();
        for (b bVar : arrayList) {
            if (j <= 0 || bVar.b >= j) {
                if (StringUtils.equals(str, bVar.f9184a) && (StringUtils.isEmpty(str2) || StringUtils.equals(str2, bVar.c))) {
                    arrayList2.add(bVar);
                }
            }
        }
        return arrayList2;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        boolean a2 = com.taobao.android.behavix.behavixswitch.a.a("enableNewIPV", com.taobao.android.testutils.b.a().b());
        DAIKVStoreage.put("BehaviX", "enableNewIPV", a2 + "");
    }
}
