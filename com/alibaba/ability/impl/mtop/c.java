package com.alibaba.ability.impl.mtop;

import com.alibaba.ability.e;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nog;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes2.dex */
public final class c {
    public Boolean A;
    public Boolean B;
    public Boolean C;

    /* renamed from: a  reason: collision with root package name */
    public String f1926a;
    public String b;
    public Boolean c;
    public String d;
    public Map<String, ? extends Object> e;
    public String f;
    public String g;
    public Boolean h;
    public int i;
    public Map<String, ? extends Object> j;
    public Map<String, ? extends Object> k;
    public String l;
    public String m;
    public String n;
    public String o;
    public long p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Map<String, ? extends Object> u;
    public Boolean v;
    public Boolean w;
    public String x;
    public String y;
    public Boolean z;

    static {
        kge.a(-173299289);
    }

    public c(Map<String, ? extends Object> abilityData) {
        q.d(abilityData, "abilityData");
        String a2 = e.a(abilityData, "api", "");
        q.a((Object) a2);
        this.f1926a = a2;
        this.b = e.a(abilityData, "v", "*");
        boolean z = false;
        this.c = e.a(abilityData, "needLogin", (Boolean) false);
        String str = "AUTO_LOGIN_ONLY";
        String a3 = e.a(abilityData, MtopJSBridge.MtopJSParam.SESSION_OPTION, str);
        this.d = !q.a((Object) a3, (Object) "AutoLoginOnly") ? a3 : str;
        this.e = e.a(abilityData, "data");
        this.f = e.a(abilityData, "method", "GET");
        String a4 = e.a(abilityData, "responseType", "noValue");
        String str2 = "originaljson";
        if (a4 != null) {
            int hashCode = a4.hashCode();
            if (hashCode != 2286824) {
                if (hashCode == 713924246) {
                    a4.equals("ORIGINAL_JSON");
                } else if (hashCode == 2101412912 && a4.equals("noValue")) {
                    str2 = e.a(abilityData, "dataType", str2);
                }
            } else if (a4.equals("JSON")) {
                str2 = "json";
            }
        }
        this.g = str2;
        Boolean a5 = e.a(abilityData, "useWua", (Boolean) null);
        if (a5 != null) {
            z = a5.booleanValue();
        } else {
            Integer a6 = e.a(abilityData, MtopJSBridge.MtopJSParam.SEC_TYPE, (Integer) 0);
            q.a(a6);
            if (a6.intValue() > 0) {
                z = true;
            }
        }
        this.h = Boolean.valueOf(z);
        Integer a7 = e.a(abilityData, "timeout", (Integer) 30000);
        q.a(a7);
        this.i = a7.intValue();
        this.j = e.a(abilityData, "extHeaders");
        this.k = e.a(abilityData, "extQuerys");
        this.l = e.a(abilityData, "ttid", "");
        this.m = e.a(abilityData, "pageUrl", "");
        String a8 = e.a(abilityData, "userAgent", (String) null);
        this.n = a8 == null ? e.a(abilityData, "xUserAgent", "") : a8;
        this.o = e.a(abilityData, MtopJSBridge.MtopJSParam.ACCOUNT_SITE, (String) null);
        Integer a9 = e.a(abilityData, "prefetchTimeout", (Integer) 5000);
        q.a(a9);
        this.p = a9.intValue();
        this.q = e.a(abilityData, "bizID", "");
        String a10 = e.a(abilityData, nog.PRICE_UNIT, (String) null);
        this.r = a10 == null ? e.a(abilityData, "unitStrategy", "UNIT_GUIDE") : a10;
        this.s = e.a(abilityData, "topic", "");
        this.t = e.a(abilityData, "prefetchEnable", (Boolean) false);
        this.u = e.a(abilityData, "loadingConfig");
        this.v = e.a(abilityData, "useHttps", (Boolean) true);
        this.w = e.a(abilityData, MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, (Boolean) false);
        this.x = e.a(abilityData, MtopJSBridge.MtopJSParam.MP_HOST, "");
        this.y = e.a(abilityData, "userInfo", "");
        this.z = e.a(abilityData, MtopJSBridge.MtopJSParam.RETRY_FORBIDDEN, (Boolean) false);
        this.A = e.a(abilityData, MtopJSBridge.MtopJSParam.ALLOW_SWITCH_TO_POST, (Boolean) false);
        this.B = e.a(abilityData, "droidParseAsync", (Boolean) true);
        this.C = e.a(abilityData, "enableUpCompress", (Boolean) null);
    }
}
