package com.taobao.pha.tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.webview.PHAWVUCWebView;
import java.util.List;
import tb.kge;
import tb.nfc;

/* loaded from: classes7.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final n f18836a;
    private PHAWVUCWebView b = null;
    private a c = null;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f18837a;
        public List<String> c;

        static {
            kge.a(1072848808);
        }
    }

    static {
        kge.a(1812239428);
        f18836a = new n();
    }

    public static n a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("c6da7d33", new Object[0]) : f18836a;
    }

    public PHAWVUCWebView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PHAWVUCWebView) ipChange.ipc$dispatch("cd3d8f29", new Object[]{this, context, str});
        }
        PHAWVUCWebView b = b(context, str);
        if (b != null) {
            b.setOuterContext(context);
            b.setRealUrl(str);
            com.taobao.pha.core.controller.i.b(nfc.PHA_MONITOR_MODULE_POINT_PRERENDER_CONSUME, new JSONObject());
        }
        this.b = null;
        this.c = null;
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (android.text.StringUtils.equals(r10, r8.c.f18837a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.pha.webview.PHAWVUCWebView b(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.pha.tb.n.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            java.lang.String r9 = "12ded1c8"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            com.taobao.pha.webview.PHAWVUCWebView r9 = (com.taobao.pha.webview.PHAWVUCWebView) r9
            return r9
        L1b:
            r0 = 0
            if (r9 == 0) goto Lf8
            boolean r9 = android.text.StringUtils.isEmpty(r10)
            if (r9 == 0) goto L26
            goto Lf8
        L26:
            boolean r9 = tb.ngu.u()
            if (r9 != 0) goto L2d
            return r0
        L2d:
            com.taobao.pha.tb.n$a r9 = r8.c
            if (r9 != 0) goto L32
            return r0
        L32:
            com.taobao.pha.webview.PHAWVUCWebView r1 = r8.b
            java.lang.String r9 = r9.f18837a
            boolean r9 = android.text.StringUtils.isEmpty(r9)
            if (r9 != 0) goto Lf8
            if (r1 != 0) goto L40
            goto Lf8
        L40:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            java.lang.Thread r4 = r4.getThread()
            if (r9 == r4) goto L4f
            return r0
        L4f:
            boolean r9 = r1.isPreRenderSuccess()
            if (r9 != 0) goto L56
            return r0
        L56:
            com.taobao.pha.tb.n$a r9 = r8.c
            java.util.List<java.lang.String> r9 = r9.c
            if (r9 != 0) goto L68
            com.taobao.pha.tb.n$a r9 = r8.c
            java.lang.String r9 = r9.f18837a
            boolean r9 = android.text.StringUtils.equals(r10, r9)
            if (r9 == 0) goto Lf3
            goto Lf4
        L68:
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> Lf3
            com.taobao.pha.tb.n$a r4 = r8.c     // Catch: java.lang.Exception -> Lf3
            java.lang.String r4 = r4.f18837a     // Catch: java.lang.Exception -> Lf3
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> Lf3
            if (r10 == 0) goto Lf3
            if (r4 == 0) goto Lf3
            java.lang.String r5 = r10.getScheme()     // Catch: java.lang.Exception -> Lf3
            java.lang.String r6 = r4.getScheme()     // Catch: java.lang.Exception -> Lf3
            boolean r5 = android.text.StringUtils.equals(r5, r6)     // Catch: java.lang.Exception -> Lf3
            if (r5 == 0) goto Lf3
            java.lang.String r5 = r10.getHost()     // Catch: java.lang.Exception -> Lf3
            java.lang.String r6 = r4.getHost()     // Catch: java.lang.Exception -> Lf3
            boolean r5 = android.text.StringUtils.equals(r5, r6)     // Catch: java.lang.Exception -> Lf3
            if (r5 == 0) goto Lf3
            java.lang.String r5 = r10.getPath()     // Catch: java.lang.Exception -> Lf3
            java.lang.String r6 = r4.getPath()     // Catch: java.lang.Exception -> Lf3
            boolean r5 = android.text.StringUtils.equals(r5, r6)     // Catch: java.lang.Exception -> Lf3
            if (r5 == 0) goto Lf3
            java.util.Set r5 = r10.getQueryParameterNames()     // Catch: java.lang.Exception -> Lf3
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> Lf3
        Laa:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> Lf3
            if (r6 == 0) goto Lcb
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> Lf3
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf3
            boolean r7 = r9.contains(r6)     // Catch: java.lang.Exception -> Lf3
            if (r7 != 0) goto Laa
            java.lang.String r7 = r10.getQueryParameter(r6)     // Catch: java.lang.Exception -> Lf3
            java.lang.String r6 = r4.getQueryParameter(r6)     // Catch: java.lang.Exception -> Lf3
            boolean r6 = android.text.StringUtils.equals(r7, r6)     // Catch: java.lang.Exception -> Lf3
            if (r6 != 0) goto Laa
            r2 = 0
        Lcb:
            java.util.Set r5 = r4.getQueryParameterNames()     // Catch: java.lang.Exception -> Lf3
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> Lf3
        Ld3:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> Lf3
            if (r6 == 0) goto Lf4
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> Lf3
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf3
            boolean r7 = r9.contains(r6)     // Catch: java.lang.Exception -> Lf3
            if (r7 != 0) goto Ld3
            java.lang.String r7 = r10.getQueryParameter(r6)     // Catch: java.lang.Exception -> Lf3
            java.lang.String r6 = r4.getQueryParameter(r6)     // Catch: java.lang.Exception -> Lf3
            boolean r6 = android.text.StringUtils.equals(r7, r6)     // Catch: java.lang.Exception -> Lf3
            if (r6 != 0) goto Ld3
        Lf3:
            r2 = 0
        Lf4:
            if (r2 != 0) goto Lf7
            return r0
        Lf7:
            return r1
        Lf8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.tb.n.b(android.content.Context, java.lang.String):com.taobao.pha.webview.PHAWVUCWebView");
    }
}
