package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-585073187);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0076 -> B:60:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rml.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.lang.String r4 = "cfe597b6"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L18:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.io.InputStream r4 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r4, r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5f
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
        L34:
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            if (r1 == 0) goto L3e
            r0.append(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            goto L34
        L3e:
            if (r4 == 0) goto L48
            r4.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r4 = move-exception
            r4.printStackTrace()
        L48:
            r5.close()     // Catch: java.io.IOException -> L75
            goto L79
        L4c:
            r0 = move-exception
            r1 = r5
            goto L82
        L4f:
            r1 = move-exception
            r3 = r1
            r1 = r4
            r4 = r5
            r5 = r3
            goto L62
        L55:
            r0 = move-exception
            goto L82
        L57:
            r5 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
            goto L62
        L5c:
            r0 = move-exception
            r4 = r1
            goto L82
        L5f:
            r4 = move-exception
            r5 = r4
            r4 = r1
        L62:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L6f
            r1.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r5 = move-exception
            r5.printStackTrace()
        L6f:
            if (r4 == 0) goto L79
            r4.close()     // Catch: java.io.IOException -> L75
            goto L79
        L75:
            r4 = move-exception
            r4.printStackTrace()
        L79:
            java.lang.String r4 = r0.toString()
            return r4
        L7e:
            r0 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L82:
            if (r4 == 0) goto L8c
            r4.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r4 = move-exception
            r4.printStackTrace()
        L8c:
            if (r1 == 0) goto L96
            r1.close()     // Catch: java.io.IOException -> L92
            goto L96
        L92:
            r4 = move-exception
            r4.printStackTrace()
        L96:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rml.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
