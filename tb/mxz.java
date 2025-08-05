package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.newSettingV2.data.b;
import com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity;
import com.taobao.orange.OrangeConfig;
import tb.mtp;

/* loaded from: classes7.dex */
public class mxz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f31319a;
    public static boolean b;
    public static volatile String e;
    public static volatile long f;
    public static boolean g;
    public static boolean h;
    public static volatile String j;
    public static volatile JSONObject q;
    public static volatile int t;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.mxz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mxz.e = mxj.a(mtp.a.K_PAY_SETTING_FOOTER_STR, "");
                    mxz.f = mxj.a(mtp.a.PAGE_DATA_EXPIRES_TIME, 480L);
                    mxz.j = mxj.a(mtp.a.K_DATA_COMPLIANCE_SETTING_DATA, NewTaobaoSettingActivity.DEFAULT_COMPLIANCE_SETTING_DATA);
                    mxz.q = mxj.a(mtp.a.h, b.GENERAL_SETTING_DEFAULT_STATUS_DATA);
                    mxz.t = mxj.a(mtp.a.K_NOTIFY_BASEMENT_EXPOSURE_HEIGHT_TIMESPAN_MILLIS, 500);
                    mxz.f31319a = mxj.a("parseFestivalCacheEnable", true);
                    mxz.b = mxj.a("disableSettingsPageCache", false);
                    mxz.h = mxj.a("disableEquityNumSlide", false);
                    mxz.g = mxj.a("enableNavSkipProcessor", true);
                }
            });
        }
    }

    static {
        kge.a(-1091320525);
        e = "";
        f = 480L;
        j = NewTaobaoSettingActivity.DEFAULT_COMPLIANCE_SETTING_DATA;
        q = b.GENERAL_SETTING_DEFAULT_STATUS_DATA;
        t = 500;
        f31319a = true;
        b = false;
        h = false;
        g = true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : mxj.a("enableBasementFeedLaunchPreload", true);
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : OrangeConfig.getInstance().getConfig("mpm_data_switch", "wx_js_min_version", null);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : mxj.a("isForceRequestSecData", true);
    }
}
