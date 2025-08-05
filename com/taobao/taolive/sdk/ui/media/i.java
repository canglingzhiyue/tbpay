package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.pav;

/* loaded from: classes8.dex */
public class i implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f21935a;
    private c b;

    static {
        kge.a(-1649202275);
        kge.a(1230883219);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb6cdf4", new Object[]{this, bVar});
        } else {
            this.f21935a = bVar;
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb74253", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.b
    public IMediaPlayer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer) ipChange.ipc$dispatch("d9b93764", new Object[]{this});
        }
        b bVar = this.f21935a;
        if (bVar == null) {
            return null;
        }
        IMediaPlayer a2 = bVar.a();
        if (!pav.INSTANCE.a()) {
            return a2;
        }
        j jVar = new j();
        jVar.a(a2);
        jVar.a(this.b);
        return jVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.b
    public IMediaPlayer a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer) ipChange.ipc$dispatch("45d0dc61", new Object[]{this, hashMap});
        }
        b bVar = this.f21935a;
        if (bVar == null) {
            return null;
        }
        IMediaPlayer a2 = bVar.a(hashMap);
        if (!pav.INSTANCE.a()) {
            return a2;
        }
        j jVar = new j();
        jVar.a(a2);
        jVar.a(this.b);
        return jVar;
    }
}
