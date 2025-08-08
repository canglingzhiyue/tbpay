package com.taobao.android.fluid.framework.card.cards.album;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.avplayer.av;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.s;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.fgb;
import tb.kge;
import tb.ljm;
import tb.ljq;
import tb.psw;
import tb.psy;
import tb.riy;
import tb.shu;
import tb.snp;
import tb.snz;
import tb.soi;
import tb.soj;
import tb.sps;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public final class e extends psy implements av, ba, snz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_NAME = "新版图集卡";
    private final Handler A;
    private final Set<s> B;
    private View C;
    private Context D;
    private FluidContext E;
    private boolean F;
    private s G;
    private a.c H;
    private String I;
    private String J;
    private String K;
    private long L;
    private long M;
    private long N;
    private long O;
    private long P;
    private long Q;
    private long R;
    private long S;
    private long T;
    private boolean U;
    private boolean V;
    private boolean W;
    private final fgb Y;

    /* renamed from: a  reason: collision with root package name */
    public final shu f12480a;
    public ViewGroup b;
    public boolean c;
    public boolean d;
    private final Handler y;
    private final HashMap<String, String> z;

    static {
        kge.a(-413481405);
        kge.a(-857402716);
        kge.a(854340662);
        kge.a(-1951056501);
        kge.a(688755897);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2136187174:
                super.onWillActive((psw) objArr[0]);
                return null;
            case -1961121033:
                super.onAppear((psw) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1355309186:
                super.onCreateView((psw) objArr[0], (snp) objArr[1]);
                return null;
            case -1294174408:
                super.onDisActive((psw) objArr[0]);
                return null;
            case -1244531194:
                super.onWillDisActive((psw) objArr[0]);
                return null;
            case -893732120:
                super.onActive((psw) objArr[0]);
                return null;
            case -424976904:
                super.onTabSelected();
                return null;
            case -152376096:
                super.cI_();
                return null;
            case -111711657:
                super.onRecycle((psw) objArr[0]);
                return null;
            case 363259313:
                super.onTabUnSelected();
                return null;
            case 504096288:
                super.onBindData((psw) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1933403975:
                super.onDisAppear((psw) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.psy
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        }
    }

    @Override // tb.psy
    public void a(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c4f948", new Object[]{this, bool, bool2});
        }
    }

    @Override // tb.psy
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    @Override // tb.psx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : CARD_NAME;
    }

    @Override // tb.psx
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // tb.psw, tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    public static /* synthetic */ s a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("2961a7da", new Object[]{eVar}) : eVar.G;
    }

    public static /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4743cdc0", new Object[]{eVar, str});
        } else {
            eVar.a(str);
        }
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("777a8c22", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.V = z;
        return z;
    }

    public static /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22a4a0d9", new Object[]{eVar})).booleanValue() : eVar.V;
    }

    public static /* synthetic */ void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a86c34", new Object[]{eVar});
        } else {
            eVar.W();
        }
    }

    public e(FluidContext fluidContext) {
        super(fluidContext);
        this.y = new Handler(Looper.getMainLooper());
        this.z = new HashMap<>();
        this.A = new Handler(Looper.getMainLooper());
        this.B = new HashSet();
        this.c = false;
        this.d = false;
        this.Q = 0L;
        this.R = 0L;
        this.S = 0L;
        this.T = 0L;
        this.U = false;
        this.W = false;
        this.f12480a = new shu(this);
        this.Y = new fgb(this.E, this);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            spz.a("AudioComponentsController", "onVideoStart");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.a("AudioComponentsController", "onVideoPause " + z);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            spz.a("AudioComponentsController", "onVideoPlay");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        spz.c("AudioComponentsController", "onVideoSeekTo " + i);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else if (this.G == null) {
        } else {
            this.T = SystemClock.elapsedRealtime();
            ljq.d(this, "prepared");
            boolean g = f.g(this.E);
            this.G.a(g);
            spz.c("AudioComponentsController", "onVideoPrepared mIsAppear = " + this.F + " mute=" + g);
            spz.c("music_album", "onVideoPrepared mIsAppear = " + this.F + " mute=" + g);
            if (!this.W || !b.c()) {
                aa();
            }
            if (!this.F) {
                this.V = true;
                this.G.b();
            } else {
                W();
            }
            ad();
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (this.G == null) {
        } else {
            spz.c("AudioComponentsController", "onVideoError " + obj + " i=" + i + " i1=" + i2);
            StringBuilder sb = new StringBuilder();
            sb.append("error(");
            sb.append(i);
            sb.append(riy.BRACKET_END_STR);
            ljq.d(this, sb.toString());
            if (!this.B.contains(this.G)) {
                spz.c("AudioComponentsController", "onVideoError  restart");
                this.B.add(this.G);
                this.G.a();
                ljq.d(this, "retry");
                return;
            }
            ljq.a(this, String.valueOf(i), "");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        } else {
            spz.a("AudioComponentsController", "onVideoComplete");
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        long j = this.O;
        if (j <= 0 || j >= i3 || i < j) {
            return;
        }
        this.G.d(Math.max((int) this.N, 0));
        a("play");
    }

    public void cd_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24fdc5a5", new Object[]{this});
            return;
        }
        this.F = false;
        if (this.G == null) {
            return;
        }
        l();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.S = SystemClock.elapsedRealtime();
        spz.c("music_album", "doActive 时间=" + this.S);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Z();
        this.Q = SystemClock.elapsedRealtime();
        spz.c("music_album", "doAppear 时间=" + this.Q);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.U = false;
        }
    }

    @Override // tb.psx
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : R.layout.fluid_sdk_ly_picture_album_card;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.I;
    }

    @Override // tb.psw
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : i();
    }

    @Override // tb.psw
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        a.c cVar = this.H;
        return cVar != null ? cVar.c : "";
    }

    @Override // tb.psw, tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!this.r || !H() || !L()) {
            return;
        }
        ab();
    }

    @Override // tb.psw, tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!this.r || !H() || !L()) {
            return;
        }
        Y();
    }

    @Override // tb.psw, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        super.cI_();
        if (!this.r) {
            return;
        }
        o();
    }

    @Override // tb.psw, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        this.E = z();
    }

    @Override // tb.psw, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        super.onAppear(pswVar);
        if (!this.r || ((IFeedsListService) this.E.getService(IFeedsListService.class)).isFastScroll()) {
            return;
        }
        g();
        p();
    }

    @Override // tb.psw, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        } else {
            super.onDisAppear(pswVar);
        }
    }

    @Override // tb.psw, tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            return;
        }
        super.onRecycle(pswVar);
        if (!this.r) {
            return;
        }
        o();
    }

    @Override // tb.psw, tb.sne
    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
            return;
        }
        super.onTabSelected();
        if (!this.r || !H()) {
            return;
        }
        ab();
    }

    @Override // tb.psw, tb.sne
    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
            return;
        }
        super.onTabUnSelected();
        if (!this.r || !H()) {
            return;
        }
        Y();
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        if (this.o == null) {
            return -1;
        }
        return this.o.getAdapterPosition();
    }

    @Override // tb.psy, tb.psw, tb.shm
    public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        super.onBindData(pswVar, aVar, i);
        if (!this.r || !b.b()) {
            return;
        }
        this.b = (ViewGroup) this.n;
        this.C = (ViewGroup) this.n;
        this.H = this.H;
        this.D = this.C.getContext();
        this.F = false;
        X();
    }

    @Override // tb.psw, tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
            return;
        }
        super.onWillActive(pswVar);
        if (!this.r) {
            return;
        }
        ab();
    }

    @Override // tb.psw, tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
            return;
        }
        super.onWillDisActive(pswVar);
        if (!this.r) {
            return;
        }
        Y();
    }

    @Override // tb.psw, tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        super.onActive(pswVar);
        if (!this.r) {
            return;
        }
        e();
        ab();
    }

    @Override // tb.psw, tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        super.onDisActive(pswVar);
        if (!this.r) {
            return;
        }
        ac();
    }

    @Override // tb.psy, tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
        } else {
            p();
        }
    }

    @Override // tb.psy, tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
        } else if (soi.d(this.E)) {
        } else {
            m();
        }
    }

    @Override // tb.psy, tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
        } else {
            n();
        }
    }

    @Override // tb.psy, tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
        } else {
            l();
        }
    }

    @Override // tb.psy, tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
        } else {
            o();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.G == null) {
        } else {
            this.A.post(new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.album.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        e.a(e.this).b();
                        e.a(e.this, "pause");
                    }
                }
            });
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.G == null) {
        } else {
            this.A.post(new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.album.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        int j = e.a(e.this).j();
                        spz.c("AudioComponentsController", "playVideo " + j);
                        if (j == 1 || j == 8) {
                            return;
                        }
                        if (j != 2) {
                            e.a(e.this).a();
                            return;
                        }
                        e.a(e.this).g();
                        if (e.b(e.this)) {
                            e.c(e.this);
                        } else {
                            e.a(e.this, "resume");
                        }
                        e.a(e.this, false);
                    }
                }
            });
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.G == null) {
        } else {
            this.A.post(new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.album.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null) {
                    } else {
                        e.a(e.this).d(0);
                        e.a(e.this).b();
                    }
                }
            });
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        s sVar = this.G;
        if (sVar == null) {
            return;
        }
        sVar.c();
        this.G.f();
        this.B.remove(this.G);
        this.G = null;
        a("destroy");
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.G != null || this.H == null || StringUtils.isEmpty(this.J)) {
        } else {
            sps sessionParams = ((ISceneConfigService) this.E.getService(ISceneConfigService.class)).getSessionParams();
            s.a aVar = new s.a((Activity) this.D);
            aVar.h(true);
            boolean a2 = b.a();
            if (a2) {
                aVar.b(1);
                aVar.c(1);
            }
            if (soj.b(this.E)) {
                aVar.j(true);
                aVar.k(false);
            }
            if (b.c()) {
                if (b.e()) {
                    a(aVar);
                } else {
                    c(aVar);
                }
                b(aVar);
            } else {
                c(aVar);
            }
            aVar.a(2);
            aVar.c(true);
            aVar.a(ljm.a(this.E, k(), this.H));
            aVar.b(new HashMap<>(((ITrackService) this.E.getService(ITrackService.class)).getActiveCardCommonTrack()));
            aVar.f(this.E.getInstanceConfig().getPlayScenes());
            if (sessionParams != null) {
                aVar.b(sessionParams.c);
            }
            this.G = aVar.a();
            this.G.a((av) this);
            this.G.a((ba) this);
            f.b(this.E, this.G);
            spz.c("AudioComponentsController", "requestVideoPlayerIfNeeded state=" + this.G.j() + " " + this.H.y() + " section(" + this.N + "," + this.O + riy.BRACKET_END_STR);
            if (b.c() && b.d()) {
                this.G.d();
                this.G.a();
            } else {
                this.G.a();
            }
            ljq.c(this, this.G.r());
            if (!a2) {
                return;
            }
            ((ViewGroup) this.C).addView(this.G.e(), new ViewGroup.LayoutParams(-2, -2));
        }
    }

    @Override // com.taobao.avplayer.ba
    public void cJ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89fc57f", new Object[]{this});
            return;
        }
        spz.a("AudioComponentsController", "onPreCompletion");
        ljq.d(this, "complete");
        a("finish");
        aa();
        a("play");
    }

    public void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.N = j;
        this.O = j2;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.F = true;
        if (this.G == null || soi.d(this.E)) {
            return;
        }
        this.M = SystemClock.elapsedRealtime();
        this.R = this.M;
        m();
    }

    private void a(s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dd992f", new Object[]{this, aVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cacheKey", this.K);
            jSONObject2.put("definition", "hd_265");
            jSONObject2.put(com.taobao.android.weex_framework.util.a.ATOM_length, this.L);
            jSONObject2.put("video_url", this.J);
            jSONArray.put(jSONObject2);
            if (!StringUtils.isEmpty(this.K)) {
                jSONObject.put("caches", jSONArray);
            }
            jSONObject.put("resources", jSONArray);
            aVar.d("TBVideo");
            aVar.a(jSONObject);
        } catch (Throwable th) {
            spz.a("AudioComponentsController", "", th);
        }
    }

    private void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        if (this.M > 0) {
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(this, "audio_ff", String.valueOf(SystemClock.elapsedRealtime() - this.M), "", "", "");
        }
        a("play");
    }

    private void X() {
        MediaContentDetailData.Content content;
        MediaContentDetailData.MusicInfoVO musicInfoVO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        a.c cVar = this.H;
        if (cVar == null || cVar.i() == null || (content = this.H.i().content) == null) {
            return;
        }
        if (this.H.t()) {
            this.J = content.music;
        } else if (this.H.y() && (musicInfoVO = content.musicInfoVO) != null) {
            if (musicInfoVO.audioResources != null && musicInfoVO.audioResources.size() > 0) {
                MediaContentDetailData.MusicInfoVO.AudioResources audioResources = musicInfoVO.audioResources.get(0);
                this.J = audioResources.url;
                this.I = String.valueOf(audioResources.audioId);
                this.P = audioResources.duration;
                this.K = audioResources.cacheKey;
                this.L = audioResources.fileSize;
            }
            if (musicInfoVO.musicParams != null && musicInfoVO.musicParams.playPairs != null) {
                a(musicInfoVO.musicParams.playPairs.startTime, musicInfoVO.musicParams.playPairs.endTime);
            }
        }
        if (StringUtils.isEmpty(this.H.i().publishStatus) || StringUtils.isEmpty(this.H.f().music) || !StringUtils.isEmpty(this.J)) {
            return;
        }
        this.J = this.H.f().music;
    }

    private void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        this.n.setKeepScreenOn(false);
        cd_();
    }

    private void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        this.Q = 0L;
        this.S = 0L;
        this.R = 0L;
        this.T = 0L;
        spz.c("music_album", "onRequestMediaPlayer 重置 业务开始 时间=" + this.S);
    }

    private void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        s sVar = this.G;
        if (sVar == null) {
            return;
        }
        long l = sVar.l();
        spz.c("AudioComponentsController", "seekToSectionStart mAudioSectionStart=" + this.N + " " + this.O + " duration=" + l);
        long j = this.N;
        if (j <= 0 || j >= l) {
            return;
        }
        this.G.d((int) j);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        spz.a("AudioComponentsController", "sendAudioStateMsg state= " + str);
        this.z.put("state", str);
        a.c cVar = this.H;
        if (cVar == null) {
            return;
        }
        ((IMessageService) this.E.getService(IMessageService.class)).sendMessage(new spy("VSMSG_audioStateChanged", cVar.c, this.z));
    }

    private void b(s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8a44ce", new Object[]{this, aVar});
            return;
        }
        long j = this.P;
        long j2 = this.N;
        if (j2 <= 0 || j2 >= j) {
            return;
        }
        this.W = true;
        aVar.d((int) j2);
    }

    private void c(s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb36f06d", new Object[]{this, aVar});
            return;
        }
        aVar.a(this.J);
        aVar.d("TBAudio");
    }

    private void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        this.n.setKeepScreenOn(true);
        p();
        q();
    }

    private void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[]{this});
            return;
        }
        this.n.setKeepScreenOn(false);
        h();
        o();
    }

    private void ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1cc72a", new Object[]{this});
        } else if (this.U) {
        } else {
            long j = this.Q;
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            long j3 = this.T;
            if (j3 <= 0) {
                return;
            }
            long j4 = j3 - this.R;
            long j5 = j3 - j;
            long j6 = this.S;
            long j7 = j6 > 0 ? j3 - j6 : 0L;
            String valueOf = String.valueOf(j5);
            if (j7 >= 0) {
                j2 = j7;
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(this, "audio_start_play", valueOf, String.valueOf(j2), String.valueOf(j4), "");
            this.U = true;
            spz.c("music_album", "appear到prepared时长=" + j5 + "业务开始时间=" + this.Q + " 体验时长 = " + j7 + " startPlay到prepared时长=" + j4);
        }
    }
}
