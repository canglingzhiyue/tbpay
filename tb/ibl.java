package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.orange.OrangeConfig;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes6.dex */
public class ibl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GET_UTRINS_FROM_DXCTX = "get_utrIns_from_dxCtx";

    static {
        kge.a(1775572530);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "orderlist_nexrpc", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oList_elder", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "oDetail_elder", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_async_refreshCop", "false"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("babelorder", "order_bundleLine_switch", "false"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("babelorder", "useAdamDefaultSubscribe", "true"));
    }

    public static boolean a(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4366e1c", new Object[]{orderConfigs})).booleanValue();
        }
        if (OrderConfigs.BizNameType.ORDER_LIST.equals(orderConfigs.e())) {
            return i();
        }
        return false;
    }

    public static boolean b(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3c0081d", new Object[]{orderConfigs})).booleanValue();
        }
        if (OrderConfigs.BizNameType.ORDER_LIST.equals(orderConfigs.e())) {
            return j();
        }
        return false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "isAsyncExposure", "false"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "isPostRunnableExposure", "false"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", tbt.PRE_RENDER, "false"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : !q();
    }

    private static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue();
        }
        String str = Mtop.instance(null).getMtopConfig().appVersion;
        return !TextUtils.isEmpty(str) && str.split("\\.").length >= 4;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : akt.a() == 2;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        if (!v()) {
            return "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "rvIdlePost", "true"));
        }
        return true;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "newHandler", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : TextUtils.equals(OrangeConfig.getInstance().getConfig("babelorder", "enableOrderWeex2Prefetch", "false"), "true");
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("babelorder", "needDestroyWeex2ViewHolder", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : TextUtils.equals(OrangeConfig.getInstance().getConfig("babelorder", "enableOrderPreloadBackground", "false"), "true");
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue();
        }
        try {
            return Math.max(0, Integer.parseInt(OrangeConfig.getInstance().getConfig(iro.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestMaxPage", "1")));
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[0])).intValue();
        }
        try {
            return Math.max(0, Integer.parseInt(OrangeConfig.getInstance().getConfig(iro.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestMaxPos", "3")));
        } catch (Throwable unused) {
            return 3;
        }
    }

    public static long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b56a", new Object[0])).longValue();
        }
        try {
            return Math.max(0, Integer.parseInt(OrangeConfig.getInstance().getConfig(iro.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestInterval", "5")) * 60 * 1000);
        } catch (Throwable unused) {
            return 300000L;
        }
    }

    public static long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fcceb", new Object[0])).longValue();
        }
        try {
            return Math.max(0, Integer.parseInt(OrangeConfig.getInstance().getConfig(iro.ORANGE_KEY_ORDER_DETAIL, "odetailPreRequestExpiredTime", "5")) * 60 * 1000);
        } catch (Throwable unused) {
            return 300000L;
        }
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : TextUtils.equals(OrangeConfig.getInstance().getConfig("babelorder", "enableTouchMaskLayout", "false"), "true");
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : spk.a("babelorder", "skipPhenixRenderView", false);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enableAsyncCreateInstance", false);
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : spk.a(iro.ORANGE_KEY_ORDER_LIST, "enableLogisticsFragmentOpt", false);
    }
}
