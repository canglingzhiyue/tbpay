package com.taobao.tao.combo;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<c> f19888a = new ArrayList<>();

    static {
        kge.a(1356643760);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b5d435", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.f19888a.add(cVar);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f19888a.size();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f19888a.clear();
        }
    }

    public c a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fa10a728", new Object[]{this, new Integer(i)}) : this.f19888a.get(i);
    }
}
