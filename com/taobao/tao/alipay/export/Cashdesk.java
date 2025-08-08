package com.taobao.tao.alipay.export;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.b;
import com.taobao.taobao.internal.PayRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class Cashdesk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void invokeAlipay(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed0e8e26", new Object[]{context, map});
        } else if (PayRequest.CALL_WEIXIN_SDK.equals(map.get(CashdeskConstants.CASHIER_TYPE))) {
            new b().a((Activity) context, map, (com.taobao.taobao.internal.b) null);
        } else {
            Nav.from(context).toUri(getBuilder(map).toString());
        }
    }

    public static void invokeAlipay(Context context, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c3a99d", new Object[]{context, map, new Integer(i)});
            return;
        }
        map.put("result", "1");
        Nav.from(context).forResult(i).toUri(getBuilder(map).toString());
    }

    private static Uri.Builder getBuilder(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri.Builder) ipChange.ipc$dispatch("afe376d9", new Object[]{map});
        }
        Uri.Builder buildUpon = Uri.parse(NavUrls.NAV_URL_ALIPAY).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        return buildUpon;
    }

    public static Map<String, String> getQueryMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e7f08af0", new Object[]{str});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = getQueryParameterNames(str);
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return null;
        }
        for (String str2 : queryParameterNames) {
            String queryParameter = getQueryParameter(str, str2);
            if (str2 != null && queryParameter != null) {
                linkedHashMap.put(str2, queryParameter);
            }
        }
        return linkedHashMap;
    }

    private static Set<String> getQueryParameterNames(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("be3d4911", new Object[]{str});
        }
        if (str == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        do {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(str.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < str.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private static String getQueryParameter(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("173d6b0e", new Object[]{str, str2});
        }
        if (str == null) {
            return null;
        }
        String encode = Uri.encode(str2, null);
        int length = str.length();
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(38, i);
            int i2 = indexOf != -1 ? indexOf : length;
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 > i2 || indexOf2 == -1) {
                indexOf2 = i2;
            }
            if (indexOf2 - i == encode.length() && str.regionMatches(i, encode, 0, encode.length())) {
                return indexOf2 == i2 ? "" : str.substring(indexOf2 + 1, i2);
            } else if (indexOf == -1) {
                return null;
            } else {
                i = indexOf + 1;
            }
        }
    }
}
