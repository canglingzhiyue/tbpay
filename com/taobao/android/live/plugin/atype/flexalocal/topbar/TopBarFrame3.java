package com.taobao.android.live.plugin.atype.flexalocal.topbar;

import android.content.Context;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.FollowFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.official.OfficialLiveTopBarEntryFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.c;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.ddv;
import tb.hgs;
import tb.hkk;
import tb.hkm;
import tb.kge;
import tb.phg;
import tb.ply;
import tb.plz;
import tb.pmd;
import tb.xkw;

/* loaded from: classes6.dex */
public class TopBarFrame3 extends BaseFrame implements d, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TopBarFrame3";
    private LottieAnimationView flashLottieView;
    private final Handler mAsyncInflateHandler;
    private TUrlImageView mAvatarViewBoard;
    private final Handler mMainHandler;
    private a officialEnhanceAnimatorManager;
    private View.OnLayoutChangeListener onLayoutChangeListener;
    private LinearLayout topBarContainer;

    static {
        kge.a(287418441);
        kge.a(191318335);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(TopBarFrame3 topBarFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "FavorAnimView2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-top-bar";
    }

    public static /* synthetic */ LottieAnimationView access$000(TopBarFrame3 topBarFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LottieAnimationView) ipChange.ipc$dispatch("afa466e3", new Object[]{topBarFrame3}) : topBarFrame3.flashLottieView;
    }

    public TopBarFrame3(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mAsyncInflateHandler = new Handler(Coordinator.getWorkerLooper());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        initAnchorInfo();
        initFollow();
        initOfficialLiveEntry();
        this.topBarContainer = (LinearLayout) view.findViewById(R.id.taolive_topbar_container);
        this.mAvatarViewBoard = (TUrlImageView) view.findViewById(R.id.taolive_avatar_view_border);
        this.flashLottieView = (LottieAnimationView) view.findViewById(R.id.taolive_flash_lottie_view);
        e.c("TopBarFrame3: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_topbar_frame_topbar3_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (this.mFrameContext != null && this.mFrameContext.d() != null) {
            this.mFrameContext.d().a(this);
        }
        this.mFrameContext.e().a(this);
        adjustLayoutParams();
        updateView();
        setAvatarFrame();
        if (hkk.B() && b.a().b(this.mLiveDataModel)) {
            addOnLayoutChangeListener();
            startOfficialEnhanceAnimator();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("location", "live");
        hashMap.put("isRemote", String.valueOf(hkm.a()));
        pmd.a().e().b("Page_TaobaoLiveWatch", "HeadPortrait", hashMap);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.mFrameContext != null && this.mFrameContext.d() != null) {
            this.mFrameContext.d().b(this);
        }
        this.mFrameContext.e().b(this);
        if (!hkk.B() || !b.a().b(this.mLiveDataModel)) {
            return;
        }
        a aVar = this.officialEnhanceAnimatorManager;
        if (aVar != null) {
            aVar.b();
        }
        LinearLayout linearLayout = this.topBarContainer;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (pmd.a().n() == null || netResponse == null) {
        } else {
            pmd.a().n().a("taolive", netResponse.getApi());
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", netResponse.getApi(), netResponse.getRetCode(), netResponse.getRetMsg());
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    private Handler getAsyncHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("4e5fe2bb", new Object[]{this}) : this.mAsyncInflateHandler;
    }

    private Handler getMainHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this}) : this.mMainHandler;
    }

    private void initAnchorInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d200993a", new Object[]{this});
            return;
        }
        AnchorInfoFrame anchorInfoFrame = new AnchorInfoFrame(this.mContext, this.mFrameContext);
        Handler mainHandler = getMainHandler();
        Handler asyncHandler = getAsyncHandler();
        if (mainHandler != null && asyncHandler != null) {
            anchorInfoFrame.asyncRenderComponentWithSerialFrameInstaller(this, (ViewGroup) findViewById(R.id.taolive_avatar_info_content), (ViewStub) findViewById(R.id.taolive_avatar_info_stub), asyncHandler, mainHandler, null, 0L);
            return;
        }
        anchorInfoFrame.createView((ViewStub) findViewById(R.id.taolive_avatar_info_stub));
        addComponent(anchorInfoFrame);
    }

    private void initFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaface8", new Object[]{this});
            return;
        }
        FollowFrame followFrame = new FollowFrame(this.mContext, this.mFrameContext);
        Handler mainHandler = getMainHandler();
        Handler asyncHandler = getAsyncHandler();
        if (mainHandler != null && asyncHandler != null) {
            followFrame.asyncRenderComponentWithSerialFrameInstaller(this, (ViewGroup) findViewById(R.id.taolive_avatar_info_content), (ViewStub) findViewById(R.id.taolive_follow_stub), asyncHandler, mainHandler, null, 0L);
            return;
        }
        followFrame.createView((ViewStub) findViewById(R.id.taolive_follow_stub));
        addComponent(followFrame);
    }

    private void initOfficialLiveEntry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3005c12", new Object[]{this});
        } else if (b.a().a(this.mFrameContext) || !hkk.o() || phg.d().a()) {
        } else {
            OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame = new OfficialLiveTopBarEntryFrame(this.mContext, this.mFrameContext);
            officialLiveTopBarEntryFrame.keepViewStubWithoutInflate((ViewStub) findViewById(R.id.taolive_official_live_entry_stub));
            officialLiveTopBarEntryFrame.setAvatarLayout((ViewGroup) findViewById(R.id.taolive_avatar_info_content));
            addComponent(officialLiveTopBarEntryFrame);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!xkw.EVENT_MEDIAPLATFORM_CONTAINER_LOAD_FAIL.equals(str) || !hideTopbar() || getComponentView() == null || getComponentView().getVisibility() != 4) {
        } else {
            show();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_MEDIAPLATFORM_CONTAINER_LOAD_FAIL};
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

    private boolean hideTopbar() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c4530b", new Object[]{this})).booleanValue();
        }
        if (this.mLiveDataModel != null && (videoInfo = this.mLiveDataModel.mVideoInfo) != null && videoInfo.hiddenElementList != null && videoInfo.hiddenElementList.length > 0) {
            for (int i = 0; i < videoInfo.hiddenElementList.length; i++) {
                if ("topBar".equals(videoInfo.hiddenElementList[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        if (hideTopbar()) {
            hide();
        }
        if (!hgs.x() || this.flashLottieView == null) {
            return;
        }
        if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.officialLiveInfo != null && b.a().b(this.mLiveDataModel)) {
            this.flashLottieView.setVisibility(0);
        } else {
            this.flashLottieView.setVisibility(8);
        }
    }

    private void adjustLayoutParams() {
        ATaoLiveOpenEntity o;
        Float aR_;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        if (marginLayoutParams == null) {
            if (pmd.a().m() == null) {
                return;
            }
            pmd.a().m().a("TopBarFrame_adjustLayoutParams", getComponentView().toString());
            return;
        }
        marginLayoutParams.topMargin = 0;
        float f = 0.0f;
        if (phg.d().a() || this.mFrameContext == null || (o = this.mFrameContext.o()) == null || o.uiCompontent == null || o.uiCompontent.a() == null || (aR_ = o.uiCompontent.a().aR_()) == null || aR_.floatValue() <= 0.0f || aR_.floatValue() > 500.0f) {
            z = false;
        } else {
            f = aR_.floatValue();
        }
        if (this.mFrameContext.m()) {
            if (!phg.d().a() && getFrameContext() != null && phg.a() != null) {
                marginLayoutParams.topMargin += phg.a().b(this.mFrameContext);
            }
            marginLayoutParams.topMargin += com.taobao.taolive.room.utils.d.a(this.mContext, 7.0f);
        } else if (plz.d(this.mLiveDataModel.mVideoInfo) || plz.b(this.mLiveDataModel.mVideoInfo)) {
            if (!this.mLandscape) {
                marginLayoutParams.topMargin += plz.a(this.mContext);
                marginLayoutParams.topMargin += com.taobao.taolive.room.utils.d.a(this.mContext, 7.0f);
            } else if (ply.aa()) {
                marginLayoutParams.topMargin += c.c;
            } else {
                marginLayoutParams.topMargin += com.taobao.taolive.room.utils.d.a(this.mContext, 12.0f);
            }
        } else if (z) {
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin + f);
        } else if (!this.mLandscape) {
            if (ply.aa()) {
                marginLayoutParams.topMargin += Math.max(c.b, c.c);
            } else {
                marginLayoutParams.topMargin += c.b;
            }
            marginLayoutParams.topMargin += com.taobao.taolive.room.utils.d.a(this.mContext, 12.0f);
        } else if (ply.aa()) {
            marginLayoutParams.topMargin += c.c;
        } else {
            marginLayoutParams.topMargin += com.taobao.taolive.room.utils.d.a(this.mContext, 12.0f);
        }
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    private void setAvatarFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4ed59", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        if (videoInfo != null && videoInfo.broadCaster != null && videoInfo.broadCaster.atmosphere != null && !StringUtils.isEmpty(videoInfo.broadCaster.atmosphere.headIcon)) {
            this.mAvatarViewBoard.setVisibility(0);
            this.mAvatarViewBoard.setImageUrl(videoInfo.broadCaster.atmosphere.headIcon);
            return;
        }
        this.mAvatarViewBoard.setVisibility(4);
    }

    private void startOfficialEnhanceAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94e930f", new Object[]{this});
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) {
        } else {
            VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
            if (videoInfo.originalData == null || videoInfo.originalData.getJSONObject("officialLiveInfo") == null || videoInfo.originalData.getJSONObject("officialLiveInfo").getString("officialLiveAtmosphereLottieUrl") == null) {
                return;
            }
            String string = this.mLiveDataModel.mVideoInfo.originalData.getJSONObject("officialLiveInfo").getString("officialLiveAtmosphereLottieUrl");
            if (this.officialEnhanceAnimatorManager == null) {
                this.officialEnhanceAnimatorManager = new a(this.mContext, this.mAvatarViewBoard, this.flashLottieView);
            }
            this.officialEnhanceAnimatorManager.a(string);
            this.officialEnhanceAnimatorManager.a();
        }
    }

    private void addOnLayoutChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780c1255", new Object[]{this});
            return;
        }
        if (this.onLayoutChangeListener == null) {
            this.onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.TopBarFrame3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    } else if (TopBarFrame3.access$000(TopBarFrame3.this) == null) {
                    } else {
                        final int i9 = i3 - i;
                        final int i10 = i4 - i2;
                        TopBarFrame3.access$000(TopBarFrame3.this).getLayoutParams().width = i9;
                        TopBarFrame3.access$000(TopBarFrame3.this).getLayoutParams().height = i10;
                        TopBarFrame3.access$000(TopBarFrame3.this).setLayoutParams(TopBarFrame3.access$000(TopBarFrame3.this).getLayoutParams());
                        TopBarFrame3.access$000(TopBarFrame3.this).setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.TopBarFrame3.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.ViewOutlineProvider
                            public void getOutline(View view2, Outline outline) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                                } else {
                                    outline.setRoundRect(0, 0, i9, i10, com.taobao.taolive.room.utils.d.a(TopBarFrame3.this.mContext, 18.0f));
                                }
                            }
                        });
                        TopBarFrame3.access$000(TopBarFrame3.this).setClipToOutline(true);
                    }
                }
            };
        }
        LinearLayout linearLayout = this.topBarContainer;
        if (linearLayout == null) {
            return;
        }
        linearLayout.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }
}
