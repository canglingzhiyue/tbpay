package com.taobao.themis.utils;

import android.net.Uri;
import android.support.v4.util.LruCache;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, Uri> f22889a;
    private static final LruCache<String, String> b;

    static {
        kge.a(-1297019160);
        f22889a = new LruCache<>(20);
        b = new LruCache<>(20);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : a(str, str2, false);
    }

    public static String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{str, str2, new Boolean(z)});
        }
        Map<String, String> a2 = a(str, z);
        if (a2 != null) {
            return a2.get(str2);
        }
        return null;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return a(str, false);
        }
        return null;
    }

    public static Map<String, String> a(String str, boolean z) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("573ccb97", new Object[]{str, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            return hashMap;
        }
        if (z) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        try {
            split = str.split("\\?");
        } catch (Exception e) {
            Log.e("URLUtils", "parse URL param error " + e.getMessage());
        }
        if (split.length < 2) {
            return hashMap;
        }
        String str2 = split[1];
        String[] split2 = str2.split("#");
        if (split2.length > 1) {
            str2 = split2[0];
        }
        for (String str3 : str2.split("&")) {
            String[] split3 = str3.split("=");
            if (split3.length == 2) {
                hashMap.put(split3[0], split3[1]);
            } else if (split3.length >= 2) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < split3.length; i++) {
                    sb.append(split3[i]);
                    if (i != split3.length - 1) {
                        sb.append("=");
                    }
                }
                hashMap.put(split3[0], sb.toString());
            }
        }
        return hashMap;
    }

    public static Uri b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("95fe68aa", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = f22889a.get(str);
        if (uri != null) {
            return uri;
        }
        try {
            uri = Uri.parse(str);
            f22889a.put(str, uri);
            return uri;
        } catch (Exception e) {
            Log.e("URLUtils", "parse url exception.", e);
            return uri;
        }
    }

    public static String c(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        Uri b2 = b(str);
        String str2 = null;
        if (b2 != null) {
            str2 = b2.getFragment();
        }
        if (str2 != null && (indexOf = str2.indexOf("?")) > 0) {
            str2 = str2.substring(0, indexOf);
        }
        return (str2 == null || !str2.startsWith("/")) ? str2 : str2.substring(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r6, java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.utils.o.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "65d7b881"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            android.net.Uri r0 = b(r6)
            android.net.Uri r1 = b(r7)
            java.lang.String r4 = r0.getHost()
            java.lang.String r5 = r1.getHost()
            boolean r4 = android.text.StringUtils.equals(r4, r5)
            if (r4 != 0) goto L33
            return r3
        L33:
            java.lang.String r4 = r0.getPath()
            java.lang.String r5 = r1.getPath()
            boolean r4 = android.text.StringUtils.equals(r4, r5)
            if (r4 != 0) goto L42
            return r3
        L42:
            java.lang.String r0 = r0.getFragment()
            java.lang.String r1 = r1.getFragment()
            boolean r0 = android.text.StringUtils.equals(r0, r1)
            if (r0 != 0) goto L51
            return r3
        L51:
            java.util.Map r6 = a(r6)
            java.util.Map r7 = a(r7)
            int r0 = r6.size()
            int r1 = r7.size()
            if (r0 == r1) goto L64
            goto L91
        L64:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L6c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r7.containsKey(r1)
            if (r4 != 0) goto L7f
            goto L91
        L7f:
            java.lang.Object r4 = r6.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r7.get(r1)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L6c
            goto L91
        L90:
            r3 = 1
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.utils.o.b(java.lang.String, java.lang.String):boolean");
    }
}
