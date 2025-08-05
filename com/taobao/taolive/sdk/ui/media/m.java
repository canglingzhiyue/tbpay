package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import tb.kge;

/* loaded from: classes8.dex */
public class m implements IMediaPlayer.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21939a;
    private IMediaPlayer.e b;

    static {
        kge.a(1396191890);
        kge.a(1292720338);
    }

    public m(c cVar, IMediaPlayer.e eVar) {
        this.f21939a = cVar;
        this.b = eVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        IMediaPlayer.e eVar = this.b;
        if (eVar != null) {
            z = eVar.onError(iMediaPlayer, i, i2);
        }
        c cVar = this.f21939a;
        if (cVar != null) {
            cVar.a(iMediaPlayer, i, i2);
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
        if (obj instanceof m) {
            return this.b.equals(((m) obj).b);
        }
        return false;
    }
}
