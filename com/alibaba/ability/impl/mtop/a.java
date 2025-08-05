package com.alibaba.ability.impl.mtop;

import com.alibaba.ability.e;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1925a;

    static {
        kge.a(935334015);
    }

    public a(Map<String, ? extends Object> abilityData) {
        q.d(abilityData, "abilityData");
        String a2 = e.a(abilityData, MtopJSBridge.MtopJSParam.ACCOUNT_SITE, "");
        q.a((Object) a2);
        this.f1925a = a2;
    }
}
