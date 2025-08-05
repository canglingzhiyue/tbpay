package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class add {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(476391683);
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0bfeb52", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate == null) {
            UnifyLog.d("UltronTradeHybridABUtils.getABTestAsString", "variationSet is null");
            return z;
        }
        Variation variation = activate.getVariation(str3);
        if (variation == null) {
            UnifyLog.d("UltronTradeHybridABUtils.getABTestAsString", "variation is null");
            return z;
        }
        return variation.getValueAsBoolean(z);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a("AB_SimplePaySuccess", "202406141112_1096", "hitGray", true);
    }
}
