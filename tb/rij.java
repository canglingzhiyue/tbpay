package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.vividsocial.utils.h;

/* loaded from: classes9.dex */
public class rij {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TNODE_URL = "http://h5.m.taobao.com/tnode/index.htm?tnode=page_comment";
    public static final String KEY_FAST_EMOJI = "fast_emoji";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f33167a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;

    static {
        kge.a(1405543309);
    }

    public static JSONObject a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            String str3 = "default_params_" + str;
            if (!TextUtils.equals("20002", str) && !TextUtils.equals("guangguang", str) && !TextUtils.equals("ggdiscuss", str)) {
                str2 = "";
                return JSON.parseObject(OrangeConfig.getInstance().getConfig("dx_comment_qk", str3, str2));
            }
            str2 = "{\"fast_emoji\": 1, \"fast_emoji_list\": \"/:Q,/:815,/:087,/:b,/:085,/:071,/:?,/:077\"}";
            return JSON.parseObject(OrangeConfig.getInstance().getConfig("dx_comment_qk", str3, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig("dx_comment_qk", "overwrite_params_" + str, "{\"emojiBiz\":\"im\"}"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = f33167a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "reUseEngineNew", "false"))) {
            Boolean bool2 = true;
            f33167a = bool2;
            return bool2.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(h.a("TNodeComment.performance.reUseEngineNew", (Object) "false").toString()));
            f33167a = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return f33167a.booleanValue();
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "degradeCustomIME", "false")));
        b = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "enableBizBackgroundOpt", "true")));
        c = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "enableFixTopActivity", "true")));
        d = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("dx_comment_qk", "enableDealReply", "true")));
        e = valueOf;
        return valueOf.booleanValue();
    }
}
