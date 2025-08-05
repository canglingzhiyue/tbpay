package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.obw;
import tb.oec;
import tb.ogv;
import tb.spz;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-110977424);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("tabid");
            String queryParameter2 = parse.getQueryParameter("tabItemId");
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -972678799) {
                if (hashCode != 112202875) {
                    if (hashCode == 1020444111 && str2.equals(obw.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
                        c = 2;
                    }
                } else if (str2.equals("video")) {
                    c = 0;
                }
            } else if (str2.equals("newFollow")) {
                c = 1;
            }
            if (c == 0 || c == 1) {
                return TextUtils.equals(queryParameter, str2);
            }
            if (c == 2) {
                return a(parse, queryParameter, queryParameter2, str2);
            }
        }
        return false;
    }

    private static boolean a(Uri uri, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acd7ca81", new Object[]{uri, str, str2, str3})).booleanValue();
        }
        if (uri == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.equals(str, "more")) {
            JSONObject a2 = a(uri);
            if (!ogv.a(a2) && TextUtils.equals(oec.a(a2.get("tabItemId"), (String) null), obw.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
                z = true;
            }
            if (TextUtils.equals(str2, obw.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
                z = true;
            }
        }
        if (!TextUtils.equals(str, obw.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
            return z;
        }
        return true;
    }

    private static JSONObject a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5579f4ff", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("extParams");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        try {
            return JSON.parseObject(queryParameter);
        } catch (Exception e) {
            spz.c("TBVideoListUtils", "PickPreloadControllerNew,parseExtParams" + e.getMessage());
            return null;
        }
    }
}
