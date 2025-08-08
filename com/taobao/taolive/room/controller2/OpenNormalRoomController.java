package com.taobao.taolive.room.controller2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.ui.view.CircularProgressBar;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.at;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.x;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.OfficialLiveEndMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveSwitchNextMessage;
import com.taobao.taolive.sdk.model.message.TBLivePVMsg;
import com.taobao.taolive.sdk.model.message.TBLiveSwitchMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.componentlist.b;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
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
import tb.phv;
import tb.pih;
import tb.pii;
import tb.pip;
import tb.pkg;
import tb.pkm;
import tb.pkn;
import tb.pko;
import tb.pkr;
import tb.ply;
import tb.plz;
import tb.pmd;
import tb.pnj;
import tb.pnn;
import tb.poy;
import tb.poz;
import tb.ppy;
import tb.pqi;
import tb.pqj;
import tb.qne;
import tb.ssr;
import tb.tki;
import tb.xkw;

/* loaded from: classes8.dex */
public class OpenNormalRoomController extends BaseFrame implements com.taobao.taolive.sdk.model.a, d.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ICON_URL = "https://gw.alicdn.com/imgextra/i3/O1CN0188r4nU29Sjz3MK7ox_!!6000000008067-2-tps-429-207.png";
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
    public long curWatchNum;
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
    private phv mTaoliveShowByStatus;
    private pip mTaskInteractiveManager;
    private String mTimeMovingItemId;
    private String mTimeShiftUrl;
    private String mToken;
    private String mTrackId;
    private String mUserId;
    private com.taobao.taolive.sdk.ui.component.c mVideoCallback;
    private pkr mVideoFrame;
    private ddv renderFinish;
    private ValueAnimator valueAnimator;

    public static /* synthetic */ Object ipc$super(OpenNormalRoomController openNormalRoomController, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "OpenNormalRoomController";
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

    public static /* synthetic */ String access$100(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76ba767a", new Object[]{openNormalRoomController}) : openNormalRoomController.mTrackId;
    }

    public static /* synthetic */ View access$1000(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8880f796", new Object[]{openNormalRoomController}) : openNormalRoomController.mSwitchTVProgramTransitionView;
    }

    public static /* synthetic */ View access$1002(OpenNormalRoomController openNormalRoomController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("39f80a7e", new Object[]{openNormalRoomController, view});
        }
        openNormalRoomController.mSwitchTVProgramTransitionView = view;
        return view;
    }

    public static /* synthetic */ pkm access$200(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pkm) ipChange.ipc$dispatch("4ea36ad", new Object[]{openNormalRoomController}) : openNormalRoomController.mPerfomenceTrackManager;
    }

    public static /* synthetic */ ddv access$300(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddv) ipChange.ipc$dispatch("46fbd668", new Object[]{openNormalRoomController}) : openNormalRoomController.renderFinish;
    }

    public static /* synthetic */ void access$400(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbe1569", new Object[]{openNormalRoomController});
        } else {
            openNormalRoomController.liveBizRequestManagerStart();
        }
    }

    public static /* synthetic */ CircularProgressBar access$500(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CircularProgressBar) ipChange.ipc$dispatch("a34882a3", new Object[]{openNormalRoomController}) : openNormalRoomController.mCircularProgressBar;
    }

    public static /* synthetic */ boolean access$600(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf61346f", new Object[]{openNormalRoomController})).booleanValue() : openNormalRoomController.mHasSwitch;
    }

    public static /* synthetic */ boolean access$602(OpenNormalRoomController openNormalRoomController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55a2048b", new Object[]{openNormalRoomController, new Boolean(z)})).booleanValue();
        }
        openNormalRoomController.mHasSwitch = z;
        return z;
    }

    public static /* synthetic */ void access$700(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b2c3ec", new Object[]{openNormalRoomController});
        } else {
            openNormalRoomController.hideSwitchTVProgramTransitionView();
        }
    }

    public static /* synthetic */ pkr access$800(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pkr) ipChange.ipc$dispatch("91754782", new Object[]{openNormalRoomController}) : openNormalRoomController.mVideoFrame;
    }

    public static /* synthetic */ ValueAnimator access$900(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("4afb1452", new Object[]{openNormalRoomController}) : openNormalRoomController.valueAnimator;
    }

    static {
        kge.a(-466495839);
        kge.a(-1905361424);
        kge.a(-2101054629);
        kge.a(191318335);
        TAG = OpenNormalRoomController.class.getSimpleName();
    }

    public OpenNormalRoomController(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, pkr pkrVar, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mToken = "";
        this.mFirstFrameRendered = false;
        this.frameContextUnique = null;
        this.mRoomLayout = (ViewGroup) view.findViewById(R.id.taolive_room_layout);
        this.mRoomLayout.removeAllViews();
        this.mBackgroundImage = (AliUrlImageView) view.findViewById(R.id.taolive_background_image);
        this.mVideoFrame = pkrVar;
        this.mHandler = new com.taobao.taolive.sdk.model.f(this);
        bindData(this.mLiveDataModel);
        if (this.mFrameContext != null) {
            this.frameContextUnique = this.mFrameContext.G();
        }
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void showByStatus(com.taobao.taolive.sdk.model.TBLiveDataModel r14) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.controller2.OpenNormalRoomController.showByStatus(com.taobao.taolive.sdk.model.TBLiveDataModel):void");
    }

    private void getCustomPageExtParams() {
        ATaoLiveOpenEntity o;
        ssr d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597e3618", new Object[]{this});
        } else if (this.mFrameContext == null || (o = this.mFrameContext.o()) == null || o.eventCompontent == null || o.eventCompontent.a() == null || (d = o.eventCompontent.a().d()) == null) {
        } else {
            Map dD_ = d.dD_();
            String str = TAG;
            ab.c(str, "getCustomPageExtParams，customPageParamsExtMap：" + dD_);
            getCustomPageExtParamsInernal(dD_);
        }
    }

    private void getCustomPageExtParamsInernal(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d884a468", new Object[]{this, map});
        } else if (!(this.mFrameContext.z() instanceof com.taobao.taolive.sdk.controller.e)) {
        } else {
            com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) this.mFrameContext.z();
            if (!eVar.A() || at.a(map) || at.a(map)) {
                return;
            }
            eVar.a(map);
        }
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

    private void registerRenderFinishListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348fc967", new Object[]{this});
        } else if (!ply.T()) {
        } else {
            final HashSet hashSet = new HashSet();
            this.renderFinish = new ddv() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ddv
                public String bizCode() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("36951559", new Object[]{this}) : "OpenNormalRoomControllerRenderFinish";
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
                    ab.d(OpenNormalRoomController.access$000(), "render finish");
                    OpenNormalRoomController.access$200(OpenNormalRoomController.this).k(OpenNormalRoomController.access$100(OpenNormalRoomController.this));
                    if (!StringUtils.equals(ag.SOURCE_UPDOWNSWITCH, poz.p(com.taobao.taolive.room.utils.n.b(OpenNormalRoomController.this.mFrameContext)))) {
                        com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE");
                    }
                    ddw.a().b(OpenNormalRoomController.access$300(OpenNormalRoomController.this));
                    poz.n(false, com.taobao.taolive.room.utils.n.b(OpenNormalRoomController.this.mFrameContext));
                    if (!(OpenNormalRoomController.this.mFrameContext instanceof com.taobao.taolive.sdk.core.e)) {
                        return;
                    }
                    poz.n(false, (com.taobao.taolive.sdk.core.g) ((com.taobao.taolive.sdk.core.e) OpenNormalRoomController.this.mFrameContext).y());
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
                    if (OpenNormalRoomController.this.mFrameContext != null) {
                        return OpenNormalRoomController.this.mFrameContext.G();
                    }
                    return null;
                }
            };
            ddw.a().a(this.renderFinish);
        }
    }

    private void initRoomScreenManager(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d989a50", new Object[]{this, videoInfo});
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
            this.mTaoliveShowByStatus = new phv.a().a(videoInfo.landScape).a(this.mContext).a(this.mHandler).b(this.mHideUI).a(this.mLiveDataModel).a(this).a(this.mRoomLayout).a(this.mVideoFrame).a(this.mBackgroundImage).a(this.mFrameContext).a();
            this.mTaoliveShowByStatus.a();
        }
        phv phvVar = this.mTaoliveShowByStatus;
        if (phvVar == null) {
            return;
        }
        phvVar.b(this.mHideUI);
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
                phv phvVar = this.mTaoliveShowByStatus;
                if (phvVar != null) {
                    phvVar.g = System.currentTimeMillis();
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
        pkg pkgVar;
        TBLiveRecEngineV2.RecModel w;
        boolean z;
        TBLiveRecEngineV2.RecModel w2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        ac.a(TAG, "onStatusChange");
        super.onStatusChange(i, obj);
        final TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            return;
        }
        if (i == 1) {
            if (aa.cY() && tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.broadCaster != null) {
                if (tBLiveDataModel.mVideoInfo.broadCaster.frameLockForbidden) {
                    ADaemon.pauseFrameLock(2);
                } else {
                    ADaemon.resumeFrameLock(2);
                }
            }
            if (!aa.dd()) {
                ADaemon.pauseFrameLock(2);
            }
            initFrameInstaller();
            String p = poz.p(com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            if (u.aD() && !StringUtils.equals(ag.SOURCE_UPDOWNSWITCH, p)) {
                com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T2);
                ab.d("LIVE_CODE_BOOT_STAGE", "stage:t2");
            }
            pqi.a().c(TAG, "STATUS_INIT_SUCCESS");
            if (tBLiveDataModel.mInitParams != null) {
                poz.e(tBLiveDataModel.mInitParams.get(aw.PARAM_TRACK_LIVEOPRT_ID), com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            }
            if ((this.mFrameContext instanceof g) && (w2 = ((g) this.mFrameContext).w()) != null && w2.initParams != null) {
                poy.k(w2.initParams.get("content"), this.mFrameContext);
                poz.a(w2.initParams.get("spm"), com.taobao.taolive.room.utils.n.b(this.mFrameContext));
                poz.b(w2.initParams.get("trackInfo"), com.taobao.taolive.room.utils.n.b(this.mFrameContext));
            }
            if (u.aW() && this.mFrameContext != null) {
                this.mFrameContext.a((dds) new com.taobao.taolive.room.business.mess.e());
            }
            pkm pkmVar = this.mPerfomenceTrackManager;
            if (pkmVar != null) {
                pkmVar.i(this.mTrackId);
            }
            pmd.a().m().b("vanda", "STATUS_INIT_SUCCESS info = " + obj);
            com.taobao.taolive.sdk.core.j.a(this.mFrameContext, new pnn() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnn
                public Map<String, String> getHeartParams() {
                    JSONObject b;
                    IpChange ipChange2 = $ipChange;
                    int i2 = 0;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("ab918d32", new Object[]{this});
                    }
                    HashMap hashMap = new HashMap();
                    Map<String, String> d = ai.d(OpenNormalRoomController.this.mFrameContext, OpenNormalRoomController.this.mContext);
                    if (d != null) {
                        hashMap.putAll(d);
                    }
                    if (aa.ak() && (OpenNormalRoomController.this.mFrameContext instanceof g) && ((g) OpenNormalRoomController.this.mFrameContext).w() != null && ((g) OpenNormalRoomController.this.mFrameContext).w().isFirst && (OpenNormalRoomController.this.mFrameContext.z() instanceof com.taobao.taolive.sdk.controller.e) && !StringUtils.isEmpty(((com.taobao.taolive.sdk.controller.e) OpenNormalRoomController.this.mFrameContext.z()).v())) {
                        hashMap.put(aw.PARAM_PM_PARAMS, ((com.taobao.taolive.sdk.controller.e) OpenNormalRoomController.this.mFrameContext.z()).v());
                    }
                    if (tBLiveDataModel.mInitParams != null && !StringUtils.isEmpty(tBLiveDataModel.mInitParams.get(aw.PARAM_IGNORE_PV))) {
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
                        if (tBLiveDataModel.mVideoInfo.isOfficialType() && aa.ca()) {
                            hashMap.put("officialLiveId", tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId);
                            hashMap.put("officialAccountId", tBLiveDataModel.mVideoInfo.officialLiveInfo.accountId);
                        }
                    }
                    if (com.taobao.taolive.sdk.utils.o.L() && OpenNormalRoomController.this.mFrameContext != null) {
                        hashMap.put("liveToken", OpenNormalRoomController.this.mFrameContext.j());
                    }
                    if (OpenNormalRoomController.this.mFrameContext != null) {
                        hashMap.put("pmSession", OpenNormalRoomController.this.mFrameContext.j());
                    }
                    String L = poy.L(OpenNormalRoomController.this.mFrameContext);
                    if (aa.az() && "tpp_88".equals(poz.p(com.taobao.taolive.room.utils.n.b(OpenNormalRoomController.this.mFrameContext))) && !StringUtils.isEmpty(poy.Y(OpenNormalRoomController.this.mFrameContext)) && (b = pqj.b(Uri.decode(poy.Y(OpenNormalRoomController.this.mFrameContext)))) != null && b.getString("trackInfo") != null) {
                        L = b.getString("trackInfo");
                    }
                    hashMap.put("trackInfo", L);
                    poy.K(OpenNormalRoomController.this.mFrameContext);
                    hashMap.put("clickid", poy.m(OpenNormalRoomController.this.mFrameContext));
                    hashMap.put("livesource", poz.p(com.taobao.taolive.room.utils.n.b(OpenNormalRoomController.this.mFrameContext)));
                    hashMap.put("entry_source", poy.R(OpenNormalRoomController.this.mFrameContext));
                    if ((!hashMap.containsKey("spm-url") || StringUtils.isEmpty((CharSequence) hashMap.get("spm-url"))) && (OpenNormalRoomController.this.mFrameContext instanceof com.taobao.taolive.sdk.core.e)) {
                        hashMap.put("spm-url", poy.K(OpenNormalRoomController.this.mFrameContext));
                    }
                    hashMap.put("isAD", String.valueOf(poy.w(OpenNormalRoomController.this.mFrameContext) ? 1 : 0));
                    hashMap.put("liveAdParams", Uri.encode(poy.Z(OpenNormalRoomController.this.mFrameContext)));
                    if (poy.q(OpenNormalRoomController.this.mFrameContext) != null) {
                        i2 = 1;
                    }
                    hashMap.put("isAdTransParams", String.valueOf(i2));
                    hashMap.put("isChatRoom", String.valueOf(poy.b(tBLiveDataModel, OpenNormalRoomController.this.mFrameContext) ? 1 : 0));
                    hashMap.put("scene", !StringUtils.isEmpty(tBLiveDataModel.mVideoInfo.timeMovingPlayUrl) ? "smartpoint" : "default");
                    hashMap.put("kandianid", poy.ay(OpenNormalRoomController.this.mFrameContext) + "_" + poy.C(OpenNormalRoomController.this.mFrameContext));
                    hashMap.put("watchid", poy.z(OpenNormalRoomController.this.mFrameContext));
                    if (OpenNormalRoomController.this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) {
                        hashMap.put(aw.PARAM_PVID, poy.M(OpenNormalRoomController.this.mFrameContext));
                    }
                    return hashMap;
                }
            });
            ddw.a().a(this);
            com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this, new MessageTypeFilter() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
                public boolean filter(int i2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i2)})).booleanValue() : i2 == 1058 || i2 == 1039 || i2 == 888000111 || i2 == 888000113 || i2 == 102 || i2 == 1059;
                }
            });
            if (tBLiveDataModel.mVideoInfo.status == 4 || tBLiveDataModel.mVideoInfo.status == 0 || tBLiveDataModel.mVideoInfo.status == 3 || tBLiveDataModel.mVideoInfo.status == 1) {
                if (aa.D()) {
                    boolean z2 = com.taobao.taolive.room.utils.k.a() == 2;
                    com.taobao.taolive.sdk.core.j.a(this.mFrameContext, z2);
                    com.taobao.taolive.sdk.model.f fVar = this.mHandler;
                    if (fVar != null && z2) {
                        fVar.sendEmptyMessageDelayed(3, 3000L);
                    }
                }
                if (this.mFrameContext != null) {
                    com.taobao.taolive.sdk.core.j.a(this.mFrameContext, this.mFrameContext.j(), tBLiveDataModel);
                }
            }
            if ((this.mFrameContext instanceof g) && (w = ((g) this.mFrameContext).w()) != null) {
                if (!aa.db() || !tBLiveDataModel.mVideoInfo.isOfficialLive()) {
                    z = false;
                } else {
                    if (!w.isFirst || w.initParams == null) {
                        z = false;
                    } else {
                        refreshInitParams(tBLiveDataModel.mVideoInfo, w);
                        z = true;
                    }
                    if (hasLiveUrlListChanged(w.liveUrlList, tBLiveDataModel.mVideoInfo.liveUrlList)) {
                        w.h265 = tBLiveDataModel.mVideoInfo.h265;
                        w.rateAdapte = tBLiveDataModel.mVideoInfo.rateAdapte;
                        w.liveUrlList = tBLiveDataModel.mVideoInfo.liveUrlList;
                        w.mediaConfig = tBLiveDataModel.mVideoInfo.mediaConfig;
                        w.mediaSourceType = tBLiveDataModel.mVideoInfo.pushFeature;
                        z = true;
                    }
                }
                if (aa.dc() && w.imageUrl == null) {
                    w.imageUrl = tBLiveDataModel.mVideoInfo.coverImg;
                    z = true;
                }
                if (z) {
                    ((g) this.mFrameContext).a(w);
                    pkr pkrVar = this.mVideoFrame;
                    if (pkrVar != null) {
                        pkrVar.a(w);
                    }
                    ddw.a().a("com.taobao.taolive.room.refresh.recmodel", w);
                }
            }
            String str = "livedetail end:" + System.currentTimeMillis();
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
            b.a aVar = null;
            if (!(this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) || ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o() == null) {
                pkgVar = null;
            } else {
                pkgVar = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o().taoliveOpenContext;
                if (pkgVar != null && pkgVar.f != null) {
                    Object obj2 = pkgVar.f.get("aliveChanel");
                    String valueOf = obj2 != null ? String.valueOf(obj2) : null;
                    if (!StringUtils.isEmpty(valueOf)) {
                        hashMap.put("channel", valueOf);
                    }
                }
            }
            if (this.mTBLiveInteractiveManager == null) {
                this.mTBLiveInteractiveManager = new com.taobao.tbliveinteractive.e(this.mContext, this.mFrameContext, this.mRoomDidAppearTime);
                if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(pkgVar.b) && pkgVar != null && pkgVar.d != null && pkgVar.d.aR_() != null) {
                    this.mTBLiveInteractiveManager.a(pkgVar.d.aR_().intValue());
                }
                if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(pkgVar.b) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(pkgVar.b) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.name().equals(pkgVar.b)) {
                    this.mTBLiveInteractiveManager.a(pkgVar.d.aR_().intValue());
                    this.mTBLiveInteractiveManager.a(!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_WATCH_NUM, this.mFrameContext));
                }
            }
            com.taobao.taolive.room.utils.m.b(this.mFrameContext);
            final com.taobao.taolive.sdk.core.g b = com.taobao.taolive.room.utils.n.b(this.mFrameContext);
            if (b != null && b.F != null && b.F.f()) {
                aVar = new b.a() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.componentlist.b.a
                    public void a(final com.taobao.tbliveinteractive.componentlist.c cVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("12657be2", new Object[]{this, cVar});
                        } else {
                            b.F.a(true, "targetAlive", new ISmartLandingProxy.d() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
                                public boolean a(String str2, JSONObject jSONObject, JSONObject jSONObject2) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return ((Boolean) ipChange3.ipc$dispatch("5ca495b6", new Object[]{this, str2, jSONObject, jSONObject2})).booleanValue();
                                    }
                                    String access$000 = OpenNormalRoomController.access$000();
                                    ab.a(access$000, "getComponentList onTaskActionListener popId " + str2 + " actionData " + jSONObject + " " + jSONObject2);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("smartLandingActionData", (Object) jSONObject);
                                    jSONObject3.put("componentListData", (Object) jSONObject2);
                                    jSONObject3.put("enableSmartlanding", (Object) Boolean.valueOf(b.F.f()));
                                    cVar.a(jSONObject3);
                                    return true;
                                }
                            });
                        }
                    }
                };
            }
            this.mTBLiveInteractiveManager.a(this.mLiveDataModel.mVideoInfo, poy.R(this.mFrameContext), this.mLiveSource, hashMap, aVar);
            this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.b(this.mFrameContext));
            this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.f(this.mFrameContext));
            this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.c(this.mFrameContext, this));
            this.mTBLiveInteractiveManager.a(new com.taobao.taolive.room.mediaplatform.d());
            this.mTBLiveInteractiveManager.c().a(new com.taobao.taolive.room.mediaplatform.e(this.mTrackId, this.mContext, this.mFrameContext, this.mPerfomenceTrackManager));
            ((phq) this.mFrameContext).a(this.mTBLiveInteractiveManager);
            if (tBLiveDataModel instanceof TBLiveBizDataModel) {
                ((TBLiveBizDataModel) tBLiveDataModel).liveInteractiveManager = this.mTBLiveInteractiveManager;
            }
            phv phvVar = this.mTaoliveShowByStatus;
            if (phvVar != null) {
                phvVar.a(this.mTBLiveInteractiveManager);
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
        ac.a();
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
                com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            OpenNormalRoomController.access$400(OpenNormalRoomController.this);
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
        ac.a(TAG, "onDidDisappear");
        super.onDidDisappear();
        destroy();
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        ac.a(TAG, "onWillDisappear");
        if (this.mLiveDataModel != null && !plz.a(this.mLiveDataModel.mVideoInfo)) {
            super.onWillDisappear();
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        ac.a(TAG, "onDidAppear");
        this.mRoomDidAppearTime = System.currentTimeMillis();
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            this.mTrackId = pkmVar.b();
        }
        super.onDidAppear();
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ac.a(TAG, MessageID.onDestroy);
        super.onDestroy();
        if (this.mFrameContext.k() != null) {
            this.mFrameContext.k().b();
        }
        destroy();
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ac.a(TAG, MessageID.onStop);
        super.onStop();
        com.taobao.taolive.sdk.utils.r.a(this.mFrameContext);
        if (this.mFrameContext instanceof g) {
            ((g) this.mFrameContext).E = true;
        }
        pip pipVar = this.mTaskInteractiveManager;
        if (pipVar != null) {
            pipVar.g();
        }
        ac.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, tb.deh
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ac.a(TAG, "onStart");
        super.onStart();
        com.taobao.taolive.sdk.utils.r.a(this.mFrameContext);
        if (this.mFrameContext instanceof g) {
            ((g) this.mFrameContext).E = false;
        }
        pip pipVar = this.mTaskInteractiveManager;
        if (pipVar != null) {
            pipVar.c();
        }
        ac.a();
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
        phv phvVar = this.mTaoliveShowByStatus;
        if (phvVar != null) {
            phvVar.b();
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
            if (this.mFrameContext != null && (this.mFrameContext.z() instanceof c)) {
                this.mHideUI = ((c) this.mFrameContext.z()).y;
            }
            this.mSjsdItemId = tBLiveDataModel.mInitParams.get(aw.PARAM_SJSD_ITEM_ID);
            this.mTimeMovingItemId = tBLiveDataModel.mInitParams.get(aw.PARAM_TIMEMOVING_ITEM_ID);
            String str = tBLiveDataModel.mInitParams.get("landScapeVideo");
            if (StringUtils.isEmpty(str) || !Boolean.parseBoolean(str)) {
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
                String str2 = tBLiveDataModel.mInitParams.get(aw.PARAM_CUSTOM_PLAY_CTRL);
                if (!StringUtils.isEmpty(str2)) {
                    this.mMediaInfo = com.taobao.taolive.room.utils.q.a(str2);
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
        ac.a(TAG, "onBindData");
        bindData(tBLiveDataModel);
        super.onBindData(tBLiveDataModel);
        ac.a();
    }

    private void refreshInitParams(VideoInfo videoInfo, TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23606161", new Object[]{this, videoInfo, recModel});
            return;
        }
        JSONObject parseObject = JSON.parseObject(recModel.initParams.get(aw.PARAM_CUSTOM_PLAY_CTRL));
        if (parseObject == null) {
            return;
        }
        if (parseObject.containsKey("h265")) {
            parseObject.put("h265", (Object) Boolean.valueOf(videoInfo.h265));
        }
        if (parseObject.containsKey("rateAdapte")) {
            parseObject.put("rateAdapte", (Object) Boolean.valueOf(videoInfo.rateAdapte));
        }
        if (parseObject.containsKey(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID)) {
            parseObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) videoInfo.liveId);
        }
        if (parseObject.containsKey("pushFeature")) {
            parseObject.put("pushFeature", (Object) videoInfo.pushFeature);
        }
        if (parseObject.containsKey(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.PARAM_MEDIA_INFO_MEDIACONFIG)) {
            parseObject.put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.PARAM_MEDIA_INFO_MEDIACONFIG, (Object) videoInfo.mediaConfig);
        }
        if (parseObject.containsKey("liveUrlList")) {
            parseObject.put("liveUrlList", (Object) com.taobao.android.miniLive.model.a.a(videoInfo.liveUrlList));
        }
        recModel.initParams.put(aw.PARAM_CUSTOM_PLAY_CTRL, parseObject.toJSONString());
    }

    private boolean hasLiveUrlListChanged(ArrayList<QualitySelectItem> arrayList, ArrayList<QualitySelectItem> arrayList2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f8fcad8", new Object[]{this, arrayList, arrayList2})).booleanValue() : (arrayList == null || arrayList2 == null || arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) == null || arrayList2.get(0) == null || StringUtils.equals(arrayList.get(0).flvUrl, arrayList2.get(0).flvUrl)) ? false : true;
    }

    private void showGoodListsIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4215ef15", new Object[]{this});
        } else if (!aa.ab() || StringUtils.isEmpty(this.mShareItemId) || !aa.ac()) {
        } else {
            ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, null, this.frameContextUnique);
        }
    }

    private void realSwitchTaoLiveRoom(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9ec222", new Object[]{this, str, str2, new Boolean(z)});
        } else if (StringUtils.isEmpty(str)) {
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
            pkr pkrVar = this.mVideoFrame;
            if (pkrVar != null) {
                pkrVar.q();
            }
            com.taobao.taolive.room.utils.s.a(this.mContext, str);
        } else {
            this.mSwitchTVProgramNormalView.setVisibility(8);
            this.mSwitchTVProgramNewView.setVisibility(0);
            if (!StringUtils.isEmpty(str2)) {
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
            this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.8
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
                    OpenNormalRoomController.access$500(OpenNormalRoomController.this).setProgress(((Integer) animatedValue).intValue());
                }
            });
            this.valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.9
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
                    } else if (OpenNormalRoomController.access$600(OpenNormalRoomController.this)) {
                    } else {
                        OpenNormalRoomController.access$602(OpenNormalRoomController.this, true);
                        OpenNormalRoomController.access$700(OpenNormalRoomController.this);
                        if (OpenNormalRoomController.access$800(OpenNormalRoomController.this) != null) {
                            OpenNormalRoomController.access$800(OpenNormalRoomController.this).q();
                        }
                        com.taobao.taolive.room.utils.s.a(OpenNormalRoomController.this.mContext, str);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else if (OpenNormalRoomController.access$600(OpenNormalRoomController.this)) {
                    } else {
                        OpenNormalRoomController.access$602(OpenNormalRoomController.this, true);
                        OpenNormalRoomController.access$700(OpenNormalRoomController.this);
                        if (OpenNormalRoomController.access$800(OpenNormalRoomController.this) != null) {
                            OpenNormalRoomController.access$800(OpenNormalRoomController.this).q();
                        }
                        com.taobao.taolive.room.utils.s.a(OpenNormalRoomController.this.mContext, str);
                    }
                }
            });
            this.mHasSwitch = false;
            this.valueAnimator.start();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mSwitchTVProgramTransitionView, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.start();
        if (this.mSwitchTVProgramTransitionView.getParent() != null || ((ViewGroup) ((Activity) this.mContext).findViewById(R.id.taolive_root_view)) == null) {
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
        this.mSwitchTVProgramNo.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String replace;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                OpenNormalRoomController.access$602(OpenNormalRoomController.this, true);
                if (OpenNormalRoomController.access$900(OpenNormalRoomController.this) != null) {
                    OpenNormalRoomController.access$900(OpenNormalRoomController.this).cancel();
                }
                OpenNormalRoomController.access$700(OpenNormalRoomController.this);
                if (OpenNormalRoomController.this.mLiveDataModel == null || StringUtils.isEmpty(OpenNormalRoomController.this.mLiveDataModel.mActionUrl)) {
                    return;
                }
                String str = OpenNormalRoomController.this.mLiveDataModel.mActionUrl;
                if (!str.contains(aw.PARAM_FORCE_REFRESH)) {
                    replace = str + "&forceRefresh=true";
                } else {
                    replace = str.replace("forceRefresh=false", "forceRefresh=true");
                }
                com.taobao.taolive.room.utils.s.a(OpenNormalRoomController.this.mContext, replace);
            }
        });
        this.mSwitchTVProgramYes.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (OpenNormalRoomController.access$900(OpenNormalRoomController.this) == null) {
                } else {
                    OpenNormalRoomController.access$900(OpenNormalRoomController.this).cancel();
                }
            }
        });
        this.mSwitchTVProgramNormalView.setImageUrl(ICON_URL);
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
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.2
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
                } else if (OpenNormalRoomController.access$1000(OpenNormalRoomController.this) == null || OpenNormalRoomController.access$1000(OpenNormalRoomController.this).getParent() == null || ((Activity) OpenNormalRoomController.this.mContext).findViewById(R.id.taolive_root_view) == null) {
                } else {
                    ((ViewGroup) ((Activity) OpenNormalRoomController.this.mContext).findViewById(R.id.taolive_root_view)).removeView(OpenNormalRoomController.access$1000(OpenNormalRoomController.this));
                    OpenNormalRoomController.access$1002(OpenNormalRoomController.this, null);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else if (OpenNormalRoomController.access$1000(OpenNormalRoomController.this) == null || OpenNormalRoomController.access$1000(OpenNormalRoomController.this).getParent() == null || ((Activity) OpenNormalRoomController.this.mContext).findViewById(R.id.taolive_root_view) == null) {
                } else {
                    ((ViewGroup) ((Activity) OpenNormalRoomController.this.mContext).findViewById(R.id.taolive_root_view)).removeView(OpenNormalRoomController.access$1000(OpenNormalRoomController.this));
                    OpenNormalRoomController.access$1002(OpenNormalRoomController.this, null);
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
        if (a2 == null || tBLiveSwitchMsg == null || StringUtils.isEmpty(tBLiveSwitchMsg.targetLiveId) || (tBLiveSwitchMsg.newRoomType & 256) != 256 || StringUtils.isEmpty(tBLiveSwitchMsg.targetUrl) || this.mInSwitchTaoLiveRoom || this.mIsPaused || j.c()) {
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
        phv phvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 102) {
            if (this.mLiveDataModel == null || plz.a(this.mLiveDataModel.mVideoInfo) || !(obj instanceof JoinNotifyMessage)) {
                return;
            }
            JoinNotifyMessage joinNotifyMessage = (JoinNotifyMessage) obj;
            String a2 = com.taobao.taolive.room.openarchitecture.single.c.a(this.curWatchNum, com.taobao.taolive.room.utils.t.a(joinNotifyMessage), false, joinNotifyMessage.viewCountFormat, this.mLiveDataModel.mVideoInfo, this.mContext);
            ATaoLiveOpenEntity o = this.mFrameContext.o();
            if (o != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("watchNumberDes", a2);
                o.accessListener(AccessListenerEnum.onLiveRoomWatchCountChange, hashMap);
            }
            com.taobao.tbliveinteractive.e eVar = this.mTBLiveInteractiveManager;
            if (eVar == null) {
                return;
            }
            eVar.a(a2);
        } else if (i == 1039) {
            ai.a(this.mFrameContext, ag.SHOW_PROGRAM, (HashMap<String, String>) null);
            if (!(obj instanceof TBTVProgramMessage)) {
                return;
            }
            TBTVProgramMessage tBTVProgramMessage = (TBTVProgramMessage) obj;
            if (tBTVProgramMessage.liveDO == null || StringUtils.isEmpty(tBTVProgramMessage.liveDO.backgroundImageURL) || (phvVar = this.mTaoliveShowByStatus) == null) {
                return;
            }
            phvVar.a(tBTVProgramMessage.liveDO.backgroundImageURL);
        } else if (i == 888000111) {
            if (!(obj instanceof OfficialLiveSwitchNextMessage)) {
                return;
            }
            switchOfficialLiveRoom((OfficialLiveSwitchNextMessage) obj);
        } else if (i == 888000113) {
            if (!(obj instanceof OfficialLiveEndMessage)) {
                return;
            }
            endOfficialLive((OfficialLiveEndMessage) obj);
        } else if (i == 1058) {
            if (!(obj instanceof TBLiveSwitchMsg)) {
                return;
            }
            switchTaoLiveRoom((TBLiveSwitchMsg) obj);
        } else if (i != 1059 || this.mLiveDataModel == null || !plz.a(this.mLiveDataModel.mVideoInfo) || !(obj instanceof TBLivePVMsg)) {
        } else {
            TBLivePVMsg tBLivePVMsg = (TBLivePVMsg) obj;
            String a3 = com.taobao.taolive.room.openarchitecture.single.c.a(this.curWatchNum, tBLivePVMsg.pv, true, tBLivePVMsg.viewCountFormat, this.mLiveDataModel.mVideoInfo, this.mContext);
            ATaoLiveOpenEntity o2 = this.mFrameContext.o();
            if (o2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("watchNumberDes", a3);
                o2.accessListener(AccessListenerEnum.onLiveRoomWatchCountChange, hashMap2);
            }
            com.taobao.tbliveinteractive.e eVar2 = this.mTBLiveInteractiveManager;
            if (eVar2 == null) {
                return;
            }
            eVar2.a(a3);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.mediaplatform_switch_to_landscape".equals(str)) {
            phv phvVar = this.mTaoliveShowByStatus;
            if (phvVar == null) {
                return;
            }
            phvVar.d();
        } else if ("com.taobao.taolive.room.mediaplatform_switch_to_portrait".equals(str)) {
            phv phvVar2 = this.mTaoliveShowByStatus;
            if (phvVar2 == null) {
                return;
            }
            phvVar2.c();
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
        if (StringUtils.isEmpty(str)) {
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
        phv phvVar = this.mTaoliveShowByStatus;
        if (phvVar != null && (phvVar.e() instanceof ppy)) {
            return ((ppy) this.mTaoliveShowByStatus.e()).getUbeeContainer();
        }
        return null;
    }

    private void endOfficialLive(final OfficialLiveEndMessage officialLiveEndMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dae4c8e", new Object[]{this, officialLiveEndMessage});
            return;
        }
        VideoInfo a2 = com.taobao.taolive.sdk.controller.k.a(this.mLiveDataModel);
        if (a2 == null || !a2.isOfficialType() || officialLiveEndMessage == null || StringUtils.isEmpty(officialLiveEndMessage.officialLiveId) || !officialLiveEndMessage.officialLiveId.equals(a2.officialLiveInfo.officialLiveId)) {
            return;
        }
        Toast makeText = Toast.makeText(this.mContext, com.taobao.taolive.sdk.utils.p.g(), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        com.taobao.taolive.sdk.model.f fVar = this.mHandler;
        if (fVar == null) {
            return;
        }
        fVar.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Context context = OpenNormalRoomController.this.mContext;
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
        if (a2 == null || !a2.isOfficialType() || officialLiveSwitchNextMessage == null || StringUtils.isEmpty(officialLiveSwitchNextMessage.targetLiveId) || StringUtils.isEmpty(officialLiveSwitchNextMessage.targetLiveDetailUrl) || officialLiveSwitchNextMessage.targetLiveId.equals(a2.liveId) || !officialLiveSwitchNextMessage.officialLiveId.equals(a2.officialLiveInfo.officialLiveId) || this.mInSwitchTaoLiveRoom || this.mIsPaused) {
            return;
        }
        if ("true".equals(officialLiveSwitchNextMessage.gapPeriod)) {
            e = String.format(com.taobao.taolive.sdk.utils.p.f(), StringUtils.isEmpty(officialLiveSwitchNextMessage.nextPlanStartTime) ? "" : officialLiveSwitchNextMessage.nextPlanStartTime);
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
        fVar.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.controller2.OpenNormalRoomController.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.taobao.taolive.room.utils.s.a(OpenNormalRoomController.this.mContext, officialLiveSwitchNextMessage.targetLiveDetailUrl);
                }
            }
        }, com.taobao.taolive.sdk.utils.p.h());
    }

    private boolean isTab2(com.taobao.alilive.aliliveframework.frame.a aVar) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f97aeefb", new Object[]{this, aVar})).booleanValue() : (aVar == null || (o = aVar.o()) == null || !StringUtils.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), o.bizCode)) ? false : true;
    }
}
