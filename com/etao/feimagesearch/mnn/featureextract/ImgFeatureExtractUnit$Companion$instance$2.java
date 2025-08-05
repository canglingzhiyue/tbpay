package com.etao.feimagesearch.mnn.featureextract;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ImgFeatureExtractUnit$Companion$instance$2 extends Lambda implements ruk<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ImgFeatureExtractUnit$Companion$instance$2 INSTANCE = new ImgFeatureExtractUnit$Companion$instance$2();

    public ImgFeatureExtractUnit$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final d mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("24449f", new Object[]{this}) : new d(null);
    }
}
