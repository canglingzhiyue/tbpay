package com.taobao.android.abilityidl.ability;

import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.util.Map;
import tb.kge;
import tb.nog;

/* loaded from: classes4.dex */
public final class ev {

    /* renamed from: a  reason: collision with root package name */
    public String f8853a;
    public String b;
    public Map<String, ? extends Object> c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;
    public int k;
    public Map<String, ? extends Object> l;
    public Map<String, ? extends Object> m;
    public String n;
    public String o;
    public double p;
    public String q;
    public String r;
    public boolean s;
    public Boolean t;

    static {
        kge.a(1514850485);
    }

    public ev() {
        this.f8853a = "";
        this.b = "";
        this.d = "GET";
        this.f = "UNIT_GUIDE";
        this.i = "AUTO_LOGIN_ONLY";
        this.k = 30000;
        this.p = 5000.0d;
        this.q = "ORIGINAL_JSON";
    }

    public ev(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "api", (String) null);
        if (b == null) {
            throw new RuntimeException("api 参数必传！");
        }
        this.f8853a = b;
        String b2 = com.alibaba.ability.e.b(map, "v", (String) null);
        if (b2 == null) {
            throw new RuntimeException("v 参数必传！");
        }
        this.b = b2;
        this.c = com.alibaba.ability.e.c(map, "data");
        String a2 = NextRPCRequestMethod.Companion.a(com.alibaba.ability.e.b(map, "method", "GET"));
        this.d = a2 == null ? "GET" : a2;
        this.e = com.alibaba.ability.e.b(map, "bizID", (String) null);
        String a3 = NextRPCUnit.Companion.a(com.alibaba.ability.e.b(map, nog.PRICE_UNIT, "UNIT_GUIDE"));
        this.f = a3 == null ? "UNIT_GUIDE" : a3;
        boolean z = false;
        Boolean b3 = com.alibaba.ability.e.b(map, "useWua", (Boolean) false);
        this.g = b3 != null ? b3.booleanValue() : false;
        Boolean b4 = com.alibaba.ability.e.b(map, "needLogin", (Boolean) false);
        this.h = b4 != null ? b4.booleanValue() : false;
        String a4 = NextRPCSessionOption.Companion.a(com.alibaba.ability.e.b(map, MtopJSBridge.MtopJSParam.SESSION_OPTION, "AUTO_LOGIN_ONLY"));
        this.i = a4 == null ? "AUTO_LOGIN_ONLY" : a4;
        this.j = com.alibaba.ability.e.b(map, "ttid", (String) null);
        int i = 30000;
        Integer b5 = com.alibaba.ability.e.b(map, "timeout", (Integer) 30000);
        this.k = b5 != null ? b5.intValue() : i;
        this.l = com.alibaba.ability.e.c(map, "extHeaders");
        this.m = com.alibaba.ability.e.c(map, "extQuerys");
        this.n = com.alibaba.ability.e.b(map, MtopJSBridge.MtopJSParam.ACCOUNT_SITE, (String) null);
        this.o = com.alibaba.ability.e.b(map, "topic", (String) null);
        double d = 5000.0d;
        Double b6 = com.alibaba.ability.e.b(map, "prefetchTimeout", Double.valueOf(5000.0d));
        this.p = b6 != null ? b6.doubleValue() : d;
        String a5 = NextRPCResponseType.Companion.a(com.alibaba.ability.e.b(map, "responseType", "ORIGINAL_JSON"));
        this.q = a5 == null ? "ORIGINAL_JSON" : a5;
        this.r = com.alibaba.ability.e.b(map, MtopJSBridge.MtopJSParam.MP_HOST, (String) null);
        Boolean b7 = com.alibaba.ability.e.b(map, MtopJSBridge.MtopJSParam.RETRY_FORBIDDEN, (Boolean) false);
        this.s = b7 != null ? b7.booleanValue() : z;
        this.t = com.alibaba.ability.e.b(map, "enableUpCompress", (Boolean) null);
    }
}
