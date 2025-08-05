package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;

/* loaded from: classes8.dex */
public class l implements IMediaPlayer.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21938a;
    private IMediaPlayer.d b;

    static {
        kge.a(1314324742);
        kge.a(-553593734);
    }

    public l(c cVar, IMediaPlayer.d dVar) {
        this.f21938a = cVar;
        this.b = dVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            return;
        }
        IMediaPlayer.d dVar = this.b;
        if (dVar != null) {
            dVar.onCompletion(iMediaPlayer);
        }
        c cVar = this.f21938a;
        if (cVar == null) {
            return;
        }
        cVar.b(iMediaPlayer);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.b.equals(((l) obj).b);
        }
        return false;
    }
}
