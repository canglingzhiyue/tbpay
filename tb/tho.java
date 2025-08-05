package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class tho {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_KEY_LIVE_NAME = "live_name";
    public static final String ORANGE_KEY_PS_POP_AB = "ps_pop_utab";
    public static final String ORANGE_KEY_PS_POP_ENABLE = "ps_pop_enable";
    public static final String ORANGE_KEY_PS_POP_REDIRECT_URL = "ps_pop_url";
    public static final String ORANGE_KEY_PS_POP_URLS = "ps_pop_urls";
    public static final String ORANGE_KEY_RM_MIDDLE_PAGES = "rm_middle_pages";
    public static final String TMCS_ORANGE_GROUP_NAME = "android_tcg_urlMiddleware";
    public static final String TMCS_ORANGE_PREFS = "tmcs_orange_preference";

    /* renamed from: a  reason: collision with root package name */
    private static final String f34096a = "tho";

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : f34096a;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        OrangeConfig.getInstance().getConfig(TMCS_ORANGE_GROUP_NAME, ORANGE_KEY_PS_POP_ENABLE, "true");
        OrangeConfig.getInstance().registerListener(new String[]{TMCS_ORANGE_GROUP_NAME}, new d() { // from class: tb.tho.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences(tho.TMCS_ORANGE_PREFS, 0).edit();
                edit.putBoolean(tho.ORANGE_KEY_PS_POP_ENABLE, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, tho.ORANGE_KEY_PS_POP_ENABLE, "true")));
                edit.putString(tho.ORANGE_KEY_PS_POP_URLS, OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, tho.ORANGE_KEY_PS_POP_URLS, ""));
                edit.putString(tho.ORANGE_KEY_PS_POP_REDIRECT_URL, OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, tho.ORANGE_KEY_PS_POP_REDIRECT_URL, ""));
                edit.putString(tho.ORANGE_KEY_RM_MIDDLE_PAGES, OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, tho.ORANGE_KEY_RM_MIDDLE_PAGES, ""));
                edit.putString(tho.ORANGE_KEY_LIVE_NAME, OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, tho.ORANGE_KEY_LIVE_NAME, ""));
                edit.putString(tho.ORANGE_KEY_PS_POP_AB, OrangeConfig.getInstance().getConfig(tho.TMCS_ORANGE_GROUP_NAME, tho.ORANGE_KEY_PS_POP_AB, ""));
                edit.apply();
                String h = tho.h();
                TLog.logi(tkd.TLOG_MODULE, h, "onConfigUpdate: " + map);
                OrangeConfig.getInstance().unregisterListener(new String[]{tho.TMCS_ORANGE_GROUP_NAME});
            }
        }, true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getBoolean(ORANGE_KEY_PS_POP_ENABLE, true);
    }

    public static List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]);
        }
        String string = Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getString(ORANGE_KEY_PS_POP_URLS, "");
        ArrayList arrayList = new ArrayList();
        for (String str : string.split(",")) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getString(ORANGE_KEY_PS_POP_REDIRECT_URL, "");
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getString(ORANGE_KEY_LIVE_NAME, "");
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getString(ORANGE_KEY_RM_MIDDLE_PAGES, "");
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getString(ORANGE_KEY_PS_POP_AB, "");
    }
}
