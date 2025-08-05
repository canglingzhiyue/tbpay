package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fz {

    /* renamed from: a  reason: collision with root package name */
    public String f8879a;
    public int b;
    public String c;
    public ErrorViewWidgetRequestError d;
    public String e;
    public String f;

    static {
        kge.a(803847674);
    }

    public fz() {
        this.d = new ErrorViewWidgetRequestError();
    }

    public fz(Map<String, ? extends Object> map) {
        this();
        this.f8879a = com.alibaba.ability.e.b(map, "topic", (String) null);
        Integer b = com.alibaba.ability.e.b(map, "bottomMargin", (Integer) null);
        if (b == null) {
            throw new RuntimeException("bottomMargin 参数必传！");
        }
        this.b = b.intValue();
        this.c = ErrorViewWidgetButtonStyle.Companion.a(com.alibaba.ability.e.b(map, "buttonStyle", (String) null));
        if (map == null || !map.containsKey("requestError")) {
            throw new RuntimeException("requestError 参数必传！");
        }
        this.d = new ErrorViewWidgetRequestError(com.alibaba.ability.e.c(map, "requestError"));
        this.e = com.alibaba.ability.e.b(map, "title", (String) null);
        this.f = com.alibaba.ability.e.b(map, "refreshButtonTitle", (String) null);
    }
}
