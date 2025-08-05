package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lyg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Map<String, Map<String, String>> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a75136df", new Object[]{this, context, str}) : b(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> b(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.lyg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            java.lang.String r6 = "3b8fa67e"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.util.Map r6 = (java.util.Map) r6
            return r6
        L1b:
            boolean r0 = tb.lye.a(r7)
            r1 = 0
            if (r0 != 0) goto L23
            return r1
        L23:
            java.lang.String[] r0 = new java.lang.String[r2]
            if (r6 == 0) goto L42
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r2 == 0) goto L42
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.io.InputStream r2 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r2, r7)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String[] r0 = tb.lye.a(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            goto L42
        L3a:
            r6 = move-exception
            goto L41
        L3c:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            goto L45
        L41:
            throw r6
        L42:
            if (r0 != 0) goto L45
            return r1
        L45:
            if (r6 == 0) goto L5f
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L5e
            if (r2 == 0) goto L5f
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L5e
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r6, r7)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L5e
            java.util.List r6 = tb.lye.b(r6)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L5e
            goto L60
        L5a:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L5e
        L5e:
            return r1
        L5f:
            r6 = r1
        L60:
            if (r6 != 0) goto L63
            return r1
        L63:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r6.next()
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r0.length
            int r4 = r2.length
            if (r3 == r4) goto L7d
            return r1
        L7d:
            java.lang.String r3 = "_key"
            r5.a(r7, r0, r2, r3)
            java.lang.String r3 = "_AndroidKey"
            r5.a(r7, r0, r2, r3)
            goto L6c
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lyg.b(android.content.Context, java.lang.String):java.util.Map");
    }

    private void a(Map<String, Map<String, String>> map, String[] strArr, String[] strArr2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640ee87", new Object[]{this, map, strArr, strArr2, str});
            return;
        }
        String str2 = null;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < strArr.length; i++) {
            if (!str.equals(strArr[i])) {
                hashMap.put(strArr[i], strArr2[i]);
            } else if (str2 == null) {
                str2 = strArr2[i];
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (str2.startsWith(riy.ARRAY_START_STR) && str2.endsWith(riy.ARRAY_END_STR)) {
            str2 = str2.substring(1, str2.length() - 1);
        }
        map.put(str2, hashMap);
    }
}
