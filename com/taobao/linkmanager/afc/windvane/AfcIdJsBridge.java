package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AfcIdJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "getAfcId";
    public static final String NAME = "AfcIdHandler";

    static {
        kge.a(-1415003770);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.equals(str, ACTION) || wVCallBackContext == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("afcId", UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        r rVar = new r();
        rVar.a("data", jSONObject);
        wVCallBackContext.success(rVar);
        return true;
    }
}
