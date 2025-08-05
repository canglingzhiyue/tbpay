package com.alibaba.fastjson2.time;

import com.alibaba.fastjson2.util.DateUtils;
import java.util.TimeZone;
import tb.kge;

/* loaded from: classes2.dex */
public final class e {
    public static final e OFFSET_8_ZONE_ID;
    public static final String OFFSET_8_ZONE_ID_NAME = "+08:00";
    public static final e SHANGHAI_ZONE_ID;
    public static final String SHANGHAI_ZONE_ID_NAME = "Asia/Shanghai";

    /* renamed from: a  reason: collision with root package name */
    public static TimeZone f3023a;
    public static e b;
    public static e c;
    public final TimeZone d;
    public final String e;

    static {
        kge.a(-1399114265);
        OFFSET_8_ZONE_ID = a(OFFSET_8_ZONE_ID_NAME);
        TimeZone timeZone = TimeZone.getDefault();
        f3023a = timeZone;
        b = a(timeZone);
        SHANGHAI_ZONE_ID = SHANGHAI_ZONE_ID_NAME.equals(b.e) ? b : new e(TimeZone.getTimeZone(SHANGHAI_ZONE_ID_NAME));
        c = a("Z");
    }

    private e(TimeZone timeZone) {
        this.d = timeZone;
        this.e = timeZone.getID();
    }

    public static e a(String str) {
        if (str.equals(SHANGHAI_ZONE_ID_NAME)) {
            return SHANGHAI_ZONE_ID;
        }
        char charAt = str.charAt(0);
        if (charAt == '+' || charAt == '-') {
            str = "GMT" + str;
        } else if (charAt == 'Z' && str.length() == 1) {
            str = com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC;
        }
        return a(TimeZone.getTimeZone(str));
    }

    public static e a(TimeZone timeZone) {
        return new e(timeZone);
    }

    public int a(a aVar) {
        e eVar = SHANGHAI_ZONE_ID;
        return (this == eVar || this.e.equals(eVar.e)) ? DateUtils.a(aVar.b) : this.d.getOffset(aVar.b * 1000) / 1000;
    }

    public int a(c cVar) {
        return this.d.getOffset(0, cVar.f3021a.f3020a, cVar.f3021a.b - 1, cVar.f3021a.c, 1, cVar.b.c * 10000) / 1000;
    }
}
