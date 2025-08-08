package com.taobao.detail.rate.vivid.ability;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.p;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class e extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CANCEL = "cancel";
    public static final String FAILURE = "failure";
    public static final String SUCCESS = "success";
    public static final String TAG = "XRateWindvaneV2Ability";
    public static final long XRATEWINDVANEV2 = -2207554980288952361L;

    public static /* synthetic */ JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str}) : b(str);
    }

    public static /* synthetic */ void a(String str, JSONObject jSONObject, dll dllVar, p pVar, android.taobao.windvane.jsbridge.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a8ebc2", new Object[]{str, jSONObject, dllVar, pVar, hVar});
        } else {
            b(str, jSONObject, dllVar, pVar, hVar);
        }
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        Log.e(TAG, "onExecuteWithData: " + dlhVar);
        if (dlhVar == null || dlhVar.c() == null) {
            dllVar.callback("failure", new dla(new JSONObject()));
            return new dla();
        }
        JSONObject c = dlhVar.c();
        String string = c.getString("pluginName");
        String string2 = c.getString(FluidException.METHOD_NAME);
        JSONObject jSONObject = c.getJSONObject("params");
        final android.taobao.windvane.jsbridge.h hVar = new android.taobao.windvane.jsbridge.h();
        hVar.d = string;
        hVar.e = string2;
        final p pVar = new p(dleVar.a(), null);
        IJsApiFailedCallBack iJsApiFailedCallBack = new IJsApiFailedCallBack() { // from class: com.taobao.detail.rate.vivid.ability.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
            public void fail(String str) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("534fc72f", new Object[]{this, str});
                    return;
                }
                JSONObject a2 = e.a(str);
                if (a2 == null || !StringUtils.equals(a2.getString("errorCode"), "-2")) {
                    z = false;
                }
                e.a(z ? "cancel" : "failure", a2, dllVar, pVar, hVar);
            }
        };
        IJsApiSucceedCallBack iJsApiSucceedCallBack = new IJsApiSucceedCallBack() { // from class: com.taobao.detail.rate.vivid.ability.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
            public void succeed(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5b77b53", new Object[]{this, str});
                } else {
                    e.a("success", e.a(str), dllVar, pVar, hVar);
                }
            }
        };
        if (jSONObject != null) {
            try {
                hVar.f = jSONObject.toJSONString();
            } catch (Throwable th) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", (Object) ("call windvane failed :" + th.getMessage()));
                b("failure", jSONObject2, dllVar, pVar, hVar);
            }
        }
        android.taobao.windvane.jsbridge.l.b().a(pVar, hVar, iJsApiFailedCallBack, iJsApiSucceedCallBack);
        return new dla();
    }

    private static void b(String str, JSONObject jSONObject, dll dllVar, p pVar, android.taobao.windvane.jsbridge.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21d28a1", new Object[]{str, jSONObject, dllVar, pVar, hVar});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("status", (Object) str);
        jSONObject2.put("result", (Object) jSONObject);
        c(str, jSONObject2, dllVar, pVar, hVar);
    }

    private static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    private static void c(String str, JSONObject jSONObject, dll dllVar, p pVar, android.taobao.windvane.jsbridge.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e916580", new Object[]{str, jSONObject, dllVar, pVar, hVar});
            return;
        }
        dllVar.callback(str, new dla(jSONObject));
        a(pVar, hVar);
    }

    private static void a(p pVar, android.taobao.windvane.jsbridge.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d24020", new Object[]{pVar, hVar});
        } else if (pVar == null || hVar == null) {
        } else {
            Object a2 = pVar.a(hVar.d);
            if (!(a2 instanceof android.taobao.windvane.jsbridge.e)) {
                return;
            }
            ((android.taobao.windvane.jsbridge.e) a2).onDestroy();
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public e a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("22fd1ff6", new Object[]{this, obj}) : new e();
        }
    }
}
