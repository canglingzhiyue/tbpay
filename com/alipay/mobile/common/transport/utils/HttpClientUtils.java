package com.alipay.mobile.common.transport.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

/* loaded from: classes3.dex */
public final class HttpClientUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String removeParamter(HttpUriRequest httpUriRequest, String str) {
        Object parameter;
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("322de8cf", new Object[]{httpUriRequest, str});
        }
        try {
            HttpParams params = httpUriRequest.getParams();
            if (params == null || (parameter = params.getParameter(str)) == null) {
                return "";
            }
            params.removeParameter(str);
            if (parameter instanceof String) {
                obj = (String) parameter;
            } else {
                LogCatUtil.warn("HttpClientUtils", "[removeParamter] parameter type = " + parameter.getClass().getName());
                obj = parameter.toString();
            }
            return TextUtils.isEmpty(obj) ? "" : obj;
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientUtils", "removeParamter fail.", th);
            return "";
        }
    }

    public static int removeIntParamter(HttpUriRequest httpUriRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60c8befd", new Object[]{httpUriRequest, str})).intValue();
        }
        HttpParams params = httpUriRequest.getParams();
        if (params == null) {
            return -1;
        }
        try {
            int intParameter = params.getIntParameter(str, -1);
            if (intParameter == -1) {
                return intParameter;
            }
            params.removeParameter(str);
            return intParameter;
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientUtils", "removeIntParamter fail.", th);
            return -1;
        }
    }
}
