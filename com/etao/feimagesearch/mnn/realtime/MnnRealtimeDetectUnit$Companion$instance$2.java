package com.etao.feimagesearch.mnn.realtime;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class MnnRealtimeDetectUnit$Companion$instance$2 extends Lambda implements ruk<i> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MnnRealtimeDetectUnit$Companion$instance$2 INSTANCE = new MnnRealtimeDetectUnit$Companion$instance$2();

    public MnnRealtimeDetectUnit$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final i mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("176bc79a", new Object[]{this}) : new i(null);
    }
}
