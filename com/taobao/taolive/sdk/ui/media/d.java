package com.taobao.taolive.sdk.ui.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.mute.a;
import com.uc.webview.export.media.CommandID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ozq;
import tb.ozs;
import tb.pmd;
import tb.pqi;
import tb.pqj;
import tb.sst;

/* loaded from: classes8.dex */
public class d implements IMediaPlayer, IMediaPlayer.e, ozq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CUSTOMIZE_SO_LOAD_FAILED = -77700001;
    public static final int ERROR_REMOTE_SO_NOT_LOAD = -70000;
    public static final int SOURCE_BY_TOKEN = 0;
    public static final int SOURCE_BY_TOPIC_ID = 1;
    public static final int SOURCE_NEW = 2;
    public FrameLayout b;
    public IMediaPlayer c;
    public Context d;
    public com.taobao.taolive.sdk.playcontrol.observe.a g;
    private boolean h;
    private a i;
    private MediaData j;
    private String k;
    public List<IMediaPlayer.e> e = new CopyOnWriteArrayList();
    private HashMap<String, String> m = new HashMap<>();
    private Random n = new Random();

    /* renamed from: a  reason: collision with root package name */
    public Handler f21925a = new Handler(Looper.getMainLooper());
    public com.taobao.taolive.sdk.ui.media.mute.a f = new com.taobao.taolive.sdk.ui.media.mute.a();
    private String l = O();

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-1312912457);
        kge.a(1033693273);
        kge.a(1292720338);
        kge.a(1650324184);
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4284fc4", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ void a(d dVar, ozs ozsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec14b63a", new Object[]{dVar, ozsVar});
        } else {
            dVar.a(ozsVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public /* synthetic */ View r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aae7fb", new Object[]{this}) : G();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        k("createInstance");
        this.b = new FrameLayout(context);
        this.d = context;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enableOpenUseShortAudioFocus", String.valueOf(sst.a()));
        this.c = pmd.a().b().a(hashMap);
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(context);
        this.f.a(this.c);
        this.b.addView(this.c.r(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k("initPlayer isFetchSoReady " + com.taobao.taobaoavsdk.c.a());
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.a(this);
            N();
        }
        this.f.a();
        com.taobao.taobaoavsdk.c.a(this);
        this.h = false;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        k("unInitPlayer");
        com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.g;
        if (aVar != null) {
            aVar.j();
        }
        this.f.b();
        com.taobao.taobaoavsdk.c.b(this);
        this.h = false;
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        s();
        this.e.clear();
        this.i = null;
        this.j = null;
        this.k = null;
    }

    private void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        this.f.c();
        com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.g;
        if (aVar != null) {
            aVar.i();
        }
        String P = P();
        k("onStartPlay playToken = " + P);
    }

    public void a(com.taobao.taolive.sdk.playcontrol.observe.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5edf8658", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf79ca55", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.h;
    }

    public void e_(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838d82d3", new Object[]{this, new Boolean(z)});
        } else {
            this.f.a(z);
        }
    }

    public void f_(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b873be14", new Object[]{this, new Boolean(z)});
        } else {
            this.f.b(z);
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
        } else {
            this.f.d(z);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.p(z);
        }
        k("setForceUseSurfaceView = " + z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean cy_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48d38ab4", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.cy_();
    }

    @Override // tb.ozq
    public void onFetchFinished(final ozs ozsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcb793c", new Object[]{this, ozsVar});
        } else if (ozsVar == null) {
        } else {
            com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "onFetchFinished isAllReady isRemoteSoError = " + this.h + " isAllReady = " + ozsVar.a() + " mMediaPlayer = " + this.c);
            this.f21925a.post(new Runnable() { // from class: com.taobao.taolive.sdk.ui.media.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        d.a(d.this, ozsVar);
                    }
                }
            });
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else if (this.c == null) {
        } else {
            if (com.taobao.taolive.sdk.utils.o.p()) {
                HashMap hashMap = new HashMap();
                hashMap.put("__enAutoPlayForBackground", "0");
                this.c.a((Map<String, String>) hashMap);
            }
            this.c.j(str);
        }
    }

    public ViewGroup G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("17367907", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.b();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36ca8c8", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(drawable, z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        k("destroy");
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.c();
        }
        E();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1e0712", new Object[]{this, mediaData, str});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "setDataSource url = " + str + " mediaData = " + mediaData);
        this.j = mediaData;
        this.k = str;
        if (mediaData != null) {
            pqi.a().b("setDataSource:MediaData:", pqj.a(mediaData));
        } else {
            pqi.a().b("setDataSource:Url:", str);
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.d();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(i, j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.c(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        k(CommandID.prepareAsync);
        IMediaPlayer iMediaPlayer = this.c;
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
        k("start");
        a();
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.g();
        }
        L();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    @Deprecated
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        k("startByAudioOff");
        a();
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.i(z);
        }
        L();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        k("startByToken");
        a();
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.w();
        }
        L();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        k("pause");
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.i();
        }
        com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        k("setMuted mute = " + z);
        this.f.c(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.f.d();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return 0L;
        }
        return iMediaPlayer.m();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue();
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        k("release");
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.o();
        }
        s();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.c(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.m(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(iVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80039e", new Object[]{this, dVar});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(dVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80ec5c", new Object[]{this, fVar});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(fVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8077fd", new Object[]{this, eVar});
        } else if (this.e.contains(eVar)) {
        } else {
            this.e.add(eVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8160bb", new Object[]{this, gVar});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(gVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e82bdd8", new Object[]{this, jVar});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(jVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e81d51a", new Object[]{this, hVar});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(hVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca848472", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(onAudioFocusChangeListener);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(tLiveMsg);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        return iMediaPlayer != null && iMediaPlayer.z();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        return iMediaPlayer != null && iMediaPlayer.A();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.h(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.bG_();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd73caaf", new Object[]{this, aspectRatio});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.b(context);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        c(map);
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(map);
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        k("releaseByToken");
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.o();
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        k("releaseAndDestroy");
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            iMediaPlayer.o();
            this.c.c();
        }
        E();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(List<MediaData.QualityLiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.a(bVar);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public HashMap<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3dc76df", new Object[]{this, map});
        }
        c(map);
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.b(map);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.cA_();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public IMediaPlayer.WarmState h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.WarmState) ipChange.ipc$dispatch("6b283b75", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer != null) {
            return iMediaPlayer.h();
        }
        return IMediaPlayer.WarmState.NORMAL;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
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
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return -1.0f;
        }
        return iMediaPlayer.dX_();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        k("onError " + i);
        if (i == -70000) {
            k("onError ERROR_REMOTE_SO_NOT_LOAD");
            this.h = true;
            a aVar = this.i;
            if (aVar != null) {
                aVar.a();
            }
            return false;
        }
        for (IMediaPlayer.e eVar : this.e) {
            eVar.onError(this, i, i2);
        }
        return false;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
            return;
        }
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.q(z);
    }

    private void a(ozs ozsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8eb55f0", new Object[]{this, ozsVar});
        } else if (this.h) {
            if (ozsVar.a()) {
                M();
                return;
            }
            for (IMediaPlayer.e eVar : this.e) {
                eVar.onError(this, ERROR_CUSTOMIZE_SO_LOAD_FAILED, 0);
            }
        }
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        k("internalRetry");
        IMediaPlayer iMediaPlayer = this.c;
        if (iMediaPlayer == null) {
            return;
        }
        iMediaPlayer.o();
        this.c.a(this.j, this.k);
        this.c.g();
        a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public String K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2078db8e", new Object[]{this}) : this.l;
    }

    public void a(a.InterfaceC0912a interfaceC0912a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc00b52", new Object[]{this, interfaceC0912a});
        } else {
            this.f.a(interfaceC0912a);
        }
    }

    public void b(a.InterfaceC0912a interfaceC0912a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33a3193", new Object[]{this, interfaceC0912a});
        } else {
            this.f.b(interfaceC0912a);
        }
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.f(this.l);
    }

    private String O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a8fc60a", new Object[]{this});
        }
        String a2 = pmd.a().q() != null ? pmd.a().q().a() : "";
        return a2 + "_" + this.n.nextInt(1000) + "_" + System.currentTimeMillis();
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", str + " hash = " + this);
    }

    private void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (map == null || !map.containsKey("initDefinition")) {
        } else {
            this.m.put("initDefinition", map.get("initDefinition"));
        }
    }

    private String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c11580a9", new Object[]{this});
        }
        IMediaPlayer iMediaPlayer = this.c;
        return iMediaPlayer != null ? iMediaPlayer.y() : "";
    }
}
