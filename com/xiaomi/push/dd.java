package com.xiaomi.push;

import android.content.Context;
import com.taobao.accs.utl.BaseMonitor;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public class dd {

    /* renamed from: a  reason: collision with root package name */
    private final String f24416a = "disconnection_event";
    private final String b = "count";
    private final String c = "host";
    private final String d = "network_state";
    private final String e = "reason";
    private final String f = BaseMonitor.COUNT_PING_INTERVAL;
    private final String g = "network_type";
    private final String h = "wifi_digest";
    private final String i = "duration";
    private final String j = "disconnect_time";
    private final String k = "connect_time";
    private final String l = "xmsf_vc";
    private final String m = "android_vc";
    private final String n = "uuid";

    public void a(Context context, List<dc> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        db.a("upload size = " + list.size());
        String m2361a = com.xiaomi.push.service.v.m2361a(context);
        for (dc dcVar : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("count", Integer.valueOf(dcVar.a()));
            hashMap.put("host", dcVar.m1807a());
            hashMap.put("network_state", Integer.valueOf(dcVar.b()));
            hashMap.put("reason", Integer.valueOf(dcVar.c()));
            hashMap.put(BaseMonitor.COUNT_PING_INTERVAL, Long.valueOf(dcVar.m1806a()));
            hashMap.put("network_type", Integer.valueOf(dcVar.d()));
            hashMap.put("wifi_digest", dcVar.m1809b());
            hashMap.put("connected_network_type", Integer.valueOf(dcVar.e()));
            hashMap.put("duration", Long.valueOf(dcVar.m1808b()));
            hashMap.put("disconnect_time", Long.valueOf(dcVar.m1810c()));
            hashMap.put("connect_time", Long.valueOf(dcVar.m1811d()));
            hashMap.put("xmsf_vc", Integer.valueOf(dcVar.f()));
            hashMap.put("android_vc", Integer.valueOf(dcVar.g()));
            hashMap.put("uuid", m2361a);
            fr.a().a("disconnection_event", hashMap);
        }
    }
}
