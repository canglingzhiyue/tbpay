package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUIToast extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIToast";

    static {
        kge.a(164780550);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"toast".equals(str)) {
            return false;
        }
        toast(wVCallBackContext, str2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void toast(android.taobao.windvane.jsbridge.WVCallBackContext r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.jsbridge.api.WVUIToast.$ipChange     // Catch: java.lang.Throwable -> L89
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L89
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1a
            java.lang.String r1 = "5c5bc075"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L89
            r2[r4] = r7     // Catch: java.lang.Throwable -> L89
            r2[r3] = r8     // Catch: java.lang.Throwable -> L89
            r8 = 2
            r2[r8] = r9     // Catch: java.lang.Throwable -> L89
            r0.ipc$dispatch(r1, r2)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r7)
            return
        L1a:
            android.content.Context r0 = r7.mContext     // Catch: java.lang.Throwable -> L89
            boolean r0 = tb.ado.a(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L3f
            android.taobao.windvane.jsbridge.r r9 = new android.taobao.windvane.jsbridge.r     // Catch: java.lang.Throwable -> L89
            r9.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "HY_NO_PERMISSION"
            r9.a(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "msg"
            java.lang.String r1 = "no permission"
            r9.a(r0, r1)     // Catch: java.lang.Throwable -> L89
            r8.error(r9)     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = "WVUIToast"
            java.lang.String r9 = "no permission"
            android.taobao.windvane.util.m.e(r8, r9)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r7)
            return
        L3f:
            java.lang.String r0 = ""
            boolean r1 = android.text.StringUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L89
            r5 = 17
            if (r1 != 0) goto L6e
            java.lang.String r1 = "utf-8"
            java.lang.String r9 = java.net.URLDecoder.decode(r9, r1)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L89
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L89
            r1.<init>(r9)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L89
            java.lang.String r6 = "message"
            java.lang.String r0 = r1.optString(r6)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L89
            java.lang.String r6 = "duration"
            int r9 = r1.optInt(r6)     // Catch: java.lang.Exception -> L62 java.lang.Throwable -> L89
            goto L6f
        L62:
            android.content.Context r1 = r7.mContext     // Catch: java.lang.Throwable -> L89
            android.widget.Toast r9 = android.widget.Toast.makeText(r1, r9, r3)     // Catch: java.lang.Throwable -> L89
            r9.setGravity(r5, r4, r4)     // Catch: java.lang.Throwable -> L89
            r9.show()     // Catch: java.lang.Throwable -> L89
        L6e:
            r9 = 0
        L6f:
            boolean r1 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L84
            if (r9 <= r2) goto L78
            r9 = 1
        L78:
            android.content.Context r1 = r7.mContext     // Catch: java.lang.Throwable -> L89
            android.widget.Toast r9 = android.widget.Toast.makeText(r1, r0, r9)     // Catch: java.lang.Throwable -> L89
            r9.setGravity(r5, r4, r4)     // Catch: java.lang.Throwable -> L89
            r9.show()     // Catch: java.lang.Throwable -> L89
        L84:
            r8.success()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r7)
            return
        L89:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVUIToast.toast(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }
}
