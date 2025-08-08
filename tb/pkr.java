package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.media.MediaConstant;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.j;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.utils.a;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ak;
import com.taobao.taolive.room.utils.ar;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.g;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.q;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.room.utils.x;
import com.taobao.taolive.sdk.business.f;
import com.taobao.taolive.sdk.business.i;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.d;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.component.b;
import com.taobao.taolive.sdk.ui.component.c;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.ui.media.t;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pkr implements f, c, pqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String B;

    /* renamed from: a  reason: collision with root package name */
    public View f32725a;
    public String b;
    public String c;
    private String e;
    private Context f;
    private g g;
    private TBLiveBizDataModel h;
    private TBLiveRecEngineV2.RecModel i;
    private VideoFrame2 j;
    private d k;
    private pkm l;
    private String m;
    private i n;
    private long s;
    private pks t;
    private boolean u;
    private boolean v;
    private x w;
    private int x;
    public String y;
    private long z;
    private boolean o = true;
    private boolean p = false;
    private boolean A = false;
    private boolean q = false;
    private boolean r = false;
    public t d = new t() { // from class: tb.pkr.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
            }
            int i = (int) j;
            if (i == 3) {
                pkr pkrVar = pkr.this;
                pkr.a(pkrVar, pkr.d(pkrVar), j2);
                if (!pkr.g(pkr.this)) {
                    if (pkr.e(pkr.this) != null) {
                        pkr.e(pkr.this).a(pkr.i(pkr.this), j2);
                    }
                    pkr.b(pkr.this, true);
                }
            } else if (i != 714) {
                if (i == 12101) {
                    a.a(pkr.a(pkr.this));
                    if (pkr.c(pkr.this) != null) {
                        pkr.c(pkr.this).onSurfaceRenderFirstFrame(j2);
                    }
                    if (pmd.a().e() != null) {
                        HashMap hashMap = new HashMap();
                        long currentTimeMillis = System.currentTimeMillis();
                        long d = currentTimeMillis - pkr.d(pkr.this);
                        long d2 = j2 - pkr.d(pkr.this);
                        hashMap.put("timestamp", String.valueOf(currentTimeMillis));
                        if (pkr.b(pkr.this) != null) {
                            hashMap.put("livesource", poy.ac(pkr.b(pkr.this)));
                            hashMap.put("liveToken", pkr.b(pkr.this).j());
                            hashMap.put("entryLiveSource", poy.R(pkr.b(pkr.this)));
                        }
                        hashMap.put("liveDuration", String.valueOf(d));
                        hashMap.put("decodeCompleteTs", String.valueOf(j2));
                        hashMap.put("decodeCompleteTsDuration", String.valueOf(d2));
                        pmd.a().e().a("Page_TaobaoLiveWatch", "live_player_success", hashMap);
                        if (as.d() && pkr.e(pkr.this) != null) {
                            pkr.e(pkr.this).a("updateScreenDuration", String.valueOf(d2));
                            pkr pkrVar2 = pkr.this;
                            pkr.a(pkrVar2, "onInfo_MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE updateScreenDuration = " + d2);
                        }
                    }
                    Log.e("VideoAdapterFrame", "onInfo_MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE: " + String.valueOf(System.currentTimeMillis()));
                } else if (i == 701) {
                    pkr.a(pkr.this, System.currentTimeMillis());
                    pkr.a(pkr.this, true);
                } else if (i == 702 && pkr.f(pkr.this) && pkr.g(pkr.this)) {
                    long currentTimeMillis2 = System.currentTimeMillis() - pkr.h(pkr.this);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("duration", currentTimeMillis2 + "");
                    ai.a((com.taobao.alilive.aliliveframework.frame.a) pkr.b(pkr.this), ag.CALC_BUFFERING, (Map<String, String>) hashMap2);
                    pkr.a(pkr.this, false);
                }
            } else if (cgl.q() != null) {
                cgl.q().a(pmd.a().u().c(), "download_video", null, 0L, j2);
            }
            if (pkr.c(pkr.this) != null) {
                pkr.c(pkr.this).onVideoInfo(iMediaPlayer, j, j2, obj);
            }
            return false;
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (com.taobao.taolive.sdk.playcontrol.c.i(pkr.b(pkr.this)) == VideoStatus.VIDEO_TIMESHIFT_STATUS && aa.V()) {
                ddw.a().a(FullScreenFrame.EVENT_BACK_TO_LIVE, null, pkr.this.y);
                if (pkr.a(pkr.this) instanceof Activity) {
                    ((Activity) pkr.a(pkr.this)).runOnUiThread(new Runnable() { // from class: tb.pkr.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                plk.a(pkr.a(pkr.this).getApplicationContext(), "讲解播放出错，返回直播中！");
                            }
                        }
                    });
                }
            }
            pkr.b(pkr.this, true);
            return false;
        }
    };

    static {
        kge.a(-992172725);
        kge.a(472311370);
        kge.a(1626122044);
        kge.a(-1107739425);
    }

    public static /* synthetic */ long a(pkr pkrVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fbf5137", new Object[]{pkrVar, new Long(j)})).longValue();
        }
        pkrVar.s = j;
        return j;
    }

    public static /* synthetic */ Context a(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("22fe2599", new Object[]{pkrVar}) : pkrVar.f;
    }

    public static /* synthetic */ void a(pkr pkrVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b4de1", new Object[]{pkrVar, new Long(j), new Long(j2)});
        } else {
            pkrVar.a(j, j2);
        }
    }

    public static /* synthetic */ void a(pkr pkrVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f0045", new Object[]{pkrVar, drawable});
        } else {
            pkrVar.a(drawable);
        }
    }

    public static /* synthetic */ void a(pkr pkrVar, SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae11d00", new Object[]{pkrVar, simpleVideoInfo});
        } else {
            pkrVar.a(simpleVideoInfo);
        }
    }

    public static /* synthetic */ void a(pkr pkrVar, LiveItem.SpfPlayVideo spfPlayVideo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161d892", new Object[]{pkrVar, spfPlayVideo});
        } else {
            pkrVar.a(spfPlayVideo);
        }
    }

    public static /* synthetic */ void a(pkr pkrVar, MediaData mediaData, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1de471f", new Object[]{pkrVar, mediaData, new Boolean(z), new Long(j)});
        } else {
            pkrVar.a(mediaData, z, j);
        }
    }

    public static /* synthetic */ void a(pkr pkrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b4bd2b", new Object[]{pkrVar, str});
        } else {
            pkrVar.c(str);
        }
    }

    public static /* synthetic */ void a(pkr pkrVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39b09", new Object[]{pkrVar, str, new Boolean(z)});
        } else {
            pkrVar.a(str, z);
        }
    }

    public static /* synthetic */ boolean a(pkr pkrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbf8d57", new Object[]{pkrVar, new Boolean(z)})).booleanValue();
        }
        pkrVar.r = z;
        return z;
    }

    public static /* synthetic */ g b(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("c8904905", new Object[]{pkrVar}) : pkrVar.g;
    }

    public static /* synthetic */ void b(pkr pkrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9d856c", new Object[]{pkrVar, str});
        } else {
            pkrVar.d(str);
        }
    }

    public static /* synthetic */ boolean b(pkr pkrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219d56f6", new Object[]{pkrVar, new Boolean(z)})).booleanValue();
        }
        pkrVar.q = z;
        return z;
    }

    public static /* synthetic */ pks c(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pks) ipChange.ipc$dispatch("a8bb4bab", new Object[]{pkrVar}) : pkrVar.t;
    }

    public static /* synthetic */ long d(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5556d18", new Object[]{pkrVar})).longValue() : pkrVar.z;
    }

    public static /* synthetic */ pkm e(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pkm) ipChange.ipc$dispatch("77fef7af", new Object[]{pkrVar}) : pkrVar.l;
    }

    public static /* synthetic */ boolean f(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a25b7a2a", new Object[]{pkrVar})).booleanValue() : pkrVar.r;
    }

    public static /* synthetic */ boolean g(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90de80ab", new Object[]{pkrVar})).booleanValue() : pkrVar.q;
    }

    public static /* synthetic */ long h(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f61871c", new Object[]{pkrVar})).longValue() : pkrVar.s;
    }

    public static /* synthetic */ String i(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fdaf4e17", new Object[]{pkrVar}) : pkrVar.m;
    }

    public static /* synthetic */ TBLiveBizDataModel j(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveBizDataModel) ipChange.ipc$dispatch("5ecfdbb4", new Object[]{pkrVar}) : pkrVar.h;
    }

    public static /* synthetic */ TBLiveRecEngineV2.RecModel k(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("f6866517", new Object[]{pkrVar}) : pkrVar.i;
    }

    public static /* synthetic */ VideoFrame2 l(pkr pkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame2) ipChange.ipc$dispatch("2d135bc1", new Object[]{pkrVar}) : pkrVar.j;
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6a7c0de8", new Object[]{this}) : this.k;
    }

    public pkr(g gVar, Context context, View view) {
        this.y = null;
        this.g = gVar;
        g gVar2 = this.g;
        if (gVar2 != null) {
            this.y = gVar2.G();
        }
        this.f = context;
        if (gVar != null) {
            this.i = gVar.w();
        }
        this.f32725a = view;
        y();
        c(com.taobao.android.weex_framework.util.a.ATOM_constructor);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (!E()) {
        } else {
            D();
            this.e = str;
            c("onWillAppear");
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.setLiveContextKey(this.e);
            }
            z();
            d dVar = this.k;
            if (dVar != null) {
                dVar.a(this.g);
            }
            b(j);
            t();
            VideoFrame2 videoFrame22 = this.j;
            if (videoFrame22 == null) {
                return;
            }
            videoFrame22.onWillAppear();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 == null || videoFrame2.getTaoVideoView() == null) {
            return;
        }
        this.j.getTaoVideoView().i();
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 == null || videoFrame2.getTaoVideoView() == null) {
            return;
        }
        this.j.getTaoVideoView().g();
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.B = str;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (!E()) {
        } else {
            c("onDidAppear");
            this.o = false;
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.setUserStartTime(j);
                this.j.onDidAppear();
            }
            this.u = true;
            u();
        }
    }

    public void a(VideoInfo videoInfo, TBLiveBizDataModel tBLiveBizDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec604215", new Object[]{this, videoInfo, tBLiveBizDataModel});
        } else if (!E()) {
        } else {
            c("onGetVideoInfoSuccess");
            this.h = tBLiveBizDataModel;
            d(videoInfo.voiceSilent);
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null && !videoFrame2.hasPreloaded()) {
                C();
            }
            if (this.j != null) {
                if (videoInfo.closeXiaochuang) {
                    this.j.setEnableShowSmallWindow(false);
                }
                this.j.onBindData(this.h);
            }
            a(videoInfo);
            b(videoInfo);
            this.v = true;
            u();
            f(videoInfo);
        }
    }

    private void b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b293c4", new Object[]{this, videoInfo});
            return;
        }
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 == null || !videoFrame2.hasPreloaded()) {
            return;
        }
        this.j.updateUrlListAndSwitch(videoInfo);
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (!this.u || !this.v) {
        } else {
            v();
        }
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        c("onFrameReady");
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 != null && !videoFrame2.isPlaying()) {
            this.j.enableRenderType();
        }
        VideoFrame2 videoFrame22 = this.j;
        if (videoFrame22 == null) {
            return;
        }
        TBLiveRecEngineV2.RecModel recModel = this.i;
        if (recModel != null) {
            videoFrame22.setExtraConfig(recModel.liveId, this.i.accountId);
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.h;
        if (tBLiveBizDataModel != null && tBLiveBizDataModel.mVideoInfo != null && this.h.mVideoInfo.pushFeature != null) {
            this.j.setMediaSourceType(this.h.mVideoInfo.pushFeature);
        }
        this.j.setOnVideoErrorClickListener(new VideoFrame.c() { // from class: tb.pkr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                String a2 = cgl.r().a();
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                if (pkr.a(pkr.this) != null) {
                    s.a(pkr.a(pkr.this), a2);
                }
                ddw.a().a("com.taobao.taolive.room.killself", null, pkr.this.y);
            }
        });
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!E()) {
        } else {
            c("onGetVideoInfoFailed");
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!E()) {
        } else {
            c("onWillDisappear");
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.onWillDisappear();
            }
            w();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!E()) {
        } else {
            c("onDidDisappear");
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.onDidDisappear();
            }
            w();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!E()) {
        } else {
            c("onStart");
            x();
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.onStart();
            }
            this.A = false;
        }
    }

    public void g() {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!E()) {
        } else {
            c("onResume");
            if (this.j != null) {
                if (!this.p && this.i != null) {
                    if (!as.g() || (videoFrame2 = this.j) == null || !videoFrame2.isPlaying()) {
                        z = false;
                    }
                    if (!z) {
                        a(this.i.imageUrl, false);
                    }
                }
                this.j.resume();
            }
            this.p = false;
            if (this.g.A() == null) {
                return;
            }
            this.g.A().k();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!E()) {
        } else {
            c("onPause");
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.onPause();
            }
            if (this.g.A() != null) {
                this.g.A().j();
            }
            this.p = true;
        }
    }

    public void a(boolean z) {
        TBLiveRecEngineV2.RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!E()) {
        } else {
            c(MessageID.onStop);
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null && (recModel = this.i) != null) {
                videoFrame2.stop(recModel.liveId, z);
            }
            this.A = true;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!E()) {
        } else {
            c(MessageID.onDestroy);
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.onDestroy();
            }
            w();
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        this.x = 100000;
        this.b = null;
        this.c = null;
        this.v = false;
        this.u = false;
        this.B = null;
    }

    @Override // com.taobao.taolive.sdk.business.f
    public void onSuccess(Object obj) {
        pmf t;
        TBLiveBizDataModel tBLiveBizDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else if (!this.v) {
            if (aa.ao() && (tBLiveBizDataModel = this.h) != null && tBLiveBizDataModel.mVideoInfo != null && this.h.mVideoInfo.liveIsdestroy) {
                c("liveIsdestroy is ture,can not play video");
                return;
            }
            c("cdn onSuccess");
            SimpleLiveInfo simpleLiveInfo = (SimpleLiveInfo) pqj.a((String) obj, SimpleLiveInfo.class);
            if (this.j == null || simpleLiveInfo == null || StringUtils.isEmpty(this.b) || !this.b.equals(simpleLiveInfo.liveId) || simpleLiveInfo.roomStatus != 1 || simpleLiveInfo.liveUrlList == null || simpleLiveInfo.liveUrlList.isEmpty()) {
                return;
            }
            MediaData mediaData = new MediaData();
            int size = simpleLiveInfo.liveUrlList.size();
            mediaData.h265 = simpleLiveInfo.h265;
            mediaData.rateAdapte = simpleLiveInfo.rateAdapte;
            mediaData.edgePcdn = simpleLiveInfo.edgePcdn;
            mediaData.mediaConfig = simpleLiveInfo.mediaConfig;
            if (simpleLiveInfo.broadCaster != null) {
                mediaData.anchorId = simpleLiveInfo.broadCaster.accountId;
            }
            mediaData.liveId = simpleLiveInfo.liveId;
            mediaData.mediaSourceType = simpleLiveInfo.pushFeature;
            mediaData.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                QualitySelectItem qualitySelectItem = simpleLiveInfo.liveUrlList.get(i);
                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                qualityLiveItem.artpUrl = qualitySelectItem.artpUrl;
                qualityLiveItem.definition = qualitySelectItem.definition;
                qualityLiveItem.flvUrl = qualitySelectItem.flvUrl;
                qualityLiveItem.h265Url = qualitySelectItem.h265Url;
                qualityLiveItem.hlsUrl = qualitySelectItem.hlsUrl;
                qualityLiveItem.name = qualitySelectItem.name;
                qualityLiveItem.bfrtcUrl = qualitySelectItem.bfrtcUrl;
                qualityLiveItem.liveUrlMiniBfrtc = qualitySelectItem.liveUrlMiniBfrtc;
                qualityLiveItem.rtcLiveUrl = qualitySelectItem.rtcLiveUrl;
                qualityLiveItem.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
                qualityLiveItem.wholeH265ArtpUrl = qualitySelectItem.wholeH265ArtpUrl;
                qualityLiveItem.unit = qualitySelectItem.unit;
                qualityLiveItem.unitType = qualitySelectItem.unitType;
                qualityLiveItem.newDefinition = qualitySelectItem.newDefinition;
                qualityLiveItem.recomm = qualitySelectItem.recomm;
                qualityLiveItem.newName = qualitySelectItem.newName;
                qualityLiveItem.liveStreamStatsInfo = qualitySelectItem.liveStreamStatsInfo;
                mediaData.liveUrlList.add(qualityLiveItem);
                if (i == 0) {
                    mediaData.dataTracks = qualitySelectItem.dataTracks;
                }
            }
            pkm pkmVar = this.l;
            if (pkmVar != null) {
                pkmVar.e("cdnLiveUrlList");
                this.l.f(this.m);
            }
            if (!StringUtils.isEmpty(mediaData.dataTracks) && (t = pmd.a().t()) != null) {
                t.a(mediaData.dataTracks, this.f);
            }
            if (o.t()) {
                this.j.playVideoCDN(mediaData, false);
            } else {
                this.j.preloadVideo(mediaData);
            }
            this.x = 100001;
            onLiveStartPlay(false);
            a.a(this.f, this.g);
        }
    }

    @Override // com.taobao.taolive.sdk.business.f
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            return;
        }
        c("cdn onError");
        a.a(this.f, this.g);
    }

    @Override // com.taobao.taolive.sdk.ui.component.c
    public void onVideoPlayError(int i) {
        VideoFrame2 videoFrame2;
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8079eda4", new Object[]{this, new Integer(i)});
        } else if (!E()) {
        } else {
            c("onVideoPlayError err = " + i + " mPlayState = " + this.x);
            if (this.x == 100002 && this.g.o() != null && (o = this.g.o()) != null) {
                o.accessListener(AccessListenerEnum.playerError, new Object[0]);
            }
            pkm pkmVar = this.l;
            if (pkmVar != null) {
                pkmVar.a(this.m, i);
            }
            if (this.t != null && (videoFrame2 = this.j) != null && videoFrame2.getTaoVideoView() != null) {
                this.t.onVideoError(this.j.getTaoVideoView(), i, 0);
            }
            this.x = 100003;
        }
    }

    public void a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        this.z = j;
        onLiveStartPlay(z);
    }

    @Override // com.taobao.taolive.sdk.ui.component.c
    public void onLiveStartPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8945e82", new Object[]{this, new Boolean(z)});
        } else if (!E()) {
        } else {
            c("onLiveStartPlay");
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                if (videoFrame2.hasFirstFrame()) {
                    a(0L, 0L);
                    pkm pkmVar = this.l;
                    if (pkmVar != null) {
                        pkmVar.a(this.m, 0L);
                    }
                }
                if (this.j.getTaoVideoView() != null) {
                    if (this.j.getTaoVideoView().J() != 2) {
                        this.j.getTaoVideoView().b(this.f);
                    }
                    if (as.d() && this.l != null) {
                        boolean cy_ = this.j.getTaoVideoView().cy_();
                        this.l.a("isSurfaceView", String.valueOf(cy_));
                        c("onLiveStartPlay isSurfaceView = " + cy_);
                    }
                }
            }
            B();
            g gVar = this.g;
            if (gVar != null && gVar.x() != null) {
                f(this.g.x());
            }
            pks pksVar = this.t;
            if (pksVar == null) {
                return;
            }
            pksVar.onLiveStartPlay(z);
        }
    }

    private void a(long j, long j2) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
        } else if (!E()) {
        } else {
            ac.a("KLifecycle_first_frame");
            ac.a();
            c("onFirstFrame " + (System.currentTimeMillis() - this.z));
            pks pksVar = this.t;
            if (pksVar != null) {
                pksVar.onFirstFrame(j, j2);
            }
            TBLiveBizDataModel tBLiveBizDataModel = this.h;
            if (tBLiveBizDataModel != null) {
                a(tBLiveBizDataModel.mVideoInfo);
            }
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.onFirstFrame();
            }
            g gVar = this.g;
            if (gVar == null || gVar.o() == null || (o = this.g.o()) == null) {
                return;
            }
            o.accessListener(AccessListenerEnum.playerFirstFrameRender, new Object[0]);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!E()) {
        } else {
            c("retry");
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 == null) {
                return;
            }
            videoFrame2.retry();
        }
    }

    public void a(VideoInfo videoInfo, String str, String str2, String str3) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f9d83", new Object[]{this, videoInfo, str, str2, str3});
        } else if (!E()) {
        } else {
            c("showLive");
            a("网络环境不稳定，请刷新重试", videoInfo);
            if (this.j == null) {
                return;
            }
            if (poy.s(this.g)) {
                this.j.updateSubBusinessType("TbLiveTV");
            }
            if (this.w == null) {
                this.w = new x(this.j, (Activity) this.f, false, this.g);
            }
            int a2 = this.w.a(videoInfo, !StringUtils.isEmpty(str));
            String a3 = this.w.a(videoInfo, a2);
            this.w.a(false);
            if (videoInfo.status == 0) {
                VideoFrame2 videoFrame2 = this.j;
                if (videoFrame2 != null) {
                    videoFrame2.changeStatus(0);
                    if (o.i() && (gVar = this.g) != null && gVar.x() != null && this.g.x().liveIsdestroy) {
                        this.g.A().c(true);
                        if (this.j.getTaoVideoView() != null) {
                            this.j.getTaoVideoView().o();
                        }
                    } else {
                        boolean c = c(videoInfo);
                        if (!this.j.hasPreloaded() || ((aa.aW() && this.j.isPreloadedFailed()) || d(videoInfo) || c)) {
                            e(videoInfo);
                            this.j.setVideoDefinition(this.w.a(videoInfo, a2, this.g));
                            pkm pkmVar = this.l;
                            if (pkmVar != null) {
                                g gVar2 = this.g;
                                if (gVar2 != null) {
                                    String t = gVar2.y().aJ_().b().t();
                                    if (!StringUtils.isEmpty(t) && StringUtils.equals(videoInfo.liveId, t)) {
                                        this.l.e("detailPre");
                                    } else {
                                        this.l.e("mtopLiveUrlList");
                                    }
                                } else {
                                    pkmVar.e("mtopLiveUrlList");
                                }
                                this.l.f(str3);
                            }
                            this.j.setToken(str2);
                            if (aa.cy()) {
                                this.j.playStreamUrl(a3, u.D(), u.E(), u.F(), poy.s(this.g), false, !this.A);
                            } else {
                                this.j.playStreamUrl(a3, u.D(), u.E(), u.F(), poy.s(this.g), false, true);
                            }
                            this.x = 100002;
                            onLiveStartPlay(false);
                        }
                    }
                    String str4 = null;
                    try {
                        Object[] objArr = new Object[4];
                        objArr[0] = videoInfo.broadCaster.accountId;
                        objArr[1] = !StringUtils.isEmpty(a3) ? URLEncoder.encode(a3, "UTF-8") : "";
                        objArr[2] = videoInfo.liveId;
                        objArr[3] = videoInfo.topic;
                        str4 = String.format("C-Common-%s-%s-%s-%s", objArr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (pmd.a().n() != null) {
                        pmd.a().n().a("taolive", "bizData", str4);
                    }
                }
                m.b("showLive info.status LIVE_STATUS_LIVE " + this.j);
            } else if (videoInfo.status == 3) {
                VideoFrame2 videoFrame22 = this.j;
                if (videoFrame22 != null) {
                    videoFrame22.changeStatus(0);
                    e(videoInfo);
                    this.j.setStreamUrl(a3, poy.s(this.g));
                    this.j.showVideoError(true, 0);
                }
                g gVar3 = this.g;
                if (gVar3 != null && gVar3.A() != null && this.g.A().e() != null && this.g.A().e().l()) {
                    this.g.A().e().I();
                }
                g gVar4 = this.g;
                if ((gVar4 instanceof g) && gVar4.u() != null) {
                    this.g.u().h();
                }
                m.b("showLive info.status LIVE_STATUS_PAUSE " + this.j);
                a.a(this.f, this.g);
            } else {
                i();
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!o.D() || !E()) {
        } else {
            r();
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                videoFrame2.showVideoError(true, 0);
            }
            g gVar = this.g;
            if (gVar == null || gVar.A() == null || this.g.A().e() == null || !this.g.A().e().l()) {
                return;
            }
            this.g.A().e().I();
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        g gVar = this.g;
        if (gVar == null || !(gVar.y() instanceof e)) {
            return;
        }
        e y = this.g.y();
        hashMap.put("blackReplayCheck", Boolean.valueOf(y.F()));
        hashMap.put("isInOpti", Boolean.valueOf(as.a(y, 0L)));
        ai.a(19997, "blackReplayCheck", hashMap);
    }

    public void a(VideoInfo videoInfo, String str, String str2) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ab1ff9", new Object[]{this, videoInfo, str, str2});
        } else if (!E()) {
        } else {
            c("showReplay");
            if (this.j == null) {
                return;
            }
            if (o.i() && (gVar = this.g) != null && gVar.x() != null && this.g.x().liveIsdestroy) {
                this.g.A().c(true);
                if (this.j.getTaoVideoView() == null) {
                    return;
                }
                this.j.getTaoVideoView().o();
                return;
            }
            a(this.f.getString(R.string.taolive_replay_video_error_hint), videoInfo);
            this.j.changeStatus(2);
            if (!StringUtils.isEmpty(this.j.getVideoViewToken())) {
                return;
            }
            pkm pkmVar = this.l;
            if (pkmVar != null) {
                pkmVar.e("mtopReplayUrl");
                this.l.f(str);
            }
            a(videoInfo.bizCode, videoInfo.replayUrl);
            onLiveStartPlay(false);
            this.x = 100002;
        }
    }

    @Override // tb.pqf
    public boolean getIsLowNetworkForLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83a7d786", new Object[]{this})).booleanValue();
        }
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 == null) {
            return false;
        }
        return videoFrame2.getIsLowNetworkForLive();
    }

    public void a(b bVar) {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494aeefb", new Object[]{this, bVar});
        } else if (!E() || (videoFrame2 = this.j) == null) {
        } else {
            videoFrame2.setAnchorLeaveCallback(bVar);
        }
    }

    public void a(pkm pkmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15181810", new Object[]{this, pkmVar, str});
        } else if (!E()) {
        } else {
            this.l = pkmVar;
            this.m = str;
        }
    }

    public String l() {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        if (!E() || (videoFrame2 = this.j) == null) {
            return null;
        }
        return videoFrame2.getMediaPlayToken();
    }

    public void a(pks pksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ccce00", new Object[]{this, pksVar});
        } else {
            this.t = pksVar;
        }
    }

    public void a(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b29f74", new Object[]{this, recModel});
        } else {
            this.i = recModel;
        }
    }

    public VideoFrame2 m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame2) ipChange.ipc$dispatch("65309109", new Object[]{this}) : this.j;
    }

    public void n() {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!E()) {
        } else {
            c("switchToPortrait");
            PlayerController2 playerController2 = null;
            VideoFrame2 videoFrame22 = this.j;
            if (videoFrame22 != null) {
                playerController2 = videoFrame22.getPlayerController();
            }
            if (playerController2 != null) {
                playerController2.toggleScreen(true, false);
            }
            TBLiveBizDataModel tBLiveBizDataModel = this.h;
            if (tBLiveBizDataModel == null) {
                return;
            }
            VideoInfo videoInfo = tBLiveBizDataModel.mVideoInfo;
            if (!aa.cb() || (videoFrame2 = this.j) == null || videoFrame2.getTaoVideoView() == null) {
                return;
            }
            String str = videoInfo.playModePortrait;
            if (StringUtils.isEmpty(str)) {
                str = aa.cd();
            }
            if (y.a() && y.b(this.f)) {
                str = videoInfo.playModeLandscape;
                if (StringUtils.isEmpty(str)) {
                    str = aa.cc();
                }
            }
            this.j.getTaoVideoView().a(com.taobao.taolive.room.utils.ac.a().b(str));
        }
    }

    public void o() {
        VideoInfo videoInfo;
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (!E()) {
        } else {
            c("switchToLandscape");
            TBLiveBizDataModel tBLiveBizDataModel = this.h;
            if (tBLiveBizDataModel == null || (videoInfo = tBLiveBizDataModel.mVideoInfo) == null || !aa.cb() || (videoFrame2 = this.j) == null || videoFrame2.getTaoVideoView() == null) {
                return;
            }
            String str = videoInfo.playModeLandscape;
            if (StringUtils.isEmpty(str)) {
                str = aa.cc();
            }
            this.j.getTaoVideoView().a(com.taobao.taolive.room.utils.ac.a().a(str));
        }
    }

    public void a(BaseFrame baseFrame, VideoInfo videoInfo, String str) {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84736b5", new Object[]{this, baseFrame, videoInfo, str});
        } else if (!E() || (videoFrame2 = this.j) == null || !(baseFrame instanceof ppy)) {
        } else {
            ppy ppyVar = (ppy) baseFrame;
            PlayerController2 playerController = videoFrame2.getPlayerController();
            if (playerController != null) {
                playerController.setControllerHolder((com.taobao.taolive.sdk.ui.media.playercontrol.a) ppyVar.getControllerHolder(null));
                playerController.setPlayRateDefalut();
                playerController.showController(2);
                playerController.setPlayRateListener(new com.taobao.taolive.sdk.ui.media.playercontrol.c() { // from class: tb.pkr.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.c
                    public boolean a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
                        }
                        String str2 = i == 1 ? "1.5" : i == 2 ? "2" : "1";
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", str2);
                        ai.a((com.taobao.alilive.aliliveframework.frame.a) pkr.b(pkr.this), "MultiSpeed", (Map<String, String>) hashMap);
                        return false;
                    }
                });
                playerController.setIPlayForwardListener(new com.taobao.taolive.sdk.ui.media.playercontrol.b() { // from class: tb.pkr.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            ai.a(pkr.b(pkr.this), "Forward", new String[0]);
                        }
                    }

                    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.b
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else {
                            ai.a(pkr.b(pkr.this), "Backword", new String[0]);
                        }
                    }
                });
            }
            ppyVar.setBackView(this.j.getContentView());
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!E()) {
        } else {
            PlayerController2 playerController2 = null;
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null) {
                playerController2 = videoFrame2.getPlayerController();
            }
            if (playerController2 == null) {
                return;
            }
            playerController2.setDefaultControllerHolder(this.g);
            playerController2.setPlayRateDefalut();
            if (poy.at(this.g)) {
                playerController2.showController(2);
            } else {
                playerController2.showController(1);
            }
            playerController2.setPlayRateViewShow(aa.A());
            playerController2.setFullScreen(false);
            playerController2.refreshController();
        }
    }

    public void q() {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!E() || (videoFrame2 = this.j) == null) {
        } else {
            videoFrame2.reset();
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        this.k = new d();
        this.g.a((com.taobao.taolive.sdk.playcontrol.a) this.k);
        this.j = new VideoFrame2(this.f, false, null, this.g);
        this.j.setOnVideoContainerShowListener(new VideoFrame.b() { // from class: tb.pkr.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (pkr.b(pkr.this) != null && pkr.b(pkr.this).t() != null) {
                    pkr.b(pkr.this).t().d();
                }
                VideoInfo videoInfo = pkr.j(pkr.this) != null ? pkr.j(pkr.this).mVideoInfo : null;
                if (videoInfo == null || videoInfo.broadCaster == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("feedId", videoInfo.liveId);
                hashMap.put("feed_id", videoInfo.liveId);
                hashMap.put("account_id", videoInfo.broadCaster.accountId);
                hashMap.put("deviceLevel", k.a() + "");
                ai.a((com.taobao.alilive.aliliveframework.frame.a) pkr.b(pkr.this), ag.CLICK_SHOW_DIALOG, (Map<String, String>) hashMap);
            }
        });
        if (!o.r()) {
            this.j.setOnVideoReloadClickListener(new VideoFrame.d() { // from class: tb.pkr.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (pkr.k(pkr.this) == null) {
                    } else {
                        pkr pkrVar = pkr.this;
                        pkr.a(pkrVar, pkr.k(pkrVar).imageUrl, false);
                    }
                }
            });
        }
        this.j.setVideoCallback(this);
        this.j.registerListener(this.d);
        g gVar = this.g;
        if (gVar == null || gVar.n == null || this.g.n.bizCode == null || !this.g.n.bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString())) {
            z = false;
        }
        this.j.onCreateView((ViewStub) this.f32725a.findViewById(R.id.taolive_base_video), z ? "shopLiveTab" : "LiveRoom", k.a(), 0L);
        this.j.setISeekStopTrackingListener(new VideoFrame.f() { // from class: tb.pkr.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.f
            public void a(boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                } else if (!z2) {
                } else {
                    ddw.a().a("com.taobao.taolive.room.video_bar_seek", null, pkr.this.y);
                }
            }
        });
        this.j.setLowDeviceFirstRender(poy.an(this.g));
    }

    private void z() {
        TBLiveRecEngineV2.RecModel w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        g gVar = this.g;
        if (gVar == null || (w = gVar.w()) == null) {
            return;
        }
        String str = w.initParams != null ? w.initParams.get(aw.PARAM_PLAY_VIEW_TOKEN) : null;
        if (!StringUtils.isEmpty(str) && !com.taobao.taolive.sdk.ui.media.g.a().d(str)) {
            str = null;
        }
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 == null) {
            return;
        }
        videoFrame2.setVideoViewToken(str);
    }

    private void a(String str, boolean z) {
        VideoFrame2 videoFrame2;
        g gVar;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ab.c("VideoAdapterFrame", "setVideoCoverImage imageUrl = " + str);
        if (aa.q() && (gVar = this.g) != null && (gVar.y() instanceof com.taobao.taolive.room.controller2.c) && this.g.w() != null && !((com.taobao.taolive.room.controller2.c) this.g.y()).u && this.g.y().q() && this.g.w().isFirst) {
            z2 = true;
        }
        if (z2) {
            Drawable a2 = com.taobao.taolive.room.utils.e.a(this.f);
            if (a2 != null && (videoFrame2 = this.j) != null) {
                videoFrame2.setCoverImg(a2, true);
                ab.c("VideoAdapterFrame", "setVideoCoverImage useExternalImage");
            } else {
                b(str, z);
            }
        } else {
            b(str, z);
        }
        if (!(this.g.y() instanceof com.taobao.taolive.room.controller2.c)) {
            return;
        }
        ((com.taobao.taolive.room.controller2.c) this.g.y()).u = true;
    }

    private void b(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ab.c("VideoAdapterFrame", "setPlayerCover imageUrl = " + str);
        Log.e("VideoAdapterFrame", "setPlayerCover_time start: " + System.currentTimeMillis());
        this.j.setCoverImg(this.f.getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
        if (aa.aq()) {
            pni l = pmd.a().l();
            l.a(str + aa.cJ()).a(new pnf() { // from class: tb.pkr.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnf
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    if (pkr.l(pkr.this) == null || z || pkr.g(pkr.this)) {
                        return;
                    }
                    ab.c("VideoAdapterFrame", "setVideoCoverImage onSuccess = " + str);
                    pkr.l(pkr.this).setCoverImg(bitmapDrawable, true);
                    pkr.a(pkr.this, bitmapDrawable);
                    Log.e("VideoAdapterFrame", "setPlayerCover_time end: " + System.currentTimeMillis());
                }

                @Override // tb.pnf
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                        return;
                    }
                    ab.c("VideoAdapterFrame", "setVideoCoverImage onFail = " + str);
                    pkr.l(pkr.this).setCoverImg(pkr.a(pkr.this).getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
                }
            }).a();
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (aa.aM()) {
                TBLiveRecEngineV2.RecModel recModel = this.i;
                int a2 = (recModel == null || recModel.initParams == null || this.i.initParams.get(aw.PARAM_COVER_GAUSS_SAMPLING) == null) ? 4 : v.a(this.i.initParams.get(aw.PARAM_COVER_GAUSS_SAMPLING), 4);
                TBLiveRecEngineV2.RecModel recModel2 = this.i;
                com.taobao.taolive.room.utils.g.a(str, this.f32725a, -1, -1, new g.a() { // from class: tb.pkr.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.room.utils.g.a
                    public void a(BitmapDrawable bitmapDrawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                        } else if (pkr.l(pkr.this) == null || z || pkr.g(pkr.this)) {
                        } else {
                            ab.c("VideoAdapterFrame", "setVideoCoverImage onSuccess = " + str);
                            pkr.l(pkr.this).setCoverImg(bitmapDrawable, true);
                            pkr.a(pkr.this, bitmapDrawable);
                        }
                    }

                    @Override // com.taobao.taolive.room.utils.g.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        ab.c("VideoAdapterFrame", "setVideoCoverImage onFail = " + str);
                        pkr.l(pkr.this).setCoverImg(pkr.a(pkr.this).getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
                    }
                }, (recModel2 == null || recModel2.initParams == null || this.i.initParams.get(aw.PARAM_COVER_GAUSS_RADIUS) == null) ? 25 : v.a(this.i.initParams.get(aw.PARAM_COVER_GAUSS_RADIUS), 25), a2);
                return;
            }
            com.taobao.taolive.room.utils.g.a(str, this.f32725a, -1, -1, new g.a() { // from class: tb.pkr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.utils.g.a
                public void a(BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                    } else if (pkr.l(pkr.this) == null || z || pkr.g(pkr.this)) {
                    } else {
                        ab.c("VideoAdapterFrame", "setVideoCoverImage onSuccess = " + str);
                        pkr.l(pkr.this).setCoverImg(bitmapDrawable, true);
                        pkr.a(pkr.this, bitmapDrawable);
                    }
                }

                @Override // com.taobao.taolive.room.utils.g.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ab.c("VideoAdapterFrame", "setVideoCoverImage onFail = " + str);
                    pkr.l(pkr.this).setCoverImg(pkr.a(pkr.this).getResources().getDrawable(R.drawable.taolive_slice_scroll_common), true);
                }
            });
        }
    }

    public void b(final long j) {
        TBLiveRecEngineV2.RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else if (this.i == null || this.j == null) {
        } else {
            A();
            if (!StringUtils.isEmpty(as.m()) && !"null".equals(as.m())) {
                String m = as.m();
                if (!StringUtils.isEmpty(m)) {
                    pkm pkmVar = this.l;
                    if (pkmVar != null) {
                        pkmVar.e(aw.PARAM_LIVE_PLAY_URL);
                        this.l.f(this.m);
                    }
                    this.j.preloadVideoByUrl(m);
                    onLiveStartPlay(false);
                }
            } else if (!StringUtils.isEmpty(this.j.getVideoViewToken())) {
                if (this.l != null) {
                    this.l.e((this.i.initParams == null || StringUtils.isEmpty(this.i.initParams.get(aw.PARAM_PLAY_MODE))) ? "playerViewToken" : this.i.initParams.get(aw.PARAM_PLAY_MODE));
                    this.l.f(this.m);
                    this.l.a(this.m, 0L);
                }
                this.j.preloadVideoByToken(!this.o);
                a(true, j);
            } else {
                MediaData b = b(this.i);
                LiveItem.SpfPlayVideo a2 = j.a(this.i.initParams);
                if (b != null && b.liveUrlList != null && !b.liveUrlList.isEmpty()) {
                    a(b, false, j);
                } else if (this.i.initParams != null) {
                    String str = this.i.initParams.get(aw.PARAM_LIVE_URL_TYPE);
                    if (("rtcLive".equals(str) && u.F()) || (("bfrtc".equals(str) && u.E()) || (("artp".equals(str) && u.D()) || "flv".equals(str)))) {
                        String str2 = this.i.initParams.get(aw.PARAM_LIVE_PLAY_URL);
                        if (!StringUtils.isEmpty(str2)) {
                            pkm pkmVar2 = this.l;
                            if (pkmVar2 != null) {
                                pkmVar2.e(aw.PARAM_LIVE_PLAY_URL);
                                this.l.f(this.m);
                            }
                            this.j.preloadVideoByUrl(str2);
                            a(false, j);
                        }
                    } else if (a2 != null && com.taobao.taolive.movehighlight.utils.c.j()) {
                        a(a2);
                    } else if (m.b() && com.taobao.taolive.room.afccoldlunch.b.a().c()) {
                        com.taobao.taolive.room.afccoldlunch.b.a().a(new com.taobao.taolive.room.afccoldlunch.a() { // from class: tb.pkr.11
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.room.afccoldlunch.a
                            public void a() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                }
                            }

                            @Override // com.taobao.taolive.room.afccoldlunch.a
                            public void a(SimpleVideoInfo simpleVideoInfo) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d0df487", new Object[]{this, simpleVideoInfo});
                                    return;
                                }
                                pkr.a(pkr.this, simpleVideoInfo);
                                if (simpleVideoInfo != null) {
                                    pkr.b(pkr.this, simpleVideoInfo.voiceSilent);
                                }
                                MediaData b2 = com.taobao.taolive.room.afccoldlunch.b.b(simpleVideoInfo);
                                LiveItem.SpfPlayVideo a3 = com.taobao.taolive.room.afccoldlunch.b.a(simpleVideoInfo);
                                if (b2 != null && b2.liveUrlList != null && !b2.liveUrlList.isEmpty()) {
                                    pkr.a(pkr.this, b2, m.b(), j);
                                } else if (a3 == null) {
                                } else {
                                    pkr.a(pkr.this, a3);
                                }
                            }
                        });
                    }
                }
                if (!this.j.hasPreloaded()) {
                    this.j.getPreloadVideoView();
                } else {
                    this.x = 100001;
                }
            }
            if (!this.j.hasFirstFrame() && (recModel = this.i) != null) {
                a(recModel.imageUrl, false);
            }
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 == null || !videoFrame2.hasPreloaded()) {
                return;
            }
            C();
        }
    }

    private void a(MediaData mediaData, boolean z, long j) {
        pmf t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e228bb8", new Object[]{this, mediaData, new Boolean(z), new Long(j)});
        } else if (mediaData == null || mediaData.liveUrlList == null || mediaData.liveUrlList.isEmpty()) {
        } else {
            pkm pkmVar = this.l;
            if (pkmVar != null) {
                pkmVar.e("liveUrlList");
                this.l.f(this.m);
            }
            if (!StringUtils.isEmpty(mediaData.dataTracks) && (t = pmd.a().t()) != null) {
                t.a(mediaData.dataTracks, this.f);
            }
            this.j.preloadVideo(mediaData, z);
            a(false, j);
        }
    }

    private void a(LiveItem.SpfPlayVideo spfPlayVideo) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13019d6b", new Object[]{this, spfPlayVideo});
        } else if (spfPlayVideo == null) {
        } else {
            if (!StringUtils.isEmpty(spfPlayVideo.playInfo)) {
                com.taobao.taolive.sdk.playcontrol.c.a(this.g, VideoStatus.VIDEO_TIMESHIFT_STATUS);
                if (com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4.equals(spfPlayVideo.videoType)) {
                    com.taobao.taolive.movehighlight.utils.f.a().a(com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4);
                    this.j.preloadHighlight(null, spfPlayVideo.playInfo, 0);
                } else {
                    com.taobao.taolive.movehighlight.utils.f.a().a("m3u8");
                    this.j.preloadHighlight(spfPlayVideo.playInfo, null, 0);
                }
                com.taobao.taolive.movehighlight.utils.f.a().b(1);
            }
            if (spfPlayVideo.timeMovingUtParams == null || (b = pqj.b(spfPlayVideo.timeMovingUtParams)) == null) {
                return;
            }
            this.i.initParams.put("timeMovingPcmIdParam", b.getString("pcmId"));
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else if (this.i.initParams == null) {
        } else {
            if (v.a(this.i.initParams.get("landScapeVideo"), false)) {
                int c = (com.taobao.taolive.room.utils.d.c() * 9) / 16;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, c);
                int dimensionPixelSize = this.f.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
                int d = (int) (com.taobao.taolive.room.utils.d.d() * 0.2f);
                if (c + d + poy.aq(this.g) <= com.taobao.taolive.room.utils.d.d()) {
                    dimensionPixelSize = d;
                }
                layoutParams.topMargin = dimensionPixelSize;
                this.j.updateLayout(layoutParams);
                return;
            }
            this.j.toFullscreen();
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 == null || videoFrame2.getTaoVideoView() == null) {
            return;
        }
        int J = this.j.getTaoVideoView().J();
        if (J == 0) {
            TBLiveRecEngineV2.RecModel recModel = this.i;
            String str = (recModel == null || recModel.initParams == null || StringUtils.isEmpty(this.i.initParams.get(aw.PARAM_PLAY_MODE))) ? "playerViewToken" : this.i.initParams.get(aw.PARAM_PLAY_MODE);
            if (this.j.getTaoVideoView().h() == IMediaPlayer.WarmState.WARMED) {
                this.l.o("warmuped");
            } else if (this.j.getTaoVideoView().h() == IMediaPlayer.WarmState.WARMING) {
                this.l.o("warmuping");
            } else {
                this.l.o("viewToken");
            }
            this.l.e(str);
        } else if (J != 1) {
            if (J != 2) {
                return;
            }
            this.l.o("defaultInit");
        } else {
            this.l.e("autoPlayerViewToken");
            if (this.j.getTaoVideoView().h() == IMediaPlayer.WarmState.WARMED) {
                this.l.o("warmuped");
            } else if (this.j.getTaoVideoView().h() == IMediaPlayer.WarmState.WARMING) {
                this.l.o("warmuping");
            } else {
                this.l.o("viewToken");
            }
        }
    }

    private MediaData b(TBLiveRecEngineV2.RecModel recModel) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("ea6d09d5", new Object[]{this, recModel});
        }
        MediaData mediaData = null;
        if (recModel == null || recModel.supportPreLoad != 1) {
            return null;
        }
        if (recModel.isFirst && recModel.initParams != null) {
            String str = recModel.initParams.get(aw.PARAM_CUSTOM_PLAY_CTRL);
            String str2 = recModel.initParams.get(aw.PARAM_QUICK_LIVE_URL);
            if (!StringUtils.isEmpty(str)) {
                mediaData = com.taobao.taolive.sdk.model.common.a.a(q.a(str));
            } else if (!StringUtils.isEmpty(str2) && aa.aT() && (a2 = q.a(str2)) != null) {
                mediaData = new MediaData();
                mediaData.liveUrlList = new ArrayList<>();
                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                qualityLiveItem.artpUrl = a2.getString("artpUrl");
                qualityLiveItem.definition = a2.getString("definition");
                qualityLiveItem.flvUrl = a2.getString("flvUrl");
                qualityLiveItem.h265Url = a2.getString("h265Url");
                qualityLiveItem.hlsUrl = a2.getString("hlsUrl");
                qualityLiveItem.name = a2.getString("name");
                qualityLiveItem.wholeH265FlvUrl = a2.getString("wholeH265FlvUrl");
                qualityLiveItem.wholeH265ArtpUrl = a2.getString(aw.PARAM_MEDIA_INFO_wholeH265ArtpUrl);
                qualityLiveItem.bfrtcUrl = a2.getString(MediaConstant.BFRTC_URL_NAME);
                qualityLiveItem.liveUrlMiniBfrtc = a2.getString("liveUrlMiniBfrtc");
                qualityLiveItem.rtcLiveUrl = a2.getString(MediaConstant.RTCLIVE_URL_NAME);
                qualityLiveItem.unit = a2.getString(nog.PRICE_UNIT);
                qualityLiveItem.unitType = a2.getString("unitType");
                mediaData.liveUrlList.add(qualityLiveItem);
                mediaData.liveUrlList.add(qualityLiveItem);
                mediaData.liveUrlList.add(qualityLiveItem);
            }
            String str3 = recModel.initParams.get(aw.PARAM_PLAYER_TOKEN);
            if (StringUtils.isEmpty(str3)) {
                return mediaData;
            }
            this.j.setToken(str3);
            return mediaData;
        } else if (recModel.liveUrlList != null && !recModel.liveUrlList.isEmpty()) {
            return com.taobao.taolive.sdk.model.common.a.a(q.a(pqj.a(recModel)));
        } else {
            return null;
        }
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        pkm pkmVar = this.l;
        String str = "installed";
        if (pkmVar != null) {
            pkmVar.a("playerSoState", com.taobao.taobaoavsdk.c.a() ? str : "installing");
        }
        HashMap hashMap = new HashMap();
        if (!com.taobao.taobaoavsdk.c.a()) {
            str = "installing";
        }
        hashMap.put("playerSoState", str);
        ai.a(this.f, hashMap);
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.q = false;
        this.r = false;
    }

    public void t() {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        TBLiveRecEngineV2.RecModel recModel = this.i;
        if (recModel == null || recModel.initParams == null || StringUtils.isEmpty(this.i.liveId) || (videoFrame2 = this.j) == null || videoFrame2.hasPreloaded()) {
            return;
        }
        this.b = this.i.liveId;
        this.c = this.i.accountId;
        String str = this.i.initParams.get(aw.PARAM_TIMEMOVING_ITEM_ID);
        if (!StringUtils.isEmpty(this.i.initParams.get(aw.PARAM_SJSD_ITEM_ID)) || !StringUtils.isEmpty(str)) {
            return;
        }
        if (this.n == null) {
            this.n = new i(this);
        }
        this.n.a("https://alive-interact.alicdn.com/livedetail/common/" + this.i.liveId);
    }

    private void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
            return;
        }
        if (this.j != null) {
            HashMap hashMap = new HashMap();
            if (videoInfo != null && videoInfo.liveConfigForStream != null) {
                hashMap.put("__livePushControlInfo", videoInfo.liveConfigForStream);
            }
            this.j.callWithMsg(hashMap);
        }
        String R = poy.R(this.g) != null ? poy.R(this.g) : "";
        String str = this.i.isFirst ? "init" : obw.VIDEO_ACTION_TYPE_UPDOWNSWITCH;
        com.taobao.taolive.room.controller2.g gVar = this.g;
        String d = (gVar == null || gVar.P() == null) ? "videoFullScreen" : this.g.P().d();
        if (this.j == null || this.g == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append("entryLiveSource=");
        sb.append(R);
        sb.append(",liveSource=");
        sb.append(poy.ac(this.g));
        sb.append(",liveToken=");
        sb.append(this.g.j());
        sb.append(",videoActionType=");
        sb.append(str);
        sb.append(",vod_scenario=");
        sb.append(d);
        sb.append(",switchIndex=");
        sb.append(poy.ai(this.g));
        sb.append(",jumpType=");
        sb.append(this.B);
        sb.append(",startScrollTimeMs=");
        sb.append(this.z);
        long n = m.n();
        if (n > 0) {
            sb.append(",videoLaunchPlayTime=");
            sb.append(n);
        }
        sb.append(",isFromLauncher=");
        sb.append(m.b());
        String sb2 = sb.toString();
        if (pmd.a().m() != null) {
            pnj m = pmd.a().m();
            m.a("updatePlayExValue", "live updatePlayExValue = " + sb2);
        }
        hashMap2.put(obw.KEY_VIDEO_UPDATE_PARAMS, sb2);
        this.j.callWithMsg(hashMap2);
    }

    private boolean c(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("468b2e27", new Object[]{this, videoInfo})).booleanValue();
        }
        if (!aa.aY() || this.j == null) {
            return false;
        }
        String a2 = ak.a(videoInfo.liveUrlList);
        String d = ak.d(this.j.getPlayingUrl());
        if (a2 == null || d == null || a2.equals(d)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, videoInfo.liveId);
        hashMap.put(pqq.KEY_LIVE_SOURCE, poz.p(n.b(this.g)));
        hashMap.put("entryLiveSource", poy.R(this.g));
        hashMap.put("liveDetailTopicID", a2);
        hashMap.put("playingTopicID", d);
        ai.a((com.taobao.alilive.aliliveframework.frame.a) this.g, "StreamMistake", (Map<String, String>) hashMap);
        ab.c("StreamMistake", "liveId = " + videoInfo.liveId + " liveSource = " + poz.p(n.b(this.g)) + " entryLiveSource = " + poz.q(n.b(this.g)) + " playingUrl = " + this.j.getPlayingUrl());
        return true;
    }

    private boolean d(VideoInfo videoInfo) {
        TBLiveBizDataModel tBLiveBizDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7463c886", new Object[]{this, videoInfo})).booleanValue();
        }
        if (videoInfo != null && (tBLiveBizDataModel = this.h) != null) {
            LiveItem.SpfPlayVideo a2 = j.a(tBLiveBizDataModel.mInitParams);
            VideoFrame2 videoFrame2 = this.j;
            if (videoFrame2 != null && videoFrame2.hasPreloaded() && a2 != null && !StringUtils.isEmpty(a2.playInfo) && com.taobao.taolive.movehighlight.utils.c.j() && !StringUtils.isEmpty(videoInfo.liveUrl) && !StringUtils.isEmpty(this.j.highlightCurrentPlay)) {
                HashMap hashMap = new HashMap();
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, videoInfo.liveId);
                ai.a(19999, "compitableHighlightPreload", hashMap);
                return true;
            }
        }
        return false;
    }

    private void e(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23c62e1", new Object[]{this, videoInfo});
            return;
        }
        if (videoInfo != null) {
            try {
                if (videoInfo.millionBaby != null && v.a(videoInfo.millionBaby.gameId, 0) > 0 && videoInfo.millionBaby.playerSetting != null && this.j != null) {
                    try {
                        this.j.changeToShortDelayLive(v.a(videoInfo.millionBaby.playerSetting.maxNormalPlay, 0), v.a(videoInfo.millionBaby.playerSetting.minNormalPlay, 0), v.a(videoInfo.millionBaby.playerSetting.maxFastPlay, 0));
                        return;
                    } catch (Exception unused) {
                        this.j.changeToShortDelayLive(0, 0, 0);
                        return;
                    }
                }
            } catch (NumberFormatException unused2) {
                return;
            }
        }
        if (videoInfo == null || videoInfo.playerSetting == null || this.j == null) {
            return;
        }
        try {
            this.j.changeToShortDelayLive(v.a(videoInfo.playerSetting.maxNormalPlay, 0), v.a(videoInfo.playerSetting.minNormalPlay, 0), v.a(videoInfo.playerSetting.maxFastPlay, 0));
        } catch (Exception unused3) {
            this.j.changeToShortDelayLive(0, 0, 0);
        }
    }

    private void f(VideoInfo videoInfo) {
        VideoFrame2 videoFrame2;
        VideoFrame2 videoFrame22;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d014fd40", new Object[]{this, videoInfo});
        } else if (videoInfo.landScape || y.e(this.f)) {
            if (!aa.cb() || (videoFrame2 = this.j) == null || videoFrame2.getTaoVideoView() == null) {
                return;
            }
            String str = videoInfo.playModeLandscape;
            if (StringUtils.isEmpty(str)) {
                str = aa.cc();
            }
            IMediaPlayer.AspectRatio a2 = com.taobao.taolive.room.utils.ac.a().a(str);
            this.j.getTaoVideoView().a(a2);
            ab.e("VideoAdapterFrame", "landScape = true playModeLandscape = " + str + "landscapeAspectRation = " + a2);
        } else if (!aa.cb() || (videoFrame22 = this.j) == null || videoFrame22.getTaoVideoView() == null) {
        } else {
            String str2 = videoInfo.playModePortrait;
            if (StringUtils.isEmpty(str2)) {
                str2 = aa.cd();
            }
            IMediaPlayer.AspectRatio b = com.taobao.taolive.room.utils.ac.a().b(str2);
            this.j.getTaoVideoView().a(b);
            ab.e("VideoAdapterFrame", "landScape = false playModePortrait = " + str2 + "portraitAspectRation = " + b);
        }
    }

    private void a(String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6465f45b", new Object[]{this, str, videoInfo});
        } else if (this.j == null || videoInfo == null) {
        } else {
            ImageView imageView = null;
            if (!StringUtils.isEmpty(videoInfo.coverImg169)) {
                imageView = new ImageView(this.f);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            this.j.setVideoErrorInfo(str, imageView);
            final AliUrlImageView aliUrlImageView = new AliUrlImageView(this.f);
            aliUrlImageView.setSkipAutoSize(true);
            aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Kc64oQ1UxyVXhxmg2_!!6000000002585-54-tps-111-89.apng");
            aliUrlImageView.setImageLoadListener(new com.alilive.adapter.uikit.c() { // from class: tb.pkr.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alilive.adapter.uikit.c
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    }
                }

                @Override // com.alilive.adapter.uikit.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        aliUrlImageView.setImageDrawable(pkr.a(pkr.this).getResources().getDrawable(R.drawable.taolive_icon_error_anim));
                    }
                }
            });
            this.j.setVideoErrorLoading(aliUrlImageView);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        VideoFrame2 videoFrame2 = this.j;
        if (videoFrame2 == null) {
            return;
        }
        videoFrame2.playStreamUrl(str2, u.D(), u.E(), u.F(), poy.s(this.g), false, true);
        b(str2);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Uri parse = Uri.parse(str);
            String str2 = null;
            if (parse != null) {
                str2 = parse.getQueryParameter(CommandID.seekTo);
            }
            if (!StringUtils.isEmpty(str2) && str2.contains(".")) {
                this.j.seekTo(((int) Float.parseFloat(str2)) * 1000);
            } else if (StringUtils.isEmpty(str2) || !StringUtils.isDigitsOnly(str2)) {
            } else {
                this.j.seekTo(Integer.parseInt(str2) * 1000);
            }
        }
    }

    private boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : (this.f == null || this.g == null || b()) ? false : true;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : u.bb() == 3 || u.bb() == 2 || u.bb() == 4 || u.bb() == 5;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.g == null) {
        } else {
            ab.c("VideoAdapterFrame", this.g.j() + " " + str);
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.g.y() == null || StringUtils.isEmpty(str)) {
        } else {
            this.g.y().k = "true".equals(str);
        }
    }

    private void a(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0df487", new Object[]{this, simpleVideoInfo});
        } else if (simpleVideoInfo == null || !aa.bE()) {
        } else {
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(simpleVideoInfo.liveId)) {
                hashMap.put("feed_id", simpleVideoInfo.liveId);
            }
            if (!StringUtils.isEmpty(simpleVideoInfo.accountId)) {
                hashMap.put("account_id", simpleVideoInfo.accountId);
            }
            com.taobao.taolive.sdk.core.a.a(this.g, ai.e(this.g, this.f), hashMap);
        }
    }

    private void a(Drawable drawable) {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
        } else if (!y.a() || (videoFrame2 = this.j) == null || !(videoFrame2.getVideoView() instanceof FrameLayout) || !y.e(this.f)) {
        } else {
            this.j.addVideoBackgroundImg(this.f, drawable);
        }
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        c("resetMute");
        if (!sst.a()) {
            return;
        }
        c("resetMute isIndependentMuteABOpen true");
        if (!ar.a(this.g)) {
            return;
        }
        c("resetMute enableResetMuteFromSettingWhenResume true");
        boolean d = sst.d();
        c("resetMute result liveRoomMute = " + d);
        d dVar = this.k;
        if (dVar == null) {
            return;
        }
        dVar.b(d);
    }
}
