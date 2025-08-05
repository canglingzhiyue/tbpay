package com.alibaba.ability.impl.audio;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

/* loaded from: classes2.dex */
public final class AudioService$setupPlayer$5$onSkipToPrevious$1 extends Lambda implements ruw<k, i, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AudioService$setupPlayer$5$onSkipToPrevious$1 INSTANCE = new AudioService$setupPlayer$5$onSkipToPrevious$1();

    public AudioService$setupPlayer$5$onSkipToPrevious$1() {
        super(2);
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
        listener.b();
    }
}
