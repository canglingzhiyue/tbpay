package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class dw {

    /* renamed from: a  reason: collision with root package name */
    public String f8828a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;
    public Map<String, ? extends Object> i;

    static {
        kge.a(-1872940588);
    }

    public dw() {
        this.f8828a = "";
        this.b = "";
        this.c = "";
    }

    public dw(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "type", (String) null);
        if (b == null) {
            throw new RuntimeException("type 参数必传！");
        }
        this.f8828a = b;
        String b2 = com.alibaba.ability.e.b(map, "layerType", (String) null);
        if (b2 == null) {
            throw new RuntimeException("layerType 参数必传！");
        }
        this.b = b2;
        String b3 = com.alibaba.ability.e.b(map, "sceneCheck", (String) null);
        if (b3 == null) {
            throw new RuntimeException("sceneCheck 参数必传！");
        }
        this.c = b3;
        this.d = com.alibaba.ability.e.b(map, "cdnId", (String) null);
        this.e = com.alibaba.ability.e.b(map, "pageId", (String) null);
        this.f = com.alibaba.ability.e.b(map, "url", (String) null);
        this.g = com.alibaba.ability.e.b(map, "embed", (Boolean) null);
        this.h = com.alibaba.ability.e.b(map, "actionCallBack", (Boolean) null);
        this.i = com.alibaba.ability.e.c(map, "style");
    }
}
