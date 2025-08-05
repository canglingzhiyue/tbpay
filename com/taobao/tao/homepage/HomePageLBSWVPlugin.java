package com.taobao.tao.homepage;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import tb.kge;

/* loaded from: classes8.dex */
public class HomePageLBSWVPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "homepage.HomePageLBSWVPlugin";

    static {
        kge.a(1588996224);
    }

    public boolean getCacheValue(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71324c17", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String a2 = com.taobao.homepage.business.permission.b.a(str, null);
        r rVar = new r();
        rVar.a("cacheValue", a2);
        wVCallBackContext.success(rVar);
        return true;
    }

    public boolean updateCacheValue(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17afa60a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    z = com.taobao.homepage.business.permission.b.a(parseObject.getString("scene"), parseObject.getString("subScene"), parseObject.getString("value"), "JSBRIDGE");
                }
            } catch (Exception unused) {
                String str2 = "update cache exception:" + str;
            }
        }
        if (z) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error("update cache fail");
        }
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE.equals(str)) {
            return getCacheValue(str2, wVCallBackContext);
        }
        if ("updateCache".equals(str)) {
            updateCacheValue(str2, wVCallBackContext);
        }
        return false;
    }
}
