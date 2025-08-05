package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.eyx;
import tb.fxa;
import tb.kge;

/* loaded from: classes4.dex */
public class h extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_DCEVENT;

    /* renamed from: a  reason: collision with root package name */
    private Context f10589a;
    private eyx b;
    private TTDContentController c;
    private i d;

    static {
        kge.a(-1561420082);
        DX_EVENT_DCEVENT = fxa.a("dcEvent");
    }

    public h(Context context, eyx eyxVar, TTDContentController tTDContentController, i iVar) {
        this.f10589a = context;
        this.b = eyxVar;
        this.c = tTDContentController;
        this.d = iVar;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            ContentDXHandler.handleEvent(this.f10589a, this.b, this.c, this.d, objArr);
        }
    }
}
