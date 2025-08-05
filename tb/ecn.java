package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;

/* loaded from: classes4.dex */
public class ecn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFERENCE_FILE_NAME = "TB_Detail";

    static {
        kge.a(2003750305);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("TB_Detail", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : b(context, str, (String) null);
    }

    public static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2}) : context.getApplicationContext().getSharedPreferences("TB_Detail", 0).getString(str, str2);
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51141ee", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("TB_Detail", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
        return true;
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue() : b(context, str, false);
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d49adbef", new Object[]{context, str, new Boolean(z)})).booleanValue() : context.getApplicationContext().getSharedPreferences("TB_Detail", 0).getBoolean(str, z);
    }

    public static void a(Context context, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a26959", new Object[]{context, cVar});
            return;
        }
        try {
            if (cVar == null) {
                a(context, nyo.SP_KEY_AFFECTION_DETAIL, "");
                a(context, "detail_data_for_global_bubble", "");
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("itemid", (Object) cVar.i());
                jSONObject.put("title", (Object) cVar.k());
                jSONObject.put("shop", (Object) eqb.d(cVar.f10055a).shopName);
                jSONObject.put("price", (Object) eqb.m(cVar.f10055a).transmitPrice.priceText);
                jSONObject.put("pic", (Object) eqb.c(cVar.f10055a).images.get(0));
                jSONObject.put("url", (Object) ("http://item.taobao.com/item.htm?id=" + cVar.i()));
                a(context, nyo.SP_KEY_AFFECTION_DETAIL, jSONObject.toJSONString());
                a(context, "detail_data_for_global_bubble", jSONObject.toJSONString());
            }
        } catch (Throwable unused) {
        }
    }
}
