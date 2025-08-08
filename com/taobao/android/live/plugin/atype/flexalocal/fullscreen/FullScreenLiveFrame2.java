package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.ExplainBehaviorReportMessage;
import com.taobao.taolive.sdk.model.message.LiveEndMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.playcontrol.c;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.y;
import java.util.HashMap;
import tb.dds;
import tb.ddv;
import tb.ddw;
import tb.ddx;
import tb.hfm;
import tb.hgs;
import tb.hgt;
import tb.hkk;
import tb.hkl;
import tb.jzn;
import tb.kge;
import tb.kqq;
import tb.phg;
import tb.phq;
import tb.ply;
import tb.pmd;
import tb.pnj;
import tb.poy;
import tb.sef;
import tb.tqa;
import tb.xkw;

/* loaded from: classes5.dex */
public class FullScreenLiveFrame2 extends AbsFullScreenFrame implements d.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FullScreenLiveFrame2";
    private jzn.a baseExplainBehaviorCache;
    private jzn.a expExplainBehaviorCache;
    private BaseFrame liveLinkFrame3;
    private ValueAnimator lowerComponentUpAnimator;
    private BaseFrame mChatRoomLinkFrame;
    private View mChatRoomLinkView;
    private LiveEndMessage mLiveEndMessage;
    private BaseFrame mMultiAnchorLinkFrame;
    private View mMultiLinkView;
    private BaseFrame mPKLinkFrame;
    private View mPKLinkView;
    private View mStopLink;
    private Runnable preInflateRunnable;
    private q sabAtmosphereController;

    static {
        kge.a(2038980212);
        kge.a(-2101054629);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(FullScreenLiveFrame2 fullScreenLiveFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            case -597982134:
                super.clearComponents();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ BaseFrame access$000(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("50eaffb0", new Object[]{fullScreenLiveFrame2}) : fullScreenLiveFrame2.mPKLinkFrame;
    }

    public static /* synthetic */ void access$100(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8561e315", new Object[]{fullScreenLiveFrame2});
        } else {
            fullScreenLiveFrame2.installRemoteRewardPanelInner();
        }
    }

    public static /* synthetic */ void access$200(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bcf9f4", new Object[]{fullScreenLiveFrame2});
        } else {
            fullScreenLiveFrame2.installRemoteNoticeFrame4inner();
        }
    }

    public static /* synthetic */ View access$300(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c6213a55", new Object[]{fullScreenLiveFrame2}) : fullScreenLiveFrame2.mMultiLinkView;
    }

    public static /* synthetic */ BaseFrame access$400(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("81ddd52c", new Object[]{fullScreenLiveFrame2}) : fullScreenLiveFrame2.mMultiAnchorLinkFrame;
    }

    public static /* synthetic */ View access$500(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0fab493", new Object[]{fullScreenLiveFrame2}) : fullScreenLiveFrame2.mPKLinkView;
    }

    public static /* synthetic */ View access$600(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e6771b2", new Object[]{fullScreenLiveFrame2}) : fullScreenLiveFrame2.mChatRoomLinkView;
    }

    public static /* synthetic */ BaseFrame access$700(FullScreenLiveFrame2 fullScreenLiveFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("2693f549", new Object[]{fullScreenLiveFrame2}) : fullScreenLiveFrame2.mChatRoomLinkFrame;
    }

    public FullScreenLiveFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        if (FullScreenFrame.b.f13729a.containsKey(Integer.valueOf(R.layout.taolive_frame_live_2_flexalocal)) && FullScreenFrame.b.f13729a.get(Integer.valueOf(R.layout.taolive_frame_live_2_flexalocal)).getContext() == this.mContext) {
            viewGroup.addView(FullScreenFrame.b.f13729a.remove(Integer.valueOf(R.layout.taolive_frame_live_2_flexalocal)));
            this.mContainer = viewGroup;
            pmd.a().m().a(FullScreenFrame.b.TAG, "R.layout.taolive_frame_live2_flexalocal 使用预创建的");
        } else {
            this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_live_2_flexalocal, viewGroup);
        }
        initAll();
        this.preInflateRunnable = new FullScreenFrame.b.a(R.layout.taolive_frame_live_2_flexalocal, this.mContext, "R.layout.taolive_frame_live_2_flexalocal");
        this.workerHandler.postDelayed(this.preInflateRunnable, com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.DEF_MAX_ASYNC_SECONDS);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183da678", new Object[]{this});
            return;
        }
        initView();
        setUpView();
        if (!poy.v(this.mFrameContext)) {
            return;
        }
        initDoubleClickFavView();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void showByStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85294ecd", new Object[]{this});
        } else {
            showLive();
        }
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1004) {
            if (phg.a() != null) {
                phg.a().a(this.mFrameContext, "afterlive_end_notify", (HashMap<String, String>) null);
            }
            this.mIsEnd = true;
            this.mLiveEndMessage = (LiveEndMessage) obj;
            if (c.i(this.mFrameContext) != VideoStatus.VIDEO_NORMAL_STATUS) {
                return;
            }
            notifyEnd(this.mLiveEndMessage);
        } else if (i != 880000279 || !hkk.al() || !(obj instanceof ExplainBehaviorReportMessage)) {
        } else {
            ExplainBehaviorReportMessage explainBehaviorReportMessage = (ExplainBehaviorReportMessage) obj;
            if (explainBehaviorReportMessage.segmentList == null || explainBehaviorReportMessage.segmentList.isEmpty() || this.mFrameContext == null) {
                return;
            }
            jzn.a(explainBehaviorReportMessage, StringUtils.equals(explainBehaviorReportMessage.explainType, "base") ? this.baseExplainBehaviorCache : this.expExplainBehaviorCache);
            jzn.a(explainBehaviorReportMessage.segmentList, StringUtils.equals(explainBehaviorReportMessage.explainType, "base") ? this.mFrameContext.I : this.mFrameContext.H, explainBehaviorReportMessage.explainType);
            if (explainBehaviorReportMessage.segmentList.size() != 2) {
                return;
            }
            jzn.a(explainBehaviorReportMessage.segmentList.get(0), explainBehaviorReportMessage.explainType, "endExplainGoods", false);
            jzn.a(explainBehaviorReportMessage.segmentList.get(1), explainBehaviorReportMessage.explainType, "startExplainGoods", false);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IUniversalProxy.d volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        adjustLayoutParams();
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
            com.taobao.taolive.sdk.utils.q.a(TAG, "onDataReceived start mute onItemShow");
            if (f.o() != null && (volumeChangeUploadManager = f.o().getVolumeChangeUploadManager()) != null) {
                volumeChangeUploadManager.a(tBLiveDataModel.mVideoInfo.liveId);
            }
        }
        if (!hkk.al() || this.mFrameContext == null) {
            return;
        }
        long b = jzn.b(this.mFrameContext);
        this.baseExplainBehaviorCache = new jzn.a(b);
        this.expExplainBehaviorCache = new jzn.a(b);
    }

    private void adjustLayoutParams() {
        ATaoLiveOpenEntity o;
        kqq kqqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
        } else if (this.mFrameContext == null || phg.d().a() || (o = this.mFrameContext.o()) == null || o.uiCompontent == null || !(o.uiCompontent.a() instanceof kqq) || (kqqVar = (kqq) o.uiCompontent.a()) == null) {
        } else {
            JSONObject c = kqqVar.c();
            com.taobao.taolive.sdk.utils.q.b(TAG, "沉浸式直播间主动获取业务offset，adjustLayoutParams, bOffset = " + c);
            handleContainerOffset(c);
        }
    }

    private void handleContainerOffset(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101a44cf", new Object[]{this, obj});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            int intValue = jSONObject.getIntValue("leftOffset");
            int intValue2 = jSONObject.getIntValue("topOffset");
            int intValue3 = jSONObject.getIntValue("rightOffset");
            int intValue4 = jSONObject.getIntValue("bottomOffset");
            com.taobao.taolive.sdk.utils.q.b(TAG, "沉浸式handleContainerOffset, leftOffset = " + intValue + ", topOffset = " + intValue2 + ", rightOffset = " + intValue3 + ", bottomOffset = " + intValue4);
            marginLayoutParams.bottomMargin = intValue4;
            marginLayoutParams.topMargin = intValue2;
            marginLayoutParams.leftMargin = intValue;
            marginLayoutParams.rightMargin = intValue3;
        }
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    private void showLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a5d190", new Object[]{this});
            return;
        }
        initMultiLinkFrame();
        initPKLinkFrame();
        initVoiceRoomFrame();
        initLiveAvatarNewCardFrame();
        initInteractiveSystemComponent();
        initChat();
        initUserRecExp();
        initInput();
        initMemberGuide();
        initFavorEffect();
        if (!poy.ax(this.mFrameContext)) {
            initMessageCard();
        }
        initVirtualAnchor();
        initFavor();
        initShowCase();
        initNotice();
        if (!this.mLandscape) {
            initB2BConnectingView();
        }
        initNewGiftArea();
        initImportantArea();
        initSubscribeLive();
        initTopSelectComment();
        initRankLiveEntrance();
        initLiveEndRecommend();
        initLiveReadyRecommend();
        initOfficialLiveEntry();
        initProjectScreen();
        initRewardPanel();
        initBTypeOtherFrame();
    }

    public void initVoiceRoomFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134b61f7", new Object[]{this});
        } else if (!hgs.j() || this.mLandscape) {
        } else {
            this.mChatRoomLinkFrame = f.y().getVoiceRoomFrame(this.mContext, this.mFrameContext);
            BaseFrame baseFrame = this.mChatRoomLinkFrame;
            if (baseFrame != null) {
                baseFrame.keepViewStubWithoutInflate((ViewStub) this.mFrontView.findViewById(R.id.taolive_voice_room_link_stub));
                addComponent(this.mChatRoomLinkFrame);
                return;
            }
            com.taobao.taolive.sdk.utils.q.a(TAG, "initVoiceRoomFrame, frame = null");
        }
    }

    public void initLiveEndRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c040864", new Object[]{this});
        } else if (!o.D()) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-live-end-recommend", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_end_recommend_container));
        }
    }

    public void initLiveReadyRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964c9d9c", new Object[]{this});
        } else if (!hkk.Z()) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-live-ready-recommend", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_ready_recommend_container));
        }
    }

    public void initTopSelectComment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127e0d25", new Object[]{this});
        } else if (isLandscape()) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-top-select_comment", (ViewStub) this.mFrontView.findViewById(R.id.taolive_top_select_comment));
            this.mFrameContext.a((ViewGroup) this.mFrontView.findViewById(R.id.taolive_left_top_container));
        }
    }

    private void initMultiLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef30d511", new Object[]{this});
        } else if (!hgs.d() || this.mLandscape || ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_MULTI_BB_LINK_WATCH, this.mFrameContext)) {
        } else {
            this.mMultiAnchorLinkFrame = f.i().getMultiLinkFrame(this.mContext, this.mFrameContext);
            BaseFrame baseFrame = this.mMultiAnchorLinkFrame;
            if (baseFrame != null) {
                baseFrame.keepViewStubWithoutInflate((ViewStub) this.mFrontView.findViewById(R.id.taolive_multi_anchor_link_stub));
                addComponent(this.mMultiAnchorLinkFrame);
                return;
            }
            com.taobao.taolive.sdk.utils.q.a(TAG, "initMultiLinkFrame, frame = null");
        }
    }

    public void initPKLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178c74f", new Object[]{this});
        } else if (!hgs.e()) {
        } else {
            if (this.mLandscape && !hgs.z()) {
                return;
            }
            this.mPKLinkFrame = f.h().getPkLinkFrame(this.mContext, this.mFrameContext);
            BaseFrame baseFrame = this.mPKLinkFrame;
            if (baseFrame != null) {
                installPKLinkFrame(baseFrame);
            } else {
                com.taobao.taolive.sdk.utils.q.a(TAG, "initPKLinkFrame, frame = null");
            }
        }
    }

    private void installPKLinkFrame(final BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357db66", new Object[]{this, baseFrame});
        } else if (a.b()) {
            this.mFrontView.requestLayout();
            this.weakHandler.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    baseFrame.createView((ViewStub) FullScreenLiveFrame2.this.mFrontView.findViewById(R.id.taolive_pk_link_stub));
                    FullScreenLiveFrame2.this.weakHandler.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                FullScreenLiveFrame2.this.addComponent(FullScreenLiveFrame2.access$000(FullScreenLiveFrame2.this));
                            }
                        }
                    }, 34L);
                }
            });
        } else {
            baseFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_pk_link_stub));
            addComponent(this.mPKLinkFrame);
        }
    }

    public void initImportantArea() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e812da6", new Object[]{this});
            return;
        }
        boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_GIFT_SHOW, this.mFrameContext);
        boolean componentEntranceHidden2 = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_IMPORTANT_NOTICE, this.mFrameContext);
        boolean componentEntranceHidden3 = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_ATMOS_ENTER, this.mFrameContext);
        if (componentEntranceHidden || componentEntranceHidden2 || componentEntranceHidden3) {
            z = true;
        }
        if (z || !ply.s() || hkl.a().b() == null || !hkl.a().b().instanceofTBLiveBizDataModel(this.mLiveDataModel)) {
            return;
        }
        this.mFrameContext.k().a((BaseFrame) this, "tl-important-event", (ViewStub) this.mFrontView.findViewById(R.id.taolive_important_event_stub));
    }

    public void initNewGiftArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2690274", new Object[]{this});
        } else if (hkl.a().b() == null || !hkl.a().b().instanceofTBLiveBizDataModel(this.mLiveDataModel)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-room-gift", (ViewStub) this.mFrontView.findViewById(R.id.taolive_gift_stub));
        }
    }

    public void initQAExplain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf4febe", new Object[]{this});
            return;
        }
        boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LIVE_QA_BIZ, this.mFrameContext);
        pnj m = pmd.a().m();
        m.a(TAG, "group: LeftSideGroup, component: LiveQABiz, entranceHidden: " + componentEntranceHidden);
        if (componentEntranceHidden || !ply.I()) {
            return;
        }
        this.mFrameContext.k().a((BaseFrame) this, "tl-qa-explain", (ViewStub) this.mFrontView.findViewById(R.id.taolive_qa_explain_stub));
    }

    public void initVirtualAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff796af7", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_VIRTUAL_HOST_TAG, this.mFrameContext) || this.mLiveDetailData.roomType != 8888) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-virtual-anchor", (ViewStub) this.mFrontView.findViewById(R.id.taolive_virtual_anchor_stub));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initPrivateVip() {
        VideoInfo a2;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d451", new Object[]{this});
        } else if (!hgs.f() || (a2 = k.a(this.mLiveDataModel)) == null || a2.accessInfo == null) {
        } else {
            if (a2.accessInfo.access) {
                if (StringUtils.equals("PRIVATE", a2.accessInfo.accessType)) {
                    format = "欢迎进入会员专属直播间";
                } else {
                    format = StringUtils.equals("VIP", a2.accessInfo.accessType) ? String.format("欢迎%s\n进入您的专属直播间！", pmd.a().q().b()) : "";
                }
                if (StringUtils.isEmpty(format)) {
                    return;
                }
                hgt.b(this.mContext, format);
            } else if (com.taobao.android.live.plugin.proxy.c.a().d()) {
                initPrivateVipFrame();
            } else {
                com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            FullScreenLiveFrame2.this.initPrivateVipFrame();
                        }
                    }
                });
            }
        }
    }

    public void initPrivateVipFrame() {
        BaseFrame createPrivateVipFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cbcdca", new Object[]{this});
        } else if (f.p() == null || (createPrivateVipFrame = f.p().createPrivateVipFrame(this.mContext, this.mLandscape, this.mLiveDataModel, (ViewStub) this.mFrontView.findViewById(R.id.taolive_privatevip_container_stub))) == null) {
        } else {
            addComponent(createPrivateVipFrame);
        }
    }

    public void initInteractiveSystemComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7b0c03", new Object[]{this});
        } else if ((!hgs.x() && b.a().b(this.mLiveDataModel)) || ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_INTIMACY_ENTRANCE, this.mFrameContext)) {
        } else {
            if ((!y.b(this.mContext) && !y.c(this.mContext) && this.mLandscape) || hkl.a().b() == null || !hkl.a().b().liveInteractiveManagerNotNull(this.mLiveDataModel)) {
                return;
            }
            this.mFrameContext.k().a(this, "tl-intimacy", this.mFrontView.findViewById(R.id.taolive_interactive_system_frame));
        }
    }

    private void getMessageInfo() {
        dds liveDetailMessInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8f2126", new Object[]{this});
            return;
        }
        VideoInfo a2 = k.a(this.mLiveDataModel);
        if (a2 == null || a2.broadCaster == null || hkl.a().b() == null || hkl.a().b().getLiveDetailMessInfo(this.mFrameContext) == null || (liveDetailMessInfo = hkl.a().b().getLiveDetailMessInfo(this.mFrameContext)) == null) {
            return;
        }
        liveDetailMessInfo.a(this.mFrameContext);
        liveDetailMessInfo.a(a2.broadCaster.accountId, a2.liveId);
    }

    private void initLinkLive() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6dfabd", new Object[]{this});
            return;
        }
        if (!this.mLandscape) {
            this.mStopLink = this.mFrontView.findViewById(R.id.taolive_stoplink_large);
            this.mStopLink.setOnClickListener(this);
        }
        boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_BC_LINK_WATCH, this.mFrameContext);
        boolean componentEntranceHidden2 = ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_LIVE_BC_LINK_BIZ, this.mFrameContext);
        if (componentEntranceHidden || componentEntranceHidden2) {
            z = true;
        }
        if (z || this.liveLinkFrame3 != null) {
            return;
        }
        this.liveLinkFrame3 = f.j().createLiveLinkFrame3AndCreateView(this.mContext, this.mFrameContext, this.mLiveDataModel, (ViewStub) this.mContainer.findViewById(R.id.taolive_video_linklive3_stub));
        addComponent(this.liveLinkFrame3);
    }

    private void initRewardPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e0f2ec", new Object[]{this});
            return;
        }
        try {
            if (com.taobao.android.live.plugin.proxy.c.a().d()) {
                installRemoteRewardPanelInner();
            } else {
                com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        try {
                            FullScreenLiveFrame2.access$100(FullScreenLiveFrame2.this);
                        } catch (Throwable th) {
                            e.c("[FullScreenLiveFrame2#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            e.c("[FullScreenLiveFrame2#registerRemoteFrame]  error: " + th.getMessage());
        }
        if (((phq) this.mFrameContext).C() == null) {
            return;
        }
        ((phq) this.mFrameContext).C().c(new sef.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.-$$Lambda$FullScreenLiveFrame2$V-_eCyOmSDmTGxjGAbvM6jhpwWQ
            @Override // tb.sef.a
            public final View getView() {
                return FullScreenLiveFrame2.this.lambda$initRewardPanel$19$FullScreenLiveFrame2();
            }
        });
    }

    public /* synthetic */ View lambda$initRewardPanel$19$FullScreenLiveFrame2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("21f54c4d", new Object[]{this}) : this.mContainer.findViewById(R.id.taolive_bottom_bar_wrapper);
    }

    private void installRemoteRewardPanelInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c522a9", new Object[]{this});
        } else if (f.p() == null || f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_PANEL_FRAME) == null) {
        } else {
            ddx.a("tl-reward-panel", f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_PANEL_FRAME));
            this.mFrameContext.k().a((BaseFrame) this, "tl-reward-panel", (ViewStub) this.mContainer.findViewById(R.id.taolive_room_reward_panel_stub));
            e.c("[FullScreenLiveFrame2#registerRemoteFrame#onBTypePluginInstalled] REWARD_FRAME success: ");
            if (((phq) this.mFrameContext).C() == null) {
                return;
            }
            ((phq) this.mFrameContext).C().b(new sef.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.-$$Lambda$FullScreenLiveFrame2$HFb9qfB0pWGg2dVeC4jNIoPYd4I
                @Override // tb.sef.a
                public final View getView() {
                    return FullScreenLiveFrame2.this.lambda$installRemoteRewardPanelInner$20$FullScreenLiveFrame2();
                }
            });
        }
    }

    public /* synthetic */ View lambda$installRemoteRewardPanelInner$20$FullScreenLiveFrame2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a21bc186", new Object[]{this}) : this.mContainer.findViewById(R.id.taolive_reward_x_card_frame);
    }

    public void notifyEnd(LiveEndMessage liveEndMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f8df59", new Object[]{this, liveEndMessage});
        } else {
            hideKeyboard();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        q qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.workerHandler.removeCallbacks(this.preInflateRunnable);
        if (hkk.P() && (qVar = this.sabAtmosphereController) != null) {
            qVar.d();
        }
        if (!hkk.al() || this.mFrameContext == null) {
            return;
        }
        long b = jzn.b(this.mFrameContext);
        jzn.a(this.expExplainBehaviorCache, this.mFrameContext.H, "exp", b);
        jzn.a(this.baseExplainBehaviorCache, this.mFrameContext.I, "base", b);
        this.expExplainBehaviorCache = null;
        this.baseExplainBehaviorCache = null;
        jzn.a(this.mFrameContext);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
            return;
        }
        super.clearComponents();
        this.liveLinkFrame3 = null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ddw.a().a(this);
        j.a(this.mFrameContext, this, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1004 || i == 880000279;
            }
        });
        getMessageInfo();
        if (this.mFrameContext == null || this.mFrameContext.a() == null || this.mFrontView == null) {
            return;
        }
        this.mFrameContext.a((View) ((ViewGroup) this.mFrontView.findViewById(R.id.taolive_left_top_container)));
    }

    private void destroy() {
        dds liveDetailMessInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        j.a(this.mFrameContext, this);
        if (hkl.a().b() != null && hkl.a().b().getLiveDetailMessInfo(this.mFrameContext) != null && (liveDetailMessInfo = hkl.a().b().getLiveDetailMessInfo(this.mFrameContext)) != null) {
            liveDetailMessInfo.a();
        }
        this.weakHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.ddv
    public void onEvent(String str, Object obj) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_LINKLIVE_START.equals(str)) {
            com.taobao.taolive.sdk.utils.q.a(TAG, "enableLinkLive3, big stop link button gone");
            View view = this.mStopLink;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        } else if (xkw.EVENT_LINKLIVE_STOP.equals(str)) {
            View view2 = this.mStopLink;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(8);
        } else if (FullScreenFrame.EVENT_BACK_TO_LIVE.equals(str)) {
            if (this.mIsEnd) {
                notifyEnd(this.mLiveEndMessage);
            } else {
                initLinkLive();
            }
        } else if (FullScreenFrame.EVENT_ADD_TIPS_VIEW.equals(str)) {
            if (obj == null || !(obj instanceof View) || this.mFrontView == null) {
                return;
            }
            View view3 = (View) obj;
            ViewParent parent = view3.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view3);
            }
            ((ViewGroup) this.mFrontView).addView(view3, 0);
        } else if (FullScreenFrame.EVENT_LINKLIVE_INIT.equals(str)) {
            if (com.taobao.taolive.sdk.playcontrol.c.i(this.mFrameContext) != VideoStatus.VIDEO_NORMAL_STATUS) {
                return;
            }
            initLinkLive();
        } else if (hkk.P() && "com.taobao.taolive.room.init_sab_atmosphere".equals(str) && (obj instanceof LiveItem)) {
            if (this.sabAtmosphereController == null && (this.mFrontView instanceof ViewGroup)) {
                this.sabAtmosphereController = new q(this.mContext, this.mFrameContext, (ViewGroup) this.mFrontView);
            }
            if (this.mFrameContext != null && this.mFrameContext.z() != null && this.mFrameContext.z().M()) {
                ddw.a().a(xkw.d, obj, observeUniqueIdentification());
                return;
            }
            q qVar = this.sabAtmosphereController;
            if (qVar == null) {
                return;
            }
            if (qVar.c()) {
                this.sabAtmosphereController.b();
            }
            this.sabAtmosphereController.a((LiveItem) obj, false);
        } else if (hkk.P() && tqa.EVENT_DISMISS_SAB_ATMOSHPERE.equals(str)) {
            q qVar2 = this.sabAtmosphereController;
            if (qVar2 == null || !qVar2.c()) {
                return;
            }
            this.sabAtmosphereController.b();
        } else if (hkk.au() && "com.taobao.taolive.room.hot_item_subscribe_success".equals(str) && (obj instanceof String[])) {
            q qVar3 = this.sabAtmosphereController;
            if (qVar3 == null) {
                return;
            }
            qVar3.a((String[]) obj);
        } else if (StringUtils.equals(str, xkw.EVENT_CHANGE_CONTAINER_OFFSET)) {
            com.taobao.taolive.sdk.utils.q.b(TAG, "沉浸式收到业务主动调用容器Offset方法，handleContainerOffset");
            handleContainerOffset(obj);
        } else if (StringUtils.equals(str, xkw.f34361a)) {
            if (this.isClearScreen || this.mFrameContext == null || this.mFrameContext.c() == null || !(this.mFrameContext.c() instanceof com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) || ((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.mFrameContext.c()).J() || this.mFrameContext.T() || this.mFrameContext.U()) {
                return;
            }
            q qVar4 = this.sabAtmosphereController;
            if (qVar4 != null && qVar4.c()) {
                return;
            }
            ddw.a().a(xkw.b, obj, observeUniqueIdentification());
        } else if (StringUtils.equals(str, xkw.c)) {
            initLowerComponentAnimator((int) ((this.mContext.getResources().getDisplayMetrics().widthPixels * 204) / 750.0f));
            ValueAnimator valueAnimator2 = this.lowerComponentUpAnimator;
            if (valueAnimator2 == null) {
                return;
            }
            valueAnimator2.start();
        } else if (StringUtils.equals(str, xkw.d)) {
            if (this.mFrameContext == null || this.mFrameContext.z() == null || !this.mFrameContext.z().M() || (valueAnimator = this.lowerComponentUpAnimator) == null) {
                return;
            }
            valueAnimator.reverse();
        } else {
            super.onEvent(str, obj);
        }
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

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == hkl.a().a(IRRoomProxy.R_ID_TAOLIVE_BTN_HOME)) {
            if (pmd.a().a("finishActivity")) {
                if (!(this.mContext instanceof Activity)) {
                    return;
                }
                ((Activity) this.mContext).finish();
                return;
            }
            ddw.a().a(FullScreenFrame.EVENT_ACTION_GOTO_HOME, null, this.mFrameContext.G());
        } else if (view.getId() == R.id.taolive_stoplink_large) {
            if (this.liveLinkFrame3 == null || f.j() == null) {
                return;
            }
            f.j().liveLinkFrame3ShowStopLinkDialog(this.liveLinkFrame3);
        } else {
            super.onClick(view);
        }
    }

    private void initLowerComponentAnimator(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8cec09", new Object[]{this, new Integer(i)});
        } else if (this.mBottomBarView == null) {
        } else {
            this.lowerComponentUpAnimator = ValueAnimator.ofInt(0, i);
            this.lowerComponentUpAnimator.setDuration(300L);
            this.lowerComponentUpAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) FullScreenLiveFrame2.this.mBottomBarView.getLayoutParams();
                    marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    FullScreenLiveFrame2.this.mBottomBarView.setLayoutParams(marginLayoutParams);
                }
            });
        }
    }

    public void initShowCase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a87b04", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.utils.q.a(TAG, "initShowCase.");
        if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_BOTTOM, ComponentGroupConfig.RIGHT_BOTTOM_RIGHT_GOODS_CARD, this.mFrameContext)) {
            return;
        }
        this.mFrameContext.k().a((BaseFrame) this, "tl-showcase-common", (ViewStub) this.mFrontView.findViewById(R.id.taolive_good_showcase_common_stub));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
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
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        init();
    }

    public void initMessageCard() {
        VideoInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fcf58e", new Object[]{this});
        } else if (!k.a() || (a2 = k.a(this.mLiveDataModel)) == null || a2.fullScreen) {
        } else {
            if ((a2.landScape && poy.e(this.mFrameContext)) || ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_NOTICE, this.mFrameContext)) {
                return;
            }
            this.mFrameContext.k().a((BaseFrame) this, "tl-message-card", (ViewStub) this.mFrontView.findViewById(R.id.taolive_messageCard_stub));
        }
    }

    public void initNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eada1c8f", new Object[]{this});
        } else if (b.a().a(this.mLiveDataModel)) {
            com.taobao.taolive.sdk.utils.q.b(TAG, "initNotice return:[isOfficialLive is true]");
        } else if (this.mFrameContext.m()) {
            com.taobao.taolive.sdk.utils.q.b(TAG, "initNotice return:[enableLiveAndHomeMix is true]");
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_TOP_NOTICE, this.mFrameContext) && ply.af()) {
            if (isEnableNotice4()) {
                installRemoteNoticeFrame4();
            } else {
                this.mFrameContext.k().a((BaseFrame) this, "tl-notice", (ViewStub) this.mFrontView.findViewById(R.id.taolive_notice_stub));
            }
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-notice", (View) ((ViewStub) this.mFrontView.findViewById(R.id.taolive_notice_stub)));
        }
    }

    private void installRemoteNoticeFrame4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f650e47", new Object[]{this});
            return;
        }
        try {
            if (com.taobao.android.live.plugin.proxy.c.a().d()) {
                installRemoteNoticeFrame4inner();
            } else {
                com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        try {
                            FullScreenLiveFrame2.access$200(FullScreenLiveFrame2.this);
                        } catch (Throwable th) {
                            e.c("[FullScreenLiveFrame2#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            e.c("[FullScreenLiveFrame2#registerRemoteFrame]  error: " + th.getMessage());
        }
    }

    private void installRemoteNoticeFrame4inner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba16461d", new Object[]{this});
        } else if (f.c().getNoticeFrame4Class() == null) {
        } else {
            ddx.a("tl-notice-4", f.c().getNoticeFrame4Class());
            this.mFrameContext.k().a((BaseFrame) this, "tl-notice-4", (ViewStub) this.mFrontView.findViewById(R.id.taolive_notice4_stub));
        }
    }

    public boolean isEnableNotice4() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b681295a", new Object[]{this})).booleanValue() : !this.mLandscape && l.d(pmd.a().d().a(hfm.TBLIVE_REWARD_ORANGE_GROUP, "enableShowTopRewardNotice", "true"));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initMediaPlatform() {
        BaseFrame createMediaPlatformFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9139264e", new Object[]{this});
        } else if (hkl.a().b() == null || (createMediaPlatformFrame2 = hkl.a().b().createMediaPlatformFrame2(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) == null) {
        } else {
            createMediaPlatformFrame2.onCreateView(null);
            addComponent(createMediaPlatformFrame2);
        }
    }

    private void initMemberGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432b54d9", new Object[]{this});
        } else {
            addComponent(f.f().getMemberGuideFrame2(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext));
        }
    }

    public void initFavorEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a68346", new Object[]{this});
        } else if (!hgs.h() || this.mLandscape) {
        } else {
            this.mFrameContext.k().a(this, "tl-favor-effect", this.mFrontView.findViewById(R.id.taolive_favor_effect_stub));
        }
    }

    public void initSubscribeLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519ad3ad", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_FANS_PUSH, this.mFrameContext)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl_7days_subscribe", (ViewStub) this.mFrontView.findViewById(R.id.taolive_subscribe_live));
        }
    }

    public void initRankLiveEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f0c5", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_BANNER, this.mFrameContext) || !hgs.i()) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl_rank_live_entrance", (ViewStub) this.mFrontView.findViewById(R.id.taolive_rank_live_entrance));
        }
    }

    public void initOfficialLiveEntry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3005c12", new Object[]{this});
        } else if (b.a().a(this.mFrameContext, this.mLiveDataModel) || !b.a().a(this.mLiveDataModel)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-official-live-entry", (ViewStub) this.mFrontView.findViewById(R.id.taolive_official_live_entry_stub));
        }
    }

    private void initProjectScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2aa7bc", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || !this.mLiveDataModel.mVideoInfo.enableProjectScreen()) {
        } else {
            Message obtain = Message.obtain(this.weakHandler);
            obtain.what = FullScreenFrame.MESSAGE_INIT_PROJECT_SCREEN_ICON;
            this.weakHandler.sendMessageDelayed(obtain, 500L);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void hideLiveLinkView() {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9dbf34", new Object[]{this});
        } else if (!hgs.d() || (baseFrame = this.mMultiAnchorLinkFrame) == null || !baseFrame.viewCreated || this.mMultiAnchorLinkFrame.getContainerView().getVisibility() == 8) {
        } else {
            this.mMultiAnchorLinkFrame.getContainerView().setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void showLiveLinkView() {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31de6ef", new Object[]{this});
        } else if (!hgs.d() || (baseFrame = this.mMultiAnchorLinkFrame) == null || !baseFrame.viewCreated || this.mMultiAnchorLinkFrame.getContainerView().getVisibility() == 0) {
        } else {
            this.mMultiAnchorLinkFrame.getContainerView().setVisibility(0);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void addMultiLinkView() {
        View containerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92f77fe", new Object[]{this});
        } else if (!hgs.d()) {
        } else {
            if (((this.mFrameContext instanceof phq) && ((phq) this.mFrameContext).F()) || this.mMultiAnchorLinkFrame == null || this.mBlankFrame == null || (containerView = this.mMultiAnchorLinkFrame.getContainerView()) == null) {
                return;
            }
            if (containerView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) containerView;
                if (viewGroup.getChildCount() > 0) {
                    this.mMultiLinkView = viewGroup.getChildAt(0);
                }
            }
            if (this.mMultiLinkView == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this) != null) {
                            ViewParent parent = FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this).getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this));
                                com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "addMultiLinkView remove success" + FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this));
                            }
                        }
                        View containerView2 = FullScreenLiveFrame2.this.mBlankFrame.getContainerView();
                        if (!(containerView2 instanceof ViewGroup)) {
                            return;
                        }
                        ((ViewGroup) containerView2).addView(FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this), 0);
                        com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "addMultiLinkView add success" + FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this));
                    } catch (Exception e) {
                        com.taobao.taolive.sdk.utils.q.b(FullScreenLiveFrame2.TAG, "addMultiLinkView catch exception:" + e.getMessage());
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public boolean removeMultiLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("488f5a7f", new Object[]{this})).booleanValue();
        }
        if (!hgs.d()) {
            return true;
        }
        if ((this.mFrameContext instanceof phq) && ((phq) this.mFrameContext).F()) {
            return false;
        }
        if (this.mMultiAnchorLinkFrame == null || this.mBlankFrame == null) {
            return true;
        }
        if (this.mMultiLinkView == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (FullScreenLiveFrame2.this.mBlankFrame != null) {
                        FullScreenLiveFrame2.this.mBlankFrame.hide();
                    }
                    ViewParent parent = FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this).getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this));
                        com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "removeMultiLinkView remove success" + FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this));
                    }
                    if (FullScreenLiveFrame2.access$400(FullScreenLiveFrame2.this) == null) {
                        return;
                    }
                    View containerView = FullScreenLiveFrame2.access$400(FullScreenLiveFrame2.this).getContainerView();
                    if (!(containerView instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) containerView).addView(FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this), -1);
                    com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "removeMultiLinkView add success" + FullScreenLiveFrame2.access$300(FullScreenLiveFrame2.this));
                } catch (Exception e) {
                    com.taobao.taolive.sdk.utils.q.b(FullScreenLiveFrame2.TAG, "removeMultiLinkView catch exception:" + e.getMessage());
                }
            }
        });
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public boolean removePKLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e505de9", new Object[]{this})).booleanValue();
        }
        if (!hgs.e()) {
            return true;
        }
        if ((this.mFrameContext instanceof phq) && ((phq) this.mFrameContext).F()) {
            return false;
        }
        if (this.mPKLinkFrame == null || this.mBlankFrame == null) {
            return true;
        }
        if (this.mPKLinkView == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (FullScreenLiveFrame2.this.mBlankFrame != null) {
                        FullScreenLiveFrame2.this.mBlankFrame.hide();
                    }
                    ViewParent parent = FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this).getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this));
                        com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "removeMultiLinkView remove success" + FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this));
                    }
                    if (FullScreenLiveFrame2.access$000(FullScreenLiveFrame2.this) == null) {
                        return;
                    }
                    View containerView = FullScreenLiveFrame2.access$000(FullScreenLiveFrame2.this).getContainerView();
                    if (!(containerView instanceof ViewGroup)) {
                        return;
                    }
                    ((ViewGroup) containerView).addView(FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this), -1);
                    com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "removeMultiLinkView add success" + FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this));
                } catch (Exception e) {
                    com.taobao.taolive.sdk.utils.q.b(FullScreenLiveFrame2.TAG, "removeMultiLinkView catch exception:" + e.getMessage());
                }
            }
        });
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void addPKLinkView() {
        View containerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d281e742", new Object[]{this});
        } else if (!hgs.e()) {
        } else {
            if (((this.mFrameContext instanceof phq) && ((phq) this.mFrameContext).F()) || this.mPKLinkFrame == null || this.mBlankFrame == null || (containerView = this.mPKLinkFrame.getContainerView()) == null) {
                return;
            }
            if (containerView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) containerView;
                if (viewGroup.getChildCount() > 0) {
                    this.mPKLinkView = viewGroup.getChildAt(0);
                }
            }
            if (this.mPKLinkView == null) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this) != null) {
                            ViewParent parent = FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this).getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this));
                                com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "addMultiLinkView remove success" + FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this));
                            }
                        }
                        View containerView2 = FullScreenLiveFrame2.this.mBlankFrame.getContainerView();
                        if (!(containerView2 instanceof ViewGroup)) {
                            return;
                        }
                        ((ViewGroup) containerView2).addView(FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this), 0);
                        com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "addMultiLinkView add success" + FullScreenLiveFrame2.access$500(FullScreenLiveFrame2.this));
                    } catch (Exception e) {
                        com.taobao.taolive.sdk.utils.q.b(FullScreenLiveFrame2.TAG, "addMultiLinkView catch exception:" + e.getMessage());
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void addChatRoomLinView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45595a9", new Object[]{this});
        } else if (!hgs.j()) {
        } else {
            if (this.mChatRoomLinkFrame == null || this.mBlankFrame == null) {
                com.taobao.taolive.sdk.utils.q.a(TAG, "addChatRoomLinkView remove success1 mChatRoomLinkFrame is null");
                return;
            }
            View containerView = this.mChatRoomLinkFrame.getContainerView();
            if (containerView == null) {
                com.taobao.taolive.sdk.utils.q.a(TAG, "addChatRoomLinkView remove success1 containerView is null");
                return;
            }
            if (containerView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) containerView;
                if (viewGroup.getChildCount() > 0) {
                    this.mChatRoomLinkView = viewGroup.getChildAt(0);
                }
            }
            if (this.mChatRoomLinkView == null) {
                com.taobao.taolive.sdk.utils.q.a(TAG, "addChatRoomLinkView remove success1 mChatRoomLinkView is null");
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this) != null) {
                                ViewParent parent = FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this).getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this));
                                    com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "addChatRoomLinkView remove success1" + FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this));
                                }
                            }
                            View containerView2 = FullScreenLiveFrame2.this.mBlankFrame.getContainerView();
                            if (!(containerView2 instanceof ViewGroup)) {
                                return;
                            }
                            ((ViewGroup) containerView2).addView(FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this), 0);
                            com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "addChatRoomLinkView add success2" + FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this));
                        } catch (Exception e) {
                            com.taobao.taolive.sdk.utils.q.b(FullScreenLiveFrame2.TAG, "addChatRoomLinkView catch exception:" + e.getMessage());
                        }
                    }
                });
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public boolean removeChatRoomLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea62ad61", new Object[]{this})).booleanValue();
        }
        if (!hgs.j()) {
            return true;
        }
        if (this.mChatRoomLinkFrame == null || this.mBlankFrame == null) {
            com.taobao.taolive.sdk.utils.q.a(TAG, "removeChatRoomLinkView mChatRoomLinkFrame is null! || mBlankFrame is null");
            return true;
        } else if (this.mChatRoomLinkView == null) {
            com.taobao.taolive.sdk.utils.q.a(TAG, "removeChatRoomLinkView mChatRoomLinkView is null!");
            return false;
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (FullScreenLiveFrame2.this.mBlankFrame != null) {
                            FullScreenLiveFrame2.this.mBlankFrame.hide();
                        }
                        ViewParent parent = FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this).getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this));
                            com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "removeChatRoomLinkView remove success1" + FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this));
                        }
                        if (FullScreenLiveFrame2.access$700(FullScreenLiveFrame2.this) == null) {
                            return;
                        }
                        View containerView = FullScreenLiveFrame2.access$700(FullScreenLiveFrame2.this).getContainerView();
                        if (!(containerView instanceof ViewGroup)) {
                            return;
                        }
                        ((ViewGroup) containerView).addView(FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this), -1);
                        com.taobao.taolive.sdk.utils.q.a(FullScreenLiveFrame2.TAG, "removeChatRoomLinkView add success2" + FullScreenLiveFrame2.access$600(FullScreenLiveFrame2.this));
                    } catch (Exception e) {
                        com.taobao.taolive.sdk.utils.q.b(FullScreenLiveFrame2.TAG, "removeChatRoomLinkView catch exception:" + e.getMessage());
                    }
                }
            });
            return false;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        super.handleMessage(message);
        Message message2 = null;
        if (message.what == 2147483645) {
            this.mFrameContext.k().a((BaseFrame) this, "tl-project-screen-icon", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_project_screen_icon_container));
            message2 = Message.obtain(this.weakHandler);
            message2.what = FullScreenFrame.MESSAGE_INIT_PROJECT_SCREEN_SEARCH;
        } else if (message.what == 2147483644) {
            message2 = Message.obtain(this.weakHandler);
            message2.what = FullScreenFrame.MESSAGE_INIT_PROJECT_SCREEN_OPT;
            this.mFrameContext.k().a((BaseFrame) this, "tl-project-screen-search", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_project_screen_container));
        } else if (message.what == 2147483643) {
            this.mFrameContext.k().a((BaseFrame) this, "tl-project-screen-opt", (ViewStub) this.mFrontView.findViewById(R.id.taolive_live_project_screen_opt_container));
        }
        if (message2 == null) {
            return;
        }
        this.mFrontView.requestLayout();
        this.weakHandler.sendMessage(message2);
    }
}
