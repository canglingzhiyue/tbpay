package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;

/* loaded from: classes8.dex */
public class o implements IMediaPlayer.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21945a;
    private IMediaPlayer.h b;

    static {
        kge.a(922056804);
        kge.a(305979072);
    }

    public o(c cVar, IMediaPlayer.h hVar) {
        this.f21945a = cVar;
        this.b = hVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
    public void onPause(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
            return;
        }
        IMediaPlayer.h hVar = this.b;
        if (hVar != null) {
            hVar.onPause(iMediaPlayer);
        }
        c cVar = this.f21945a;
        if (cVar == null) {
            return;
        }
        cVar.g(iMediaPlayer);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.b.equals(((o) obj).b);
        }
        return false;
    }
}
