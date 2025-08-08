package tb;

import android.app.Activity;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class nyl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_NAME = "android_share";

    /* renamed from: a  reason: collision with root package name */
    private static final String f31843a;

    static {
        kge.a(-60305117);
        f31843a = ShareTargetType.Share2Copy.getValue() + "&" + ShareTargetType.Share2QQ.getValue() + "&" + ShareTargetType.Share2Weixin.getValue() + "&" + ShareTargetType.Share2SinaWeibo.getValue() + "&" + ShareTargetType.Share2SMS.getValue() + "&" + ShareTargetType.Share2DingTalk.getValue() + "&" + ShareTargetType.Share2QRCode.getValue() + "&" + ShareTargetType.Share2ScanCode.getValue();
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("android_share", str, str2);
        TLog.logd("Contacts-ShareConfigUtil", "key = " + str + ", value = " + config);
        return config;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNewTrack", String.valueOf(true)));
        } catch (Exception unused) {
            return false;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("android_share", "showCustomView", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNewContacts_showTip", String.valueOf(false)));
        } catch (Exception unused) {
            return false;
        }
    }

    public static List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            OrangeConfig orangeConfig = OrangeConfig.getInstance();
            String config = orangeConfig.getConfig("android_share", "TaoFriendPort_" + str, "");
            if (StringUtils.isEmpty(config)) {
                config = OrangeConfig.getInstance().getConfig("android_share", "isNewContacts_ports", "");
            }
            return (List) JSONArray.parse(config);
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "maxRecentFriendNumber", "20"));
        } catch (Exception unused) {
            return 20;
        }
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "maxAllFriendNumber", "30"));
        } catch (Exception unused) {
            return 30;
        }
    }

    public static boolean b(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share", "isShowErrorDialog", "false"))) {
            return false;
        }
        if (!StringUtils.isEmpty(str)) {
            String config = OrangeConfig.getInstance().getConfig("android_share", "disableErrorList", "");
            if (!StringUtils.isEmpty(config) && (split = config.split(",")) != null && split.length > 0) {
                for (String str2 : split) {
                    if (str.equals(str2.trim())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isShareLoginCheck", String.valueOf(true)));
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        try {
            return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNeedCheckShare", String.valueOf(false)));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        if (!obh.a() || activity == null || !ShareBizAdapter.getInstance().getAppEnv().f()) {
            return false;
        }
        String name = activity.getClass().getName();
        return (nyv.a(name) || OrangeConfig.getInstance().getConfig("android_share", "useNewScreenShotActivitys", "").contains(name)) && !OrangeConfig.getInstance().getConfig("android_share_bizconfig", "screenShotShareBrandBlackList", "xiaomi,Xiaomi,Redmi").contains(Build.BRAND) && !OrangeConfig.getInstance().getConfig("android_share_bizconfig", "screenShotShareModelBlackList", "").contains(Build.MODEL) && "true".equals(OrangeConfig.getInstance().getConfig("android_share", "useNewScreenShotForNew2024", "false"));
    }

    public static <K, V> V a(Map<K, V> map, K k, V v) {
        V v2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("d5e2037d", new Object[]{map, k, v}) : (map == null || (v2 = map.get(k)) == null) ? v : v2;
    }

    public static String a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2});
        }
        String str3 = (String) a(map, str, str2);
        return StringUtils.isEmpty(str3) ? str2 : str3;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isNeedGetBizActivityInfo", "false")) || Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "GetBizActivityInfoBizIds", "").split("&")).contains(str);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isParallelGetBizActivityInfo", "false"));
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "playTogetherBizIds", "shareplay-longtime").split("&")).contains(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : Arrays.asList(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "nativePanelShareTypes", f31843a).split("&")).contains(str);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", ShareBusiness.IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY, "false"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixConfigDataListenerLeakToggleOn", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "waitWeexInitEnable", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixFriendsListEmptyIssue", "true"));
    }
}
