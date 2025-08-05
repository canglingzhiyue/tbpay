package com.alibaba.ability;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bfy;
import tb.ruk;

/* loaded from: classes2.dex */
public final class MegaUtils$sMegaSchedule$2 extends Lambda implements ruk<bfy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MegaUtils$sMegaSchedule$2 INSTANCE = new MegaUtils$sMegaSchedule$2();

    public MegaUtils$sMegaSchedule$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final bfy mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("3b33d692", new Object[]{this}) : new bfy("MegaKit", 3);
    }
}
