package com.alibaba.ability.impl.audio;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes2.dex */
public final class AudioService$setupPlayer$4$onVideoProgressChanged$2 extends Lambda implements ruw<k, i, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $cache;
    public final /* synthetic */ int $current;
    public final /* synthetic */ int $total;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioService$setupPlayer$4$onVideoProgressChanged$2(int i, int i2, int i3) {
        super(2);
        this.$current = i;
        this.$total = i2;
        this.$cache = i3;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(k kVar, i iVar) {
        invoke2(kVar, iVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(k listener, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177b1e0d", new Object[]{this, listener, iVar});
            return;
        }
        q.d(listener, "listener");
        q.d(iVar, "<anonymous parameter 1>");
        l lVar = new l(true);
        lVar.b = this.$current;
        lVar.d = this.$total;
        lVar.c = (lVar.d * this.$cache) / 100;
        t tVar = t.INSTANCE;
        listener.a(lVar);
    }
}
