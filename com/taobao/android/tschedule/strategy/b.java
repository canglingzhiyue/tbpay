package com.taobao.android.tschedule.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.jmc;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f15669a = null;
    private final List<a> b = new ArrayList();

    /* loaded from: classes6.dex */
    interface a {
        void a(d dVar, d dVar2);
    }

    static {
        kge.a(1808580701);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14031bf", new Object[]{this, aVar});
        } else {
            this.b.add(aVar);
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e5d95a", new Object[]{this, dVar});
            return;
        }
        d dVar2 = this.f15669a;
        if (dVar2 != null && !dVar2.equals(dVar)) {
            for (a aVar : this.b) {
                aVar.a(dVar2, dVar);
            }
        }
        this.f15669a = dVar;
        HashMap hashMap = new HashMap();
        hashMap.put("bizCode", dVar.c);
        jmc.a("downgrade", this.f15669a.b, "1.0", "TSchedule", "ArbitrateResult", hashMap);
    }
}
