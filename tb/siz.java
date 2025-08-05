package tb;

import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.tao.flexbox.layoutmanager.player.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class siz implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33618a = false;
    public boolean b;
    private final FluidContext c;
    private final sii d;

    static {
        kge.a(-2007459816);
        kge.a(-1336580603);
        kge.a(1755210026);
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ sii a(siz sizVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sii) ipChange.ipc$dispatch("3cc4521f", new Object[]{sizVar}) : sizVar.d;
    }

    public siz(sii siiVar) {
        this.c = siiVar.z();
        this.d = siiVar;
        j();
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        String g = g();
        if (z2 && b.a().c()) {
            spz.a("InsideContinuedPlayManager", "clearSharePlayer 清空数据");
            c.a().b(true, b.a().b(g));
            b.a().b();
        } else if (!z || !spv.a().c()) {
        } else {
            spv.a().a(g);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!sns.e()) {
        } else {
            String g = g();
            boolean c = b.a().c(g);
            if (!b.a().a(g) || !c) {
                return;
            }
            if (this.d.ad().c() != null) {
                final ViewParent parent = this.d.ad().c().getParent();
                if (parent == null) {
                    return;
                }
                Pair<Integer, Integer> a2 = a(this.c);
                int i = 30;
                int i2 = 40;
                if (a2 != null) {
                    try {
                        i = ((Integer) a2.first).intValue();
                        i2 = ((Integer) a2.second).intValue();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                spz.a("InsideContinuedPlayManager", " 移除mCoverImageView延迟来自进度条回调：" + z + "，时间配置，firstFrameRemoveDelayTime：" + i + "，processRemoveDelayTime：" + i2);
                this.d.ad().c().postDelayed(new Runnable() { // from class: tb.siz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ViewParent viewParent = parent;
                        if (!(viewParent instanceof ViewGroup)) {
                            return;
                        }
                        ((ViewGroup) viewParent).removeView(siz.a(siz.this).ad().c());
                        spz.a("InsideContinuedPlayManager", "coverViewGoneForSharePlayerStillVideo 移除mCoverImageView延迟");
                    }
                }, z ? i2 : i);
            }
            a(false, true);
        }
    }

    public snv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("f0a9703", new Object[]{this}) : h();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean e = e();
        snv h = h();
        return (!e || h == null || h.e() == 7) ? false : true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return b.a().g(g()) || (!this.d.k().r() && i() && this.d.k().f() != null && this.d.k().f().i() != null && oec.a((Object) this.d.k().f().i().get("first_frame_rendering_time"), -1) > 0);
    }

    public void a(snv snvVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955c6abd", new Object[]{this, snvVar, new Boolean(z), new Boolean(z2)});
        } else if (snvVar == null) {
        } else {
            spz.c("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 创建续播mDWInstance");
            int a2 = this.d.v().a();
            com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a(this.d.af() != null ? this.d.af().l() : "", true);
            boolean isFirstSetUTParams = ((ITrackService) this.c.getService(ITrackService.class)).isFirstSetUTParams();
            ((ITrackService) this.c.getService(ITrackService.class)).setFirstSetUTParams(false);
            this.d.ac().a(a2);
            this.f33618a = true;
            if (z2) {
                spv.a().a(true);
                ((ISharePlayerService) this.d.z().getService(ISharePlayerService.class)).setHasShowInnerSharePlayerPV(true);
                spv.a().b(true);
            } else {
                b.a().a(true);
            }
            com.taobao.android.fluid.business.usertrack.track.b.a(this.d.z(), this.f33618a);
            ((ISharePlayerService) this.d.z().getService(ISharePlayerService.class)).setEnableSharePlayer(this.f33618a);
            com.taobao.android.fluid.business.usertrack.track.b.a(this.d.z(), 0);
            this.d.k().n();
            if (spj.a(this.d.z())) {
                HashMap<String, String> hashMap = new HashMap<>(1);
                hashMap.put("bizGroup", "guangguang_fullscreen");
                this.d.k().f().c(hashMap);
            }
            HashMap<String, String> hashMap2 = new HashMap<>(1);
            hashMap2.put("optSourcerPipeSize", "true");
            this.d.k().f().c(hashMap2);
            ((IMediaService) this.c.getService(IMediaService.class)).getConfig().a(true);
            this.d.k().f().a(DWInstanceType.VIDEO);
            ((ISharePlayerService) this.d.z().getService(ISharePlayerService.class)).setHasCreateDWInstance(true);
            long currentTimeMillis = System.currentTimeMillis();
            pio.a(this.d.z(), currentTimeMillis - this.d.ac().b());
            this.d.ac().a(currentTimeMillis);
            boolean c = b.a().c(this.d.z().getInstanceConfig().getPreCoverKey());
            boolean b = ((ISharePlayerService) this.d.z().getService(ISharePlayerService.class)).getConfig().b();
            boolean z4 = !sns.e();
            spz.a("InsideContinuedPlayManager", "updateView，全屏页收到双列流是否首帧渲染完成：开关是否关闭：" + b + "，开关是否打开：" + sns.e());
            if (z2 || (z && (!c || z4))) {
                ViewParent parent = this.d.ad().c().getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.d.ad().c());
                    spz.a("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 移除mCoverImageView");
                }
                if (c && z) {
                    spz.a("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 没有播起来的视频设置picImageView");
                    this.d.k().f().a(this.d.ad().c());
                }
            }
            this.d.k().m();
            this.d.k().f().a(this.d.ah().b().d, this.d.ah().b().l == 0 ? this.d.ah().b().c : this.d.ah().b().l);
            this.d.ag().a(this.d.k().f().f());
            if (this.d.ag().c() != null) {
                if (this.d.ag().c().getParent() != null) {
                    ((ViewGroup) this.d.ag().c().getParent()).removeView(this.d.ag().c());
                }
                spz.a("InsideContinuedPlayManager", "onRequestMediaByViewSharePlayer 增加videoView");
                this.d.ag().b(this.d.ag().c(), this.d.ah().a());
            }
            sii siiVar = this.d;
            ljq.c(siiVar, siiVar.k().f().h());
            this.d.ab().f12498a.put("totalTime", String.valueOf(this.d.af().f() / 1000));
            this.d.ab().f12498a.put("currentTime", "0");
            long currentTimeMillis2 = System.currentTimeMillis();
            pio.b(this.d.z(), currentTimeMillis2 - this.d.ac().b());
            this.d.ac().a(currentTimeMillis2);
            this.d.aa().e(this.d.af().f());
            sjm.f33626a++;
            spz.a(sii.TAG, "video count=" + sjm.f33626a);
            this.d.p().a();
            this.d.v().a(false);
            this.d.k().f().c(ljm.a(this.d.z(), ljm.a(this.d.z(), a2, this.d.af().f12530a), isFirstSetUTParams));
            this.d.k().f().b(ljm.b(true));
            HashMap hashMap3 = new HashMap(1);
            hashMap3.put(obw.KEY_VIDEO_UPDATE_PARAMS, "videoActionType=sharePlayer");
            this.d.k().f().a((Map<String, String>) hashMap3);
            if (!((IQuickOpenService) this.c.getService(IQuickOpenService.class)).isQuickOpenMode()) {
                this.d.k().o();
            }
            if (!z2) {
                if (!z) {
                    return;
                }
                if (c && !z4) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("clearSharePlayer 清空数据，是否是播放起来的视频：");
            sb.append(z && !c);
            sb.append("双列流首帧是否已经渲染完成：");
            if (z && b) {
                z3 = true;
            }
            sb.append(z3);
            spz.a("InsideContinuedPlayManager", sb.toString());
            a(z2, z);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        b.a().a(false);
        spv.a().a(false);
        this.f33618a = false;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return spv.a().a(g(), this.d.af() != null ? this.d.af().l() : "");
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableTab3RestAlbumSharePlayerFlag", true);
    }

    private String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.c.getInstanceConfig().getPreCoverKey();
    }

    private snv h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("44e61c9c", new Object[]{this}) : spv.a().c(g());
    }

    private Pair<Integer, Integer> a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("745d0764", new Object[]{this, fluidContext});
        }
        try {
            Pair<Integer, Integer> a2 = ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getConfig().a();
            if (a2 != null) {
                return a2;
            }
            String[] split = FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("removeFirstFrameDelayTime", "30,40").split(",");
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            ((ISharePlayerService) fluidContext.getService(ISharePlayerService.class)).getConfig().a(pair);
            return pair;
        } catch (Throwable th) {
            spz.a("InsideContinuedPlayManager", "", th);
            return Pair.create(30, 40);
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCheckFirstFrameRender", true);
        ogg.b("根据qos获取首帧时间判断首帧是否渲染的开关：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            ((ILifecycleService) this.d.z().getService(ILifecycleService.class)).addPageLifecycleListener(this);
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        spz.c("InsideContinuedPlayManager", "PageLifecycle video ShortVideoCard.onStart ");
        spv a2 = spv.a();
        sii siiVar = this.d;
        a2.a(siiVar, siiVar.J(), this.d.H());
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        spz.c("InsideContinuedPlayManager", "PageLifecycle video page ShortVideoCard.onResume " + this.d.r());
        if (spj.d(this.d.z())) {
            if (!this.d.J() || !this.d.H()) {
                return;
            }
            boolean e = juo.e();
            if (f()) {
                spv a2 = spv.a();
                sii siiVar = this.d;
                a2.a(siiVar, siiVar.J(), this.d.H(), !e);
            }
            if (e) {
                spz.a("PickPreloadController", "onResume(),起播");
                this.d.c(false);
                return;
            }
            this.d.m().removeMessages(0);
            if (!this.d.ak()) {
                return;
            }
            this.d.d(false);
            this.d.c(false);
            return;
        }
        spv a3 = spv.a();
        sii siiVar2 = this.d;
        a3.a(siiVar2, siiVar2.J(), this.d.H(), true);
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        String g = g();
        spv.a().a(false);
        bl e = b.a().e(g);
        boolean a2 = b.a().a(g);
        if (e == null || !a2) {
            return;
        }
        e.e(b.a().f(g));
        c.a().b(true, b.a().b(g));
        b.a().a(false);
        b.a().b();
    }
}
