package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.tbabilitykit.m;
import com.taobao.mytaobao.base.c;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class bxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2032367151);
    }

    public static /* synthetic */ JSONObject a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5496e366", new Object[]{str, str2, str3}) : b(str, str2, str3);
    }

    public static /* synthetic */ void a(Activity activity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e8d66c", new Object[]{activity, str, jSONObject});
        } else {
            b(activity, str, jSONObject);
        }
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
        } else {
            a(activity, str, str2, null);
        }
    }

    public static void a(final Activity activity, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa971818", new Object[]{activity, str, str2, str3});
        } else if (activity == null || str == null) {
        } else {
            mtz.a(new Runnable() { // from class: tb.bxt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bxt.a(activity, m.API_H5, bxt.a(str, str2, str3));
                    }
                }
            });
        }
    }

    public static void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (activity == null) {
        } else {
            mtz.a(new Runnable() { // from class: tb.bxt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("popId", (Object) "TBTeenager");
                    bxt.a(activity, "close", jSONObject);
                }
            });
        }
    }

    private static JSONObject b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ac16c27", new Object[]{str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("popId", (Object) "TBTeenager");
        jSONObject.put("bizId", (Object) "TBTeenager");
        Uri.Builder buildUpon = Uri.parse("https://web.m.taobao.com/app/message-social-front/teenager-password-check/pop").buildUpon();
        if (Versions.isDebug() && !c.j()) {
            buildUpon.authority("web.wapa.taobao.com");
        }
        buildUpon.appendQueryParameter("bizCode", str);
        buildUpon.appendQueryParameter("mode", str2);
        jSONObject.put("url", (Object) buildUpon.build());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("maxHeight", (Object) Float.valueOf(0.35f));
        jSONObject2.put("shouldBlockClose", (Object) true);
        if (str3 != null) {
            jSONObject2.put("backgroundMode", (Object) "color");
            jSONObject2.put("backgroundStyle", (Object) str3);
        }
        jSONObject.put(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (Object) jSONObject2);
        return jSONObject;
    }

    private static void b(Activity activity, final String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ea280b", new Object[]{activity, str, jSONObject});
        } else {
            new alu(new alr("TeenagerRemind", "mytaobao").a((Context) activity)).a("stdPop", str, new alq().a(activity.getWindow().getDecorView()), jSONObject, new alo() { // from class: tb.bxt.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.alo
                public void onCallback(ExecuteResult executeResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                        return;
                    }
                    TLog.loge("TBTeenager", "stdPop api=" + str + " statusCode:" + executeResult.d());
                }
            });
        }
    }
}
