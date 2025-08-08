package tb;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.desktop.widget.manager.e;

/* loaded from: classes7.dex */
public class khy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1310793356);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            return a(kib.a().b(), str);
        } catch (Exception e) {
            kif.a("WidgetServiceNativeHub widgetInstallSupport error：" + e);
            return false;
        }
    }

    private static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String u = e.u(context);
        if (StringUtils.isEmpty(u)) {
            return false;
        }
        JSONObject parseObject = JSONObject.parseObject(u);
        String lowerCase = Build.BRAND.toLowerCase();
        String str2 = Build.VERSION.RELEASE;
        JSONObject jSONObject = parseObject.getJSONObject(lowerCase);
        if (jSONObject == null) {
            return false;
        }
        boolean z2 = kid.b(str2, jSONObject.getString("os_version")) >= 0;
        boolean booleanValue = jSONObject.getBoolean("os_support").booleanValue();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1206476313:
                if (lowerCase.equals("huawei")) {
                    c = 0;
                    break;
                }
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    c = 4;
                    break;
                }
                break;
            case 3418016:
                if (lowerCase.equals("oppo")) {
                    c = 2;
                    break;
                }
                break;
            case 3620012:
                if (lowerCase.equals("vivo")) {
                    c = 3;
                    break;
                }
                break;
            case 99462250:
                if (lowerCase.equals("honor")) {
                    c = 1;
                    break;
                }
                break;
            case 108389869:
                if (lowerCase.equals(l.REDMI_MANUFACTURE_LOWER_CASE)) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2 ? !z2 || !booleanValue : c == 3 ? !z2 || !booleanValue || !kid.d(context, "") : (c != 4 && c != 5) || !z2 || !booleanValue || !kid.b(context)) {
            z = false;
        }
        kih.a("widget_add_support", lowerCase, String.valueOf(z), null);
        if (!z) {
            return false;
        }
        return b(context, str);
    }

    private static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        String v = e.v(context);
        if (!StringUtils.isEmpty(v)) {
            JSONObject parseObject = JSONObject.parseObject(v);
            if (parseObject.getJSONObject(str) != null) {
                String string = parseObject.getJSONObject(str).getString("app_version");
                String h = kid.h(context);
                if (!StringUtils.isEmpty(h) && !StringUtils.isEmpty(string)) {
                    if (!(kid.b(h, string) >= 0)) {
                        return false;
                    }
                }
            }
        }
        if (!kic.a()) {
            return false;
        }
        kif.a("WidgetServiceNativeHub widgetInstallSupport typeId：" + str);
        return true;
    }
}
