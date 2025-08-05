package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class MNNManager$Companion$instance$2 extends Lambda implements ruk<f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MNNManager$Companion$instance$2 INSTANCE = new MNNManager$Companion$instance$2();

    public MNNManager$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final f mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("52ca3a6a", new Object[]{this}) : new f(null);
    }
}
