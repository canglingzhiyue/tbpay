package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.h;
import com.huawei.hms.framework.network.grs.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class a {
    private static final String f = "a";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, Map<String, String>>> f7417a = new ConcurrentHashMap(16);
    private final Map<String, Long> b = new ConcurrentHashMap(16);
    private final c c;
    private final c d;
    private final h e;

    public a(c cVar, c cVar2, h hVar) {
        this.d = cVar2;
        this.c = cVar;
        this.e = hVar;
        this.e.a(this);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l = this.b.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l)) {
            bVar.a(2);
            return;
        }
        if (e.a(l, 300000L)) {
            this.e.a(new com.huawei.hms.framework.network.grs.g.k.c(grsBaseInfo, context), null, str, this.d);
        }
        bVar.a(1);
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.b.get(str), 300000L)) {
            this.e.a(new com.huawei.hms.framework.network.grs.g.k.c(grsBaseInfo, context), null, null, this.d);
        }
    }

    public c a() {
        return this.c;
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        Map<String, Map<String, String>> map = this.f7417a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        a(grsBaseInfo, bVar, context, str);
        return map.get(str);
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        c cVar = this.c;
        cVar.b(grsParasKey + "time", "0");
        Map<String, Long> map = this.b;
        map.remove(grsParasKey + "time");
        this.f7417a.remove(grsParasKey);
        this.e.a(grsParasKey);
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, com.huawei.hms.framework.network.grs.g.k.c cVar) {
        if (dVar.f() == 2) {
            Logger.w(f, "update cache from server failed");
        } else if (cVar.d().size() != 0) {
            this.c.b("geoipCountryCode", dVar.j());
            this.c.b("geoipCountryCodetime", dVar.a());
        } else {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.m()) {
                this.f7417a.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.c.a(grsParasKey, "")));
            } else {
                this.c.b(grsParasKey, dVar.j());
                this.f7417a.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
            }
            if (!StringUtils.isEmpty(dVar.e())) {
                c cVar2 = this.c;
                cVar2.b(grsParasKey + HeaderConstant.HEADER_KEY_ETAG, dVar.e());
            }
            c cVar3 = this.c;
            cVar3.b(grsParasKey + "time", dVar.a());
            this.b.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        }
    }

    public h b() {
        return this.e;
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String a2 = this.c.a(grsParasKey, "");
        c cVar = this.c;
        String a3 = cVar.a(grsParasKey + "time", "0");
        long j = 0;
        if (!StringUtils.isEmpty(a3) && a3.matches("\\d+")) {
            try {
                j = Long.parseLong(a3);
            } catch (NumberFormatException e) {
                Logger.w(f, "convert urlParamKey from String to Long catch NumberFormatException.", e);
            }
        }
        this.f7417a.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a2));
        this.b.put(grsParasKey, Long.valueOf(j));
        a(grsBaseInfo, grsParasKey, context);
    }

    public c c() {
        return this.d;
    }
}
