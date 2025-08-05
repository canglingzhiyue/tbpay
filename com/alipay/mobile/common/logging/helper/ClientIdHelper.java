package com.alipay.mobile.common.logging.helper;

import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ClientIdHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static boolean a(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217958", new Object[]{new Byte(b)})).booleanValue() : (b >= 48 && b <= 57) || (b >= 97 && b <= 122) || (b >= 65 && b <= 90);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r5.startsWith(r6) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.helper.ClientIdHelper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            java.lang.String r8 = "bbc5dc40"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L15:
            com.alipay.mobile.common.logging.util.LoggingSPCache r0 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            r1 = 0
            java.lang.String r3 = "clientID"
            java.lang.String r0 = r0.getString(r3, r1)
            com.alipay.mobile.common.logging.util.LoggingSPCache r1 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            java.lang.String r4 = ""
            java.lang.String r5 = "clientIMEI"
            java.lang.String r1 = r1.getString(r5, r4)
            java.lang.String r6 = "android.permission.READ_PHONE_STATE"
            int r6 = r8.checkCallingOrSelfPermission(r6)     // Catch: java.lang.Throwable -> L58
            if (r6 != 0) goto L58
            java.lang.String r6 = "phone"
            java.lang.Object r8 = r8.getSystemService(r6)     // Catch: java.lang.Throwable -> L58
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId(r8)     // Catch: java.lang.Throwable -> L58
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L58
            java.lang.String r1 = com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(r8)     // Catch: java.lang.Throwable -> L58
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L58
            if (r8 != 0) goto L58
            com.alipay.mobile.common.logging.util.LoggingSPCache r8 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()     // Catch: java.lang.Throwable -> L58
            r8.putStringApply(r5, r1)     // Catch: java.lang.Throwable -> L58
        L58:
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L60
            r8 = 0
            goto L66
        L60:
            java.lang.String r8 = "[[a-z][A-Z][0-9]]{15}\\|[[a-z][A-Z][0-9]]{15}"
            boolean r8 = r0.matches(r8)
        L66:
            if (r8 == 0) goto Lbe
            r8 = 15
            java.lang.String r5 = r0.substring(r2, r8)
            boolean r6 = a(r4)
            if (r6 == 0) goto L89
            java.lang.String r6 = c(r4)
            int r7 = r6.length()
            if (r7 <= r8) goto L82
            java.lang.String r6 = r6.substring(r2, r8)
        L82:
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L89
            goto L8a
        L89:
            r4 = r5
        L8a:
            int r5 = r0.length()
            int r5 = r5 - r8
            int r6 = r0.length()
            java.lang.String r0 = r0.substring(r5, r6)
            boolean r5 = a(r1)
            if (r5 == 0) goto Lb2
            java.lang.String r5 = c(r1)
            int r6 = r5.length()
            if (r6 <= r8) goto Lab
            java.lang.String r5 = r5.substring(r2, r8)
        Lab:
            boolean r8 = r0.startsWith(r5)
            if (r8 != 0) goto Lb2
            r0 = r1
        Lb2:
            java.lang.String r8 = a(r4, r0)
            com.alipay.mobile.common.logging.util.LoggingSPCache r0 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            r0.putStringApply(r3, r8)
            goto Ldd
        Lbe:
            boolean r8 = a(r1)
            if (r8 != 0) goto Lc8
            java.lang.String r1 = a()
        Lc8:
            boolean r8 = a(r4)
            if (r8 != 0) goto Ld2
            java.lang.String r4 = a()
        Ld2:
            java.lang.String r8 = a(r4, r1)
            com.alipay.mobile.common.logging.util.LoggingSPCache r0 = com.alipay.mobile.common.logging.util.LoggingSPCache.getInstance()
            r0.putStringApply(r3, r8)
        Ldd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.helper.ClientIdHelper.a(android.content.Context):java.lang.String");
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : new SimpleDateFormat("yyMMddHHmmssSSS").format(Long.valueOf(System.currentTimeMillis()));
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str != null && str.trim().length() != 0) {
            String trim = str.trim();
            return !trim.equalsIgnoreCase("unknown") && !trim.equalsIgnoreCase("null") && !trim.matches("[0]+") && trim.length() > 5;
        }
        return false;
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return b(str) + "|" + b(str2);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!a(str)) {
            str = a();
        }
        return c((str + "123456789012345").substring(0, 15));
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (!a(bytes[i])) {
                bytes[i] = 48;
            }
        }
        return new String(bytes);
    }
}
