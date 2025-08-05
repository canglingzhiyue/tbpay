package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes7.dex */
public final class ClientIntelligenceHelper$Companion$instance$2 extends Lambda implements ruk<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ClientIntelligenceHelper$Companion$instance$2 INSTANCE = new ClientIntelligenceHelper$Companion$instance$2();

    public ClientIntelligenceHelper$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final b mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("74e16d0b", new Object[]{this}) : new b();
    }
}
