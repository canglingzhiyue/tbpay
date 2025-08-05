package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fa {

    /* renamed from: a  reason: collision with root package name */
    public String f8859a;
    public String b;
    public String c;
    public Boolean d;
    public String e;
    public Boolean f;
    public String g;
    public Boolean h;
    public Boolean i;
    public String j;
    public String k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Boolean o;
    public String p;
    public Boolean q;

    static {
        kge.a(-1348646855);
    }

    public fa() {
    }

    public fa(Map<String, ? extends Object> map) {
        this();
        this.f8859a = com.alibaba.ability.e.b(map, "title", (String) null);
        this.b = com.alibaba.ability.e.b(map, "titleImage", (String) null);
        this.c = com.alibaba.ability.e.b(map, "titleColor", (String) null);
        this.d = com.alibaba.ability.e.b(map, "inheritDocumentTitle", (Boolean) null);
        this.e = com.alibaba.ability.e.b(map, "navBarBgColor", (String) null);
        this.f = com.alibaba.ability.e.b(map, "navBarImmersive", (Boolean) null);
        this.g = com.alibaba.ability.e.b(map, "navBarTheme", (String) null);
        this.h = com.alibaba.ability.e.b(map, "navBarHide", (Boolean) null);
        this.i = com.alibaba.ability.e.b(map, "statusBarHide", (Boolean) null);
        this.j = com.alibaba.ability.e.b(map, "pageBgColor", (String) null);
        this.k = com.alibaba.ability.e.b(map, "orientation", (String) null);
        this.l = com.alibaba.ability.e.b(map, "disableSwipeBack", (Boolean) null);
        this.m = com.alibaba.ability.e.b(map, "disablePageBounce", (Boolean) null);
        this.n = com.alibaba.ability.e.b(map, "hideHomeIndicator", (Boolean) null);
        this.o = com.alibaba.ability.e.b(map, "deferScreenEdgesGesture", (Boolean) null);
        this.p = com.alibaba.ability.e.b(map, "navigationBarTitleText", (String) null);
        this.q = com.alibaba.ability.e.b(map, "navigationBarHide", (Boolean) null);
    }
}
