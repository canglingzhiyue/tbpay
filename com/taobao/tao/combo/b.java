package com.taobao.tao.combo;

import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.dataobject.ComboResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b b;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<Long, ComboResponse> f19881a = new LruCache<>(10);

    static {
        kge.a(510501717);
        b = null;
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6752379c", new Object[0]);
        }
        if (b == null) {
            b = new b();
        }
        return b;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            b = null;
        }
    }

    public void a(Long l, ComboResponse comboResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af969db0", new Object[]{this, l, comboResponse});
            return;
        }
        synchronized (this.f19881a) {
            if (l.longValue() >= 0 && comboResponse != null) {
                this.f19881a.put(l, comboResponse);
            }
        }
    }

    public ComboResponse a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComboResponse) ipChange.ipc$dispatch("df4be8ce", new Object[]{this, l});
        }
        if (l.longValue() >= 0) {
            return this.f19881a.get(l);
        }
        return null;
    }
}
