package com.taobao.android.layoutmanager.container;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.container.j;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.HashMap;
import tb.gvv;
import tb.gvw;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;

/* loaded from: classes5.dex */
public class PageRenderIntercept extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1545560592);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.j
    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : str2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.j
    public i a(Context context, m.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("d5f9e4d8", new Object[]{this, context, bVar});
        }
        if (bVar != null) {
            z = gvw.d(bVar.d);
        }
        if (z) {
            return new gvw(bVar);
        }
        return new gvv(bVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.j
    public String a(String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (str2 != null && oeb.bC() && (parse = Uri.parse(str2)) != null && gvw.a(parse)) {
            if (str.indexOf("?") > 0) {
                str = str + "&policy=localFirst";
            } else {
                str = str + "?policy=localFirst";
            }
            ogg.a("PageRenderIntercept", "change dsl policy to localFirst");
        }
        return str;
    }

    public static void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{uri});
        } else if (!gvw.d(uri)) {
        } else {
            gvw.c(uri);
        }
    }

    private static Uri d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("8c2a86f3", new Object[]{uri});
        }
        if (uri == null || !StringUtils.equals(uri.getScheme(), "tbopen")) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter("h5Url");
        return !StringUtils.isEmpty(queryParameter) ? Uri.parse(queryParameter) : uri;
    }

    public static Uri a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a0da1b5c", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        return d(intent.getData());
    }

    public static Uri b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("c9854db5", new Object[]{uri}) : gvw.e(uri);
    }

    public static Uri c(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("2ad7ea54", new Object[]{uri}) : gvw.f(uri);
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue() : gvw.a(str, str2);
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        ogg.c("PageRenderIntercept", "init");
        if (application == null) {
            try {
                application = Globals.getApplication();
            } catch (Throwable th) {
                Log.e("PageRenderIntercept", "init application ", th);
            }
        }
        try {
            if (oec.a(hashMap.get("interceptLinkBack"), false)) {
                if (!i.a(application, i.FEATURE_LINK_BACK, true)) {
                    return;
                }
                com.taobao.android.linkback.f.a(new com.taobao.android.linkback.e() { // from class: com.taobao.android.layoutmanager.container.PageRenderIntercept.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.linkback.e
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        ogg.c("PageRenderIntercept", "onUpdate:" + str);
                        if (StringUtils.isEmpty(str)) {
                            return;
                        }
                        gvw.a(application, Uri.parse(str));
                    }
                });
                return;
            }
            ab.a((Context) application);
            String a2 = oec.a(hashMap.get("startIntent"), (String) null);
            Log.e("PageRenderIntercept", "startIntent :" + a2);
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            Uri d = d(Uri.parse(a2));
            if (oeb.a("fixSlimUrlItemId", true)) {
                d = gvw.f(d);
            }
            ogg.a("PageRenderIntercept", "preloadVideoMtop " + d);
            a(d);
        } catch (Throwable th2) {
            Log.e("PageRenderIntercept", "init error ", th2);
        }
    }
}
