package com.alipay.android.msp.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class OrderStrUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, String> extractExtInfoMapFromExternalInfo(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e776e57", new Object[]{str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(extractBizContextFromExternalInfo(str));
            if (parseObject == null || (jSONObject = parseObject.getJSONObject("extInfo")) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (String str2 : jSONObject.keySet()) {
                String string = jSONObject.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
            return hashMap;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static String extractBizContextFromExternalInfo(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcb0a7af", new Object[]{str});
        }
        try {
            if (str.startsWith("new_external_info==")) {
                return JSON.parseObject(str.substring(19)).getString("bizcontext");
            }
            String[] split = str.split("&");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    str2 = null;
                    break;
                }
                str2 = split[i];
                if (!StringUtils.isEmpty(str2) && str2.startsWith("bizcontext=")) {
                    break;
                }
                i++;
            }
            if (StringUtils.isEmpty(str2)) {
                return str2;
            }
            String substring = str2.substring(11);
            return (!substring.startsWith("\"") || !substring.endsWith("\"")) ? substring : substring.substring(1, substring.length() - 1);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
