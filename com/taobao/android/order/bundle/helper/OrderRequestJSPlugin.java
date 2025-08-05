package com.taobao.android.order.bundle.helper;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hzp;
import tb.kge;

/* loaded from: classes6.dex */
public class OrderRequestJSPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1118035525);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        hzp a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str2 == null) {
            return false;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (!"orderListRefresh".equals(str) || (a2 = e.a()) == null) {
            return false;
        }
        a2.a(parseObject);
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
