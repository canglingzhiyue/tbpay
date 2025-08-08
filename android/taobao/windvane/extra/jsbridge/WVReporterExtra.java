package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVReporter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVReporterExtra extends WVReporter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1099771146);
    }

    public static /* synthetic */ Object ipc$super(WVReporterExtra wVReporterExtra, String str, Object... objArr) {
        if (str.hashCode() == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.api.WVReporter, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("reportPerformanceCheckResult".equals(str)) {
            reportPerformanceCheckResult(wVCallBackContext, str2);
        } else if (!"reportPrerenderStatus".equals(str)) {
            return false;
        } else {
            reportPrerenderStatus(wVCallBackContext, str2);
        }
        return super.execute(str, str2, wVCallBackContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:6:0x0020, B:14:0x0060, B:16:0x0066, B:18:0x006c, B:22:0x007e, B:24:0x0084, B:25:0x008d, B:27:0x0093, B:28:0x00aa), top: B:34:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:6:0x0020, B:14:0x0060, B:16:0x0066, B:18:0x006c, B:22:0x007e, B:24:0x0084, B:25:0x008d, B:27:0x0093, B:28:0x00aa), top: B:34:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void reportPerformanceCheckResult(android.taobao.windvane.jsbridge.WVCallBackContext r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = r21
            java.lang.String r3 = ""
            com.android.alibaba.ip.runtime.IpChange r4 = android.taobao.windvane.extra.jsbridge.WVReporterExtra.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 3
            if (r5 == 0) goto L20
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r8] = r1
            r3[r7] = r2
            r3[r6] = r0
            java.lang.String r0 = "4e524717"
            r4.ipc$dispatch(r0, r3)
            return
        L20:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lae
            r4.<init>(r0)     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "score"
            r10 = 0
            long r10 = r4.optLong(r0, r10)     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "version"
            java.lang.String r16 = r4.optString(r0, r3)     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "result"
            java.lang.String r18 = r4.optString(r0, r3)     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = "detail"
            java.lang.String r0 = r4.optString(r0, r3)     // Catch: java.lang.Exception -> Lae
            android.taobao.windvane.webview.IWVWebView r3 = r1.mWebView     // Catch: java.lang.Exception -> Lae
            java.lang.String r3 = r3.getUrl()     // Catch: java.lang.Exception -> Lae
            r4 = 0
            android.taobao.windvane.webview.IWVWebView r5 = r1.mWebView     // Catch: java.lang.Throwable -> L60
            boolean r5 = r5 instanceof android.taobao.windvane.webview.WVWebView     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L54
            android.taobao.windvane.webview.IWVWebView r5 = r1.mWebView     // Catch: java.lang.Throwable -> L60
            android.taobao.windvane.webview.WVWebView r5 = (android.taobao.windvane.webview.WVWebView) r5     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r5.bizCode     // Catch: java.lang.Throwable -> L60
            goto L60
        L54:
            android.taobao.windvane.webview.IWVWebView r5 = r1.mWebView     // Catch: java.lang.Throwable -> L60
            boolean r5 = r5 instanceof android.taobao.windvane.extra.uc.WVUCWebView     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L60
            android.taobao.windvane.webview.IWVWebView r5 = r1.mWebView     // Catch: java.lang.Throwable -> L60
            android.taobao.windvane.extra.uc.WVUCWebView r5 = (android.taobao.windvane.extra.uc.WVUCWebView) r5     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r5.bizCode     // Catch: java.lang.Throwable -> L60
        L60:
            android.net.Uri r5 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> Lae
            if (r5 == 0) goto L7c
            boolean r12 = r5.isHierarchical()     // Catch: java.lang.Exception -> Lae
            if (r12 == 0) goto L7c
            java.lang.String r12 = "wvBizCode"
            java.lang.String r5 = r5.getQueryParameter(r12)     // Catch: java.lang.Exception -> Lae
            boolean r12 = android.text.StringUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lae
            if (r12 != 0) goto L7c
            r17 = r5
            goto L7e
        L7c:
            r17 = r4
        L7e:
            android.taobao.windvane.monitor.q r4 = android.taobao.windvane.monitor.o.getPerformanceMonitor()     // Catch: java.lang.Exception -> Lae
            if (r4 == 0) goto L8d
            android.taobao.windvane.monitor.q r12 = android.taobao.windvane.monitor.o.getPerformanceMonitor()     // Catch: java.lang.Exception -> Lae
            r13 = r3
            r14 = r10
            r12.didPerformanceCheckResult(r13, r14, r16, r17, r18)     // Catch: java.lang.Exception -> Lae
        L8d:
            boolean r4 = android.taobao.windvane.util.m.a()     // Catch: java.lang.Exception -> Lae
            if (r4 == 0) goto Laa
            java.lang.String r4 = "WindVaneWebPerfCheck"
            java.lang.String r5 = "WindVaneWebPerfCheck: %s|%d|%s"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> Lae
            r9[r8] = r3     // Catch: java.lang.Exception -> Lae
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Exception -> Lae
            r9[r7] = r3     // Catch: java.lang.Exception -> Lae
            r9[r6] = r0     // Catch: java.lang.Exception -> Lae
            java.lang.String r0 = java.lang.String.format(r5, r9)     // Catch: java.lang.Exception -> Lae
            android.util.Log.e(r4, r0)     // Catch: java.lang.Exception -> Lae
        Laa:
            r20.success()     // Catch: java.lang.Exception -> Lae
            return
        Lae:
            r0 = move-exception
            android.taobao.windvane.jsbridge.r r3 = new android.taobao.windvane.jsbridge.r
            r3.<init>()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "msg"
            r3.a(r4, r0)
            r2.error(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.jsbridge.WVReporterExtra.reportPerformanceCheckResult(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }

    public void reportPrerenderStatus(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7969e5c5", new Object[]{this, wVCallBackContext, str});
        } else {
            wVCallBackContext.error();
        }
    }
}
