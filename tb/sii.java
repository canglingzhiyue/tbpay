package tb;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.business.videocollection.poplayer.c;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.video.manager.CardMissVideoStatusManager;
import com.taobao.android.fluid.framework.card.cards.video.manager.a;
import com.taobao.android.fluid.framework.card.cards.video.manager.b;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.hni;

/* loaded from: classes5.dex */
public final class sii extends psy implements c, snz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_MISS_VIDEO_STATUS_PAUSE = "Pause";
    public static final String CARD_MISS_VIDEO_STATUS_RECYCLE = "Recycle";
    public static final String CARD_MISS_VIDEO_STATUS_STOP = "Stop";
    public static final String CARD_NAME = "视频卡";
    public static final int MAX_VIDEO_DELAY_TIME = 600;
    public static final String SCENCE_NAME = "guangguang";
    public static final String TAG = "ShortVideoCard";
    public static final String TAG_SHARE_PLAYER = "AVSDK_VideoComponentsControllSharePlayer";
    public static final Handler mHandler;
    private final com.taobao.android.fluid.framework.card.cards.video.manager.landscape.c A;
    private final sjj B;
    private final sjk C;
    private final siz D;
    private final sja E;
    private final sji F;
    private final sjn G;
    private final a H;
    private final sjb J;
    private final b K;
    private final siq L;
    private final sio M;
    private final siy N;
    private final sim O;
    private final sip P;
    private final sir Q;
    private final Handler S;
    private com.taobao.android.fluid.framework.card.cards.video.manager.playhint.a T;
    private a.d U;
    private boolean V;
    private boolean W;
    private boolean X;
    private final Handler Y;
    @Deprecated
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final shu f33603a;
    private int aa;
    private String ab;
    private hhy ac;
    private boolean ad;
    private final ljm b;
    private final com.taobao.android.fluid.framework.card.cards.video.manager.c c;
    private final sjm d;
    private final iyq i;
    private final CardMissVideoStatusManager y;
    private final sjr z;

    public static /* synthetic */ Object ipc$super(sii siiVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2136187174:
                super.onWillActive((psw) objArr[0]);
                return null;
            case -1961121033:
                super.onAppear((psw) objArr[0]);
                return null;
            case -1641646092:
                super.onShowFirstCover((psw) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (Drawable) objArr[3], (String) objArr[4]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1445568265:
                super.b(((Number) objArr[0]).floatValue());
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
            case -1118037008:
                super.onPauseMedia((psw) objArr[0]);
                return null;
            case -893732120:
                super.onActive((psw) objArr[0]);
                return null;
            case -616428025:
                super.onUTPairsUpdate((psw) objArr[0]);
                return null;
            case -424976904:
                super.onTabSelected();
                return null;
            case -364417224:
                super.onRequestMediaPlayer((psw) objArr[0]);
                return null;
            case -152376096:
                super.cI_();
                return null;
            case -129404994:
                super.onShowCover((psw) objArr[0]);
                return null;
            case -111711657:
                super.onRecycle((psw) objArr[0]);
                return null;
            case 95040273:
                super.onBindData((psw) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue(), (List) objArr[3]);
                return null;
            case 363259313:
                super.onTabUnSelected();
                return null;
            case 504096288:
                super.onBindData((psw) objArr[0], (com.taobao.android.fluid.framework.data.datamodel.a) objArr[1], ((Number) objArr[2]).intValue());
                return null;
            case 707300870:
                super.onStopMedia((psw) objArr[0]);
                return null;
            case 727149820:
                super.onRecyclePlayer((psw) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1325762037:
                super.onDataUpdate((psw) objArr[0]);
                return null;
            case 1342065796:
                super.onStartMedia((psw) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return null;
            case 1933403975:
                super.onDisAppear((psw) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private psy q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psy) ipChange.ipc$dispatch("8a23a2f8", new Object[]{this}) : this;
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
        return 0;
    }

    public static /* synthetic */ int a(sii siiVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da897a71", new Object[]{siiVar, new Integer(i)})).intValue();
        }
        siiVar.aa = i;
        return i;
    }

    public static /* synthetic */ FluidContext a(sii siiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("ddfcf403", new Object[]{siiVar}) : siiVar.e;
    }

    public static /* synthetic */ boolean a(sii siiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da89ba53", new Object[]{siiVar, new Boolean(z)})).booleanValue();
        }
        siiVar.X = z;
        return z;
    }

    public static /* synthetic */ psy b(sii siiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psy) ipChange.ipc$dispatch("4135140a", new Object[]{siiVar}) : siiVar.q();
    }

    public static /* synthetic */ boolean b(sii siiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc6783f2", new Object[]{siiVar, new Boolean(z)})).booleanValue();
        }
        siiVar.W = z;
        return z;
    }

    public static /* synthetic */ void c(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd0aa27", new Object[]{siiVar});
        } else {
            siiVar.au();
        }
    }

    public static /* synthetic */ sjj d(sii siiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjj) ipChange.ipc$dispatch("1079fa4b", new Object[]{siiVar}) : siiVar.B;
    }

    static {
        kge.a(-426449531);
        kge.a(854340662);
        kge.a(-1803047216);
        mHandler = new Handler(Looper.getMainLooper());
    }

    public sii(FluidContext fluidContext) {
        super(fluidContext);
        this.S = new Handler(Looper.getMainLooper()) { // from class: tb.sii.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                sii.this.S();
                spz.c(sii.TAG, "[上下滑] onPreloadVideoPlayerHandler videoAppearPlay 请求播放器,appeared:" + sii.this.I() + "，position" + sii.this.r());
                if (!sii.this.I()) {
                    return;
                }
                hhx.a(sii.a(sii.this), sii.b(sii.this), sii.this.r());
            }
        };
        this.V = false;
        this.Y = new Handler(Looper.getMainLooper()) { // from class: tb.sii.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                sii.c(sii.this);
                sii.this.b_(true);
                sii.this.T();
                sii.a(sii.this, true);
            }
        };
        this.Z = false;
        this.ad = false;
        this.d = new sjm(this);
        this.y = new CardMissVideoStatusManager(this);
        this.z = new sjr(this);
        this.B = new sjj(this);
        this.C = new sjk(this);
        this.D = new siz(this);
        this.E = new sja(this);
        this.F = new sji(this);
        this.A = new com.taobao.android.fluid.framework.card.cards.video.manager.landscape.c(this);
        this.b = new ljm(fluidContext, this);
        this.c = new com.taobao.android.fluid.framework.card.cards.video.manager.c(this);
        this.G = new sjn(this);
        this.f33603a = new shu(this);
        this.H = new com.taobao.android.fluid.framework.card.cards.video.manager.a(this);
        this.J = new sjb(this);
        this.K = new b(this);
        this.L = new siq(this.e, this);
        this.M = new sio(this.e, this);
        this.N = new siy(this.e, this);
        this.O = new sim(this.e, this);
        this.P = new sip(this.e, this);
        this.Q = new sir(this.e, this);
        this.i = new iyq(this.e, this);
    }

    public static int cg_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a1c4f75", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("delayDestroyTimeoutForGuangGuangPick", "60"));
        } catch (Throwable th) {
            spz.a(TAG, "", th);
            return 60;
        }
    }

    @Override // tb.psy, tb.psw, tb.shm
    public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        ogh.a("onBindData");
        super.onBindData(pswVar, aVar, i);
        spz.c(TAG, "onBindData position:" + i);
        this.z.a(aVar);
        a.c a2 = aVar.a();
        this.ab = a2 != null ? a2.I() : "";
        spo globalState = ((ISceneConfigService) this.e.getService(ISceneConfigService.class)).getGlobalState();
        int r = r();
        this.U = a2.E();
        onDataUpdate(pswVar);
        View findViewById = Z().d().findViewById(R.id.seek_bar_layout);
        if (findViewById != null) {
            obo.a(findViewById, aVar);
        }
        a(i, globalState, r);
        au();
        a(globalState, r);
        pio.b(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONBINDDATA);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onDataUpdate");
        super.onDataUpdate(pswVar);
        this.L.f();
        this.Q.o();
        this.ac.a(this);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onPauseMedia");
        super.onPauseMedia(pswVar);
        this.d.onPauseMedia(pswVar);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        ogh.a("onRecyclePlayer");
        super.onRecyclePlayer(pswVar, z);
        this.d.onRecyclePlayer(pswVar, z);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onRequestMediaPlayer");
        super.onRequestMediaPlayer(pswVar);
        this.d.onRequestMediaPlayer(pswVar);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onShowCover");
        super.onShowCover(pswVar);
        this.M.e();
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        ogh.a("onShowFirstCover");
        super.onShowFirstCover(pswVar, i, i2, drawable, str);
        this.M.a(i, i2, drawable, str);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        ogh.a("onStartMedia");
        super.onStartMedia(pswVar, z, z2);
        this.d.onStartMedia(pswVar, z, z2);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onStopMedia");
        super.onStopMedia(pswVar);
        this.d.onStopMedia(pswVar);
        ogh.b();
    }

    @Override // tb.psy, tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
            return;
        }
        super.onUTPairsUpdate(pswVar);
        if (this.d.f() == null || this.U == null) {
            return;
        }
        this.d.o();
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        snv h = h();
        VideoRoundCornerLayout c = this.L.c();
        if (h == null || h.f() != viewGroup || viewGroup.getParent() != c) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.n.findViewById(R.id.favor_frame);
        viewGroup2.forceLayout();
        c.forceLayout();
        viewGroup.forceLayout();
        this.n.forceLayout();
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeView(viewGroup2);
            viewGroup3.addView(viewGroup2, 0, at());
        }
        viewGroup2.removeView(c);
        viewGroup2.addView(c, 0, jqz.a());
        c.removeView(viewGroup);
        c.addView(viewGroup, 0, this.z.a());
        this.n.requestLayout();
    }

    private LinearLayout.LayoutParams at() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout.LayoutParams) ipChange.ipc$dispatch("b98ac191", new Object[]{this}) : new LinearLayout.LayoutParams(-1, 0, 1.0f);
    }

    @Override // tb.psy
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d.b(f);
        }
    }

    @Override // tb.psy
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.d.a(map);
        }
    }

    @Override // tb.psy
    public void a(Boolean bool, Boolean bool2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c4f948", new Object[]{this, bool, bool2});
        } else {
            this.P.a(bool, bool2);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d.e();
        }
    }

    public CardMissVideoStatusManager g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CardMissVideoStatusManager) ipChange.ipc$dispatch("e24569d3", new Object[]{this}) : this.y;
    }

    @Override // tb.psx
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : R.layout.fluid_sdk_ly_shortvideo_card;
    }

    @Override // tb.psw
    public View b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("70dee36a", new Object[]{this, viewGroup});
        }
        spz.c(TAG, "CardLifecycle ShortVideoCard.getCardLayoutView ");
        return new jqz().a(viewGroup.getContext());
    }

    @Override // tb.psw
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.ab;
    }

    @Override // tb.psw, tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!spj.e(this.e) || !this.r || !H() || !this.X) {
            return;
        }
        this.X = false;
        c(false);
    }

    @Override // tb.psw, tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        spz.c(TAG, "PageLifecycle video page ShortVideoCard.onPauseMedia " + r());
        if (spj.d(this.e)) {
            if (!this.r || !H()) {
                return;
            }
            if (juo.e()) {
                spz.c("PickPreloadController", "onPageDisappear(),commitEndForMultiplexing,id=" + w());
                spz.c("PickPreloadController", "onPauseMedia(),commitEndForMultiplexing");
                au();
                e();
                com.taobao.android.fluid.business.usertrack.track.b.c();
            } else {
                int cg_ = cg_();
                if (cg_ > 0) {
                    this.Y.removeMessages(0);
                    this.Y.sendEmptyMessageDelayed(0, cg_ * 1000);
                }
            }
        } else if (spj.e(this.e)) {
            if (!this.r || !H()) {
                return;
            }
            b_(true);
            T();
            this.X = true;
        }
        this.W = false;
    }

    @Override // tb.psw, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        super.cI_();
        spz.c(TAG, "PageLifecycle video page ShortVideoCard.onDestroy " + r());
        if (!this.r) {
            return;
        }
        au();
        b_(false);
    }

    @Override // tb.psw, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        ogh.a("onCreateView");
        super.onCreateView(pswVar, snpVar);
        spz.c(TAG, "CardLifecycle ShortVideoCard.onCreateView ");
        pio.a(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONINIT);
        this.T = new com.taobao.android.fluid.framework.card.cards.video.manager.playhint.a(this, this.L.c(), this.M.c(), this.Q.d());
        this.ac = new hhy(this);
        pio.b(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONINIT);
        this.v.addVideoPlayerListener(new hni.a() { // from class: tb.sii.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hni.a, tb.hni
            public void onVideoProgressChanged(psw pswVar2, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e6edd75", new Object[]{this, pswVar2, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                sii.a(sii.this, i);
                if (sii.this.k() != null) {
                    z = sii.this.k().F();
                }
                boolean c = sii.d(sii.this).c();
                if (z || c) {
                    return;
                }
                ((IUsePreloadService) sii.this.z().getService(IUsePreloadService.class)).startPreloadVideo(sii.this.E(), i, i3, i2);
            }
        });
        ogh.b();
    }

    @Override // tb.psw, tb.shm
    public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
            return;
        }
        ogh.a("onBindDataPayloads");
        super.onBindData(pswVar, aVar, i, list);
        this.z.a(aVar);
        a.c a2 = aVar.a();
        spz.c(TAG, "CardLifecycle ShortVideoCard.onBindData 2 position:" + i);
        this.U = a2.E();
        this.V = false;
        onDataUpdate(pswVar);
        V();
        ogh.b();
    }

    @Override // tb.psw, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onAppear");
        super.onAppear(pswVar);
        spz.c(TAG, "CardLifecycle video cardo ShortVideoCard.onAppear videoAppearPlay" + r() + " mVideoId=" + this.ab);
        if (!this.r) {
            ogh.b();
            return;
        }
        this.z.d();
        pio.a(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONAPPEAR);
        au();
        T();
        boolean isFastScroll = ((IFeedsListService) this.e.getService(IFeedsListService.class)).isFastScroll();
        spz.c(TAG, "onAppear,videoAppearPlay isFastScroll:" + isFastScroll);
        if (!isFastScroll) {
            this.S.sendEmptyMessageDelayed(0, 17L);
        }
        pio.b(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONAPPEAR);
        ogh.b();
    }

    @Override // tb.psw, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onDisAppear");
        super.onDisAppear(pswVar);
        if (!this.r) {
            ogh.b();
            return;
        }
        au();
        ogh.b();
    }

    @Override // tb.psw, tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onWillActive");
        super.onWillActive(pswVar);
        if (sil.a(this.e) || son.u()) {
            if (!this.r) {
                ogh.b();
                return;
            } else {
                au();
                ihi.a(new Runnable() { // from class: tb.sii.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        sii.this.S();
                        sii.this.c(false);
                        sii.b(sii.this, true);
                    }
                }, 3003, ihi.a(200), "startMedia");
            }
        }
        ogh.b();
    }

    @Override // tb.psw, tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onWillDisActive");
        super.onWillDisActive(pswVar);
        ogh.b();
    }

    @Override // tb.psw, tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onActive");
        super.onActive(pswVar);
        if (this.e.getService(INativeCollectionPoplayerService.class) != null) {
            ((INativeCollectionPoplayerService) this.e.getService(INativeCollectionPoplayerService.class)).setVideoResizeForCollectionPopLayer(this.e, this.ac, this.n, this);
        }
        if (!this.r) {
            ogh.b();
        } else if (!L() || ((ILifecycleService) this.e.getService(ILifecycleService.class)).getPageState() == 5) {
            ogh.b();
        } else {
            spz.c(TAG, "CardLifecycle video cardo ShortVideoCard.onActive ,adFlag:" + sju.b(this) + ",position:" + r() + " title=" + sju.a(this));
            pio.a(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONACTIVE);
            au();
            S();
            c(false);
            pio.b(pio.TRACE_VIDEOTAB_SHORTVIDEOCARD_ONACTIVE);
            ((ICardService) this.e.getService(ICardService.class)).setCardPrivateViewForegroundTime(System.currentTimeMillis());
            ogh.b();
        }
    }

    @Override // tb.psw, tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onDisActive");
        super.onDisActive(pswVar);
        if (!this.r) {
            ogh.b();
            return;
        }
        if (sil.a(this.e)) {
            ((ICardService) this.e.getService(ICardService.class)).setCardPrivateViewForegroundTime(0L);
        }
        this.ad = false;
        hhy hhyVar = this.ac;
        if (hhyVar != null) {
            hhyVar.a();
        }
        ogh.b();
    }

    @Override // tb.psw, tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            return;
        }
        ogh.a("onRecycle");
        super.onRecycle(pswVar);
        if (!this.r) {
            ogh.b();
            return;
        }
        au();
        ogh.b();
    }

    @Override // tb.psw, tb.sne
    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
            return;
        }
        super.onTabSelected();
        spz.c(TAG, "PageLifecycle video ShortVideoCard.onTabSelected " + r());
        if (!this.r || !H()) {
            return;
        }
        c(false);
    }

    @Override // tb.psw, tb.sne
    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
            return;
        }
        super.onTabUnSelected();
        if (!this.r) {
            return;
        }
        if (!H()) {
            au();
            b_(true);
            return;
        }
        spz.c(TAG, "PageLifecycle video ShortVideoCard.onTabUnSelected " + r());
        R();
    }

    @Override // tb.psw
    public void a(String str, com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e749458", new Object[]{this, str, aVar});
            return;
        }
        hhy hhyVar = this.ac;
        if (hhyVar == null) {
            return;
        }
        hhyVar.a(str, aVar);
    }

    @Override // tb.psw
    public void a(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5554e2", new Object[]{this, aVar});
            return;
        }
        hhy hhyVar = this.ac;
        if (hhyVar == null) {
            return;
        }
        hhyVar.a(aVar);
    }

    public snv h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("44e61c9c", new Object[]{this}) : this.d.f();
    }

    public sjj i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjj) ipChange.ipc$dispatch("4c97b183", new Object[]{this}) : this.B;
    }

    public sjm k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjm) ipChange.ipc$dispatch("5bfafc9e", new Object[]{this}) : this.d;
    }

    public sjk l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjk) ipChange.ipc$dispatch("63aca1bf", new Object[]{this}) : this.C;
    }

    public Handler m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("80298bd2", new Object[]{this}) : this.Y;
    }

    public sjb n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjb) ipChange.ipc$dispatch("730feb66", new Object[]{this}) : this.J;
    }

    public siz o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (siz) ipChange.ipc$dispatch("7ac18fec", new Object[]{this}) : this.D;
    }

    public com.taobao.android.fluid.framework.card.cards.video.manager.landscape.c p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.framework.card.cards.video.manager.landscape.c) ipChange.ipc$dispatch("92edc2f1", new Object[]{this}) : this.A;
    }

    public sja W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sja) ipChange.ipc$dispatch("c21a0fbe", new Object[]{this}) : this.E;
    }

    public sim X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sim) ipChange.ipc$dispatch("c9cbb2d0", new Object[]{this}) : this.O;
    }

    public sjn Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjn) ipChange.ipc$dispatch("d17d5c0f", new Object[]{this}) : this.G;
    }

    public siq Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (siq) ipChange.ipc$dispatch("d92efe0a", new Object[]{this}) : this.L;
    }

    public sir aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sir) ipChange.ipc$dispatch("6eaffaa3", new Object[]{this}) : this.Q;
    }

    public com.taobao.android.fluid.framework.card.cards.video.manager.c ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.framework.card.cards.video.manager.c) ipChange.ipc$dispatch("fe1a88ce", new Object[]{this}) : this.c;
    }

    public ljm ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljm) ipChange.ipc$dispatch("7e1019ee", new Object[]{this}) : this.b;
    }

    public sio ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sio) ipChange.ipc$dispatch("85c4ea63", new Object[]{this}) : this.M;
    }

    public int ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab2ade9e", new Object[]{this})).intValue() : this.aa;
    }

    public a.d af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.d) ipChange.ipc$dispatch("4ae1d8a8", new Object[]{this}) : this.U;
    }

    public siy ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (siy) ipChange.ipc$dispatch("9cd9dbb6", new Object[]{this}) : this.N;
    }

    public sjr ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjr) ipChange.ipc$dispatch("a48b83fd", new Object[]{this}) : this.z;
    }

    public String ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efcbd1", new Object[]{this});
        }
        a.d dVar = this.U;
        return dVar != null ? dVar.l() : "null";
    }

    public boolean ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[]{this})).booleanValue() : this.X;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.X = z;
        }
    }

    public boolean al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[]{this})).booleanValue() : this.Z;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public boolean am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[]{this})).booleanValue() : this.W;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.W = z;
        }
    }

    public boolean ar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[]{this})).booleanValue() : this.ad;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.ad = z;
        }
    }

    public void ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb7c9b5", new Object[]{this});
        } else {
            smk.a(z(), "4", null, String.valueOf(r()), null, null);
        }
    }

    private void a(int i, spo spoVar, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a98360a", new Object[]{this, new Integer(i), spoVar, new Integer(i2)});
            return;
        }
        if (!spoVar.b || i != 0) {
            z = false;
        }
        this.V = z;
        if (spoVar.b && i2 == 0) {
            odz a2 = ody.a().a(this.e.getInstanceConfig().getPreCoverKey());
            if (a2 == null) {
                a2 = this.e.getInstanceConfig().getCoverObject();
            }
            if (a2 != null && (a2.c() != null || a2.h() != null)) {
                spz.a(TAG_SHARE_PLAYER, "onBindData coverObject != null && (coverObject.getCover() != null || coverObject.getFirstFrameUrl()!=null");
                Drawable c = a2.c();
                if (a2.g() != null) {
                    spz.a(TAG_SHARE_PLAYER, "onBindData coverObject.getFirstFrame() != null,getFirstFrame:" + a2.g());
                    c = a2.g();
                }
                a(a2.a(), a2.b(), c, a2.h());
                return;
            }
            T();
            return;
        }
        T();
    }

    private void a(spo spoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cff3dd", new Object[]{this, spoVar, new Integer(i)});
            return;
        }
        au();
        if (spoVar.b && i == 0) {
            spoVar.b = false;
            S();
        } else if (!this.d.d()) {
        } else {
            int b = sij.b();
            if (b > 0 && b < 600) {
                this.S.sendEmptyMessageDelayed(0, b);
            } else if (b != 0) {
            } else {
                S();
            }
        }
    }

    private void au() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0c56bb", new Object[]{this});
            return;
        }
        spz.c(TAG, "videoAppearPlay,removePreCreatePlayerMessages");
        this.S.removeMessages(0);
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.c
    public void b(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1093c481", new Object[]{this, aVar});
            return;
        }
        hhy hhyVar = this.ac;
        if (hhyVar == null) {
            return;
        }
        hhyVar.a(aVar);
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.c
    public void b(String str, com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c67fa37", new Object[]{this, str, aVar});
            return;
        }
        hhy hhyVar = this.ac;
        if (hhyVar == null) {
            return;
        }
        hhyVar.a(str, aVar);
    }

    @Override // tb.psw
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        super.b(f);
        View d = aa().d();
        if (d == null) {
            return;
        }
        d.setAlpha(f);
    }
}
