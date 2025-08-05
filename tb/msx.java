package tb;

import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes7.dex */
public class msx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CONFIG = "";
    public static final String ORANGE_CONFIG_BUSINESS = "mpm_business_switch";

    /* renamed from: a  reason: collision with root package name */
    private static final String f31231a;
    private static final String b;
    private static final String c;

    static {
        kge.a(-752516869);
        f31231a = Build.BRAND.toLowerCase();
        b = Build.MODEL.replace(" ", "");
        c = Build.VERSION.RELEASE;
    }

    public static a a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6ccae26f", new Object[0]);
        }
        try {
            JSONObject parseObject = JSON.parseObject(OrangeConfig.getInstance().getConfig("mpm_business_switch", "PushCompatibleConfigs", ""));
            if (parseObject.containsKey(f31231a)) {
                JSONObject jSONObject2 = parseObject.getJSONObject(f31231a);
                if (jSONObject2.containsKey(c)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(c);
                    if (jSONObject3.containsKey(b)) {
                        jSONObject = jSONObject3.getJSONObject(b);
                    } else {
                        jSONObject = jSONObject3.containsKey("defaultConfig") ? jSONObject3.getJSONObject("defaultConfig") : null;
                    }
                    if (jSONObject != null) {
                        return (a) JSON.parseObject(JSON.toJSONString(jSONObject), a.class);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "isDisableSceneShowStyle", "0"));
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f31232a;
        private String b;
        private String c;

        static {
            kge.a(112496281);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f31232a;
        }
    }
}
