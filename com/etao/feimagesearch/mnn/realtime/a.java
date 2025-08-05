package com.etao.feimagesearch.mnn.realtime;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONArray f6784a;

    static {
        kge.a(-2007858108);
    }

    public a(JSONArray algoMsgArray) {
        q.c(algoMsgArray, "algoMsgArray");
        this.f6784a = algoMsgArray;
    }

    public final JSONArray a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this}) : this.f6784a;
    }
}
