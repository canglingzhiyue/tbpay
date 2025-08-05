package com.taobao.search.mmd.util;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(37696814);
    }

    public static Map<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{intent});
        }
        HashMap hashMap = new HashMap();
        String stringExtra = intent.getStringExtra("url");
        if (!TextUtils.isEmpty(stringExtra)) {
            hashMap.putAll(c.a(Uri.parse(stringExtra)));
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("Type", "url");
            arrayMap.put(MonitorItemConstants.KEY_URL, stringExtra);
            e.a("InShopParamDetector", (ArrayMap<String, String>) arrayMap);
        }
        try {
            a(intent.getData(), hashMap);
        } catch (Exception unused) {
            TLog.logd("InShopParamsParser", "解析店内url锚点参数异常");
        }
        c.a(intent, hashMap);
        if (TextUtils.equals((CharSequence) hashMap.remove("isSoldCount"), "true")) {
            hashMap.put("sort", "_sale");
        }
        if (TextUtils.equals((CharSequence) hashMap.remove("isNew"), "true")) {
            hashMap.put("sort", "first_new");
        }
        hashMap.remove(com.taobao.browser.utils.i.URL_REFERER_ORIGIN);
        hashMap.remove("referrer");
        return hashMap;
    }

    public static Map<String, String> a(Uri uri, Map<String, String> map) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8457fb7b", new Object[]{uri, map});
        }
        if (uri == null) {
            return map;
        }
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("Type", "FRAGMENT_URL");
            arrayMap.put(MonitorItemConstants.KEY_URL, uri.toString());
            e.a("InShopParamDetector", (ArrayMap<String, String>) arrayMap);
        }
        String encodedQuery = uri.getEncodedQuery();
        String[] strArr = null;
        String[] split = (encodedFragment == null || !encodedFragment.contains("?")) ? null : encodedFragment.split("\\?");
        if (split != null && split.length > 0) {
            encodedFragment = split[0];
            encodedQuery = !TextUtils.isEmpty(encodedQuery) ? encodedQuery + "&" + split[1] : split[1];
        }
        if (encodedFragment != null && encodedFragment.contains("&") && (indexOf = encodedFragment.indexOf("&")) > 0) {
            encodedQuery = !TextUtils.isEmpty(encodedQuery) ? encodedQuery + "&" + encodedFragment.substring(indexOf + 1) : encodedFragment.substring(indexOf + 1);
            encodedFragment.substring(0, indexOf);
        }
        if (!TextUtils.isEmpty(encodedQuery)) {
            strArr = encodedQuery.split("&");
        }
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                String[] split2 = str.split("=");
                if (split2.length == 2) {
                    map.put(split2[0], split2[1]);
                }
            }
        }
        return map;
    }
}
