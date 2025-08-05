package com.alibaba.ability.impl.audio;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f1867a;
    public final String b;
    public final String c;
    public final String d;
    public final JSONObject e;

    static {
        kge.a(-1727643888);
    }

    public i(Map<String, ? extends Object> data) {
        q.d(data, "data");
        String a2 = com.alibaba.ability.e.a(data, "src", (String) null);
        if (a2 == null) {
            throw new RuntimeException("src invalid");
        }
        this.f1867a = a2;
        String a3 = com.alibaba.ability.e.a(data, "title", (String) null);
        if (a3 == null) {
            throw new RuntimeException("title invalid");
        }
        this.b = a3;
        String a4 = com.alibaba.ability.e.a(data, "subtitle", "");
        q.a((Object) a4);
        this.c = a4;
        String a5 = com.alibaba.ability.e.a(data, "coverImageURL", (String) null);
        if (a5 == null) {
            throw new RuntimeException("coverImageURL invalid");
        }
        this.d = a5;
        Map<String, Object> a6 = com.alibaba.ability.e.a(data, "extraInfo");
        this.e = (JSONObject) (!(a6 instanceof JSONObject) ? null : a6);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : new JSONObject(ai.b(kotlin.j.a("src", this.f1867a), kotlin.j.a("title", this.b), kotlin.j.a("subtitle", this.c), kotlin.j.a("coverImageURL", this.d), kotlin.j.a("extraInfo", this.e)));
    }
}
