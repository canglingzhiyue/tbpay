package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.Cif;
import com.xiaomi.push.ig;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public class ca {

    /* renamed from: a  reason: collision with root package name */
    private static String f24688a;

    /* renamed from: a  reason: collision with other field name */
    private static SimpleDateFormat f986a;

    /* renamed from: a  reason: collision with other field name */
    private static AtomicLong f987a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f986a = simpleDateFormat;
        f24688a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    private static jb a(String str, String str2, Cif cif) {
        return new jb("-1", false).d(str).b(str2).a(com.xiaomi.push.x.a(jm.a(cif))).c(im.UploadTinyData.f538a);
    }

    public static synchronized String a() {
        String str;
        synchronized (ca.class) {
            String format = f986a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(f24688a, format)) {
                f987a.set(0L);
                f24688a = format;
            }
            str = format + "-" + f987a.incrementAndGet();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.xiaomi.push.jb> a(java.util.List<com.xiaomi.push.ig> r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            if (r11 != 0) goto La
            java.lang.String r11 = "requests can not be null in TinyDataHelper.transToThriftObj()."
        L6:
            com.xiaomi.channel.commonutils.logger.b.d(r11)
            return r0
        La:
            int r1 = r11.size()
            if (r1 != 0) goto L14
            java.lang.String r11 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            goto L6
        L14:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.if r2 = new com.xiaomi.push.if
            r2.<init>()
            r3 = 0
            r4 = r2
            r2 = 0
            r5 = 0
        L22:
            int r6 = r11.size()
            if (r2 >= r6) goto Lab
            java.lang.Object r6 = r11.get(r2)
            com.xiaomi.push.ig r6 = (com.xiaomi.push.ig) r6
            if (r6 == 0) goto La7
            java.util.Map r7 = r6.m2037a()
            if (r7 == 0) goto L6f
            java.util.Map r7 = r6.m2037a()
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L6f
            java.util.Map r7 = r6.m2037a()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L57
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L57
            goto L58
        L57:
            r7 = 0
        L58:
            java.util.Map r9 = r6.m2037a()
            int r9 = r9.size()
            r10 = 1
            if (r9 != r10) goto L67
            r6.a(r0)
            goto L70
        L67:
            java.util.Map r9 = r6.m2037a()
            r9.remove(r8)
            goto L70
        L6f:
            r7 = 0
        L70:
            if (r7 > 0) goto L77
            byte[] r7 = com.xiaomi.push.jm.a(r6)
            int r7 = r7.length
        L77:
            if (r7 <= r14) goto L92
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "TinyData is too big, ignore upload request item:"
            r7.append(r8)
            java.lang.String r6 = r6.d()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
            goto La7
        L92:
            int r8 = r5 + r7
            if (r8 <= r14) goto La3
            com.xiaomi.push.jb r4 = a(r12, r13, r4)
            r1.add(r4)
            com.xiaomi.push.if r4 = new com.xiaomi.push.if
            r4.<init>()
            r5 = 0
        La3:
            r4.a(r6)
            int r5 = r5 + r7
        La7:
            int r2 = r2 + 1
            goto L22
        Lab:
            int r11 = r4.a()
            if (r11 == 0) goto Lb8
            com.xiaomi.push.jb r11 = a(r12, r13, r4)
            r1.add(r11)
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ca.a(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    public static void a(Context context, String str, String str2, long j, String str3) {
        ig igVar = new ig();
        igVar.d(str);
        igVar.c(str2);
        igVar.a(j);
        igVar.b(str3);
        igVar.a("push_sdk_channel");
        igVar.g(context.getPackageName());
        igVar.e(context.getPackageName());
        igVar.a(true);
        igVar.b(System.currentTimeMillis());
        igVar.f(a());
        cb.a(context, igVar);
    }

    public static boolean a(ig igVar, boolean z) {
        String str;
        if (igVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z && TextUtils.isEmpty(igVar.f510a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(igVar.f517d)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(igVar.f516c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!com.xiaomi.push.bm.m1742a(igVar.f517d)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (!com.xiaomi.push.bm.m1742a(igVar.f516c)) {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (igVar.f515b == null || igVar.f515b.length() <= 10240) {
            return false;
        } else {
            str = "item.data is too large(" + igVar.f515b.length() + "), max size for data is " + AccsConnection.DATA_PACKAGE_MAX + " , verfiy ClientUploadDataItem failed.";
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
        return true;
    }

    public static boolean a(String str) {
        return !com.xiaomi.push.r.m2216b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
