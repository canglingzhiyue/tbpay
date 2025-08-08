package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public class bq {
    public static String a() {
        return Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL;
    }

    public static String a(Context context) {
        String a2 = bt.a(context).a("sp_client_report_status", "sp_client_report_key", "");
        if (StringUtils.isEmpty(a2)) {
            String a3 = bm.a(20);
            bt.a(context).m1749a("sp_client_report_status", "sp_client_report_key", a3);
            return a3;
        }
        return a2;
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra("category", "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
        if (r7 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bq.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0 || !m1745a(context)) {
            return;
        }
        for (String str : list) {
            if (!StringUtils.isEmpty(str)) {
                a(context, str);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1745a(Context context) {
        return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1746a(Context context, String str) {
        File file = new File(str);
        long maxFileLength = com.xiaomi.clientreport.manager.a.a(context).m1626a().getMaxFileLength();
        if (file.exists()) {
            try {
                if (file.length() > maxFileLength) {
                    return false;
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                return false;
            }
        } else {
            x.m2368a(file);
        }
        return true;
    }

    public static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(bj.m1740a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static File[] m1747a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new bs());
        }
        return null;
    }
}
