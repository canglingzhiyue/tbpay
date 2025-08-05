package com.etao.feimagesearch.intelli.realtime;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class DataPool$Companion$instance$2 extends Lambda implements ruk<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DataPool$Companion$instance$2 INSTANCE = new DataPool$Companion$instance$2();

    public DataPool$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final a mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8771c888", new Object[]{this}) : new a(null);
    }
}
