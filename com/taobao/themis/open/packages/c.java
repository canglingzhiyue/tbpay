package com.taobao.themis.open.packages;

import com.taobao.themis.open.resource.PackageInfo;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(473707497);
        int[] iArr = new int[PackageInfo.TYPE.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[PackageInfo.TYPE.MAIN.ordinal()] = 1;
        $EnumSwitchMapping$0[PackageInfo.TYPE.FRAMEWORK.ordinal()] = 2;
        $EnumSwitchMapping$0[PackageInfo.TYPE.PLUGIN.ordinal()] = 3;
        $EnumSwitchMapping$0[PackageInfo.TYPE.SUBPACKAGE.ordinal()] = 4;
        $EnumSwitchMapping$0[PackageInfo.TYPE.OTHER.ordinal()] = 5;
    }
}
