package com.taobao.alivfssdk.cache;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class k<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public K f8496a;
    public V b;
    public int c;
    public int d;
    public k<K, V> e;
    public k<K, V> f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        kge.a(345720119);
    }

    public k(K k, V v, int i) {
        a(k, v, i);
    }

    public void a(k<K, V> kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c53946", new Object[]{this, kVar});
            return;
        }
        k<K, V> kVar2 = this.e;
        if (kVar2 != null && kVar2 != this) {
            kVar2.f = this.f;
        }
        k<K, V> kVar3 = this.f;
        if (kVar3 != null && kVar3 != this) {
            kVar3.e = this.e;
        }
        this.f = kVar;
        k<K, V> kVar4 = kVar.e;
        if (kVar4 != null) {
            kVar4.f = this;
        }
        this.e = kVar.e;
        kVar.e = this;
    }

    public void a(K k, V v, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1051de3", new Object[]{this, k, v, new Integer(i)});
            return;
        }
        this.f8496a = k;
        this.b = v;
        this.d = 1;
        this.c = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LruNode@" + hashCode() + "[key:" + this.f8496a + ", value:" + this.b + ", visitCount:" + this.d + ", size:" + this.c + ", isColdNode:" + this.g + ", unlinked:" + this.h + riy.ARRAY_END_STR;
    }
}
