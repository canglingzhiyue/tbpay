package com.taobao.analysis.flow;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.monitor.a;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, a> f8543a = new HashMap<>();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f8544a;
        public double b;
        public HashMap<String, Integer> c;
        public HashMap<String, Integer> d;

        public a(HashMap<String, Integer> hashMap, HashMap<String, Integer> hashMap2, double d, double d2) {
            this.c = hashMap;
            this.d = hashMap2;
            this.f8544a = d;
            this.b = d2;
        }
    }

    public void a(a.C0338a c0338a, HashMap<String, a> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a94faa3", new Object[]{this, c0338a, hashMap});
        } else if (hashMap == null) {
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            if (c0338a.f8584a.d) {
                hashMap2.put(c0338a.f8584a.c, 1);
            } else {
                hashMap3.put(c0338a.f8584a.c, 1);
            }
            hashMap.put(c0338a.f8584a.b, new a(hashMap2, hashMap3, c0338a.b.doubleValue(), c0338a.c.doubleValue()));
        } else {
            a aVar = hashMap.get(c0338a.f8584a.b);
            if (aVar == null) {
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                if (c0338a.f8584a.d) {
                    hashMap4.put(c0338a.f8584a.c, 1);
                } else {
                    hashMap5.put(c0338a.f8584a.c, 1);
                }
                hashMap.put(c0338a.f8584a.b, new a(hashMap4, hashMap5, c0338a.b.doubleValue(), c0338a.c.doubleValue()));
            } else if (c0338a.f8584a.d) {
                aVar.f8544a += c0338a.b.doubleValue();
                if (aVar.c.get(c0338a.f8584a.c) == null) {
                    aVar.c.put(c0338a.f8584a.c, 1);
                } else {
                    aVar.c.put(c0338a.f8584a.c, Integer.valueOf(aVar.c.get(c0338a.f8584a.c).intValue() + 1));
                }
            } else {
                aVar.b += c0338a.c.doubleValue();
                if (aVar.d.get(c0338a.f8584a.c) == null) {
                    aVar.d.put(c0338a.f8584a.c, 1);
                } else {
                    aVar.d.put(c0338a.f8584a.c, Integer.valueOf(aVar.d.get(c0338a.f8584a.c).intValue() + 1));
                }
            }
        }
    }
}
