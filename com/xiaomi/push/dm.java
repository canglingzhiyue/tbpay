package com.xiaomi.push;

import android.content.Context;
import com.alibaba.evo.internal.database.ExperimentDO;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class dm {

    /* renamed from: a  reason: collision with root package name */
    private final String f24424a = "power_consumption_stats";
    private final String b = "off_up_ct";
    private final String c = "off_dn_ct";
    private final String d = "off_ping_ct";
    private final String e = "off_pong_ct";
    private final String f = "off_dur";
    private final String g = "on_up_ct";
    private final String h = "on_dn_ct";
    private final String i = "on_ping_ct";
    private final String j = "on_pong_ct";
    private final String k = "on_dur";
    private final String l = "start_time";
    private final String m = ExperimentDO.COLUMN_END_TIME;
    private final String n = "xmsf_vc";
    private final String o = "android_vc";
    private final String p = "uuid";

    public void a(Context context, dl dlVar) {
        if (dlVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("off_up_ct", Integer.valueOf(dlVar.a()));
        hashMap.put("off_dn_ct", Integer.valueOf(dlVar.b()));
        hashMap.put("off_ping_ct", Integer.valueOf(dlVar.c()));
        hashMap.put("off_pong_ct", Integer.valueOf(dlVar.d()));
        hashMap.put("off_dur", Long.valueOf(dlVar.m1817a()));
        hashMap.put("on_up_ct", Integer.valueOf(dlVar.e()));
        hashMap.put("on_dn_ct", Integer.valueOf(dlVar.f()));
        hashMap.put("on_ping_ct", Integer.valueOf(dlVar.g()));
        hashMap.put("on_pong_ct", Integer.valueOf(dlVar.h()));
        hashMap.put("on_dur", Long.valueOf(dlVar.m1818b()));
        hashMap.put("start_time", Long.valueOf(dlVar.m1819c()));
        hashMap.put(ExperimentDO.COLUMN_END_TIME, Long.valueOf(dlVar.m1820d()));
        hashMap.put("xmsf_vc", Integer.valueOf(dlVar.i()));
        hashMap.put("android_vc", Integer.valueOf(dlVar.j()));
        hashMap.put("uuid", com.xiaomi.push.service.v.m2361a(context));
        fr.a().a("power_consumption_stats", hashMap);
    }
}
