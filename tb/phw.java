package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.good.GoodProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.j;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ac;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ak;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.room.utils.x;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.goodlist.r;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.ui.component.c;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.ui.media.playercontrol.b;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.e;
import com.uc.webview.export.media.CommandID;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.phx;

/* loaded from: classes8.dex */
public class phw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f32661a;
    public ViewGroup b;
    public VideoFrame2 c;
    public Context d;
    public TBLiveDataModel e;
    public boolean f;
    public long g;
    public boolean h;
    private BaseFrame i;
    private f j;
    private boolean k;
    private pkm l;
    private AliUrlImageView m;
    private long n;
    private x o;
    private phz q;
    private pia r;
    private com.taobao.alilive.aliliveframework.frame.a s;
    private phx.a t;
    private c u;
    private e v;
    public String w;

    static {
        kge.a(205320248);
    }

    public static /* synthetic */ BaseFrame a(phw phwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("afcfc0f3", new Object[]{phwVar}) : phwVar.i;
    }

    public static /* synthetic */ BaseFrame a(phw phwVar, BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("5cb130eb", new Object[]{phwVar, baseFrame});
        }
        phwVar.i = baseFrame;
        return baseFrame;
    }

    public static /* synthetic */ void a(phw phwVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c23cb4", new Object[]{phwVar, videoInfo});
        } else {
            phwVar.g(videoInfo);
        }
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a b(phw phwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("e8de172f", new Object[]{phwVar}) : phwVar.s;
    }

    public static /* synthetic */ void b(phw phwVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc60813", new Object[]{phwVar, videoInfo});
        } else {
            phwVar.h(videoInfo);
        }
    }

    public phw(a aVar) {
        this.w = null;
        this.f32661a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.j = a.g(aVar);
        this.k = a.h(aVar);
        this.l = a.i(aVar);
        this.m = a.j(aVar);
        this.s = a.k(aVar);
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.s;
        if (aVar2 != null) {
            this.w = aVar2.G();
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e27dec", new Object[]{this, eVar});
        } else {
            this.v = eVar;
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494b635a", new Object[]{this, cVar});
        } else {
            this.u = cVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        phz phzVar = this.q;
        if (phzVar != null) {
            phzVar.g = z;
        }
        pia piaVar = this.r;
        if (piaVar == null) {
            return;
        }
        piaVar.g = z;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.e = tBLiveDataModel;
        if (!aa.aN()) {
            return;
        }
        phz phzVar = this.q;
        if (phzVar != null) {
            phzVar.a(tBLiveDataModel);
        }
        pia piaVar = this.r;
        if (piaVar == null) {
            return;
        }
        piaVar.a(tBLiveDataModel);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.t == null) {
            this.t = new phx.a() { // from class: tb.phw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.phx.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        phw.this.a(str);
                    }
                }

                @Override // tb.phx.a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else {
                        phw.this.h = z;
                    }
                }

                @Override // tb.phx.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        phw.this.d();
                    }
                }

                @Override // tb.phx.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        phw.this.c();
                    }
                }

                @Override // tb.phx.a
                public void a(BaseFrame baseFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d2b08e2", new Object[]{this, baseFrame});
                    } else {
                        phw.a(phw.this, baseFrame);
                    }
                }

                @Override // tb.phx.a
                public BaseFrame c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (BaseFrame) ipChange2.ipc$dispatch("ca5f5ce4", new Object[]{this}) : phw.a(phw.this);
                }
            };
        }
        if (this.q == null) {
            this.q = new phz(this.f32661a, this.b, this.c, this.d, this.e, this.f, this.s, this.t);
        }
        if (this.r == null) {
            this.r = new pia(this.f32661a, this.b, this.c, this.d, this.e, this.f, this.s, this.t);
        }
        if (y.b(this.d)) {
            return;
        }
        ((Activity) this.d).setRequestedOrientation(1);
    }

    public void a(VideoInfo videoInfo, String str, String str2, String str3) {
        VideoFrame2 videoFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f9d83", new Object[]{this, videoInfo, str, str2, str3});
            return;
        }
        e(videoInfo);
        if (this.c != null) {
            int a2 = this.o.a(videoInfo, !TextUtils.isEmpty(str));
            String a3 = this.o.a(videoInfo, a2);
            this.o.a(false);
            if (videoInfo.status == 0) {
                VideoFrame2 videoFrame22 = this.c;
                if (videoFrame22 != null) {
                    videoFrame22.changeStatus(0);
                    boolean c = c(videoInfo);
                    if (!this.c.hasPreloaded() || ((aa.aW() && this.c.isPreloadedFailed()) || d(videoInfo) || c)) {
                        f(videoInfo);
                        this.c.setVideoDefinition(this.o.a(videoInfo, a2, this.s));
                        pkm pkmVar = this.l;
                        if (pkmVar != null) {
                            com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
                            if (aVar instanceof com.taobao.taolive.sdk.core.e) {
                                String t = ((com.taobao.taolive.sdk.core.e) aVar).y().aJ_().b().t();
                                if (!TextUtils.isEmpty(t) && TextUtils.equals(videoInfo.liveId, t)) {
                                    this.l.e("detailPre");
                                } else {
                                    this.l.e("mtopLiveUrlList");
                                }
                            } else {
                                pkmVar.e("mtopLiveUrlList");
                            }
                            this.l.f(str3);
                        }
                        this.c.setToken(str2);
                        this.c.playStreamUrl(a3, u.D(), u.E(), u.F(), poy.s(this.s), false, true);
                        c cVar = this.u;
                        if (cVar != null) {
                            cVar.onLiveStartPlay(false);
                        }
                    }
                    String str4 = null;
                    try {
                        Object[] objArr = new Object[4];
                        objArr[0] = videoInfo.broadCaster.accountId;
                        objArr[1] = !TextUtils.isEmpty(a3) ? URLEncoder.encode(a3, "UTF-8") : "";
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
                m.b("showLive info.status LIVE_STATUS_LIVE " + this.c);
            } else if (videoInfo.status == 3) {
                VideoFrame2 videoFrame23 = this.c;
                if (videoFrame23 != null) {
                    videoFrame23.changeStatus(0);
                    f(videoInfo);
                    this.c.setStreamUrl(a3, poy.s(this.s));
                    this.c.showVideoError(true, 0);
                }
                com.taobao.alilive.aliliveframework.frame.a aVar2 = this.s;
                if ((aVar2 instanceof g) && ((g) aVar2).u() != null) {
                    ((g) this.s).u().h();
                }
                m.b("showLive info.status LIVE_STATUS_PAUSE " + this.c);
                com.taobao.taolive.room.utils.a.a(this.d, this.s);
            } else if (o.D() && (videoFrame2 = this.c) != null) {
                videoFrame2.changeStatus(0);
                this.c.setStreamUrl(a3, poy.s(this.s));
                this.c.showVideoError(true, 0);
            }
        }
        m.b("showLive info.status " + videoInfo.status);
        if (this.k) {
            return;
        }
        if (videoInfo.landScape && !videoInfo.fullScreen && g()) {
            this.r.a(this.t).g().f().c();
        } else {
            this.q.a().c();
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : !y.a() || !this.f;
    }

    private boolean c(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("468b2e27", new Object[]{this, videoInfo})).booleanValue();
        }
        if (!aa.aY() || this.c == null) {
            return false;
        }
        String a2 = ak.a(videoInfo.liveUrlList);
        String d = ak.d(this.c.getPlayingUrl());
        if (a2 == null || d == null || a2.equals(d)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, videoInfo.liveId);
        hashMap.put(pqq.KEY_LIVE_SOURCE, poz.p(n.b(this.s)));
        hashMap.put("entryLiveSource", poy.R(this.s));
        hashMap.put("liveDetailTopicID", a2);
        hashMap.put("playingTopicID", d);
        ai.a(this.s, "StreamMistake", (Map<String, String>) hashMap);
        ab.c("StreamMistake", "liveId = " + videoInfo.liveId + " liveSource = " + poz.p(n.b(this.s)) + " entryLiveSource = " + poz.q(n.b(this.s)) + " playingUrl = " + this.c.getPlayingUrl());
        return true;
    }

    private boolean d(VideoInfo videoInfo) {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7463c886", new Object[]{this, videoInfo})).booleanValue();
        }
        if (videoInfo != null && (tBLiveDataModel = this.e) != null) {
            LiveItem.SpfPlayVideo a2 = j.a(tBLiveDataModel.mInitParams);
            VideoFrame2 videoFrame2 = this.c;
            if (videoFrame2 != null && videoFrame2.hasPreloaded() && a2 != null && !TextUtils.isEmpty(a2.playInfo) && com.taobao.taolive.movehighlight.utils.c.j() && !TextUtils.isEmpty(videoInfo.liveUrl) && !TextUtils.isEmpty(this.c.highlightCurrentPlay)) {
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
        b(ag.CALC_ENTER, videoInfo);
        f fVar = this.j;
        if (fVar != null) {
            fVar.sendEmptyMessageDelayed(0, 10000L);
            this.g = System.currentTimeMillis();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
            if (aVar instanceof com.taobao.taolive.sdk.core.e) {
                ((com.taobao.taolive.sdk.core.e) aVar).D = System.currentTimeMillis();
            }
        }
        a("网络环境不稳定，请刷新重试", videoInfo);
        if (this.c == null) {
            return;
        }
        if (poy.s(this.s)) {
            this.c.updateSubBusinessType("TbLiveTV");
        }
        if (this.o != null) {
            return;
        }
        this.o = new x(this.c, (Activity) this.d, false, this.s);
    }

    private void f(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d014fd40", new Object[]{this, videoInfo});
            return;
        }
        if (videoInfo != null) {
            try {
                if (videoInfo.millionBaby != null && v.a(videoInfo.millionBaby.gameId, 0) > 0 && videoInfo.millionBaby.playerSetting != null && this.c != null) {
                    try {
                        this.c.changeToShortDelayLive(v.a(videoInfo.millionBaby.playerSetting.maxNormalPlay, 0), v.a(videoInfo.millionBaby.playerSetting.minNormalPlay, 0), v.a(videoInfo.millionBaby.playerSetting.maxFastPlay, 0));
                        return;
                    } catch (Exception unused) {
                        this.c.changeToShortDelayLive(0, 0, 0);
                        return;
                    }
                }
            } catch (NumberFormatException unused2) {
                return;
            }
        }
        if (videoInfo == null || videoInfo.playerSetting == null || this.c == null) {
            return;
        }
        try {
            this.c.changeToShortDelayLive(v.a(videoInfo.playerSetting.maxNormalPlay, 0), v.a(videoInfo.playerSetting.minNormalPlay, 0), v.a(videoInfo.playerSetting.maxFastPlay, 0));
        } catch (Exception unused3) {
            this.c.changeToShortDelayLive(0, 0, 0);
        }
    }

    private void a(String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6465f45b", new Object[]{this, str, videoInfo});
        } else if (this.c == null || videoInfo == null) {
        } else {
            ImageView imageView = null;
            if (!TextUtils.isEmpty(videoInfo.coverImg169)) {
                imageView = new ImageView(this.d);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            this.c.setVideoErrorInfo(str, imageView);
            final AliUrlImageView aliUrlImageView = new AliUrlImageView(this.d);
            aliUrlImageView.setSkipAutoSize(true);
            aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Kc64oQ1UxyVXhxmg2_!!6000000002585-54-tps-111-89.apng");
            aliUrlImageView.setImageLoadListener(new com.alilive.adapter.uikit.c() { // from class: tb.phw.2
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
                        aliUrlImageView.setImageDrawable(phw.this.d.getResources().getDrawable(R.drawable.taolive_icon_error_anim));
                    }
                }
            });
            this.c.setVideoErrorLoading(aliUrlImageView);
        }
    }

    public void a(VideoInfo videoInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ab1ff9", new Object[]{this, videoInfo, str, str2});
            return;
        }
        b(ag.CALC_REPLAY_ENTER, videoInfo);
        if (this.c != null) {
            a(this.d.getString(R.string.taolive_replay_video_error_hint), videoInfo);
            this.c.changeStatus(2);
            if (TextUtils.isEmpty(this.c.getVideoViewToken())) {
                pkm pkmVar = this.l;
                if (pkmVar != null) {
                    pkmVar.e("mtopReplayUrl");
                    this.l.f(str);
                }
                a(videoInfo.bizCode, videoInfo.replayUrl);
                c cVar = this.u;
                if (cVar != null) {
                    cVar.onLiveStartPlay(false);
                }
            }
        }
        if (this.k) {
            return;
        }
        if (videoInfo.landScape && videoInfo.publishCommentsUseMtop && videoInfo.fetchCommentsUseMtop) {
            this.r.a(this.t).h().f().c();
            f();
            return;
        }
        this.q.b().c();
        a(this.q.e(), videoInfo, str2);
    }

    private void a(BaseFrame baseFrame, VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84736b5", new Object[]{this, baseFrame, videoInfo, str});
            return;
        }
        VideoFrame2 videoFrame2 = this.c;
        if (videoFrame2 == null || !(baseFrame instanceof ppy)) {
            return;
        }
        ppy ppyVar = (ppy) baseFrame;
        PlayerController2 playerController = videoFrame2.getPlayerController();
        if (playerController != null) {
            playerController.setControllerHolder((com.taobao.taolive.sdk.ui.media.playercontrol.a) ppyVar.getControllerHolder(null));
            playerController.setPlayRateDefalut();
            playerController.showController(2);
            playerController.setPlayRateListener(new com.taobao.taolive.sdk.ui.media.playercontrol.c() { // from class: tb.phw.3
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
                    ai.a(phw.b(phw.this), "MultiSpeed", (Map<String, String>) hashMap);
                    return false;
                }
            });
            playerController.setIPlayForwardListener(new b() { // from class: tb.phw.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        ai.a(phw.b(phw.this), "Forward", new String[0]);
                    }
                }

                @Override // com.taobao.taolive.sdk.ui.media.playercontrol.b
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        ai.a(phw.b(phw.this), "Backword", new String[0]);
                    }
                }
            });
        }
        ppyVar.setBackView(this.c.getContentView());
    }

    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
            return;
        }
        b(ag.CALC_PRELIVE_ENTER, videoInfo);
        if (videoInfo == null || videoInfo.broadCaster == null || TextUtils.isEmpty(videoInfo.broadCaster.accountId)) {
            return;
        }
        String b = com.taobao.taolive.room.utils.c.b(videoInfo.broadCaster.accountId);
        if (!TextUtils.isEmpty(videoInfo.broadCaster.accountInfoNewUrl)) {
            b = videoInfo.broadCaster.accountInfoNewUrl;
        }
        ai.c(this.s);
        s.a(this.d, b);
        this.s.e().a("com.taobao.taolive.room.killself", null, this.w);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        PlayerController2 playerController2 = null;
        VideoFrame2 videoFrame2 = this.c;
        if (videoFrame2 != null) {
            playerController2 = videoFrame2.getPlayerController();
        }
        if (playerController2 == null) {
            return;
        }
        playerController2.setDefaultControllerHolder(this.s);
        playerController2.setPlayRateDefalut();
        if (poy.at(this.s)) {
            playerController2.showController(2);
        } else {
            playerController2.showController(1);
        }
        playerController2.setPlayRateViewShow(aa.A());
        playerController2.setFullScreen(false);
        playerController2.refreshController();
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        VideoFrame2 videoFrame2 = this.c;
        if (videoFrame2 == null) {
            return;
        }
        videoFrame2.playStreamUrl(str2, u.D(), u.E(), u.F(), poy.s(this.s), false, true);
        b(str2);
    }

    public void a(String str) {
        AliUrlImageView aliUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (aliUrlImageView = this.m) == null) {
        } else {
            aliUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.m.setImageUrl(str);
            this.m.setVisibility(0);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Uri parse = Uri.parse(str);
            String str2 = null;
            if (parse != null) {
                str2 = parse.getQueryParameter(CommandID.seekTo);
            }
            if (!TextUtils.isEmpty(str2) && str2.contains(".")) {
                this.c.seekTo(((int) Float.parseFloat(str2)) * 1000);
            } else if (TextUtils.isEmpty(str2) || !TextUtils.isDigitsOnly(str2)) {
            } else {
                this.c.seekTo(v.a(str2, 0) * 1000);
            }
        }
    }

    private void b(String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4654fa", new Object[]{this, str, videoInfo});
        } else if (videoInfo == null) {
        } else {
            this.n = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            int i = videoInfo.roomType;
            if (poy.b(videoInfo, this.s)) {
                i = 13;
            }
            String str2 = "1";
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountType", k.a(videoInfo.broadCaster.type) + "");
                hashMap.put("account_id", videoInfo.broadCaster.accountId);
                hashMap.put(ag.KEY_IS_FANS, videoInfo.broadCaster.follow ? str2 : "0");
            }
            ibt ibtVar = null;
            com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
            if (aVar instanceof com.taobao.taolive.sdk.core.e) {
                ibtVar = ((com.taobao.taolive.sdk.core.e) aVar).y().aJ_().a();
            }
            hashMap.put("feedId", videoInfo.liveId);
            hashMap.put("feed_id", videoInfo.liveId);
            hashMap.put(ag.KEY_FEED_TYPE, videoInfo.type + "");
            if (ibtVar != null) {
                hashMap.put("from", ibtVar.b());
                hashMap.put("livesource", ibtVar.N());
                hashMap.put("trackInfo", ibtVar.c());
            }
            hashMap.put("entrySource", poz.q(n.b(this.s)));
            hashMap.put("roomtype2=", i + "");
            if (!videoInfo.landScape) {
                str2 = "0";
            }
            hashMap.put("landscape", str2);
            hashMap.put("deviceLevel", com.taobao.taolive.room.utils.k.a() + "");
            hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, poy.N(this.s));
            ai.a(this.s, str, (Map<String, String>) hashMap);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        VideoInfo a2 = k.a(this.e);
        ibt ibtVar = null;
        com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            ibtVar = ((com.taobao.taolive.sdk.core.e) aVar).y().aJ_().a();
        }
        if (a2 == null || a2.broadCaster == null || !"1".equals(a2.roomStatus)) {
            return;
        }
        int i = a2.roomType;
        if (poy.b(a2, this.s)) {
            i = 13;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.s;
        ai.a(aVar2, ag.CALC_STAY_TIME, "duration=" + ((System.currentTimeMillis() - this.g) / 1000));
        String b = ibtVar != null ? ibtVar.b() : "";
        com.taobao.alilive.aliliveframework.frame.a aVar3 = this.s;
        ai.a(aVar3, "TaoLiveLeave", "from=" + b, "livesource=" + poz.p(n.b(this.s)), "entrySource=" + poz.q(n.b(this.s)), "duration=" + (System.currentTimeMillis() - this.n), "deviceLevel=" + com.taobao.taolive.room.utils.k.a(), "roomtype2=" + i, "feed_id=" + a2.liveId, "feedtype=" + a2.type);
    }

    public void c() {
        VideoFrame2 videoFrame2;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ddw.a().a(xkw.EVENT_GIFT_ROOM_SCREEN_ORIENTATION_CHANGED, "portrait", this.w);
        com.taobao.taolive.room.ui.fanslevel.a.a().e();
        final VideoInfo a2 = k.a(this.e);
        if (a2 == null) {
            return;
        }
        PlayerController2 playerController2 = null;
        GoodProxy.getInstance().setListCacheData(this.s.c() == null ? null : (r) this.s.c(), a2.liveId, "");
        poy.a(false, this.s);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
        if (aVar != null) {
            aVar.b = false;
        }
        if (y.a()) {
            a(false);
        }
        if (aa.bR()) {
            this.j.postDelayed(new Runnable() { // from class: tb.phw.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ddw.a().a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, null, phw.this.w);
                    ddw.a().a("com.taobao.taolive.room.enable_updown_switch", null, phw.this.w);
                }
            }, 300L);
        }
        VideoFrame2 videoFrame22 = this.c;
        if (videoFrame22 != null) {
            playerController2 = videoFrame22.getPlayerController();
        }
        if (playerController2 != null) {
            playerController2.toggleScreen(true, false);
        }
        if (a2.landScape && !this.h) {
            if (aa.bH()) {
                c(false);
            }
            if (aa.bH() && (viewGroup = this.b) != null) {
                viewGroup.post(new Runnable() { // from class: tb.phw.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            phw.a(phw.this, a2);
                        }
                    }
                });
            } else {
                g(a2);
            }
        } else if (y.b(this.d)) {
            h(a2);
        }
        com.taobao.taolive.sdk.core.j.n(this.s);
        com.taobao.taolive.sdk.core.j.m(this.s);
        if (!aa.cb() || (videoFrame2 = this.c) == null || videoFrame2.getTaoVideoView() == null) {
            return;
        }
        String str = a2.playModePortrait;
        if (TextUtils.isEmpty(str)) {
            str = aa.cd();
        }
        if (y.a() && y.b(this.d)) {
            str = a2.playModeLandscape;
            if (TextUtils.isEmpty(str)) {
                str = aa.cc();
            }
        }
        this.c.getTaoVideoView().a(ac.a().b(str));
    }

    private void g(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fded979f", new Object[]{this, videoInfo});
            return;
        }
        if ("1".equals(videoInfo.roomStatus)) {
            this.r.a(this.t).g().f().c();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
            com.taobao.taolive.sdk.core.j.a(aVar, aVar.j(), this.e);
        } else if ("2".equals(videoInfo.roomStatus)) {
            this.r.a(this.t).h().f().c();
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        e eVar = this.v;
        if (eVar == null || eVar.h() == null) {
            return;
        }
        this.v.f();
    }

    public void d() {
        VideoFrame2 videoFrame2;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ddw.a().a(xkw.EVENT_GIFT_ROOM_SCREEN_ORIENTATION_CHANGED, "landscape", this.w);
        com.taobao.taolive.room.ui.fanslevel.a.a().e();
        final VideoInfo a2 = k.a(this.e);
        if (a2 == null) {
            return;
        }
        GoodProxy.getInstance().setListCacheData(this.s.c() == null ? null : (r) this.s.c(), a2.liveId, "");
        poy.a(true, this.s);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
        if (aVar != null) {
            aVar.b = true;
        }
        if (aa.bR()) {
            ddw.a().a(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH);
            if (y.a() && (y.b(this.d) || y.c(this.d))) {
                ddw.a().a("com.taobao.taolive.room.enable_updown_switch", null, this.w);
            } else {
                ddw.a().a("com.taobao.taolive.room.disable_updown_switch", null, this.w);
            }
        }
        if (y.a()) {
            a(true);
        }
        if ((a2.landScape && this.h) || y.e(this.d)) {
            if (aa.bH()) {
                c(true);
            }
            if (aa.bH() && (viewGroup = this.b) != null) {
                viewGroup.post(new Runnable() { // from class: tb.phw.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            phw.b(phw.this, a2);
                        }
                    }
                });
            } else {
                h(a2);
            }
            ai.a(this.s, ag.CROSS_SCREEN, new String[0]);
            if (!y.e(this.d)) {
                ddw.a().a("com.taobao.taolive.room.need_back", null, this.w);
            }
        }
        com.taobao.taolive.sdk.core.j.n(this.s);
        com.taobao.taolive.sdk.core.j.m(this.s);
        if (!aa.cb() || (videoFrame2 = this.c) == null || videoFrame2.getTaoVideoView() == null) {
            return;
        }
        String str = a2.playModeLandscape;
        if (TextUtils.isEmpty(str)) {
            str = aa.cc();
        }
        this.c.getTaoVideoView().a(ac.a().a(str));
    }

    private void h(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc631fe", new Object[]{this, videoInfo});
            return;
        }
        if ("1".equals(videoInfo.roomStatus)) {
            this.q.a().c();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
            com.taobao.taolive.sdk.core.j.a(aVar, aVar.j(), this.e);
        } else if ("2".equals(videoInfo.roomStatus)) {
            this.q.b().c();
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        e eVar = this.v;
        if (eVar == null || eVar.h() == null) {
            return;
        }
        this.v.f();
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        poy.a(z, this.s);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.s;
        if (aVar != null) {
            aVar.b = z;
        }
        if (z) {
            if (((Activity) this.d).getRequestedOrientation() != 1) {
                return;
            }
            ((Activity) this.d).setRequestedOrientation(0);
        } else if (((Activity) this.d).getRequestedOrientation() != 0) {
        } else {
            ((Activity) this.d).setRequestedOrientation(1);
        }
    }

    public BaseFrame e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("15876ee6", new Object[]{this}) : this.i;
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private BaseFrame f32669a;
        private ViewGroup b;
        private VideoFrame2 c;
        private Context d;
        private TBLiveDataModel e;
        private boolean f;
        private f g;
        private boolean h;
        private pkm i;
        private AliUrlImageView j;
        private com.taobao.alilive.aliliveframework.frame.a k;

        static {
            kge.a(-1276375281);
        }

        public static /* synthetic */ BaseFrame a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("23d94356", new Object[]{aVar}) : aVar.f32669a;
        }

        public static /* synthetic */ ViewGroup b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("b4e2c858", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ VideoFrame2 c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VideoFrame2) ipChange.ipc$dispatch("e44799f3", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Context d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ed566797", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ TBLiveDataModel e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("6189faaf", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2100a25", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ f g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("e1d29fac", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("95c6dea7", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ pkm i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (pkm) ipChange.ipc$dispatch("2d58d90", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ AliUrlImageView j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("631699c7", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("9a5ba31b", new Object[]{aVar}) : aVar.k;
        }

        public a a(AliUrlImageView aliUrlImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6c2d9100", new Object[]{this, aliUrlImageView});
            }
            this.j = aliUrlImageView;
            return this;
        }

        public a a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b3ec228", new Object[]{this, baseFrame});
            }
            this.f32669a = baseFrame;
            return this;
        }

        public a a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae75803", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public a a(VideoFrame2 videoFrame2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a2faddad", new Object[]{this, videoFrame2});
            }
            this.c = videoFrame2;
            return this;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("21e8746a", new Object[]{this, context});
            }
            this.d = context;
            return this;
        }

        public a a(TBLiveDataModel tBLiveDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c74b5d09", new Object[]{this, tBLiveDataModel});
            }
            this.e = tBLiveDataModel;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("67e232de", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6dab192a", new Object[]{this, fVar});
            }
            this.g = fVar;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c1bd9d1f", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a a(pkm pkmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b153b7c4", new Object[]{this, pkmVar});
            }
            this.i = pkmVar;
            return this;
        }

        public a a(com.taobao.alilive.aliliveframework.frame.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2713300d", new Object[]{this, aVar});
            }
            this.k = aVar;
            return this;
        }

        public phw a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (phw) ipChange.ipc$dispatch("f09237f", new Object[]{this}) : new phw(this);
        }
    }
}
