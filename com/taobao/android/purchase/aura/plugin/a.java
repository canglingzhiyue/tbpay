package com.taobao.android.purchase.aura.plugin;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.external.TBBuyExternalRPVerifyService;
import com.taobao.android.weex_framework.bridge.b;
import tb.arc;
import tb.ard;
import tb.icx;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f14746a;

    static {
        kge.a(-1062666693);
    }

    public a(Context context) {
        this.f14746a = context;
    }

    public void a(String str, JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb51acac", new Object[]{this, str, jSONObject, bVar, bVar2});
            return;
        }
        Log.e("TBBuyJsBridge", "onReceiveMessage event = " + str);
        ard a2 = arc.a();
        a2.b("onReceiveMessage event = " + str, arc.a.a().b("TBBuyJsBridge").a("AliBuyCommonModule/event").a("receive", str).b());
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!"verifyRP".equals(str)) {
            return;
        }
        a(jSONObject, bVar, bVar2);
    }

    private boolean a(JSONObject jSONObject, final b bVar, final b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc691d3a", new Object[]{this, jSONObject, bVar, bVar2})).booleanValue();
        }
        String string = jSONObject.getString(BaseJsExecutor.NAME_VERIFY_TOKEN);
        if (TextUtils.isEmpty(string)) {
            bVar.a(a("verifyToken is null"));
            arc.a().b("TBBuyJsBridge verifyToken is null!!");
        }
        new TBBuyExternalRPVerifyService().verify(this.f14746a, string, new icx.b() { // from class: com.taobao.android.purchase.aura.plugin.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.icx.b
            public void a(boolean z, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("errorCode", (Object) str);
                jSONObject2.put("errorMsg", (Object) str2);
                if (z) {
                    bVar.a(jSONObject2);
                } else {
                    bVar2.a(jSONObject2);
                }
            }
        });
        return true;
    }

    private JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            jSONObject.put("message", (Object) str);
        }
        return jSONObject;
    }
}
