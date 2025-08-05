package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.fvb;
import tb.fve;
import tb.rul;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class h implements fve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ rul f20251a;

    public h(rul rulVar) {
        this.f20251a = rulVar;
    }

    @Override // tb.fve
    public final /* synthetic */ void onNotificationListener(fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
        } else {
            q.b(this.f20251a.mo2421invoke(fvbVar), "invoke(...)");
        }
    }
}
