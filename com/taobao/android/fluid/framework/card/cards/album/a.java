package com.taobao.android.fluid.framework.card.cards.album;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.album.AlbumViewGroup;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.PicElement;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.label.LabelContainer;
import com.taobao.android.label.LabelData;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.s;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import tb.kge;
import tb.ljm;
import tb.ljq;
import tb.ocb;
import tb.ogv;
import tb.psw;
import tb.psy;
import tb.riy;
import tb.shr;
import tb.sht;
import tb.shu;
import tb.slm;
import tb.smm;
import tb.snf;
import tb.snp;
import tb.snz;
import tb.soi;
import tb.sps;
import tb.spy;
import tb.spz;
import tb.suz;

/* loaded from: classes5.dex */
public final class a extends psy implements a.InterfaceC0490a, aw, ba, snz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View A;
    private Context B;
    private FluidContext C;
    private boolean D;
    private s E;
    private a.c F;
    private String G;
    private String H;
    private String I;
    private long J;
    private long K;
    private long L;
    private long M;
    private long N;
    private long O;
    private long P;
    private long Q;
    private long R;
    private boolean S;
    private boolean T;
    private boolean U;
    private LockableRecycerView W;
    private C0491a X;
    private LinearLayoutManager Y;
    private Context Z;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, String> f12466a;
    private TextView aa;
    private AlbumViewGroup ab;
    private int ac;
    private int ad;
    private final Handler ae;
    private final Handler b;
    private final HashMap<String, String> c;
    private final shu d;
    private final Set<s> y;
    private ViewGroup z;

    static {
        kge.a(-674593571);
        kge.a(-857402716);
        kge.a(854340662);
        kge.a(-1951056501);
        kge.a(-1453226889);
        kge.a(-123403623);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case -893732120:
                super.onActive((psw) objArr[0]);
                return null;
            case -424976904:
                super.onTabSelected();
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

    @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.psx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "图集卡";
    }

    @Override // tb.psx
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public static /* synthetic */ s a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("21fc5b5e", new Object[]{aVar}) : aVar.E;
    }

    public static /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7741ee49", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.b(i);
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2ce344", new Object[]{aVar, str});
        } else {
            aVar.b(str);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77422e1e", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.T = z;
        return z;
    }

    public static /* synthetic */ void b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462e34e3", new Object[]{aVar, str});
        } else {
            aVar.d(str);
        }
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22a2cf5d", new Object[]{aVar})).booleanValue() : aVar.T;
    }

    public static /* synthetic */ String c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c5c025e", new Object[]{aVar, str}) : aVar.a(str);
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a69ab8", new Object[]{aVar});
        } else {
            aVar.m();
        }
    }

    public static /* synthetic */ LinearLayoutManager d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayoutManager) ipChange.ipc$dispatch("e45affa7", new Object[]{aVar}) : aVar.Y;
    }

    public static /* synthetic */ C0491a e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0491a) ipChange.ipc$dispatch("2a608eeb", new Object[]{aVar}) : aVar.X;
    }

    public static /* synthetic */ FluidContext f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("9558a653", new Object[]{aVar}) : aVar.C;
    }

    public static /* synthetic */ LockableRecycerView g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LockableRecycerView) ipChange.ipc$dispatch("f9c940ec", new Object[]{aVar}) : aVar.W;
    }

    public static /* synthetic */ int h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46b99386", new Object[]{aVar})).intValue() : aVar.ac;
    }

    public static /* synthetic */ Handler i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e0aa3694", new Object[]{aVar}) : aVar.ae;
    }

    public static /* synthetic */ a.c j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.c) ipChange.ipc$dispatch("16eb5eee", new Object[]{aVar}) : aVar.F;
    }

    public static /* synthetic */ snp k(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snp) ipChange.ipc$dispatch("810a8c01", new Object[]{aVar}) : aVar.o;
    }

    public static /* synthetic */ Context l(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8fb6a307", new Object[]{aVar}) : aVar.B;
    }

    public a(FluidContext fluidContext) {
        super(fluidContext);
        this.f12466a = new HashMap<>();
        this.b = new Handler(Looper.getMainLooper());
        this.c = new HashMap<>();
        this.y = new HashSet();
        this.O = 0L;
        this.P = 0L;
        this.Q = 0L;
        this.R = 0L;
        this.S = false;
        this.U = false;
        this.ad = -1;
        this.ae = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.card.cards.album.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (!a.this.H()) {
                } else {
                    int findFirstVisibleItemPosition = a.d(a.this).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition == a.e(a.this).c() - 1 && snf.c(a.f(a.this)) == 1) {
                        ((IFeedsListService) a.f(a.this).getService(IFeedsListService.class)).publicNextVideo();
                        a.e(a.this).a();
                        a.b(a.this, "finished");
                    } else if (a.e(a.this).c() <= 1) {
                    } else {
                        if (a.e(a.this).c() - 1 == findFirstVisibleItemPosition) {
                            a.b(a.this, "finished");
                            a.b(a.this, "play");
                        }
                        a.g(a.this).smoothScrollBy(a.g(a.this).getWidth(), 0);
                        a.i(a.this).sendEmptyMessageDelayed(0, a.h(a.this));
                    }
                }
            }
        };
        this.d = new shu(this);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else if (this.E == null) {
        } else {
            this.R = SystemClock.elapsedRealtime();
            ljq.d(this, "prepared");
            boolean g = f.g(this.C);
            this.E.a(g);
            spz.c("AudioComponentsController", "onVideoPrepared mIsAppear = " + this.D + " mute=" + g);
            if (!this.U || !com.taobao.android.fluid.framework.card.cards.album.b.c()) {
                p();
            }
            if (!this.D) {
                this.T = true;
                this.E.b();
            } else {
                m();
            }
            X();
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (this.E == null) {
        } else {
            spz.c("AudioComponentsController", "onVideoError " + obj + " i=" + i + " i1=" + i2);
            StringBuilder sb = new StringBuilder();
            sb.append("error(");
            sb.append(i);
            sb.append(riy.BRACKET_END_STR);
            ljq.d(this, sb.toString());
            if (!this.y.contains(this.E)) {
                spz.c("AudioComponentsController", "onVideoError  restart");
                this.y.add(this.E);
                this.E.a();
                ljq.d(this, "retry");
                return;
            }
            ljq.a(this, String.valueOf(i), "");
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        long j = this.M;
        if (j <= 0 || j >= i3 || i < j) {
            return;
        }
        this.E.d(Math.max((int) this.L, 0));
        b("play");
    }

    public void cc_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2348ed06", new Object[]{this});
            return;
        }
        this.D = false;
        if (this.E == null) {
            return;
        }
        i();
    }

    @Override // tb.psx
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : R.layout.fluid_sdk_ly_album_card;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.o.getAdapterPosition();
    }

    @Override // tb.psw
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.F.c;
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
        q();
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
        W();
    }

    @Override // tb.psw, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        this.ac = (int) (ocb.b(((IDataService) this.C.getService(IDataService.class)).getConfig().j().v) * 1000.0f);
        n();
    }

    @Override // tb.psw, tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        super.onAppear(pswVar);
        if (!this.r) {
            return;
        }
        if (!((IFeedsListService) this.C.getService(IFeedsListService.class)).isFastScroll()) {
            k();
        }
        this.W.scrollToPosition(0);
        this.ad = 0;
        this.aa.setText(j_(this.ad));
    }

    @Override // tb.psw, tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            return;
        }
        super.onDisAppear(pswVar);
        if (!this.r) {
            return;
        }
        this.ae.removeMessages(0);
        this.X.f();
        bK_();
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
        q();
        c(this.ad);
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
        W();
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
        this.ae.removeMessages(0);
        this.X.f();
        bK_();
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
        q();
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
        W();
    }

    @Override // tb.psy, tb.psw, tb.shm
    public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        super.onBindData(pswVar, aVar, i);
        a.c a2 = aVar.a();
        this.F = a2;
        if (!this.r) {
            return;
        }
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(this.C, this);
        this.C = z();
        this.z = (ViewGroup) this.n;
        this.A = this.A;
        this.F = this.F;
        this.B = this.A.getContext();
        this.D = false;
        o();
        MediaContentDetailData i2 = a2.i();
        if (i2 == null || i2.content == null) {
            return;
        }
        this.X.a(com.taobao.android.fluid.framework.data.datamodel.a.b(i2));
    }

    @Override // tb.psy, tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
        } else {
            g();
        }
    }

    @Override // tb.psy, tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
        } else {
            bK_();
        }
    }

    @Override // tb.psy, tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
        } else {
            k();
        }
    }

    @Override // tb.psy, tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
        } else if (soi.d(this.C)) {
        } else {
            h();
        }
    }

    @Override // tb.psy, tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
        } else {
            i();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.E == null) {
        } else {
            this.b.post(new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this).b();
                        a.a(a.this, "pause");
                    }
                }
            });
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.E == null) {
        } else {
            this.b.post(new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null) {
                    } else {
                        int j = a.a(a.this).j();
                        spz.c("AudioComponentsController", "playVideo " + j);
                        if (j == 1 || j == 8) {
                            return;
                        }
                        if (j != 2) {
                            a.a(a.this).a();
                            return;
                        }
                        a.a(a.this).g();
                        if (a.b(a.this)) {
                            a.c(a.this);
                        } else {
                            a.a(a.this, "resume");
                        }
                        a.a(a.this, false);
                    }
                }
            });
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.E == null) {
        } else {
            this.b.post(new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this).d(0);
                        a.a(a.this).b();
                    }
                }
            });
        }
    }

    public void bK_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56e62dd", new Object[]{this});
            return;
        }
        s sVar = this.E;
        if (sVar == null) {
            return;
        }
        sVar.c();
        this.E.f();
        this.y.remove(this.E);
        this.E = null;
        b("destroy");
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.E != null || this.F == null || TextUtils.isEmpty(this.H)) {
        } else {
            sps sessionParams = ((ISceneConfigService) this.C.getService(ISceneConfigService.class)).getSessionParams();
            s.a aVar = new s.a((Activity) this.B);
            aVar.h(true);
            boolean a2 = com.taobao.android.fluid.framework.card.cards.album.b.a();
            if (a2) {
                aVar.b(1);
                aVar.c(1);
            }
            if (com.taobao.android.fluid.framework.card.cards.album.b.c()) {
                if (com.taobao.android.fluid.framework.card.cards.album.b.e()) {
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
            aVar.a(ljm.a(this.C, e(), this.F));
            aVar.b(new HashMap<>(((ITrackService) this.C.getService(ITrackService.class)).getActiveCardCommonTrack()));
            aVar.f(this.C.getInstanceConfig().getPlayScenes());
            if (sessionParams != null) {
                aVar.b(sessionParams.c);
            }
            this.E = aVar.a();
            this.E.a((aw) this);
            this.E.a((ba) this);
            f.b(this.C, this.E);
            spz.c("AudioComponentsController", "requestVideoPlayerIfNeeded state=" + this.E.j() + " " + this.F.y() + " section(" + this.L + "," + this.M + riy.BRACKET_END_STR);
            if (com.taobao.android.fluid.framework.card.cards.album.b.c() && com.taobao.android.fluid.framework.card.cards.album.b.d()) {
                this.E.d();
                this.E.a();
            } else {
                this.E.a();
            }
            this.E.a(ljm.b(true));
            ljq.c(this, this.E.r());
            if (!a2) {
                return;
            }
            ((ViewGroup) this.A).addView(this.E.e(), new ViewGroup.LayoutParams(-2, -2));
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
        b("finish");
        p();
        b("play");
    }

    public void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.L = j;
        this.M = j2;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.D = true;
        if (this.E == null || soi.d(this.C)) {
            return;
        }
        this.K = SystemClock.elapsedRealtime();
        this.P = this.K;
        h();
    }

    private String a(String str) {
        Map<String, String> activeCardCommonTrack;
        sps sessionParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.F == null || (activeCardCommonTrack = ((ITrackService) this.C.getService(ITrackService.class)).getActiveCardCommonTrack()) == null || (sessionParams = ((ISceneConfigService) this.C.getService(ISceneConfigService.class)).getSessionParams()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(activeCardCommonTrack);
        jSONObject.put("contentId", (Object) this.F.g());
        jSONObject.put("video_spm_cnt", (Object) activeCardCommonTrack.get("spm-cnt"));
        jSONObject.put("video_spm_url", (Object) activeCardCommonTrack.get("spm-url"));
        jSONObject.put("page", (Object) sessionParams.c);
        jSONObject.remove("trackInfo");
        jSONObject.remove(com.taobao.taolive.room.utils.aw.PARAM_UT_PARAMS);
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(com.taobao.taolive.room.utils.aw.PARAM_UT_PARAMS, jSONObject.toJSONString());
        if (slm.a(sessionParams.B)) {
            buildUpon.appendQueryParameter("umpChannel", sessionParams.B);
            buildUpon.appendQueryParameter("u_channel", sessionParams.B);
        }
        return buildUpon.toString();
    }

    private void a(s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dd992f", new Object[]{this, aVar});
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            JSONArray jSONArray = new JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("cacheKey", this.I);
            jSONObject2.put("definition", "hd_265");
            jSONObject2.put(com.taobao.android.weex_framework.util.a.ATOM_length, this.J);
            jSONObject2.put("video_url", this.H);
            jSONArray.put(jSONObject2);
            if (!TextUtils.isEmpty(this.I)) {
                jSONObject.put("caches", jSONArray);
            }
            jSONObject.put("resources", jSONArray);
            aVar.d("TBVideo");
            aVar.a(jSONObject);
        } catch (Throwable th) {
            spz.a("AudioComponentsController", "", th);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (this.K > 0) {
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(this, "audio_ff", String.valueOf(SystemClock.elapsedRealtime() - this.K), "", "", "");
        }
        b("play");
    }

    private String j_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a6a039", new Object[]{this, new Integer(i)});
        }
        int size = this.X.b().size();
        if (size == 0) {
            return null;
        }
        return ((i % size) + 1) + " / " + size;
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.Z = this.n.getContext();
        this.W = (LockableRecycerView) this.o.a(R.id.recyclerView);
        this.aa = (TextView) this.o.a(R.id.tv_indicator);
        this.Y = new LinearLayoutManager(this.Z, 0, false) { // from class: com.taobao.android.fluid.framework.card.cards.album.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                if (str.hashCode() == 1046880189) {
                    return new Integer(super.getExtraLayoutSpace((RecyclerView.State) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.LinearLayoutManager
            public int getExtraLayoutSpace(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3e661fbd", new Object[]{this, state})).intValue() : super.getExtraLayoutSpace(state) + 100;
            }
        };
        this.W.setLayoutManager(this.Y);
        com.taobao.android.fluid.common.view.a aVar = new com.taobao.android.fluid.common.view.a();
        aVar.attachToRecyclerView(this.W);
        this.X = new C0491a();
        this.W.setAdapter(this.X);
        this.ab = (AlbumViewGroup) this.o.a(R.id.vg_album);
        this.ab.setOnTouchedListener(new AlbumViewGroup.a() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.card.cards.album.AlbumViewGroup.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                a.i(a.this).removeMessages(0);
                a.e(a.this).f();
            }
        });
        this.W.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 anonymousClass8, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    return;
                }
                int findFirstVisibleItemPosition = a.d(a.this).findFirstVisibleItemPosition();
                int c = a.e(a.this).c();
                if (findFirstVisibleItemPosition == c) {
                    a.e(a.this).notifyItemRangeRemoved(0, c);
                    a.e(a.this).notifyItemRangeInserted(c, c);
                }
                a.a(a.this, findFirstVisibleItemPosition);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    super.onScrolled(recyclerView, i, i2);
                }
            }
        });
        aVar.a(this);
    }

    @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b(i);
        }
    }

    private void o() {
        MediaContentDetailData.Content content;
        MediaContentDetailData.MusicInfoVO musicInfoVO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        a.c cVar = this.F;
        if (cVar == null || cVar.i() == null || (content = this.F.i().content) == null) {
            return;
        }
        if (this.F.t()) {
            this.H = content.music;
        } else if (this.F.y() && (musicInfoVO = content.musicInfoVO) != null) {
            if (musicInfoVO.audioResources != null && musicInfoVO.audioResources.size() > 0) {
                MediaContentDetailData.MusicInfoVO.AudioResources audioResources = musicInfoVO.audioResources.get(0);
                this.H = audioResources.url;
                this.G = String.valueOf(audioResources.audioId);
                this.N = audioResources.duration;
                this.I = audioResources.cacheKey;
                this.J = audioResources.fileSize;
            }
            if (musicInfoVO.musicParams != null && musicInfoVO.musicParams.playPairs != null) {
                a(musicInfoVO.musicParams.playPairs.startTime, musicInfoVO.musicParams.playPairs.endTime);
            }
        }
        if (TextUtils.isEmpty(this.F.i().publishStatus) || TextUtils.isEmpty(this.F.f().music) || !TextUtils.isEmpty(this.H)) {
            return;
        }
        this.H = this.F.f().music;
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.ad == i) {
        } else {
            this.ad = i;
            this.aa.setText(j_(i));
            if (this.X.d()) {
                com.taobao.android.fluid.business.usertrack.track.b.d(this.C);
            }
            c(i);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        s sVar = this.E;
        if (sVar == null) {
            return;
        }
        long l = sVar.l();
        spz.c("AudioComponentsController", "seekToSectionStart mAudioSectionStart=" + this.L + " " + this.M + " duration=" + l);
        long j = this.L;
        if (j <= 0 || j >= l) {
            return;
        }
        this.E.d((int) j);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        spz.a("AudioComponentsController", "sendAudioStateMsg state= " + str);
        this.f12466a.put("state", str);
        a.c cVar = this.F;
        if (cVar == null) {
            return;
        }
        ((IMessageService) this.C.getService(IMessageService.class)).sendMessage(new spy("VSMSG_audioStateChanged", cVar.c, this.f12466a));
    }

    private void c(String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (str == null || (a2 = smm.a(str)) == null) {
        } else {
            ((IMessageService) this.C.getService(IMessageService.class)).sendMessage(new spy(a2, this.F.c, this.c));
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.c.put("state", str);
        ((IMessageService) this.C.getService(IMessageService.class)).sendMessage(new spy(suz.VIDEO_STATE_CHANGE_NAME, this.F.c, this.c));
        c(str);
    }

    private void b(s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8a44ce", new Object[]{this, aVar});
            return;
        }
        long j = this.N;
        long j2 = this.L;
        if (j2 <= 0 || j2 >= j) {
            return;
        }
        this.U = true;
        aVar.d((int) j2);
    }

    private void c(s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb36f06d", new Object[]{this, aVar});
            return;
        }
        aVar.a(this.H);
        aVar.d("TBAudio");
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        k();
        l();
        this.ab.resetTouched();
        this.X.e();
        d("play");
        this.ae.removeMessages(0);
        this.ae.sendEmptyMessageDelayed(0, this.ac);
        this.n.setKeepScreenOn(true);
    }

    private void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        this.ae.removeMessages(0);
        this.X.f();
        cc_();
        bK_();
        this.n.setKeepScreenOn(false);
    }

    private void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
        } else if (this.S) {
        } else {
            long j = this.O;
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            long j3 = this.R;
            if (j3 <= 0) {
                return;
            }
            long j4 = j3 - this.P;
            long j5 = j3 - j;
            long j6 = this.Q;
            long j7 = j6 > 0 ? j3 - j6 : 0L;
            String valueOf = String.valueOf(j5);
            if (j7 >= 0) {
                j2 = j7;
            }
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(this, "audio_start_play", valueOf, String.valueOf(j2), String.valueOf(j4), "");
            this.S = true;
            spz.c("music_album", "appear到prepared时长=" + j5 + "业务开始时间=" + this.O + " 体验时长 = " + j7 + " startPlay到prepared时长=" + j4);
        }
    }

    private void a(List<PicElement> list, int i, int i2) {
        PicElement picElement;
        List<PicElement.Anchor> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6e9779", new Object[]{this, list, new Integer(i), new Integer(i2)});
        } else if (i2 >= 0 && i2 < i && (picElement = list.get(i2)) != null && (list2 = picElement.anchors) != null) {
            for (PicElement.Anchor anchor : list2) {
                if (anchor != null && !TextUtils.isEmpty(anchor.itemId)) {
                    com.taobao.android.fluid.business.usertrack.track.b.b(this.C, anchor.itemId);
                }
            }
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        List<PicElement> b2 = this.X.b();
        int size = b2.size();
        if (size == 0) {
            return;
        }
        int i2 = i % size;
        com.taobao.android.fluid.business.usertrack.track.b.b(this.C, i2);
        a(b2, size, i2);
    }

    /* renamed from: com.taobao.android.fluid.framework.card.cards.album.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0491a extends RecyclerView.Adapter<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final List<PicElement> b;
        private boolean c;

        static {
            kge.a(-214989333);
        }

        private C0491a() {
            this.b = new ArrayList();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
            } else {
                a(bVar, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.taobao.android.fluid.framework.card.cards.album.a$b] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public void a() {
            int c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.c || (c = c()) == 1) {
            } else {
                this.c = true;
                notifyItemRangeRemoved(c, c);
            }
        }

        public List<PicElement> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
        }

        public void a(List<PicElement> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            this.b.clear();
            if (ogv.b(list)) {
                this.b.addAll(list);
            }
            a.e(a.this).notifyDataSetChanged();
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b.size();
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c;
        }

        public b a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c8c27ad0", new Object[]{this, viewGroup, new Integer(i)}) : new b(viewGroup);
        }

        public void a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88a85887", new Object[]{this, bVar, new Integer(i)});
            } else {
                bVar.a(this.b.get(i % this.b.size()));
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            int size = this.b.size();
            if (size == 1) {
                return 1;
            }
            return this.c ? size : size * 2;
        }

        public void e() {
            int c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (!this.c || (c = c()) == 1) {
            } else {
                this.c = false;
                a.e(a.this).notifyItemRangeInserted(c, c);
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            } else if (this.c) {
            } else {
                a.b(a.this, "pause");
                int c = c();
                if (c == 1) {
                    return;
                }
                this.c = true;
                notifyItemRangeRemoved(c, c);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final IMessageService b;
        private final TUrlImageView c;
        private LabelContainer d;

        static {
            kge.a(2113170581);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ IMessageService a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IMessageService) ipChange.ipc$dispatch("f673751", new Object[]{bVar}) : bVar.b;
        }

        public b(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_item_album_card, viewGroup, false));
            this.c = (TUrlImageView) this.itemView.findViewById(R.id.img_pic);
            this.b = (IMessageService) a.f(a.this).getService(IMessageService.class);
            this.itemView.setOnClickListener(new shr(new sht.a() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sht.a, tb.sht
                public void onDoubleClick(float f, float f2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
                        return;
                    }
                    ((IFeedsListService) a.f(a.this).getService(IFeedsListService.class)).setAutoLock(false);
                    spy spyVar = new spy("VSMSG_doubleClickFavor", a.j(a.this).c, null);
                    spy spyVar2 = new spy("VSMSG_requestFavor", a.j(a.this).c, null);
                    b.a(b.this).sendMessage(spyVar);
                    b.a(b.this).sendMessage(spyVar2);
                }

                @Override // tb.sht.a, tb.sht
                public boolean onLongClick(boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
                    }
                    b.a(b.this).sendMessage(new spy("VSMSG_longPress", a.j(a.this).c, null));
                    return false;
                }

                @Override // tb.sht.a, tb.sht
                public void onPendingClick() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
                    } else {
                        ((IFeedsListService) a.f(a.this).getService(IFeedsListService.class)).setAutoLock(true);
                    }
                }
            }));
            String str = ((IDataService) a.f(a.this).getService(IDataService.class)).getConfig().j().B;
            if (!TextUtils.isEmpty(str)) {
                FluidSDK.getImageAdapter().load(str, new com.taobao.android.fluid.framework.adapter.mtop.a<String, BitmapDrawable>() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.fluid.framework.adapter.mtop.a
                    public void a(String str2, BitmapDrawable bitmapDrawable) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("cc1cd0a7", new Object[]{this, str2, bitmapDrawable});
                            return;
                        }
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (bitmap == null) {
                            return;
                        }
                        ((FscrmidFavorFrameLayout) a.k(a.this).a(R.id.favor_frame)).setBitmap(bitmap);
                    }
                });
            }
        }

        public void a(PicElement picElement) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d094a459", new Object[]{this, picElement});
                return;
            }
            d dVar = new d(picElement.width, picElement.height);
            c.a(((IContainerService) a.f(a.this).getService(IContainerService.class)).getWindowWidth(), ((IContainerService) a.f(a.this).getService(IContainerService.class)).getWindowHeight() - ((IContainerService) a.f(a.this).getService(IContainerService.class)).getActionBarHeight(), dVar);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dVar.d, dVar.c);
            layoutParams.leftMargin = dVar.f;
            layoutParams.topMargin = dVar.e;
            this.c.setLayoutParams(layoutParams);
            View view = this.d;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            }
            this.d = new LabelContainer(this.itemView.getContext());
            this.d.enableMove(false);
            ((ViewGroup) this.itemView).addView((View) this.d, (ViewGroup.LayoutParams) layoutParams);
            if (TextUtils.isEmpty(picElement.getDecideUrl())) {
                picElement.setDecideUrl(FluidSDK.getImageAdapter().decideUrl(picElement.url, dVar.d, dVar.c));
            }
            this.c.setImageUrl(picElement.getDecideUrl());
            this.c.setScaleType(ImageView.ScaleType.FIT_CENTER);
            b(picElement);
        }

        private void b(PicElement picElement) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac56201a", new Object[]{this, picElement});
                return;
            }
            List<PicElement.Anchor> list = picElement.anchors;
            LabelContainer labelContainer = this.d;
            if (labelContainer == null) {
                return;
            }
            labelContainer.removeAllViews();
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (PicElement.Anchor anchor : list) {
                LabelData labelData = new LabelData();
                labelData.content = anchor.text;
                labelData.posX = anchor.x / 100.0d;
                labelData.posY = anchor.y / 100.0d;
                labelData.direction = labelData.posX > 0.5d ? 0 : 1;
                labelData.extra.put("targetUrl", anchor.targetUrl);
                labelData.extra.put("itemId", anchor.itemId);
                arrayList.add(labelData);
            }
            this.d.setMarkList(arrayList);
            this.d.setLabelEventListener(new com.taobao.android.label.f() { // from class: com.taobao.android.fluid.framework.card.cards.album.a.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void a(View view, LabelData labelData2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7870d789", new Object[]{this, view, labelData2});
                    }
                }

                public boolean a(LabelData labelData2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("24bb398b", new Object[]{this, labelData2})).booleanValue();
                    }
                    String c = a.c(a.this, (String) labelData2.extra.get("targetUrl"));
                    if (!TextUtils.isEmpty(c)) {
                        FluidSDK.getNavAdapter().nav(a.f(a.this), a.l(a.this), c, null);
                    }
                    com.taobao.android.fluid.business.usertrack.track.b.a(a.f(a.this), (String) labelData2.extra.get("itemId"));
                    return true;
                }
            });
        }
    }
}
