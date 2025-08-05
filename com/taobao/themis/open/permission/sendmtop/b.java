package com.taobao.themis.open.permission.sendmtop;

import kotlin.Metadata;
import mtopsdk.mtop.domain.EnvModeEnum;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(125545744);
        int[] iArr = new int[EnvModeEnum.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[EnvModeEnum.ONLINE.ordinal()] = 1;
        $EnumSwitchMapping$0[EnvModeEnum.PREPARE.ordinal()] = 2;
        $EnumSwitchMapping$0[EnvModeEnum.TEST.ordinal()] = 3;
    }
}
