package com.alipay.android.msp.configservice;

import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rrv;

/* loaded from: classes3.dex */
public class RPCParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f4482a;

    public static synchronized JSONObject getRpcParams(Context context) {
        synchronized (RPCParams.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9ad7bb4c", new Object[]{context});
            }
            if (f4482a == null) {
                f4482a = new JSONObject();
                DeviceInfo deviceInfo = new DeviceInfo();
                f4482a.put(rrv.PRODUCT_ID, (Object) "ALIPAY_SDK_ANDROID");
                f4482a.put("systemType", (Object) "android");
                f4482a.put("clientVersion", (Object) GlobalSdkConstant.getMspVersion());
                f4482a.put("mobileBrand", (Object) Build.BRAND);
                f4482a.put("mobileModel", (Object) Build.MODEL);
                f4482a.put("osVersion", (Object) Build.VERSION.RELEASE);
                f4482a.put("romVersion", (Object) deviceInfo.getRomVersion());
                f4482a.put("manufacturer", (Object) deviceInfo.getManufacturer());
                f4482a.put("appName", (Object) GlobalHelper.getInstance().getPackageName());
                f4482a.put("utdid", (Object) GlobalHelper.getInstance().getUtdid(context));
            }
            return f4482a;
        }
    }
}
