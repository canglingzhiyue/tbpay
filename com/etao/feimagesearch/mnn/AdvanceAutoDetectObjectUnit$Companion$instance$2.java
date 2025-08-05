package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class AdvanceAutoDetectObjectUnit$Companion$instance$2 extends Lambda implements ruk<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AdvanceAutoDetectObjectUnit$Companion$instance$2 INSTANCE = new AdvanceAutoDetectObjectUnit$Companion$instance$2();

    public AdvanceAutoDetectObjectUnit$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final a mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4e413f6", new Object[]{this}) : new a(null);
    }
}
