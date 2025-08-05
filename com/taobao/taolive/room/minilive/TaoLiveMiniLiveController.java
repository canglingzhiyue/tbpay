package com.taobao.taolive.room.minilive;

import android.app.Activity;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.room.utils.x;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.t;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.poy;

/* loaded from: classes8.dex */
public class TaoLiveMiniLiveController implements com.taobao.taolive.sdk.model.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21637a;
    public String A;
    private Activity b;
    private String c;
    private String d;
    private boolean e;
    private Map<String, String> f;
    private ViewGroup g;
    private VideoFrame h;
    private boolean i;
    private x j;
    private MiniLiveFullScreenFrame k;
    private boolean m;
    private boolean n;
    private int o;
    private Object p;
    private VideoStatus r;
    private f s;
    private a t;
    private boolean u;
    private String v;
    private String w;
    private com.taobao.alilive.aliliveframework.frame.a x;
    private boolean l = true;
    private boolean y = false;
    private t z = new t() { // from class: com.taobao.taolive.room.minilive.TaoLiveMiniLiveController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1754011296:
                    super.c((IMediaPlayer) objArr[0]);
                    return null;
                case -1343767746:
                    return new Boolean(super.a((IMediaPlayer) objArr[0], ((Number) objArr[1]).longValue(), ((Number) objArr[2]).longValue(), objArr[3]));
                case 92838762:
                    super.c();
                    return null;
                case 93762283:
                    super.d();
                    return null;
                case 274574814:
                    super.a((IMediaPlayer) objArr[0]);
                    return null;
                case 1407765407:
                    super.b((IMediaPlayer) objArr[0]);
                    return null;
                case 1874333378:
                    return new Boolean(super.a((IMediaPlayer) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
                return;
            }
            super.a(iMediaPlayer);
            if (!TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this)) {
                return;
            }
            if (TaoLiveMiniLiveController.b(TaoLiveMiniLiveController.this) && aa.bP()) {
                TaoLiveMiniLiveController.c(TaoLiveMiniLiveController.this);
            }
            ddw.a().a("com.taobao.taolive.room.minilive.video.start", null, TaoLiveMiniLiveController.this.A);
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6fb80ec2", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this, VideoStatus.VIDEO_ERROR);
            if (!TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this)) {
                return super.a(iMediaPlayer, i, i2);
            }
            ddw a2 = ddw.a();
            a2.a("com.taobao.taolive.room.minilive.video.error", "what " + i + " extra " + i2, TaoLiveMiniLiveController.this.A);
            TaoLiveMiniLiveController.d(TaoLiveMiniLiveController.this);
            return super.a(iMediaPlayer, i, i2);
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void b(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53e8cb9f", new Object[]{this, iMediaPlayer});
            } else {
                super.b(iMediaPlayer);
            }
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void c(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773e960", new Object[]{this, iMediaPlayer});
            } else {
                super.c(iMediaPlayer);
            }
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public boolean a(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("afe7bb3e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
            }
            pnj m = pmd.a().m();
            String d = TaoLiveMiniLiveController.d();
            m.a(d, "onInfo " + j);
            if (((int) j) == 3) {
                TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this, VideoStatus.RENDERING_START);
                if (!TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this)) {
                    return super.a(iMediaPlayer, j, j2, obj);
                }
                ddw.a().a("com.taobao.taolive.room.minilive.video.rendering.start", TaoLiveMiniLiveController.e(TaoLiveMiniLiveController.this) != null ? TaoLiveMiniLiveController.e(TaoLiveMiniLiveController.this).getVideoViewTokenFromMediaController() : null, TaoLiveMiniLiveController.this.A);
                TaoLiveMiniLiveController.f(TaoLiveMiniLiveController.this);
                if (TaoLiveMiniLiveController.g(TaoLiveMiniLiveController.this) != null) {
                    TaoLiveMiniLiveController.g(TaoLiveMiniLiveController.this).showNoWifiTips();
                }
            }
            return super.a(iMediaPlayer, j, j2, obj);
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this, VideoStatus.VIDEO_LEAVE);
            if (!TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this)) {
                return;
            }
            ddw.a().a("com.taobao.taolive.room.minilive.video.leave", null, TaoLiveMiniLiveController.this.A);
            TaoLiveMiniLiveController.d(TaoLiveMiniLiveController.this);
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                super.d();
            }
        }

        @Override // com.taobao.taolive.sdk.ui.media.t, tb.ppr
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this, VideoStatus.VIDEO_END);
            if (!TaoLiveMiniLiveController.a(TaoLiveMiniLiveController.this)) {
                return;
            }
            super.c();
            ddw.a().a("com.taobao.taolive.room.minilive.video.end", null, TaoLiveMiniLiveController.this.A);
            TaoLiveMiniLiveController.h(TaoLiveMiniLiveController.this);
        }
    };
    private LiveEmbedType q = LiveEmbedType.SHOP_CARD;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public enum VideoStatus {
        RENDERING_START,
        VIDEO_ERROR,
        VIDEO_LEAVE,
        VIDEO_END
    }

    /* loaded from: classes8.dex */
    public interface a {
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveMiniLiveController";
    }

    public static /* synthetic */ VideoStatus a(TaoLiveMiniLiveController taoLiveMiniLiveController, VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("5f48f660", new Object[]{taoLiveMiniLiveController, videoStatus});
        }
        taoLiveMiniLiveController.r = videoStatus;
        return videoStatus;
    }

    public static /* synthetic */ boolean a(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("696e489a", new Object[]{taoLiveMiniLiveController})).booleanValue() : taoLiveMiniLiveController.g();
    }

    public static /* synthetic */ boolean b(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b72dc09b", new Object[]{taoLiveMiniLiveController})).booleanValue() : taoLiveMiniLiveController.y;
    }

    public static /* synthetic */ void c(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed3898", new Object[]{taoLiveMiniLiveController});
        } else {
            taoLiveMiniLiveController.f();
        }
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f21637a;
    }

    public static /* synthetic */ void d(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52acb099", new Object[]{taoLiveMiniLiveController});
        } else {
            taoLiveMiniLiveController.k();
        }
    }

    public static /* synthetic */ VideoFrame e(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame) ipChange.ipc$dispatch("16a04295", new Object[]{taoLiveMiniLiveController}) : taoLiveMiniLiveController.h;
    }

    public static /* synthetic */ void f(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2ba09b", new Object[]{taoLiveMiniLiveController});
        } else {
            taoLiveMiniLiveController.l();
        }
    }

    public static /* synthetic */ MiniLiveFullScreenFrame g(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiniLiveFullScreenFrame) ipChange.ipc$dispatch("96177926", new Object[]{taoLiveMiniLiveController}) : taoLiveMiniLiveController.k;
    }

    public static /* synthetic */ void h(TaoLiveMiniLiveController taoLiveMiniLiveController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89aa909d", new Object[]{taoLiveMiniLiveController});
        } else {
            taoLiveMiniLiveController.j();
        }
    }

    static {
        kge.a(-25204127);
        kge.a(191318335);
        kge.a(-1905361424);
        f21637a = TaoLiveMiniLiveController.class.getSimpleName();
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 10000 || this.t == null || this.q != LiveEmbedType.SHOP_FULLSCREEN) {
        } else {
            j.n(this.x);
            j.m(this.x);
            this.h = null;
        }
    }

    public TaoLiveMiniLiveController(Activity activity, ViewGroup viewGroup, String str, String str2, Map<String, String> map, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.A = null;
        this.b = activity;
        this.c = str;
        this.v = poy.R(aVar);
        this.x = aVar;
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.x;
        if (aVar2 != null) {
            this.A = aVar2.G();
        }
        if (map != null) {
            this.w = map.get("sellerId");
        }
        this.d = str2;
        this.g = viewGroup;
        this.f = map;
        this.s = new f(this);
        e();
        ddw.a().a(this);
        com.taobao.taolive.sdk.playcontrol.c.a(this.x, this.z);
        i();
        k();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.e = v.e(this.f.get("mute"));
        this.l = v.e(this.f.get(aw.PARAM_EMBED_VIEW_VISIBLE));
        this.n = v.e(this.f.get("newShopCard"));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!g()) {
        } else {
            if (this.l && this.i) {
                h();
            }
            MiniLiveFullScreenFrame miniLiveFullScreenFrame = this.k;
            if (miniLiveFullScreenFrame == null) {
                return;
            }
            miniLiveFullScreenFrame.onResume();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!g()) {
        } else {
            VideoFrame videoFrame = this.h;
            if (videoFrame != null) {
                videoFrame.pause();
                this.h.stop(this.c);
            }
            MiniLiveFullScreenFrame miniLiveFullScreenFrame = this.k;
            if (miniLiveFullScreenFrame == null) {
                return;
            }
            miniLiveFullScreenFrame.onPause();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        com.taobao.taolive.sdk.playcontrol.c.c(this.x, this.z);
        VideoFrame videoFrame = this.h;
        if (videoFrame != null) {
            videoFrame.destroy();
        }
        x xVar = this.j;
        if (xVar != null) {
            xVar.a();
        }
        MiniLiveFullScreenFrame miniLiveFullScreenFrame = this.k;
        if (miniLiveFullScreenFrame != null) {
            miniLiveFullScreenFrame.onDestroy();
            this.k = null;
        }
        this.t = null;
        f fVar = this.s;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
        this.s = null;
    }

    public void a(VideoFrame videoFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976e7f73", new Object[]{this, videoFrame, new Boolean(z)});
            return;
        }
        this.h = videoFrame;
        this.i = z;
    }

    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        } else if (!g()) {
        } else {
            this.u = true;
            this.m = false;
            if (i == 1) {
                this.o = i;
                this.p = obj;
                a((TBLiveDataModel) obj);
                return;
            }
            if (i == 2) {
                this.o = i;
                this.p = obj;
                this.m = true;
                ddw.a().a("com.taobao.taolive.room.minilive.data.error", null, this.A);
            } else if (i != 9 && i != 10) {
                return;
            }
            this.o = i;
            this.p = obj;
            k();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        VideoFrame videoFrame = this.h;
        if (videoFrame == null) {
            return;
        }
        videoFrame.pausePlay();
        ddw.a().a("com.taobao.taolive.room.minilive.video.pause", null, this.A);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.q == LiveEmbedType.SHOP_CARD || this.q == LiveEmbedType.SHOP_CARD_UI_HIDE;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        VideoFrame videoFrame = this.h;
        if (videoFrame != null) {
            videoFrame.resumePlay();
        }
        b(this.e);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        VideoFrame videoFrame = this.h;
        if (videoFrame == null) {
            return;
        }
        videoFrame.setMute(z);
        this.e = z;
    }

    private void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            k();
        } else {
            VideoFrame videoFrame = this.h;
            if (videoFrame != null) {
                videoFrame.setExtraConfig(this.c, this.d);
                this.h.setMediaSourceType(tBLiveDataModel.mVideoInfo.pushFeature);
            }
            MiniLiveFullScreenFrame miniLiveFullScreenFrame = this.k;
            if (miniLiveFullScreenFrame != null) {
                if (tBLiveDataModel.mVideoInfo.status == 1) {
                    z = true;
                }
                miniLiveFullScreenFrame.setUp(z);
            }
            int i = tBLiveDataModel.mVideoInfo.status;
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        j();
                        ddw.a().a("com.taobao.taolive.room.minilive.video.end", null, this.A);
                        return;
                    } else if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                    }
                }
                a(tBLiveDataModel.mVideoInfo);
                return;
            }
            k();
        }
    }

    private void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
            return;
        }
        if (this.j == null) {
            this.j = new x(this.h, this.b, false, this.x);
        }
        int a2 = this.j.a(videoInfo, false);
        String a3 = this.j.a(videoInfo, a2);
        this.j.a(false);
        if (videoInfo.status == 0) {
            VideoFrame videoFrame = this.h;
            if (videoFrame != null) {
                videoFrame.changeStatus(0);
                b(videoInfo);
                this.h.setVideoDefinition(this.j.a(videoInfo, a2, this.x));
                if (this.l && this.i) {
                    this.h.playStreamUrl(a3, u.D(), u.E(), u.F(), poy.s(this.x));
                } else {
                    this.h.setStreamUrl(a3, poy.s(this.x));
                }
            }
        } else if (videoInfo.status == 3) {
            VideoFrame videoFrame2 = this.h;
            if (videoFrame2 != null) {
                videoFrame2.changeStatus(0);
                b(videoInfo);
                this.h.setStreamUrl(a3, poy.s(this.x));
                this.h.showVideoError(true, 0);
            }
            com.taobao.alilive.aliliveframework.frame.a aVar = this.x;
            if ((aVar instanceof g) && ((g) aVar).u() != null) {
                ((g) this.x).u().h();
            }
        }
        b(this.e);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.k != null) {
        } else {
            this.k = new MiniLiveFullScreenFrame(this.b, this.x);
            if (this.n) {
                this.k.onCreateView2((ViewGroup) this.g.findViewById(R.id.taolive_minilive_layout));
            } else {
                this.k.onCreateView((ViewStub) this.g.findViewById(R.id.taolive_status_minilive_stub));
            }
        }
    }

    private void b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b293c4", new Object[]{this, videoInfo});
            return;
        }
        if (videoInfo != null) {
            try {
                if (videoInfo.millionBaby != null && v.a(videoInfo.millionBaby.gameId, 0) > 0 && videoInfo.millionBaby.playerSetting != null && this.h != null) {
                    try {
                        this.h.changeToShortDelayLive(v.a(videoInfo.millionBaby.playerSetting.maxNormalPlay, 0), v.a(videoInfo.millionBaby.playerSetting.minNormalPlay, 0), v.a(videoInfo.millionBaby.playerSetting.maxFastPlay, 0));
                        return;
                    } catch (Exception unused) {
                        this.h.changeToShortDelayLive(0, 0, 0);
                        return;
                    }
                }
            } catch (NumberFormatException unused2) {
                return;
            }
        }
        if (videoInfo == null || videoInfo.playerSetting == null || this.h == null) {
            return;
        }
        try {
            this.h.changeToShortDelayLive(v.a(videoInfo.playerSetting.maxNormalPlay, 0), v.a(videoInfo.playerSetting.minNormalPlay, 0), v.a(videoInfo.playerSetting.maxFastPlay, 0));
        } catch (Exception unused3) {
            this.h.changeToShortDelayLive(0, 0, 0);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.k == null) {
        } else {
            Map<String, String> map = this.f;
            this.k.showEnd(map != null ? map.get(aw.PARAM_COVER_IMG) : "");
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.k == null) {
        } else {
            Map<String, String> map = this.f;
            this.k.showCoverImg(map != null ? map.get(aw.PARAM_COVER_IMG) : "");
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        MiniLiveFullScreenFrame miniLiveFullScreenFrame = this.k;
        if (miniLiveFullScreenFrame == null) {
            return;
        }
        miniLiveFullScreenFrame.hideCoverImg();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.k == null || this.q != LiveEmbedType.SHOP_CARD) {
        } else {
            this.q = LiveEmbedType.SHOP_CARD_UI_HIDE;
            this.k.hide();
            this.k.onPause();
            h();
            this.i = true;
            ddw.a().a("com.taobao.taolive.room.minilive.reset.need.play.status", null, this.A);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        if ("com.taobao.taolive.room.minilive.ui.status.from.embedview".equals(str) && (obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("status");
            if (com.alibaba.triver.triver_shop.newShop.event.broadcast.c.TYPE_FULLSCREEN.equals(string)) {
                if ("SHOW".equals(string2) && this.q != LiveEmbedType.SHOP_FULLSCREEN) {
                    if (this.q == LiveEmbedType.SHOP_CARD) {
                        m();
                    }
                    this.q = LiveEmbedType.SHOP_FULLSCREEN;
                    Message.obtain().what = 10000;
                    f fVar = this.s;
                    if (fVar != null) {
                        fVar.sendEmptyMessageDelayed(10000, 200L);
                    }
                }
            } else if ("NORMAL".equals(string)) {
                f fVar2 = this.s;
                if (fVar2 != null) {
                    fVar2.removeCallbacksAndMessages(null);
                }
                if ("HIDE".equals(string2)) {
                    m();
                } else if ("SHOW".equals(string2)) {
                    if ((this.t == null || this.q != LiveEmbedType.SHOP_FULLSCREEN) && this.q == LiveEmbedType.SHOP_CARD_UI_HIDE) {
                        this.k.show();
                        this.k.onResume();
                    }
                    this.q = LiveEmbedType.SHOP_CARD;
                }
            }
        }
        if (!g()) {
            return;
        }
        if ("com.taobao.taolive.room.minilive.video.status.from.embedview".equals(str)) {
            if (!(obj instanceof HashMap)) {
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str2 = (String) hashMap.get("status");
            String str3 = (String) hashMap.get("type");
            if ("PLAY".equals(str2)) {
                if (!"CLICK".equals(str3) && !this.i) {
                    return;
                }
                h();
                this.i = true;
            } else if ("PAUSE".equals(str2)) {
                f();
            } else if (!com.taobao.android.detail.datasdk.protocol.adapter.optional.a.PAGE_LIFECYCLE_RELOAD.equals(str2)) {
            } else {
                pmd.a().m().a(f21637a, "onEvent RELOAD");
                if (!this.m) {
                    return;
                }
                ddw.a().a("com.taobao.taolive.room.minilive.data.reload", null, this.A);
            }
        } else if ("com.taobao.taolive.room.minilive.video.mute.from.embedview".equals(str)) {
            if (!(obj instanceof Boolean)) {
                return;
            }
            b(((Boolean) obj).booleanValue());
        } else if (!"com.taobao.taolive.room.minilive.visible.status.from.embedview".equals(str) || !(obj instanceof Boolean)) {
        } else {
            this.l = ((Boolean) obj).booleanValue();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.minilive.video.status.from.embedview", "com.taobao.taolive.room.minilive.video.mute.from.embedview", "com.taobao.taolive.room.minilive.visible.status.from.embedview", "com.taobao.taolive.room.minilive.ui.status.from.embedview"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.x;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }
}
