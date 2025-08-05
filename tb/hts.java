package tb;

import com.taobao.android.meta.structure.state.MetaState;

/* loaded from: classes6.dex */
public final /* synthetic */ class hts {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        kge.a(-1297789674);
        int[] iArr = new int[MetaState.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[MetaState.LOADING_MORE.ordinal()] = 1;
        $EnumSwitchMapping$0[MetaState.LOAD_MORE_ERROR.ordinal()] = 2;
        int[] iArr2 = new int[MetaState.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[MetaState.LOADING_MORE.ordinal()] = 1;
        $EnumSwitchMapping$1[MetaState.LIST_FINISHED.ordinal()] = 2;
        $EnumSwitchMapping$1[MetaState.LOAD_MORE_ERROR.ordinal()] = 3;
    }
}
