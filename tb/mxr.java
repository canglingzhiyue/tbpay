package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.cus.a;
import com.taobao.global.setting.c;
import com.taobao.global.setting.util.d;
import com.taobao.global.setting.util.e;
import com.taobao.global.setting.util.h;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.mytaobao.newsetting.GeneralSetting;
import com.taobao.mytaobao.newsetting.b;
import com.taobao.mytaobao.newsetting.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taolive.sdk.utils.t;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class mxr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASSISTANT = "VoiceOver";
    public static final String KEY_CART_SHAKE = "cartShake";
    public static final String KEY_CLEAN_CACHE = "cleancache";
    public static final String KEY_FONT_SIZE = "font_size";
    public static final String KEY_HOMEPAGE_SHAKE = "shake";
    public static final String KEY_INLINE_VOLUME = "inlineVolume";
    public static final String KEY_LIVE_BACKGROUND_PLAY = "showLiveBgPlay";
    public static final String KEY_LOCATION_SERVICE = "location_service";
    public static final String KEY_MUTE = "mute";
    public static final String KEY_NETWORK_DIAGNOSE = "network_diagnose";
    public static final String KEY_NETWORK_SPEEDUP = "network_speed_up";
    public static final String KEY_OCR = "ocr";
    public static final String KEY_REGION = "region";
    public static final String KEY_SHOW_SHARE_DIALOG_AFTER_CUT = "share";
    public static final String KEY_TAOBAO_HELPER = "tb_helper";
    public static final String KEY_TMALL_NOTIFY = "tmall_notify";
    public static final String KEY_VIDEO_AUTOPLAY_TYPE = "video";
    public static final String KEY_VISIT_OFTEN_LIVE = "secScreenLive";
    public static final String KEY_VISIT_OFTEN_SHOP = "secScreenShop";
    public static final String KEY_VOICE_ASSISTANT = "audioAssistant";
    public static final String KEY_WIFI_AUTO_DOWNLOAD = "wifiAutoDownload";

    /* renamed from: a  reason: collision with root package name */
    public static String f31314a;

    private static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? "show" : "gone";
    }

    private static String b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c557ff5", new Object[]{new Boolean(z)}) : z ? "open" : "close";
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[0]);
        } else {
            G();
        }
    }

    public static /* synthetic */ void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[0]);
        } else {
            H();
        }
    }

    static {
        kge.a(-811155884);
        f31314a = "mytaobao";
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return b.a() && "true".equals(OrangeConfig.getInstance().getConfig("fontSizeSetting", "open", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : t.a();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : NetworkConfigCenter.isNetworkDiagnosisOpened();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : NetworkConfigCenter.isMultiPathSupport();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : mxq.a(Global.getApplication());
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : mxq.a(Global.getApplication());
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : rjw.g(Global.getApplication());
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : com.taobao.wireless.link.notification.b.a(0);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : TextUtils.equals("1", TBRevisionSwitchManager.i().c("elderHome"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : f.a(f.KEY_SHOW_SEC_SCREEN_SHOP_SWITCH);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : f.a(f.KEY_SHOW_SEC_SCREEN_LIVE_SWITCH);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : a.a().e();
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : ((Boolean) b(KEY_LIVE_BACKGROUND_PLAY, Boolean.valueOf(t.b()))).booleanValue();
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : ((Boolean) b(KEY_INLINE_VOLUME, Boolean.valueOf(mxv.a(SettingContants.SETTINGS_SYSTEM_SOUND, true)))).booleanValue();
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : ((Boolean) b("share", Boolean.valueOf(c.a(Global.getApplication(), f31314a).b().c(true)))).booleanValue();
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : ((Boolean) b(KEY_HOMEPAGE_SHAKE, Boolean.valueOf(com.taobao.android.shake.api.a.c()))).booleanValue();
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        String a2 = mxo.a(mxo.CART_SWITCH_NAME);
        if (a2 == null || "true".equals(a2)) {
            z = true;
        }
        return ((Boolean) b(KEY_CART_SHAKE, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : ((Boolean) b(KEY_LOCATION_SERVICE, Boolean.valueOf(c.a(Global.getApplication(), f31314a).b().a(false)))).booleanValue();
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : ((Boolean) b("ocr", Boolean.valueOf("true".equals(mxo.a(mxo.OCR_SWITCH_NAME))))).booleanValue();
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : ((Boolean) b(KEY_ASSISTANT, Boolean.valueOf("true".equals(mxo.a(mxo.ASSISTANT_SWITCH_ENABLE))))).booleanValue();
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : ((Boolean) b(KEY_TAOBAO_HELPER, Boolean.valueOf(rjw.h(Global.getApplication())))).booleanValue();
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : ((Boolean) b(KEY_TMALL_NOTIFY, Boolean.valueOf(com.taobao.wireless.link.notification.b.b(0)))).booleanValue();
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : ((Boolean) b(KEY_VOICE_ASSISTANT, Boolean.valueOf(GeneralSetting.getGeneralSetting(GeneralSetting.VIRTUAL_ASSISTANT_KEY, true)))).booleanValue();
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : ((Boolean) b(KEY_VISIT_OFTEN_SHOP, Boolean.valueOf(f.a(f.SWITCH_SEC_SHOP, "true")))).booleanValue();
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : ((Boolean) b(KEY_VISIT_OFTEN_LIVE, Boolean.valueOf(f.a(f.SWITCH_SEC_LIVE, "true")))).booleanValue();
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : ((Boolean) b(KEY_WIFI_AUTO_DOWNLOAD, true)).booleanValue();
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue() : ((Boolean) b("mute", false)).booleanValue();
    }

    public static int F() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[0])).intValue();
        }
        c a3 = c.a(Global.getApplication(), f31314a);
        if (e.a(Global.getApplication()).a("Global_App_Video_Play_Network_Type")) {
            a2 = a3.b().a(0);
        } else {
            a2 = a3.b().a(1);
        }
        return ((Integer) b("video", Integer.valueOf(a2))).intValue();
    }

    public static String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec4b0696", new Object[0]);
        }
        int F = F();
        return F != 0 ? (F == 1 || F != 2) ? "移动网络和wlan下都开启" : "关闭" : "仅wlan开启";
    }

    public static String D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d0c135", new Object[0]) : com.taobao.android.editionswitcher.b.b(Global.getApplication()).countryName;
    }

    public static void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[0]);
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.mxr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mxr.J();
                    mxr.K();
                }
            });
        }
    }

    private static void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[0]);
        } else {
            TBS.Ext.commitEvent(h.PAGE_NAME, 19999, "general_setting_options_statistics", null, null, I());
        }
    }

    private static void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[0]);
            return;
        }
        SharedPreferences a2 = d.a();
        if (a2.getBoolean("hasMoveLogicFinishV2", false)) {
            return;
        }
        a("region", D());
        a(KEY_LIVE_BACKGROUND_PLAY, Boolean.valueOf(n()));
        a("video", Integer.valueOf(F()));
        a(KEY_INLINE_VOLUME, Boolean.valueOf(o()));
        a(KEY_VISIT_OFTEN_SHOP, Boolean.valueOf(y()));
        a(KEY_VISIT_OFTEN_LIVE, Boolean.valueOf(z()));
        a(KEY_HOMEPAGE_SHAKE, Boolean.valueOf(q()));
        a(KEY_CART_SHAKE, Boolean.valueOf(r()));
        a("share", Boolean.valueOf(p()));
        a(KEY_LOCATION_SERVICE, Boolean.valueOf(s()));
        a("ocr", Boolean.valueOf(t()));
        a(KEY_ASSISTANT, Boolean.valueOf(u()));
        a(KEY_TAOBAO_HELPER, Boolean.valueOf(v()));
        a(KEY_TMALL_NOTIFY, Boolean.valueOf(w()));
        a(KEY_VOICE_ASSISTANT, Boolean.valueOf(x()));
        SharedPreferences.Editor edit = a2.edit();
        edit.putBoolean("hasMoveLogicFinishV2", true);
        edit.apply();
    }

    public static <T> void a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, t});
            return;
        }
        kta c = c.a(Globals.getApplication(), f31314a).c();
        if (c == null) {
            return;
        }
        c.a(f31314a, str, t, null);
    }

    public static <T> T b(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("cfa9a883", new Object[]{str, t});
        }
        ksz b = c.a(Globals.getApplication(), f31314a).b();
        if (b == null) {
            return t;
        }
        try {
            return (T) b.a(f31314a, str, t, null);
        } catch (Throwable unused) {
            return t;
        }
    }

    private static String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("136d6650", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(a(KEY_FONT_SIZE), (Object) a(a()));
        jSONObject.put(a("region"), (Object) D());
        jSONObject.put(a(KEY_NETWORK_DIAGNOSE), (Object) a(c()));
        jSONObject.put(a(KEY_NETWORK_SPEEDUP), (Object) a(d()));
        jSONObject.put(a("video"), (Object) C());
        if (b()) {
            jSONObject.put(a(KEY_LIVE_BACKGROUND_PLAY), (Object) b(n()));
        }
        jSONObject.put(a(KEY_INLINE_VOLUME), (Object) b(o()));
        jSONObject.put(a(KEY_VISIT_OFTEN_SHOP), (Object) b(y()));
        jSONObject.put(a(KEY_VISIT_OFTEN_LIVE), (Object) b(z()));
        jSONObject.put(a(KEY_HOMEPAGE_SHAKE), (Object) b(q()));
        jSONObject.put(a(KEY_CART_SHAKE), (Object) b(r()));
        jSONObject.put(a("share"), (Object) b(p()));
        jSONObject.put(a(KEY_LOCATION_SERVICE), (Object) b(s()));
        if (e()) {
            jSONObject.put(a("ocr"), (Object) b(t()));
        }
        if (f()) {
            jSONObject.put(a(KEY_ASSISTANT), (Object) b(u()));
        }
        if (h()) {
            jSONObject.put(a(KEY_TAOBAO_HELPER), (Object) b(v()));
        }
        if (i()) {
            jSONObject.put(a(KEY_TMALL_NOTIFY), (Object) b(w()));
        }
        if (j()) {
            jSONObject.put(a(KEY_VOICE_ASSISTANT), (Object) b(x()));
        }
        if (m()) {
            jSONObject.put(a(KEY_WIFI_AUTO_DOWNLOAD), (Object) b(A()));
        }
        jSONObject.put(a(KEY_CLEAN_CACHE), (Object) "show");
        jSONObject.put(a("mute"), (Object) b(B()));
        return com.taobao.mytaobao.ut.c.a(jSONObject);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : "general_settings_".concat(str);
    }
}
