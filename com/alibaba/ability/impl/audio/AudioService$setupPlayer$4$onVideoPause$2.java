package com.alibaba.ability.impl.audio;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes2.dex */
public final class AudioService$setupPlayer$4$onVideoPause$2 extends Lambda implements ruw<k, i, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isByUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioService$setupPlayer$4$onVideoPause$2(boolean z) {
        super(2);
        this.$isByUser = z;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(k kVar, i iVar) {
        invoke2(kVar, iVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(k listener, i info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177b1e0d", new Object[]{this, listener, info});
            return;
        }
        q.d(listener, "listener");
        q.d(info, "info");
        listener.a(info, this.$isByUser);
    }
}
