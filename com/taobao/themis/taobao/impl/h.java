package com.taobao.themis.taobao.impl;

import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(196650536);
        int[] iArr = new int[TMSSolutionType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[TMSSolutionType.MINIGAME.ordinal()] = 1;
        $EnumSwitchMapping$0[TMSSolutionType.WIDGET.ordinal()] = 2;
        $EnumSwitchMapping$0[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 3;
    }
}
