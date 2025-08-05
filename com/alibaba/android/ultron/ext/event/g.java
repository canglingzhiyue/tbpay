package com.alibaba.android.ultron.ext.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f2612a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(com.alibaba.android.ultron.event.base.e eVar);
    }

    static {
        kge.a(-1668858735);
    }

    public g(a aVar) {
        this.f2612a = aVar;
    }

    @Override // com.alibaba.android.ultron.ext.event.j
    public void a_(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4329866", new Object[]{this, eVar});
            return;
        }
        a aVar = this.f2612a;
        if (aVar != null) {
            aVar.a(eVar);
        } else if (!(eVar.h() instanceof com.alibaba.android.ultron.vfw.instance.d)) {
        } else {
            ((com.alibaba.android.ultron.vfw.instance.d) eVar.h()).b(127);
        }
    }
}
