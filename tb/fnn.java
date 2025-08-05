package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;

/* loaded from: classes.dex */
public class fnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile fnn f28080a;
    private JSONObject b;
    private boolean c = false;

    static {
        kge.a(-82795662);
        f28080a = null;
    }

    private fnn() {
    }

    public static fnn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("f04ad38", new Object[0]);
        }
        if (f28080a == null) {
            synchronized (fnn.class) {
                if (f28080a == null) {
                    f28080a = new fnn();
                }
            }
        }
        return f28080a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null && this.c) {
            return jSONObject;
        }
        this.b = JSONObject.parseObject(a(e.b()));
        this.c = true;
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r5 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(android.content.Context r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fnn.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "bbc5dc40"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 != 0) goto L21
            return r1
        L21:
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L5c
            java.lang.String r2 = "dinamic/dx_appstyle.json"
            java.io.InputStream r5 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r5, r2)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L5c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L5d
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L5d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L5d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L5d
        L35:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            if (r1 == 0) goto L3f
            r0.append(r1)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            goto L35
        L3f:
            r2.close()     // Catch: java.io.IOException -> L65
            if (r5 == 0) goto L65
        L44:
            r5.close()     // Catch: java.io.IOException -> L65
            goto L65
        L48:
            r0 = move-exception
            r1 = r2
            goto L51
        L4b:
            r1 = r2
            goto L5d
        L4d:
            r0 = move-exception
            goto L51
        L4f:
            r0 = move-exception
            r5 = r1
        L51:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.io.IOException -> L5b
        L56:
            if (r5 == 0) goto L5b
            r5.close()     // Catch: java.io.IOException -> L5b
        L5b:
            throw r0
        L5c:
            r5 = r1
        L5d:
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.io.IOException -> L65
        L62:
            if (r5 == 0) goto L65
            goto L44
        L65:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fnn.a(android.content.Context):java.lang.String");
    }
}
