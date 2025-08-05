package com.taobao.taolive.room.controller2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.ui.view.CircularProgressBar;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.x;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.OfficialLiveEndMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveSwitchNextMessage;
import com.taobao.taolive.sdk.model.message.TBLiveSwitchMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.component.VideoFrame2;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import tb.cgl;
import tb.dds;
import tb.ddv;
import tb.ddw;
import tb.ded;
import tb.dee;
import tb.kge;
import tb.phq;
import tb.phw;
import tb.pih;
import tb.pii;
import tb.pip;
import tb.pkm;
import tb.pkn;
import tb.pko;
import tb.ply;
import tb.plz;
import tb.pmd;
import tb.pmt;
import tb.pnj;
import tb.pnn;
import tb.poy;
import tb.poz;
import tb.ppy;
import tb.pqi;
import tb.qne;
import tb.tki;
import tb.xkw;

/* loaded from: classes8.dex */
public class TaoLiveNormalRoomController extends BaseFrame implements com.taobao.taolive.sdk.model.a, d.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_DISPLAY_SHOP_LIVE_WRAP = 9;
    private static final int MSG_ENABLE_DRAWERCONSUMER_WRAP = 8;
    public static final int MSG_ENTER_ERROR = 1;
    private static final int MSG_HOLDER_PM = 3;
    private static final int MSG_INIT_LINK = 2;
    public static final int MSG_STAY_TIME = 0;
    private static final int MSG_TAOLIVE_DELAY = 4;
    private static final int MSG_TAOLIVE_ROOM_DRAW_DELAY = 11;
    public static final long STAY_CHECK_INTERVAL = 10000;
    private static final String TAG;
    public String frameContextUnique;
    private String mAutoShare;
    private AliUrlImageView mBackgroundImage;
    private CircularProgressBar mCircularProgressBar;
    private String mCoverImage;
    private String mDirectPlayUrl;
    private boolean mFirstFrameRendered;
    private com.taobao.taolive.sdk.model.f mHandler;
    private boolean mHasSwitch;
    private boolean mHideUI;
    private String mId;
    private boolean mInSwitchTaoLiveRoom;
    private boolean mLandscapeVideo;
    private long mLastStayTimeStamp;
    private String mLiveSource;
    private JSONObject mMediaInfo;
    private pkm mPerfomenceTrackManager;
    private long mRoomDidAppearTime;
    private ViewGroup mRoomLayout;
    private String mShareItemId;
    private String mSjsdItemId;
    private int mStayCheckCount;
    private View mSwitchTVProgramNewView;
    private View mSwitchTVProgramNo;
    private AliUrlImageView mSwitchTVProgramNormalView;
    private TextView mSwitchTVProgramTitle;
    private View mSwitchTVProgramTransitionView;
    private View mSwitchTVProgramYes;
    private com.taobao.tbliveinteractive.e mTBLiveInteractiveManager;
    private phw mTaoliveShowByStatus;
    private pip mTaskInteractiveManager;
    private String mTimeMovingItemId;
    private String mTimeShiftUrl;
    private String mToken;
    private String mTrackId;
    private String mUserId;
    private com.taobao.taolive.sdk.ui.component.c mVideoCallback;
    private VideoFrame2 mVideoFrame;
    private ddv renderFinish;
    private ValueAnimator valueAnimator;

    public static /* synthetic */ Object ipc$super(TaoLiveNormalRoomController taoLiveNormalRoomController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1801045031:
                super.onWillDisappear();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 690752966:
                super.onBindData((TBLiveDataModel) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveNormalRoomController";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    public static /* synthetic */ String access$100(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f454c6a", new Object[]{taoLiveNormalRoomController}) : taoLiveNormalRoomController.mTrackId;
    }

    public static /* synthetic */ View access$1000(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c499a50a", new Object[]{taoLiveNormalRoomController}) : taoLiveNormalRoomController.mSwitchTVProgramTransitionView;
    }

    public static /* synthetic */ View access$1002(TaoLiveNormalRoomController taoLiveNormalRoomController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("179a3c4e", new Object[]{taoLiveNormalRoomController, view});
        }
        taoLiveNormalRoomController.mSwitchTVProgramTransitionView = view;
        return view;
    }

    public static /* synthetic */ pkm access$200(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pkm) ipChange.ipc$dispatch("e20c6d7f", new Object[]{taoLiveNormalRoomController}) : taoLiveNormalRoomController.mPerfomenceTrackManager;
    }

    public static /* synthetic */ ddv access$300(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddv) ipChange.ipc$dispatch("e92fc21c", new Object[]{taoLiveNormalRoomController}) : taoLiveNormalRoomController.renderFinish;
    }

    public static /* synthetic */ void access$400(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ee5193", new Object[]{taoLiveNormalRoomController});
        } else {
            taoLiveNormalRoomController.liveBizRequestManagerStart();
        }
    }

    public static /* synthetic */ CircularProgressBar access$500(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CircularProgressBar) ipChange.ipc$dispatch("ba61b02b", new Object[]{taoLiveNormalRoomController}) : taoLiveNormalRoomController.mCircularProgressBar;
    }

    public static /* synthetic */ boolean access$600(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4583bb55", new Object[]{taoLiveNormalRoomController})).booleanValue() : taoLiveNormalRoomController.mHasSwitch;
    }

    public static /* synthetic */ boolean access$602(TaoLiveNormalRoomController taoLiveNormalRoomController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("314bc829", new Object[]{taoLiveNormalRoomController, new Boolean(z)})).booleanValue();
        }
        taoLiveNormalRoomController.mHasSwitch = z;
        return z;
    }

    public static /* synthetic */ void access$700(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ce7030", new Object[]{taoLiveNormalRoomController});
        } else {
            taoLiveNormalRoomController.hideSwitchTVProgramTransitionView();
        }
    }

    public static /* synthetic */ VideoFrame2 access$800(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame2) ipChange.ipc$dispatch("1c906da4", new Object[]{taoLiveNormalRoomController}) : taoLiveNormalRoomController.mVideoFrame;
    }

    public static /* synthetic */ ValueAnimator access$900(TaoLiveNormalRoomController taoLiveNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("266d0b52", new Object[]{taoLiveNormalRoomController}) : taoLiveNormalRoomController.valueAnimator;
    }

    static {
        kge.a(610362419);
        kge.a(-1905361424);
        kge.a(-2101054629);
        kge.a(191318335);
        TAG = TaoLiveNormalRoomController.class.getSimpleName();
    }

    public TaoLiveNormalRoomController(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, VideoFrame2 videoFrame2) {
        this(context, z, tBLiveDataModel, view, videoFrame2, new g());
    }

    public TaoLiveNormalRoomController(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, VideoFrame2 videoFrame2, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mToken = "";
        this.mFirstFrameRendered = false;
        this.frameContextUnique = null;
        if (this.mFrameContext != null) {
            this.frameContextUnique = this.mFrameContext.G();
        }
        this.mRoomLayout = (ViewGroup) view.findViewById(R.id.taolive_room_layout);
        this.mRoomLayout.removeAllViews();
        this.mBackgroundImage = (AliUrlImageView) view.findViewById(R.id.taolive_background_image);
        this.mVideoFrame = videoFrame2;
        this.mHandler = new com.taobao.taolive.sdk.model.f(this);
        bindData(this.mLiveDataModel);
    }

    public void setVideoCallback(com.taobao.taolive.sdk.ui.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ec6efd", new Object[]{this, cVar});
        } else {
            this.mVideoCallback = cVar;
        }
    }

    private void redirRoom(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1721cf5", new Object[]{this, tBLiveDataModel});
        } else if (cgl.a(this.mContext, tBLiveDataModel.mVideoInfo)) {
            ddw.a().a("com.taobao.taolive.room.killself", null, this.frameContextUnique);
        } else {
            long min = Math.min((poy.az(this.mFrameContext) - System.currentTimeMillis()) + 30, 500L);
            if (this.mHandler != null && min > 0 && aa.aj()) {
                this.mHandler.removeMessages(11);
                com.taobao.taolive.sdk.model.f fVar = this.mHandler;
                fVar.sendMessageDelayed(fVar.obtainMessage(11, tBLiveDataModel), min);
                pnj m = pmd.a().m();
                String str = TAG;
                m.c(str, "MSG_TAOLIVE_ROOM_DRAW_DELAY info = " + tBLiveDataModel + " delayedTime " + min);
            } else {
                showByStatus(tBLiveDataModel);
            }
            pqi.a().c("lockScroll", "redirRoom:lockScroll:false");
        }
    }

    private void showByStatus(TBLiveDataModel tBLiveDataModel) {
        com.taobao.taolive.sdk.model.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4349f686", new Object[]{this, tBLiveDataModel});
            return;
        }
        registerRenderFinishListener();
        poz.d(com.taobao.taolive.room.utils.d.a(this.mContext, 78.0f), com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        hideSwitchTVProgramTransitionView();
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            return;
        }
        setupGlobalData(tBLiveDataModel.mVideoInfo);
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, tBLiveDataModel);
        if (tBLiveDataModel != null) {
            poy.a(tBLiveDataModel, tBLiveDataModel.mVideoInfo, this.mFrameContext);
        }
        ddw.a().a("com.taobao.taolive.room.live_type", tBLiveDataModel, this.frameContextUnique);
        if (this.mFrameContext instanceof g) {
            ddw.a().a("com.taobao.taolive.room.live_type.updown_data", ((g) this.mFrameContext).w(), this.frameContextUnique);
        }
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
        u.f21971a = false;
        com.taobao.taolive.room.ui.fanslevel.a.a().e();
        if (tBLiveDataModel.mVideoInfo.visitorIdentity != null) {
            com.taobao.taolive.room.ui.fanslevel.a.a().b(tBLiveDataModel.mVideoInfo.visitorIdentity.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER));
        }
        if (tBLiveDataModel.mVideoInfo.broadCaster != null) {
            pmt pmtVar = new pmt();
            pmtVar.f32764a = tBLiveDataModel.mVideoInfo.broadCaster.accountId;
            pmd.a().B().a(pmtVar, tBLiveDataModel.mVideoInfo.broadCaster.follow);
        }
        if (tBLiveDataModel.mVideoInfo.tbtvLiveDO != null && tBLiveDataModel.mVideoInfo.tbtvLiveDO.accountDo != null) {
            pmt pmtVar2 = new pmt();
            pmtVar2.f32764a = tBLiveDataModel.mVideoInfo.tbtvLiveDO.accountDo.accountId;
            pmd.a().B().a(pmtVar2, tBLiveDataModel.mVideoInfo.tbtvLiveDO.accountDo.follow);
        }
        if (checkDegrade(tBLiveDataModel.mVideoInfo)) {
            return;
        }
        autoShare();
        updateParams(tBLiveDataModel.mVideoInfo);
        ddw.a().a("com.taobao.taolive.room.update_params", tBLiveDataModel, this.frameContextUnique);
        VideoFrame2 videoFrame2 = this.mVideoFrame;
        if (videoFrame2 != null && !videoFrame2.isPlaying()) {
            this.mVideoFrame.enableRenderType();
        }
        if (TextUtils.isEmpty(this.mDirectPlayUrl) && (fVar = this.mHandler) != null) {
            fVar.sendEmptyMessageDelayed(1, 10000L);
        }
        VideoFrame2 videoFrame22 = this.mVideoFrame;
        if (videoFrame22 != null) {
            videoFrame22.setExtraConfig(this.mId, this.mUserId);
            this.mVideoFrame.setMediaSourceType(tBLiveDataModel.mVideoInfo.pushFeature);
            this.mVideoFrame.setOnVideoErrorClickListener(new VideoFrame.c() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.ui.component.VideoFrame.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    String a2 = cgl.r().a();
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    com.taobao.taolive.room.utils.s.a(TaoLiveNormalRoomController.this.mContext, a2);
                    ddw.a().a("com.taobao.taolive.room.killself", null, TaoLiveNormalRoomController.this.frameContextUnique);
                }
            });
        }
        initRoomScreenManager();
        String str = tBLiveDataModel.mVideoInfo.roomStatus;
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 2;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.mTaoliveShowByStatus.a(tBLiveDataModel.mVideoInfo, this.mDirectPlayUrl, this.mToken, this.mTrackId);
            this.mHandler.sendEmptyMessageDelayed(2, 2000L);
            checkSwitch(tBLiveDataModel);
            pkm pkmVar = this.mPerfomenceTrackManager;
            if (pkmVar != null) {
                pkmVar.g("live");
            }
            setPlayReportFeedType("living");
        } else if (c == 1) {
            com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
            poy.j(this.mTimeMovingItemId, this.mFrameContext);
            this.mTaoliveShowByStatus.a(tBLiveDataModel.mVideoInfo, this.mTrackId, this.mSjsdItemId);
            checkSwitch(tBLiveDataModel);
            pkm pkmVar2 = this.mPerfomenceTrackManager;
            if (pkmVar2 != null) {
                pkmVar2.g(ag.CLICK_REPLAY);
            }
            if ((this.mFrameContext instanceof g) && ((g) this.mFrameContext).u() != null) {
                ((g) this.mFrameContext).u().f();
            }
            setPlayReportFeedType("playback");
        } else if (c == 2) {
            com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
            this.mTaoliveShowByStatus.a(tBLiveDataModel.mVideoInfo);
            pkm pkmVar3 = this.mPerfomenceTrackManager;
            if (pkmVar3 != null) {
                pkmVar3.g("preLive");
            }
            setPlayReportFeedType("preLive");
        } else {
            com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        }
        com.taobao.taolive.movehighlight.utils.d.b = "live";
        ddw.a().a("com.taobao.taolive.room.enter_ut_track", null, this.frameContextUnique);
        ddw.a().a("com.taobao.taolive.room.enter", null, this.frameContextUnique);
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    private void setupGlobalData(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d8dedc", new Object[]{this, videoInfo});
            return;
        }
        poz.Q(videoInfo.liveId, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        poy.c(videoInfo.liveId, this.mFrameContext);
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        poy.b(videoInfo.broadCaster.accountId, this.mFrameContext);
    }

    private void setPlayReportFeedType(String str) {
        pkn e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6292b4b3", new Object[]{this, str});
        } else if (!aa.bj() || this.mFrameContext == null || (e = pko.a().e(this.mFrameContext.j())) == null) {
        } else {
            e.j = str;
        }
    }

    private void registerRenderFinishListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348fc967", new Object[]{this});
        } else if (!ply.T()) {
        } else {
            final HashSet hashSet = new HashSet();
            this.renderFinish = new ddv() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ddv
                public String bizCode() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("36951559", new Object[]{this}) : "TaoLiveNormalRoomController";
                }

                @Override // tb.ddv
                public void onEvent(String str, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c3897928", new Object[]{this, str, obj});
                        return;
                    }
                    if (obj instanceof String) {
                        hashSet.add((String) obj);
                    }
                    if (hashSet.size() < 2) {
                        return;
                    }
                    ab.d(TaoLiveNormalRoomController.access$000(), "render finish");
                    TaoLiveNormalRoomController.access$200(TaoLiveNormalRoomController.this).k(TaoLiveNormalRoomController.access$100(TaoLiveNormalRoomController.this));
                    if (!TextUtils.equals(ag.SOURCE_UPDOWNSWITCH, poz.p(com.taobao.taolive.room.utils.n.b(TaoLiveNormalRoomController.this.mFrameContext)))) {
                        com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE");
                    }
                    ddw.a().b(TaoLiveNormalRoomController.access$300(TaoLiveNormalRoomController.this));
                    poz.n(false, com.taobao.taolive.room.utils.n.b(TaoLiveNormalRoomController.this.mFrameContext));
                    if (!(TaoLiveNormalRoomController.this.mFrameContext instanceof com.taobao.taolive.sdk.core.e)) {
                        return;
                    }
                    ((com.taobao.taolive.sdk.core.e) TaoLiveNormalRoomController.this.mFrameContext).y().aJ_().b().l(false);
                }

                @Override // tb.ddv
                public String[] observeEvents() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String[]) ipChange2.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_LIVE_UI_RENDER_FINISH};
                }

                @Override // tb.ddv
                public String observeUniqueIdentification() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("4914bdfe", new Object[]{this});
                    }
                    if (TaoLiveNormalRoomController.this.mFrameContext != null) {
                        return TaoLiveNormalRoomController.this.mFrameContext.G();
                    }
                    return null;
                }
            };
            ddw.a().a(this.renderFinish);
        }
    }

    private void initRoomScreenManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afa86dd", new Object[]{this});
            return;
        }
        if (y.a()) {
            if (y.h(this.mContext)) {
                this.mLandscape = true;
            } else {
                this.mLandscape = false;
            }
            this.mFrameContext.b = this.mLandscape;
        }
        if (this.mTaoliveShowByStatus == null) {
            this.mTaoliveShowByStatus = new phw.a().a(isLandscape()).a(this.mContext).a(this.mHandler).b(this.mHideUI).a(this.mLiveDataModel).a(this).a(this.mPerfomenceTrackManager).a(this.mRoomLayout).a(this.mVideoFrame).a(this.mBackgroundImage).a(this.mFrameContext).a();
            this.mTaoliveShowByStatus.a();
        }
        phw phwVar = this.mTaoliveShowByStatus;
        if (phwVar == null) {
            return;
        }
        com.taobao.taolive.sdk.ui.component.c cVar = this.mVideoCallback;
        if (cVar != null) {
            phwVar.a(cVar);
        }
        this.mTaoliveShowByStatus.b(this.mHideUI);
        if (!y.a()) {
            this.mLandscape = this.mLiveDataModel.mVideoInfo.landScape;
        }
        this.mTaoliveShowByStatus.a(isLandscape());
        this.mTaoliveShowByStatus.a(this.mLiveDataModel);
        com.taobao.tbliveinteractive.e eVar = this.mTBLiveInteractiveManager;
        if (eVar == null) {
            return;
        }
        this.mTaoliveShowByStatus.a(eVar);
    }

    private void checkSwitch(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92a0a1c", new Object[]{this, tBLiveDataModel});
            return;
        }
        if (tBLiveDataModel.mVideoInfo.closeLeftAndRightSlide) {
            ddw.a().a(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, null, this.frameContextUnique);
        } else {
            ddw.a().a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, null, this.frameContextUnique);
        }
        if (tBLiveDataModel.mVideoInfo.closeUpAndDownSlide) {
            ddw.a().a("com.taobao.taolive.room.disable_updown_switch", "checkSwitch", this.frameContextUnique);
        } else {
            ddw.a().a("com.taobao.taolive.room.enable_updown_switch", null, this.frameContextUnique);
        }
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

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        VideoInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 0) {
            ai.b(this.mFrameContext, "stay", "time=10");
            this.mHandler.sendEmptyMessageDelayed(0, 10000L);
            this.mLastStayTimeStamp = System.currentTimeMillis();
            this.mStayCheckCount++;
            if (this.mStayCheckCount % 6 != 0) {
                return;
            }
            this.mStayCheckCount = 0;
            VideoInfo u = poy.u(this.mFrameContext);
            if (u != null && u.broadCaster != null && "1".equals(u.roomStatus)) {
                ai.a(this.mFrameContext, ag.CALC_STAY_TIME, "duration=60");
                phw phwVar = this.mTaoliveShowByStatus;
                if (phwVar != null) {
                    phwVar.g = System.currentTimeMillis();
                }
            }
            com.taobao.taolive.sdk.utils.r.a(this.mFrameContext);
        } else if (i != 1) {
            if (i == 2) {
                ddw.a().a(FullScreenFrame.EVENT_LINKLIVE_INIT, null, this.frameContextUnique);
            } else if (i != 3) {
                if (i != 4 || !(message.obj instanceof TBLiveSwitchMsg)) {
                    return;
                }
                TBLiveSwitchMsg tBLiveSwitchMsg = (TBLiveSwitchMsg) message.obj;
                realSwitchTaoLiveRoom(tBLiveSwitchMsg.targetUrl, tBLiveSwitchMsg.targetLiveTitle, tBLiveSwitchMsg.targetLiveId.equals(this.mId));
            } else {
                com.taobao.taolive.sdk.core.j.a(this.mFrameContext, false);
            }
        } else if (this.mFirstFrameRendered || (a2 = com.taobao.taolive.sdk.controller.k.a(this.mLiveDataModel)) == null || a2.broadCaster == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("feedId", a2.liveId);
            hashMap.put("feed_id", a2.liveId);
            hashMap.put("account_id", a2.broadCaster.accountId);
            hashMap.put(ag.KEY_LIVE_STATUS, a2.status + "");
            ai.a(this.mFrameContext, ag.CALC_ENTER_ERROR, (Map<String, String>) hashMap);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        TBLiveRecEngineV2.RecModel w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        final TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || i != 1) {
            return;
        }
        initFrameInstaller();
        String p = poz.p(com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        if (u.aD() && !TextUtils.equals(ag.SOURCE_UPDOWNSWITCH, p)) {
            com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T2);
            ab.d("LIVE_CODE_BOOT_STAGE", "stage:t2");
        }
        pqi.a().c(TAG, "STATUS_INIT_SUCCESS");
        if (tBLiveDataModel.mInitParams != null) {
            poz.e(tBLiveDataModel.mInitParams.get(aw.PARAM_TRACK_LIVEOPRT_ID), com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        }
        if ((this.mFrameContext instanceof g) && (w = ((g) this.mFrameContext).w()) != null && w.initParams != null) {
            String str = w.initParams.get("spm");
            poy.k(w.initParams.get("content"), this.mFrameContext);
            if (!aa.bu() || !poy.af(this.mFrameContext)) {
                poz.a(str, com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            }
            poz.b(w.initParams.get("trackInfo"), com.taobao.taolive.room.utils.n.b(this.mFrameContext));
        }
        if (u.aW() && this.mFrameContext != null) {
            this.mFrameContext.a((dds) new com.taobao.taolive.room.business.mess.e());
        }
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.i(this.mTrackId);
        }
        pmd.a().m().b("vanda", "STATUS_INIT_SUCCESS info = " + obj);
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, new pnn() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:60:0x01ef, code lost:
                if (r1 != null) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x01f2, code lost:
                r1 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x01f4, code lost:
                if (r1 != null) goto L60;
             */
            @Override // tb.pnn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.String> getHeartParams() {
                /*
                    Method dump skipped, instructions count: 767
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.AnonymousClass6.getHeartParams():java.util.Map");
            }
        });
        ddw.a().a(this);
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this, new MessageTypeFilter() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i2)})).booleanValue() : i2 == 1058 || i2 == 1039 || i2 == 888000111 || i2 == 888000113;
            }
        });
        if (tBLiveDataModel.mVideoInfo.status == 4 || tBLiveDataModel.mVideoInfo.status == 0 || tBLiveDataModel.mVideoInfo.status == 3 || tBLiveDataModel.mVideoInfo.status == 1) {
            if (aa.D()) {
                boolean z = com.taobao.taolive.room.utils.k.a() == 2;
                com.taobao.taolive.sdk.core.j.a(this.mFrameContext, z);
                com.taobao.taolive.sdk.model.f fVar = this.mHandler;
                if (fVar != null && z) {
                    fVar.sendEmptyMessageDelayed(3, 3000L);
                }
            }
            if (this.mFrameContext != null) {
                com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this.mFrameContext.j(), tBLiveDataModel);
            }
        }
        String str2 = "livedetail end:" + System.currentTimeMillis();
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.mLiveDataModel.mVideoInfo.broadCaster != null) {
            hashMap.put("account_id", this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
        }
        if ((this.mContext instanceof Activity) && ((Activity) this.mContext).getIntent() != null) {
            hashMap.put("liveUrl", ((Activity) this.mContext).getIntent().getDataString());
        }
        hashMap.put("livesource", poz.p(com.taobao.taolive.room.utils.n.b(this.mFrameContext)));
        hashMap.put("live_id", this.mLiveDataModel.mVideoInfo.liveId);
        hashMap.put("roomType", String.valueOf(this.mLiveDataModel.mVideoInfo.roomType));
        hashMap.put("newRoomType", String.valueOf(this.mLiveDataModel.mVideoInfo.newRoomType));
        hashMap.put("isLandScape", String.valueOf(poy.e(this.mFrameContext)));
        if (this.mTBLiveInteractiveManager == null) {
            this.mTBLiveInteractiveManager = new com.taobao.tbliveinteractive.e(this.mContext, this.mFrameContext, this.mRoomDidAppearTime);
        }
        com.taobao.taolive.room.utils.m.b(this.mFrameContext);
        this.mTBLiveInteractiveManager.a(this.mLiveDataModel.mVideoInfo, poy.R(this.mFrameContext), this.mLiveSource, hashMap);
        this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.b(this.mFrameContext));
        this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.f(this.mFrameContext));
        this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.c(this.mFrameContext, this));
        this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.d());
        this.mTBLiveInteractiveManager.c().a(new com.taobao.taolive.room.mediaplatform.e(this.mTrackId, this.mContext, this.mFrameContext, this.mPerfomenceTrackManager));
        ((phq) this.mFrameContext).a(this.mTBLiveInteractiveManager);
        if (tBLiveDataModel instanceof TBLiveBizDataModel) {
            ((TBLiveBizDataModel) tBLiveDataModel).liveInteractiveManager = this.mTBLiveInteractiveManager;
        }
        phw phwVar = this.mTaoliveShowByStatus;
        if (phwVar != null) {
            phwVar.a(this.mTBLiveInteractiveManager);
        }
        this.mTaskInteractiveManager = new pip(this.mTBLiveInteractiveManager, this.mLiveDataModel.mVideoInfo, false, this.mFrameContext);
        if (((g) this.mFrameContext).w() != null) {
            if (aa.bN()) {
                tBLiveDataModel.mVideoInfo.isAD = ((g) this.mFrameContext).w().adEurlParams != null;
            }
            this.mTaskInteractiveManager.a(((g) this.mFrameContext).w().adEurlParams);
        }
        this.mTBLiveInteractiveManager.b();
        this.mTBLiveInteractiveManager.e();
        if (this.mFrameContext != null && this.mLiveDataModel.mVideoInfo.broadCaster != null && (u.G() || u.H())) {
            com.taobao.android.live.plugin.proxy.f.f().atmosphereInstanceGetAtmosphereRes(this.mFrameContext, this.mLiveDataModel.mVideoInfo.liveId, this.mLiveDataModel.mVideoInfo.broadCaster.accountId, this.mLiveDataModel.mVideoInfo.broadCaster.encodeAccountId);
        }
        startLiveBizRequest();
        showGoodListsIfNeed();
        redirRoom(this.mLiveDataModel);
        pkm pkmVar2 = this.mPerfomenceTrackManager;
        if (pkmVar2 != null) {
            pkmVar2.j(this.mTrackId);
        }
        ai.d(this.mFrameContext, "", "timeMovingItemId=" + this.mTimeMovingItemId, "sjsdItemId=" + this.mSjsdItemId);
    }

    private void startLiveBizRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a55c4491", new Object[]{this});
        } else if (tki.a()) {
        } else {
            startLiveBizRequestOld();
        }
    }

    private void startLiveBizRequestOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75342ac4", new Object[]{this});
        } else if (this.mLiveDataModel.mVideoInfo.broadCaster == null) {
        } else {
            if (com.taobao.android.live.plugin.proxy.c.a().d()) {
                liveBizRequestManagerStart();
            } else {
                com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            TaoLiveNormalRoomController.access$400(TaoLiveNormalRoomController.this);
                        }
                    }
                });
            }
        }
    }

    private void liveBizRequestManagerStart() {
        IUniversalProxy.b liveBizRequestManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce34f6e4", new Object[]{this});
        } else if (com.taobao.android.live.plugin.proxy.f.o() == null || (liveBizRequestManager = com.taobao.android.live.plugin.proxy.f.o().getLiveBizRequestManager()) == null) {
        } else {
            liveBizRequestManager.a(this.mLiveDataModel.mVideoInfo.liveId, this.mLiveDataModel.mVideoInfo.broadCaster.accountId, this.mLiveDataModel.mVideoInfo.broadCaster.encodeAccountId);
        }
    }

    private void initFrameInstaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365bb4d2", new Object[]{this});
            return;
        }
        dee deeVar = new dee(this.mContext, com.taobao.taolive.room.utils.m.b(), false);
        deeVar.a();
        deeVar.b(new pih(this.mContext, this.mLiveDataModel, this.mFrameContext));
        deeVar.a(new pii(this.mContext, this.mFrameContext));
        this.mFrameContext.a((ded) deeVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
        } else if (this.mLiveDataModel == null || plz.a(this.mLiveDataModel.mVideoInfo)) {
        } else {
            super.onWillDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
        } else {
            super.onWillAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        this.mRoomDidAppearTime = System.currentTimeMillis();
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            this.mTrackId = pkmVar.b();
        }
        super.onDidAppear();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mFrameContext.k() != null) {
            this.mFrameContext.k().b();
        }
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.taolive.sdk.utils.r.a(this.mFrameContext);
        if (this.mFrameContext instanceof g) {
            ((g) this.mFrameContext).E = true;
        }
        pip pipVar = this.mTaskInteractiveManager;
        if (pipVar == null) {
            return;
        }
        pipVar.g();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, tb.deh
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        com.taobao.taolive.sdk.utils.r.a(this.mFrameContext);
        if (this.mFrameContext instanceof g) {
            ((g) this.mFrameContext).E = false;
        }
        pip pipVar = this.mTaskInteractiveManager;
        if (pipVar == null) {
            return;
        }
        pipVar.c();
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.tbliveinteractive.e eVar = this.mTBLiveInteractiveManager;
        if (eVar != null) {
            eVar.g();
            this.mTBLiveInteractiveManager = null;
        }
        pip pipVar = this.mTaskInteractiveManager;
        if (pipVar != null) {
            pipVar.a();
            this.mTaskInteractiveManager = null;
        }
        qne.a();
        ddw.a().b(this);
        com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this);
        com.taobao.taolive.sdk.model.f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        phw phwVar = this.mTaoliveShowByStatus;
        if (phwVar != null) {
            phwVar.b();
        }
        com.taobao.taolive.sdk.utils.r.a(this.mFrameContext);
        com.taobao.taolive.sdk.model.f fVar2 = this.mHandler;
        if (fVar2 != null) {
            fVar2.removeMessages(3);
            this.mHandler.removeMessages(0);
            this.mHandler.removeMessages(4);
        }
        ddw.a().b(this.renderFinish);
        com.taobao.android.live.plugin.proxy.f.f().atmosphereInstanceDestroy(this.mFrameContext);
    }

    private void bindData(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0bc887", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null) {
        } else {
            this.mAutoShare = tBLiveDataModel.mInitParams.get(aw.PARAM_AUTO_SHARE);
            this.mShareItemId = tBLiveDataModel.mInitParams.get(aw.PARAM_SHAQRE_ITEM_ID);
            String str = tBLiveDataModel.mInitParams.get(aw.PARAM_HIDE_UI);
            this.mHideUI = !TextUtils.isEmpty(str) && Boolean.parseBoolean(str);
            this.mSjsdItemId = tBLiveDataModel.mInitParams.get(aw.PARAM_SJSD_ITEM_ID);
            this.mTimeMovingItemId = tBLiveDataModel.mInitParams.get(aw.PARAM_TIMEMOVING_ITEM_ID);
            String str2 = tBLiveDataModel.mInitParams.get("landScapeVideo");
            if (TextUtils.isEmpty(str2) || !Boolean.parseBoolean(str2)) {
                z = false;
            }
            this.mLandscapeVideo = z;
            this.mToken = tBLiveDataModel.mInitParams.get(aw.PARAM_PLAYER_TOKEN);
            this.mLiveSource = tBLiveDataModel.mInitParams.get("livesource");
            if (tBLiveDataModel instanceof TBLiveBizDataModel) {
                this.mPerfomenceTrackManager = ((TBLiveBizDataModel) tBLiveDataModel).perfomenceTrackManager;
            }
            this.mDirectPlayUrl = null;
            this.mMediaInfo = null;
            try {
                String str3 = tBLiveDataModel.mInitParams.get(aw.PARAM_CUSTOM_PLAY_CTRL);
                if (!TextUtils.isEmpty(str3)) {
                    this.mMediaInfo = com.taobao.taolive.room.utils.q.a(str3);
                }
                this.mDirectPlayUrl = x.a(this.mMediaInfo);
            } catch (Exception unused) {
            }
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

    private void showGoodListsIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4215ef15", new Object[]{this});
        } else if (!aa.ab() || TextUtils.isEmpty(this.mShareItemId) || !aa.ac()) {
        } else {
            ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, null, this.frameContextUnique);
        }
    }

    private void realSwitchTaoLiveRoom(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9ec222", new Object[]{this, str, str2, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            showSwitchTVProgramTransitionView(str, str2, z);
        }
    }

    private void showSwitchTVProgramTransitionView(final String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97bdd84e", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (this.mSwitchTVProgramTransitionView == null) {
            this.mSwitchTVProgramTransitionView = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_switch_tv_program_layout, (ViewGroup) null);
            this.mSwitchTVProgramTransitionView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            initViews();
        }
        if (z) {
            this.mSwitchTVProgramNormalView.setVisibility(0);
            this.mSwitchTVProgramNewView.setVisibility(8);
            VideoFrame2 videoFrame2 = this.mVideoFrame;
            if (videoFrame2 != null) {
                videoFrame2.reset();
            }
            com.taobao.taolive.room.utils.s.a(this.mContext, str);
        } else {
            this.mSwitchTVProgramNormalView.setVisibility(8);
            this.mSwitchTVProgramNewView.setVisibility(0);
            if (!TextUtils.isEmpty(str2)) {
                this.mSwitchTVProgramTitle.setVisibility(0);
                this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_room_switch_tv_program_secant_line).setVisibility(0);
                TextView textView = this.mSwitchTVProgramTitle;
                textView.setText("《" + str2 + "》");
            } else {
                this.mSwitchTVProgramTitle.setVisibility(8);
                this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_room_switch_tv_program_secant_line).setVisibility(8);
            }
            this.mCircularProgressBar.setProgress(0.0f);
            this.valueAnimator = ValueAnimator.ofInt(0, 100);
            this.valueAnimator.setDuration(aa.x() * 1000);
            this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (!(animatedValue instanceof Integer)) {
                        return;
                    }
                    TaoLiveNormalRoomController.access$500(TaoLiveNormalRoomController.this).setProgress(((Integer) animatedValue).intValue());
                }
            });
            this.valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (TaoLiveNormalRoomController.access$600(TaoLiveNormalRoomController.this)) {
                    } else {
                        TaoLiveNormalRoomController.access$602(TaoLiveNormalRoomController.this, true);
                        TaoLiveNormalRoomController.access$700(TaoLiveNormalRoomController.this);
                        if (TaoLiveNormalRoomController.access$800(TaoLiveNormalRoomController.this) != null) {
                            TaoLiveNormalRoomController.access$800(TaoLiveNormalRoomController.this).reset();
                        }
                        com.taobao.taolive.room.utils.s.a(TaoLiveNormalRoomController.this.mContext, str);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else if (TaoLiveNormalRoomController.access$600(TaoLiveNormalRoomController.this)) {
                    } else {
                        TaoLiveNormalRoomController.access$602(TaoLiveNormalRoomController.this, true);
                        TaoLiveNormalRoomController.access$700(TaoLiveNormalRoomController.this);
                        if (TaoLiveNormalRoomController.access$800(TaoLiveNormalRoomController.this) != null) {
                            TaoLiveNormalRoomController.access$800(TaoLiveNormalRoomController.this).reset();
                        }
                        com.taobao.taolive.room.utils.s.a(TaoLiveNormalRoomController.this.mContext, str);
                    }
                }
            });
            this.mHasSwitch = false;
            this.valueAnimator.start();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mSwitchTVProgramTransitionView, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.start();
        if (this.mSwitchTVProgramTransitionView.getParent() != null) {
            return;
        }
        ((ViewGroup) ((Activity) this.mContext).findViewById(R.id.taolive_root_view)).addView(this.mSwitchTVProgramTransitionView);
    }

    private void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.mSwitchTVProgramNormalView = (AliUrlImageView) this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_switch_tv_program_normal);
        this.mSwitchTVProgramNewView = this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_switch_tv_program_new_layer);
        this.mCircularProgressBar = (CircularProgressBar) this.mSwitchTVProgramTransitionView.findViewById(R.id.circularProgressbar);
        this.mSwitchTVProgramNo = this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_tv_switch_program_no);
        this.mSwitchTVProgramYes = this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_tv_switch_program_yes);
        this.mSwitchTVProgramTitle = (TextView) this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_room_switch_tv_program_title);
        this.mSwitchTVProgramNo.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String replace;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TaoLiveNormalRoomController.access$602(TaoLiveNormalRoomController.this, true);
                if (TaoLiveNormalRoomController.access$900(TaoLiveNormalRoomController.this) != null) {
                    TaoLiveNormalRoomController.access$900(TaoLiveNormalRoomController.this).cancel();
                }
                TaoLiveNormalRoomController.access$700(TaoLiveNormalRoomController.this);
                if (TaoLiveNormalRoomController.this.mLiveDataModel == null || TextUtils.isEmpty(TaoLiveNormalRoomController.this.mLiveDataModel.mActionUrl)) {
                    return;
                }
                String str = TaoLiveNormalRoomController.this.mLiveDataModel.mActionUrl;
                if (!str.contains(aw.PARAM_FORCE_REFRESH)) {
                    replace = str + "&forceRefresh=true";
                } else {
                    replace = str.replace("forceRefresh=false", "forceRefresh=true");
                }
                com.taobao.taolive.room.utils.s.a(TaoLiveNormalRoomController.this.mContext, replace);
            }
        });
        this.mSwitchTVProgramYes.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TaoLiveNormalRoomController.access$900(TaoLiveNormalRoomController.this) == null) {
                } else {
                    TaoLiveNormalRoomController.access$900(TaoLiveNormalRoomController.this).cancel();
                }
            }
        });
        this.mSwitchTVProgramNormalView.setImageUrl(OpenNormalRoomController.ICON_URL);
    }

    private void hideSwitchTVProgramTransitionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f1598d", new Object[]{this});
            return;
        }
        if (this.mSwitchTVProgramTransitionView == null) {
            this.mSwitchTVProgramTransitionView = ((Activity) this.mContext).findViewById(R.id.taolive_switch_tv_layout);
        }
        if (this.mSwitchTVProgramTransitionView == null) {
            return;
        }
        initViews();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mSwitchTVProgramTransitionView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(1000L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (TaoLiveNormalRoomController.access$1000(TaoLiveNormalRoomController.this) == null || TaoLiveNormalRoomController.access$1000(TaoLiveNormalRoomController.this).getParent() == null) {
                } else {
                    ((ViewGroup) ((Activity) TaoLiveNormalRoomController.this.mContext).findViewById(R.id.taolive_root_view)).removeView(TaoLiveNormalRoomController.access$1000(TaoLiveNormalRoomController.this));
                    TaoLiveNormalRoomController.access$1002(TaoLiveNormalRoomController.this, null);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else if (TaoLiveNormalRoomController.access$1000(TaoLiveNormalRoomController.this) == null || TaoLiveNormalRoomController.access$1000(TaoLiveNormalRoomController.this).getParent() == null) {
                } else {
                    ((ViewGroup) ((Activity) TaoLiveNormalRoomController.this.mContext).findViewById(R.id.taolive_root_view)).removeView(TaoLiveNormalRoomController.access$1000(TaoLiveNormalRoomController.this));
                    TaoLiveNormalRoomController.access$1002(TaoLiveNormalRoomController.this, null);
                }
            }
        });
        ofFloat.start();
    }

    private void switchTaoLiveRoom(TBLiveSwitchMsg tBLiveSwitchMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae91858f", new Object[]{this, tBLiveSwitchMsg});
            return;
        }
        VideoInfo a2 = com.taobao.taolive.sdk.controller.k.a(this.mLiveDataModel);
        if (a2 == null || tBLiveSwitchMsg == null || TextUtils.isEmpty(tBLiveSwitchMsg.targetLiveId) || (tBLiveSwitchMsg.newRoomType & 256) != 256 || TextUtils.isEmpty(tBLiveSwitchMsg.targetUrl) || this.mInSwitchTaoLiveRoom || this.mIsPaused || j.c()) {
            return;
        }
        if ((!tBLiveSwitchMsg.targetLiveId.equals(this.mId) || poy.b(a2, this.mFrameContext)) && (tBLiveSwitchMsg.targetLiveId.equals(this.mId) || !poy.b(a2, this.mFrameContext))) {
            return;
        }
        this.mInSwitchTaoLiveRoom = true;
        if (tBLiveSwitchMsg.delay == 0) {
            realSwitchTaoLiveRoom(tBLiveSwitchMsg.targetUrl, tBLiveSwitchMsg.targetLiveTitle, tBLiveSwitchMsg.targetLiveId.equals(this.mId));
        } else if (this.mHandler == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = tBLiveSwitchMsg;
            this.mHandler.sendMessageDelayed(obtain, com.taobao.taolive.room.utils.j.a((int) tBLiveSwitchMsg.delay));
        }
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        phw phwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1039) {
            ai.a(this.mFrameContext, ag.SHOW_PROGRAM, (HashMap<String, String>) null);
            if (!(obj instanceof TBTVProgramMessage)) {
                return;
            }
            TBTVProgramMessage tBTVProgramMessage = (TBTVProgramMessage) obj;
            if (tBTVProgramMessage.liveDO == null || TextUtils.isEmpty(tBTVProgramMessage.liveDO.backgroundImageURL) || (phwVar = this.mTaoliveShowByStatus) == null) {
                return;
            }
            phwVar.a(tBTVProgramMessage.liveDO.backgroundImageURL);
        } else if (i == 1058) {
            if (!(obj instanceof TBLiveSwitchMsg)) {
                return;
            }
            switchTaoLiveRoom((TBLiveSwitchMsg) obj);
        } else if (i == 888000111) {
            if (!(obj instanceof OfficialLiveSwitchNextMessage)) {
                return;
            }
            switchOfficialLiveRoom((OfficialLiveSwitchNextMessage) obj);
        } else if (i != 888000113 || !(obj instanceof OfficialLiveEndMessage)) {
        } else {
            endOfficialLive((OfficialLiveEndMessage) obj);
        }
    }

    private void endOfficialLive(final OfficialLiveEndMessage officialLiveEndMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dae4c8e", new Object[]{this, officialLiveEndMessage});
            return;
        }
        VideoInfo a2 = com.taobao.taolive.sdk.controller.k.a(this.mLiveDataModel);
        if (a2 == null || !a2.isOfficialType() || officialLiveEndMessage == null || TextUtils.isEmpty(officialLiveEndMessage.officialLiveId) || !officialLiveEndMessage.officialLiveId.equals(a2.officialLiveInfo.officialLiveId)) {
            return;
        }
        Toast makeText = Toast.makeText(this.mContext, com.taobao.taolive.sdk.utils.p.g(), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        com.taobao.taolive.sdk.model.f fVar = this.mHandler;
        if (fVar == null) {
            return;
        }
        fVar.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Context context = TaoLiveNormalRoomController.this.mContext;
                com.taobao.taolive.room.utils.s.a(context, plz.a(officialLiveEndMessage.officialLiveId) + "&livesource=guanfangtai&forceRefresh=true");
            }
        }, com.taobao.taolive.sdk.utils.p.i());
    }

    private void switchOfficialLiveRoom(final OfficialLiveSwitchNextMessage officialLiveSwitchNextMessage) {
        String e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f4f12a", new Object[]{this, officialLiveSwitchNextMessage});
            return;
        }
        VideoInfo a2 = com.taobao.taolive.sdk.controller.k.a(this.mLiveDataModel);
        if (a2 == null || !a2.isOfficialType() || officialLiveSwitchNextMessage == null || TextUtils.isEmpty(officialLiveSwitchNextMessage.targetLiveId) || TextUtils.isEmpty(officialLiveSwitchNextMessage.targetLiveDetailUrl) || officialLiveSwitchNextMessage.targetLiveId.equals(a2.liveId) || !officialLiveSwitchNextMessage.officialLiveId.equals(a2.officialLiveInfo.officialLiveId) || this.mInSwitchTaoLiveRoom || this.mIsPaused) {
            return;
        }
        if ("true".equals(officialLiveSwitchNextMessage.gapPeriod)) {
            e = String.format(com.taobao.taolive.sdk.utils.p.f(), TextUtils.isEmpty(officialLiveSwitchNextMessage.nextPlanStartTime) ? "" : officialLiveSwitchNextMessage.nextPlanStartTime);
        } else {
            e = com.taobao.taolive.sdk.utils.p.e();
        }
        Toast makeText = Toast.makeText(this.mContext, e, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        com.taobao.taolive.sdk.model.f fVar = this.mHandler;
        if (fVar == null) {
            return;
        }
        fVar.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.controller2.TaoLiveNormalRoomController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.taobao.taolive.room.utils.s.a(TaoLiveNormalRoomController.this.mContext, officialLiveSwitchNextMessage.targetLiveDetailUrl);
                }
            }
        }, com.taobao.taolive.sdk.utils.p.h());
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.mediaplatform_switch_to_landscape".equals(str)) {
            phw phwVar = this.mTaoliveShowByStatus;
            if (phwVar == null) {
                return;
            }
            phwVar.d();
        } else if ("com.taobao.taolive.room.mediaplatform_switch_to_portrait".equals(str)) {
            phw phwVar2 = this.mTaoliveShowByStatus;
            if (phwVar2 == null) {
                return;
            }
            phwVar2.c();
        } else if (!"com.taobao.taolive.room.switch.official.live".equals(str) || !(obj instanceof OfficialLiveSwitchNextMessage)) {
        } else {
            switchOfficialLiveRoom((OfficialLiveSwitchNextMessage) obj);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.mediaplatform_switch_to_landscape", "com.taobao.taolive.room.mediaplatform_switch_to_portrait", "com.taobao.taolive.room.switch.official.live"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    private void autoShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606303f7", new Object[]{this});
        } else if (!"true".equals(this.mAutoShare)) {
        } else {
            com.taobao.taolive.room.utils.c.a((Activity) this.mContext, false);
            this.mAutoShare = "";
        }
    }

    private boolean checkDegrade(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2219bedc", new Object[]{this, videoInfo})).booleanValue();
        }
        if (videoInfo == null || videoInfo.degradeInfo == null || !videoInfo.degradeInfo.cdnDegrade) {
            return false;
        }
        String str = videoInfo.degradeInfo.degradeUrl;
        if (TextUtils.isEmpty(str)) {
            str = aa.P();
        }
        com.taobao.taolive.room.utils.s.a(this.mContext, str);
        ddw.a().a("com.taobao.taolive.room.killself", null, this.frameContextUnique);
        return true;
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        phw phwVar = this.mTaoliveShowByStatus;
        if (phwVar != null && (phwVar.e() instanceof ppy)) {
            return ((ppy) this.mTaoliveShowByStatus.e()).getUbeeContainer();
        }
        return null;
    }
}
