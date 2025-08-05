package com.taobao.android.abilityidl.ability;

import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.kge;

/* loaded from: classes4.dex */
public final class fb {

    /* renamed from: a  reason: collision with root package name */
    public String f8860a;
    public String b;
    public String c;
    public int d;
    public String e;
    public Long f;
    public String g;
    public String h;
    public Map<String, ? extends Object> i;
    public Map<String, ? extends Object> j;

    static {
        kge.a(-1423675499);
    }

    public fb() {
        this.f8860a = "";
        this.b = "";
        this.d = 1000;
        this.e = "GET";
        this.h = "ANY";
    }

    public fb(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "path", (String) null);
        if (b == null) {
            throw new RuntimeException("path 参数必传！");
        }
        this.f8860a = b;
        String b2 = com.alibaba.ability.e.b(map, "url", (String) null);
        if (b2 == null) {
            throw new RuntimeException("url 参数必传！");
        }
        this.b = b2;
        this.c = com.alibaba.ability.e.b(map, "name", (String) null);
        int i = 1000;
        Integer b3 = com.alibaba.ability.e.b(map, "minUpdateInterval", (Integer) 1000);
        this.d = b3 != null ? b3.intValue() : i;
        String a2 = DownloaderRequestType.Companion.a(com.alibaba.ability.e.b(map, "method", "GET"));
        this.e = a2 == null ? "GET" : a2;
        this.f = com.alibaba.ability.e.b(map, "size", (Long) null);
        this.g = com.alibaba.ability.e.b(map, "md5", (String) null);
        String a3 = DownloaderNetworkType.Companion.a(com.alibaba.ability.e.b(map, "networkType", "ANY"));
        this.h = a3 == null ? "ANY" : a3;
        this.i = com.alibaba.ability.e.c(map, "headers");
        this.j = com.alibaba.ability.e.c(map, AgooConstants.MESSAGE_BODY);
    }
}
