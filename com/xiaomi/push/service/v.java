package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes9.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static u f24727a;

    /* renamed from: a  reason: collision with other field name */
    private static a f1029a;

    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    private static int a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized u m2360a(Context context) {
        synchronized (v.class) {
            if (f24727a != null) {
                return f24727a;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
            String string = sharedPreferences.getString("uuid", null);
            String string2 = sharedPreferences.getString("token", null);
            String string3 = sharedPreferences.getString(Baggage.Amnet.CFG_SSL, null);
            String string4 = sharedPreferences.getString("app_id", null);
            String string5 = sharedPreferences.getString("app_token", null);
            String string6 = sharedPreferences.getString("package_name", null);
            String string7 = sharedPreferences.getString(PushConstants.DEVICE_ID, null);
            int i = sharedPreferences.getInt("env_type", 1);
            if (!TextUtils.isEmpty(string7) && com.xiaomi.push.i.a(string7)) {
                string7 = com.xiaomi.push.i.g(context);
                sharedPreferences.edit().putString(PushConstants.DEVICE_ID, string7).commit();
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            String g = com.xiaomi.push.i.g(context);
            if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(g) && !TextUtils.isEmpty(string7) && !string7.equals(g)) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("read_phone_state permission changes.");
            }
            u uVar = new u(string, string2, string3, string4, string5, string6, i);
            f24727a = uVar;
            return uVar;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:3|4|(2:8|(24:10|11|(1:13)(1:118)|14|(1:16)(1:117)|17|(1:19)(1:116)|20|21|22|23|(1:25)(1:112)|26|(6:28|(1:30)|31|(1:35)|36|(1:38))|39|(1:41)|42|(6:45|46|47|49|50|43)|54|55|(3:60|61|(2:63|64)(9:(1:67)|68|69|(2:73|(4:75|76|77|(7:79|(1:81)|82|83|84|85|86)(6:88|89|(1:93)|94|95|96)))|106|(2:91|93)|94|95|96))|111|61|(0)(0)))|119|11|(0)(0)|14|(0)(0)|17|(0)(0)|20|21|22|23|(0)(0)|26|(0)|39|(0)|42|(1:43)|54|55|(4:57|60|61|(0)(0))|111|61|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
        com.xiaomi.channel.commonutils.logger.b.a(r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031d A[Catch: all -> 0x0332, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003b, B:12:0x0047, B:16:0x005a, B:20:0x0066, B:24:0x0072, B:25:0x007c, B:31:0x0090, B:33:0x0099, B:35:0x00c2, B:37:0x00ce, B:38:0x00e1, B:40:0x00eb, B:42:0x00f1, B:43:0x0105, B:45:0x010b, B:46:0x0110, B:48:0x0133, B:49:0x013d, B:50:0x0175, B:52:0x017b, B:53:0x0182, B:56:0x0191, B:57:0x01c2, B:59:0x01e3, B:62:0x01ea, B:64:0x0201, B:70:0x0210, B:74:0x0217, B:76:0x022e, B:78:0x0234, B:80:0x023e, B:82:0x024b, B:84:0x026c, B:85:0x0282, B:87:0x02a0, B:99:0x02ee, B:100:0x0300, B:106:0x031d, B:108:0x0323, B:109:0x032b, B:103:0x0307, B:91:0x02c3, B:28:0x0088), top: B:115:0x0005, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: all -> 0x0332, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003b, B:12:0x0047, B:16:0x005a, B:20:0x0066, B:24:0x0072, B:25:0x007c, B:31:0x0090, B:33:0x0099, B:35:0x00c2, B:37:0x00ce, B:38:0x00e1, B:40:0x00eb, B:42:0x00f1, B:43:0x0105, B:45:0x010b, B:46:0x0110, B:48:0x0133, B:49:0x013d, B:50:0x0175, B:52:0x017b, B:53:0x0182, B:56:0x0191, B:57:0x01c2, B:59:0x01e3, B:62:0x01ea, B:64:0x0201, B:70:0x0210, B:74:0x0217, B:76:0x022e, B:78:0x0234, B:80:0x023e, B:82:0x024b, B:84:0x026c, B:85:0x0282, B:87:0x02a0, B:99:0x02ee, B:100:0x0300, B:106:0x031d, B:108:0x0323, B:109:0x032b, B:103:0x0307, B:91:0x02c3, B:28:0x0088), top: B:115:0x0005, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x0332, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003b, B:12:0x0047, B:16:0x005a, B:20:0x0066, B:24:0x0072, B:25:0x007c, B:31:0x0090, B:33:0x0099, B:35:0x00c2, B:37:0x00ce, B:38:0x00e1, B:40:0x00eb, B:42:0x00f1, B:43:0x0105, B:45:0x010b, B:46:0x0110, B:48:0x0133, B:49:0x013d, B:50:0x0175, B:52:0x017b, B:53:0x0182, B:56:0x0191, B:57:0x01c2, B:59:0x01e3, B:62:0x01ea, B:64:0x0201, B:70:0x0210, B:74:0x0217, B:76:0x022e, B:78:0x0234, B:80:0x023e, B:82:0x024b, B:84:0x026c, B:85:0x0282, B:87:0x02a0, B:99:0x02ee, B:100:0x0300, B:106:0x031d, B:108:0x0323, B:109:0x032b, B:103:0x0307, B:91:0x02c3, B:28:0x0088), top: B:115:0x0005, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133 A[Catch: all -> 0x0332, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003b, B:12:0x0047, B:16:0x005a, B:20:0x0066, B:24:0x0072, B:25:0x007c, B:31:0x0090, B:33:0x0099, B:35:0x00c2, B:37:0x00ce, B:38:0x00e1, B:40:0x00eb, B:42:0x00f1, B:43:0x0105, B:45:0x010b, B:46:0x0110, B:48:0x0133, B:49:0x013d, B:50:0x0175, B:52:0x017b, B:53:0x0182, B:56:0x0191, B:57:0x01c2, B:59:0x01e3, B:62:0x01ea, B:64:0x0201, B:70:0x0210, B:74:0x0217, B:76:0x022e, B:78:0x0234, B:80:0x023e, B:82:0x024b, B:84:0x026c, B:85:0x0282, B:87:0x02a0, B:99:0x02ee, B:100:0x0300, B:106:0x031d, B:108:0x0323, B:109:0x032b, B:103:0x0307, B:91:0x02c3, B:28:0x0088), top: B:115:0x0005, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017b A[Catch: all -> 0x0332, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003b, B:12:0x0047, B:16:0x005a, B:20:0x0066, B:24:0x0072, B:25:0x007c, B:31:0x0090, B:33:0x0099, B:35:0x00c2, B:37:0x00ce, B:38:0x00e1, B:40:0x00eb, B:42:0x00f1, B:43:0x0105, B:45:0x010b, B:46:0x0110, B:48:0x0133, B:49:0x013d, B:50:0x0175, B:52:0x017b, B:53:0x0182, B:56:0x0191, B:57:0x01c2, B:59:0x01e3, B:62:0x01ea, B:64:0x0201, B:70:0x0210, B:74:0x0217, B:76:0x022e, B:78:0x0234, B:80:0x023e, B:82:0x024b, B:84:0x026c, B:85:0x0282, B:87:0x02a0, B:99:0x02ee, B:100:0x0300, B:106:0x031d, B:108:0x0323, B:109:0x032b, B:103:0x0307, B:91:0x02c3, B:28:0x0088), top: B:115:0x0005, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.xiaomi.push.service.u a(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.v.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.u");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m2361a(Context context) {
        u m2360a = m2360a(context);
        if (m2360a != null && !TextUtils.isEmpty(m2360a.f1028a)) {
            String[] split = m2360a.f1028a.split("@");
            if (split.length > 0) {
                return split[0];
            }
        }
        return null;
    }

    private static String a(Context context, boolean z) {
        StringBuilder sb;
        String str;
        String a2 = com.xiaomi.push.service.a.a(context).a();
        String str2 = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (com.xiaomi.push.aa.b()) {
            sb = new StringBuilder();
            str = "http://10.38.162.35:9085";
        } else if (!com.xiaomi.push.m.China.name().equals(a2)) {
            return null;
        } else {
            sb = new StringBuilder();
            str = "https://cn.register.xmpush.xiaomi.com";
        }
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void a() {
        a aVar = f1029a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m2362a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f24727a = null;
        a();
    }

    private static void a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putInt("enc_req_fail_count", i);
        edit.commit();
    }

    public static void a(Context context, u uVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString("uuid", uVar.f1028a);
        edit.putString(Baggage.Amnet.CFG_SSL, uVar.c);
        edit.putString("token", uVar.b);
        edit.putString("app_id", uVar.d);
        edit.putString("package_name", uVar.f);
        edit.putString("app_token", uVar.e);
        edit.putString(PushConstants.DEVICE_ID, com.xiaomi.push.i.g(context));
        edit.putInt("env_type", uVar.f24726a);
        edit.commit();
        a();
    }

    public static void a(a aVar) {
        f1029a = aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m2363a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
