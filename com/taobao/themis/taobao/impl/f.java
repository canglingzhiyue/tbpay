package com.taobao.themis.taobao.impl;

import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        kge.a(-1498362291);
        int[] iArr = new int[TMSSolutionType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 1;
        $EnumSwitchMapping$0[TMSSolutionType.MIX.ordinal()] = 2;
        $EnumSwitchMapping$0[TMSSolutionType.MINIGAME.ordinal()] = 3;
        $EnumSwitchMapping$0[TMSSolutionType.WEEX.ordinal()] = 4;
        $EnumSwitchMapping$0[TMSSolutionType.WIDGET.ordinal()] = 5;
        $EnumSwitchMapping$0[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 6;
        $EnumSwitchMapping$0[TMSSolutionType.UNIAPP.ordinal()] = 7;
        int[] iArr2 = new int[TMSSolutionType.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[TMSSolutionType.MIX.ordinal()] = 1;
        $EnumSwitchMapping$1[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 2;
        $EnumSwitchMapping$1[TMSSolutionType.UNIAPP.ordinal()] = 3;
    }
}
