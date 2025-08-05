package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;

/* loaded from: classes6.dex */
public class hyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1818423938);
    }

    public static ImageStrategyConfig a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("95746ea1", new Object[0]) : ImageStrategyConfig.a("default", 20).a();
    }

    public static ImageStrategyConfig a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("9853bc1d", new Object[]{new Boolean(z)}) : ImageStrategyConfig.a("default", 20).f(z).a();
    }
}
