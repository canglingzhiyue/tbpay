package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes4.dex */
public class eta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2064051734);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("AccessibilityTools", "ocrAllowBatch", Boolean.TRUE.toString()));
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig("AccessibilityTools", "ocrBatchDelayMilliSeconds", ""));
        } catch (Exception e) {
            Log.e("A11yAbility_ConfigUtils", "getOCRBatchDelayMilliSeconds exception " + e.getMessage());
            return 0L;
        }
    }
}
