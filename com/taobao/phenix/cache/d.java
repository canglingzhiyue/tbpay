package com.taobao.phenix.cache;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class d<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public K f18865a;
    public V b;
    public int c;
    public int d;
    public d<K, V> e;
    public d<K, V> f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        kge.a(-1563762408);
    }

    public d(K k, V v, int i) {
        a(k, v, i);
    }

    public void a(d<K, V> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b67cae", new Object[]{this, dVar});
            return;
        }
        d<K, V> dVar2 = this.e;
        if (dVar2 != null && dVar2 != this) {
            dVar2.f = this.f;
        }
        d<K, V> dVar3 = this.f;
        if (dVar3 != null && dVar3 != this) {
            dVar3.e = this.e;
        }
        this.f = dVar;
        d<K, V> dVar4 = dVar.e;
        if (dVar4 != null) {
            dVar4.f = this;
        }
        this.e = dVar.e;
        dVar.e = this;
    }

    public void a(K k, V v, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1051de3", new Object[]{this, k, v, new Integer(i)});
            return;
        }
        this.f18865a = k;
        this.b = v;
        this.d = 1;
        this.c = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LruNode@" + hashCode() + "[key:" + this.f18865a + ", value:" + this.b + ", visitCount:" + this.d + ", size:" + this.c + ", isColdNode:" + this.g + ", unlinked:" + this.h + riy.ARRAY_END_STR;
    }
}
