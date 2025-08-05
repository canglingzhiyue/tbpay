package com.taobao.tao.shop.rule;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1014066346);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.shop.rule.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "9f352ae"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L15:
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.app.Application r3 = com.taobao.tao.shop.e.b     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r3, r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5f
            r6.<init>()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5f
            r3 = 2096(0x830, float:2.937E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5f
        L32:
            int r4 = r1.read(r3)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5f
            r5 = -1
            if (r4 == r5) goto L3d
            r6.write(r3, r2, r4)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5f
            goto L32
        L3d:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5f
            r1.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r0 = move-exception
            r0.printStackTrace()
        L49:
            return r6
        L4a:
            r6 = move-exception
            goto L51
        L4c:
            r6 = move-exception
            r1 = r0
            goto L60
        L4f:
            r6 = move-exception
            r1 = r0
        L51:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r6 = move-exception
            r6.printStackTrace()
        L5e:
            return r0
        L5f:
            r6 = move-exception
        L60:
            if (r1 == 0) goto L6a
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.shop.rule.d.a(java.lang.String):java.lang.String");
    }
}
