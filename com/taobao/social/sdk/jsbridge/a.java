package com.taobao.social.sdk.jsbridge;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vividsocial.utils.j;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, WVCallBackContext> f19700a;

    static {
        kge.a(1811259602);
        f19700a = new HashMap();
    }

    public static synchronized void registerListener(String str, WVCallBackContext wVCallBackContext) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4d90f05", new Object[]{str, wVCallBackContext});
            } else {
                f19700a.put(str, wVCallBackContext);
            }
        }
    }

    public static Pair<String, Uri> sureSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("858cb857", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return new Pair<>(String.valueOf(System.currentTimeMillis()), null);
        }
        return sureSessionId(Uri.parse(str));
    }

    public static Pair<String, Uri> sureSessionId(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("cf24c4ae", new Object[]{uri});
        }
        if (uri == null) {
            return new Pair<>(String.valueOf(System.currentTimeMillis()), null);
        }
        String str = j.a(uri).get("sessionId");
        if (StringUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            uri = uri.buildUpon().appendQueryParameter("sessionId", str).build();
        }
        return new Pair<>(str, uri);
    }

    public static synchronized void commentCallback(String str, boolean z, boolean z2, boolean z3, JSONObject jSONObject) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bb199f1", new Object[]{str, new Boolean(z), new Boolean(z2), new Boolean(z3), jSONObject});
            } else if (StringUtils.isEmpty(str)) {
            } else {
                WVCallBackContext wVCallBackContext = f19700a.get(str);
                if (wVCallBackContext == null) {
                    return;
                }
                a(str, z, z2, z3, jSONObject, wVCallBackContext);
                if (!z || (z && !z2)) {
                    f19700a.remove(str);
                }
            }
        }
    }

    public static synchronized boolean callback(String str, boolean z, boolean z2, JSONObject jSONObject) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1695bf9e", new Object[]{str, new Boolean(z), new Boolean(z2), jSONObject})).booleanValue();
            } else if (StringUtils.isEmpty(str)) {
                return false;
            } else {
                WVCallBackContext wVCallBackContext = f19700a.get(str);
                if (wVCallBackContext == null) {
                    return false;
                }
                r rVar = new r();
                rVar.a(z ? "HY_SUCCESS" : "HY_FAILED");
                try {
                    rVar.a("sessionId", str);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            rVar.a(entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Exception unused) {
                }
                if (!z) {
                    wVCallBackContext.error(rVar);
                } else if (z2) {
                    wVCallBackContext.successAndKeepAlive(rVar.d());
                } else {
                    wVCallBackContext.success(rVar);
                }
                if (!z || (z && !z2)) {
                    f19700a.remove(str);
                }
                return true;
            }
        }
    }

    public static synchronized void release(String str) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8699358", new Object[]{str});
            } else {
                f19700a.remove(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r18, boolean r19, boolean r20, boolean r21, com.alibaba.fastjson.JSONObject r22, android.taobao.windvane.jsbridge.WVCallBackContext r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.social.sdk.jsbridge.a.a(java.lang.String, boolean, boolean, boolean, com.alibaba.fastjson.JSONObject, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }
}
