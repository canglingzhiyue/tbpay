package com.taobao.android.detail.ttdetail.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.ado;
import tb.kge;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TT_DETAIL_TMP_HOST = "internal.tt.detail.taobao.com";

    static {
        kge.a(-656018080);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue() : com.taobao.android.t.a().a(context).a(str);
    }

    public static boolean a(Context context, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39c5942", new Object[]{context, bundle, str})).booleanValue() : com.taobao.android.t.a().a(context).a(bundle).a(str);
    }

    public static boolean a(Context context, Bundle bundle, int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbcc11d", new Object[]{context, bundle, new Integer(i), str})).booleanValue() : com.taobao.android.t.a().a(context).a(bundle).b(i).a(str);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX) || str.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX)) {
            return str;
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            return com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
        }
        return com.taobao.search.common.util.k.HTTPS_PREFIX + str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri a2 = a(Uri.parse(str));
            return a2.getAuthority() + a2.getPath();
        } catch (Throwable th) {
            i.a("UrlUtil", "extractUrlHostPath error with url: " + str, th);
            return null;
        }
    }

    public static Uri a(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{uri});
        }
        String scheme = uri.getScheme();
        String uri2 = uri.toString();
        if (scheme == null) {
            if (uri2.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + uri2;
            } else {
                str = com.taobao.search.common.util.k.HTTP_PREFIX + uri2;
            }
            return Uri.parse(str);
        } else if (!scheme.startsWith(ado.URL_SEPARATOR)) {
            return uri;
        } else {
            return Uri.parse("http:" + uri2);
        }
    }

    public static Uri b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("c9854db5", new Object[]{uri}) : uri.buildUpon().authority(TT_DETAIL_TMP_HOST).build();
    }

    public static void a(Intent intent) {
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
        } else if (intent == null || (component = intent.getComponent()) == null || TextUtils.equals("com.taobao.android.detail.alittdetail.TTDetailActivity", component.getClassName())) {
        } else {
            intent.setComponent(new ComponentName(component.getPackageName(), "com.taobao.android.detail.alittdetail.TTDetailActivity"));
        }
    }

    public static boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        ComponentName component = intent.getComponent();
        Uri data = intent.getData();
        if (component != null && data != null) {
            return TextUtils.equals("com.taobao.android.detail.alittdetail.TTDetailActivity", component.getClassName()) && TextUtils.equals(TT_DETAIL_TMP_HOST, data.getAuthority());
        } else if (component != null) {
            return TextUtils.equals("com.taobao.android.detail.alittdetail.TTDetailActivity", component.getClassName());
        } else {
            if (data == null) {
                return false;
            }
            return TextUtils.equals(TT_DETAIL_TMP_HOST, data.getAuthority());
        }
    }

    public static Uri a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("e52e6d20", new Object[]{uri, str}) : uri.buildUpon().authority(str).build();
    }

    public static boolean a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fa4e5f2", new Object[]{runtimeAbilityParamArr})).booleanValue();
        }
        if (runtimeAbilityParamArr == null) {
            return false;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("appendURLParamsOnly".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
            }
        }
        return false;
    }

    public static String a(String str, Map<String, ? extends Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a002a9f", new Object[]{str, map, new Boolean(z)});
        }
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            try {
                HashMap hashMap = new HashMap();
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str2 : queryParameterNames) {
                        hashMap.put(str2, parse.getQueryParameter(str2));
                    }
                }
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.clearQuery();
                HashMap hashMap2 = new HashMap();
                if (z) {
                    hashMap2.putAll(hashMap);
                    hashMap2.putAll(map);
                } else {
                    hashMap2.putAll(map);
                    hashMap2.putAll(hashMap);
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object value = entry.getValue();
                    buildUpon.appendQueryParameter((String) entry.getKey(), value != null ? String.valueOf(value) : "");
                }
                return buildUpon.toString();
            } catch (Exception e) {
                i.a("UrlUtil", "appendUrlParams error: ", e);
            }
        }
        return str;
    }

    public static String a(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map}) : a(str, map, true);
    }

    public static Map<String, String> c(Uri uri) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d0a7d692", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }
}
