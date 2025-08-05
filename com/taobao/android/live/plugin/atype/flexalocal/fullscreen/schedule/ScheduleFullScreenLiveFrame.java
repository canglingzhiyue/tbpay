package com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.IComponent;
import com.taobao.android.fluid.launcher.task.a;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;
import tb.mri;
import tb.mrj;
import tb.mro;
import tb.mrp;
import tb.mrq;
import tb.mrr;
import tb.mrs;
import tb.mrt;
import tb.mru;
import tb.mrv;
import tb.mrw;
import tb.mrx;
import tb.mry;
import tb.mrz;
import tb.pmd;
import tb.rhb;
import tb.rhc;

/* loaded from: classes5.dex */
public class ScheduleFullScreenLiveFrame extends FullScreenLiveFrame2 implements ISmartLandingProxy.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FLUID_LAUNCHER_BIZ_NAME = "live_scroll";
    private static final String TAG = "ScheduleFullScreenLiveFrame";
    private final Handler mAsyncInflateHandler;
    private final mrq mBottomGroupFrames;
    private rhb mFluidLauncher;
    private final List<a> mFluidTaskList;
    private final mrr mLeftBottomGroupFrames;
    private final mrs mLeftTopGroupFrames;
    private boolean mNeedLaunchFluidWithDataBind;
    private final mrt mNonFirstScreenFrames;
    private final mru mNonGroupFrames;
    private final mrv mNonUIFrames;
    private final Set<IComponent> mPipelineComponents;
    private final mrw mRightBottomGroupFrames;
    private final mrx mRightTopGroupFrames;
    private final mry mTopGroupFrames;

    static {
        kge.a(-126956993);
        kge.a(1127702471);
    }

    public static /* synthetic */ Object ipc$super(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1073179481:
                super.onFreezeLayout();
                return null;
            case -908767872:
                super.onUnfreezeLayout();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case -233512811:
                super.initFavor();
                return null;
            case 690752966:
                super.onBindData((TBLiveDataModel) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean childrenAppearImmediately() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b790d775", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ List access$000(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2a69065c", new Object[]{scheduleFullScreenLiveFrame}) : scheduleFullScreenLiveFrame.mFluidTaskList;
    }

    public ScheduleFullScreenLiveFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mFluidLauncher = null;
        this.mTopGroupFrames = new mry();
        this.mLeftTopGroupFrames = new mrs();
        this.mLeftBottomGroupFrames = new mrr();
        this.mRightTopGroupFrames = new mrx();
        this.mRightBottomGroupFrames = new mrw();
        this.mBottomGroupFrames = new mrq();
        this.mNonGroupFrames = new mru();
        this.mNonUIFrames = new mrv();
        this.mNonFirstScreenFrames = new mrt();
        this.mPipelineComponents = new HashSet();
        this.mFluidTaskList = new ArrayList();
        this.mAsyncInflateHandler = new Handler(Coordinator.getWorkerLooper());
        this.mNeedLaunchFluidWithDataBind = false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onFreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00894a7", new Object[]{this});
            return;
        }
        super.onFreezeLayout();
        rhb rhbVar = this.mFluidLauncher;
        if (rhbVar == null) {
            return;
        }
        rhbVar.b();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onUnfreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d54d80", new Object[]{this});
            return;
        }
        super.onUnfreezeLayout();
        rhb rhbVar = this.mFluidLauncher;
        if (rhbVar == null) {
            return;
        }
        rhbVar.a();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mNeedLaunchFluidWithDataBind = false;
        rhb rhbVar = this.mFluidLauncher;
        if (rhbVar == null) {
            return;
        }
        rhbVar.b();
        this.mFluidLauncher.c();
        this.mFluidLauncher = null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onBindData(TBLiveDataModel tBLiveDataModel) {
        rhb rhbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c0dc6", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onBindData(tBLiveDataModel);
        if (!this.mNeedLaunchFluidWithDataBind || (rhbVar = this.mFluidLauncher) == null) {
            return;
        }
        rhbVar.a();
        this.mNeedLaunchFluidWithDataBind = false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        for (IComponent iComponent : this.mComponents) {
            if (!this.mPipelineComponents.contains(iComponent)) {
                iComponent.onDidAppear();
            } else if (iComponent.getComponentView() != null) {
                iComponent.getComponentView().setVisibility(8);
            }
        }
        registerSmartLanding();
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
    public boolean a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ca495b6", new Object[]{this, str, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject != null && jSONObject.containsKey("isNeedFirstLoad") && jSONObject.getBoolean("isNeedFirstLoad").booleanValue()) {
            initLauncherAndSubmitTask(true);
        } else {
            initLauncherAndSubmitTask(false);
        }
        return true;
    }

    private boolean enableRegisterSmartLanding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51b722ff", new Object[]{this})).booleanValue() : Boolean.parseBoolean(pmd.a().d().a("tblive", "enableRegisterSmartLanding", "true"));
    }

    private void registerSmartLanding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7b7258", new Object[]{this});
        } else if (this.mFrameContext.z().F != null && enableRegisterSmartLanding()) {
            this.mFrameContext.z().F.a(true, "targetAlive", this);
        } else {
            initLauncherAndSubmitTask(false);
        }
    }

    private void initLauncherAndSubmitTask(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d315a9", new Object[]{this, new Boolean(z)});
        } else if (this.mFluidLauncher != null) {
        } else {
            if (b.b()) {
                Context context = this.mContext;
                StringBuilder sb = new StringBuilder();
                sb.append("Fluid组件加载，互动层立刻加载：");
                if (z || !fromUpDownSwitch()) {
                    z2 = true;
                }
                sb.append(z2);
                w.a(context, sb.toString());
            }
            initFluidLauncher(z);
            if (getLiveDataModel() == null) {
                this.mNeedLaunchFluidWithDataBind = true;
            } else {
                this.mFluidLauncher.a();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
        } else {
            this.mTopGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initOfficialLiveEntry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3005c12", new Object[]{this});
        } else {
            this.mTopGroupFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initQAExplain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf4febe", new Object[]{this});
        } else {
            this.mLeftTopGroupFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initRankLiveEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f0c5", new Object[]{this});
        } else {
            this.mLeftTopGroupFrames.e(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initMessageCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fcf58e", new Object[]{this});
        } else {
            this.mLeftTopGroupFrames.d(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initTopSelectComment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127e0d25", new Object[]{this});
        } else {
            this.mLeftTopGroupFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initSubscribeLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519ad3ad", new Object[]{this});
        } else {
            this.mLeftTopGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8650f", new Object[]{this});
        } else {
            this.mLeftBottomGroupFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initImportantArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e812da6", new Object[]{this});
        } else {
            this.mLeftBottomGroupFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initNewGiftArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2690274", new Object[]{this});
        } else {
            this.mLeftBottomGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
        } else {
            this.mRightTopGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initVirtualAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff796af7", new Object[]{this});
        } else {
            this.mRightTopGroupFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInteractiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496cd19a", new Object[]{this});
        } else {
            this.mRightTopGroupFrames.d(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initInteractiveSystemComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7b0c03", new Object[]{this});
        } else {
            this.mRightTopGroupFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initShowCase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a87b04", new Object[]{this});
        } else {
            this.mRightBottomGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6578b3f", new Object[]{this});
            return;
        }
        this.mBottomBarView = this.mFrontView.findViewById(R.id.taolive_bottom_bar);
        this.mBottomGroupFrames.a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f214e095", new Object[]{this});
        } else if (p.B()) {
            this.mNonGroupFrames.d(this);
        } else {
            super.initFavor();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initLiveEndRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c040864", new Object[]{this});
        } else {
            this.mNonGroupFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initLiveReadyRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964c9d9c", new Object[]{this});
        } else {
            this.mNonGroupFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initFavorEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a68346", new Object[]{this});
        } else {
            this.mNonGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void initLiveAvatarNewCardFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203e9539", new Object[]{this});
        } else {
            this.mNonFirstScreenFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initUserRecExp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2eb0cf", new Object[]{this});
        } else {
            this.mNonFirstScreenFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBoottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8368573", new Object[]{this});
        } else {
            this.mNonFirstScreenFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initNewBottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93123f08", new Object[]{this});
            return;
        }
        this.mBottomNewGuide = (ViewStub) this.mFrontView.findViewById(R.id.taolive_bottom_guide_stub2);
        this.mNonFirstScreenFrames.f(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initB2BConnectingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccd0e26", new Object[]{this});
        } else {
            this.mNonFirstScreenFrames.d(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initH5Container() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
        } else if (ad.a(getFrameContext(), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            q.b("TBLVOpenShopCardComponent", "极简直播间禁用 Alive");
        } else {
            this.mNonFirstScreenFrames.e(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initMediaPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9139264e", new Object[]{this});
        } else {
            this.mNonUIFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void initMoreLiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636e7739", new Object[]{this});
        } else {
            this.mRightTopGroupFrames.a(this, isLandscape());
        }
    }

    private void initFluidLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25c8fe1", new Object[]{this});
        } else {
            initFluidLauncher(false);
        }
    }

    private void initFluidLauncher(boolean z) {
        mri mroVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9361f13", new Object[]{this, new Boolean(z)});
            return;
        }
        mrj mrjVar = new mrj() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mrj
            public List<a> a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (List) ipChange2.ipc$dispatch("627608df", new Object[]{this}) : ScheduleFullScreenLiveFrame.access$000(ScheduleFullScreenLiveFrame.this);
            }
        };
        if (!fromUpDownSwitch() || z) {
            mroVar = new mro();
        } else {
            mroVar = new mrp();
        }
        this.mFluidLauncher = rhb.a(this.mContext, new rhc.a().a(FLUID_LAUNCHER_BIZ_NAME).a(mrjVar).a(mroVar).a());
    }

    public void addFrameInstallTask(BaseFrame baseFrame, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab8dc59", new Object[]{this, baseFrame, str, view});
        } else {
            addFrameInstallTask(null, baseFrame, str, view);
        }
    }

    public void addFrameInstallTask(String str, BaseFrame baseFrame, String str2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36231ce3", new Object[]{this, str, baseFrame, str2, view});
        } else if (baseFrame == null) {
            q.b(TAG, "Add frame task failed, frameGroup: " + str + ", frame: " + baseFrame + ", frameName = " + str2 + ", frameView = " + view);
        } else {
            this.mComponents.add(baseFrame);
            this.mPipelineComponents.add(baseFrame);
            this.mFluidTaskList.add(new mrz(this.mContext, baseFrame, this, view, this.mAsyncInflateHandler));
        }
    }

    public boolean isEntranceHidden(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e39a6be9", new Object[]{this, str, str2})).booleanValue() : ComponentGroupConfig.componentEntranceHidden(str, str2, this.mFrameContext);
    }
}
