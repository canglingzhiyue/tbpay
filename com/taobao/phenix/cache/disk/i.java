package com.taobao.phenix.cache.disk;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class i implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f18873a = {17};
    private Map<Integer, b> b = new HashMap();

    static {
        kge.a(729720604);
        kge.a(-1941644552);
    }

    @Override // com.taobao.phenix.cache.disk.e
    public synchronized b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f4b51b01", new Object[]{this, new Integer(i)});
        }
        for (int i2 : this.f18873a) {
            if (i2 == i) {
                return b(i);
            }
        }
        return null;
    }

    private synchronized b b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("85cee82", new Object[]{this, new Integer(i)});
        }
        b bVar = this.b.get(Integer.valueOf(i));
        if (bVar == null) {
            bVar = new h(i);
            this.b.put(Integer.valueOf(i), bVar);
        }
        return bVar;
    }

    @Override // com.taobao.phenix.cache.disk.e
    public synchronized Collection<b> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this});
        }
        for (int i : this.f18873a) {
            b(i);
        }
        return this.b.values();
    }
}
