package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;

/* loaded from: classes8.dex */
public class q implements IMediaPlayer.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21956a;
    private IMediaPlayer.j b;

    static {
        kge.a(1478360952);
        kge.a(-1982836436);
    }

    public q(c cVar, IMediaPlayer.j jVar) {
        this.f21956a = cVar;
        this.b = jVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
            return;
        }
        IMediaPlayer.j jVar = this.b;
        if (jVar != null) {
            jVar.onStart(iMediaPlayer);
        }
        c cVar = this.f21956a;
        if (cVar == null) {
            return;
        }
        cVar.f(iMediaPlayer);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.b.equals(((q) obj).b);
        }
        return false;
    }
}
