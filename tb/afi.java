package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cts;

/* loaded from: classes5.dex */
public class afi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1605554593);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : afj.a("lightBuyUrl", cts.a.PRE_RENDER_URL_LIGHT_BUY, false);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : afj.a("lightBuyPreUrl", "https://meta.wapa.taobao.com/app/tb-trade/light-buy/home?wh_weex=true&weex_mode=dom&wx_limit_raster_cache=true&preload=true", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : afj.a("enableLoadingPerf", true, false);
    }
}
