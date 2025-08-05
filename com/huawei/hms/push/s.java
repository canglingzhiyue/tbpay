package com.huawei.hms.push;

import android.content.Context;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes4.dex */
public class s {
    private static final String[] c = {"url", "app", "cosa", CountValue.T_RP};

    /* renamed from: a  reason: collision with root package name */
    private Context f7533a;
    private m b;

    public s(Context context, m mVar) {
        this.f7533a = context;
        this.b = mVar;
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.b.d());
            if (!d.c(this.f7533a, this.b.d())) {
                return;
            }
            b();
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }

    public static boolean a(String str) {
        for (String str2 : c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008b, code lost:
        if (r3 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cb, code lost:
        if (com.huawei.hms.push.d.a(r6.f7533a, r6.b.d(), r2).booleanValue() != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:3:0x0007, B:20:0x00d0, B:22:0x00d6, B:24:0x00e1, B:26:0x00ec, B:25:0x00e7, B:14:0x00a8, B:16:0x00b0, B:13:0x008f, B:6:0x0044, B:8:0x0058, B:9:0x0063), top: B:33:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:3:0x0007, B:20:0x00d0, B:22:0x00d6, B:24:0x00e1, B:26:0x00ec, B:25:0x00e7, B:14:0x00a8, B:16:0x00b0, B:13:0x008f, B:6:0x0044, B:8:0x0058, B:9:0x0063), top: B:33:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.push.s.b():void");
    }

    public void c() {
        m mVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.f7533a == null || (mVar = this.b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
        } else if ("app".equals(mVar.i())) {
            a();
        } else if ("cosa".equals(this.b.i())) {
            b();
        } else if (CountValue.T_RP.equals(this.b.i())) {
            HMSLog.w("PushSelfShowLog", this.b.i() + " not support rich message.");
        } else if ("url".equals(this.b.i())) {
            HMSLog.w("PushSelfShowLog", this.b.i() + " not support URL.");
        } else {
            HMSLog.d("PushSelfShowLog", this.b.i() + " is not exist in hShowType");
        }
    }
}
