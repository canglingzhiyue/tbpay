package com.taobao.taolive.sdk.ui.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class j implements IMediaPlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IMediaPlayer f21936a;
    private c b;

    static {
        kge.a(2006402529);
        kge.a(1033693273);
    }

    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
        } else {
            this.f21936a = iMediaPlayer;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f21936a = null;
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

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6aae7fb", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.r();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.b();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(context);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36ca8c8", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(drawable, z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.j(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer != null) {
            iMediaPlayer.c();
        }
        this.b = null;
        a();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1e0712", new Object[]{this, mediaData, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(mediaData, str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public MediaData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("5cc8f1cb", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.d();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.p(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean cy_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48d38ab4", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.cy_();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.e();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(i, j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(f);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.d(this.f21936a);
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.f();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(this.f21936a);
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.g();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(this.f21936a);
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.i(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(this.f21936a);
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.w();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.e(this.f21936a);
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.i();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.x();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return 0;
        }
        return iMediaPlayer.j();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return 0;
        }
        return iMediaPlayer.k();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.l();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer != null) {
            iMediaPlayer.a(j);
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.c(this.f21936a);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return 0L;
        }
        return iMediaPlayer.m();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return 0L;
        }
        return iMediaPlayer.n();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.o();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.c(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.p();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e824979", new Object[]{this, iVar});
            return;
        }
        p pVar = new p(this.b, iVar);
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(pVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80039e", new Object[]{this, dVar});
            return;
        }
        l lVar = new l(this.b, dVar);
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(lVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8077fd", new Object[]{this, eVar});
            return;
        }
        m mVar = new m(this.b, eVar);
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(mVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8160bb", new Object[]{this, gVar});
            return;
        }
        n nVar = new n(this.b, gVar);
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(nVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e82bdd8", new Object[]{this, jVar});
            return;
        }
        q qVar = new q(this.b, jVar);
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(qVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e81d51a", new Object[]{this, hVar});
            return;
        }
        o oVar = new o(this.b, hVar);
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(oVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca848472", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        k kVar = new k(this.b, onAudioFocusChangeListener, this.f21936a);
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(kVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(tLiveMsg);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.c(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.c(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.d(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.d(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.e(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.f(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.g(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.d(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.e(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.f(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.j(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.k(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.z();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.l(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.A();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.B();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.g(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.q();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.h(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(hashMap);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.h(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.i(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.t();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public IMediaPlayer.c u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.c) ipChange.ipc$dispatch("e534b3b1", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.u();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.e(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public Bitmap bG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9ad47c3f", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.bG_();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.v();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd73caaf", new Object[]{this, aspectRatio});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(aspectRatio);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(context);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.m(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80ec5c", new Object[]{this, fVar});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(fVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.y();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(hashMap);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(map);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public HashMap<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3dc76df", new Object[]{this, map});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.b(map);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(List<MediaData.QualityLiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(list);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(List<MediaData.QualityLiveItem> list, IMediaPlayer.UpdataUrlListMode updataUrlListMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feedbc8", new Object[]{this, list, updataUrlListMode});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(list, updataUrlListMode);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public List<s> n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3971b0e8", new Object[]{this, new Boolean(z)});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.n(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public s C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("de6a8e25", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.C();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(i, str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7f1ae0", new Object[]{this, bVar});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(bVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.D();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean cA_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e94427ec", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.cA_();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.o(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public float dX_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4569d962", new Object[]{this})).floatValue();
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return -1.0f;
        }
        return iMediaPlayer.dX_();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public IMediaPlayer.WarmState h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.WarmState) ipChange.ipc$dispatch("6b283b75", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer != null) {
            return iMediaPlayer.h();
        }
        return IMediaPlayer.WarmState.NORMAL;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.f21936a;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.q(z);
    }
}
