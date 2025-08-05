package com.alibaba.ability;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bfy;
import tb.ruk;

/* loaded from: classes2.dex */
public final class MegaUtils$sAbilitySchedule$2 extends Lambda implements ruk<bfy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MegaUtils$sAbilitySchedule$2 INSTANCE = new MegaUtils$sAbilitySchedule$2();

    public MegaUtils$sAbilitySchedule$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final bfy mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("3b33d692", new Object[]{this}) : new bfy("MegaAbility", 3);
    }
}
