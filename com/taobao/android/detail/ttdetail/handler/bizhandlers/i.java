package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class i implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "donate";

    /* renamed from: a  reason: collision with root package name */
    private Context f10711a;
    private eyx b;

    static {
        kge.a(1119515948);
        kge.a(1967244270);
    }

    public i(Context context, eyx eyxVar) {
        this.f10711a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        this.b.c().a(w.a("BUYNOW", (String) null), runtimeAbilityParamArr);
        return true;
    }
}
