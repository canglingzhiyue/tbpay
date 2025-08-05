package com.taobao.tbpoplayer.adapter;

import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;

/* compiled from: lambda */
/* renamed from: com.taobao.tbpoplayer.adapter.-$$Lambda$g$onAHCXa6_NcY7mwfO95cKl-7WTI  reason: invalid class name */
/* loaded from: classes8.dex */
public final /* synthetic */ class $$Lambda$g$onAHCXa6_NcY7mwfO95cKl7WTI implements MtopCallback.MtopFinishListener {
    public static final /* synthetic */ $$Lambda$g$onAHCXa6_NcY7mwfO95cKl7WTI INSTANCE = new $$Lambda$g$onAHCXa6_NcY7mwfO95cKl7WTI();

    private /* synthetic */ $$Lambda$g$onAHCXa6_NcY7mwfO95cKl7WTI() {
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
    public final void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
        g.a(mtopFinishEvent, obj);
    }
}
