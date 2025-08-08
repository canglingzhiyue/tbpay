package com.taobao.flowcustoms.afc.utils;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.adaemon.TriggerService;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import tb.gvk;
import tb.kge;
import tb.kog;

/* loaded from: classes.dex */
public class AfcUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f17184a;
    private static int b;
    private static String c;
    private static String d;
    private static boolean e;
    private static long f;

    /* loaded from: classes7.dex */
    public enum FlowType {
        SHARE(1, "afc_share"),
        MESSAGE(2, "afc_message"),
        LINK(3, "afc_link"),
        LAUNCH(4, "afc_launch");
        
        private int code;
        private String descs;

        FlowType(int i, String str) {
            this.code = i;
            this.descs = str;
        }

        public static String getDesc(int i) {
            FlowType[] values;
            for (FlowType flowType : values()) {
                if (flowType.code == i) {
                    return flowType.descs;
                }
            }
            return null;
        }
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : h();
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : g();
    }

    static {
        kge.a(239370800);
        f17184a = "android.permission.READ_PHONE_STATE";
        b = 0;
        e = false;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : System.currentTimeMillis();
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : f;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(MessageDigest messageDigest) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18fff0f0", new Object[]{messageDigest});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : messageDigest.digest()) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString();
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!StringUtils.equals("ali.open.nav", str)) {
            return str;
        }
        return str + "." + str2;
    }

    public static String a(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16f08209", new Object[]{application}) : application != null ? application.getPackageName() : "";
    }

    public static String a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6033d0ac", new Object[]{context, new Boolean(z)});
        }
        if (context != null && e()) {
            try {
                if (ActivityCompat.checkSelfPermission(context, f17184a) == 0) {
                    return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId((TelephonyManager) context.getSystemService("phone"));
                }
                if (z) {
                    b.a(b.ARG1_DEVICE_INFO_APPLY_PRIVILEGE_COUNT, "", "", null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context != null && e()) {
            try {
                if (ActivityCompat.checkSelfPermission(context, f17184a) == 0) {
                    return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getSubscriberId((TelephonyManager) context.getSystemService("phone"));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        try {
            return Boolean.valueOf(kog.a().a("is_get_device_imei", "false")).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.app.Activity r7) {
        /*
            java.lang.String r0 = "linkx"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.flowcustoms.afc.utils.AfcUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            if (r2 == 0) goto L18
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r7
            java.lang.String r7 = "cf9cba26"
            java.lang.Object r7 = r1.ipc$dispatch(r7, r0)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L18:
            java.lang.String r1 = ""
            if (r7 != 0) goto L1d
            return r1
        L1d:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L7c
            r4 = 22
            if (r2 < r4) goto L3e
            java.lang.String r7 = c(r7)     // Catch: java.lang.Exception -> L7c
            boolean r2 = android.text.StringUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L7c
            if (r2 != 0) goto L95
            com.taobao.flowcustoms.afc.AfcCustomSdk r2 = com.taobao.flowcustoms.afc.AfcCustomSdk.a()     // Catch: java.lang.Exception -> L7c
            android.app.Application r2 = r2.f17167a     // Catch: java.lang.Exception -> L7c
            java.lang.String r2 = a(r2)     // Catch: java.lang.Exception -> L7c
            boolean r2 = r7.equals(r2)     // Catch: java.lang.Exception -> L7c
            if (r2 != 0) goto L95
            goto L96
        L3e:
            int r2 = com.taobao.flowcustoms.afc.utils.AfcUtils.b     // Catch: java.lang.Exception -> L7c
            if (r2 != 0) goto L95
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r7.getSystemService(r2)     // Catch: java.lang.Exception -> L7c
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L7c
            r4 = 2
            java.util.List r2 = r2.getRunningTasks(r4)     // Catch: java.lang.Exception -> L7c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L7c
        L53:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L7c
            if (r4 == 0) goto L76
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L7c
            android.app.ActivityManager$RunningTaskInfo r4 = (android.app.ActivityManager.RunningTaskInfo) r4     // Catch: java.lang.Exception -> L7c
            android.content.ComponentName r5 = r4.baseActivity     // Catch: java.lang.Exception -> L7c
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Exception -> L7c
            java.lang.String r6 = r7.getPackageName()     // Catch: java.lang.Exception -> L7c
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L7c
            if (r5 != 0) goto L53
            android.content.ComponentName r7 = r4.baseActivity     // Catch: java.lang.Exception -> L7c
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Exception -> L7c
            r1 = r7
        L76:
            int r7 = com.taobao.flowcustoms.afc.utils.AfcUtils.b     // Catch: java.lang.Exception -> L7c
            int r7 = r7 + r3
            com.taobao.flowcustoms.afc.utils.AfcUtils.b = r7     // Catch: java.lang.Exception -> L7c
            goto L95
        L7c:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AFCUtils === extractPackageName: 异常："
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.taobao.flowcustoms.afc.utils.c.a(r0, r7)
        L95:
            r7 = r1
        L96:
            boolean r1 = android.text.StringUtils.isEmpty(r7)
            if (r1 != 0) goto Lb0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AFCUtils === extractPackageName: 包名是："
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.taobao.flowcustoms.afc.utils.c.b(r0, r1)
        Lb0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.flowcustoms.afc.utils.AfcUtils.a(android.app.Activity):java.lang.String");
    }

    private static String c(Activity activity) {
        try {
            Field declaredField = Class.forName("android.app.Activity").getDeclaredField("mReferrer");
            declaredField.setAccessible(true);
            return (String) declaredField.get(activity);
        } catch (Exception e2) {
            c.a("linkx", "AFCUtils === reflectGetReferrer: 异常：" + e2.getMessage());
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(com.taobao.flowcustoms.afc.utils.AfcUtils.FlowType r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.flowcustoms.afc.utils.AfcUtils.a(com.taobao.flowcustoms.afc.utils.AfcUtils$FlowType, java.lang.String, java.util.Map):java.lang.String");
    }

    private static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            d.b.a(new Runnable() { // from class: com.taobao.flowcustoms.afc.utils.AfcUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (AfcCustomSdk.a().f17167a == null || !Boolean.parseBoolean(kog.a().a("enableTaid", "true"))) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("devInitTime", String.valueOf(Build.TIME));
                        hashMap.put("sysBootTime", AfcUtils.c());
                        hashMap.put("sysUTime", AfcUtils.d());
                        c.a("linkx", "AFCUtils === reportTaid. " + hashMap.toString());
                        b.a(b.AFC_FLOW_TAID, null, null, hashMap);
                    } catch (Throwable unused) {
                        c.a("linkx", "AFCUtils === reportTaid error");
                    }
                }
            });
        }
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : str != null && (str.contains("tbopen://m.taobao.com/sso") || str.contains("tbopen://m.taobao.com/getway/oauth"));
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            if ("212200".equals(context.getString(context.getResources().getIdentifier("ttid", "string", "com.taobao.taobao")))) {
                return "";
            }
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (!clipboardManager.hasPrimaryClip()) {
                return "";
            }
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            return ((primaryClip == null ? 0 : primaryClip.getItemCount()) <= 0 || primaryClip.getItemAt(0) == null || primaryClip.getItemAt(0).getText() == null) ? "" : primaryClip.getItemAt(0).getText().toString();
        } catch (Exception e2) {
            c.b("linkx", "AFCUtils === readClipBoard === 读取剪切板异常：" + e2);
            return "";
        }
    }

    public static String a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe45281d", new Object[]{list, str});
        }
        if (list != null && list.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                sb.append(str);
            }
            try {
                return sb.toString().substring(0, sb.length() - 1);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (e) {
            return true;
        }
        e = ((Boolean) f.a(context).b("app_first_installed", true)).booleanValue();
        c.a("linkx", "AFCUtils === isFirstInstall === APP首次安装打开:" + e);
        return e;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else {
            f.a(context).a("app_first_installed", (Object) false);
        }
    }

    public static String b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92892385", new Object[]{activity});
        }
        if (activity == null) {
            return "";
        }
        return activity.getClass().getName() + "@" + Integer.toHexString(activity.hashCode());
    }

    private static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        if (!StringUtils.isEmpty(c)) {
            return c;
        }
        try {
            byte[] bArr = new byte[256];
            String[] split = new String(bArr, 0, Runtime.getRuntime().exec("stat -c %X.%x /data/data").getInputStream().read(bArr), "utf-8").trim().split("[ \\|.]");
            if (split != null) {
                long j = 0;
                int intValue = split.length > 0 ? Integer.valueOf(split[0]).intValue() : 0;
                if (split.length > 3) {
                    j = Long.valueOf(split[3]).longValue();
                }
                c = String.format("%d.%09d", Integer.valueOf(intValue), Long.valueOf(j));
            }
        } catch (Exception unused) {
            c = "unknown";
        }
        return c;
    }

    private static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        if (!StringUtils.isEmpty(d)) {
            return d;
        }
        try {
            char[] cArr = new char[36];
            if (cArr.length == new FileReader("/proc/sys/kernel/random/boot_id").read(cArr)) {
                d = String.valueOf(cArr);
            }
        } catch (Exception unused) {
            d = "unknown";
        }
        return d;
    }

    private static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        try {
            return gvk.a(gvk.a()) == -2;
        } catch (Throwable unused) {
            c.b("linkx", "AFCUtils === isSimpleMainProcess === not support.");
            return false;
        }
    }

    private static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue();
        }
        try {
            return TriggerService.f8335a;
        } catch (Throwable unused) {
            c.b("linkx", "AFCUtils === getSimpleProcessTriggerType === not support.");
            return -1;
        }
    }

    private static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        try {
            return TriggerService.b;
        } catch (Throwable unused) {
            c.b("linkx", "AFCUtils === getSimpleProcessTriggerGroupType === not support.");
            return -1;
        }
    }
}
