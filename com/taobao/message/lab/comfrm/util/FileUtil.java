package com.taobao.message.lab.comfrm.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileUtil";

    static {
        kge.a(1630573017);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[Catch: IOException -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x005f, blocks: (B:23:0x005b, B:47:0x0090), top: B:78:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0060 -> B:77:0x0093). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readAssetsTextFile(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "FileUtil load text: "
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.message.lab.comfrm.util.FileUtil.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L1a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r6
            r6 = 1
            r0[r6] = r7
            java.lang.String r6 = "8e17ab77"
            java.lang.Object r6 = r1.ipc$dispatch(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L1a:
            r1 = 0
            if (r7 != 0) goto L1e
            return r1
        L1e:
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r6, r7)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
            int r2 = r6.available()     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
            int r2 = r2 + 10
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L6a java.lang.Throwable -> L6d
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L6a java.lang.Throwable -> L6d
            r4.<init>(r6)     // Catch: java.io.IOException -> L6a java.lang.Throwable -> L6d
            r2.<init>(r4)     // Catch: java.io.IOException -> L6a java.lang.Throwable -> L6d
            r4 = 2048(0x800, float:2.87E-42)
            char[] r4 = new char[r4]     // Catch: java.io.IOException -> L68 java.lang.Throwable -> L9b
        L43:
            int r5 = r2.read(r4)     // Catch: java.io.IOException -> L68 java.lang.Throwable -> L9b
            if (r5 <= 0) goto L4d
            r7.append(r4, r3, r5)     // Catch: java.io.IOException -> L68 java.lang.Throwable -> L9b
            goto L43
        L4d:
            if (r6 == 0) goto L5b
            r6.close()     // Catch: java.io.IOException -> L53
            goto L5b
        L53:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r0, r6)
        L5b:
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L93
        L5f:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r0, r6)
            goto L93
        L68:
            r3 = move-exception
            goto L79
        L6a:
            r3 = move-exception
            r2 = r1
            goto L79
        L6d:
            r7 = move-exception
            goto L9d
        L6f:
            r3 = move-exception
            r7 = r1
            goto L78
        L72:
            r7 = move-exception
            r6 = r1
            goto L9d
        L75:
            r3 = move-exception
            r6 = r1
            r7 = r6
        L78:
            r2 = r7
        L79:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9b
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L8e
            r6.close()     // Catch: java.io.IOException -> L86
            goto L8e
        L86:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r0, r6)
        L8e:
            if (r2 == 0) goto L93
            r2.close()     // Catch: java.io.IOException -> L5f
        L93:
            if (r7 != 0) goto L96
            return r1
        L96:
            java.lang.String r6 = r7.toString()
            return r6
        L9b:
            r7 = move-exception
            r1 = r2
        L9d:
            if (r6 == 0) goto Lab
            r6.close()     // Catch: java.io.IOException -> La3
            goto Lab
        La3:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r0, r6)
        Lab:
            if (r1 == 0) goto Lb9
            r1.close()     // Catch: java.io.IOException -> Lb1
            goto Lb9
        Lb1:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r0, r6)
        Lb9:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.util.FileUtil.readAssetsTextFile(android.content.Context, java.lang.String):java.lang.String");
    }
}
