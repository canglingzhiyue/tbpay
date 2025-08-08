package com.meizu.flyme.openidsdk;

import android.content.BroadcastReceiver;
import tb.kge;

/* loaded from: classes4.dex */
final class a extends BroadcastReceiver {
    static {
        kge.a(992026162);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r1 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (android.text.StringUtils.equals(r6.getStringExtra("openIdPackage"), r5.getPackageName()) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        r0 = true;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L88
            if (r6 != 0) goto L6
            goto L88
        L6:
            r0 = 0
            java.lang.String r1 = "openIdNotifyFlag"
            int r1 = r6.getIntExtra(r1, r0)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "shouldUpdateId, notifyFlag : "
            java.lang.String r2 = r3.concat(r2)
            com.meizu.flyme.openidsdk.f.a(r2)
            r2 = 1
            if (r1 != r2) goto L2f
            java.lang.String r1 = "openIdPackage"
            java.lang.String r1 = r6.getStringExtra(r1)
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = android.text.StringUtils.equals(r1, r5)
            if (r5 == 0) goto L46
        L2d:
            r0 = 1
            goto L46
        L2f:
            r3 = 2
            if (r1 != r3) goto L43
            java.lang.String r1 = "openIdPackageList"
            java.util.ArrayList r1 = r6.getStringArrayListExtra(r1)
            if (r1 == 0) goto L46
            java.lang.String r5 = r5.getPackageName()
            boolean r0 = r1.contains(r5)
            goto L46
        L43:
            if (r1 != 0) goto L46
            goto L2d
        L46:
            if (r0 != 0) goto L49
            return
        L49:
            java.lang.String r5 = "openIdType"
            java.lang.String r5 = r6.getStringExtra(r5)
            com.meizu.flyme.openidsdk.f r6 = com.meizu.flyme.openidsdk.f.a()
            java.lang.String r0 = "oaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5e
            com.meizu.flyme.openidsdk.b r5 = r6.b
            goto L82
        L5e:
            java.lang.String r0 = "vaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L6a
            com.meizu.flyme.openidsdk.b r5 = r6.d
            goto L82
        L6a:
            java.lang.String r0 = "aaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L75
            com.meizu.flyme.openidsdk.b r5 = r6.c
            goto L82
        L75:
            java.lang.String r0 = "udid"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L81
            com.meizu.flyme.openidsdk.b r5 = r6.f8023a
            goto L82
        L81:
            r5 = 0
        L82:
            if (r5 != 0) goto L85
            return
        L85:
            r5.b()
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.flyme.openidsdk.a.onReceive(android.content.Context, android.content.Intent):void");
    }
}
