package com.alibaba.security.realidentity.ui.webview.jsbridge;

import android.text.TextUtils;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.c;
import com.alibaba.security.realidentity.d;
import com.alibaba.security.realidentity.r;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

@JSTopic(topic = "deviceInfo")
/* loaded from: classes3.dex */
public class GetDeviceInfoApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_CLIENT_INFO = "clientInfo";

    public GetDeviceInfoApi(u4 u4Var) {
        super(u4Var);
    }

    private void handleResult(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4affed2", new Object[]{this, jSONObject});
            return;
        }
        WVResultWrapper wVResultWrapper = new WVResultWrapper();
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.toString())) {
            wVResultWrapper.setSuccess();
            wVResultWrapper.addData("clientInfo", jSONObject);
            this.mWVCallbackContext.success(wVResultWrapper);
            return;
        }
        wVResultWrapper.addData("errorMsg", BaseJsExecutor.MSG_RET_FAILED_NO_INFO);
        this.mWVCallbackContext.error(wVResultWrapper);
    }

    public static /* synthetic */ Object ipc$super(GetDeviceInfoApi getDeviceInfoApi, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, JsCallbackAdapter jsCallbackAdapter) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            WVResultWrapper wVResultWrapper = new WVResultWrapper();
            wVResultWrapper.addData("errorMsg", BaseJsExecutor.MSG_RET_FAILED_NO_INFO);
            jsCallbackAdapter.error(wVResultWrapper);
            return false;
        }
        String optString = jSONObject.optString(BaseJsExecutor.NAME_VERIFY_TOKEN, "");
        if (!TextUtils.isEmpty(optString)) {
            setVerifyToken(optString);
        }
        String a2 = c.a(r.a().a(this.mContext, optString));
        ClientInfo clientInfo = new ClientInfo(this.mContext);
        clientInfo.setClientType("WirelessH5");
        clientInfo.setVersionTag(a2);
        try {
            jSONObject2 = new JSONObject(b.a(clientInfo));
        } catch (JSONException e) {
            trackExceptionLog("GetDeviceInfoApi json assemble error", d.b(e));
            jSONObject2 = null;
        }
        handleResult(jSONObject2);
        return true;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "deviceInfo";
    }
}
