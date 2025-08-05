package tb;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/pub/utils/PubCommonUtils;", "", "()V", "FEEDBACK_APP_ID", "", "addToDesktopCall", "", "activity", "Landroid/app/Activity;", "miniAppId", ChangeAppIconBridge.KEY_ICONNAME, "iconUrl", "targetUrl", "getProxyUrl", "appId", "setProxyUrl", "", "url", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qrb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEEDBACK_APP_ID = "3000000002007701";
    public static final qrb INSTANCE;

    static {
        kge.a(229575791);
        INSTANCE = new qrb();
    }

    private qrb() {
    }

    @JvmStatic
    public static final boolean a(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96bf6be6", new Object[]{activity, str, str2, str3, str4})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "miniAppId", str);
        jSONObject2.put((JSONObject) ChangeAppIconBridge.KEY_ICONNAME, str2);
        jSONObject2.put((JSONObject) "iconUrl", str3);
        String str5 = str4;
        if (str5 == null || str5.length() == 0) {
            z = true;
        }
        if (!z) {
            String uri = Uri.parse(str4).buildUpon().appendQueryParameter("sModuleName", TMSCalendarBridge.namespace).appendQueryParameter(gvw.CONFIG_LAUNCH, "0").appendQueryParameter("sKeep", "1").build().toString();
            q.b(uri, "Uri.parse(targetUrl).bui…, \"1\").build().toString()");
            jSONObject2.put((JSONObject) "targetUrl", uri);
        } else {
            jSONObject2.put((JSONObject) "targetUrl", str4);
        }
        khz.a(activity, jSONObject.toJSONString());
        return true;
    }
}
