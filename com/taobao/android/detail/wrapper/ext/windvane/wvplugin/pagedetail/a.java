package com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.weex_framework.adapter.e;
import java.util.HashMap;
import tb.emu;
import tb.fiq;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(796426150);
    }

    public a() {
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail.DetailExecutor");
    }

    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (fiq.OPERATE_GET_DETAIL_DATA.equals(str)) {
                String a2 = a();
                if (StringUtils.isEmpty(a2)) {
                    wVCallBackContext.error();
                } else {
                    wVCallBackContext.success(a2);
                }
                return true;
            }
        } catch (Throwable th) {
            i.a("DetailExecutor", e.RECORD_EXECUTE, th);
        }
        return false;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (com.taobao.android.detail.core.detail.activity.a.c() == null || com.taobao.android.detail.core.detail.activity.a.c().f10055a == null || com.taobao.android.detail.core.detail.activity.a.c().f10055a.a() == null) {
            return null;
        }
        String jSONString = JSONObject.toJSONString(com.taobao.android.detail.core.detail.activity.a.c().f10055a.a());
        HashMap hashMap = new HashMap();
        hashMap.put("TBDetailModel", jSONString);
        return JSON.toJSONString(hashMap);
    }
}
