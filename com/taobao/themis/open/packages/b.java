package com.taobao.themis.open.packages;

import com.taobao.themis.open.resource.PackageInfo;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        kge.a(-492618446);
        int[] iArr = new int[PackageInfo.TYPE.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[PackageInfo.TYPE.FRAMEWORK.ordinal()] = 1;
        $EnumSwitchMapping$0[PackageInfo.TYPE.PLUGIN.ordinal()] = 2;
        $EnumSwitchMapping$0[PackageInfo.TYPE.MAIN.ordinal()] = 3;
        int[] iArr2 = new int[PackageInfo.TYPE.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[PackageInfo.TYPE.FRAMEWORK.ordinal()] = 1;
        $EnumSwitchMapping$1[PackageInfo.TYPE.PLUGIN.ordinal()] = 2;
        $EnumSwitchMapping$1[PackageInfo.TYPE.MAIN.ordinal()] = 3;
    }
}
