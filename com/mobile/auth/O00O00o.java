package com.mobile.auth;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionManager;

/* loaded from: classes4.dex */
public class O00O00o {
    private static O00O00o O000000o;
    private static long O00000Oo;
    private O000000o O00000o0 = null;

    /* loaded from: classes4.dex */
    public static class O000000o {
        private int O000000o = -1;
        private int O00000Oo = -1;

        public int O000000o() {
            return this.O00000Oo;
        }
    }

    private O00O00o() {
    }

    public static O00O00o O000000o() {
        if (O000000o == null) {
            O000000o = new O00O00o();
        }
        return O000000o;
    }

    private void O000000o(Context context) {
        if (Build.VERSION.SDK_INT < 22) {
            this.O00000o0.O000000o = -1;
            return;
        }
        SubscriptionManager from = SubscriptionManager.from(context.getApplicationContext());
        if (from == null) {
            return;
        }
        try {
            if (this.O00000o0.O000000o == -1 && Build.VERSION.SDK_INT >= 24) {
                this.O00000o0.O00000Oo = SubscriptionManager.getDefaultDataSubscriptionId();
                O0O000o.O00000Oo("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配成功: dataSubId = " + this.O00000o0.O00000Oo);
                return;
            }
        } catch (Exception unused) {
            O0O000o.O000000o("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配失败");
        }
        try {
            Object invoke = from.getClass().getMethod("getDefaultDataSubId", new Class[0]).invoke(from, new Object[0]);
            if ((invoke instanceof Integer) || (invoke instanceof Long)) {
                this.O00000o0.O00000Oo = ((Integer) invoke).intValue();
                O0O000o.O00000Oo("UMCTelephonyManagement", "android 7.0以下手机getDefaultDataSubId适配成功: dataSubId = " + this.O00000o0.O00000Oo);
                return;
            }
        } catch (Exception unused2) {
            O0O000o.O000000o("UMCTelephonyManagement", "readDefaultDataSubId-->getDefaultDataSubId 反射出错");
        }
        try {
            Object invoke2 = from.getClass().getMethod("getDefaultDataSubscriptionId", new Class[0]).invoke(from, new Object[0]);
            if (!(invoke2 instanceof Integer) && !(invoke2 instanceof Long)) {
                return;
            }
            this.O00000o0.O00000Oo = ((Integer) invoke2).intValue();
            O0O000o.O00000Oo("UMCTelephonyManagement", "反射getDefaultDataSubscriptionId适配成功: dataSubId = " + this.O00000o0.O00000Oo);
        } catch (Exception unused3) {
            O0O000o.O000000o("UMCTelephonyManagement", "getDefaultDataSubscriptionId-->getDefaultDataSubscriptionId 反射出错");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r11 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r11 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        com.mobile.auth.O0O000o.O00000Oo("UMCTelephonyManagement", "readSimInfoDbEnd");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O00000Oo(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "sim_id"
            java.lang.String r1 = "_id"
            java.lang.String r2 = "UMCTelephonyManagement"
            java.lang.String r3 = "readSimInfoDbStart"
            com.mobile.auth.O0O000o.O00000Oo(r2, r3)
            java.lang.String r3 = "content://telephony/siminfo"
            android.net.Uri r5 = android.net.Uri.parse(r3)
            android.content.ContentResolver r4 = r11.getContentResolver()
            r11 = 0
            java.lang.String[] r6 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            java.lang.String r7 = "sim_id>=?"
            java.lang.String r3 = "0"
            java.lang.String[] r8 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            if (r11 == 0) goto L80
        L29:
            boolean r3 = r11.moveToNext()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            if (r3 == 0) goto L80
            int r3 = r11.getColumnIndex(r0)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            int r3 = r11.getInt(r3)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            int r4 = r11.getColumnIndex(r1)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            int r4 = r11.getInt(r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            com.mobile.auth.O00O00o$O000000o r5 = r10.O00000o0     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            int r5 = com.mobile.auth.O00O00o.O000000o.O00000Oo(r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            r6 = -1
            if (r5 != r6) goto L72
            com.mobile.auth.O00O00o$O000000o r5 = r10.O00000o0     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            int r5 = com.mobile.auth.O00O00o.O000000o.O000000o(r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            if (r5 == r6) goto L72
            com.mobile.auth.O00O00o$O000000o r5 = r10.O00000o0     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            int r5 = com.mobile.auth.O00O00o.O000000o.O000000o(r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            if (r5 != r4) goto L72
            com.mobile.auth.O00O00o$O000000o r5 = r10.O00000o0     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            com.mobile.auth.O00O00o.O000000o.O000000o(r5, r3)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            r5.<init>()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            java.lang.String r6 = "通过读取sim db获取数据流量卡的卡槽值："
            r5.append(r6)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            r5.append(r3)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            com.mobile.auth.O0O000o.O00000Oo(r2, r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
        L72:
            com.mobile.auth.O00O00o$O000000o r5 = r10.O00000o0     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            int r5 = com.mobile.auth.O00O00o.O000000o.O00000Oo(r5)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            if (r5 != r3) goto L29
            com.mobile.auth.O00O00o$O000000o r3 = r10.O00000o0     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            com.mobile.auth.O00O00o.O000000o.O00000Oo(r3, r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L93
            goto L29
        L80:
            if (r11 == 0) goto L8d
            goto L8a
        L83:
            java.lang.String r0 = "readSimInfoDb error"
            com.mobile.auth.O0O000o.O000000o(r2, r0)     // Catch: java.lang.Throwable -> L93
            if (r11 == 0) goto L8d
        L8a:
            r11.close()
        L8d:
            java.lang.String r11 = "readSimInfoDbEnd"
            com.mobile.auth.O0O000o.O00000Oo(r2, r11)
            return
        L93:
            r0 = move-exception
            if (r11 == 0) goto L99
            r11.close()
        L99:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00O00o.O00000Oo(android.content.Context):void");
    }

    public void O000000o(Context context, boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - O00000Oo;
        if (currentTimeMillis >= 5000 || currentTimeMillis <= 0) {
            this.O00000o0 = new O000000o();
            if (!z) {
                return;
            }
            O000000o(context);
            if ((O0OoOo.O00000oO() || O0OoOo.O00000oo()) && O0OoOo.O00000o()) {
                O0O000o.O00000Oo("UMCTelephonyManagement", "华为手机兼容性处理");
                if (this.O00000o0.O00000Oo == 0 || this.O00000o0.O00000Oo == 1) {
                    if (this.O00000o0.O000000o == -1) {
                        O000000o o000000o = this.O00000o0;
                        o000000o.O000000o = o000000o.O00000Oo;
                    }
                    this.O00000o0.O00000Oo = -1;
                }
                if ((this.O00000o0.O000000o != -1 || this.O00000o0.O00000Oo != -1) && Build.VERSION.SDK_INT >= 21) {
                    O00000Oo(context);
                }
            }
            O00000Oo = System.currentTimeMillis();
        }
    }

    public O000000o O00000Oo() {
        O000000o o000000o = this.O00000o0;
        return o000000o == null ? new O000000o() : o000000o;
    }
}
