package com.taobao.android.order.bundle.weex2;

import com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(-1410337386);
        int[] iArr = new int[AsyncInstanceLoadManager.LoadState.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[AsyncInstanceLoadManager.LoadState.INIT.ordinal()] = 1;
        $EnumSwitchMapping$0[AsyncInstanceLoadManager.LoadState.LOADING.ordinal()] = 2;
        $EnumSwitchMapping$0[AsyncInstanceLoadManager.LoadState.SUCCESS.ordinal()] = 3;
    }
}
