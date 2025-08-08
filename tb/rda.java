package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.ax;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.nav.Nav;

/* loaded from: classes9.dex */
public class rda {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f33083a;
    private static String b;

    static {
        kge.a(-696208727);
        f33083a = "1";
        b = "0";
    }

    public static void a(Context context, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1380fa4", new Object[]{context, jSONObject, str, str2});
            return;
        }
        String a2 = m.a(b, jSONObject, "redirect");
        String a3 = m.a("", jSONObject, "redirect_url");
        if (!StringUtils.equals(f33083a, a2) || StringUtils.isEmpty(a3)) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("selectedContentIds", (Object) str);
        jSONObject2.put("publishTaskId", (Object) str2);
        Nav.from(context).toUri(ax.a(a3, jSONObject2));
    }
}
