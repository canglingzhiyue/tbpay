package com.taobao.mytaobao.basement.weex;

import android.arch.lifecycle.Lifecycle;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(154933950);
        int[] iArr = new int[Lifecycle.Event.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
        $EnumSwitchMapping$0[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
        $EnumSwitchMapping$0[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
        $EnumSwitchMapping$0[Lifecycle.Event.ON_STOP.ordinal()] = 4;
    }
}
