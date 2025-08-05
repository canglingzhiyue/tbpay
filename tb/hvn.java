package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes6.dex */
public final class hvn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2144034780);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("order", CoreConstants.DETAIL_DOWNGRADE_OPEN, "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("order", CoreConstants.LIST_DOWNGRADE_OPEN, "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("order", CoreConstants.ORDER_LIST_RECOMMEND, "true"));
    }
}
