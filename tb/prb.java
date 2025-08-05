package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.uikit.mtop.GoodItem;

/* loaded from: classes8.dex */
public class prb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(280100476);
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject, boolean z, GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c415f1", new Object[]{context, str, str2, jSONObject, new Boolean(z), goodItem});
        } else {
            a(context, str, null, str2, jSONObject, z, goodItem);
        }
    }

    public static void a(Context context, String str, String str2, String str3, JSONObject jSONObject, boolean z, GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b52063b", new Object[]{context, str, str2, str3, jSONObject, new Boolean(z), goodItem});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("timePointPlayUrl", str2);
        if (jSONObject != null) {
            bundle.putString("mediaInfo", jSONObject.toJSONString());
        }
        bundle.putString("coverImage", str3);
        bundle.putBoolean("landScapeVideo", z);
        bundle.putLong("clickCardTime", System.currentTimeMillis());
        if (goodItem != null) {
            bundle.putString("bubbleGoodInfoJson", a(goodItem));
        }
        Nav.from(context).withExtras(bundle).toUri(str);
    }

    public static void a(Context context, String str, String str2, String str3, JSONObject jSONObject, boolean z, GoodItem goodItem, JSONObject jSONObject2, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5739184", new Object[]{context, str, str2, str3, jSONObject, new Boolean(z), goodItem, jSONObject2, new Boolean(z2), new Integer(i)});
            return;
        }
        Trace.beginSection("TLiveFFTrace - navi before nav call");
        Bundle bundle = new Bundle();
        bundle.putString("timePointPlayUrl", str2);
        if (jSONObject != null) {
            bundle.putString("mediaInfo", jSONObject.toJSONString());
        }
        bundle.putString("coverImage", str3);
        bundle.putBoolean("landScapeVideo", z);
        bundle.putLong("clickCardTime", System.currentTimeMillis());
        if (goodItem != null) {
            bundle.putString("bubbleGoodInfoJson", a(goodItem));
        }
        if (jSONObject2 != null) {
            bundle.putString("adTransParams", jSONObject2.toJSONString());
        }
        Nav withExtras = Nav.from(context).withExtras(bundle);
        Nav.setTransition(0, 0);
        if (z2) {
            withExtras.disableTransition();
        }
        Trace.endSection();
        if (u.w()) {
            withExtras.forResult(i).toUriSimple(str);
        } else {
            withExtras.forResult(i).toUri(str);
        }
    }

    private static String a(GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b4906bf", new Object[]{goodItem}) : JSON.toJSONString(goodItem);
    }
}
