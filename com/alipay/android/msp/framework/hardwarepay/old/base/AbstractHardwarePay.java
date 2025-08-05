package com.alipay.android.msp.framework.hardwarepay.old.base;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class AbstractHardwarePay implements IHardwarePay {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static Object BL_Callback = null;
    public static int CURRENT_BL_REQUEST = -1;
    public static int CURRENT_COMMAND = -1;
    public static int CURRENT_FP_REQUEST = -1;
    public static Object FP_Callback;

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.IHardwarePay
    public String createRequestJson(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2fb9074", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", (Object) Integer.valueOf(i));
            jSONObject.put("version", (Object) Integer.valueOf(i2));
            jSONObject.put("data", (Object) str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return jSONObject.toString();
    }

    public void toCallback(BaseCommonPayHelper baseCommonPayHelper, Object obj, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7875b2f7", new Object[]{this, baseCommonPayHelper, obj, new Integer(i), str});
            return;
        }
        baseCommonPayHelper.reflectCallBack(obj, i, str);
        MspHardwarePayUtil.getInstance().destroy();
    }

    private void addRegAuthData(JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d64b04", new Object[]{this, jSONObject, new Integer(i), new Integer(i2)});
        } else {
            JsonUtil.addUniqueItem(jSONObject, "secData", AuthenticatorApi.getRegAuthData(GlobalHelper.getInstance().getContext(), i, i2, PhoneCashierMspEngine.getMspWallet().getUserId()));
        }
    }

    public String createInitReplyJson(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731e5d8a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", (Object) 6);
            jSONObject.put("message", (Object) "");
            jSONObject.put("result", (Object) Integer.valueOf(i));
            JSONObject jSONObject2 = new JSONObject();
            addRegAuthData(jSONObject2, i2, i3);
            jSONObject.put("data", (Object) jSONObject2);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return jSONObject.toString();
    }
}
