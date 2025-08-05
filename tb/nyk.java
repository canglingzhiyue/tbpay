package tb;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import com.taobao.share.copy.a;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class nyk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_PASSWORD_PROCESS = "1";
    public static final String DEFAULT_PLAN_B_PASSWORD_REGEX = "[\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10]|[A-Za-z0-9]{7,15}|[的一是了我不人在他有这个上们来到时大地为子中你说生国年着就那和要她出也得里后自以会家可下而过天去能对小多然于心学么之都好看起]{7,15}";
    public static final String DEFAULT_PRE_CHECK_REGEX = ".*\\/.*";
    public static final String DEFAULT_REFLOW_LEVEL = "B";
    public static final String DETAULT_PASSWORD_DNS_REGEX = ".*http(s?)://(baron|share).laiwang.com.*tm=.*";
    public static final String DETAULT_PLAN_A_PASSWORD_REGEX = "[￥](.*?)[￥]|[嘻啊哈！，微信()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10][A-Za-z0-9]{7,15}[嘻啊哈！，微信()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10]|[你我谁这推]{1}((.){15,25})!\\.!";
    public static final String KEY_SHARE_CONFIG_ALIPAY = "alipay";
    public static final String KEY_SHARE_CONFIG_COPY = "copy";
    public static final String KEY_SHARE_CONFIG_DINGTALK = "dingtalk";
    public static final String KEY_SHARE_CONFIG_FEILIAO = "feiliao";
    public static final String KEY_SHARE_CONFIG_IPRESENT = "iPresent";
    public static final String KEY_SHARE_CONFIG_ISHOPPING = "ishopping";
    public static final String KEY_SHARE_CONFIG_MOMO = "momo";
    public static final String KEY_SHARE_CONFIG_QQ = "qq";
    public static final String KEY_SHARE_CONFIG_QRCODE = "qrcode";
    public static final String KEY_SHARE_CONFIG_SCREENSHOT = "screenshots";
    public static final String KEY_SHARE_CONFIG_SINAWEIBO = "sinaweibo";
    public static final String KEY_SHARE_CONFIG_SMS = "sms";
    public static final String KEY_SHARE_CONFIG_TAOPASSWORD = "taopassword";
    public static final String KEY_SHARE_CONFIG_TAOPASSWORDTIPS = "taopasswordtips";
    public static final String KEY_SHARE_CONFIG_WANGXIN = "wangxin";
    public static final String KEY_SHARE_CONFIG_WEIXIN = "weixin";
    public static final String KEY_SHARE_CONFIG_WEIXINTIMELINE = "weixintimeline";
    public static final String KEY_SHARE_SCREENSHOT_BIZ_ID = "Physical_Screenshots";
    public static final String LOCAL_PASSWORD_REGEX_KEY = "local_password_regex";

    /* renamed from: a  reason: collision with root package name */
    private static String f31841a;
    private static Map<String, String> b;
    private static String c;
    private static String d;
    private static JSONObject e;
    private static AtomicBoolean f;

    public static /* synthetic */ void a(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else {
            b(context, map);
        }
    }

    public static /* synthetic */ Map b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ce771b1", new Object[]{map});
        }
        b = map;
        return map;
    }

    public static /* synthetic */ Map f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[0]) : b;
    }

    static {
        kge.a(-2124923721);
        f31841a = "taopassword_show_exceptionview";
        d = "";
        f = new AtomicBoolean(false);
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_share");
        b = configs;
        if (configs != null) {
            b(context, b);
        }
        OrangeConfig.getInstance().registerListener(new String[]{"android_share"}, new f() { // from class: tb.nyk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.f
            public void onConfigUpdate(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                    return;
                }
                nyk.b(OrangeConfig.getInstance().getConfigs("android_share"));
                if (nyk.f() == null) {
                    return;
                }
                nyk.a(context, nyk.f());
            }
        });
        f.set(true);
    }

    private static void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
            return;
        }
        c(context, map);
        c(map);
        d(map);
        a(map);
    }

    public static JSONObject a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0b50433", new Object[]{str, map});
        }
        if (map == null) {
            return null;
        }
        try {
            return JSON.parseObject(map.get(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void c(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c334b027", new Object[]{context, map});
            return;
        }
        JSONObject a2 = a("taopassword", map);
        if (a2 == null) {
            return;
        }
        String string = a2.getString(f31841a);
        if (TextUtils.isEmpty(string)) {
            string = "1";
        }
        if ("1".equals(string)) {
            a.a().a(true);
        } else {
            a.a().a(false);
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        try {
            JSONObject a2 = a("taopassword", map);
            if (a2 == null) {
                return;
            }
            d = a2.getString("taopassword_dns_regex");
        } catch (Throwable unused) {
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : TextUtils.isEmpty(d) ? ".*http(s?)://(baron|share).laiwang.com.*tm=.*" : d;
    }

    private static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
            return;
        }
        JSONObject a2 = a("android_share_component_config", map);
        e = a2;
        if (a2 == null) {
            return;
        }
        c = e.getString(KEY_SHARE_CONFIG_TAOPASSWORDTIPS);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        JSONObject jSONObject = e;
        if (jSONObject == null) {
            return !KEY_SHARE_CONFIG_IPRESENT.equals(str) && !KEY_SHARE_CONFIG_SCREENSHOT.equals(str);
        }
        String string = jSONObject.getString(str);
        return (KEY_SHARE_CONFIG_IPRESENT.equals(str) || KEY_SHARE_CONFIG_SCREENSHOT.equals(str)) ? "true".equals(string) : !"false".equals(string);
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
        String str3 = "setTPCharacterBlackList 2 listStr=" + str;
        oag.a(Arrays.asList(str.split(",")));
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : PreferenceManager.getDefaultSharedPreferences(context).getString(LOCAL_PASSWORD_REGEX_KEY, DETAULT_PLAN_A_PASSWORD_REGEX);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(LOCAL_PASSWORD_REGEX_KEY, str).apply();
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : KEY_SHARE_SCREENSHOT_BIZ_ID.equals(str);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String a2 = nyl.a(b, "reflow_plan", "B");
        return TextUtils.isEmpty(a2) ? "B" : a2;
    }

    public static String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        Application b2 = ShareBizAdapter.getInstance().getAppEnv().b();
        String a2 = nyl.a(b, "plan_a_regex", DETAULT_PLAN_A_PASSWORD_REGEX);
        if (TextUtils.isEmpty(a2)) {
            str = b(b2);
        } else {
            a(b2, a2);
            str = a2;
        }
        return TextUtils.isEmpty(str) ? DETAULT_PLAN_A_PASSWORD_REGEX : str;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        String a2 = nyl.a(b, "plan_b_regex", DEFAULT_PLAN_B_PASSWORD_REGEX);
        return TextUtils.isEmpty(a2) ? DEFAULT_PLAN_B_PASSWORD_REGEX : a2;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : nyl.a(b, "plan_pre_regex", ".*\\/.*");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share", "checkSubProcess", "true"));
    }
}
