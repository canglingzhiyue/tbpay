package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes4.dex */
public class eis {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENABLE_CONTENT_TAB = "enable_content_tab";
    public static final String ENABLE_MARKET_FLOATING_OPT = "opt_market_floating";
    public static final String ENABLE_PIC_1_1_OPT = "enable_pic_1_1_opt";
    public static final String ENABLE_TAB_INIT = "enable_tab_init_opt";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27332a;
    public static boolean b;
    public static boolean c;
    public static boolean d;

    static {
        kge.a(-2056961351);
        f27332a = true;
        b = true;
        c = true;
        d = true;
        emu.a("com.taobao.android.detail.core.performance.orange.InsideDetailOptOrangeConfig");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f27332a = c();
        b = d();
        c = e();
        d = b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a(ENABLE_TAB_INIT, Boolean.TRUE.toString());
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a(ENABLE_PIC_1_1_OPT, "true");
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a(ENABLE_MARKET_FLOATING_OPT, "true");
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_detail", str, str2));
        } catch (Exception e) {
            i.a("InsideDetailOptOrangeConfig", str, e);
            return false;
        }
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : a(ENABLE_CONTENT_TAB, Boolean.TRUE.toString());
    }
}
