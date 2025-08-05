package com.taobao.themis.inside.adapter;

import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(677987995);
        int[] iArr = new int[TMSSolutionType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 1;
        $EnumSwitchMapping$0[TMSSolutionType.UNIAPP.ordinal()] = 2;
        $EnumSwitchMapping$0[TMSSolutionType.WEEX.ordinal()] = 3;
    }
}
