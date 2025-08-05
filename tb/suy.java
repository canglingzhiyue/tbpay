package tb;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.windvane.b;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class suy implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-779016625);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("refreshHomePage");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(str2, wVCallBackContext);
    }

    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        final String str2;
        JSONObject jSONObject;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            float f = 0.5f;
            JSONObject jSONObject2 = null;
            if (parseObject != null) {
                jSONObject = parseObject.getJSONObject("bizParam");
                str2 = parseObject.getString("toastStirng");
                z = parseObject.getBooleanValue(LoginConstants.SHOW_TOAST);
                if (parseObject.containsKey("toastDelayedTime")) {
                    f = parseObject.getFloatValue("toastDelayedTime");
                }
            } else {
                str2 = "";
                jSONObject = null;
                z = false;
            }
            if (jSONObject != null) {
                jSONObject2 = new JSONObject();
                jSONObject2.put("bizParam", (Object) jSONObject);
            }
            oqc.a().a("insertCard", jSONObject2);
            if (z && !TextUtils.isEmpty(str2) && Globals.getApplication() != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.suy.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TBToast.makeText(Globals.getApplication(), str2).show();
                        }
                    }
                }, f * 1000.0f);
            }
            wVCallBackContext.success();
            lap.a("Bridge", "refreshHomePage", "success");
            return true;
        } catch (Exception unused) {
            lap.a("Bridge", "refreshHomePage", "params parse exception");
            wVCallBackContext.error();
            return false;
        }
    }
}
