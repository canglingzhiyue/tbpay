package com.taobao.tbpoplayer.nativerender;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;

/* compiled from: lambda */
/* renamed from: com.taobao.tbpoplayer.nativerender.-$$Lambda$k$bcpZQmT_8hVvNu1G_wP2EmPwajw  reason: invalid class name */
/* loaded from: classes8.dex */
public final /* synthetic */ class $$Lambda$k$bcpZQmT_8hVvNu1G_wP2EmPwajw implements NetworkCallBack.FinishListener {
    public static final /* synthetic */ $$Lambda$k$bcpZQmT_8hVvNu1G_wP2EmPwajw INSTANCE = new $$Lambda$k$bcpZQmT_8hVvNu1G_wP2EmPwajw();

    private /* synthetic */ $$Lambda$k$bcpZQmT_8hVvNu1G_wP2EmPwajw() {
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public final void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        k.a(finishEvent, obj);
    }
}
