package com.taobao.vessel.web;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.base.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class VesselWebApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(713678768);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"vessel".equals(str)) {
            return false;
        }
        Map<String, Object> hashMap = new HashMap<>();
        try {
            hashMap = JSON.parseObject(str2);
        } catch (Exception e) {
            hashMap.put("err", e);
        }
        b.a().a(wVCallBackContext.getWebview(), hashMap, new com.taobao.vessel.base.a(wVCallBackContext));
        return true;
    }
}
