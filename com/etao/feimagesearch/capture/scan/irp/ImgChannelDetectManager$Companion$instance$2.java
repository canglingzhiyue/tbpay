package com.etao.feimagesearch.capture.scan.irp;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ImgChannelDetectManager$Companion$instance$2 extends Lambda implements ruk<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ImgChannelDetectManager$Companion$instance$2 INSTANCE = new ImgChannelDetectManager$Companion$instance$2();

    public ImgChannelDetectManager$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final c mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a31e8e0f", new Object[]{this}) : new c(null);
    }
}
