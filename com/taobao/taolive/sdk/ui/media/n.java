package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;

/* loaded from: classes8.dex */
public class n implements IMediaPlayer.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21944a;
    private IMediaPlayer.g b;

    static {
        kge.a(-515143308);
        kge.a(-449281332);
    }

    public n(c cVar, IMediaPlayer.g gVar) {
        this.f21944a = cVar;
        this.b = gVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        IMediaPlayer.g gVar = this.b;
        if (gVar != null) {
            z = gVar.onInfo(iMediaPlayer, j, j2, j3, obj);
        }
        c cVar = this.f21944a;
        if (cVar != null) {
            cVar.a(iMediaPlayer, j, j2, j3, obj);
        }
        return z;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.b.equals(((n) obj).b);
        }
        return false;
    }
}
