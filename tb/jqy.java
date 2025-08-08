package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.renderscript.RenderScript;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.device.IDeviceService;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.smr;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class jqy implements hjl, shm, snz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f29721a;
    private final sic b;
    private ViewGroup c;
    private VideoRoundCornerLayout d;
    private ImageView e;
    private VideoRoundCornerLayout f;
    private TUrlImageView g;
    private View h;
    private AlphaAnimation i;
    private long j;
    private FrameLayout.LayoutParams k;
    private ImageView l;
    private boolean m;
    private boolean n = false;
    private final boolean o;

    static {
        kge.a(1422109701);
        kge.a(267465044);
        kge.a(854340662);
        kge.a(387453491);
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
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
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        }
    }

    @Override // tb.hjl
    public void onCompletion(psw pswVar, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f520420", new Object[]{this, pswVar, iMediaPlayer});
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
    public void onPauseMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5c1bf0", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hjl
    public void onPrepared(psw pswVar, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4c7581", new Object[]{this, pswVar, iMediaPlayer});
        }
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onRequestMediaPlayer(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea476f38", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onShowFirstCover(psw pswVar, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2677f4", new Object[]{this, pswVar, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.snz
    public void onStartMedia(psw pswVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ffe4c84", new Object[]{this, pswVar, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.snz
    public void onStopMedia(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a288e06", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snz
    public void onUTPairsUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db420e07", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
        }
    }

    public static /* synthetic */ sic a(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sic) ipChange.ipc$dispatch("82d18f13", new Object[]{jqyVar}) : jqyVar.b;
    }

    public static /* synthetic */ FrameLayout.LayoutParams b(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("c46cf850", new Object[]{jqyVar}) : jqyVar.k;
    }

    public static /* synthetic */ FluidContext c(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("a8aa2c0", new Object[]{jqyVar}) : jqyVar.f29721a;
    }

    public static /* synthetic */ boolean d(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb70150d", new Object[]{jqyVar})).booleanValue() : jqyVar.m;
    }

    public static /* synthetic */ ImageView e(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("67029346", new Object[]{jqyVar}) : jqyVar.e;
    }

    public static /* synthetic */ ImageView f(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("c8552fe5", new Object[]{jqyVar}) : jqyVar.l;
    }

    public static /* synthetic */ VideoRoundCornerLayout g(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoRoundCornerLayout) ipChange.ipc$dispatch("c7a8798d", new Object[]{jqyVar}) : jqyVar.d;
    }

    public static /* synthetic */ ViewGroup h(jqy jqyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("16c84c68", new Object[]{jqyVar}) : jqyVar.c;
    }

    public jqy(sic sicVar) {
        this.b = sicVar;
        this.f29721a = sicVar.z();
        h();
        this.o = sjt.A();
    }

    public static MediaLiveInfo a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("52eaf131", new Object[]{bVar});
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = false;
        mediaLiveInfo.liveUrlList = new ArrayList<>();
        mediaLiveInfo.liveId = bVar.g();
        QualityLiveItem qualityLiveItem = new QualityLiveItem();
        qualityLiveItem.definition = MediaConstant.DEFINITION_MD;
        Map<String, String> h = bVar.h();
        for (String str : h.keySet()) {
            if (MediaConstant.RTCLIVE_URL_NAME.equalsIgnoreCase(str)) {
                qualityLiveItem.rtcLiveUrl = h.get(str);
            } else if ("flv".equalsIgnoreCase(str)) {
                qualityLiveItem.flvUrl = h.get(str);
            } else if ("hls".equalsIgnoreCase(str)) {
                qualityLiveItem.hlsUrl = h.get(str);
            }
        }
        mediaLiveInfo.liveUrlList.add(qualityLiveItem);
        return mediaLiveInfo;
    }

    public VideoRoundCornerLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoRoundCornerLayout) ipChange.ipc$dispatch("65b32b69", new Object[]{this}) : this.d;
    }

    public FrameLayout.LayoutParams b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b58c6a32", new Object[]{this}) : this.k;
    }

    public void a(FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b016271", new Object[]{this, layoutParams});
        } else {
            this.k = layoutParams;
        }
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.j;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e.setVisibility(8);
        this.h.setVisibility(8);
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.b.B();
        this.c = frameLayout;
        this.j = com.taobao.android.fluid.business.usertrack.track.a.a(this.b.z());
        this.d = (VideoRoundCornerLayout) frameLayout.findViewById(R.id.live_host);
        this.e = (ImageView) frameLayout.findViewById(R.id.imv_cover);
        this.f = (VideoRoundCornerLayout) frameLayout.findViewById(R.id.live_transition);
        if (g()) {
            this.l = (ImageView) frameLayout.findViewById(R.id.imv_cover_large_screen);
        }
        this.h = frameLayout.findViewById(R.id.v_gray_mask);
        this.k = new FrameLayout.LayoutParams(-1, -1);
        if (!slm.a(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("isLiveBlurCoverEnabled", "false"), false) || obu.i()) {
            z = false;
        }
        this.m = z;
        this.i = new AlphaAnimation(1.0f, 0.0f);
        this.i.setAnimationListener(new Animation.AnimationListener() { // from class: tb.jqy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    jqy.this.d();
                }
            }
        });
        this.i.setDuration(250L);
        ((IDeviceService) this.b.z().getService(IDeviceService.class)).addDeviceRotateListener(new smr.a() { // from class: tb.jqy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.smr.a, tb.smr
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (jqy.a(jqy.this).g().a() == null) {
                } else {
                    jqy.a(jqy.this).g().a().a(jqy.b(jqy.this).width, jqy.b(jqy.this).height);
                    jqy.a(jqy.this).g().a().f().setLayoutParams(jqy.b(jqy.this));
                }
            }
        });
        this.b.B().setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.jqy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                ((IMessageService) jqy.c(jqy.this).getService(IMessageService.class)).sendMessage(new spy("VSMSG_longPress", jqy.a(jqy.this).D().c, null));
                return false;
            }
        });
    }

    @Override // tb.snz
    public void onDataUpdate(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0585f5", new Object[]{this, pswVar});
            return;
        }
        String b = this.b.h().b();
        int i = this.m ? 512 : 1024;
        if (!this.o) {
            b = ogw.a(null, this.f29721a.getContext(), b, i, i, ImageLoader.a.a(), false);
        }
        this.b.a(b);
        FluidSDK.getImageAdapter().load(b, new com.taobao.android.fluid.framework.adapter.mtop.a<String, BitmapDrawable>() { // from class: tb.jqy.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.adapter.mtop.a
            public void a(String str, BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc1cd0a7", new Object[]{this, str, bitmapDrawable});
                    return;
                }
                spz.c("CardRenderManager", "onDataUpdate mIsBlurEnabled: " + jqy.d(jqy.this) + " ; url:" + str);
                if (!slm.a(str, jqy.a(jqy.this).p()) || bitmapDrawable == null) {
                    return;
                }
                if (jqy.d(jqy.this)) {
                    RenderScript renderScript = ((IMediaService) jqy.c(jqy.this).getService(IMediaService.class)).getRenderScript();
                    if (renderScript == null && Build.VERSION.SDK_INT > 17) {
                        renderScript = RenderScript.create(jqy.e(jqy.this).getContext());
                        ((IMediaService) jqy.c(jqy.this).getService(IMediaService.class)).setRenderScript(renderScript);
                    }
                    if (renderScript != null) {
                        Bitmap a2 = obv.a(20, renderScript, bitmapDrawable.getBitmap());
                        jqy.e(jqy.this).setImageBitmap(a2);
                        if (jqy.f(jqy.this) == null) {
                            return;
                        }
                        jqy.f(jqy.this).setImageBitmap(a2);
                        return;
                    }
                    jqy.e(jqy.this).setImageDrawable(bitmapDrawable);
                    return;
                }
                jqy.e(jqy.this).setImageDrawable(bitmapDrawable);
            }
        });
    }

    @Override // tb.snz
    public void onRecyclePlayer(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b576cfc", new Object[]{this, pswVar, new Boolean(z)});
            return;
        }
        this.e.setImageBitmap(null);
        this.e.setImageDrawable(null);
        ImageView imageView = this.l;
        if (imageView == null) {
            return;
        }
        imageView.setImageBitmap(null);
        this.l.setImageDrawable(null);
    }

    @Override // tb.snz
    public void onShowCover(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8496fbe", new Object[]{this, pswVar});
            return;
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        VideoRoundCornerLayout videoRoundCornerLayout = this.f;
        if (videoRoundCornerLayout == null || this.g == null) {
            return;
        }
        videoRoundCornerLayout.setVisibility(8);
        this.f.removeView(this.g);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!sjt.p()) {
        } else {
            spz.c("CardRenderManager", "onPageStateChangedShowCover");
            if (this.n) {
                this.n = false;
            } else {
                onShowCover(this.b);
            }
        }
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54de0d56", new Object[]{this, kVar});
            return;
        }
        this.n = true;
        if (kVar == null || kVar.q() == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(kVar.z());
        this.g = new TUrlImageView(this.f29721a.getContext());
        if (this.b.h() == null || !this.b.h().e()) {
            z = false;
        }
        DWAspectRatio a2 = sjs.a(z, this.b.l().cK_());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        if (StringUtils.equals(a2.name(), DWAspectRatio.DW_FIT_CENTER.name())) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.g.setImageDrawable(bitmapDrawable);
        this.g.setScaleType(scaleType);
        this.f.addView(this.g, 0, this.k);
        this.f.setVisibility(0);
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        snv a2 = this.b.g().a();
        if (a2 == null || a2.f() != viewGroup || viewGroup.getParent() != this.d) {
            return;
        }
        this.c.forceLayout();
        viewGroup.forceLayout();
        this.d.forceLayout();
        ViewGroup viewGroup2 = (ViewGroup) this.d.getParent();
        if (viewGroup2 != null) {
            int indexOfChild = viewGroup2.indexOfChild(this.d);
            viewGroup2.removeView(this.d);
            viewGroup2.addView(this.d, indexOfChild);
        }
        this.d.removeView(viewGroup);
        this.d.addView(viewGroup, 0, this.k);
        this.c.requestLayout();
    }

    public void a(final View view, final ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8549973", new Object[]{this, view, layoutParams});
        } else if (view == null) {
        } else {
            a(view, new Runnable() { // from class: tb.jqy.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (jqy.a(jqy.this).g().a() == null) {
                    } else {
                        spz.c("CardRenderManager", "addVideoView: " + view + " ,layoutParams width:" + layoutParams.width + " height:" + layoutParams.height);
                        jqy.g(jqy.this).addView(view, 0, layoutParams);
                    }
                }
            });
        }
    }

    public void a(Boolean bool, Boolean bool2) {
        View a2;
        View a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c4f948", new Object[]{this, bool, bool2});
        } else if (this.b.G() == null) {
        } else {
            int i = 4;
            if (bool != null && (a3 = this.b.G().a(R.id.v_graymask_top)) != null) {
                a3.setVisibility(bool.booleanValue() ? 0 : 4);
            }
            if (bool2 == null || (a2 = this.b.G().a(R.id.v_graymask_bottom)) == null) {
                return;
            }
            if (bool2.booleanValue()) {
                i = 0;
            }
            a2.setVisibility(i);
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : obx.g() && oeb.a("ShortVideo.enableLargeScreenLiveCardBlurView", true);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.b.t().a(this);
        this.b.O().a(this);
        this.b.P().a(this);
    }

    @Override // tb.hjl
    public boolean onInfo(psw pswVar, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e7af9b2", new Object[]{this, pswVar, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (3 == j) {
            if (!sie.a()) {
                this.e.startAnimation(this.i);
            }
        } else if (12100 == j) {
            if (sie.a()) {
                d();
            }
            spz.c("CardRenderManager", "IMediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START_IN_RENDER_THREAD");
        }
        return false;
    }

    @Override // tb.hjl
    public boolean onError(psw pswVar, IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("193dfed2", new Object[]{this, pswVar, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.b.cf_().e.setVisibility(0);
        this.b.cf_().h.setVisibility(0);
        return false;
    }

    public void a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f6f4e8", new Object[]{this, view, runnable});
            return;
        }
        boolean j = sjt.j();
        ViewGroup viewGroup = (ViewGroup) this.c.getParent();
        if (viewGroup instanceof LockableRecycerView) {
            z = ((LockableRecycerView) viewGroup).isDuringLayout();
        }
        spz.c("CardRenderManager", "onVideoViewUpdated, view: " + view + " duringLayout:" + z);
        if (j && z) {
            oec.a(runnable);
            b.a(getClass().getSimpleName(), this.b.w());
            return;
        }
        runnable.run();
    }

    public void b(final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else if (viewGroup == null) {
        } else {
            if ((viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0) || !sjt.k()) {
                return;
            }
            oec.a(new Runnable() { // from class: tb.jqy.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0) {
                    } else {
                        HashMap<String, String> a2 = b.a(false, jqy.a(jqy.this).w(), jqy.h(jqy.this), viewGroup);
                        spz.c("CardRenderManager", "requestLayout in onVideoStart for size is 0, property: " + JSON.toJSONString(a2));
                        jqy.this.a(viewGroup);
                        b.a(a2);
                    }
                }
            }, oeb.a("ShortVideo.ensureLayoutDelayTime", 100));
        }
    }
}
