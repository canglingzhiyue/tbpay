package com.taobao.taolive.room.ui.interactpanel;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.s;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.player.smallwindow.SmallWindowSettingDialog;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.am;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.j;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.goodlist.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.taobao.tbliveinteractive.e;
import com.taobao.tbliveinteractive.view.panel.a;
import com.taobao.tbliveinteractive.view.panel.b;
import java.util.HashMap;
import tb.ddw;
import tb.kge;
import tb.pfd;
import tb.phf;
import tb.phg;
import tb.phq;
import tb.plk;
import tb.poy;
import tb.ppz;
import tb.qne;
import tb.sst;
import tb.xkw;

/* loaded from: classes8.dex */
public class InteractPanelFrameSDK extends BaseFrame implements b, ppz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_PROJECT_SCREEN = "projectScreen";
    private static final String KEY_REFUND = "refund";
    private static final String KEY_SHARE = "share";
    private boolean initCalled;
    private View mCover;
    private HashMap<String, VideoInfo.Feedback> mFeedbackHashMap;
    private a mInteractPanelView;
    private phf mNegativeFeedbackHandler;
    private ViewGroup mRootView;
    private SmallWindowSettingDialog mSmallWindowSettingDialog;
    private InteractiveComponent pcgGift;

    static {
        kge.a(-146266913);
        kge.a(1447447795);
        kge.a(-1462502814);
    }

    private String getItemIconUrl(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa3c7fc0", new Object[]{this, new Boolean(z)}) : z ? "https://gw.alicdn.com/imgextra/i2/O1CN012UjPlX266Lggx9ZOt_!!6000000007612-2-tps-108-108.png" : "https://gw.alicdn.com/imgextra/i1/O1CN01wMyAxi1jd6r2C2I0G_!!6000000004570-2-tps-108-108.png";
    }

    public static /* synthetic */ Object ipc$super(InteractPanelFrameSDK interactPanelFrameSDK, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
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
            case -340027132:
                super.show();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    public static /* synthetic */ void access$000(InteractPanelFrameSDK interactPanelFrameSDK, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a6c320", new Object[]{interactPanelFrameSDK, tBLiveDataModel});
        } else {
            interactPanelFrameSDK.initNegativeFeedbackHandler(tBLiveDataModel);
        }
    }

    public InteractPanelFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mFeedbackHashMap = new HashMap<>();
        this.initCalled = false;
    }

    @Override // tb.ppz
    public void setCoverView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfa0ef1", new Object[]{this, view});
        } else {
            this.mCover = view;
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
        if (i != 1) {
            return;
        }
        init();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        this.mContainer = viewGroup;
        this.mRootView = viewGroup;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        a aVar = this.mInteractPanelView;
        if (aVar == null) {
            return;
        }
        aVar.show();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        a aVar = this.mInteractPanelView;
        if (aVar == null) {
            return;
        }
        aVar.hide();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
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

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        a aVar = this.mInteractPanelView;
        if (aVar != null) {
            aVar.destroy();
            this.mInteractPanelView = null;
        }
        ViewGroup viewGroup = this.mRootView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        try {
            if (this.mSmallWindowSettingDialog == null) {
                return;
            }
            if (this.mSmallWindowSettingDialog.isVisible()) {
                this.mSmallWindowSettingDialog.dismissAllowingStateLoss();
            }
            this.mSmallWindowSettingDialog = null;
        } catch (Exception unused) {
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        e tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (tBLiveInteractiveManager != null && this.mLiveDataModel != null) {
            this.mInteractPanelView = tBLiveInteractiveManager.a(this.mRootView, this.mCover, this.mLandscape, this.mLiveDataModel.mVideoInfo);
            initData();
        }
        a aVar = this.mInteractPanelView;
        if (aVar == null) {
            return;
        }
        aVar.init(this);
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else if (this.mInteractPanelView == null) {
        } else {
            if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.admireInfo != null && this.mLiveDataModel.mVideoInfo.admireInfo.enableInvisibility) {
                InteractiveComponent interactiveComponent = new InteractiveComponent();
                interactiveComponent.isShowInInteractivePanel = true;
                interactiveComponent.interactivePanelDisplayOnly = true;
                interactiveComponent.isNeedShowEntrance = true;
                interactiveComponent.type = "native";
                interactiveComponent.showOrder = 0;
                interactiveComponent.migrationFlag = true;
                interactiveComponent.iconAction = "event";
                interactiveComponent.iconUrl = "https://gw.alicdn.com/imgextra/i1/O1CN01aEBXi71JA5p8870Rr_!!6000000000987-2-tps-108-108.png";
                interactiveComponent.fedName = "bigRInvisibility";
                interactiveComponent.label = "打赏隐身";
                interactiveComponent.panelTitle = "打赏隐身";
                this.mInteractPanelView.addNativeComponent(interactiveComponent);
            }
            if (isEnableLikeLive()) {
                InteractiveComponent interactiveComponent2 = new InteractiveComponent();
                interactiveComponent2.isShowInInteractivePanel = true;
                interactiveComponent2.interactivePanelDisplayOnly = true;
                interactiveComponent2.isNeedShowEntrance = true;
                interactiveComponent2.type = "native";
                interactiveComponent2.showOrder = 100000;
                interactiveComponent2.migrationFlag = true;
                interactiveComponent2.iconAction = "event";
                interactiveComponent2.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_link", "https://gw.alicdn.com/imgextra/i3/O1CN01WoZ0pX1QqPd7NfhbA_!!6000000002027-2-tps-120-120.png");
                interactiveComponent2.name = "link";
                interactiveComponent2.fedName = "link";
                interactiveComponent2.label = "连麦";
                interactiveComponent2.panelTitle = "连麦";
                this.mInteractPanelView.addInteractComponent(interactiveComponent2);
            }
            if (isEnableChatRoomLink()) {
                InteractiveComponent interactiveComponent3 = new InteractiveComponent();
                interactiveComponent3.isShowInInteractivePanel = true;
                interactiveComponent3.interactivePanelDisplayOnly = true;
                interactiveComponent3.isNeedShowEntrance = true;
                interactiveComponent3.type = "native";
                interactiveComponent3.showOrder = 100000;
                interactiveComponent3.migrationFlag = true;
                interactiveComponent3.iconAction = "event";
                interactiveComponent3.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_chatroom_link", "https://img.alicdn.com/imgextra/i3/O1CN0144yCXl1euuG9YJGOq_!!6000000003932-2-tps-120-120.png");
                interactiveComponent3.name = "chatRoomLink";
                interactiveComponent3.fedName = "chatRoomLink";
                interactiveComponent3.label = "上麦";
                interactiveComponent3.panelTitle = "上麦";
                this.mInteractPanelView.addInteractComponent(interactiveComponent3);
            }
            if (isEnableJianbao()) {
                InteractiveComponent interactiveComponent4 = new InteractiveComponent();
                interactiveComponent4.isShowInInteractivePanel = true;
                interactiveComponent4.interactivePanelDisplayOnly = true;
                interactiveComponent4.isNeedShowEntrance = true;
                interactiveComponent4.type = "native";
                interactiveComponent4.showOrder = 0;
                interactiveComponent4.migrationFlag = true;
                interactiveComponent4.iconAction = "event";
                interactiveComponent4.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_jianbao", "https://gw.alicdn.com/tfs/TB19F4aWAY2gK0jSZFgXXc5OFXa-136-136.png");
                interactiveComponent4.name = "jianbao";
                interactiveComponent4.fedName = "jianbao";
                interactiveComponent4.label = "鉴宝";
                interactiveComponent4.panelTitle = "鉴宝";
                this.mInteractPanelView.addInteractComponent(interactiveComponent4);
            }
            if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && (d.a(this.mLiveDataModel.mVideoInfo.itemTransferInfo) || f.l().isRewardEnable(this.mLiveDataModel, this.mFrameContext))) {
                this.pcgGift = new InteractiveComponent();
                InteractiveComponent interactiveComponent5 = this.pcgGift;
                interactiveComponent5.isShowInInteractivePanel = true;
                interactiveComponent5.interactivePanelDisplayOnly = true;
                interactiveComponent5.isNeedShowEntrance = true;
                interactiveComponent5.type = "native";
                interactiveComponent5.showOrder = 0;
                interactiveComponent5.migrationFlag = true;
                interactiveComponent5.iconAction = "event";
                interactiveComponent5.iconUrl = getItemIconUrl(j.a(this.mContext));
                InteractiveComponent interactiveComponent6 = this.pcgGift;
                interactiveComponent6.name = "PcgGift";
                interactiveComponent6.fedName = "PcgGift";
                interactiveComponent6.label = "礼物特效";
                interactiveComponent6.panelTitle = "礼物特效";
                this.mInteractPanelView.addNativeComponent(interactiveComponent6);
            }
            if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.status == 0 && u.az()) {
                InteractiveComponent interactiveComponent7 = new InteractiveComponent();
                interactiveComponent7.isShowInInteractivePanel = true;
                interactiveComponent7.interactivePanelDisplayOnly = true;
                interactiveComponent7.isNeedShowEntrance = true;
                interactiveComponent7.type = "native";
                interactiveComponent7.showOrder = 0;
                interactiveComponent7.migrationFlag = true;
                interactiveComponent7.iconAction = "event";
                interactiveComponent7.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_Quality", "https://img.alicdn.com/imgextra/i2/O1CN018jEBrO1qYFwCT4Bww_!!6000000005507-2-tps-108-108.png");
                interactiveComponent7.name = "quality";
                interactiveComponent7.fedName = "quality";
                interactiveComponent7.label = "清晰度";
                interactiveComponent7.panelTitle = "清晰度";
                this.mInteractPanelView.addNativeComponent(interactiveComponent7);
            }
            if (this.mFrameContext == null || this.mFrameContext.o() == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.mFrameContext.o().bizCode)) {
                addSmallWindowSetting(this.mLiveDataModel);
                addProjectScreen(this.mLiveDataModel);
            }
            addPip(this.mLiveDataModel);
            addRefund(this.mLiveDataModel);
            initNegativeFeedback(this.mLiveDataModel);
            addShare(this.mLiveDataModel);
            addReport();
        }
    }

    private boolean isEnableLikeLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97454c1b", new Object[]{this})).booleanValue();
        }
        if (!bcEntranceHidden() && f.j() != null && f.j().enableLinkLive3()) {
            return f.j().enableLiveLink(this.mFrameContext, this.mLiveDataModel);
        }
        return false;
    }

    private boolean isEnableChatRoomLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d864665", new Object[]{this})).booleanValue() : this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && "chatroom".equals(this.mLiveDataModel.mVideoInfo.liveBizType) && aa.U() && this.mLiveDataModel.mVideoInfo.linkage != null && this.mLiveDataModel.mVideoInfo.linkage.bcChatroom;
    }

    private boolean isEnableJianbao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("770d27e2", new Object[]{this})).booleanValue();
        }
        if (!bcEntranceHidden() && f.j() != null && f.j().enableLinkLive3()) {
            return f.j().enableJianBao(this.mFrameContext, this.mLiveDataModel);
        }
        return false;
    }

    private boolean bcEntranceHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5153d2ac", new Object[]{this})).booleanValue() : (this.mFrameContext instanceof com.taobao.taolive.sdk.core.e) && ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o() != null && ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o().abilityCompontent != null && !((com.taobao.taolive.sdk.core.e) this.mFrameContext).o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Link);
    }

    private e getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a8e86078", new Object[]{this});
        }
        if (!(this.mFrameContext instanceof phq)) {
            return null;
        }
        return ((phq) this.mFrameContext).p();
    }

    @Override // com.taobao.tbliveinteractive.view.panel.b
    public void OnClickInteractPanelNativeListener(String str) {
        phf phfVar;
        phf phfVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee2101", new Object[]{this, str});
            return;
        }
        String G = this.mFrameContext != null ? this.mFrameContext.G() : null;
        if ("link".equals(str)) {
            ddw.a().a(xkw.EVENT_START_LINKLIVE, null, G);
        }
        if ("chatRoomLink".equals(str)) {
            ddw.a().a(xkw.EVENT_START_CHATROOM_LINK, null, G);
        } else if ("gift".equals(str)) {
            ddw.a().a("com.taobao.taolive.room.show_gift_list_window", null, G);
        } else if ("jianbao".equals(str)) {
            ddw.a().a(xkw.EVENT_START_JIANBAO, null, G);
        } else if ("quality".equals(str)) {
            ddw.a().a("com.taobao.taolive.room.start_quality", null, G);
        } else if ("pip".equals(str)) {
            this.mFrameContext.e().a("com.taobao.taolive.room.show_global_miniLive", null, G);
            ai.a(this.mFrameContext, "ZoomToMiniPlay", new String[0]);
            if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || TextUtils.isEmpty(this.mLiveDataModel.mVideoInfo.liveId)) {
                return;
            }
            ae.b("taolive_timemove_back", this.mLiveDataModel.mVideoInfo.liveId);
        } else if ("notWatchClick".equals(str)) {
            VideoInfo.Feedback feedback = this.mFeedbackHashMap.get(str);
            if (feedback == null || (phfVar2 = this.mNegativeFeedbackHandler) == null) {
                return;
            }
            phfVar2.a(feedback);
        } else if ("reduceClick".equals(str)) {
            VideoInfo.Feedback feedback2 = this.mFeedbackHashMap.get(str);
            if (feedback2 == null || (phfVar = this.mNegativeFeedbackHandler) == null) {
                return;
            }
            phfVar.b(feedback2);
        } else if ("PcgGift".equals(str)) {
            if (this.pcgGift == null) {
                return;
            }
            boolean z = !j.a(this.mContext);
            if (am.a()) {
                f.x().setGuestSendGiftEffectStatus(z);
            }
            j.a(this.mContext, z);
            updatePcgGiftItemIconUrl(z);
        } else if (TextUtils.equals("refund", str)) {
            Nav.from(this.mContext).toUri(qne.a("refund_url", phg.d().b() == 1 ? "https://web.wapa.taobao.com/app/mtb/teenager-refund/home" : "https://web.m.taobao.com/app/mtb/teenager-refund/home"));
        } else if (TextUtils.equals("share", str)) {
            ddw.a().a("com.taobao.taolive.room.more.share.click", null, G);
        } else if (KEY_PROJECT_SCREEN.equals(str)) {
            ddw.a().a(xkw.EVENT_PROJECT_SCREEN_SHOW, null, G);
        } else if ("smallwindowsetting".equals(str)) {
            if (this.mSmallWindowSettingDialog == null) {
                this.mSmallWindowSettingDialog = SmallWindowSettingDialog.newInstance(this.mFrameContext);
            }
            if (this.mContext == null || this.mSmallWindowSettingDialog.isVisible()) {
                return;
            }
            this.mSmallWindowSettingDialog.show(((FragmentActivity) this.mContext).getSupportFragmentManager(), "smallWindowDialog");
        } else if ("bigRInvisibility".equals(str)) {
            if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.admireInfo == null || this.mLiveDataModel.mVideoInfo.admireInfo.invisibilityJumpInfo == null) {
                return;
            }
            this.mFrameContext.e().a(xkw.EVENT_HANDLE_JUMP_INFO, this.mLiveDataModel.mVideoInfo.admireInfo.invisibilityJumpInfo);
        } else if (!"reportLiveRoom".equals(str) || !aa.cR()) {
        } else {
            ddw.a().a(pfd.EVENT_START_REPORT, null, G);
        }
    }

    private void addPip(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70312e76", new Object[]{this, tBLiveDataModel});
        } else if (poy.af(this.mFrameContext) || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo.closeXiaochuang) {
        } else {
            boolean componentEntranceHidden = ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_MINI_BUTTON, this.mFrameContext);
            boolean av = poy.av(this.mFrameContext);
            if (componentEntranceHidden || !av || this.mFrameContext.m()) {
                return;
            }
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = 0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_Pip", "https://img.alicdn.com/imgextra/i3/O1CN01YXDAnQ1ppN7asBMwb_!!6000000005409-2-tps-108-108.png");
            interactiveComponent.name = "pip";
            interactiveComponent.fedName = "pip";
            interactiveComponent.label = "小窗播放";
            interactiveComponent.panelTitle = "小窗播放";
            this.mInteractPanelView.addNativeComponent(interactiveComponent);
        }
    }

    private void addReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743ddf3c", new Object[]{this});
        } else if (!aa.cR() || ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_REPORT_LIVE_ROOM, this.mFrameContext)) {
        } else {
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = 0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_reportLiveRoom", "https://gw.alicdn.com/imgextra/i3/O1CN01nIYNPV1pppfsyeOm8_!!6000000005410-2-tps-108-108.png");
            interactiveComponent.name = "reportLiveRoom";
            interactiveComponent.fedName = "reportLiveRoom";
            interactiveComponent.label = "直播举报";
            interactiveComponent.panelTitle = "直播举报";
            this.mInteractPanelView.addNativeComponent(interactiveComponent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void addRefund(com.taobao.taolive.sdk.model.TBLiveDataModel r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.room.ui.interactpanel.InteractPanelFrameSDK.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r1[r3] = r6
            java.lang.String r6 = "ef120df9"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            com.taobao.alilive.aliliveframework.frame.a r0 = r5.mFrameContext
            java.lang.String r1 = "BottomGroup"
            java.lang.String r4 = "RefundForMinors"
            boolean r0 = com.taobao.taolive.sdk.configurable.ComponentGroupConfig.componentEntranceHidden(r1, r4, r0)
            boolean r1 = com.taobao.taolive.room.utils.aa.bv()
            if (r1 == 0) goto L78
            if (r0 != 0) goto L78
            com.taobao.taolive.sdk.model.common.VideoInfo r6 = r6.mVideoInfo     // Catch: java.lang.Exception -> L33
            com.taobao.taolive.sdk.model.common.VideoInfo$AdmireInfo r6 = r6.admireInfo     // Catch: java.lang.Exception -> L33
            if (r6 == 0) goto L40
            boolean r6 = r6.juvenileRefund     // Catch: java.lang.Exception -> L33
            if (r6 == 0) goto L40
            r6 = 1
            goto L41
        L33:
            r6 = move-exception
            r6.printStackTrace()
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "InteractPanelFrameSDK"
            com.taobao.taolive.sdk.utils.q.b(r0, r6)
        L40:
            r6 = 0
        L41:
            if (r6 == 0) goto L78
            com.taobao.tbliveinteractive.InteractiveComponent r6 = new com.taobao.tbliveinteractive.InteractiveComponent
            r6.<init>()
            r6.isShowInInteractivePanel = r3
            r6.interactivePanelDisplayOnly = r3
            r6.isNeedShowEntrance = r3
            java.lang.String r0 = "native"
            r6.type = r0
            r6.showOrder = r2
            r6.migrationFlag = r3
            java.lang.String r0 = "event"
            r6.iconAction = r0
            java.lang.String r0 = "TaoLiveConfig_InteractPanel2_refund"
            java.lang.String r1 = "https://gw.alicdn.com/imgextra/i1/O1CN01xGdE7n1hKfgpOiOn8_!!6000000004259-2-tps-108-108.png"
            java.lang.String r0 = tb.qne.a(r0, r1)
            r6.iconUrl = r0
            java.lang.String r0 = "refund"
            r6.name = r0
            r6.fedName = r0
            java.lang.String r0 = "未成年退款"
            r6.label = r0
            r6.panelTitle = r0
            com.taobao.tbliveinteractive.view.panel.a r0 = r5.mInteractPanelView
            r0.addNativeComponent(r6)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.ui.interactpanel.InteractPanelFrameSDK.addRefund(com.taobao.taolive.sdk.model.TBLiveDataModel):void");
    }

    private void addShare(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47daaefe", new Object[]{this, tBLiveDataModel});
        } else if (ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_SHARE_BUTTON, this.mFrameContext)) {
        } else {
            if ((!f.l().isRewardEnable(tBLiveDataModel, this.mFrameContext) && !sst.a()) || !f.k().isShareEntryFold()) {
                return;
            }
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = s.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_share", "https://gw.alicdn.com/imgextra/i3/O1CN0132064B29aWem9a9B9_!!6000000008084-2-tps-120-120.png");
            interactiveComponent.name = "share";
            interactiveComponent.fedName = "share";
            interactiveComponent.label = "分享";
            interactiveComponent.panelTitle = "分享";
            this.mInteractPanelView.addInteractComponent(interactiveComponent);
        }
    }

    private void addProjectScreen(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8927c384", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || !tBLiveDataModel.mVideoInfo.enableProjectScreen()) {
        } else {
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = 0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_screen", "https://gw.alicdn.com/imgextra/i1/O1CN01kUbyKB26zlfa6qqK9_!!6000000007733-2-tps-108-108.png");
            interactiveComponent.name = KEY_PROJECT_SCREEN;
            interactiveComponent.fedName = KEY_PROJECT_SCREEN;
            interactiveComponent.label = "投屏";
            interactiveComponent.panelTitle = "投屏";
            this.mInteractPanelView.addNativeComponent(interactiveComponent);
        }
    }

    private void addSmallWindowSetting(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295cad3a", new Object[]{this, tBLiveDataModel});
        } else if (y.a() && y.e(this.mContext)) {
        } else {
            if ((this.mFrameContext != null && (this.mFrameContext.z() instanceof com.taobao.taolive.sdk.controller.e) && !((com.taobao.taolive.sdk.controller.e) this.mFrameContext.z()).z()) || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo.closeXiaochuang) {
                return;
            }
            InteractiveComponent interactiveComponent = new InteractiveComponent();
            interactiveComponent.isShowInInteractivePanel = true;
            interactiveComponent.interactivePanelDisplayOnly = true;
            interactiveComponent.isNeedShowEntrance = true;
            interactiveComponent.type = "native";
            interactiveComponent.showOrder = 0;
            interactiveComponent.migrationFlag = true;
            interactiveComponent.iconAction = "event";
            interactiveComponent.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_Window_Setting", "https://gw.alicdn.com/imgextra/i4/O1CN01EAQzZe1SymBWLoVKp_!!6000000002316-2-tps-108-108.png");
            interactiveComponent.name = "smallwindowsetting";
            interactiveComponent.fedName = "smallwindowsetting";
            interactiveComponent.label = "小窗设置";
            interactiveComponent.panelTitle = "小窗设置";
            this.mInteractPanelView.addNativeComponent(interactiveComponent);
        }
    }

    public void initNegativeFeedback(final TBLiveDataModel tBLiveDataModel) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8878404a", new Object[]{this, tBLiveDataModel});
        } else if (this.mFrameContext == null || ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o() == null || (o = ((com.taobao.taolive.sdk.core.e) this.mFrameContext).o()) == null || o.abilityCompontent == null || o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_NegativeFeedback)) {
            if (c.a().d()) {
                initNegativeFeedbackHandler(tBLiveDataModel);
            } else {
                c.a().a(new c.b() { // from class: com.taobao.taolive.room.ui.interactpanel.InteractPanelFrameSDK.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            InteractPanelFrameSDK.access$000(InteractPanelFrameSDK.this, tBLiveDataModel);
                        }
                    }
                });
            }
            if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || tBLiveDataModel.mVideoInfo.feedBackList == null) {
                return;
            }
            for (VideoInfo.Feedback feedback : tBLiveDataModel.mVideoInfo.feedBackList) {
                if (VideoInfo.Feedback.TYPE_NOT_WATCH.equals(feedback.type)) {
                    addNotWatchClick(feedback);
                } else if (VideoInfo.Feedback.TYPE_REDUCE_RECOMMEND.equals(feedback.type)) {
                    addReduceClick(feedback);
                }
            }
        }
    }

    private void initNegativeFeedbackHandler(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0bd4ea0", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || tBLiveDataModel.mVideoInfo.feedBackList == null || f.o() == null) {
        } else {
            this.mNegativeFeedbackHandler = f.o().createNegativeFeedbackHandler(this.mContext, tBLiveDataModel, this.mFrameContext);
        }
    }

    private void addNotWatchClick(VideoInfo.Feedback feedback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19542f0c", new Object[]{this, feedback});
            return;
        }
        InteractiveComponent interactiveComponent = new InteractiveComponent();
        interactiveComponent.isShowInInteractivePanel = true;
        interactiveComponent.interactivePanelDisplayOnly = true;
        interactiveComponent.isNeedShowEntrance = true;
        interactiveComponent.type = "native";
        interactiveComponent.showOrder = 0;
        interactiveComponent.migrationFlag = true;
        interactiveComponent.iconAction = "event";
        interactiveComponent.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_notWatchClick", "https://img.alicdn.com/imgextra/i1/O1CN012MSgKh1L138TYOYXv_!!6000000001238-2-tps-108-108.png");
        interactiveComponent.name = "notWatchClick";
        interactiveComponent.fedName = "notWatchClick";
        interactiveComponent.label = "不看Ta";
        interactiveComponent.panelTitle = "不看Ta";
        this.mInteractPanelView.addNativeComponent(interactiveComponent);
        this.mFeedbackHashMap.put(interactiveComponent.name, feedback);
    }

    private void addReduceClick(VideoInfo.Feedback feedback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334c0062", new Object[]{this, feedback});
            return;
        }
        InteractiveComponent interactiveComponent = new InteractiveComponent();
        interactiveComponent.isShowInInteractivePanel = true;
        interactiveComponent.interactivePanelDisplayOnly = true;
        interactiveComponent.isNeedShowEntrance = true;
        interactiveComponent.type = "native";
        interactiveComponent.showOrder = 0;
        interactiveComponent.migrationFlag = true;
        interactiveComponent.iconAction = "event";
        interactiveComponent.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_reduceClick", "https://img.alicdn.com/imgextra/i1/O1CN018LnYPz1wESVrzYZ3L_!!6000000006276-2-tps-108-108.png");
        interactiveComponent.name = "reduceClick";
        interactiveComponent.fedName = "reduceClick";
        interactiveComponent.label = "减少此内容";
        interactiveComponent.panelTitle = "减少此内容";
        this.mInteractPanelView.addNativeComponent(interactiveComponent);
        this.mFeedbackHashMap.put(interactiveComponent.name, feedback);
    }

    private void updatePcgGiftItemIconUrl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f236a5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z && am.a()) {
            f.x().clearGiftQueue();
        }
        this.pcgGift.iconUrl = qne.a("TaoLiveConfig_InteractPanel2_Quality", getItemIconUrl(z));
        this.mInteractPanelView.addNativeComponent(this.pcgGift);
        plk.a(this.mContext, z ? aw.ALLOW_GIFT_EFFECT : aw.DISALLOW_GIFT_EFFECT);
    }
}
