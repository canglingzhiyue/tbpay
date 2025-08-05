package com.taobao.android.layoutmanager.container;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.h;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.n;
import java.util.Map;
import tb.kge;
import tb.oeb;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG_DSL_KEY = "https://g.alicdn.com/tnode/guangguang/";

    static {
        kge.a(1532209161);
    }

    public static Uri a(Uri uri, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2f59e7b3", new Object[]{uri, str, map});
        }
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return uri;
        }
        if (uri == null || !"true".equals(uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_PREFETCH_ALREADY))) {
            z = false;
        }
        return (z || !b(a2, map) || uri == null) ? uri : uri.buildUpon().appendQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_PREFETCH_ALREADY, "true").build();
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            b(str, map);
        }
    }

    private static boolean b(String str, Map<String, String> map) {
        n f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("819a01b6", new Object[]{str, map})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            if ((GUANGGUANG_DSL_KEY.equals(str) ? oeb.aS() : oeb.aT()) && (f = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().f()) != null) {
                return f.a(str, new h.a(map));
            }
        }
        return false;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str != null) {
            try {
                return str.substring(0, str.substring(0, str.lastIndexOf("/")).lastIndexOf("/") + 1);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
