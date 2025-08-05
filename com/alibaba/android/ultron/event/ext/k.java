package com.alibaba.android.ultron.event.ext;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class k extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f2595a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(com.alibaba.android.ultron.event.base.e eVar);
    }

    static {
        kge.a(825480337);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "5273961824614203275";
    }

    public k(a aVar) {
        this.f2595a = aVar;
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        a aVar = this.f2595a;
        if (aVar != null) {
            aVar.a(eVar);
        } else if (!(eVar.h() instanceof com.alibaba.android.ultron.vfw.instance.d)) {
        } else {
            ((com.alibaba.android.ultron.vfw.instance.d) eVar.h()).b(127);
        }
    }
}
