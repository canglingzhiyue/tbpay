package com.taobao.android.detail.core.standard.video;

import android.app.Activity;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bay;
import tb.ecf;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends AbsPicGalleryVideoPlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> e;
    private DWInstance f;
    private AbsPicGalleryVideoPlayer.a g;
    private AbsPicGalleryVideoPlayer.b h;
    private FrameLayout i;
    private FrameLayout j;
    private FrameLayout k;
    private TUrlImageView l;
    private ImageButton m;
    private ImageButton n;
    private float o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;

    static {
        kge.a(1098804032);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ float a(c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5868fb79", new Object[]{cVar, new Float(f)})).floatValue();
        }
        cVar.o = f;
        return f;
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc14f17", new Object[]{cVar});
        } else {
            cVar.E();
        }
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dccdb6", new Object[]{cVar});
        } else {
            cVar.w();
        }
    }

    public static /* synthetic */ AbsPicGalleryVideoPlayer.a c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsPicGalleryVideoPlayer.a) ipChange.ipc$dispatch("ef06c050", new Object[]{cVar}) : cVar.g;
    }

    public static /* synthetic */ float d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee13cae4", new Object[]{cVar})).floatValue() : cVar.o;
    }

    public static /* synthetic */ DWInstance e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWInstance) ipChange.ipc$dispatch("b6881c4", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ AbsPicGalleryVideoPlayer.b f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsPicGalleryVideoPlayer.b) ipChange.ipc$dispatch("482db532", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ void g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6646d1", new Object[]{cVar});
        } else {
            cVar.B();
        }
    }

    public static /* synthetic */ void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5681c570", new Object[]{cVar});
        } else {
            cVar.C();
        }
    }

    public c(Activity activity, m mVar) {
        super(activity, mVar);
        this.o = -1.0f;
        this.e = new ConcurrentHashMap();
        this.r = false;
        y();
        z();
        emu.a("com.taobao.android.detail.core.standard.video.DWPicGalleryVideoPlayer");
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "play failed:video is destroy");
            return;
        }
        if (StringUtils.equals(this.c, "init")) {
            this.f.start();
        } else {
            this.f.playVideo();
        }
        this.m.setVisibility(8);
        if (this.s) {
            return;
        }
        this.l.setVisibility(8);
    }

    private void w() {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (!this.s || (tUrlImageView = this.l) == null || tUrlImageView.getVisibility() == 8) {
        } else {
            this.l.setVisibility(8);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "pause failed:video is destroy");
            return;
        }
        this.f.pauseVideo();
        this.m.setVisibility(0);
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "seek failed:video is destroy");
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (StringUtils.equals(this.c, "init")) {
            this.o = f;
        } else {
            this.f.seekTo((int) (((float) r()) * f));
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "reset failed:video is destroy");
            return;
        }
        this.f.setDWLifecycleType(DWLifecycleType.BEFORE);
        this.m.setVisibility(0);
        this.c = "init";
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        A();
        this.f.destroy();
        this.f.setVideoLifecycleListener(null);
        this.g = null;
        this.c = AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_DESTROYED;
        String a2 = com.taobao.android.detail.core.performance.i.a("DWPicGalleryVideoPlayer", BTags.Video);
        com.taobao.android.detail.core.utils.i.a(a2, "activty:" + this.f9863a.hashCode() + ",mDWInstance:" + this.f.hashCode() + ",video:" + this.b.a() + " do destroy");
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d = true;
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "mute failed:video is destroy");
            return;
        }
        this.f.mute(true);
        i();
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.d = false;
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "unmute failed:video is destroy");
            return;
        }
        this.f.mute(false);
        j();
        ecf.g(this.f9863a, F());
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "resizeViewport failed:video is destroy");
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.f.setFrame(i, i2);
            this.p = i;
            this.q = i2;
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        A();
        if (D()) {
            com.taobao.android.detail.core.utils.i.b("DWPicGalleryVideoPlayer", "resizeWidth failed:video is destroy");
        } else if (i <= 0) {
        } else {
            int d = (int) (i / this.b.d());
            this.f.setFrame(i, d);
            this.p = i;
            this.q = d;
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.m.setVisibility(8);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.r) {
        } else {
            this.n.setVisibility(0);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.n.setVisibility(8);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.k.setVisibility(0);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.k.setVisibility(8);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.r = true;
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public m n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("23b5ad9a", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public View o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("28161c38", new Object[]{this});
        }
        DWInstance dWInstance = this.f;
        if (dWInstance == null || dWInstance.getView() == null) {
            return this.i;
        }
        ViewGroup view = this.f.getView();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            this.j.addView(view);
        } else if (viewGroup != this.j) {
            viewGroup.removeView(view);
            this.j.addView(view);
        }
        return this.i;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de468", new Object[]{this})).floatValue();
        }
        if (r() > 0) {
            return ((float) s()) / ((float) r());
        }
        return 0.0f;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbed", new Object[]{this})).longValue();
        }
        DWInstance dWInstance = this.f;
        if (dWInstance != null) {
            return dWInstance.getDuration();
        }
        return 0L;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136e", new Object[]{this})).longValue();
        }
        DWInstance dWInstance = this.f;
        if (dWInstance != null) {
            return dWInstance.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public AbsPicGalleryVideoPlayer.a t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsPicGalleryVideoPlayer.a) ipChange.ipc$dispatch("b0b22c6a", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public Object a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : this.e.get(str);
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.e.put(str, obj);
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue() : this.p;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue() : this.q;
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a(AbsPicGalleryVideoPlayer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bced1457", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    @Override // com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer
    public void a(AbsPicGalleryVideoPlayer.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bced88b6", new Object[]{this, bVar});
        } else {
            this.h = bVar;
        }
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        bk.a aVar = new bk.a(this.f9863a);
        aVar.e("DETAILMAIN");
        aVar.c("TBVideo");
        aVar.f(this.d);
        aVar.q(true);
        aVar.N(true);
        aVar.g(false);
        aVar.H(false);
        aVar.B(false);
        aVar.r(true);
        aVar.x(true);
        aVar.N(false);
        aVar.a(AliSDetailScaleType.centerCrop.equalsIgnoreCase(this.b.g()) ? DWAspectRatio.DW_CENTER_CROP : DWAspectRatio.DW_FIT_CENTER);
        aVar.b(this.b.a());
        aVar.a(this.b.b());
        this.p = bay.b();
        aVar.c(this.p);
        this.q = (int) (bay.b() / this.b.d());
        aVar.d(this.q);
        if (!StringUtils.isEmpty(this.b.c())) {
            DWFrontCoverBean dWFrontCoverBean = new DWFrontCoverBean(0L, null, this.b.c());
            dWFrontCoverBean.setScaleType(AliSDetailScaleType.centerCrop.equalsIgnoreCase(this.b.f()) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
            com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
            aVar2.a(dWFrontCoverBean);
            aVar.a(aVar2);
            aVar.i(true);
        } else {
            aVar.i(false);
        }
        Map<String, String> e = this.b.e();
        if (e != null) {
            aVar.a(new HashMap<>(e));
        }
        this.f = aVar.c();
        String a2 = com.taobao.android.detail.core.performance.i.a("DWPicGalleryVideoPlayer", BTags.Video);
        com.taobao.android.detail.core.utils.i.a(a2, "activty:" + this.f9863a.hashCode() + ",initPlayer create mDWInstance:" + this.f.hashCode());
        this.f.hideController();
        this.f.hideMiniProgressBar();
        this.f.setVideoLifecycleListener(new av() { // from class: com.taobao.android.detail.core.standard.video.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.av
            public void onVideoFullScreen() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5dcccbde", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoInfo(Object obj, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoNormalScreen() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff4b0936", new Object[]{this});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPrepared(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3faee61c", new Object[]{this, obj});
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2b2d56d", new Object[]{this});
                    return;
                }
                c.a(c.this);
                onVideoPlay();
                c.b(c.this);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPause(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                    return;
                }
                c cVar = c.this;
                cVar.c = AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PAUSING;
                if (c.c(cVar) != null) {
                    AbsPicGalleryVideoPlayer.a c = c.c(c.this);
                    c cVar2 = c.this;
                    c.b(cVar2, cVar2.b);
                }
                c.this.j();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoPlay() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("931007b7", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                cVar.c = AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING;
                if (c.d(cVar) >= 0.0f && c.d(c.this) <= 1.0f) {
                    c.e(c.this).seekTo((int) (((float) c.this.r()) * c.d(c.this)));
                    c.a(c.this, -1.0f);
                }
                if (c.c(c.this) != null) {
                    AbsPicGalleryVideoPlayer.a c = c.c(c.this);
                    c cVar2 = c.this;
                    c.a(cVar2, cVar2.b);
                }
                if (c.this.g()) {
                    c.this.i();
                }
                c.b(c.this);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoSeekTo(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                } else if (c.c(c.this) == null) {
                } else {
                    float r = i / (c.this.r() <= 0 ? 1.0f : (float) c.this.r());
                    if (r > 1.0f) {
                        r = 1.0f;
                    } else if (r < 0.0f) {
                        r = 0.0f;
                    }
                    AbsPicGalleryVideoPlayer.a c = c.c(c.this);
                    c cVar = c.this;
                    c.a(cVar, cVar.b, r);
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoError(Object obj, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                    return;
                }
                c cVar = c.this;
                cVar.c = "error";
                if (c.c(cVar) != null) {
                    AbsPicGalleryVideoPlayer.a c = c.c(c.this);
                    c cVar2 = c.this;
                    c.a(cVar2, cVar2.b, String.valueOf(i), String.valueOf(i2));
                }
                c.b(c.this);
            }

            @Override // com.taobao.avplayer.av
            public void onVideoComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3c2c53c", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                cVar.c = AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PAUSING;
                if (c.c(cVar) != null) {
                    AbsPicGalleryVideoPlayer.a c = c.c(c.this);
                    c cVar2 = c.this;
                    c.c(cVar2, cVar2.b);
                }
                c.this.c();
                c.this.j();
            }

            @Override // com.taobao.avplayer.av
            public void onVideoClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("24db3403", new Object[]{this});
                } else {
                    c.this.c = AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PAUSING;
                }
            }

            @Override // com.taobao.avplayer.av
            public void onVideoProgressChanged(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (c.c(c.this) == null) {
                } else {
                    AbsPicGalleryVideoPlayer.a c = c.c(c.this);
                    c cVar = c.this;
                    c.a(cVar, cVar.b, i / i3);
                }
            }
        });
        this.f.setRootViewClickListener(new z() { // from class: com.taobao.android.detail.core.standard.video.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.z
            public boolean hook() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
                }
                if (c.f(c.this) != null) {
                    AbsPicGalleryVideoPlayer.b f = c.f(c.this);
                    c cVar = c.this;
                    f.b(cVar, cVar.b);
                }
                return true;
            }
        });
        this.j.addView(this.f.getView());
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        this.i = (FrameLayout) com.taobao.android.detail.core.async.d.b(this.f9863a, R.layout.pic_gallery_video_player_layout);
        this.j = (FrameLayout) this.i.findViewById(R.id.picGalleryVideoPlayerContainer);
        this.k = (FrameLayout) this.i.findViewById(R.id.picGalleryVideoPlayerCustomizeContainer);
        this.l = (TUrlImageView) this.i.findViewById(R.id.picGalleryVideoPlayerCoverImageView);
        this.l.setScaleType(AliSDetailScaleType.centerCrop.equalsIgnoreCase(this.b.f()) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
        this.l.setStrategyConfig(new ImageStrategyConfig.a("detail", 1503).a());
        this.m = (ImageButton) this.i.findViewById(R.id.picGalleryVideoPlayerPlayBtn);
        this.n = (ImageButton) this.i.findViewById(R.id.picGalleryVideoPlayerMuteBtn);
        if (!StringUtils.isEmpty(this.b.c())) {
            this.l.setImageUrl(this.b.c());
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.video.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    c.g(c.this);
                }
            }
        });
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.video.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    c.g(c.this);
                }
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.video.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    c.h(c.this);
                }
            }
        });
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.s = com.taobao.android.detail.core.aura.utils.f.s();
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else if (this.f != null) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            x();
            com.taobao.android.detail.core.utils.h.j(this.f9863a, SystemClock.uptimeMillis() - uptimeMillis);
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        a();
        AbsPicGalleryVideoPlayer.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.a(this, this.b);
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        f();
        AbsPicGalleryVideoPlayer.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.a(this, this.b, false);
    }

    private boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : StringUtils.equals(this.c, AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_DESTROYED);
    }

    private void E() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if (this.f9863a == null || (findViewById = this.f9863a.findViewById(R.id.dw_frontcover_cover)) == null) {
        } else {
            findViewById.setBackgroundColor(-1);
        }
    }

    private Map<String, String> F() {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef1c5942", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (!(this.f9863a instanceof DetailCoreActivity) || (C = ((DetailCoreActivity) this.f9863a).C()) == null) {
            return hashMap;
        }
        String i = C.i();
        if (!StringUtils.isEmpty(i)) {
            hashMap.put("item_id", i);
        }
        String h = C.h();
        if (!StringUtils.isEmpty(h)) {
            hashMap.put("seller_id", h);
        }
        return hashMap;
    }
}
