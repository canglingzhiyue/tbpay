package tb;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.PageStartTimeBean;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.cards.video.manager.c;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.device.IDeviceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.z;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.slk;

/* loaded from: classes5.dex */
public class sjm implements aw, ax, ba, z, sjl, smr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f33626a;
    public static String b;
    private final FluidContext d;
    private final sii e;
    private final IContainerService f;
    private long g;
    private long h;
    private boolean i;
    private snv j;
    private PageStartTimeBean k;
    private int l;
    private int m;
    private String n;
    private final fkk o;
    public int q;
    public long r;
    private final Set<snv> c = new HashSet();
    private boolean p = false;

    @Override // tb.smr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        }
    }

    @Override // tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.sne
    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
        }
    }

    @Override // tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
        }
    }

    public static /* synthetic */ PageStartTimeBean a(sjm sjmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageStartTimeBean) ipChange.ipc$dispatch("ca3a1fad", new Object[]{sjmVar}) : sjmVar.k;
    }

    public static /* synthetic */ long b(sjm sjmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed5d8c97", new Object[]{sjmVar})).longValue() : sjmVar.g;
    }

    public static /* synthetic */ snv c(sjm sjmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("841ca4c7", new Object[]{sjmVar}) : sjmVar.j;
    }

    public static /* synthetic */ void d(sjm sjmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6399a5", new Object[]{sjmVar});
        } else {
            sjmVar.D();
        }
    }

    public static /* synthetic */ void e(sjm sjmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e6a026", new Object[]{sjmVar});
        } else {
            sjmVar.C();
        }
    }

    public static /* synthetic */ sii f(sjm sjmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sii) ipChange.ipc$dispatch("3b02138c", new Object[]{sjmVar}) : sjmVar.e;
    }

    static {
        kge.a(999727168);
        kge.a(-1381598051);
        kge.a(-855224269);
        kge.a(-1951056501);
        kge.a(-1226623529);
        kge.a(-123403623);
        kge.a(857599862);
        f33626a = 0;
        b = "";
    }

    public sjm(sii siiVar) {
        this.d = siiVar.z();
        this.e = siiVar;
        this.f = (IContainerService) this.d.getService(IContainerService.class);
        this.o = new fkk(siiVar);
        if (this.f == null) {
            FluidException.throwServiceNotFoundException(this.d, IContainerService.class);
        }
        siiVar.t().a(this);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : f33626a < 3;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        snv snvVar = this.j;
        if (snvVar == null) {
            return;
        }
        snvVar.j();
    }

    @Override // tb.sjl
    public int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : ocf.a(this.e.aa().g(), i);
    }

    public snv f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("3582d1de", new Object[]{this}) : this.j;
    }

    public Set<snv> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("7215bcdd", new Object[]{this}) : this.c;
    }

    @Override // tb.sjl
    public String cN_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b2a26205", new Object[]{this}) : this.e.Y().b();
    }

    @Override // tb.sjl
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e.Y().a(str, true);
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.l;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.m;
    }

    @Override // tb.sjl
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e.Y().a();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        snv snvVar = this.j;
        return snvVar != null && snvVar.e() == 1;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.j == null) {
        } else {
            c.a(this.e, "finished");
            int c = snf.c(this.e.z());
            if (c == 1) {
                this.j.b(false);
                this.e.P().onVideoStateChanged(this.e, 3);
                this.e.Q().onVideoStateChanged(this.e, 3);
                if (c == 1) {
                    ((IFeedsListService) this.d.getService(IFeedsListService.class)).publicNextVideo();
                }
            } else {
                this.j.b(true);
                this.e.c(false);
                this.e.P().onVideoStateChanged(this.e, 2);
                this.e.Q().onVideoStateChanged(this.e, 2);
                v();
            }
            this.e.aa().l();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.j == null || !s()) {
        } else {
            this.j.b();
        }
    }

    @Override // tb.sjl
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.j == null || !sil.b()) {
        } else {
            this.j.a(i, z);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        D();
        C();
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        snv snvVar = this.j;
        if (snvVar == null) {
            return;
        }
        snvVar.a(f);
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        spz.c(sny.TAG, "videotrack 11 video setPlayerVolume " + f + " ; mute:" + f.g(this.e.z()));
        if (this.j == null || f.g(this.e.z())) {
            return;
        }
        this.j.b(f);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.j == null) {
        } else {
            final boolean isFirstSetAdapter = ((ITrackService) this.d.getService(ITrackService.class)).isFirstSetAdapter();
            ((ITrackService) this.d.getService(ITrackService.class)).setFirstSetAdapter(false);
            this.j.a(new dde() { // from class: tb.sjm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dde
                public long getStartTime() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
                    }
                    if (!isFirstSetAdapter) {
                        return sjm.b(sjm.this);
                    }
                    spz.a("重置时间戳", "setFirstRenderAdapter:" + sjm.a(sjm.this).pageStartTime);
                    return sjm.a(sjm.this).pageStartTime;
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
        try {
            this.j.a("guangguang", true, this.e.ac().a(this.e.af()));
        } catch (Throwable th) {
            spz.a(sii.TAG, "", th);
            ljq.d(this.e, "errorSwitch");
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        snv snvVar = this.j;
        if (snvVar == null || !(map instanceof HashMap)) {
            return;
        }
        snvVar.a((HashMap) map);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            q();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!A()) {
        } else {
            if (x()) {
                bl c = this.e.W().c();
                if (c != null) {
                    spz.c(sii.TAG, "isContentValid为false，双列流续播播放器清空");
                    ViewGroup l = c.l();
                    if (l != null && (l.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) l.getParent()).removeView(l);
                    }
                    c.m();
                }
                String b2 = b.a().b(this.d.getInstanceConfig().getPreCoverKey());
                com.taobao.tao.flexbox.layoutmanager.player.c.a().b(true, b2);
                b.a().b();
                com.taobao.tao.flexbox.layoutmanager.player.c.a().c(b2);
            }
            snv dWInstance = ((ISharePlayerService) this.e.z().getService(ISharePlayerService.class)).getDWInstance();
            if (dWInstance == null) {
                return;
            }
            ViewGroup f = dWInstance.f();
            if (f != null && (f.getParent() instanceof ViewGroup)) {
                ((ViewGroup) f.getParent()).removeView(f);
            }
            dWInstance.d();
            ((ISharePlayerService) this.e.z().getService(ISharePlayerService.class)).setDWInstance(null);
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.i;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.j.e() == 2;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            ((IDeviceService) this.e.z().getService(IDeviceService.class)).addDeviceRotateListener(this);
        }
    }

    @Override // tb.smr
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.e.af() != null) {
            spz.c(sii.TAG, "全屏页内部画幅计算，收到sizeChange回调");
            this.e.ah().a(new sjq(this.e.af().n(), this.e.af().j()));
            sjs.a(this.e.z(), this.f.getWindowWidth(), ((IContainerService) this.d.getService(IContainerService.class)).getWindowHeight(), ((IContainerService) this.d.getService(IContainerService.class)).isHighActionbar(), ((IContainerService) this.d.getService(IContainerService.class)).getActionBarHeight(), this.e.ah().b(), false);
            int i = this.e.ah().b().l == 0 ? this.e.ah().b().c : this.e.ah().b().l;
            spz.c(sii.TAG, "画幅计算内部逻辑计算完成大屏-监听IS_TABLET_DEVICE_ROTATE,\nIVideoCommentSizeObject:" + this.e.ah().b().toString());
            this.e.ah().a(new FrameLayout.LayoutParams(this.e.ah().b().d, i));
            this.e.ah().a().topMargin = this.e.ah().b().e;
            spz.a(sii.TAG, "onRequestMediaByViewSharePlayer 增加videoView");
        }
        snv snvVar = this.j;
        if (snvVar == null) {
            return;
        }
        ViewGroup f = snvVar.f();
        FrameLayout.LayoutParams a2 = this.e.ah().a();
        f.setLayoutParams(a2);
        spz.c("DWInstanceManager", "rotate update, view: " + f + " ,layoutParams width:" + a2.width + " height:" + a2.height);
        this.j.a(a2.width, a2.height);
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        k();
        t();
        this.k = com.taobao.android.fluid.business.usertrack.track.a.b(this.e.z());
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
        } else if (this.e.J()) {
        } else {
            p();
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
        } else if (!sil.a(this.e.z())) {
        } else {
            boolean isFastScroll = ((IFeedsListService) this.e.z().getService(IFeedsListService.class)).isFastScroll();
            spz.c("DWInstanceManager", "CardLifecycle video cardo ShortVideoCard.onWillActive " + this.e.r() + " isFastScroll=" + isFastScroll);
            if (!isFastScroll) {
                return;
            }
            l();
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
        } else if (!sil.a(this.e.z()) && !son.u()) {
        } else {
            w();
            this.e.f(false);
        }
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        this.g = System.currentTimeMillis();
        this.h = SystemClock.uptimeMillis();
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.h;
        long j2 = uptimeMillis - j;
        if (j > 0) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("gg_card_stay_time", String.valueOf(j2));
            soi.a(this.j, hashMap);
        }
        spz.c("DWInstanceManager", "onRecycle  elapsedTime=" + j2 + " ; stayTimeStart=" + this.h);
        this.h = 0L;
    }

    public void u() {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (this.j == null) {
        } else {
            com.taobao.android.fluid.business.usertrack.track.b.c();
            spz.c(sii.TAG, "playerlifecycle IVideoPreCompleteListener.onPreCompletion id:" + this.e.w());
            c.a(this.e, "finished");
            slk.a collectionNextVideo = ((ICollectionService) this.d.getService(ICollectionService.class)).getCollectionNextVideo();
            boolean c = this.e.p().c().c();
            boolean z3 = collectionNextVideo != null && !c && !this.e.Y().b && (this.d.getService(INativeCollectionPoplayerService.class) == null || !((INativeCollectionPoplayerService) this.d.getService(INativeCollectionPoplayerService.class)).checkDialogPopup(this.d));
            if (z3) {
                ((ICollectionService) this.d.getService(ICollectionService.class)).playCollectionNextVideo();
            }
            spz.c(sii.TAG, "【onDWVideoPreComplete】playCollectionNext, canPlayCollectionNextVideo: " + z3 + "，isLandscape: " + c);
            int c2 = snf.c(this.e.z());
            if (c2 == 1) {
                this.j.b(false);
                this.e.P().onVideoStateChanged(this.e, 3);
                this.e.Q().onVideoStateChanged(this.e, 3);
                if (c2 == 1 && !z3) {
                    if (this.e.al()) {
                        this.e.ab().a("finished", "next", this.e);
                    } else {
                        ((IFeedsListService) this.d.getService(IFeedsListService.class)).publicNextVideo();
                        z = true;
                        spz.c(sii.TAG, "trackPlayCompleted nextVideo=" + c2 + ",isHookVideoEndGuidePersonPage=" + this.e.al());
                        if (c2 != 2 || this.e.al() || z3) {
                            z2 = true;
                        }
                        com.taobao.android.fluid.business.usertrack.track.b.a(this.e.z(), z, z2);
                        this.e.aa().l();
                    }
                }
            } else {
                this.j.b(false);
                if (!z3) {
                    if (this.e.al()) {
                        this.e.ab().a("finished", "loop", this.e);
                    } else {
                        this.j.b(true);
                        v();
                    }
                }
                this.e.P().onVideoStateChanged(this.e, 2);
                this.e.Q().onVideoStateChanged(this.e, 2);
            }
            z = false;
            spz.c(sii.TAG, "trackPlayCompleted nextVideo=" + c2 + ",isHookVideoEndGuidePersonPage=" + this.e.al());
            if (c2 != 2) {
            }
            z2 = true;
            com.taobao.android.fluid.business.usertrack.track.b.a(this.e.z(), z, z2);
            this.e.aa().l();
        }
    }

    @Override // tb.snz
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
        } else if (this.e.g().a(sii.CARD_MISS_VIDEO_STATUS_PAUSE) || this.j == null) {
        } else {
            spz.c(sii.TAG, "onPauseMedia(),id=" + this.e.w());
            if (son.u() && son.I()) {
                final snv snvVar = this.j;
                ihi.a(new Runnable() { // from class: tb.sjm.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            snvVar.c();
                        }
                    }
                }, 3003, 200L, "video_pause");
                return;
            }
            this.j.c();
        }
    }

    @Override // tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
        } else if (this.e.g().a(sii.CARD_MISS_VIDEO_STATUS_RECYCLE)) {
        } else {
            this.e.ad().f();
            if (this.j == null) {
                return;
            }
            spz.c(sii.TAG, "PickPreloadController，cflog CardLifecycle onRecyclePlayer " + this.e.r() + ",id=" + this.e.w());
            this.e.o().b = false;
            if (this.e.ag().c() != null) {
                this.e.Z().a(this.e.ag().c(), z);
                this.e.ag().a((View) null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            final snv snvVar = this.j;
            if (son.J()) {
                ihi.a(new Runnable() { // from class: tb.sjm.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        snv snvVar2 = snvVar;
                        if (snvVar2 == null) {
                            return;
                        }
                        snvVar2.d();
                    }
                }, 3003, 200L, "video_destroy");
            } else {
                snv snvVar2 = this.j;
                if (snvVar2 != null) {
                    snvVar2.d();
                }
            }
            pio.d(this.e.z(), System.currentTimeMillis() - currentTimeMillis);
            this.c.remove(this.j);
            this.j = null;
            f33626a--;
            spz.a(sii.TAG, "video count=" + f33626a);
        }
    }

    @Override // tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
        } else if (this.j != null || this.e.af() == null) {
        } else {
            this.e.g(false);
            String E = E();
            this.e.o().d();
            boolean b2 = this.e.W().b();
            boolean b3 = this.e.o().b();
            spz.c("DWInstanceManager", "isSharePlayerView:" + b2 + ",isInnerSharePlayerView:" + b3);
            if (b2) {
                this.j = this.e.W().a();
                this.n = "continuePlayOutside";
            } else if (b3) {
                this.j = this.e.o().a();
                this.n = "continuePlayInside";
            }
            if (this.e.l().a()) {
                spz.c("DWInstanceManager", "预创建");
                this.j = this.e.l().b();
                z = this.e.l().c();
            } else if (this.j != null && (b2 || b3)) {
                this.e.o().a(this.j, b2, b3);
                pio.b(pio.TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER);
                return;
            } else {
                this.j = this.e.i().a();
                this.n = "normal";
                n();
                if (spj.a(this.e.z())) {
                    HashMap<String, String> hashMap = new HashMap<>(1);
                    hashMap.put("bizGroup", "guangguang_fullscreen");
                    this.j.c(hashMap);
                }
                HashMap<String, String> hashMap2 = new HashMap<>(1);
                hashMap2.put("optSourcerPipeSize", "true");
                this.j.c(hashMap2);
                ((IMediaService) this.d.getService(IMediaService.class)).getConfig().a(true);
                this.j.a(DWInstanceType.VIDEO);
                ((ISharePlayerService) this.e.z().getService(ISharePlayerService.class)).setHasCreateDWInstance(true);
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            pio.a(this.e.z(), currentTimeMillis - this.e.ac().b());
            this.e.ac().a(currentTimeMillis);
            ViewParent parent = this.e.ad().c().getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e.ad().c());
            }
            if (oeb.a("ShortVideo.enableClosePlayFadeIn", true)) {
                this.j.d(false);
            }
            if (y()) {
                f.a(this.e.z(), this.j, this.e.z().getContext(), f.g(this.e.z()));
            }
            if (this.d.getService(INativeCollectionPoplayerService.class) != null && ((INativeCollectionPoplayerService) this.d.getService(INativeCollectionPoplayerService.class)).checkDialogPopup(this.d) && ((INativeCollectionPoplayerService) this.d.getService(INativeCollectionPoplayerService.class)).checkPopupFisrtTime(this.d) && com.taobao.android.fluid.business.videocollection.poplayer.a.b(this.d)) {
                spz.c("DWInstanceManager", "设置了封面图，false");
            } else {
                spz.c("DWInstanceManager", "设置了封面图，yes");
                this.j.a(this.e.ad().c());
            }
            m();
            this.e.ag().a(this.j.f());
            this.e.ag().b(this.e.ag().c(), this.e.ah().a());
            ljq.c(this.e, this.j.h());
            if (!z) {
                if (sns.d()) {
                    if (!spj.d(this.e.z()) && !snf.b()) {
                        d.b(this.e, "play");
                        spz.c(sii.TAG, "[上下滑] videoplaystate videotrack IDWVideoLifecycleListener FirstFrame onRequestMediaPlayer dw.start()");
                        this.j.a();
                    }
                } else if (!((IFeedsListService) this.e.z().getService(IFeedsListService.class)).isFastScroll()) {
                    spz.c("DWInstanceManager", "[上下滑] p2ff");
                    this.j.g();
                } else {
                    spz.c(sii.TAG, "[上下滑] ignore prepareToFirstFrame() for fast scroll");
                }
            }
            this.e.aa().e(this.e.af().f());
            f33626a++;
            this.e.ab().f12498a.put("totalTime", String.valueOf(this.e.af().f() / 1000));
            this.e.ab().f12498a.put("currentTime", "0");
            a(E, z, b2);
        }
    }

    @Override // tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        spz.c(sii.TAG, "VideoProcess ShortVideoCard.onStartMedia(), forcePlay:" + z + ",id:" + this.e.w());
        this.e.ab().d = false;
        if (!a(z)) {
            return;
        }
        c.a(this.e, "play");
        G();
        this.p = hhx.a(this.d, this.j, z2);
        spz.c("DWInstanceManager", "onStartMedia,videoAppearPlay是否是提前起播并设置播放器静音:" + this.p);
        bl c = this.e.W().c();
        if (this.e.W().b()) {
            c.e(f.g(this.e.z()));
            if (s()) {
                this.j.b();
            } else {
                this.j.a();
            }
        } else if (s()) {
            this.j.b();
        } else {
            d.b(this.e, "play");
            this.j.a();
            this.j.b(ljm.b(true));
        }
        a(this.j, z2);
        B();
        spz.a("changfeng", "VideoProcess ShortVideoCard.onStartMedia() end");
        sii siiVar = this.e;
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.a(siiVar, siiVar.af() != null ? this.e.af().l() : "");
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.a(this.e);
        spv.a().f33833a = false;
        fkk fkkVar = this.o;
        if (fkkVar == null) {
            return;
        }
        fkkVar.a();
    }

    private void G() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        int a2 = this.e.v().a();
        if (this.e.ac().c() == a2 && com.taobao.android.fluid.business.usertrack.track.b.a(this.e.z()) == a2) {
            z = false;
        }
        if (this.e.af() == null || !z) {
            return;
        }
        spz.a(sii.TAG, "PickPreloadController，onStartMedia updateIndex=:" + a2 + " OldIndex=" + this.e.ac().c());
        this.j.a(this.e.ac().a(this.e.af()));
        this.j.b(ljm.a(this.e.z(), ljm.a(this.e.z(), a2, this.e.af().f12530a), false));
        this.e.ac().a(a2);
    }

    private boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : ((ILifecycleService) this.e.z().getService(ILifecycleService.class)).getPageState() > 2;
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!b(z) || !H() || !I() || J()) {
            return false;
        }
        if (!this.p || this.j.e() != 1) {
            return true;
        }
        spz.c("DWInstanceManager", "onStartMedia,videoAppearPlay如果是appear提前播放，再次调用start的时候需要将播放器声音还原:" + this.p + ", mDWInstance.getVideoState():" + this.j.e());
        this.j.a(f.g(this.d));
        this.p = false;
        a(this.j, false);
        return false;
    }

    public void a(snv snvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c926f7", new Object[]{this, snvVar, new Boolean(z)});
            return;
        }
        IMediaService iMediaService = (IMediaService) this.e.z().getService(IMediaService.class);
        if (z || iMediaService == null) {
            return;
        }
        iMediaService.setCurrentPlayInstance(snvVar);
        iMediaService.setOnStateChangeFromSmallWindowToNormal(new IMediaService.a() { // from class: tb.sjm.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.media.IMediaService.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (sjm.c(sjm.this) == null) {
                } else {
                    sjm.d(sjm.this);
                    sjm.e(sjm.this);
                }
            }
        });
    }

    private boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.j == null || soi.d(this.d)) {
            return false;
        }
        if (!sij.c() || !this.j.l() || z) {
            return true;
        }
        spz.c("DWInstanceManager", "checkDWInstance videoAppearPlay isPausedBeforeDisappear：" + this.j.l() + "，forcePlay：" + z);
        return false;
    }

    private boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.b(this.d)) {
            return true;
        }
        spz.c("DWInstanceManager", "videoAppearPlay VideoProcess VideoComponentsController.onStartMedia(), UnderageModeHelper 青少年模式时间限制，禁止播放");
        return false;
    }

    private boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        boolean z = spv.a().f33833a;
        if (!this.e.am() || (this.j.e() != 1 && (z || this.j.e() != 8))) {
            return true;
        }
        spz.c("DWInstanceManager", "videoAppearPlay onStartMedia,innerSharePlayerBackToFullVideoPage:" + z + ", mDWInstance.getVideoState():" + this.j.e() + ",mIsWillActive:" + this.e.am());
        return false;
    }

    @Override // tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
            return;
        }
        spz.c(sii.TAG, "videotrack oprogressloading video onStopMedia,id=" + this.e.w());
        if (this.e.g().a("Stop")) {
            return;
        }
        this.e.ab().d = false;
        if (this.j != null) {
            if (z()) {
                this.j.a(0);
            }
            sii siiVar = this.e;
            siiVar.onPauseMedia(siiVar);
            w();
        }
        this.e.aa().a(0.0f);
        this.e.aa().a(0, 0);
    }

    @Override // tb.sne
    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
        } else if (!this.e.J() || !this.e.H()) {
        } else {
            w();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        d.f(this.e);
        jct.a(this.e.n());
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        IMediaService iMediaService = (IMediaService) this.e.z().getService(IMediaService.class);
        if (this.j == null || iMediaService == null || iMediaService.getCurrentPlayInstance() != this.j) {
            return;
        }
        iMediaService.setCurrentPlayInstance(null);
    }

    private boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableClearShareDwInstance", true);
    }

    private boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableRequestMediaPlayerMute", true);
    }

    private boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCutSeek0", false);
    }

    private boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDestoryMissMatchDW", true);
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        this.j.a((ba) this);
        this.j.a((ax) this);
    }

    @Override // com.taobao.avplayer.ba
    public void cJ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89fc57f", new Object[]{this});
            return;
        }
        this.e.P().onPreCompletion(this.e);
        this.e.Q().onPreCompletion(this.e);
        u();
    }

    @Override // com.taobao.avplayer.ax
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        this.e.P().onLoopCompletion(this.e);
        this.e.Q().onLoopCompletion(this.e);
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.j.a((z) this);
        }
    }

    @Override // com.taobao.avplayer.common.z
    public boolean hook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
        }
        this.e.P().hook(this.e);
        this.e.Q().hook(this.e);
        return false;
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            this.j.a((aw) this);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.e.P().onVideoStart(this.e);
        this.e.Q().onVideoStart(this.e);
        this.e.P().onVideoStateChanged(this.e, 1);
        spz.c("DWInstanceManager", "videoplaystate oprogressloading onVideoStart");
        snv snvVar = this.j;
        ViewGroup f = snvVar != null ? snvVar.f() : null;
        if (f == null) {
            return;
        }
        if (sjt.g()) {
            this.e.a((View) f);
        }
        a(f);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("DWInstanceManager", "videoplaystate oprogressloading onVideoPause b=" + z);
        this.e.P().onVideoPause(this.e, z);
        this.e.P().onVideoStateChanged(this.e, 0);
        this.e.Q().onVideoPause(this.e, z);
        this.e.Q().onVideoStateChanged(this.e, 0);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        spz.c("DWInstanceManager", "videoplaystate oprogressloading onVideoPlay");
        this.e.P().onVideoPlay(this.e);
        this.e.Q().onVideoPlay(this.e);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        spz.c("DWInstanceManager", "videoplaystate videotrack video onVideoSeekTo(). mSeekBarLayer.mCurrentProgress=" + this.e.aa().c() + " seekTo=" + i);
        this.e.P().onVideoSeekTo(this.e, i);
        this.e.Q().onVideoSeekTo(this.e, i);
        this.q = i;
        this.r = System.currentTimeMillis();
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        this.e.P().onVideoPrepared(this.e, obj);
        this.e.Q().onVideoPrepared(this.e, obj);
        this.e.o().b = false;
        spz.c("DWInstanceManager", "videoplaystate IDWVideoLifecycleListener onVideoPrepared() " + this.j);
        if ((sns.d() && !this.e.H() && !this.e.am() && this.j != null) || (this.j != null && ((ILifecycleService) this.e.z().getService(ILifecycleService.class)).getPageState() > 2)) {
            spz.c("DWInstanceManager", "IDWVideoLifecycleListener onVideoPrepared() pauseVideo");
            this.j.c();
        }
        snv snvVar = this.j;
        if (snvVar == null || this.p) {
            return;
        }
        snvVar.a(f.g(this.e.z()));
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.P().onVideoError(this.e, obj, i, i2);
        this.e.Q().onVideoError(this.e, obj, i, i2);
        snv snvVar = this.j;
        if (snvVar == null) {
            return;
        }
        this.e.a((View) snvVar.f());
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        snv snvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        this.e.P().onVideoInfo(this.e, obj, j, j2, j3, obj2);
        this.e.Q().onVideoInfo(this.e, obj, j, j2, j3, obj2);
        if (3 != j || (snvVar = this.j) == null) {
            return;
        }
        this.e.a((View) snvVar.f());
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        spz.c("DWInstanceManager", "videotrack video onVideoComplete");
        this.e.P().onVideoComplete(this.e);
        this.e.Q().onVideoComplete(this.e);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        spz.c("DWInstanceManager", "videotrack video onVideoClose");
        this.e.P().onVideoClose(this.e);
        this.e.Q().onVideoClose(this.e);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        spz.c("DWInstanceManager", "videotrack video onVideoScreenChanged");
        this.e.P().onVideoScreenChanged(this.e, dWVideoScreenType);
        this.e.Q().onVideoScreenChanged(this.e, dWVideoScreenType);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = i / 1000;
        if (this.m != i4) {
            this.l = i3 / 1000;
            this.m = i4;
        }
        this.e.P().onVideoProgressChanged(this.e, i, i2, i3);
        this.e.Q().onVideoProgressChanged(this.e, i, i2, i3);
        boolean c = this.e.o().c();
        if (c) {
            spz.a("DWInstanceManager", "onVideoProgressChanged，全屏页收到双列流是否首帧渲染完成：" + c + "，开关是否打开：" + sns.e());
            ((IContainerService) this.d.getService(IContainerService.class)).onFirstCardRenderSuccess(this.e);
            this.i = true;
            this.e.o().a(true);
        }
        if (this.q > 0 && this.e.aa().c() != i && i > this.q) {
            this.q = -1;
            spz.c("DWInstanceManager", "seek到进度条变化的时间差：" + (System.currentTimeMillis() - this.r));
        }
        this.e.aa().b(i);
        this.e.aa().a(i2);
        this.e.aa().c(i3);
        if (!this.e.aa().k()) {
            this.e.aa().a(0.0f, Math.max(i3, 0));
            this.e.aa().a(i);
            this.e.aa().a(i, i3);
        }
        if (this.e.ab().c != i4) {
            this.e.ab().a(i3 / 1000, this.e.ab().c);
        }
        fkk fkkVar = this.o;
        if (fkkVar == null) {
            return;
        }
        fkkVar.a(i);
    }

    private void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        pio.a(this.e.y(), this.j, this.e.z());
        long currentTimeMillis = System.currentTimeMillis();
        pio.b(this.e.z(), currentTimeMillis - this.e.ac().b());
        this.e.ac().a(currentTimeMillis);
        spz.a(sii.TAG, "video count=" + f33626a);
        this.e.p().a();
        this.e.v().a(false);
        ((ISharePlayerService) this.e.z().getService(ISharePlayerService.class)).setInnerSharePlayerObject(new spw(this.e.af() != null ? this.e.af().l() : "", this.j, this.e.ah().b()));
        pio.b(pio.TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER);
        HashMap hashMap = new HashMap();
        hashMap.put("dwType", z ? "1" : z2 ? "2" : "0");
        pil.a(this.e.y(), str, "gg_videoMutiTab_createDWInstance", hashMap);
    }

    private String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this});
        }
        spz.c(sii.TAG, "onRequestMediaPlayer(),id" + this.e.af().l());
        pio.a(pio.TRACE_VIDEOTAB_ONREQUESTMEDIAPLAYER);
        String j = spj.j(this.e.z());
        pil.a(this.e.y(), j, "gg_videoMutiTab_createDWInstance");
        this.e.ac().a(System.currentTimeMillis());
        this.g = 0L;
        return j;
    }

    public void a(final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (viewGroup == null) {
        } else {
            if ((viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0) || !sjt.k()) {
                return;
            }
            oec.a(new Runnable() { // from class: tb.sjm.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0) {
                    } else {
                        HashMap<String, String> a2 = com.taobao.android.fluid.business.usertrack.track.b.a(true, sjm.f(sjm.this).w(), (ViewGroup) sjm.f(sjm.this).B(), viewGroup);
                        spz.c("DWInstanceManager", "requestLayout in onVideoStart for size is 0, property: " + JSON.toJSONString(a2));
                        sjm.f(sjm.this).a(viewGroup);
                        com.taobao.android.fluid.business.usertrack.track.b.a(a2);
                    }
                }
            }, oeb.a("ShortVideo.ensureLayoutDelayTime", 100));
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.p;
    }
}
