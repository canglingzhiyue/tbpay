package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class AutoDetectExtraInfoCache$Companion$instance$2 extends Lambda implements ruk<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AutoDetectExtraInfoCache$Companion$instance$2 INSTANCE = new AutoDetectExtraInfoCache$Companion$instance$2();

    public AutoDetectExtraInfoCache$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final b mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4e41415", new Object[]{this}) : new b(null);
    }
}
