package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;

/* loaded from: classes8.dex */
public class p implements IMediaPlayer.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21946a;
    private IMediaPlayer.i b;

    static {
        kge.a(-1331521595);
        kge.a(-2089353637);
    }

    public p(c cVar, IMediaPlayer.i iVar) {
        this.f21946a = cVar;
        this.b = iVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
            return;
        }
        IMediaPlayer.i iVar = this.b;
        if (iVar != null) {
            iVar.onPrepared(iMediaPlayer);
        }
        c cVar = this.f21946a;
        if (cVar == null) {
            return;
        }
        cVar.h(iMediaPlayer);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.b.equals(((p) obj).b);
        }
        return false;
    }
}
