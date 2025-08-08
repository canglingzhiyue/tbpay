package com.taobao.android.behavir.util.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.k;
import org.ifaa.android.manager.face.IFAAFaceManager;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2053476577);
    }

    public static boolean a(UCPJSBridge uCPJSBridge, IWVWebView iWVWebView, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98282fca", new Object[]{uCPJSBridge, iWVWebView, str, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && wVCallBackContext != null) {
            TryDecisionPassParam tryDecisionPassParam = (TryDecisionPassParam) JSON.parseObject(str, TryDecisionPassParam.class);
            if (tryDecisionPassParam == null || StringUtils.isEmpty(tryDecisionPassParam.schemeId) || StringUtils.isEmpty(tryDecisionPassParam.bizId)) {
                wVCallBackContext.error("入参异常");
            } else {
                String str2 = tryDecisionPassParam.schemeId;
                String str3 = tryDecisionPassParam.bizId;
                String valueOf = String.valueOf(com.taobao.android.ucp.util.b.a());
                JSONObject jSONObject = new JSONObject(4);
                jSONObject.put("algParams", (Object) k.a(str2, str3, valueOf, null).toJSONString());
                r rVar = new r();
                rVar.a("trackInfo", new org.json.JSONObject(jSONObject));
                rVar.a("schemeId", str2);
                rVar.a("bizId", str3);
                rVar.a("traceId", valueOf);
                rVar.a("decisionResult", (Object) true);
                wVCallBackContext.success(rVar);
                return true;
            }
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8d2ec9", new Object[]{jSONObject, wVCallBackContext})).booleanValue();
        }
        String string = jSONObject.getString("id");
        if (!StringUtils.isEmpty(string)) {
            String[] split = StringUtils.split(string, "\\.");
            if (split.length >= 5) {
                Utils.a(split[1], split[2], split[3], split[4], new Utils.a() { // from class: com.taobao.android.behavir.util.bridge.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.behavir.util.Utils.a
                    public void a(boolean z, int i, JSONObject jSONObject2, long j) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bc28a12b", new Object[]{this, new Boolean(z), new Integer(i), jSONObject2, new Long(j)});
                        } else {
                            WVCallBackContext.this.success(g.a("checkResult", Boolean.valueOf(z), "retCode", Integer.valueOf(i), "trackInfo", jSONObject2).toString());
                        }
                    }
                });
                return true;
            }
        }
        wVCallBackContext.success(g.a("checkResult", false, "retCode", Integer.valueOf((int) IFAAFaceManager.STATUS_FACE_OFFSET_TOP)).toString());
        return false;
    }
}
