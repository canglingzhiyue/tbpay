package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class j implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "switch_main_pic";

    /* renamed from: a  reason: collision with root package name */
    private Context f10712a;
    private eyx b;

    static {
        kge.a(-793590104);
        kge.a(1967244270);
    }

    public j(Context context, eyx eyxVar) {
        this.f10712a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        this.b.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, (Object) null);
        return true;
    }
}
