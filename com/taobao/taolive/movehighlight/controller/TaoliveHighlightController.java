package com.taobao.taolive.movehighlight.controller;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.movehighlight.utils.d;
import com.taobao.taolive.movehighlight.utils.i;
import com.taobao.taolive.movehighlight.utils.l;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import java.util.Map;
import tb.cgl;
import tb.ipx;
import tb.irj;
import tb.irk;
import tb.irl;
import tb.kge;
import tb.lmx;
import tb.pfa;
import tb.pfb;
import tb.pfd;
import tb.pgf;
import tb.pgl;
import tb.pgp;
import tb.pgs;
import tb.phq;
import tb.pkm;
import tb.pmd;
import tb.pnn;
import tb.poy;
import tb.poz;
import tb.pqi;
import tb.pqj;
import tb.tih;
import tb.tii;

/* loaded from: classes8.dex */
public class TaoliveHighlightController extends BaseFrame implements com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private lmx alimamaQZTManager;
    private pfd eventLiveListener;
    private com.taobao.taolive.movehighlight.bean.a highlightPlayInfo;
    private AliUrlImageView mBackgroundImage;
    private pgp mBasePreloadRequest;
    private String mCoverImage;
    private boolean mEnterRequest;
    private boolean mFirstFrameRendered;
    private com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private f mHandler;
    private boolean mHideUI;
    private String mHighlightUrl;
    private String mId;
    private boolean mLandscapeVideo;
    private String mLiveSource;
    private JSONObject mMediaInfo;
    private tih mPMController;
    private pkm mPerfomenceTrackManager;
    private ViewGroup mRoomLayout;
    private String mSjsdItemId;
    private e mTBLiveInteractiveManager;
    private pgs mTaoliveShowByStatus;
    private String mTimeMovingItemId;
    private String mToken;
    private String mTrackId;
    private String mUserId;
    private VideoFrame2 mVideoFrame;

    /* loaded from: classes8.dex */
    public interface a {
    }

    public static /* synthetic */ Object ipc$super(TaoliveHighlightController taoliveHighlightController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 690752966:
                super.onBindData((TBLiveDataModel) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a access$000(TaoliveHighlightController taoliveHighlightController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("9d8ebce6", new Object[]{taoliveHighlightController}) : taoliveHighlightController.mFrameContext;
    }

    static {
        kge.a(1129326677);
        kge.a(-1905361424);
        TAG = TaoliveHighlightController.class.getSimpleName();
    }

    public TaoliveHighlightController(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mFirstFrameRendered = false;
        this.mEnterRequest = true;
        this.mToken = "";
        this.mFrameContext = aVar;
        bindData(tBLiveDataModel);
        pfb.a(this.mFrameContext).a(new pgl());
        if (c.F()) {
            this.mPMController = new tih();
        }
    }

    public void initFrameLayout(VideoFrame2 videoFrame2, ViewGroup viewGroup, AliUrlImageView aliUrlImageView, pkm pkmVar, com.taobao.taolive.movehighlight.bean.a aVar, pgp pgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e921b29c", new Object[]{this, videoFrame2, viewGroup, aliUrlImageView, pkmVar, aVar, pgpVar});
            return;
        }
        viewGroup.removeAllViews();
        this.mVideoFrame = videoFrame2;
        this.mRoomLayout = viewGroup;
        this.mBackgroundImage = aliUrlImageView;
        this.mPerfomenceTrackManager = pkmVar;
        this.highlightPlayInfo = aVar;
        this.mBasePreloadRequest = pgpVar;
        this.mHandler = new f(this);
        this.eventLiveListener = new pfd(this.mLiveDataModel, this.mLandscape, this.mContext, this.mFrameContext);
    }

    public void setmBasePreloadRequest(pgp pgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6d2a20", new Object[]{this, pgpVar});
        } else {
            this.mBasePreloadRequest = pgpVar;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (this.eventLiveListener == null) {
            this.eventLiveListener = new pfd(this.mLiveDataModel, this.mLandscape, this.mContext, this.mFrameContext);
        }
        TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || i != 1) {
            return;
        }
        pqi.a().c(TAG, "STATUS_INIT_SUCCESS");
        if (tBLiveDataModel.mInitParams != null) {
            poz.a(tBLiveDataModel.mInitParams.get("spm"), n.b(this.mFrameContext));
            poz.b(tBLiveDataModel.mInitParams.get("trackInfo"), n.b(this.mFrameContext));
            poz.e(tBLiveDataModel.mInitParams.get(aw.PARAM_TRACK_LIVEOPRT_ID), n.b(this.mFrameContext));
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p().getBackwardX() != null) {
            com.taobao.android.live.plugin.proxy.f.p().getBackwardX().a(this.mLiveDataModel, n.b(this.mFrameContext), this.mFrameContext);
        }
        pmd.a().m().b("vanda", "STATUS_INIT_SUCCESS info = " + obj);
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.i(this.mTrackId);
        }
        String str = "livedetail end:" + System.currentTimeMillis();
        pkm pkmVar2 = this.mPerfomenceTrackManager;
        if (pkmVar2 != null) {
            pkmVar2.j(this.mTrackId);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (tBLiveDataModel.mVideoInfo.broadCaster != null) {
            hashMap.put("account_id", tBLiveDataModel.mVideoInfo.broadCaster.accountId);
        }
        if ((this.mContext instanceof Activity) && ((Activity) this.mContext).getIntent() != null) {
            hashMap.put("liveUrl", ((Activity) this.mContext).getIntent().getDataString());
        }
        hashMap.put("livesource", poz.p(n.b(this.mFrameContext)));
        hashMap.put("live_id", tBLiveDataModel.mVideoInfo.liveId);
        hashMap.put("roomType", String.valueOf(tBLiveDataModel.mVideoInfo.roomType));
        hashMap.put("newRoomType", String.valueOf(tBLiveDataModel.mVideoInfo.newRoomType));
        hashMap.put("isLandScape", String.valueOf(poy.e(this.mFrameContext)));
        if (this.mTBLiveInteractiveManager == null) {
            this.mTBLiveInteractiveManager = new e(this.mContext, this.mFrameContext, this.mCreateViewTime);
        }
        this.mTBLiveInteractiveManager.a(this.mLiveDataModel.mVideoInfo, poy.R(this.mFrameContext), this.mLiveSource, hashMap);
        this.mTBLiveInteractiveManager.a(new irl(this.mFrameContext));
        this.mTBLiveInteractiveManager.a(new irj(this.mFrameContext, this));
        this.mTBLiveInteractiveManager.a(new irk());
        ((phq) this.mFrameContext).a(this.mTBLiveInteractiveManager);
        if (u.aZ()) {
            if (this.alimamaQZTManager == null) {
                this.alimamaQZTManager = new lmx(this.mFrameContext);
            }
            this.alimamaQZTManager.e();
        }
        redirRoom(this.mLiveDataModel);
        subscribePM(tBLiveDataModel);
        i.a("", this.mFrameContext, "timeMovingItemId=" + this.mTimeMovingItemId, "sjsdItemId=" + this.mSjsdItemId);
    }

    private void subscribePM(final TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcc13c7", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || !"1".equals(tBLiveDataModel.mVideoInfo.roomStatus) || this.mPMController == null) {
        } else {
            this.mPMController.a(new tii(tBLiveDataModel.mVideoInfo.channel, "1".equals(tBLiveDataModel.mVideoInfo.roomStatus), tBLiveDataModel.mVideoInfo.topic, tBLiveDataModel.mVideoInfo.liveId, new pnn() { // from class: com.taobao.taolive.movehighlight.controller.TaoliveHighlightController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnn
                public Map<String, String> getHeartParams() {
                    JSONObject b;
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("ab918d32", new Object[]{this});
                    }
                    HashMap hashMap = new HashMap();
                    if ((TaoliveHighlightController.access$000(TaoliveHighlightController.this).z() instanceof com.taobao.taolive.sdk.controller.e) && !TextUtils.isEmpty(((com.taobao.taolive.sdk.controller.e) TaoliveHighlightController.access$000(TaoliveHighlightController.this).z()).v())) {
                        hashMap.put(aw.PARAM_PM_PARAMS, ((com.taobao.taolive.sdk.controller.e) TaoliveHighlightController.access$000(TaoliveHighlightController.this).z()).v());
                    }
                    if (tBLiveDataModel.mInitParams != null && !TextUtils.isEmpty(tBLiveDataModel.mInitParams.get(aw.PARAM_IGNORE_PV))) {
                        hashMap.put(aw.PARAM_IGNORE_PV, tBLiveDataModel.mInitParams.get(aw.PARAM_IGNORE_PV));
                    }
                    if (tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.pmContext != null) {
                        hashMap.put("pmContext", tBLiveDataModel.mVideoInfo.pmContext.toJSONString());
                    }
                    if (tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.broadCaster != null) {
                        hashMap.put("account_id", tBLiveDataModel.mVideoInfo.broadCaster.accountId);
                        hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(tBLiveDataModel.mVideoInfo.status));
                        hashMap.put("feed_id", tBLiveDataModel.mVideoInfo.liveId);
                        hashMap.put("liveServerParams", tBLiveDataModel.mVideoInfo.trackInfo);
                        hashMap.put("roomType", String.valueOf(tBLiveDataModel.mVideoInfo.roomType));
                        hashMap.put("newRoomType", String.valueOf(tBLiveDataModel.mVideoInfo.newRoomType));
                        hashMap.put("roomStatus", tBLiveDataModel.mVideoInfo.roomStatus);
                        hashMap.put("streamStatus", tBLiveDataModel.mVideoInfo.streamStatus);
                        if (tBLiveDataModel.mVideoInfo.isOfficialType()) {
                            hashMap.put("officialLiveId", tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
                            hashMap.put("officialAccountId", tBLiveDataModel.mVideoInfo.officialLiveInfo.accountId);
                        }
                    }
                    if (o.L() && TaoliveHighlightController.access$000(TaoliveHighlightController.this) != null) {
                        hashMap.put("liveToken", TaoliveHighlightController.access$000(TaoliveHighlightController.this).j());
                    }
                    if (TaoliveHighlightController.access$000(TaoliveHighlightController.this) != null) {
                        hashMap.put("pmSession", TaoliveHighlightController.access$000(TaoliveHighlightController.this).j());
                    }
                    String L = poy.L(TaoliveHighlightController.access$000(TaoliveHighlightController.this));
                    if ("tpp_88".equals(poz.p(n.b(TaoliveHighlightController.access$000(TaoliveHighlightController.this)))) && !TextUtils.isEmpty(poy.Y(TaoliveHighlightController.access$000(TaoliveHighlightController.this))) && (b = pqj.b(Uri.decode(poy.Y(TaoliveHighlightController.access$000(TaoliveHighlightController.this))))) != null && b.getString("trackInfo") != null) {
                        L = b.getString("trackInfo");
                    }
                    hashMap.put("trackInfo", L);
                    hashMap.put("clickid", poy.m(TaoliveHighlightController.access$000(TaoliveHighlightController.this)));
                    hashMap.put("livesource", poz.p(n.b(TaoliveHighlightController.access$000(TaoliveHighlightController.this))));
                    hashMap.put("entry_source", poy.R(TaoliveHighlightController.access$000(TaoliveHighlightController.this)));
                    if ((!hashMap.containsKey("spm-url") || TextUtils.isEmpty((CharSequence) hashMap.get("spm-url"))) && (TaoliveHighlightController.access$000(TaoliveHighlightController.this) instanceof com.taobao.taolive.sdk.core.e)) {
                        hashMap.put("spm-url", poy.K(TaoliveHighlightController.access$000(TaoliveHighlightController.this)));
                    }
                    hashMap.put("isAD", String.valueOf(poy.w(TaoliveHighlightController.access$000(TaoliveHighlightController.this)) ? 1 : 0));
                    hashMap.put("liveAdParams", Uri.encode(poy.Z(TaoliveHighlightController.access$000(TaoliveHighlightController.this))));
                    if (poy.q(TaoliveHighlightController.access$000(TaoliveHighlightController.this)) != null) {
                        i = 1;
                    }
                    hashMap.put("isAdTransParams", String.valueOf(i));
                    hashMap.put("isChatRoom", String.valueOf(poy.b(tBLiveDataModel, TaoliveHighlightController.access$000(TaoliveHighlightController.this)) ? 1 : 0));
                    hashMap.put("scene", !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.timeMovingPlayUrl) ? "smartpoint" : "default");
                    hashMap.put("kandianid", poy.ay(TaoliveHighlightController.access$000(TaoliveHighlightController.this)) + "_" + poy.C(TaoliveHighlightController.access$000(TaoliveHighlightController.this)));
                    hashMap.put("watchid", poy.z(TaoliveHighlightController.access$000(TaoliveHighlightController.this)));
                    if (TaoliveHighlightController.access$000(TaoliveHighlightController.this) instanceof com.taobao.taolive.sdk.core.e) {
                        hashMap.put(aw.PARAM_PVID, poy.M(TaoliveHighlightController.access$000(TaoliveHighlightController.this)));
                    }
                    return hashMap;
                }
            }));
        }
    }

    private void redirRoom(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1721cf5", new Object[]{this, tBLiveDataModel});
        } else if (cgl.a(this.mContext, tBLiveDataModel.mVideoInfo)) {
            if (pfb.a(this.mFrameContext).l() == null) {
                return;
            }
            pfb.a(this.mFrameContext).l().a(this.mFrameContext, null);
        } else {
            showByStatus(tBLiveDataModel);
            pqi.a().c("lockScroll", "redirRoom:lockScroll:false");
        }
    }

    private void showByStatus(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4349f686", new Object[]{this, tBLiveDataModel});
        } else if (this.mContext == null) {
        } else {
            poz.d(b.a(this.mContext, 78.0f), n.b(this.mFrameContext));
            if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
                return;
            }
            if (this.mEnterRequest) {
                this.mEnterRequest = false;
                poz.w(tBLiveDataModel.mVideoInfo.liveId, n.b(this.mFrameContext));
            }
            com.taobao.taolive.movehighlight.bean.a aVar = this.highlightPlayInfo;
            String str = (aVar == null || TextUtils.isEmpty(aVar.d)) ? null : this.highlightPlayInfo.d;
            if (c.s()) {
                if (TextUtils.isEmpty(str) && tBLiveDataModel.mVideoInfo.timeMovingPlayInfo != null && !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.keyPointId)) {
                    str = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.keyPointId;
                }
                if (TextUtils.isEmpty(this.mSjsdItemId) && tBLiveDataModel.mVideoInfo.timeMovingPlayInfo != null && !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.sjsdItemId)) {
                    this.mSjsdItemId = tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.sjsdItemId;
                }
            }
            String str2 = str;
            final pfb a2 = pfb.a(this.mFrameContext);
            a2.a(new pgf(this.mSjsdItemId, this.mContext, this.mVideoFrame));
            if (a2.l() != null) {
                a2.l().b(this.mFrameContext, tBLiveDataModel);
            }
            u.f21971a = false;
            com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_TIMESHIFT_STATUS);
            g b = n.b(this.mFrameContext);
            boolean z = b instanceof com.taobao.taolive.sdk.controller.e;
            if (z) {
                com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) b;
                if (TextUtils.isEmpty(eVar.q)) {
                    eVar.q = i.a(poz.p(n.b(this.mFrameContext)));
                }
            }
            com.taobao.alilive.aliliveframework.frame.a aVar2 = this.mFrameContext;
            if (aVar2 != null && (aVar2.H() instanceof ipx)) {
                ((ipx) this.mFrameContext.H()).c = 0;
            }
            if (this.highlightPlayInfo != null) {
                if (tBLiveDataModel.mVideoInfo.timeMovingPlayInfo != null) {
                    com.taobao.taolive.movehighlight.utils.f.a().b(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.isSpeaking);
                }
                l.a(this.mVideoFrame, this.mCoverImage, this.mContext, this.mFirstFrameRendered, this.mLandscapeVideo, this.mPerfomenceTrackManager, this.mTrackId, this.mToken, this.highlightPlayInfo, this.mFrameContext);
            }
            poy.j(!TextUtils.isEmpty(this.mSjsdItemId) ? this.mSjsdItemId : this.mTimeMovingItemId, this.mFrameContext);
            if (c.t()) {
                this.mSjsdItemId = !TextUtils.isEmpty(this.mSjsdItemId) ? this.mSjsdItemId : this.mTimeMovingItemId;
            }
            updateParams(tBLiveDataModel.mVideoInfo);
            if (a2.l() != null) {
                a2.l().c(this.mFrameContext, tBLiveDataModel);
            }
            VideoFrame2 videoFrame2 = this.mVideoFrame;
            if (videoFrame2 != null && !videoFrame2.isPlaying()) {
                this.mVideoFrame.enableRenderType();
            }
            VideoFrame2 videoFrame22 = this.mVideoFrame;
            if (videoFrame22 != null) {
                videoFrame22.setExtraConfig(this.mId, this.mUserId);
                this.mVideoFrame.setMediaSourceType(tBLiveDataModel.mVideoInfo.pushFeature);
                this.mVideoFrame.setOnVideoErrorClickListener(new VideoFrame.c() { // from class: com.taobao.taolive.movehighlight.controller.TaoliveHighlightController.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.c
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        String a3 = cgl.r().a();
                        if (TextUtils.isEmpty(a3)) {
                            return;
                        }
                        s.a(TaoliveHighlightController.this.mContext, a3);
                        if (a2.l() == null) {
                            return;
                        }
                        a2.l().a(TaoliveHighlightController.access$000(TaoliveHighlightController.this), null);
                    }
                });
            }
            initRoomScreenManager();
            this.mTaoliveShowByStatus.a(this.mFrameContext, tBLiveDataModel.mVideoInfo, this.mSjsdItemId, str2, this.mBasePreloadRequest, this.mFrameContext);
            if (tBLiveDataModel.mVideoInfo.timeMovingPlayInfo != null && !TextUtils.isEmpty(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.timeMovingId)) {
                poy.g(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.timeMovingId, this.mFrameContext);
                if (d.f21479a) {
                    poz.T(tBLiveDataModel.mVideoInfo.timeMovingPlayInfo.timeMovingId, n.b(this.mFrameContext));
                }
            } else {
                LiveItem a3 = l.a(tBLiveDataModel.mVideoInfo, this.mSjsdItemId);
                if (a3 != null) {
                    l.a(a3, this.mFrameContext);
                }
            }
            d.b = RecModel.MEDIA_TYPE_TIMEMOVE;
            if (a2.l() != null) {
                if (pfa.a(this.mFrameContext).b() != null) {
                    pfa.a(this.mFrameContext).b().a(z ? (com.taobao.taolive.sdk.controller.e) b : null, this.mContext, "Page_TaobaoLiveWatch");
                }
                a2.l().a(this.mFrameContext);
                a2.l().b(this.mFrameContext);
            }
            ViewGroup viewGroup = this.mRoomLayout;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
        }
    }

    private void initRoomScreenManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afa86dd", new Object[]{this});
            return;
        }
        if (this.mTaoliveShowByStatus == null) {
            this.mTaoliveShowByStatus = new pgs.a().a(isLandscape()).a(this.mContext).a(this.mHandler).b(this.mHideUI).a(this.mLiveDataModel).a(this).a(this.mPerfomenceTrackManager).a(this.mRoomLayout).a(this.mVideoFrame).a(this.mBackgroundImage).a();
            this.mTaoliveShowByStatus.a();
        }
        pgs pgsVar = this.mTaoliveShowByStatus;
        if (pgsVar == null) {
            return;
        }
        pgsVar.a(this.mHideUI);
        this.mLandscape = this.mLiveDataModel.mVideoInfo.landScape;
        this.mTaoliveShowByStatus.b(isLandscape());
        this.mTaoliveShowByStatus.a(this.mLiveDataModel);
    }

    private void updateParams(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b197f57", new Object[]{this, videoInfo});
        } else if (videoInfo == null) {
        } else {
            this.mId = videoInfo.liveId;
            if (videoInfo.broadCaster != null) {
                this.mUserId = videoInfo.broadCaster.accountId;
            }
            this.mLandscapeVideo = videoInfo.landScape;
            if (!poy.s(this.mFrameContext) || videoInfo.tbtvLiveDO == null) {
                return;
            }
            videoInfo.landScape = videoInfo.tbtvLiveDO.landScape;
            videoInfo.millionBaby = videoInfo.tbtvLiveDO.millionBaby;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onBindData(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c0dc6", new Object[]{this, tBLiveDataModel});
            return;
        }
        bindData(tBLiveDataModel);
        super.onBindData(tBLiveDataModel);
    }

    private void bindData(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0bc887", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null) {
        } else {
            String str = tBLiveDataModel.mInitParams.get(aw.PARAM_HIDE_UI);
            this.mHideUI = !TextUtils.isEmpty(str) && Boolean.parseBoolean(str);
            this.mSjsdItemId = tBLiveDataModel.mInitParams.get(aw.PARAM_SJSD_ITEM_ID);
            poz.V(this.mSjsdItemId, n.b(this.mFrameContext));
            this.mTimeMovingItemId = tBLiveDataModel.mInitParams.get(aw.PARAM_TIMEMOVING_ITEM_ID);
            String str2 = tBLiveDataModel.mInitParams.get("landScapeVideo");
            if (TextUtils.isEmpty(str2) || !Boolean.parseBoolean(str2)) {
                z = false;
            }
            this.mLandscapeVideo = z;
            this.mToken = tBLiveDataModel.mInitParams.get(aw.PARAM_PLAYER_TOKEN);
            this.mLiveSource = tBLiveDataModel.mInitParams.get("livesource");
            this.mMediaInfo = null;
            try {
                String str3 = tBLiveDataModel.mInitParams.get(aw.PARAM_CUSTOM_PLAY_CTRL);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                this.mMediaInfo = pqj.b(str3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        lmx lmxVar;
        pfd pfdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (c.E() && (pfdVar = this.eventLiveListener) != null) {
            pfdVar.a();
            this.eventLiveListener = null;
        }
        if (!u.aZ() || (lmxVar = this.alimamaQZTManager) == null) {
            return;
        }
        lmxVar.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        pgs pgsVar = this.mTaoliveShowByStatus;
        if (pgsVar != null) {
            pgsVar.a(this.mFrameContext);
        }
        pfd pfdVar = this.eventLiveListener;
        if (pfdVar != null) {
            pfdVar.a();
            this.eventLiveListener = null;
        }
        e eVar = this.mTBLiveInteractiveManager;
        if (eVar != null) {
            eVar.g();
            this.mTBLiveInteractiveManager = null;
        }
        if (c.n()) {
            pfb.a(this.mFrameContext).m();
        }
        d.d = false;
        tih tihVar = this.mPMController;
        if (tihVar == null) {
            return;
        }
        tihVar.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p().getBackwardX() != null) {
            com.taobao.android.live.plugin.proxy.f.p().getBackwardX().a(this.mLiveDataModel, n.b(this.mFrameContext));
        }
        super.onDidDisappear();
        d.d = false;
        if (this.mBasePreloadRequest != null) {
            this.mBasePreloadRequest = null;
        }
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 != null) {
            videoFrame2.setSkipResumePlay(false);
        }
        if (c.u() && (viewGroup = this.mRoomLayout) != null) {
            viewGroup.setVisibility(8);
        }
        tih tihVar = this.mPMController;
        if (tihVar == null) {
            return;
        }
        tihVar.a();
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        pgs pgsVar = this.mTaoliveShowByStatus;
        if (pgsVar != null && (pgsVar.b() instanceof FullScreenFrame)) {
            return ((FullScreenFrame) this.mTaoliveShowByStatus.b()).getUbeeContainer();
        }
        return null;
    }
}
