package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.bg;
import com.xiaomi.push.bh;
import com.xiaomi.push.bl;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.az;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class i {
    public static int a() {
        Integer num = (Integer) bh.a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int a(Context context, e eVar, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a2 = a(eVar);
        String string = sharedPreferences.getString(a2, "");
        String m1673c = b.m1665a(context).m1673c();
        String string2 = sharedPreferences.getString("last_check_token", "");
        if (StringUtils.isEmpty(a2)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return 0;
        } else if (StringUtils.isEmpty(string)) {
            return 1;
        } else {
            if (!string.equals(str)) {
                return 2;
            }
            if (!StringUtils.equals(m1673c, string2)) {
                return 3;
            }
            if (m1690a(eVar)) {
                if (a() != sharedPreferences.getInt(b(eVar), 0)) {
                    return 4;
                }
            }
            return 0;
        }
    }

    public static MiPushMessage a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has("notifyId")) {
                    miPushMessage.setNotifyId(jSONObject.getInt("notifyId"));
                }
                if (jSONObject.has("category")) {
                    miPushMessage.setCategory(jSONObject.getString("category"));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    if (hashMap.size() > 0) {
                        miPushMessage.setExtra(hashMap);
                    }
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d(e.toString());
            }
        }
        return miPushMessage;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static PushMessageReceiver a(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    resolveInfo = it.next();
                    if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName.equals(context.getPackageName())) {
                        break;
                    }
                }
            }
            resolveInfo = null;
            if (resolveInfo == null) {
                return null;
            }
            return (PushMessageReceiver) com.xiaomi.push.r.a(context, resolveInfo.activityInfo.name).newInstance();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d(e.toString());
            return null;
        }
    }

    static String a(Context context, e eVar) {
        return a(context, eVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized String a(Context context, e eVar, boolean z) {
        synchronized (i.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
            if (z) {
                String string = sharedPreferences.getString("syncingToken", "");
                if (!StringUtils.isEmpty(string)) {
                    return string;
                }
            }
            String a2 = a(eVar);
            if (!StringUtils.isEmpty(a2)) {
                return sharedPreferences.getString(a2, "");
            }
            return "";
        }
    }

    public static String a(e eVar) {
        int i = k.f24328a[eVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "fcm_push_token_v2";
            }
            if (i == 3) {
                return "cos_push_token";
            }
            if (i == 4) {
                return "ftos_push_token";
            }
            return null;
        }
        return "hms_push_token";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r12 != 0) goto L11;
     */
    /* renamed from: a  reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap<java.lang.String, java.lang.String> m1684a(android.content.Context r11, com.xiaomi.mipush.sdk.e r12) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int[] r1 = com.xiaomi.mipush.sdk.k.f24328a
            int r2 = r12.ordinal()
            r1 = r1[r2]
            r2 = 0
            java.lang.String r3 = "package_name"
            java.lang.String r4 = "token"
            java.lang.String r5 = "brand"
            java.lang.String r6 = "~"
            java.lang.String r7 = ":"
            r8 = 1
            if (r1 == r8) goto La9
            r9 = 2
            java.lang.String r10 = "version"
            if (r1 == r9) goto L7e
            r9 = 3
            if (r1 == r9) goto L59
            r9 = 4
            if (r1 == r9) goto L2c
            goto Lf5
        L2c:
            com.xiaomi.push.s$a r1 = new com.xiaomi.push.s$a
            r1.<init>(r7, r6)
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.ag.VIVO
            java.lang.String r2 = r2.name()
            com.xiaomi.push.s$a r1 = r1.a(r5, r2)
            java.lang.String r12 = a(r11, r12, r8)
            com.xiaomi.push.s$a r12 = r1.a(r4, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r3, r11)
            int r12 = a()
            if (r12 == 0) goto L78
        L51:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.a(r10, r12)
            goto L78
        L59:
            com.xiaomi.push.s$a r1 = new com.xiaomi.push.s$a
            r1.<init>(r7, r6)
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.ag.OPPO
            java.lang.String r2 = r2.name()
            com.xiaomi.push.s$a r1 = r1.a(r5, r2)
            java.lang.String r12 = a(r11, r12, r8)
            com.xiaomi.push.s$a r12 = r1.a(r4, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r3, r11)
        L78:
            java.lang.String r2 = r11.toString()
            goto Lf5
        L7e:
            com.xiaomi.push.s$a r1 = new com.xiaomi.push.s$a
            r1.<init>(r7, r6)
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.ag.FCM
            java.lang.String r2 = r2.name()
            com.xiaomi.push.s$a r1 = r1.a(r5, r2)
            r2 = 0
            java.lang.String r12 = a(r11, r12, r2)
            com.xiaomi.push.s$a r12 = r1.a(r4, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r3, r11)
            int r12 = a()
            if (r12 == 0) goto La5
            goto L51
        La5:
            r12 = 50300(0xc47c, float:7.0485E-41)
            goto L51
        La9:
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch: java.lang.Exception -> Lb8
            java.lang.String r9 = r11.getPackageName()     // Catch: java.lang.Exception -> Lb8
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r1.getApplicationInfo(r9, r10)     // Catch: java.lang.Exception -> Lb8
            goto Lc0
        Lb8:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r1)
        Lc0:
            r1 = -1
            if (r2 == 0) goto Lcb
            android.os.Bundle r1 = r2.metaData
            java.lang.String r2 = "com.huawei.hms.client.appid"
            int r1 = r1.getInt(r2)
        Lcb:
            com.xiaomi.push.s$a r2 = new com.xiaomi.push.s$a
            r2.<init>(r7, r6)
            com.xiaomi.mipush.sdk.ag r6 = com.xiaomi.mipush.sdk.ag.HUAWEI
            java.lang.String r6 = r6.name()
            com.xiaomi.push.s$a r2 = r2.a(r5, r6)
            java.lang.String r12 = a(r11, r12, r8)
            com.xiaomi.push.s$a r12 = r2.a(r4, r12)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.s$a r11 = r12.a(r3, r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "app_id"
            com.xiaomi.push.s$a r11 = r11.a(r1, r12)
            goto L78
        Lf5:
            java.lang.String r11 = "RegInfo"
            r0.put(r11, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.i.m1684a(android.content.Context, com.xiaomi.mipush.sdk.e):java.util.HashMap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public static void m1685a(Context context) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a2 = a(e.ASSEMBLE_PUSH_HUAWEI);
        String a3 = a(e.ASSEMBLE_PUSH_FCM);
        if (!StringUtils.isEmpty(sharedPreferences.getString(a2, "")) && StringUtils.isEmpty(sharedPreferences.getString(a3, ""))) {
            z = true;
        }
        if (z) {
            ao.a(context).a(2, a2);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1686a(Context context, e eVar) {
        String a2 = a(eVar);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        com.xiaomi.push.p.a(context.getSharedPreferences("mipush_extra", 0).edit().putString(a2, ""));
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1687a(Context context, e eVar, String str) {
        if (!StringUtils.isEmpty(str)) {
            int a2 = a(context, eVar, str);
            if (a2 == 0) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : do not need to send token");
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : send token upload, check:" + a2);
            a(context, str);
            au a3 = l.a(eVar);
            if (a3 == null) {
                return;
            }
            ao.a(context).a((String) null, a3, eVar, "upload");
        }
    }

    private static synchronized void a(Context context, String str) {
        synchronized (i.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString("syncingToken", str);
            edit.apply();
        }
    }

    public static void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("pushMsg")) {
            return;
        }
        intent.putExtra(PushMessageHelper.KEY_MESSAGE, a(extras.getString("pushMsg")));
    }

    public static void a(String str, int i) {
        MiTinyDataClient.upload("hms_push_error", str, 1L, "error code = " + i);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1688a(Context context) {
        if (context == null) {
            return false;
        }
        return bg.b(context);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1689a(Context context, e eVar) {
        if (l.m1692a(eVar) != null) {
            return az.a(context).a(l.m1692a(eVar).a(), true);
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1690a(e eVar) {
        return eVar == e.ASSEMBLE_PUSH_FTOS || eVar == e.ASSEMBLE_PUSH_FCM;
    }

    public static boolean a(iy iyVar, e eVar) {
        if (iyVar == null || iyVar.m2102a() == null || iyVar.m2102a().m2069a() == null) {
            return false;
        }
        return (eVar == e.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(iyVar.m2102a().m2069a().get("assemble_push_type"));
    }

    public static byte[] a(Context context, iy iyVar, e eVar) {
        if (a(iyVar, eVar)) {
            return bl.m1741a(a(context, eVar));
        }
        return null;
    }

    public static String b(e eVar) {
        return a(eVar) + "_version";
    }

    public static void b(Context context) {
        f.a(context).register();
    }

    public static void b(Context context, e eVar, String str) {
        com.xiaomi.push.ah.a(context).a(new j(str, context, eVar));
    }

    public static String c(e eVar) {
        int i = k.f24328a[eVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "fcm_push_error";
            }
            if (i == 3) {
                return "cos_push_error";
            }
            if (i == 4) {
                return "ftos_push_error";
            }
            return null;
        }
        return "hms_push_error";
    }

    public static void c(Context context) {
        f.a(context).unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context, e eVar, String str) {
        synchronized (i.class) {
            String a2 = a(eVar);
            if (StringUtils.isEmpty(a2)) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(a2, str).putString("last_check_token", b.m1665a(context).m1673c());
            if (m1690a(eVar)) {
                edit.putInt(b(eVar), a());
            }
            edit.putString("syncingToken", "");
            com.xiaomi.push.p.a(edit);
            com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH : update sp file success!  " + str);
        }
    }
}
