package com.taobao.android.tschedule.strategy;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import tb.jkq;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(475455627);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        return a(parse, parse2) && b(parse, parse2);
    }

    private static boolean a(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d711a94c", new Object[]{uri, uri2})).booleanValue();
        }
        String host = uri.getHost();
        String host2 = uri2.getHost();
        if (!StringUtils.equals(host, host2)) {
            jkq.a("UrlChecker", "host equal=[false],require=[" + host + "],real=[" + host2 + riy.ARRAY_END_STR);
            return false;
        }
        String path = uri.getPath();
        String path2 = uri2.getPath();
        if (StringUtils.equals(path, path2)) {
            return true;
        }
        jkq.a("UrlChecker", "path equal=[false],require=[" + path + "],real=[" + path2 + riy.ARRAY_END_STR);
        return false;
    }

    private static boolean b(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a012a08d", new Object[]{uri, uri2})).booleanValue();
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return true;
        }
        Set<String> queryParameterNames2 = uri2.getQueryParameterNames();
        if (queryParameterNames2 == null || queryParameterNames2.isEmpty()) {
            jkq.a("UrlChecker", "real url miss query");
            return false;
        }
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            String queryParameter2 = uri2.getQueryParameter(str);
            if (!StringUtils.equals(queryParameter, queryParameter2)) {
                try {
                    JSONObject parseObject = JSONObject.parseObject(queryParameter);
                    JSONObject parseObject2 = JSONObject.parseObject(queryParameter2);
                    if (parseObject2 != null && parseObject != null) {
                        for (String str2 : parseObject.keySet()) {
                            if (!StringUtils.equals(parseObject.getString(str2), parseObject2.getString(str2))) {
                                jkq.a("UrlChecker", "query value is not equal, queryKey=" + str + ", originalVal=" + queryParameter + ", comparedVal=" + queryParameter2);
                                return false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    jkq.a("UrlChecker", "query value is not equal, queryKey=" + str + ", originalVal=" + queryParameter + ", comparedVal=" + queryParameter2, th);
                    return false;
                }
            }
        }
        return true;
    }
}
