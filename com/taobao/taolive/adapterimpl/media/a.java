package com.taobao.taolive.adapterimpl.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.LiveStreamStatsInfo;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.mediaplay.model.PlayerQualityItem;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.mediaplay.model.TBLiveMSGInfo;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.mediaplay.player.j;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import tb.ddc;
import tb.dde;
import tb.ddh;
import tb.kge;
import tb.pmd;
import tb.ppp;
import tb.psm;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class a implements AudioManager.OnAudioFocusChangeListener, j, TaoLiveVideoView.a, TaoLiveVideoView.b, IMediaPlayer, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPreparedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private k f21372a;
    private MediaData b;
    private b c;
    private Context d;
    private boolean e;
    private IMediaPlayer.b o;
    private long p;
    private String s;
    private boolean t;
    public Handler w;
    private String x;
    private IMediaPlayer.WarmState u = IMediaPlayer.WarmState.NORMAL;
    private int y = 10;
    private boolean B = false;
    private final ppp.a z = new ppp.a() { // from class: com.taobao.taolive.adapterimpl.media.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ppp.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "MediaPlayerProxy", "onAppInBackgroud");
            if (a.this.w == null) {
                return;
            }
            a.this.w.postDelayed(a.a(a.this), TimeUnit.SECONDS.toMillis(a.b(a.this)));
        }

        @Override // tb.ppp.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (a.this.w == null) {
            } else {
                a.this.w.removeCallbacks(a.a(a.this));
            }
        }
    };
    private final Runnable A = new Runnable() { // from class: com.taobao.taolive.adapterimpl.media.a.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!a.c(a.this) || a.d(a.this) == null || !a.d(a.this).d()) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("subBusinessType", a.e(a.this));
                hashMap.put("bgDelaySeconds", Integer.toString(a.b(a.this)));
                hashMap.put("isVideoLoop", Boolean.toString(a.f(a.this)));
                hashMap.put("playToken", a.d(a.this).c());
                hashMap.put(aw.PARAM_PLAY_URL, a.d(a.this).a());
                hashMap.put("isMiniWindow", String.valueOf(a.g(a.this)));
                pmd.a().e().a("Page_TaobaoLiveWatch", "BgMuteStreamingLeakReport", hashMap);
                TLog.loge(MediaConstant.LBLIVE_SOURCE, "MediaPlayerProxy", "BgMuteStreamingLeakReport: subBusinessType= " + a.e(a.this) + " , isMiniWindow= " + a.g(a.this));
            }
        }
    };
    private boolean v = false;
    private List<IMediaPlayer.d> f = new ArrayList();
    private List<IMediaPlayer.f> g = new ArrayList();
    private List<Object> h = new ArrayList();
    private List<IMediaPlayer.i> i = new ArrayList();
    private List<IMediaPlayer.e> j = new CopyOnWriteArrayList();
    private List<IMediaPlayer.g> k = new CopyOnWriteArrayList();
    private List<IMediaPlayer.j> l = new CopyOnWriteArrayList();
    private List<IMediaPlayer.h> m = new ArrayList();
    private List<AudioManager.OnAudioFocusChangeListener> n = new CopyOnWriteArrayList();
    private boolean q = false;
    private boolean r = false;

    /* renamed from: com.taobao.taolive.adapterimpl.media.a$4  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21375a;
        public static final /* synthetic */ int[] b = new int[IMediaPlayer.UpdataUrlListMode.values().length];

        static {
            try {
                b[IMediaPlayer.UpdataUrlListMode.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[IMediaPlayer.UpdataUrlListMode.REPLACE_BY_URL_ID_OF_NEW_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[IMediaPlayer.UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21375a = new int[IMediaPlayer.AspectRatio.values().length];
            try {
                f21375a[IMediaPlayer.AspectRatio.FIT_X_Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21375a[IMediaPlayer.AspectRatio.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-2115195608);
        kge.a(1033693273);
        kge.a(-111960633);
        kge.a(1345538278);
        kge.a(-1423519514);
        kge.a(-121259976);
        kge.a(233018416);
        kge.a(-1491822649);
        kge.a(-1773133372);
        kge.a(1304691111);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ Runnable a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("f904e15f", new Object[]{aVar}) : aVar.A;
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7cadc89", new Object[]{aVar})).intValue() : aVar.y;
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a26b9f1b", new Object[]{aVar})).booleanValue() : aVar.q;
    }

    public static /* synthetic */ k d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("644f79ec", new Object[]{aVar}) : aVar.f21372a;
    }

    public static /* synthetic */ String e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d73865a7", new Object[]{aVar}) : aVar.x;
    }

    public static /* synthetic */ boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("724de69e", new Object[]{aVar})).booleanValue() : aVar.r;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ceea91f", new Object[]{aVar})).booleanValue() : aVar.B;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public /* synthetic */ View r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aae7fb", new Object[]{this}) : a();
    }

    /* renamed from: com.taobao.taolive.adapterimpl.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0889a implements com.taobao.taolive.sdk.ui.media.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2069328477);
            kge.a(1230883219);
        }

        @Override // com.taobao.taolive.sdk.ui.media.b
        public com.taobao.taolive.sdk.ui.media.IMediaPlayer a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.IMediaPlayer) ipChange.ipc$dispatch("d9b93764", new Object[]{this}) : new a();
        }

        @Override // com.taobao.taolive.sdk.ui.media.b
        public com.taobao.taolive.sdk.ui.media.IMediaPlayer a(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.IMediaPlayer) ipChange.ipc$dispatch("45d0dc61", new Object[]{this, hashMap}) : new a(hashMap);
        }
    }

    public a() {
        E();
    }

    public a(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            this.t = v.a(hashMap.get("enableOpenUseShortAudioFocus"), false);
        }
        E();
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        this.w = new Handler(Looper.getMainLooper());
        try {
            this.y = Integer.parseInt(psm.J());
        } catch (NumberFormatException e) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "MediaPlayerProxy", e.getMessage());
        }
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return null;
        }
        return (ViewGroup) kVar.q();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else if (this.f21372a == null || TextUtils.isEmpty(str)) {
        } else {
            this.f21372a.b("TBVideoVideoIDPlayer");
            this.f21372a.g("TBVideo");
            this.f21372a.a(new c(str));
            this.f21372a.e(str);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return null;
        }
        return kVar.q();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy create");
        this.d = context;
        this.f21372a = new k(context, false, MediaConstant.LBLIVE_SOURCE);
        this.f21372a.p(this.t);
        if (as.f()) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
            this.f21372a.c(hashMap);
        }
        d dVar = new d();
        this.f21372a.a((ddc) dVar);
        this.f21372a.a((ddh) dVar);
        this.f21372a.a((TaoLiveVideoView.a) this);
        this.f21372a.a((IMediaPlayer.OnCompletionListener) this);
        this.f21372a.a((IMediaPlayer.OnErrorListener) this);
        this.f21372a.a((IMediaPlayer.OnInfoListener) this);
        this.f21372a.a((IMediaPlayer.OnPreparedListener) this);
        this.f21372a.a((TaoLiveVideoView.b) this);
        if (psm.B()) {
            this.f21372a.a(0L);
        }
        Trace.endSection();
    }

    public void a(k kVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb0b32", new Object[]{this, kVar, context});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy set instance");
        this.d = context;
        this.f21372a = kVar;
        this.f21372a.b(MediaConstant.LBLIVE_SOURCE);
        if (as.f()) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
            this.f21372a.c(hashMap);
        }
        d dVar = new d();
        this.f21372a.a((ddc) dVar);
        this.f21372a.a((ddh) dVar);
        this.f21372a.a((TaoLiveVideoView.a) this);
        this.f21372a.a((IMediaPlayer.OnCompletionListener) this);
        this.f21372a.a((IMediaPlayer.OnErrorListener) this);
        this.f21372a.a((IMediaPlayer.OnInfoListener) this);
        this.f21372a.a((IMediaPlayer.OnPreparedListener) this);
        this.f21372a.a((TaoLiveVideoView.b) this);
        this.e = true;
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.q(z);
        }
        this.v = z;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean cy_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48d38ab4", new Object[]{this})).booleanValue() : this.v;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36ca8c8", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(drawable, z);
        if (!psm.B()) {
            return;
        }
        this.f21372a.a(0L);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy destroy");
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.b((TaoLiveVideoView.a) this);
            this.f21372a.b((IMediaPlayer.OnCompletionListener) this);
            this.f21372a.b((IMediaPlayer.OnErrorListener) this);
            this.f21372a.b((IMediaPlayer.OnInfoListener) this);
            this.f21372a.b((IMediaPlayer.OnPreparedListener) this);
            this.f21372a.b((TaoLiveVideoView.b) this);
            this.f21372a.a((j) null);
            this.f21372a.s();
            this.f21372a = null;
        }
        this.g.clear();
        this.f.clear();
        TLog.loge(MediaConstant.LBLIVE_SOURCE, TLogTracker.SCENE_EXCEPTION, com.taobao.android.weex_framework.util.a.ATOM_EXT_clear);
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o = null;
        this.e = false;
        this.u = IMediaPlayer.WarmState.NORMAL;
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1e0712", new Object[]{this, mediaData, str});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy set datasource");
        this.b = mediaData;
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.b(MediaConstant.LBLIVE_SOURCE);
            this.f21372a.a(a(mediaData), str);
        }
        Trace.endSection();
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy warm up");
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.p();
            this.f21372a.x();
            try {
                this.f21372a.a((MediaLiveWarmupConfig) null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.u = IMediaPlayer.WarmState.WARMING;
        }
        Trace.endSection();
    }

    private MediaLiveInfo a(MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("8814ae0f", new Object[]{this, mediaData});
        }
        Trace.beginSection("TLiveFFTrace -- player proxy convert");
        if (mediaData == null) {
            return null;
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = mediaData.h265;
        mediaLiveInfo.rateAdapte = mediaData.rateAdapte;
        mediaLiveInfo.anchorId = mediaData.anchorId;
        mediaLiveInfo.liveId = mediaData.liveId;
        mediaLiveInfo.mediaSourceType = mediaData.mediaSourceType;
        mediaLiveInfo.edgePcdn = mediaData.edgePcdn;
        mediaLiveInfo.mediaConfig = mediaData.mediaConfig;
        if (mediaData.liveUrlList != null && mediaData.liveUrlList.size() > 0) {
            int size = mediaData.liveUrlList.size();
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                mediaLiveInfo.liveUrlList.add(a(mediaData.liveUrlList.get(i)));
            }
        }
        Trace.endSection();
        return mediaLiveInfo;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public MediaData d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaData) ipChange.ipc$dispatch("5cc8f1cb", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return null;
        }
        return kVar.a();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(i, j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.f(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.d(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.f(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(false, i, 0, 0, 0);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.b(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(f);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            s();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy start");
        TLog.loge(MediaConstant.LBLIVE_SOURCE, "MediaPlayerProxy", this + "start");
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.p();
            this.f21372a.x();
            this.f21372a.f();
        }
        this.p = System.currentTimeMillis();
        pmd.a().u().a(this.z);
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy start by audio off");
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.p();
            if (z) {
                this.f21372a.w();
            }
            this.f21372a.f();
        }
        this.p = System.currentTimeMillis();
        pmd.a().u().a(this.z);
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy start by token");
        if (this.f21372a != null) {
            if (!TextUtils.isEmpty(this.s)) {
                try {
                    this.f21372a.h(this.s);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.f21372a.p();
            this.f21372a.f();
            pmd.a().u().a(this.z);
        }
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy pause");
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.g();
        }
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy set Muted");
        k kVar = this.f21372a;
        if (kVar != null) {
            this.q = z;
            kVar.e(z);
        }
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.q;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return 0;
        }
        return kVar.m();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return 0;
        }
        return kVar.o();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return false;
        }
        return kVar.d();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.e((int) j);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return 0L;
        }
        return kVar.i();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.k();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue();
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return 0L;
        }
        return kVar.h();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        Trace.beginSection("TLiveFFTrace -- player proxy release");
        this.e = false;
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.l();
        }
        pmd.a().u().b(this.z);
        Handler handler = this.w;
        if (handler != null) {
            handler.removeCallbacks(this.A, Integer.valueOf(this.y));
        }
        Trace.endSection();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (map != null) {
            if (map.get("mockPlayerInfo") != null) {
                for (int i = 0; i < this.k.size(); i++) {
                    if (this.k.get(i) != null) {
                        this.k.get(i).onInfo(this, -2147483648L, -2147483648L, -2147483648L, map.get("mockPlayerInfo"));
                    }
                }
                return;
            } else if (map.get("hasPreloadVideoData") != null) {
                HashMap<String, String> hashMap = new HashMap<>(map);
                k kVar = this.f21372a;
                if (kVar == null) {
                    return;
                }
                kVar.c(hashMap);
                return;
            }
        }
        k kVar2 = this.f21372a;
        if (kVar2 == null) {
            return;
        }
        kVar2.b(map);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public HashMap<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3dc76df", new Object[]{this, map});
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return null;
        }
        return kVar.c(map);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        this.r = z;
        kVar.h(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.r;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e824979", new Object[]{this, iVar});
        } else if (this.i.contains(iVar)) {
        } else {
            this.i.add(iVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80ec5c", new Object[]{this, fVar});
            return;
        }
        if (!this.g.contains(fVar)) {
            this.g.add(fVar);
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, TLogTracker.SCENE_EXCEPTION, "addOnHighLightLoopCompletionListener");
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e80039e", new Object[]{this, dVar});
            return;
        }
        if (!this.f.contains(dVar)) {
            this.f.add(dVar);
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, TLogTracker.SCENE_EXCEPTION, "addOnCompletionListener");
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8077fd", new Object[]{this, eVar});
        } else if (this.j.contains(eVar)) {
        } else {
            this.j.add(eVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8160bb", new Object[]{this, gVar});
        } else if (this.k.contains(gVar)) {
        } else {
            this.k.add(gVar);
        }
    }

    public void b(IMediaPlayer.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbc123c", new Object[]{this, gVar});
        } else {
            this.k.remove(gVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e82bdd8", new Object[]{this, jVar});
        } else if (this.l.contains(jVar)) {
        } else {
            this.l.add(jVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e81d51a", new Object[]{this, hVar});
        } else if (this.m.contains(hVar)) {
        } else {
            this.m.add(hVar);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca848472", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        if (!this.n.contains(onAudioFocusChangeListener)) {
            this.n.add(onAudioFocusChangeListener);
        }
        if (this.f21372a == null || this.n.size() != 1) {
            return;
        }
        this.f21372a.a((AudioManager.OnAudioFocusChangeListener) this);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
        } else if (this.f21372a == null || tLiveMsg == null) {
        } else {
            TBLiveMSGInfo tBLiveMSGInfo = new TBLiveMSGInfo();
            tBLiveMSGInfo.bizCode = tLiveMsg.bizCode;
            tBLiveMSGInfo.data = tLiveMsg.data;
            tBLiveMSGInfo.from = tLiveMsg.from;
            tBLiveMSGInfo.messageId = tLiveMsg.messageId;
            tBLiveMSGInfo.needAck = tLiveMsg.needAck;
            tBLiveMSGInfo.priority = tLiveMsg.priority;
            tBLiveMSGInfo.qosLevel = tLiveMsg.qosLevel;
            tBLiveMSGInfo.sendFullTags = tLiveMsg.sendFullTags;
            tBLiveMSGInfo.tags = tLiveMsg.tags;
            tBLiveMSGInfo.timestamp = tLiveMsg.timestamp;
            tBLiveMSGInfo.to = tLiveMsg.to;
            tBLiveMSGInfo.topic = tLiveMsg.topic;
            tBLiveMSGInfo.type = tLiveMsg.type;
            tBLiveMSGInfo.userId = tLiveMsg.userId;
            this.f21372a.a(tBLiveMSGInfo);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar != null) {
            kVar.c(str);
        }
        this.x = str;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.k(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.j(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.e(str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        try {
            if (this.f21372a == null) {
                return;
            }
            this.f21372a.a(new dde() { // from class: com.taobao.taolive.adapterimpl.media.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dde
                public long getStartTime() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : j;
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.b(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.c(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.i(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.j(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        k kVar = this.f21372a;
        return kVar != null && kVar.t();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.k(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        k kVar = this.f21372a;
        return kVar != null && kVar.u();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.v();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.f(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.k();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.d(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(hashMap);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i(String str) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        t();
        if (this.c != null || (kVar = this.f21372a) == null) {
            return;
        }
        this.c = new b(this.d, kVar.b(), com.taobao.android.weex_framework.util.a.ATOM_EXT_race, str);
        this.c.a(1);
        this.f21372a.a(this.c);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void t() {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        b bVar = this.c;
        if (bVar == null || (kVar = this.f21372a) == null) {
            return;
        }
        kVar.b(bVar);
        this.c = null;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public IMediaPlayer.c u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.c) ipChange.ipc$dispatch("e534b3b1", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.g(i);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public Bitmap bG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9ad47c3f", new Object[]{this});
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return null;
        }
        return kVar.z();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.AspectRatio aspectRatio) {
        MediaAspectRatio mediaAspectRatio;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd73caaf", new Object[]{this, aspectRatio});
            return;
        }
        int i = AnonymousClass4.f21375a[aspectRatio.ordinal()];
        if (i == 1) {
            mediaAspectRatio = MediaAspectRatio.DW_FIT_X_Y;
        } else if (i == 2) {
            mediaAspectRatio = MediaAspectRatio.DW_FIT_CENTER;
        } else {
            mediaAspectRatio = MediaAspectRatio.DW_CENTER_CROP;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(mediaAspectRatio);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.d = context;
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(context);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return null;
        }
        return kVar.c();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{this, hashMap});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.b(hashMap);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
            return;
        }
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.get(i) != null) {
                this.i.get(i).onPrepared(this);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            return;
        }
        try {
            if (this.r) {
                if (this.f21372a == null) {
                    return;
                }
                this.f21372a.e(0);
                this.f21372a.f();
                if (this.g == null) {
                    return;
                }
                while (i < this.g.size()) {
                    if (this.g.get(i) != null) {
                        this.g.get(i).onHighLightLoopCompletion(this);
                    }
                    i++;
                }
                return;
            }
            while (i < this.f.size()) {
                if (this.f.get(i) != null) {
                    this.f.get(i).onCompletion(this);
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge(MediaConstant.LBLIVE_SOURCE, TLogTracker.SCENE_EXCEPTION, "stack = " + Log.getStackTraceString(new Throwable()));
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            if (this.j.get(i3) != null) {
                this.j.get(i3).onError(this, i, i2);
            }
        }
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j == 3) {
            this.e = true;
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "MediaPlayerProxy", "l = " + j + "this = " + this);
        } else if (j == 12000) {
            this.u = IMediaPlayer.WarmState.WARMED;
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "MediaPlayerProxy", "l = " + j + "this = " + this);
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (this.k.get(i) != null) {
                this.k.get(i).onInfo(this, j, j2, j3, obj);
            }
        }
        return false;
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.b
    public void onStart(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            return;
        }
        for (int i = 0; i < this.l.size(); i++) {
            if (this.l.get(i) != null) {
                this.l.get(i).onStart(this);
            }
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.a
    public void onPause(tv.danmaku.ijk.media.player.IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            if (this.m.get(i) != null) {
                this.m.get(i).onPause(this);
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            if (this.n.get(i2) != null) {
                this.n.get(i2).onAudioFocusChange(i);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(List<MediaData.QualityLiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(a(list.get(i)));
            }
            k kVar = this.f21372a;
            if (kVar == null) {
                return;
            }
            kVar.a(arrayList, MediaPlayCenter.UpdataUrlListMode.REPLACE_BY_URL_ID_OF_NEW_DEFINITION);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(List<MediaData.QualityLiveItem> list, IMediaPlayer.UpdataUrlListMode updataUrlListMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feedbc8", new Object[]{this, list, updataUrlListMode});
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(a(list.get(i)));
            }
            MediaPlayCenter.UpdataUrlListMode updataUrlListMode2 = null;
            int i2 = AnonymousClass4.b[updataUrlListMode.ordinal()];
            if (i2 == 1) {
                updataUrlListMode2 = MediaPlayCenter.UpdataUrlListMode.INIT;
            } else if (i2 == 2) {
                updataUrlListMode2 = MediaPlayCenter.UpdataUrlListMode.REPLACE_BY_URL_ID_OF_NEW_DEFINITION;
            } else if (i2 == 3) {
                updataUrlListMode2 = MediaPlayCenter.UpdataUrlListMode.REPLACE_FORCE_OF_NEW_DEFINITION;
            }
            k kVar = this.f21372a;
            if (kVar == null) {
                return;
            }
            kVar.a(arrayList, updataUrlListMode2);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public List<s> n(boolean z) {
        List<PlayerQualityItem> n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3971b0e8", new Object[]{this, new Boolean(z)});
        }
        k kVar = this.f21372a;
        if (kVar == null || (n = kVar.n(z)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < n.size(); i++) {
            arrayList.add(a(n.get(i)));
        }
        return arrayList;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public s C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("de6a8e25", new Object[]{this});
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return null;
        }
        return a(kVar.y());
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.a(i, str);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(IMediaPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7f1ae0", new Object[]{this, bVar});
            return;
        }
        this.o = bVar;
        if (bVar != null) {
            k kVar = this.f21372a;
            if (kVar == null) {
                return;
            }
            kVar.a((j) this);
            return;
        }
        k kVar2 = this.f21372a;
        if (kVar2 == null) {
            return;
        }
        kVar2.a((j) null);
    }

    @Override // com.taobao.mediaplay.player.j
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
            return;
        }
        IMediaPlayer.b bVar = this.o;
        if (bVar == null) {
            return;
        }
        bVar.a(hashMap);
    }

    private s a(PlayerQualityItem playerQualityItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("832d351", new Object[]{this, playerQualityItem});
        }
        if (playerQualityItem == null) {
            return null;
        }
        s sVar = new s();
        sVar.e = playerQualityItem.current;
        sVar.b = playerQualityItem.newDefinition;
        sVar.f21957a = playerQualityItem.newName;
        sVar.d = playerQualityItem.definition;
        sVar.c = playerQualityItem.name;
        return sVar;
    }

    private QualityLiveItem a(MediaData.QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QualityLiveItem) ipChange.ipc$dispatch("3a63db09", new Object[]{this, qualityLiveItem});
        }
        QualityLiveItem qualityLiveItem2 = new QualityLiveItem();
        qualityLiveItem2.artpUrl = qualityLiveItem.artpUrl;
        qualityLiveItem2.definition = qualityLiveItem.definition;
        qualityLiveItem2.flvUrl = qualityLiveItem.flvUrl;
        qualityLiveItem2.h265Url = qualityLiveItem.h265Url;
        qualityLiveItem2.hlsUrl = qualityLiveItem.hlsUrl;
        qualityLiveItem2.artpUrl = qualityLiveItem.artpUrl;
        qualityLiveItem2.name = qualityLiveItem.name;
        qualityLiveItem2.replayUrl = qualityLiveItem.replayUrl;
        qualityLiveItem2.videoUrl = qualityLiveItem.videoUrl;
        qualityLiveItem2.wholeH265ArtpUrl = qualityLiveItem.wholeH265ArtpUrl;
        qualityLiveItem2.wholeH265FlvUrl = qualityLiveItem.wholeH265FlvUrl;
        qualityLiveItem2.bfrtcUrl = qualityLiveItem.bfrtcUrl;
        qualityLiveItem2.rtcLiveUrl = qualityLiveItem.rtcLiveUrl;
        qualityLiveItem2.unit = qualityLiveItem.unit;
        qualityLiveItem2.unitType = qualityLiveItem.unitType;
        qualityLiveItem2.liveUrlMiniBfrtc = qualityLiveItem.liveUrlMiniBfrtc;
        qualityLiveItem2.newDefinition = qualityLiveItem.newDefinition;
        qualityLiveItem2.recomm = qualityLiveItem.recomm;
        qualityLiveItem2.selectedProtocol = qualityLiveItem.selectedProtocol;
        qualityLiveItem2.newName = qualityLiveItem.newName;
        if (qualityLiveItem.liveStreamStatsInfo != null) {
            qualityLiveItem2.liveStreamStatsInfo = (LiveStreamStatsInfo) JSON.parseObject(qualityLiveItem.liveStreamStatsInfo, LiveStreamStatsInfo.class);
        }
        if (qualityLiveItem.additionUrlMap != null) {
            qualityLiveItem2.additionUrlMap = qualityLiveItem.additionUrlMap;
        }
        if (qualityLiveItem.extInfo != null) {
            qualityLiveItem2.extInfo = qualityLiveItem.extInfo;
        }
        return qualityLiveItem2;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        if (psm.A()) {
            k kVar = this.f21372a;
            return (kVar == null || kVar.r() == null || this.f21372a.r().get("first_frame_rendering_time") == null || v.a(this.f21372a.r().get("first_frame_rendering_time"), 0) <= 0) ? false : true;
        }
        return this.e;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public boolean cA_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e94427ec", new Object[]{this})).booleanValue();
        }
        k kVar = this.f21372a;
        return (kVar == null || kVar.r() == null || this.f21372a.r().get("first_frame_rendering_time") == null || v.a(this.f21372a.r().get("first_frame_update_ts"), 0) <= 0) ? false : true;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public IMediaPlayer.WarmState h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer.WarmState) ipChange.ipc$dispatch("6b283b75", new Object[]{this}) : this.u;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
            return;
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return;
        }
        kVar.o(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public float dX_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4569d962", new Object[]{this})).floatValue();
        }
        k kVar = this.f21372a;
        if (kVar == null) {
            return -1.0f;
        }
        return kVar.e();
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }
}
