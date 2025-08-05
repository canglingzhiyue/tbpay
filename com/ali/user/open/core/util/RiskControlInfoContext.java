package com.ali.user.open.core.util;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.WUAData;
import com.ali.user.open.core.service.StorageService;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import tb.kge;

/* loaded from: classes2.dex */
public class RiskControlInfoContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(267012688);
    }

    public static String buildRiskControlInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79bffeab", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        StorageService storageService = (StorageService) AliMemberSDK.getService(StorageService.class);
        WUAData wua = storageService.getWUA();
        if (wua != null) {
            jSONObject.put("wua", (Object) wua.wua);
            jSONObject.put("t", (Object) wua.t);
        }
        jSONObject.put("umidToken", (Object) storageService.getUmid());
        Context applicationContext = KernelContext.getApplicationContext();
        jSONObject.put("osName", (Object) "android");
        jSONObject.put("osVersion", (Object) Build.VERSION.RELEASE);
        jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) Build.MODEL);
        jSONObject.put("deviceName", (Object) Build.MODEL);
        jSONObject.put("deviceBrand", (Object) Build.MANUFACTURER);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        applicationContext.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        jSONObject.put("screenSize", (Object) (i + "x" + i2));
        jSONObject.put("appStore", (Object) AliMemberSDK.ttid);
        return jSONObject.toJSONString();
    }
}
