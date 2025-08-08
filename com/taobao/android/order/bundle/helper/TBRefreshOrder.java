package com.taobao.android.order.bundle.helper;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ris;

/* loaded from: classes6.dex */
public class TBRefreshOrder extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1720880809);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"onRefreshOrder".equals(str)) {
            return false;
        }
        try {
            if (!StringUtils.isEmpty(str2)) {
                z = "true".equals(JSONObject.parseObject(str2).get("isImmediatelyRefresh"));
            }
        } catch (Exception unused) {
        }
        a.b(this.mContext, z);
        a.c(this.mContext, z);
        if (this.mContext != null) {
            new ris(this.mContext, "TBOrderNative", null).a("refresh");
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
