package com.taobao.tao.messagekit.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.model.DataReceiveMonitor;
import com.taobao.tao.messagekit.core.model.IProtocol;
import com.taobao.tao.powermsg.common.StreamFullLinkMonitor;
import tb.kge;

/* loaded from: classes8.dex */
public class b<M extends IProtocol> implements Comparable<b<M>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public M f20780a;
    public int b;
    public String c;
    public int d;
    public String e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public boolean m;
    public Object n;
    public DataReceiveMonitor o;
    public StreamFullLinkMonitor p;
    public int q;

    static {
        kge.a(1891856368);
        kge.a(415966670);
    }

    public b(M m) {
        this.k = 0;
        this.l = 60;
        this.m = false;
        this.o = null;
        this.f20780a = m;
        this.b = m.sysCode();
    }

    public b(b<M> bVar) {
        this(bVar.f20780a);
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.n = bVar.n;
        this.q = bVar.q;
    }

    public int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da6724de", new Object[]{this, bVar})).intValue() : (bVar == null || bVar.f20780a == null || !this.f20780a.getID().equals(bVar.f20780a.getID())) ? 1 : 0;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue() : a((b) obj);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "dataId =" + this.c + " dataSourceType=" + this.d + " connectionType=" + this.k + " sysCode" + this.b;
    }
}
