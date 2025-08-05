package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import com.taobao.orange.util.StringUtil;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class nyg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CHECK_PWD_URL_VALIDATE = "checkPwdUrlValidate";
    public static final String KEY_READ_PHOTO_ALBUM = "share_can_read_photo_album";
    public static final String SHARE_CONFIG_NAME_SPACE = "android_share";
    public static final String TAO_FLAG = "com.ut.share.copy.data.";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f31838a;
    private static int b;
    private static boolean c;
    private static AtomicBoolean d;

    public static /* synthetic */ void a(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else {
            b(context, map);
        }
    }

    public static /* synthetic */ Map c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca0735d0", new Object[]{map});
        }
        f31838a = map;
        return map;
    }

    public static /* synthetic */ Map j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("db121866", new Object[0]) : f31838a;
    }

    static {
        kge.a(1420195730);
        b = 20;
        c = false;
        d = new AtomicBoolean(false);
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_share");
        f31838a = configs;
        if (configs != null) {
            b(context, f31838a);
        }
        OrangeConfig.getInstance().registerListener(new String[]{"android_share"}, new f() { // from class: tb.nyg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.f
            public void onConfigUpdate(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                    return;
                }
                nyg.c(OrangeConfig.getInstance().getConfigs("android_share"));
                Log.e("SDKConfig", "android_share");
                if (nyg.j() == null) {
                    return;
                }
                nyg.a(context, nyg.j());
            }
        });
        d.set(true);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (d.get()) {
        } else {
            a(context);
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("android_share", str, str2);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share", str, String.valueOf(z)));
    }

    private static void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
            return;
        }
        d(map);
        a(map);
        b(map);
    }

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f31838a;
    }

    private static void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{map});
            return;
        }
        String str = map.get("taopassword_character_blacklist");
        String str2 = "setTPCharacterBlackList 1 listStr=" + str;
        if (TextUtils.isEmpty(str)) {
            str = "￥,¥";
        }
        oag.a(Arrays.asList(str.split(",")));
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : b;
    }

    public static void a(Map<String, String> map) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String str = map.get("share_qrTemplate_count");
        if (TextUtils.isEmpty(str) || (parseInt = StringUtil.parseInt(str)) <= 0) {
            return;
        }
        b = parseInt;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c;
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        try {
            String str = map.get("share_disable_picPassword_new");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c = Boolean.parseBoolean(str);
        } catch (Throwable unused) {
        }
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "shareVideoLength", String.valueOf(12)));
        } catch (Throwable th) {
            th.printStackTrace();
            return 12;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (OrangeConfig.getInstance().getConfig("android_share", "videoBackBlackBrandList", "").contains(Build.BRAND) || OrangeConfig.getInstance().getConfig("android_share", "videoBackBlackModelList", "").contains(Build.MODEL)) {
            return false;
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share", "videoBackFlowAvailable", "false"), "true");
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "videoLengthOffsetThreshold", String.valueOf(5000)));
        } catch (Throwable th) {
            th.printStackTrace();
            return 12;
        }
    }

    public static boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{new Long(j)})).booleanValue() : Math.abs(j - ((long) (d() * 1000))) < ((long) f());
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share", "isWxAgainstMode", "true"), "true");
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share", "isPreCheckMode", "false"), "true");
    }

    public static String a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)});
        }
        if (z) {
            return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "QRCodeBackgroundURL", "http://gw.alicdn.com/tfscom/TB1kkvgJpXXXXc1XXXXvye07pXX-124-124.jpg");
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "VisualCodeBackgroundURL", "http://gw.alicdn.com/tfscom/TB1kkvgJpXXXXc1XXXXvye07pXX-124-124.jpg");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        List asList = Arrays.asList(OrangeConfig.getInstance().getConfig("shareui_theme", "share_disable_qrcode_bizs", "").split("&"));
        TBShareContent j = e.b().j();
        if (j != null && asList.contains(j.businessId)) {
            return false;
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("shareui_theme", "share_disable_qrcode", "false"), "true");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", KEY_READ_PHOTO_ALBUM, "false"), "true");
    }
}
