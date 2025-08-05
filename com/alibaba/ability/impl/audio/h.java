package com.alibaba.ability.impl.audio;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.collections.ai;
import tb.kge;

/* loaded from: classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public l f1866a;
    public i b;

    static {
        kge.a(-1100598869);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        Pair[] pairArr = new Pair[2];
        i iVar = this.b;
        JSONObject jSONObject = null;
        pairArr[0] = kotlin.j.a("mediaInfo", iVar != null ? iVar.a() : null);
        l lVar = this.f1866a;
        if (lVar != null) {
            jSONObject = l.a(lVar, false, 1, null);
        }
        pairArr[1] = kotlin.j.a("statusInfo", jSONObject);
        return new JSONObject(ai.b(pairArr));
    }
}
