package tb;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.nav.Nav;
import com.taobao.android.purchase.core.TBBuyDegradeWVService;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes6.dex */
public class igd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;
    public static String d;

    static {
        kge.a(953756885);
        c = "outside";
        d = Constants.KEY_FULL_LINK;
    }

    public static boolean a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8bb1508", new Object[]{activity, str})).booleanValue() : a(activity, str, null, null);
    }

    public static boolean a(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa97181c", new Object[]{activity, str, str2, str3})).booleanValue();
        }
        String a2 = a(activity);
        q.a(TBBuyDegradeWVService.BRIDGE_PLUGIN_NAME, (Class<? extends e>) TBBuyDegradeWVService.class, true);
        TBBuyDegradeWVService.setBuildOrderParams(a2);
        UnifyLog.d("DowngradeUtils", "downgradToH5", "params:", a2);
        tdh.a(a2, str, str2, str3);
        Nav.from(activity).withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri("https://main.m.taobao.com/order/index.html?hybrid=true");
        activity.overridePendingTransition(0, 0);
        fke.a(activity);
        return true;
    }

    private static String a(Activity activity) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{activity});
        }
        Intent b = fke.b(activity);
        if (b == null) {
            tdh.b("EMPTY_INTENT_FORM_(buildOrderUrlParams)", "intent is empty");
            return null;
        }
        Map<String, String> a2 = dui.a(activity, b);
        if (a2 == null || a2.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : a2.keySet()) {
            if (!StringUtils.isEmpty(str2) && !str2.equals("hybrid") && (str = a2.get(str2)) != null) {
                String encode = URLEncoder.encode(str);
                sb.append("&" + str2 + "=" + encode);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
