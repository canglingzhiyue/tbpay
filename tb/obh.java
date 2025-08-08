package tb;

import android.app.Application;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class obh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEW_CONFIG_NAMESPACE = "android_share_bizconfig";

    static {
        kge.a(2008635241);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !u() && "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isUseWeexEngine", "true"));
    }

    private static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("android_share", "isFoldDevice", "false");
        if ((Build.VERSION.SDK_INT >= 19 ? l.d(v()) : false) && "true".equals(config)) {
            return true;
        }
        return l.b(v()) && "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isUseisTablet", "false"));
    }

    private static Application v() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : a("");
    }

    public static String a(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share", "WeexSharePanelUrl", "http://market.m.taobao.com/app/tmall-wireless/share/pages/m2?wh_weex=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true");
        TBShareContent j = e.b().j();
        if (j == null) {
            return config;
        }
        String config2 = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "weexUrlMap", str);
        if (!StringUtils.isEmpty(config2) && j.extraParams != null && j.extraParams.size() > 0) {
            String str2 = j.extraParams.get("specificWeexUrlKey");
            if (!StringUtils.isEmpty(str2) && (parseObject = JSON.parseObject(config2)) != null && !StringUtils.isEmpty(parseObject.getString(str2))) {
                return parseObject.getString(str2);
            }
        }
        return config;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isParallelGetBizActivityInfo", "false"))) {
            return p();
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "sharePanelFullWeex", "http://market.m.taobao.com/app/tmall-wireless/share/pages/m4?wh_weex=true");
    }

    public static String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[0]) : jqm.a() ? "https://web.wapa.taobao.com/app/message-social-front/share-panel/N4?wh_weex=true&weex_mode=dom" : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "sharePanelFullWeex2", "https://web.m.taobao.com/app/message-social-front/share-panel/N4?wh_weex=true&weex_mode=dom");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "useCacheData", "true"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "cacheDataVersion", "1");
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue();
        }
        try {
            return Long.parseLong(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "updateCacheTime", "60")) * 1000;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "useCahceBizIds", "1");
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "useCahceWeexJS", "true");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isSendScreenShot", "true"));
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "configShareData", "");
        if (StringUtils.isEmpty(config)) {
            return null;
        }
        try {
            return JSONObject.parseObject(config).getString(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (u()) {
            return false;
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UseWeexBackFlow", "false"))) {
            return StringUtils.isEmpty(str) || !Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UseWeexBackFlowBlackBizIds", "").split("&")).contains(str);
        }
        return !StringUtils.isEmpty(str) && Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UseWeexBackFlowWhiteBizIds", "").split("&")).contains(str);
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : !b.b() || "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UseWeex2BackFlow", "true"));
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UseWeex2", "true"))) {
            return false;
        }
        if (jqm.a() || !b.b()) {
            return true;
        }
        String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "notUseWeex2BizIds", "NewMiniapp&1115_miniapp&nativesharecart2");
        return StringUtils.isEmpty(config) || !Arrays.asList(config.split("&")).contains(str);
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "WeexBackFlowUrl", "https://market.m.taobao.com/app/tmall-wireless/share-back/pages/index?wh_weex=true");
    }

    public static String x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5faa981", new Object[0]) : jqm.a() ? "https://web.wapa.taobao.com/app/message-social-front/share-back/home?wh_weex=true&weex_mode=dom" : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "Weex2BackFlowUrl", "https://web.m.taobao.com/app/message-social-front/share-back/home?wh_weex=true&weex_mode=dom");
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UseCacheBackFlowWeexJS", "true");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isFixExtraParamsNull", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("android_share", "isTaoFriendsOnly", StringUtils.equals(ShareBizAdapter.getInstance().getShareChannel().f(), "II3LRXNUqMUjigOY") ? "false" : "true").equals("true");
    }

    public static List<String> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("25adebb2", new Object[0]) : Arrays.asList(OrangeConfig.getInstance().getConfig("android_share", "TaoFriendPort", "10001,10002").split(","));
    }

    public static List<String> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d4fc211", new Object[0]) : Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UniversalComponent", "wxminiapp,videodownload").split(","));
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "UniversalComponentMapping", "{\"saveVideo\" : \"videodownload\"}")).getString(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[0]) : OrangeConfig.getInstance().getConfig("android_share_bizconfig", "sharePanelFullWeexN4", "https://market.m.taobao.com/app/tmall-wireless/share-1x/pages/n4?wh_weex=true");
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixPrimaryClipNullIssue", "false"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "notUseIsLower", "false"));
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixStatusBarOccludeDialogIssue", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "disableUtSkCopy", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "removeUselessRWPermCheck", "true"));
    }
}
