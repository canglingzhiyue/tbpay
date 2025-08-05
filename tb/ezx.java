package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes5.dex */
public class ezx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(593563742);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : SystemBarDecorator.SystemBarConfig.getStatusBarHeight(euz.a());
    }
}
