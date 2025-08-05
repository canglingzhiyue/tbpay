package com.taobao.android.tbabilitykit;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bfy;
import tb.ruk;

/* loaded from: classes6.dex */
public final class BatchCompExposureAbility$Companion$exposureScheduler$2 extends Lambda implements ruk<bfy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BatchCompExposureAbility$Companion$exposureScheduler$2 INSTANCE = new BatchCompExposureAbility$Companion$exposureScheduler$2();

    public BatchCompExposureAbility$Companion$exposureScheduler$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final bfy mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("3b33d692", new Object[]{this}) : new bfy("batchExposure", 3);
    }
}
