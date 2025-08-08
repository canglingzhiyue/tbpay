package com.taobao.android.festival.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class AliFestivalWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> EMPTY_MAP;
    public static final String PARAMS_DEFAULT_VALUE = "defaultValue";
    public static final String PARAMS_KEY = "key";
    public static final String PARAMS_MODULE_NAME = "moduleName";

    static {
        kge.a(-952114993);
        EMPTY_MAP = new HashMap(0);
    }

    public boolean getFestivalConfigByModule(String str, WVCallBackContext wVCallBackContext) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2860c925", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        if (StringUtils.isEmpty(str)) {
            rVar.a("errorMsg", "empty params");
            wVCallBackContext.error(rVar);
            return false;
        }
        try {
            string = JSON.parseObject(str).getString(PARAMS_MODULE_NAME);
        } catch (Throwable unused) {
            rVar.a("errorMsg", "empty params");
            wVCallBackContext.error(rVar);
        }
        if (StringUtils.isEmpty(string)) {
            rVar.a("errorMsg", "mo module name");
            wVCallBackContext.error(rVar);
            return false;
        }
        Map<String, String> b = FestivalMgr.a().b(string);
        rVar.a(string, b == null ? EMPTY_MAP : JSONObject.toJSONString(b));
        wVCallBackContext.success(rVar);
        return false;
    }

    public boolean getFestivalConfigByKey(String str, WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        String string3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cda9ea", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        if (StringUtils.isEmpty(str)) {
            rVar.a("errorMsg", "empty params");
            wVCallBackContext.error(rVar);
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString(PARAMS_MODULE_NAME);
            string2 = parseObject.getString("key");
            string3 = parseObject.getString(PARAMS_DEFAULT_VALUE);
        } catch (Throwable unused) {
            rVar.a("errorMsg", "empty params");
            wVCallBackContext.error(rVar);
        }
        if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
            String d = FestivalMgr.a().d(string, string2);
            if (StringUtils.isEmpty(d)) {
                if (StringUtils.isEmpty(string3)) {
                    string3 = "";
                }
                rVar.a(string2, string3);
            } else {
                rVar.a(string2, d);
            }
            wVCallBackContext.success(rVar);
            return false;
        }
        rVar.a("errorMsg", "mo module name or config key");
        wVCallBackContext.error(rVar);
        return false;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getFestivalConfigByModule".equals(str)) {
            return getFestivalConfigByModule(str2, wVCallBackContext);
        }
        if ("getFestivalConfigByKey".equals(str)) {
            return getFestivalConfigByKey(str2, wVCallBackContext);
        }
        r rVar = new r();
        rVar.a("errorMsg", "no matched method");
        wVCallBackContext.error(rVar);
        return false;
    }
}
