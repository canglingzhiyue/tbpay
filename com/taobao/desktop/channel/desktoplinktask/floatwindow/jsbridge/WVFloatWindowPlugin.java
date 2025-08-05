package com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge;

import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class WVFloatWindowPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WV_PLUGIN = "WVFloatWindowPlugin";

    static {
        kge.a(-488130996);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r0 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (android.os.Build.VERSION.SDK_INT < 23) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        r7 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + r8.getPackageName()));
        r7.setFlags(268435456);
        getContext().startActivity(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
        r7 = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        r7.setData(android.net.Uri.fromParts("package", r8.getPackageName(), null));
        r7.setFlags(268435456);
        getContext().startActivity(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
        r9.success();
     */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r7, java.lang.String r8, android.taobao.windvane.jsbridge.WVCallBackContext r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge.WVFloatWindowPlugin.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L22
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r3] = r7
            r7 = 2
            r1[r7] = r8
            r7 = 3
            r1[r7] = r9
            java.lang.String r7 = "bcd41fd1"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L22:
            tb.khm r8 = tb.khm.a()     // Catch: java.lang.Throwable -> Lc2
            android.app.Application r8 = r8.b()     // Catch: java.lang.Throwable -> Lc2
            r0 = -1
            int r1 = r7.hashCode()     // Catch: java.lang.Throwable -> Lc2
            r4 = -1546652743(0xffffffffa3cff3b9, float:-2.2546206E-17)
            if (r1 == r4) goto L44
            r4 = 1357998211(0x50f16883, float:3.24012667E10)
            if (r1 == r4) goto L3a
            goto L4e
        L3a:
            java.lang.String r1 = "isPermissionOpen"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L4e
            r0 = 0
            goto L4e
        L44:
            java.lang.String r1 = "openPermission"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lc2
            if (r7 == 0) goto L4e
            r0 = 1
        L4e:
            if (r0 == 0) goto Lab
            if (r0 == r3) goto L53
            goto Lc1
        L53:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc2
            r0 = 23
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r7 < r0) goto L87
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r4.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "package:"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Throwable -> Lc2
            r4.append(r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> Lc2
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> Lc2
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> Lc2
            r7.setFlags(r1)     // Catch: java.lang.Throwable -> Lc2
            android.content.Context r8 = r6.getContext()     // Catch: java.lang.Throwable -> Lc2
            r8.startActivity(r7)     // Catch: java.lang.Throwable -> Lc2
            goto La7
        L87:
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "package"
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Throwable -> Lc2
            r4 = 0
            android.net.Uri r8 = android.net.Uri.fromParts(r0, r8, r4)     // Catch: java.lang.Throwable -> Lc2
            r7.setData(r8)     // Catch: java.lang.Throwable -> Lc2
            r7.setFlags(r1)     // Catch: java.lang.Throwable -> Lc2
            android.content.Context r8 = r6.getContext()     // Catch: java.lang.Throwable -> Lc2
            r8.startActivity(r7)     // Catch: java.lang.Throwable -> Lc2
        La7:
            r9.success()     // Catch: java.lang.Throwable -> Lc2
            goto Lc1
        Lab:
            boolean r7 = tb.kgy.b(r8)     // Catch: java.lang.Throwable -> Lc2
            android.taobao.windvane.jsbridge.r r8 = new android.taobao.windvane.jsbridge.r     // Catch: java.lang.Throwable -> Lc2
            r8.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "result"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> Lc2
            r8.a(r0, r7)     // Catch: java.lang.Throwable -> Lc2
            r9.success(r8)     // Catch: java.lang.Throwable -> Lc2
        Lc1:
            return r3
        Lc2:
            r7 = move-exception
            java.lang.String r8 = "WVFloatWindowPlugin.execute.error"
            tb.kgz.a(r8, r7)
            r9.error()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge.WVFloatWindowPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
