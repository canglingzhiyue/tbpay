package com.taobao.android.dinamicx;

import android.support.v4.util.LruCache;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ab;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final n f11915a;
    private final Map<String, LruCache<String, ab.a>> b = new ConcurrentHashMap();
    private final ReferenceQueue<DinamicXEngine> c = new ReferenceQueue<>();

    static {
        kge.a(1284307463);
        f11915a = new n();
    }

    public static n a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("a0545c7e", new Object[0]) : f11915a;
    }

    private n() {
    }

    public LruCache<String, ab.a> a(r rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("b3e51a9c", new Object[]{this, rVar, new Boolean(z)});
        }
        c();
        return b(rVar, z);
    }

    public void a(r rVar) {
        LruCache<String, ab.a> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea6dd3a", new Object[]{this, rVar});
            return;
        }
        c();
        if (rVar == null || (b = b(rVar, false)) == null) {
            return;
        }
        Iterator<Map.Entry<String, ab.a>> it = b.snapshot().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, ab.a> next = it.next();
            String key = next.getKey();
            ab.a value = next.getValue();
            if (key != null) {
                if (value == null || value.f11792a == null) {
                    it.remove();
                } else {
                    DXRuntimeContext dXRuntimeContext = value.f11792a.getDXRuntimeContext();
                    if (dXRuntimeContext == null) {
                        it.remove();
                    } else {
                        r C = dXRuntimeContext.C();
                        if (C == null || C.b() == rVar.b()) {
                            value.f11792a = null;
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    public ReferenceQueue<DinamicXEngine> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReferenceQueue) ipChange.ipc$dispatch("efc4106", new Object[]{this}) : this.c;
    }

    public LruCache<String, ab.a> b(r rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("ecc57b3b", new Object[]{this, rVar, new Boolean(z)});
        }
        if (rVar == null) {
            return null;
        }
        String p = rVar.p();
        LruCache<String, ab.a> lruCache = this.b.get(p);
        if (lruCache != null || !z) {
            return lruCache;
        }
        LruCache<String, ab.a> lruCache2 = new LruCache<>(rVar.o());
        this.b.put(p, lruCache2);
        return lruCache2;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        while (true) {
            Reference<? extends DinamicXEngine> poll = this.c.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof ab.a) {
                ab.a aVar = (ab.a) poll;
                if (aVar.f11792a != null && aVar.f11792a.getDXRuntimeContext() != null) {
                    DXRuntimeContext dXRuntimeContext = aVar.f11792a.getDXRuntimeContext();
                    LruCache<String, ab.a> b = b(dXRuntimeContext.C(), false);
                    if (b != null) {
                        String t = dXRuntimeContext.t();
                        if (!StringUtils.isEmpty(t)) {
                            b.remove(t);
                        }
                    }
                }
            }
        }
    }
}
