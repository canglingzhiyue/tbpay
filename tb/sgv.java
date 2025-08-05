package tb;

import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.solution.TMSSolutionType;

/* loaded from: classes9.dex */
public final /* synthetic */ class sgv {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        kge.a(560655660);
        int[] iArr = new int[Window.WindowRatioConfig.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[Window.WindowRatioConfig.ALL.ordinal()] = 1;
        $EnumSwitchMapping$0[Window.WindowRatioConfig.LANDSCAPE.ordinal()] = 2;
        $EnumSwitchMapping$0[Window.WindowRatioConfig.PORTRAIT.ordinal()] = 3;
        int[] iArr2 = new int[TMSSolutionType.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[TMSSolutionType.UNIAPP.ordinal()] = 1;
        $EnumSwitchMapping$1[TMSSolutionType.MINIGAME.ordinal()] = 2;
        $EnumSwitchMapping$1[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 3;
        $EnumSwitchMapping$1[TMSSolutionType.WIDGET.ordinal()] = 4;
    }
}
