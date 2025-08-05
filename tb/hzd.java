package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;

/* loaded from: classes6.dex */
public class hzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1089340493);
    }

    public static hzc a(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzc) ipChange.ipc$dispatch("14f779fd", new Object[]{orderConfigs}) : orderConfigs.e() == OrderConfigs.BizNameType.ORDER_DETAIL ? new hze(orderConfigs) : orderConfigs.e() == OrderConfigs.BizNameType.ORDER_LIST ? new hzf(orderConfigs) : new hzf(orderConfigs);
    }
}
