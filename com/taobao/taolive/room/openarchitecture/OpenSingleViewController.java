package com.taobao.taolive.room.openarchitecture;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.FrameManager;
import com.taobao.alilive.aliliveframework.frame.IComponent;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.recommendpop.IRecommendPopProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.media.MediaConstant;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.controller.TaoliveHighlightController;
import com.taobao.taolive.room.H5EmbedView;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.controller2.OpenNormalRoomController;
import com.taobao.taolive.room.controller2.TaoLiveNormalRoomController;
import com.taobao.taolive.room.controller2.c;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.controller2.l;
import com.taobao.taolive.room.mediaplatform.i;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.openarchitecture.single.a;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ap;
import com.taobao.taolive.room.utils.at;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.configurable.ITaoLiveComponentConfig;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import com.taobao.taolive.sdk.ui.component.b;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.k;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.dds;
import tb.ddv;
import tb.ddw;
import tb.ded;
import tb.ezu;
import tb.ffv;
import tb.hfk;
import tb.ipx;
import tb.kge;
import tb.pfa;
import tb.pfb;
import tb.pff;
import tb.pgp;
import tb.phu;
import tb.pib;
import tb.pic;
import tb.pjz;
import tb.pka;
import tb.pkb;
import tb.pkm;
import tb.pkn;
import tb.pko;
import tb.pkr;
import tb.pks;
import tb.pku;
import tb.plk;
import tb.plw;
import tb.plz;
import tb.pmd;
import tb.pmw;
import tb.pmx;
import tb.pnj;
import tb.pos;
import tb.poy;
import tb.poz;
import tb.ppa;
import tb.ppb;
import tb.ppn;
import tb.ppp;
import tb.ppq;
import tb.pqi;
import tb.qne;
import tb.sgr;
import tb.ssr;
import tb.tki;
import tb.xkw;

