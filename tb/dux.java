package tb;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.alibity.container.broadcast.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import tb.ifz;

/* loaded from: classes4.dex */
public class dux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1216708433);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!b(context)) {
        } else {
            c(context);
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (!b(context)) {
        } else {
            if (d(context) && !TextUtils.isEmpty(str)) {
                b(context, str);
            } else {
                c(context);
            }
        }
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        Intent b = fke.b(context);
        if (b != null) {
            return b.getIntExtra("purchase_from", -1) != 2 || "carts".equals(b.getStringExtra("openFrom"));
        }
        ifz.a(ifz.a.b("buyFragment").a("intent is empty").c("EMPTY_INTENT_FORM_(needRefreshCartImmediately)").a(1.0f));
        return false;
    }

    private static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        Intent b = fke.b(context);
        if (b != null) {
            return PopStrategy.IDENTIFIER_FLOAT.equals(b.getStringExtra("pageType")) && !iyp.a();
        }
        ifz.a(ifz.a.b("buyFragment").a("intent is empty").c("EMPTY_INTENT_FORM_(isFloatBuy)").a(1.0f));
        return false;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("from", "buyCreateOrder");
        intent.putExtra("cartBroadcastFrom", "createOrder");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) "buyCreateOrder");
        a("cartRefreshData", jSONObject);
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("cartIds", str);
        intent.putExtra("from", "modalBuyCreateOrder");
        intent.putExtra("cartBroadcastFrom", "modalBuyCreateOrder");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cartIds", (Object) str);
        jSONObject.put("from", (Object) "modalBuyCreateOrder");
        a("cartRefreshData", jSONObject);
    }

    private static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
        } else {
            new b().a("tbBuy", str, jSONObject);
        }
    }
}
