package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ch implements XMPushService.n {

    /* renamed from: a  reason: collision with root package name */
    private static Context f24693a;

    /* renamed from: a  reason: collision with other field name */
    private static final boolean f993a = Log.isLoggable("UNDatas", 3);

    /* renamed from: a  reason: collision with other field name */
    private static final Map<Integer, Map<String, List<String>>> f992a = new HashMap();

    public ch(Context context) {
        f24693a = context;
    }

    private static jb a(String str, String str2, String str3, String str4) {
        jb jbVar = new jb();
        if (str3 != null) {
            jbVar.c(str3);
        }
        if (str != null) {
            jbVar.b(str);
        }
        if (str2 != null) {
            jbVar.a(str2);
        }
        if (str4 != null) {
            jbVar.d(str4);
        }
        jbVar.a(false);
        return jbVar;
    }

    private static void a(Context context, jb jbVar) {
        if (f993a) {
            com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload message notification:" + jbVar);
        }
        com.xiaomi.push.ah.a(context).a(new ci(jbVar));
    }

    private static void b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f992a);
        if (hashMap.size() > 0) {
            for (Integer num : hashMap.keySet()) {
                Map map = (Map) hashMap.get(num);
                if (map != null && map.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map.keySet()) {
                        sb.append(str);
                        sb.append(":");
                        List list = (List) map.get(str);
                        if (!com.xiaomi.push.s.a(list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(",");
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(";");
                    }
                    jb a2 = a(null, bc.a(), im.NotificationRemoved.f538a, null);
                    a2.a("removed_reason", String.valueOf(num));
                    a2.a("all_delete_msgId_appId", sb.toString());
                    com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    a(f24693a, a2);
                }
                f992a.remove(num);
            }
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a */
    public void mo2024a() {
        if (f992a.size() > 0) {
            synchronized (f992a) {
                b();
            }
        }
    }
}
