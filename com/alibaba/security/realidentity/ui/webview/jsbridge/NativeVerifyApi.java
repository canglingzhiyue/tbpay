package com.alibaba.security.realidentity.ui.webview.jsbridge;

import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.RPVerify;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

@JSTopic(topic = "startVerifyByNative")
/* loaded from: classes3.dex */
public class NativeVerifyApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NativeVerifyJSApi";

    public NativeVerifyApi(u4 u4Var) {
        super(u4Var);
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, final JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        a.a(TAG, "NativeVerifyApi execute params: " + str);
        try {
            RPVerify.startByNative(this.mContext, new JSONObject(str).getString(BaseJsExecutor.NAME_VERIFY_TOKEN), new RPEventListener() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.NativeVerifyApi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.realidentity.RPEventListener
                public void onFinish(RPResult rPResult, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str2, str3});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(BaseJsExecutor.NAME_AUDIT_STATUS, rPResult.code);
                    } catch (JSONException e) {
                        a.a(NativeVerifyApi.TAG, e);
                    }
                    WVResultWrapper wVResultWrapper = new WVResultWrapper();
                    wVResultWrapper.setData(jSONObject);
                    jsCallbackAdapter.success(wVResultWrapper);
                    NativeVerifyApi.this.finishJsBridge(wVResultWrapper, true);
                }
            });
            return true;
        } catch (JSONException e) {
            a.a(TAG, "NativeVerifyApi parse params error", e);
            trackExceptionLog("NativeVerifyApi parse params error", e);
            callbackUnknowError(jsCallbackAdapter);
            return false;
        }
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "startVerifyByNative";
    }
}
