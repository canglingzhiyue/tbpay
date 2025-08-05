package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1660429729);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Variation variation = UTABTest.activate("AB_", "202302211854_2139").getVariation("isShowGuide");
        if (variation == null || variation.getValueAsBoolean(true)) {
            return true;
        }
        kif.a("ABRouterUtils abRouterWidgetSupport false");
        return false;
    }
}
