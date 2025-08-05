package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes6.dex */
public class hvi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPACE_NAME = "open_cart";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28812a = true;

    public static float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[0])).floatValue();
        }
        try {
            return Float.parseFloat(OrangeConfig.getInstance().getConfig(SPACE_NAME, "vlViewDelayWaitTimeAfterAnimation", "0"));
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig(SPACE_NAME, "delayShowMessage", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        boolean equals = "true".equals(OrangeConfig.getInstance().getConfig(SPACE_NAME, "isPrefetchCartVEngine", "true"));
        f28812a = equals;
        return equals;
    }
}