/* loaded from: classes8.dex */
public class OpenSingleViewController implements a, IRemoteExtendListener, TBLiveDataProvider.b, d.a, b, ddv, pks, ppp.a, ppq.a, sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OpenSingleViewController";
    private boolean delayDidAppear;
    public boolean hasDidAppear;
    public boolean hasExectDidAppear;
    public boolean hasSurfaceRender;
    private boolean hasSurfaceUpdate;
    private pgp highlightPreloadTimeMove;
    private boolean isFromBackground;
    public View itemView;
    private com.taobao.taolive.room.controller2.a mAutoDownController;
    public BaseFrame mComponentManager;
    public Context mContext;
    private ppq mDataProvider;
    private View mErrorView;
    private pmx mFollowChangeListener;
    private e mGlobalContext;
    private Handler mHandler;
    private String mHitPreRequestLiveId;
    public boolean mIsDestroyed;
    public TBLiveBizDataModel mLiveDataModel;
    private pib mMediaStatusController;
    private ffv mMoreSwitchGuideTip;
    private com.taobao.taolive.sdk.playcontrol.b mMultiRoomVideoControllerObserver;
    public pkm mPerfomenceTrackManager;
    public TBLiveRecEngineV2.RecModel mRecModel;
    private IRecommendPopProxy.a mRecommendPop;
    public String mRequestAccountId;
    public String mRequestLiveId;
    public BaseFrame mRoomController;
    public ViewGroup mRoomLayout;
    private pic mTBLIveRoomEngine;
    private String mTrackId;
    public pkr mVideoFrame;
    private Object seiDispatcher;
    private ATaoLiveOpenEntity taoLiveOpenEntity;
    private long mFirstTime = 0;
    public g mFrameContext = new g();
    private boolean mDidAppear = false;
    private boolean mHasDisappear = false;
    private boolean mEnableAdjustBBConnectionVideoSize = false;
    private l mUpdownSwitchStateObserver = new l();
    public String frameContextUnique = null;
    private ddv mEnterEndEventObserver = new ddv() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ddv
        public String bizCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : OpenSingleViewController.TAG;
        }

        @Override // tb.ddv
        public void onEvent(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            } else if (!"com.taobao.taolive.room.ent.opt.animation.end".equals(str)) {
            } else {
                if (OpenSingleViewController.this.mFrameContext != null && OpenSingleViewController.this.mFrameContext.y() != null) {
                    OpenSingleViewController.this.mFrameContext.y().d(true);
                }
                OpenSingleViewController.access$000(OpenSingleViewController.this);
            }
        }

        @Override // tb.ddv
        public String[] observeEvents() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.ent.opt.animation.end"};
        }

        @Override // tb.ddv
        public String observeUniqueIdentification() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
            }
            if (OpenSingleViewController.this.mFrameContext != null) {
                return OpenSingleViewController.this.mFrameContext.G();
            }
            return null;
        }
    };

    static {
        kge.a(-1533152347);
        kge.a(600413623);
        kge.a(-1941058775);
        kge.a(-2101054629);
        kge.a(191318335);
        kge.a(788651310);
        kge.a(-1375031632);
        kge.a(955428880);
        kge.a(-324942482);
        kge.a(1522751733);
        kge.a(-1010935401);
    }

    @Override // tb.ppp.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void dataParseBegin(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
        }
    }

    public void init(Context context, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e14feb", new Object[]{this, context, taoliveOpenLiveRoom});
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void initParams(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33fb2d9", new Object[]{this, obj});
        }
    }

    public static /* synthetic */ void access$000(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea9d0e5", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.onDelayDidAppear();
        }
    }

    public static /* synthetic */ void access$100(OpenSingleViewController openSingleViewController, SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34988523", new Object[]{openSingleViewController, simpleVideoInfo});
        } else {
            openSingleViewController.addSimplePageTrackFeedId(simpleVideoInfo);
        }
    }

    public static /* synthetic */ void access$200(OpenSingleViewController openSingleViewController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80518a2d", new Object[]{openSingleViewController, str});
        } else {
            openSingleViewController.updateDisPatchTrackInfo(str);
        }
    }

    public static /* synthetic */ void access$300(OpenSingleViewController openSingleViewController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f78198c", new Object[]{openSingleViewController, str});
        } else {
            openSingleViewController.getLiveDetail(str);
        }
    }

    public static /* synthetic */ void access$400(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86db561", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.getLiveDetail();
        }
    }

    public static /* synthetic */ void access$500(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12deae80", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.surfaceRenderRequest();
        }
    }

    public static /* synthetic */ void access$600(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4fa79f", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.forceRefresh();
        }
    }

    public static /* synthetic */ ATaoLiveOpenEntity access$700(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ATaoLiveOpenEntity) ipChange.ipc$dispatch("74817e53", new Object[]{openSingleViewController}) : openSingleViewController.taoLiveOpenEntity;
    }

    public OpenSingleViewController() {
        this.mFrameContext.a(new ipx());
    }

    public void initMultiRoomVideoControllerObserver(com.taobao.taolive.sdk.playcontrol.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39b3c8c", new Object[]{this, bVar});
        } else {
            this.mMultiRoomVideoControllerObserver = bVar;
        }
    }

    public void setGlobalContext(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55d7d35", new Object[]{this, eVar});
            return;
        }
        this.mGlobalContext = eVar;
        this.mFrameContext.a(eVar);
        if (eVar == null || !(eVar.f() instanceof ATaoLiveOpenEntity)) {
            return;
        }
        this.taoLiveOpenEntity = (ATaoLiveOpenEntity) eVar.f();
        this.mFrameContext.a(this.taoLiveOpenEntity);
    }

    public g getFrameContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("d682b5a2", new Object[]{this}) : this.mFrameContext;
    }

    public void init(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d258e321", new Object[]{this, context, view});
            return;
        }
        ac.a(TAG, "init");
        this.mContext = context;
        this.mFrameContext.a((ppa) new ppb());
        this.mFrameContext.f8395a = m.a();
        this.itemView = view;
        g gVar = this.mFrameContext;
        if (gVar != null) {
            this.frameContextUnique = gVar.G();
        }
        this.mFrameContext.b(curLiveScene());
        this.mRoomLayout = (ViewGroup) this.itemView.findViewById(R.id.taolive_room_layout);
        this.mRoomLayout.setClickable(true);
        addClickListnerForSimpleLiveRoom();
        View findViewById = view.findViewById(R.id.tab2_backgroud_view);
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (aTaoLiveOpenEntity != null && aTaoLiveOpenEntity.abilityCompontent != null && this.taoLiveOpenEntity.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopMask)) {
            if (findViewById.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).height += com.taobao.taolive.room.ui.a.g(this.mContext);
            }
            findViewById.setVisibility(0);
        }
        this.mComponentManager = new FrameManager(this.mContext);
        this.mPerfomenceTrackManager = new pkm(true);
        this.mPerfomenceTrackManager.n(curLiveScene());
        this.mPerfomenceTrackManager.a(this.mFrameContext);
        initVideo(context);
        this.seiDispatcher = f.j().createSEIDispatcher(this.mFrameContext);
        this.mAutoDownController = new com.taobao.taolive.room.controller2.a(this.mFrameContext, this.mContext);
        this.mFrameContext.a(this.mAutoDownController);
        ab.c("SingleRoomLifeCycle", "init " + this);
        initTopContainer();
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.ATYPE, false, this.mContext);
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.BTYPE, false, this.mContext);
        this.mMoreSwitchGuideTip = new ffv(this.mContext, this.mComponentManager, this.mFrameContext);
        ac.a();
    }

    private void addClickListnerForSimpleLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b24b533", new Object[]{this});
        } else {
            this.mRoomLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!ad.a(OpenSingleViewController.this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) || OpenSingleViewController.this.mFrameContext == null || OpenSingleViewController.this.mFrameContext.o() == null) {
                    } else {
                        q.b("TBLVOpenShopCardComponent", "click roomLayout");
                        OpenSingleViewController.this.mFrameContext.o().accessListener(AccessListenerEnum.onClickCleanScreen, false);
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
        if (r0.b(com.taobao.taolive.room.pre.a.PRE_CREATE_ROOM_REC + r7.mRecModel.initParams.get("livesource")) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindView(com.taobao.taolive.room.service.TBLiveRecEngineV2.RecModel r8) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.onBindView(com.taobao.taolive.room.service.TBLiveRecEngineV2$RecModel):void");
    }

    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        return recModel != null ? recModel.getViewItemId() : "";
    }

    private int getJumpType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59b4c378", new Object[]{this})).intValue();
        }
        if (isFirstEnter()) {
            return 1;
        }
        if (isNewIntent()) {
            return 3;
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        return (recModel == null || recModel.initParams == null || !ag.SOURCE_UPDOWNSWITCH.equals(this.mRecModel.initParams.get("livesource"))) ? 4 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    @Override // com.taobao.taolive.room.openarchitecture.single.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWillAppear() {
        /*
            Method dump skipped, instructions count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.onWillAppear():void");
    }

    public void aboutToDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1754a2", new Object[]{this});
            return;
        }
        ab.c("SingleRoomLifeCycle", "OpenSingleViewController aboutToDisappear");
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar == null) {
            return;
        }
        pkrVar.s();
    }

    public void interruptEndingState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15448e4e", new Object[]{this});
            return;
        }
        ab.c("SingleRoomLifeCycle", "OpenSingleViewController interruptEndingState");
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar == null) {
            return;
        }
        pkrVar.F();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        ac.a(TAG, "onWillDisappear");
        if (this.mIsDestroyed) {
            return;
        }
        if (aa.bs()) {
            if (this.mHasDisappear) {
                return;
            }
            this.mHasDisappear = true;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.e();
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.d();
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.c(gVar, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        com.taobao.taolive.room.controller2.a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.c();
        }
        this.mLiveDataModel = null;
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onWillDisappear();
        }
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.r(this.mTrackId);
        }
        if (aa.aX()) {
            destroy();
        } else {
            ppn.a().a(this.mFrameContext.j());
        }
        Log.e("SingleRoomLifeCycle", "onWillDisappear liveContextKey = " + this.mFrameContext.j() + this);
        ac.a();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onDidAppear() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        ac.a(TAG, "onDidAppear");
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            e eVar = this.mGlobalContext;
            if (eVar instanceof c) {
                pkmVar.a("lastWarmLiveID", String.valueOf(((c) eVar).C.f21820a));
                this.mPerfomenceTrackManager.a("lastSwitchIndex", String.valueOf(((c) this.mGlobalContext).C.b));
                this.mPerfomenceTrackManager.a("onWarmDidAppearTs", String.valueOf(((c) this.mGlobalContext).C.c));
                this.mPerfomenceTrackManager.a("onWarmDelayedTaskReachTs", String.valueOf(((c) this.mGlobalContext).C.d));
                this.mPerfomenceTrackManager.a("onRealTimeDataUpdateTs", String.valueOf(((c) this.mGlobalContext).C.e));
                this.mPerfomenceTrackManager.a("onWarmDisAppearTs", String.valueOf(((c) this.mGlobalContext).C.f));
                this.mPerfomenceTrackManager.a("onStartWarmTs", String.valueOf(((c) this.mGlobalContext).C.g));
                this.mPerfomenceTrackManager.a("onWarmSuccTs", String.valueOf(((c) this.mGlobalContext).C.h));
                ((c) this.mGlobalContext).C.a();
            }
        }
        if (aa.w() && (gVar = this.mFrameContext) != null && gVar.y() != null && this.mFrameContext.w() != null && this.mFrameContext.y().q() && !this.mFrameContext.y().o() && !this.mFrameContext.y().p() && this.mFrameContext.w().isFirst) {
            this.delayDidAppear = true;
            this.mFrameContext.y().c(true);
        }
        if (!this.delayDidAppear) {
            onRealDidAppear();
        }
        ac.a();
    }

    private void onDelayDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7980f7", new Object[]{this});
        } else if (!this.delayDidAppear) {
        } else {
            onRealDidAppear();
        }
    }

    private void onRealDidAppear() {
        TBLiveRecEngineV2.RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0b405e", new Object[]{this});
            return;
        }
        if (n.a() != null && this.mFrameContext != null && n.a().L()) {
            this.mFrameContext.c(true);
        }
        n.a(this.mFrameContext);
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.b();
        }
        long currentTimeMillis = System.currentTimeMillis();
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.a(currentTimeMillis);
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel2 = this.mRecModel;
        lVar.b(gVar, recModel2 != null ? recModel2.liveId : "null", hashCode(), this.mFrameContext.j());
        com.taobao.taolive.room.controller2.a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.b();
        }
        f.j().seiDispatcherInitialize(this.seiDispatcher);
        this.mDidAppear = true;
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.a(this.mFirstTime);
            this.mPerfomenceTrackManager.q(this.mTrackId);
        }
        com.taobao.taolive.sdk.playcontrol.b bVar = this.mMultiRoomVideoControllerObserver;
        if (bVar != null) {
            bVar.a(this.mFrameContext.A());
        }
        TBLiveRecEngineV2.RecModel recModel3 = this.mRecModel;
        if (recModel3 != null && recModel3.initParams != null) {
            ab.d(TAG, "onDidAppear | liveId=" + this.mRecModel.liveId);
            poz.a(this.mRecModel.initParams, n.b(this.mFrameContext));
            poz.L(this.mRecModel.initParams.get("livesource"), n.b(this.mFrameContext));
            poz.Z(this.mRecModel.initParams.get(aw.PARAM_LIVE_IS_AD), n.b(this.mFrameContext));
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel != null) {
            sendDetailResultNotify(tBLiveBizDataModel.mVideoInfo);
        }
        this.hasDidAppear = true;
        if (enableWarmMockHidePlayer()) {
            exectDidAppear();
        } else if (aa.aA() && (recModel = this.mRecModel) != null && !recModel.isFirst && this.mRoomLayout != null) {
            if (this.hasSurfaceRender && !this.hasExectDidAppear) {
                surfaceRenderRequest();
            } else {
                this.mRoomLayout.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            OpenSingleViewController.access$500(OpenSingleViewController.this);
                        }
                    }
                }, 1000L);
            }
        } else {
            exectDidAppear();
        }
        j.a(this.mFrameContext, this, new MessageTypeFilter() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1004 || i == 1006;
            }
        });
        ddw.a().a(this);
        pkm pkmVar2 = this.mPerfomenceTrackManager;
        if (pkmVar2 != null) {
            pkmVar2.b(this.mTrackId);
        }
        if (aa.ce()) {
            g gVar2 = this.mFrameContext;
            ap.a(gVar2, poy.ac(gVar2));
            pkm pkmVar3 = this.mPerfomenceTrackManager;
            if (pkmVar3 != null) {
                pkmVar3.a("kLiveRoomViewDidAppear", String.valueOf(currentTimeMillis));
                ai.a(this.mGlobalContext, this.mPerfomenceTrackManager);
                new HashMap().put("kLiveRoomViewDidAppear", String.valueOf(currentTimeMillis));
            }
        }
        Log.e("SingleRoomLifeCycle", "onDidAppear liveContextKey = " + this.mFrameContext.j() + this);
        poz.Y(ai.d(this.mFrameContext), n.b(n.a()));
        if (aa.dl()) {
            afterDidAppearAndGetVideoInfo();
        }
        initRecommendPop();
    }

    private void exectDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e60038", new Object[]{this});
        } else if (this.mComponentManager == null) {
        } else {
            q.b("JingChunLifecycle", "TaoLiveSingleRoomController onDidAppear liveId=" + this.mRecModel.liveId);
            this.mComponentManager.onDidAppear();
        }
    }

    private boolean enableWarmMockHidePlayer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad70f6c0", new Object[]{this})).booleanValue() : u.bb() == 3 || u.bb() == 2 || u.bb() == 4 || u.bb() == 5;
    }

    private void surfaceRenderRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf32e6f3", new Object[]{this});
            return;
        }
        this.hasSurfaceRender = true;
        if (this.hasExectDidAppear || !this.hasDidAppear) {
            return;
        }
        this.hasExectDidAppear = true;
        exectDidAppear();
        if (!com.taobao.taolive.sdk.utils.b.d(this.mContext)) {
            return;
        }
        Toast.makeText(this.mContext, "上下滑优化开启", 0).show();
    }

    private void sendDetailResultNotify(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70bc95c2", new Object[]{this, obj});
        } else if (this.taoLiveOpenEntity == null || obj == null) {
        } else {
            bindingOpenPlatformListener();
            this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onRecieveDetailResponse, obj);
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        ac.a(TAG, "onDidDisappear");
        m.b("TaoLiveSingleRoomController_onDidDisappear");
        volumeChangeHide();
        this.mDidAppear = false;
        if (this.mIsDestroyed) {
            return;
        }
        if (aa.bs()) {
            if (this.mHasDisappear) {
                return;
            }
            this.mHasDisappear = true;
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.e();
        }
        if (this.mDataProvider != null && aa.bp()) {
            this.mDataProvider.destroy();
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.f();
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.d(gVar, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        com.taobao.taolive.room.controller2.a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.d();
        }
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.r(this.mTrackId);
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d() && f.p().getBackwardX() != null) {
            f.p().getBackwardX().a(this.mLiveDataModel, n.b(this.mFrameContext));
        }
        this.mLiveDataModel = null;
        if (this.mComponentManager != null) {
            q.b("JingChunLifecycle", "TaoLiveSingleRoomController onDidDisappear liveId=" + this.mRecModel.liveId);
            this.mComponentManager.onDidDisappear();
        }
        showWidgets("close");
        destroy();
        g gVar2 = this.mFrameContext;
        if (gVar2 != null) {
            j.a((com.taobao.alilive.aliliveframework.frame.a) gVar2, false, gVar2.j());
            ded k = this.mFrameContext.k();
            if (k instanceof ezu) {
                ((ezu) k).c();
            }
        }
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
        Log.e("SingleRoomLifeCycle", "onDidDisappear liveContextKey = " + this.mFrameContext.j() + this);
        ac.a();
    }

    private void volumeChangeHide() {
        IUniversalProxy.d volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c6f653", new Object[]{this});
            return;
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel == null || tBLiveBizDataModel.mVideoInfo == null) {
            return;
        }
        if (f.o() != null && (volumeChangeUploadManager = f.o().getVolumeChangeUploadManager()) != null) {
            volumeChangeUploadManager.a(this.mLiveDataModel.mVideoInfo.liveId);
        }
        ab.b(TAG, "volumeChangeHide");
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ac.a(TAG, MessageID.onDestroy);
        onDestroy(false);
        ac.a();
    }

    public void onDestroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241196f2", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar != null) {
            j.a((com.taobao.alilive.aliliveframework.frame.a) gVar, false, gVar.j());
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.j();
        }
        pkr pkrVar2 = this.mVideoFrame;
        if (pkrVar2 != null) {
            pkrVar2.j();
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.i();
        }
        IRecommendPopProxy.a aVar = this.mRecommendPop;
        if (aVar != null) {
            aVar.a();
            this.mRecommendPop = null;
        }
        l lVar = this.mUpdownSwitchStateObserver;
        g gVar2 = this.mFrameContext;
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        lVar.e(gVar2, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.j());
        if (com.taobao.android.live.plugin.proxy.c.a().d() && f.p().getBackwardX() != null) {
            f.p().getBackwardX().a(this.mLiveDataModel, n.b(this.mFrameContext));
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel != null) {
            if (tBLiveBizDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null) {
                poz.l(this.mLiveDataModel.mVideoInfo.broadCaster.headImg, n.b(this.mFrameContext));
            } else if (this.mLiveDataModel.mFandomInfo != null && this.mLiveDataModel.mFandomInfo.broadCaster != null) {
                poz.l(this.mLiveDataModel.mFandomInfo.broadCaster.headImg, n.b(this.mFrameContext));
            } else {
                poz.l((String) null, n.b(this.mFrameContext));
            }
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onDestroy();
        }
        this.mRoomController = null;
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        destroy(z);
        volumeChangeHide();
        this.mLiveDataModel = null;
        this.mIsDestroyed = true;
        com.taobao.taolive.room.controller2.a aVar2 = this.mAutoDownController;
        if (aVar2 != null) {
            aVar2.e();
        }
        if (!aa.E() && pmd.a().B() != null && this.mFollowChangeListener != null) {
            pmd.a().B().b(this.mFollowChangeListener);
            this.mFollowChangeListener = null;
        }
        Log.e("SingleRoomLifeCycle", "onDestroy liveContextKey = " + this.mFrameContext.j() + this);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ac.a(TAG, "onPause");
        if (this.mIsDestroyed) {
            return;
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onPause();
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.h();
        }
        ac.a();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ac.a(TAG, "onResume");
        if (this.mIsDestroyed) {
            return;
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        if (recModel != null && recModel.initParams != null && this.mRecModel.initParams.get("livesource") != null) {
            poz.L(this.mRecModel.initParams.get("livesource"), n.b(this.mFrameContext));
            poz.Z(this.mRecModel.initParams.get(aw.PARAM_LIVE_IS_AD), n.b(this.mFrameContext));
        }
        m.b("TaoLiveSingleRoomController_onResume");
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onResume();
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.g();
        }
        ac.a();
    }

    public void onStart() {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ac.a(TAG, "onStart");
        if (this.mIsDestroyed) {
            return;
        }
        m.b("TaoLiveSingleRoomController_onStart");
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.g();
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.f();
        }
        if (aa.aH() && (baseFrame = this.mComponentManager) != null) {
            baseFrame.onStart();
        }
        ac.a();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6555dba", new Object[]{this});
            return;
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar == null) {
            return;
        }
        pkrVar.k();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void reportRequest() {
        pkr pkrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841661c2", new Object[]{this});
        } else if (this.mContext == null || this.mLiveDataModel == null || (pkrVar = this.mVideoFrame) == null || pkrVar.a() == null || this.mVideoFrame.a().l() == null) {
        } else {
            hfk.a(this.mContext, this.mLiveDataModel, this.mVideoFrame.a().l(), false);
        }
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        BaseFrame baseFrame = this.mRoomController;
        if (baseFrame != null && (baseFrame instanceof TaoLiveNormalRoomController)) {
            return ((TaoLiveNormalRoomController) baseFrame).getUbeeContainer();
        }
        BaseFrame baseFrame2 = this.mRoomController;
        if (baseFrame2 != null && (baseFrame2 instanceof TaoliveHighlightController)) {
            return ((TaoliveHighlightController) baseFrame2).getUbeeContainer();
        }
        return null;
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public Map<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        g gVar = this.mFrameContext;
        if (gVar != null) {
            return gVar.k;
        }
        return new HashMap();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void updateUserTrackData(Map<String, String> map) {
        TBLiveRecEngineV2.RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829410bd", new Object[]{this, map});
        } else if (map == null) {
        } else {
            String str = map.get("spm-url");
            if (!StringUtils.isEmpty(str) && (recModel = this.mRecModel) != null && recModel.initParams != null && this.mFrameContext != null) {
                this.mRecModel.initParams.put("spm", str);
                poz.a(str, n.b(this.mFrameContext));
            }
            String str2 = map.get("entrySpm");
            if (!StringUtils.isEmpty(str2)) {
                poz.s(str2, n.b(this.mFrameContext));
            }
            String d = ai.d(n.a());
            poz.Y(d, n.b(n.a()));
            if (!aa.Z()) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("spm-url", str);
            hashMap.put("entrySpm", str2);
            hashMap.put("spm-cnt", d);
            ai.a((Object) this.mFrameContext, (Map<String, String>) hashMap);
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        ac.a(TAG, MessageID.onStop);
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.h();
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onStop();
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.a(z);
        }
        ac.a();
    }

    private void bindingOpenPlatformListener() {
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b9c5d", new Object[]{this});
        } else if (!this.mDidAppear || (aTaoLiveOpenEntity = this.taoLiveOpenEntity) == null || aTaoLiveOpenEntity.eventCompontent == null || this.taoLiveOpenEntity.eventCompontent.b() == null || this.taoLiveOpenEntity.eventCompontent.b().o() == null) {
        } else {
            this.taoLiveOpenEntity.eventCompontent.b().a(new pkb(this));
            this.taoLiveOpenEntity.eventCompontent.b().a(new pka(this));
            this.taoLiveOpenEntity.eventCompontent.b().a(new pjz(this));
        }
    }

    public String curLiveScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca9f8259", new Object[]{this});
        }
        g gVar = this.mFrameContext;
        return (gVar == null || gVar.P() == null) ? "fullLive" : this.mFrameContext.P().e();
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            destroy(false);
        }
    }

    private void destroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecf0b73", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRequestLiveId = null;
        this.mRequestAccountId = null;
        this.delayDidAppear = false;
        this.hasSurfaceUpdate = false;
        this.isFromBackground = false;
        ap.f = false;
        resetMoreTip();
        f.j().seiDispatcherQuit(this.seiDispatcher);
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            g gVar = this.mFrameContext;
            if (gVar != null) {
                pkmVar.a("liveToken", gVar.j());
            }
            this.mPerfomenceTrackManager.a("switchIndex", String.valueOf(poy.ai(this.mFrameContext)));
            this.mPerfomenceTrackManager.a("entryLiveSource", poy.R(this.mFrameContext));
            this.mPerfomenceTrackManager.m(this.mTrackId);
            this.mPerfomenceTrackManager.c();
        }
        ddw.a().b(this);
        ddw.a().b(this.mEnterEndEventObserver);
        pmd.a().u().b(this);
        if (this.highlightPreloadTimeMove != null) {
            this.highlightPreloadTimeMove = null;
        }
        IRecommendPopProxy.a aVar = this.mRecommendPop;
        if (aVar != null) {
            aVar.a();
            this.mRecommendPop = null;
        }
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.g();
        }
        if (aa.cl()) {
            poz.U(null, n.b(this.mFrameContext));
        }
        ppn.a().a(this.mFrameContext.j());
        IGoodProxy m = f.m();
        g gVar2 = this.mFrameContext;
        m.destroy(gVar2 == null ? null : gVar2.c());
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, z);
        if (aa.E() && pmd.a().B() != null && this.mFollowChangeListener != null) {
            pmd.a().B().b(this.mFollowChangeListener);
            this.mFollowChangeListener = null;
        }
        if (!y.a()) {
            return;
        }
        if (!y.b(this.mContext) && !y.c(this.mContext)) {
            return;
        }
        y.b(this);
    }

    private void getLiveDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efe2f5a", new Object[]{this});
        } else {
            getLiveDetail(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0474, code lost:
        if (r2.b(com.taobao.taolive.room.pre.a.PRE_CREATE_ROOM_REC + r17.mRecModel.initParams.get("livesource")) == false) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getLiveDetail(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.getLiveDetail(java.lang.String):void");
    }

    public /* synthetic */ void lambda$getLiveDetail$0$OpenSingleViewController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2874c9", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.pre.a a2 = com.taobao.taolive.room.pre.a.a();
        a2.a(com.taobao.taolive.room.pre.a.PRE_CREATE_ROOM_REC + this.mRecModel.initParams.get("livesource"), this, this);
    }

    private void transParamsAddLiveSourcePre(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e5d4a0", new Object[]{this, jSONObject});
        } else if (!aa.cS()) {
        } else {
            if (jSONObject.getJSONObject("tppParam") == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("entryLiveSourcePre", (Object) poy.Q(this.mFrameContext));
                jSONObject.put("tppParam", (Object) jSONObject2);
                return;
            }
            jSONObject.getJSONObject("tppParam").put("entryLiveSourcePre", (Object) poy.Q(this.mFrameContext));
        }
    }

    @Override // com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.b
    public void onGetHeaderFields(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd45ac1", new Object[]{this, map});
        } else {
            com.taobao.taolive.sdk.utils.a.a(map, this.mContext);
        }
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i != 1004) {
            if (i != 1006) {
                return;
            }
            pib pibVar = this.mMediaStatusController;
            if (pibVar != null) {
                pibVar.e();
            }
            com.taobao.taolive.room.controller2.a aVar = this.mAutoDownController;
            if (aVar != null) {
                aVar.g();
            }
            ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
            if (aTaoLiveOpenEntity == null) {
                return;
            }
            aTaoLiveOpenEntity.accessListener(AccessListenerEnum.liveRoomUserLeave, new Object[0]);
        } else {
            TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
            if (tBLiveBizDataModel != null && tBLiveBizDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.isOfficialType()) {
                Context context = this.mContext;
                s.a(context, plz.a(this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId) + "&livesource=guanfangtai&forceRefresh=true");
                return;
            }
            BaseFrame baseFrame = this.mComponentManager;
            if (baseFrame != null) {
                baseFrame.onVideoStatusChanged(5);
            }
            pib pibVar2 = this.mMediaStatusController;
            if (pibVar2 != null) {
                pibVar2.e();
            }
            com.taobao.taolive.room.controller2.a aVar2 = this.mAutoDownController;
            if (aVar2 != null) {
                aVar2.h();
            }
            ATaoLiveOpenEntity aTaoLiveOpenEntity2 = this.taoLiveOpenEntity;
            if (aTaoLiveOpenEntity2 == null) {
                return;
            }
            aTaoLiveOpenEntity2.accessListener(AccessListenerEnum.liveRoomEnd, new Object[0]);
        }
    }

    private void showError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        if (aa.dp() && this.taoLiveOpenEntity != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.taoLiveOpenEntity.bizCode)) {
            if (this.mErrorView == null) {
                ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.taolive_status_error_stub);
                viewStub.setLayoutResource(R.layout.taolive_status_error_new_layout);
                this.mErrorView = viewStub.inflate();
            }
            View view = this.mErrorView;
            if (view != null) {
                TBErrorViewWidget tBErrorViewWidget = (TBErrorViewWidget) view.findViewById(R.id.error_view_widget);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tBErrorViewWidget.getLayoutParams();
                Context context = this.mContext;
                if (context instanceof Activity) {
                    layoutParams.width = TBErrorViewWidget.getSuggestedWidth((Activity) context);
                }
                if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(this.taoLiveOpenEntity.bizCode)) {
                    layoutParams.bottomMargin = com.taobao.taolive.room.utils.d.a(this.mContext, 56.0f);
                }
                tBErrorViewWidget.setLayoutParams(layoutParams);
                tBErrorViewWidget.setTopic(H5EmbedView.VIEW_TYPE);
                tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_NETWORK_ERROR);
                tBErrorViewWidget.setRefreshButton(new View.OnClickListener() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            OpenSingleViewController.access$600(OpenSingleViewController.this);
                        }
                    }
                });
                this.mErrorView.setVisibility(0);
            }
        } else {
            if (this.mErrorView == null) {
                ViewStub viewStub2 = (ViewStub) this.itemView.findViewById(R.id.taolive_status_error_stub);
                viewStub2.setLayoutResource(R.layout.taolive_status_error_layout);
                this.mErrorView = viewStub2.inflate();
            }
            View view2 = this.mErrorView;
            if (view2 != null) {
                ((TextView) view2.findViewById(R.id.taolive_error_title)).setText(R.string.taolive_status_error_hang);
                this.mErrorView.findViewById(R.id.taolive_error_button).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                        } else {
                            OpenSingleViewController.access$400(OpenSingleViewController.this);
                        }
                    }
                });
                this.mErrorView.setVisibility(0);
            }
        }
        ddw.a().a("com.taobao.taolive.room.show_error", null, this.frameContextUnique);
    }

    private void hideError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226b1f6d", new Object[]{this});
            return;
        }
        View view = this.mErrorView;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void showWidgets(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b199de03", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            ViewGroup viewGroup = this.mRoomLayout;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
        } else {
            g gVar = this.mFrameContext;
            if ((gVar == null || gVar.P() == null) ? false : this.mFrameContext.P().a()) {
                g gVar2 = this.mFrameContext;
                if (gVar2 != null && gVar2.Q() != null) {
                    this.mFrameContext.Q().b(str);
                }
            } else if ("close".equals(str)) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    View findViewById = ((Activity) context).findViewById(R.id.taolive_close_btn);
                    View findViewById2 = this.mRoomLayout.findViewById(R.id.taolive_close_backup_btn);
                    if (findViewById == null) {
                        return;
                    }
                    if (pmd.a().a("closeBtn") && !poy.as(this.mFrameContext)) {
                        findViewById.setVisibility(0);
                        if (findViewById2 == null) {
                            return;
                        }
                        findViewById2.setVisibility(8);
                        return;
                    }
                    findViewById.setVisibility(8);
                    return;
                }
            }
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.show();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName == null) {
                return;
            }
            viewByName.setVisibility(0);
        }
    }

    public void hideWidgets(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df605dde", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            ViewGroup viewGroup = this.mRoomLayout;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
        } else {
            g gVar = this.mFrameContext;
            boolean a2 = (gVar == null || gVar.P() == null) ? false : this.mFrameContext.P().a();
            if ("close".equals(str) && (this.mContext instanceof Activity)) {
                if (!a2) {
                    if (pmd.a().a("closeBtn") && !poy.as(this.mFrameContext)) {
                        View findViewById = ((Activity) this.mContext).findViewById(R.id.taolive_close_btn);
                        View findViewById2 = this.mRoomLayout.findViewById(R.id.taolive_close_backup_btn);
                        if (findViewById == null) {
                            return;
                        }
                        findViewById.setVisibility(4);
                        if (findViewById2 == null) {
                            return;
                        }
                        findViewById2.setVisibility(0);
                        findViewById2.setBackgroundResource(R.drawable.taolive_room_close_btn_background_small);
                        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                        int y = poz.y(n.b(this.mFrameContext));
                        if (layoutParams != null) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.taobao.taolive.room.utils.d.a(this.mContext, 14.0f) + y;
                            findViewById2.setLayoutParams(layoutParams);
                        }
                        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                } else {
                                    ddw.a().a("com.taobao.taolive.room.killself", null, OpenSingleViewController.this.frameContextUnique);
                                }
                            }
                        });
                        final View findViewById3 = findViewById2.findViewById(R.id.taolive_room_top_more_btn);
                        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.9
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                } else {
                                    ddw.a().a("com.taobao.taolive.room.more_btn_click", findViewById3, OpenSingleViewController.this.frameContextUnique);
                                }
                            }
                        });
                        return;
                    }
                } else {
                    g gVar2 = this.mFrameContext;
                    if (gVar2 != null && gVar2.Q() != null) {
                        this.mFrameContext.Q().c(str);
                    }
                }
            }
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.hide();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName == null) {
                return;
            }
            viewByName.setVisibility(4);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        pkr pkrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_MEDIAPLATFORM_HIDE_WIDGETS.equals(str)) {
            hideWidgets((String) obj);
        } else if (xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS.equals(str)) {
            showWidgets((String) obj);
        } else if ("com.taobao.taolive.room.addcart_for_showcase".equals(str)) {
            if (!(obj instanceof LiveItem)) {
                return;
            }
            LiveItem liveItem = (LiveItem) obj;
            HashMap hashMap = new HashMap();
            if (liveItem.extraUTParams != null) {
                hashMap.putAll(liveItem.extraUTParams);
            }
            hashMap.put("channel", ITemplateSyncService.LAYOUT_STYLE_BUBBLE);
            hashMap.put("laiyuan", "1");
            if (liveItem.extendVal != null) {
                hashMap.put("itemBizType", liveItem.extendVal.itemBizType);
            }
            com.taobao.taolive.room.utils.c.a((Activity) this.mContext, 10000, liveItem, hashMap);
        } else if (FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN.equals(str)) {
            showWidgets("close");
        } else if ("com.taobao.taolive.room.enable_updown_switch".equals(str)) {
            if (!aa.cm() || this.mFrameContext.o() == null) {
                return;
            }
            this.mFrameContext.o().accessListener(AccessListenerEnum.onVerticalScrollEnable, new Object[0]);
        } else if ("com.taobao.taolive.room.disable_updown_switch".equals(str)) {
            if (!aa.cm() || this.mFrameContext.o() == null) {
                return;
            }
            this.mFrameContext.o().accessListener(AccessListenerEnum.onVerticalScrollDisable, new Object[0]);
        } else if (FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH.equals(str)) {
            if (!aa.cz() || this.mFrameContext.o() == null) {
                return;
            }
            this.mFrameContext.o().accessListener(AccessListenerEnum.onHorizontalScrollEnable, new Object[0]);
        } else if (FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH.equals(str)) {
            if (!aa.cz() || this.mFrameContext.o() == null) {
                return;
            }
            this.mFrameContext.o().accessListener(AccessListenerEnum.onHorizontalScrollDisable, new Object[0]);
        } else if (VideoFrame.EVENT_ACTION_SHOW_SWITCH_TIP.equals(str)) {
            showMoreTip();
        } else if (xkw.c.equals(str)) {
            int i = (int) ((this.mContext.getResources().getDisplayMetrics().widthPixels / 750.0f) * 204.0f);
            pkr pkrVar2 = this.mVideoFrame;
            if (pkrVar2 == null || pkrVar2.m() == null) {
                return;
            }
            View contentView = this.mVideoFrame.m().getContentView();
            if (Build.VERSION.SDK_INT >= 21 && contentView != null) {
                contentView.setClipToOutline(true);
                contentView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                        } else {
                            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 12.0f);
                        }
                    }
                });
            }
            this.itemView.setBackgroundColor(-16777216);
            this.mVideoFrame.m().videoMoveAnim(-i, 300L);
        } else if (!xkw.d.equals(str) || !(obj instanceof String) || ((String) obj).equals("videoViewUp") || (pkrVar = this.mVideoFrame) == null || pkrVar.m() == null) {
        } else {
            View contentView2 = this.mVideoFrame.m().getContentView();
            if (Build.VERSION.SDK_INT >= 21 && contentView2 != null) {
                contentView2.setClipToOutline(true);
                contentView2.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                        } else {
                            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0.0f);
                        }
                    }
                });
            }
            this.mVideoFrame.m().videoMoveAnim(0.0f, 300L);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, xkw.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, "com.taobao.taolive.room.addcart_for_showcase", FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, "taolive.more.live.status", "com.taobao.taolive.room.enable_updown_switch", "com.taobao.taolive.room.disable_updown_switch", FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, VideoFrame.EVENT_ACTION_SHOW_SWITCH_TIP, "com.taobao.taolive.room.ent.opt.animation.end", xkw.c, xkw.d};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        g gVar = this.mFrameContext;
        if (gVar != null) {
            return gVar.G();
        }
        return null;
    }

    private void updateBackward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c94e53", new Object[]{this});
            return;
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d() && f.p().getBackwardX() != null) {
            f.p().getBackwardX().a(this.mLiveDataModel, n.b(this.mFrameContext), this.mFrameContext);
        }
        poz.a(v.e(this.mLiveDataModel.mInitParams.get(aw.PARAM_BACKWARD_SWITCH)), n.b(this.mFrameContext));
        if (poy.i(this.mFrameContext)) {
            String O = poy.O(this.mFrameContext);
            String k = poy.k(this.mFrameContext);
            if (!StringUtils.isEmpty(k)) {
                O = k;
            }
            poz.m(O, n.b(this.mFrameContext));
        } else {
            poz.l((String) null, n.b(this.mFrameContext));
            poz.m((String) null, n.b(this.mFrameContext));
        }
        poz.n(this.mLiveDataModel.mInitParams.get(aw.PARAM_INTENT_URL), n.b(this.mFrameContext));
    }

    private void uploadFirstFramePoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df234e39", new Object[]{this});
            return;
        }
        String p = poz.p(n.b(this.mFrameContext));
        if (!u.aD() || StringUtils.equals(ag.SOURCE_UPDOWNSWITCH, p)) {
            return;
        }
        com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T1);
        ab.e("LIVE_CODE_BOOT_STAGE", "stage:t1");
    }

    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame == null) {
            return;
        }
        baseFrame.onScrollStateChanged(i);
    }

    private pmx createFollowChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pmx) ipChange.ipc$dispatch("3f1bfb13", new Object[]{this}) : new pmx() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmx
            public void onFollowChange(pmw pmwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a82c75dd", new Object[]{this, pmwVar});
                } else if (pmwVar == null || OpenSingleViewController.access$700(OpenSingleViewController.this) == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("accountId", pmwVar.f32765a);
                    hashMap.put("accountType", null);
                    hashMap.put("followSource", null);
                    if (!pmwVar.b) {
                        OpenSingleViewController.access$700(OpenSingleViewController.this).accessListener(AccessListenerEnum.onUnfollowAciton, hashMap);
                        return;
                    }
                    OpenSingleViewController.access$700(OpenSingleViewController.this).accessListener(AccessListenerEnum.onFollowAction, hashMap);
                    if (StringUtils.isEmpty(pmwVar.f32765a) || OpenSingleViewController.this.mLiveDataModel == null || OpenSingleViewController.this.mLiveDataModel.mVideoInfo == null || OpenSingleViewController.this.mLiveDataModel.mVideoInfo.broadCaster == null || !pmwVar.f32765a.equals(OpenSingleViewController.this.mLiveDataModel.mVideoInfo.broadCaster.accountId) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.name().equals(OpenSingleViewController.access$700(OpenSingleViewController.this).bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.name().equals(OpenSingleViewController.access$700(OpenSingleViewController.this).bizCode)) {
                        return;
                    }
                    plw.a(OpenSingleViewController.this.mLiveDataModel, OpenSingleViewController.this.mFrameContext, "follow");
                }
            }
        };
    }

    @Override // tb.ppq.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        boolean z;
        TBLiveBizDataModel tBLiveBizDataModel;
        e eVar;
        pkn e;
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            return;
        }
        if (videoInfo != null) {
            Log.e("SingleRoomLifeCycle", "onGetVideoInfoSuccess " + videoInfo.liveId + " mRequestLiveId = " + this.mRequestLiveId + " mRequestAccountId = " + this.mRequestAccountId + this);
        }
        if (this.mIsDestroyed || videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        boolean e2 = v.e(this.mRecModel.initParams.get(aw.PARAM_NEED_RECOMMEND));
        if (Boolean.parseBoolean(this.mRecModel.initParams.get(aw.SHOULD_USE_PRE_CREATE_REC))) {
            com.taobao.taolive.room.pre.a a2 = com.taobao.taolive.room.pre.a.a();
            a2.a(com.taobao.taolive.room.pre.a.PRE_CREATE_ROOM_REC + this.mRecModel.initParams.get("livesource"));
        }
        boolean z2 = videoInfo.roomType == 13 || poy.b(videoInfo, this.mFrameContext);
        if (!e2 && !z2 && !checkLiveId(videoInfo) && !checkTopic(videoInfo) && !checkAccountId(videoInfo)) {
            return;
        }
        String str2 = null;
        this.mRequestLiveId = null;
        this.mRequestAccountId = null;
        Log.e("SingleRoomLifeCycle", "onGetVideoInfoSuccess checkLiveId = true" + videoInfo.liveId + this);
        if (u.aW() && (gVar = this.mFrameContext) != null) {
            gVar.a((dds) new com.taobao.taolive.room.business.mess.e());
        }
        this.mFrameContext.a(videoInfo);
        if (this.mDidAppear) {
            sendDetailResultNotify(videoInfo);
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.a(videoInfo);
        }
        checkLiveDetailError(videoInfo, e2);
        m.a(this.mFrameContext, videoInfo.roomStatus);
        com.taobao.taolive.movehighlight.utils.f.a().d(System.currentTimeMillis());
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null && pkmVar.a() != null && (e = pko.a().e(this.mPerfomenceTrackManager.a())) != null) {
            e.d = String.valueOf(videoInfo.status);
        }
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.a(videoInfo.status == 0);
        }
        if (poy.b(this.mFrameContext)) {
            poy.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, false);
            poy.a(this.mFrameContext, videoInfo.liveId);
        }
        updateDisPatchTrackInfo(videoInfo.disPatchTrackInfo);
        if (StringUtils.isEmpty(this.mRecModel.liveId)) {
            this.mRecModel.liveId = videoInfo.liveId;
            if (aa.cO() && this.mRecModel.initParams != null && this.mPerfomenceTrackManager != null && this.mVideoFrame != null) {
                this.mTrackId = videoInfo.liveId;
                this.mPerfomenceTrackManager.a(videoInfo.liveId, this.mRecModel.initParams.get("livesource"), null, null);
                this.mVideoFrame.a(this.mPerfomenceTrackManager, videoInfo.liveId);
            }
        }
        if (StringUtils.isEmpty(this.mRecModel.accountId)) {
            this.mRecModel.accountId = videoInfo.broadCaster.accountId;
        }
        if (StringUtils.isEmpty(this.mRecModel.actionUrl)) {
            this.mRecModel.actionUrl = com.taobao.taolive.room.utils.c.d(videoInfo.nativeFeedDetailUrl, ag.SOURCE_UPDOWNSWITCH);
            String O = poy.O(this.mFrameContext);
            if (!StringUtils.isEmpty(O)) {
                String queryParameter = Uri.parse(O).getQueryParameter("liveAdParams");
                if (!StringUtils.isEmpty(queryParameter)) {
                    TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
                    recModel.actionUrl = this.mRecModel.actionUrl + "&liveAdParams=" + Uri.encode(queryParameter);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (this.mRecModel.liveUrlList == null) {
            this.mRecModel.liveUrlList = videoInfo.liveUrlList;
            this.mRecModel.h265 = videoInfo.h265;
            this.mRecModel.rateAdapte = videoInfo.rateAdapte;
            this.mRecModel.edgePcdn = videoInfo.edgePcdn;
            this.mRecModel.mediaConfig = videoInfo.mediaConfig;
        }
        if (this.mRecModel.isFirst && videoInfo.status != 0 && videoInfo.status != 3) {
            this.mRecModel.supportPreLoad = 0;
        }
        g gVar2 = this.mFrameContext;
        if (gVar2 != null && gVar2.o() != null && this.mFrameContext.o().abilityCompontent != null && this.mFrameContext.o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Hide_Half_Detail) && videoInfo.itemConfigInfo != null) {
            videoInfo.itemConfigInfo.put("insideDetail", (Object) false);
        }
        if (poy.af(this.mFrameContext) && aa.cC() && videoInfo.itemConfigInfo != null) {
            videoInfo.itemConfigInfo.put("insideDetail", (Object) false);
        }
        this.mLiveDataModel = new TBLiveBizDataModel();
        this.mLiveDataModel.mViewItemId = this.mRecModel.getViewItemId();
        TBLiveBizDataModel tBLiveBizDataModel2 = this.mLiveDataModel;
        tBLiveBizDataModel2.mVideoInfo = videoInfo;
        try {
            tBLiveBizDataModel2.mVideoInfo.originalData = JSONObject.parseObject(str);
        } catch (Exception unused) {
        }
        TBLiveBizDataModel tBLiveBizDataModel3 = this.mLiveDataModel;
        tBLiveBizDataModel3.mFandomInfo = null;
        tBLiveBizDataModel3.mRoomInfo = new ChatRoomInfo();
        this.mLiveDataModel.mRoomInfo.roomId = videoInfo.topic;
        TBLiveBizDataModel tBLiveBizDataModel4 = this.mLiveDataModel;
        tBLiveBizDataModel4.mRawData = str;
        tBLiveBizDataModel4.mInitParams = new HashMap();
        this.mLiveDataModel.mInitParams.putAll(this.mRecModel.initParams);
        this.mLiveDataModel.mActionUrl = this.mRecModel.actionUrl;
        this.mLiveDataModel.perfomenceTrackManager = this.mPerfomenceTrackManager;
        poz.u(this.mRecModel.isFirst, n.b(this.mFrameContext));
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.a(videoInfo, this.mLiveDataModel);
        }
        if (!aa.dl() && (eVar = this.mGlobalContext) != null && eVar.F != null && this.mGlobalContext.F.f() && this.mLiveDataModel != null) {
            this.mGlobalContext.F.a(this.mLiveDataModel);
        }
        this.mFrameContext.a(this.mRecModel.initParams);
        if (aa.dl()) {
            afterDidAppearAndGetVideoInfo();
        } else if (tki.a() && (tBLiveBizDataModel = this.mLiveDataModel) != null) {
            com.taobao.taolive.room.controller2.b.a(this.mContext, this.mFrameContext, tBLiveBizDataModel);
        }
        g gVar3 = this.mFrameContext;
        if (gVar3 != null && gVar3.y() != null) {
            g gVar4 = this.mFrameContext;
            gVar4.z = gVar4.y().r;
        }
        pqi.a().b("liveDetail", str);
        updateBackward();
        hideError();
        boolean e3 = v.e(this.mLiveDataModel.mInitParams.get(aw.PARAM_SHOW_ANIMATED));
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null && e3) {
            viewGroup.setAlpha(0.0f);
        }
        initRec(videoInfo);
        if (videoInfo.isOfficialLive()) {
            ddw.a().a("com.taobao.taolive.room.updownswitch.official.dedup", videoInfo);
        }
        String str3 = this.mRecModel.initParams.get(aw.PARAM_TRANSPARENT_PARAMS);
        pfa a3 = pfa.a(this.mFrameContext);
        a3.a(new phu());
        pfa.a().a(new phu());
        if (a3.b() != null) {
            a3.b().a(str3);
        }
        initKandianUTParams();
        poy.f(false, (com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext);
        poy.a(0, this.mFrameContext);
        pfb.a(this.mFrameContext).a(new pff());
        pfb.a().a(new pff());
        com.taobao.taolive.movehighlight.bean.a a4 = com.taobao.taolive.movehighlight.utils.l.a(this.mLiveDataModel.mVideoInfo, this.mLiveDataModel.mInitParams.get(aw.PARAM_SJSD_ITEM_ID), this.mLiveDataModel.mInitParams.get(aw.PARAM_TIMEMOVE_KEYPOINTID));
        if (videoInfo.status == 1 && StringUtils.isEmpty(videoInfo.replayUrl) && ((videoInfo.trialBroadcast == null || !videoInfo.trialBroadcast.booleanValue()) && a4 == null)) {
            if (this.taoLiveOpenEntity != null && TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(this.taoLiveOpenEntity.bizCode)) {
                if (this.mRecModel.isFirst) {
                    forceRefresh();
                    return;
                } else if (poy.W(this.mFrameContext) == 1) {
                    ddw a5 = ddw.a();
                    String str4 = videoInfo.liveId;
                    g gVar5 = this.mFrameContext;
                    if (gVar5 != null) {
                        str2 = gVar5.G();
                    }
                    a5.a("com.taobao.taolive.room.auto_up", str4, str2);
                    return;
                } else {
                    ddw a6 = ddw.a();
                    String str5 = videoInfo.liveId;
                    g gVar6 = this.mFrameContext;
                    if (gVar6 != null) {
                        str2 = gVar6.G();
                    }
                    a6.a(VideoFrameErrorController.EVENT_AUTO_DOWN, str5, str2);
                    return;
                }
            } else if (StringUtils.isEmpty(videoInfo.broadCaster.accountInfoUrl)) {
                return;
            } else {
                pmd.a().r().a(this.mContext, videoInfo.broadCaster.accountInfoUrl, null);
                ddw.a().a("com.taobao.taolive.room.killself", null, this.frameContextUnique);
                return;
            }
        }
        if (a4 != null || "true".equals(this.mLiveDataModel.mInitParams.get("highlightSignByRePlay"))) {
            ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
            if (aTaoLiveOpenEntity != null && aTaoLiveOpenEntity.abilityCompontent != null && this.taoLiveOpenEntity.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideHiglightLive)) {
                return;
            }
            setPlayReportFeedType("timeshift");
            if (aa.cL() && z && !this.mRecModel.actionUrl.contains(aw.PARAM_SJSD_ITEM_ID) && videoInfo.timeMovingPlayInfo != null) {
                this.mRecModel.initParams.put(aw.PARAM_SJSD_ITEM_ID, videoInfo.timeMovingPlayInfo.sjsdItemId);
                this.mRecModel.initParams.put(aw.PARAM_PRODUCT_TYPE, RecModel.MEDIA_TYPE_TIMEMOVE);
                TBLiveRecEngineV2.RecModel recModel2 = this.mRecModel;
                recModel2.actionUrl = com.taobao.taolive.room.utils.c.a(recModel2.actionUrl, aw.PARAM_SJSD_ITEM_ID, videoInfo.timeMovingPlayInfo.sjsdItemId);
                TBLiveRecEngineV2.RecModel recModel3 = this.mRecModel;
                recModel3.actionUrl = com.taobao.taolive.room.utils.c.a(recModel3.actionUrl, aw.PARAM_PRODUCT_TYPE, RecModel.MEDIA_TYPE_TIMEMOVE);
                this.mLiveDataModel.mActionUrl = this.mRecModel.actionUrl;
            }
            showKandian(videoInfo, a4);
        } else {
            com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
            BaseFrame baseFrame = this.mRoomController;
            if (baseFrame != null && !(baseFrame instanceof OpenNormalRoomController)) {
                this.mComponentManager.deleteComponent(baseFrame);
                this.mRoomController.onDestroy();
                this.mRoomController = null;
            }
            poy.f(false, (com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext);
            this.mComponentManager.onBindData(this.mLiveDataModel);
            q.b("JingChunLifecycle", "TaoLiveSingleRoomController onBindData liveId=" + this.mRecModel.liveId);
            if (this.mRoomController == null) {
                this.mRoomController = new OpenNormalRoomController(this.mContext, videoInfo.landScape, this.mLiveDataModel, this.itemView, this.mVideoFrame, this.mFrameContext);
                ((OpenNormalRoomController) this.mRoomController).setVideoCallback(this.mVideoFrame);
                this.mComponentManager.addComponent(this.mRoomController);
            }
            g gVar7 = this.mFrameContext;
            if (gVar7 != null && (gVar7.y() instanceof c)) {
                if (RecModel.MEDIA_TYPE_TIMEMOVE.equals(((c) this.mFrameContext.y()).f)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("direction", "live");
                    ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "jiangjie_slide", (Map<String, String>) hashMap);
                }
                ((c) this.mFrameContext.y()).f = "live";
            }
        }
        com.taobao.taolive.movehighlight.utils.d.f21479a = false;
        ViewGroup viewGroup2 = this.mRoomLayout;
        if (viewGroup2 != null && e3) {
            ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
        if (this.mPerfomenceTrackManager != null && videoInfo.dynamicRender != null && videoInfo.dynamicRender.h5DynamicRenderVersion != null) {
            this.mPerfomenceTrackManager.d(videoInfo.dynamicRender.h5DynamicRenderVersion);
        }
        if ("fullLive".equals(curLiveScene()) || "shop2fLive".equals(curLiveScene())) {
            reportAboutMute(com.taobao.taolive.sdk.ui.media.mute.b.d(this.mContext));
        }
        if (aa.bS()) {
            f.q().jump302(this.mContext, this.mFrameContext.y(), this.mLiveDataModel);
        }
        initRecommendPop();
        if (this.taoLiveOpenEntity != null) {
            if (this.mFollowChangeListener == null) {
                this.mFollowChangeListener = createFollowChangeListener();
            }
            if (pmd.a().B() != null && this.mFollowChangeListener != null) {
                pmd.a().B().a(this.mFollowChangeListener);
            }
            if ("1".equals(videoInfo.roomStatus)) {
                this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onLive, new Object[0]);
            } else if ("2".equals(videoInfo.roomStatus)) {
                this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onReplay, new Object[0]);
            } else if ("0".equals(videoInfo.roomStatus)) {
                this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onPrelive, new Object[0]);
            }
            if ("1".equals(videoInfo.streamStatus)) {
                this.taoLiveOpenEntity.accessListener(AccessListenerEnum.streamPlay, new Object[0]);
            } else if ("0".equals(videoInfo.streamStatus)) {
                this.taoLiveOpenEntity.accessListener(AccessListenerEnum.streamPause, new Object[0]);
            }
        }
        if (StringUtils.isEmpty(videoInfo.toast)) {
            return;
        }
        plk.a(this.mContext, videoInfo.toast);
    }

    private void forceRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16dddf7", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uri", Uri.parse(TBLiveRecEngineV2.GUANG_REFRESH_URL));
        hashMap.put(aw.PARAM_FORCE_REFRESH, true);
        hashMap.put("needUT", true);
        this.taoLiveOpenEntity.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
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

    private void initRec(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dabe06", new Object[]{this, videoInfo});
            return;
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        if (recModel == null || !recModel.isFirst || !aa.X()) {
            z = false;
        }
        if (!z) {
            return;
        }
        ddw.a().a(FullScreenFrame.EVENT_TYPE_UPDOWNSWITCH_INIT, videoInfo);
    }

    private void initKandianUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c632be26", new Object[]{this});
            return;
        }
        poy.h(null, this.mFrameContext);
        poy.g(null, this.mFrameContext);
        poy.i(null, this.mFrameContext);
        com.taobao.taolive.movehighlight.utils.d.c = null;
    }

    @Override // tb.ppq.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
            return;
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (aTaoLiveOpenEntity != null && aTaoLiveOpenEntity.abilityCompontent != null) {
            if (this.taoLiveOpenEntity.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandom)) {
                return;
            }
            if (this.taoLiveOpenEntity.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom)) {
                forceRefresh();
                return;
            }
        }
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        com.taobao.taolive.room.pre.a.a().a(m.b() ? com.taobao.taolive.room.pre.a.ISAFCCOLDCONTEXT_KEY : this.mRequestLiveId);
        if (this.mIsDestroyed || fandomInfo == null || StringUtils.isEmpty(fandomInfo.bbQJumpH5) || !(this.mContext instanceof Activity) || (gVar = this.mFrameContext) == null) {
            return;
        }
        String c = poz.c(gVar.y());
        String str2 = null;
        if (!StringUtils.isEmpty(c)) {
            str2 = Uri.parse(c).getQuery();
        }
        String str3 = fandomInfo.bbQJumpH5;
        if (!StringUtils.isEmpty(str2)) {
            if (str3.contains("?")) {
                str3 = str3 + "&" + str2;
            } else {
                str3 = str3 + "?" + str2;
            }
        }
        s.a(this.mContext, str3);
        Context context = this.mContext;
        if (context instanceof BaseActivity) {
            ((BaseActivity) context).finish(true);
        } else {
            ((Activity) context).finish();
        }
    }

    private void afterDidAppearAndGetVideoInfo() {
        TBLiveBizDataModel tBLiveBizDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444fcc79", new Object[]{this});
        } else if (!this.mDidAppear || this.mLiveDataModel == null) {
        } else {
            e eVar = this.mGlobalContext;
            if (eVar != null && eVar.F != null && this.mGlobalContext.F.f() && this.mLiveDataModel != null) {
                this.mGlobalContext.F.a(this.mLiveDataModel);
            }
            if (!tki.a() || (tBLiveBizDataModel = this.mLiveDataModel) == null) {
                return;
            }
            com.taobao.taolive.room.controller2.b.a(this.mContext, this.mFrameContext, tBLiveBizDataModel);
        }
    }

    private void initRecommendPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73aab2c", new Object[]{this});
        } else if (aa.ap() && (!this.mDidAppear || this.mLiveDataModel == null || this.mRecommendPop != null)) {
        } else {
            if (ad.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
                q.b("TBLVOpenShopCardComponent", "禁用 dx 弹窗");
                return;
            }
            if (qne.b(poy.ac(this.mFrameContext), poy.R(this.mFrameContext)) && this.mLiveDataModel != null) {
                ViewGroup viewGroup = null;
                ViewGroup viewGroup2 = this.mRoomLayout;
                if (viewGroup2 != null) {
                    viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.taolive_open_popview_frame);
                }
                if (viewGroup == null) {
                    viewGroup = poz.b(this.mContext, n.b(this.mFrameContext));
                }
                IRecommendPopProxy r = f.r();
                Context context = this.mContext;
                g gVar = this.mFrameContext;
                this.mRecommendPop = r.createRecommendPop(context, viewGroup, gVar, this.mLiveDataModel, this.mComponentManager, new i(gVar));
            }
            if (this.mRecommendPop == null) {
                return;
            }
            Context context2 = this.mContext;
            this.mRecommendPop.a(String.valueOf(poy.ai(this.mFrameContext)), poy.K(this.mFrameContext), poy.T(this.mFrameContext), poy.ac(this.mFrameContext), poy.R(this.mFrameContext), ai.d(this.mFrameContext), (!(context2 instanceof Activity) || ((Activity) context2).getIntent() == null) ? "" : ((Activity) this.mContext).getIntent().getDataString());
            this.mRecommendPop.a(new pku());
            this.mRecommendPop.a(new com.taobao.taolive.room.mediaplatform.f(this.mFrameContext));
        }
    }

    private void updateDisPatchTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0295a7", new Object[]{this, str});
            return;
        }
        String str2 = null;
        g gVar = this.mFrameContext;
        if (gVar instanceof com.taobao.taolive.sdk.core.e) {
            str2 = gVar.y().aJ_().a().c();
        }
        if (aa.bh() && StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str)) {
            poz.b(str, n.b(this.mFrameContext));
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        if (recModel == null || recModel.initParams == null || !StringUtils.isEmpty(this.mRecModel.initParams.get("trackInfo")) || StringUtils.isEmpty(str)) {
            return;
        }
        this.mRecModel.initParams.put("trackInfo", str);
    }

    private boolean checkAccountId(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a2e5b6a", new Object[]{this, videoInfo})).booleanValue();
        }
        if (StringUtils.isEmpty(this.mRequestAccountId) || videoInfo.broadCaster == null) {
            return false;
        }
        return isOfficialType(videoInfo) ? this.mRequestAccountId.equals(videoInfo.officialLiveInfo.accountId) : this.mRequestAccountId.equals(videoInfo.broadCaster.accountId);
    }

    private boolean checkLiveId(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8be7c4bb", new Object[]{this, videoInfo})).booleanValue();
        }
        if (StringUtils.isEmpty(this.mRequestLiveId) || videoInfo == null) {
            return false;
        }
        return isOfficialType(videoInfo) ? this.mRequestLiveId.equals(videoInfo.officialLiveInfo.officialLiveId) : this.mRequestLiveId.equals(videoInfo.liveId);
    }

    private boolean isOfficialType(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbd783fb", new Object[]{this, videoInfo})).booleanValue() : videoInfo != null && videoInfo.officialLiveInfo != null && aa.bZ() && "official".equals(videoInfo.officialLiveInfo.officialLive);
    }

    private boolean checkTopic(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a5ab703", new Object[]{this, videoInfo})).booleanValue() : !StringUtils.isEmpty(this.mRequestLiveId) && this.mRequestLiveId.equals(videoInfo.topic);
    }

    @Override // tb.ppq.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.room.pre.a.a().a(m.b() ? com.taobao.taolive.room.pre.a.ISAFCCOLDCONTEXT_KEY : this.mRequestLiveId);
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        com.taobao.taolive.room.utils.a.a(context, this.mFrameContext);
        this.mRequestLiveId = null;
        this.mRequestAccountId = null;
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.c();
        }
        pkr pkrVar = this.mVideoFrame;
        if (pkrVar != null) {
            pkrVar.c();
        }
        pqi.a().c(TAG, "STATUS_INIT_FAIL");
        if (k.a(str) || k.b(str)) {
            plk.a(this.mContext, R.string.taolive_status_error_traffic_limit);
            s.a(this.mContext, aa.P());
            ddw.a().a("com.taobao.taolive.room.killself", null, this.frameContextUnique);
            return;
        }
        if (ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
            plk.a(this.mContext, "手机网络未打开，请联网后重试");
        }
        showError();
        pib pibVar = this.mMediaStatusController;
        if (pibVar == null) {
            return;
        }
        pibVar.f();
    }

    @Override // tb.pks
    public void onLiveStartPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8945e82", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mFrameContext.s != null) {
            this.mFrameContext.s.a();
        }
        if (this.mFrameContext.C != null) {
            this.mFrameContext.C.a();
        }
        m.i(this.mFrameContext);
        pib pibVar = this.mMediaStatusController;
        if (pibVar == null) {
            return;
        }
        pibVar.a();
    }

    @Override // tb.pks
    public void onFirstFrame(long j, long j2) {
        TBLiveRecEngineV2.RecModel recModel;
        pkr pkrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf47623", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        pic picVar = this.mTBLIveRoomEngine;
        if (picVar != null) {
            picVar.d();
        }
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.b();
        }
        pos posVar = (pos) ppn.a().a(this.mFrameContext.j(), pos.class);
        if (posVar != null) {
            posVar.a();
        }
        uploadFirstFramePoint();
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null && (pkrVar = this.mVideoFrame) != null) {
            pkmVar.h(pkrVar.l());
        }
        if (aa.ce() && (recModel = this.mRecModel) != null && recModel.initParams != null) {
            ap.a(this.mFrameContext, this.mRecModel.initParams.get("livesource"), j, j2);
            pkm pkmVar2 = this.mPerfomenceTrackManager;
            if (pkmVar2 != null) {
                putCustomKLifecycleParam(pkmVar2);
                this.mPerfomenceTrackManager.a("startPlayTs", String.valueOf(j));
            }
            if (this.mPerfomenceTrackManager != null && this.mGlobalContext != null) {
                putKLifecycleParam("kPlayerFirstFinishTime", j2);
                new HashMap().put("kLivePlayerSuccess", String.valueOf(j2));
            }
        }
        m.h(this.mFrameContext);
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
    }

    private void putCustomKLifecycleParam(pkm pkmVar) {
        ATaoLiveOpenEntity o;
        ssr d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6928f3", new Object[]{this, pkmVar});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar == null || (o = gVar.o()) == null || o.eventCompontent == null || o.eventCompontent.a() == null || (d = o.eventCompontent.a().d()) == null) {
            return;
        }
        Map<String, String> dI_ = d.dI_();
        q.b(TAG, "onCustomerKLifecycleParam，onCustomerKLifecycleParam：" + dI_);
        if (at.a(dI_)) {
            return;
        }
        for (Map.Entry<String, String> entry : dI_.entrySet()) {
            String key = entry.getKey();
            if (!StringUtils.isEmpty(key) && pkmVar != null) {
                pkmVar.a(key, entry.getValue());
            }
        }
    }

    @Override // tb.pks
    public void onSurfaceRenderFirstFrame(long j) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a630cefc", new Object[]{this, new Long(j)});
            return;
        }
        if (aa.aA() && !this.mFrameContext.y().r && (viewGroup = this.mRoomLayout) != null) {
            viewGroup.post(new Runnable() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        OpenSingleViewController.access$500(OpenSingleViewController.this);
                    }
                }
            });
        }
        if (aa.ce() && !this.hasSurfaceUpdate && this.mPerfomenceTrackManager != null && this.mGlobalContext != null) {
            HashMap hashMap = new HashMap();
            if ((isFirstEnter() && ap.f) || this.isFromBackground) {
                this.mPerfomenceTrackManager.a("kLivePlayerSuccess", String.valueOf(1000));
                this.mPerfomenceTrackManager.a("kLiveLowerPlayerSuccess", String.valueOf(1000));
                hashMap.put("kLivePlayerSuccess", String.valueOf(1000));
            } else {
                putKLifecycleParam("kLivePlayerSuccess", System.currentTimeMillis());
                putKLifecycleParam("kLiveLowerPlayerSuccess", j);
            }
            ai.a(this.mGlobalContext, this.mPerfomenceTrackManager);
            this.hasSurfaceUpdate = true;
        }
        this.isFromBackground = false;
        ap.f = false;
    }

    private void putKLifecycleParam(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fea1f4", new Object[]{this, str, new Long(j)});
            return;
        }
        String str2 = this.mGlobalContext.E().get(str);
        if (isFirstEnter() && str2 != null) {
            this.mPerfomenceTrackManager.a(str, String.valueOf(str2));
        } else {
            this.mPerfomenceTrackManager.a(str, String.valueOf(j));
        }
        this.mGlobalContext.E().remove(str);
    }

    private boolean isFirstEnter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be223a5d", new Object[]{this})).booleanValue();
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        if (recModel != null && recModel.initParams != null) {
            return StringUtils.equals(this.mRecModel.initParams.get(aw.PARAM_IS_FIRST_ENTER), "true");
        }
        return false;
    }

    private boolean isNewIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e5561dd", new Object[]{this})).booleanValue();
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        if (recModel != null && recModel.initParams != null) {
            return StringUtils.equals(this.mRecModel.initParams.get(aw.PARAM_IS_NEW_INTENT), "true");
        }
        return false;
    }

    @Override // tb.pks
    public void onVideoInfo(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402f4cc3", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj});
        } else if (((int) j) != 715 || !aa.S()) {
        } else {
            String str = null;
            if (obj != null) {
                str = (String) obj;
            }
            if (StringUtils.isEmpty(str) || !this.mDidAppear) {
                return;
            }
            if (pmd.a().m() != null) {
                pnj m = pmd.a().m();
                m.b(TAG, "MEDIA_INFO_SEI_USERDEFINED_STRUCT seiData = " + str);
            }
            f.j().seiDispatcherDispatch(this.seiDispatcher, str);
            if (this.mEnableAdjustBBConnectionVideoSize) {
                ab.b(TAG, "adjustBBConnectionVideoSize allow");
                if (com.taobao.android.live.plugin.proxy.c.a().d() && f.p() != null) {
                    f.p().adjustBBConnectionVideoSize(this.mContext, this.mFrameContext, str);
                }
            }
            ddw.a().a("com.taobao.taolive.room.get_sei_info", str, this.frameContextUnique);
        }
    }

    @Override // tb.pks
    public void onVideoError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc252069", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        pib pibVar = this.mMediaStatusController;
        if (pibVar != null) {
            pibVar.c();
        }
        com.taobao.taolive.room.controller2.a aVar = this.mAutoDownController;
        if (aVar != null) {
            aVar.a(i);
        }
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
    }

    private void initVideo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58adbb6", new Object[]{this, context});
            return;
        }
        this.mVideoFrame = new pkr(this.mFrameContext, context, this.itemView);
        this.mVideoFrame.a((b) this);
        this.mVideoFrame.a((pks) this);
    }

    private JSONObject generateTcpContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6847600a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        g gVar = this.mFrameContext;
        if (gVar != null && (gVar.y() instanceof c)) {
            jSONObject.put(aw.PARAM_TCP_OUTER_PARAM, (Object) ((c) this.mFrameContext.y()).f21593a);
        }
        return jSONObject;
    }

    private String generateLiveContextKey() {
        TBLiveRecEngineV2.RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc914e88", new Object[]{this});
        }
        e eVar = this.mGlobalContext;
        String i = eVar != null ? eVar.i() : "";
        String b = this.mRecModel != null ? ppn.a().b(this.mRecModel.liveId) : "unknown";
        if (!StringUtils.isEmpty(i)) {
            b = i + "_" + b;
        }
        g gVar = this.mFrameContext;
        if (gVar != null) {
            gVar.a(b);
        }
        g gVar2 = this.mFrameContext;
        if (gVar2 != null && (recModel = this.mRecModel) != null) {
            gVar2.d = recModel.liveId;
        }
        poy.f(b, this.mFrameContext);
        return b;
    }

    private boolean checkLiveDetailWithBindModel(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3fcf689", new Object[]{this, videoInfo})).booleanValue();
        }
        TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
        return recModel != null && videoInfo != null && !StringUtils.isEmpty(recModel.liveId) && this.mRecModel.liveId.equals(videoInfo.liveId);
    }

    private void reportCheckLiveDetailWithBindModelError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222f25a2", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ab.c(TAG, "reportCheckLiveDetailWithBindModelError error recommendLiveID" + str + " liveDetailLiveID = " + str3 + " liveContextKey = " + str4 + " hash = " + this);
        HashMap hashMap = new HashMap();
        hashMap.put("recommendLiveID", str);
        hashMap.put("recommendAccountId", str2);
        hashMap.put("liveDetailLiveID", str3);
        ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "LiveDetailMistake", (Map<String, String>) hashMap);
    }

    private void reportAboutMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33875fb", new Object[]{this, new Boolean(z)});
        } else if (!com.taobao.taolive.sdk.ui.media.mute.b.a(this.mContext)) {
        } else {
            if (z) {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_show", (HashMap<String, String>) null);
            }
            if (com.taobao.taolive.sdk.ui.media.mute.b.b(this.mContext)) {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute", (HashMap<String, String>) null);
            } else {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_none", (HashMap<String, String>) null);
            }
            if (com.taobao.taolive.sdk.ui.media.mute.b.a()) {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_set_open", (HashMap<String, String>) null);
            } else {
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext, "mute_set_close", (HashMap<String, String>) null);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.ui.component.b
    public void onAnchorLeave() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537088aa", new Object[]{this});
        } else {
            com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        }
    }

    private void setupComponentGroupConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9853ef88", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (aTaoLiveOpenEntity == null || aTaoLiveOpenEntity.abilityCompontent == null || !this.taoLiveOpenEntity.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent)) {
            return;
        }
        Object a2 = this.taoLiveOpenEntity.abilityCompontent.a(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent);
        if (!(a2 instanceof String)) {
            return;
        }
        this.mFrameContext.a(ComponentGroupConfig.defaultComponentGroupConfig());
        ComponentGroupConfig.setShowComponent((ITaoLiveComponentConfig) JSON.parseObject((String) a2, ITaoLiveComponentConfig.class), this.mFrameContext);
        g gVar = this.mFrameContext;
        if (gVar == null || gVar.n() == null || this.mFrameContext.n().getConfigurableConfig() == null) {
            return;
        }
        ab.b(TAG, this.mFrameContext.n().getConfigurableConfig().toString());
    }

    private void initTopContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd373263", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (aTaoLiveOpenEntity != null && aTaoLiveOpenEntity.uiCompontent != null && this.taoLiveOpenEntity.uiCompontent.a() != null) {
            View j = this.taoLiveOpenEntity.uiCompontent.a().j();
            if (!(j instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) j;
            viewGroup.addView(LayoutInflater.from(this.mContext).inflate(R.layout.taolive_open_top_container, (ViewGroup) null, false), viewGroup.getChildCount());
        } else if (aa.cw()) {
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_open_fix_layout, (ViewGroup) null, false);
            View view = this.itemView;
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).addView(inflate, ((ViewGroup) view).getChildCount());
        }
    }

    private void interceptColdStartDataUploadIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8f5e61", new Object[]{this});
        } else if (!u.aF()) {
        } else {
            String p = poz.p(n.b(this.mFrameContext));
            if (ag.SOURCE_UPDOWNSWITCH.equalsIgnoreCase(p) || this.mFrameContext.y().aJ_().b().s()) {
                return;
            }
            com.taobao.taolive.sdk.monitor.b.b().b("LIVE_CODE_BOOT_STAGE");
            ab.e(TAG, "interceptContinueUpload:" + p);
        }
    }

    private void addSimplePageTrackFeedId(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2931e928", new Object[]{this, simpleVideoInfo});
        } else if (simpleVideoInfo == null || !aa.bE()) {
        } else {
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(simpleVideoInfo.liveId)) {
                hashMap.put("feed_id", simpleVideoInfo.liveId);
            }
            if (!StringUtils.isEmpty(simpleVideoInfo.accountId)) {
                hashMap.put("account_id", simpleVideoInfo.accountId);
            }
            com.taobao.taolive.sdk.core.a.a(this.mFrameContext, ai.e(this.mFrameContext, this.mContext), hashMap);
        }
    }

    private boolean showKandian(VideoInfo videoInfo, com.taobao.taolive.movehighlight.bean.a aVar) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fde1f80a", new Object[]{this, videoInfo, aVar})).booleanValue();
        }
        com.taobao.taolive.room.utils.a.a(this.mContext, this.mFrameContext);
        com.taobao.taolive.sdk.playcontrol.c.a(this.mFrameContext, VideoStatus.VIDEO_TIMESHIFT_STATUS);
        if ((this.mRecModel.isFirst || ((eVar = this.mGlobalContext) != null && eVar.E)) && com.taobao.taolive.movehighlight.utils.d.f21479a) {
            poy.a(1, this.mFrameContext);
        }
        pfa.a(this.mFrameContext).f32580a = this.mRecModel.initParams.get("scm");
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel == null || tBLiveBizDataModel.mVideoInfo == null) {
            return true;
        }
        j.a(this.mFrameContext, this.mLiveDataModel);
        TBLiveBizDataModel tBLiveBizDataModel2 = this.mLiveDataModel;
        if (tBLiveBizDataModel2 != null) {
            poy.a(tBLiveBizDataModel2, tBLiveBizDataModel2.mVideoInfo, this.mFrameContext);
        }
        if (this.mRecModel.liveUrlList != null) {
            this.mRecModel.liveUrlList = null;
        }
        BaseFrame baseFrame = this.mRoomController;
        if (baseFrame != null && !(baseFrame instanceof TaoliveHighlightController)) {
            this.mComponentManager.deleteComponent(baseFrame);
            this.mRoomController.onDestroy();
            this.mRoomController = null;
        }
        poy.f(true, (com.taobao.alilive.aliliveframework.frame.a) this.mFrameContext);
        if ((this.mRoomController instanceof TaoliveHighlightController) && com.taobao.taolive.movehighlight.utils.c.r()) {
            ((TaoliveHighlightController) this.mRoomController).setmBasePreloadRequest(this.highlightPreloadTimeMove);
        }
        this.mComponentManager.onBindData(this.mLiveDataModel);
        if (this.mRoomController == null) {
            this.mRoomController = new TaoliveHighlightController(this.mContext, videoInfo.landScape, this.mLiveDataModel, this.mFrameContext);
            ((TaoliveHighlightController) this.mRoomController).initFrameLayout(this.mVideoFrame.m(), this.mRoomLayout, (AliUrlImageView) this.itemView.findViewById(R.id.taolive_background_image), this.mPerfomenceTrackManager, aVar, this.highlightPreloadTimeMove);
            this.mComponentManager.addComponent(this.mRoomController);
        }
        pkm pkmVar = this.mPerfomenceTrackManager;
        if (pkmVar != null) {
            pkmVar.g(RecModel.MEDIA_TYPE_TIMEMOVE);
        }
        g gVar = this.mFrameContext;
        if (gVar != null && (gVar.y() instanceof c)) {
            ((c) this.mFrameContext.y()).f = RecModel.MEDIA_TYPE_TIMEMOVE;
        }
        return false;
    }

    public void checkDisplayCutout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c547228d", new Object[]{this});
        } else if (poz.v(n.b(this.mFrameContext)) || !(this.mContext instanceof Activity)) {
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                ((Activity) this.mContext).getWindow().getDecorView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                            return;
                        }
                        pmd.a().m().b(MediaConstant.LBLIVE_SOURCE, "onLayoutChange ========= ");
                        WindowInsets rootWindowInsets = ((Activity) OpenSingleViewController.this.mContext).getWindow().getDecorView().getRootWindowInsets();
                        pnj m = pmd.a().m();
                        m.b(MediaConstant.LBLIVE_SOURCE, "mInsets ========= " + rootWindowInsets);
                        if (!com.taobao.taolive.room.ui.a.a((Activity) OpenSingleViewController.this.mContext) || rootWindowInsets == null) {
                            poz.m(false, n.b(OpenSingleViewController.this.mFrameContext));
                        } else {
                            boolean a2 = com.taobao.taolive.room.ui.a.a(OpenSingleViewController.this.mContext, rootWindowInsets);
                            poz.m(a2, n.b(OpenSingleViewController.this.mFrameContext));
                            if (a2) {
                                pnj m2 = pmd.a().m();
                                m2.b(MediaConstant.LBLIVE_SOURCE, "mCutoutHeight = " + com.taobao.taolive.room.c.b);
                                int c = com.taobao.taolive.room.ui.a.c(OpenSingleViewController.this.mContext, rootWindowInsets);
                                poz.b(c, n.b(OpenSingleViewController.this.mFrameContext));
                                poz.c(c, n.b(OpenSingleViewController.this.mFrameContext));
                                com.taobao.taolive.room.service.d.a(OpenSingleViewController.this.mFrameContext.y());
                                ((Activity) OpenSingleViewController.this.mContext).getWindow().getDecorView().removeOnLayoutChangeListener(this);
                            }
                        }
                        poz.b(0, n.b(OpenSingleViewController.this.mFrameContext));
                        poz.c(0, n.b(OpenSingleViewController.this.mFrameContext));
                        com.taobao.taolive.room.service.d.a(OpenSingleViewController.this.mFrameContext.y());
                        ((Activity) OpenSingleViewController.this.mContext).getWindow().getDecorView().removeOnLayoutChangeListener(this);
                    }
                });
            } else {
                poz.m(false, n.b(this.mFrameContext));
                poz.b(0, n.b(this.mFrameContext));
                poz.c(0, n.b(this.mFrameContext));
            }
            com.taobao.taolive.room.service.d.a(this.mFrameContext.y());
        }
    }

    private void checkLiveDetailError(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716da31", new Object[]{this, videoInfo, new Boolean(z)});
        } else if (videoInfo == null) {
        } else {
            TBLiveRecEngineV2.RecModel recModel = this.mRecModel;
            if (recModel != null) {
                boolean z3 = recModel.liveId != null && !this.mRecModel.liveId.isEmpty();
                boolean z4 = this.mRecModel.accountId != null && !this.mRecModel.accountId.isEmpty();
                boolean z5 = z3 ? !this.mRecModel.liveId.equals(videoInfo.liveId) : false;
                boolean z6 = z4 ? !this.mRecModel.accountId.equals(videoInfo.broadCaster.accountId) : false;
                if (!z && (z5 || z6)) {
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
            reportCheckLiveDetailWithBindModelError(this.mRecModel.liveId, this.mRecModel.accountId, (videoInfo == null || videoInfo.liveId == null) ? "null" : videoInfo.liveId, this.mFrameContext.j() != null ? this.mFrameContext.j() : "unknown");
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public TBLiveRecEngineV2.RecModel getRecModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("a88bb5ec", new Object[]{this}) : this.mRecModel;
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public TBLiveBizDataModel getTBLiveBizDataModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveBizDataModel) ipChange.ipc$dispatch("b169bccd", new Object[]{this}) : this.mLiveDataModel;
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void needPresentAvatarPage(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bd5651", new Object[]{this, map});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar == null || gVar.e() == null || map == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sourceType", (Object) map.get("sourceType"));
        jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID));
        jSONObject.put("accountId", (Object) map.get("accountId"));
        jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, (Object) map.get(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID));
        this.mFrameContext.e().a("com.taobao.taolive.room.avatar_card_show", jSONObject);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void setContainerOffset(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03b86d7", new Object[]{this, jSONObject});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar == null || gVar.e() == null || at.a(jSONObject)) {
            return;
        }
        ab.a(TAG, "沉浸式设置，发送Event，offsetMap = " + jSONObject);
        this.mFrameContext.e().a(xkw.EVENT_CHANGE_CONTAINER_OFFSET, jSONObject);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar == null || gVar.M() == null) {
            return;
        }
        this.mFrameContext.M().a(z);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public String getUniStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ada47542", new Object[]{this});
        }
        g gVar = this.mFrameContext;
        if (gVar == null) {
            return null;
        }
        return gVar.G();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        g gVar = this.mFrameContext;
        if (gVar == null || gVar.A() == null) {
            return;
        }
        this.mFrameContext.A().a(iSmallWindowStrategy);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public e getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("41e17473", new Object[]{this});
        }
        g gVar = this.mFrameContext;
        if (gVar == null) {
            return null;
        }
        return gVar.y();
    }

    @Override // tb.sgr
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (!y.b(this.mContext) && !y.c(this.mContext)) {
        } else {
            ddw.a().a(!z ? "com.taobao.taolive.room.mediaplatform_switch_to_portrait" : "com.taobao.taolive.room.mediaplatform_switch_to_landscape");
        }
    }

    private void showMoreTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f85f50", new Object[]{this});
            return;
        }
        ffv ffvVar = this.mMoreSwitchGuideTip;
        if (ffvVar == null) {
            return;
        }
        ffvVar.a();
    }

    private void resetMoreTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf41d5be", new Object[]{this});
            return;
        }
        ffv ffvVar = this.mMoreSwitchGuideTip;
        if (ffvVar == null) {
            return;
        }
        ffvVar.b();
    }

    @Override // tb.ppp.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.isFromBackground = true;
        pmd.a().u().b(this);
    }
}
