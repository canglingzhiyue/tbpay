package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.dds;
import tb.ddw;
import tb.hgs;
import tb.hkl;
import tb.kge;
import tb.poy;

/* loaded from: classes5.dex */
public class FullScreenReplayFrame2 extends AbsFullScreenFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1595533201);
    }

    public static /* synthetic */ Object ipc$super(FullScreenReplayFrame2 fullScreenReplayFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            case 1087027639:
                super.clearComponent();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "FullScreenReplayFrame2";
    }

    public FullScreenReplayFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_live_2_flexalocal, viewGroup);
        initAll();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void showByStatus() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85294ecd", new Object[]{this});
            return;
        }
        showReplay();
        VideoInfo a2 = k.a(this.mLiveDataModel);
        if (a2 == null || !this.mLandscape || this.mFrontView == null || !a2.publishCommentsUseMtop || !a2.fetchCommentsUseMtop || (linearLayout = (LinearLayout) this.mFrontView.findViewById(R.id.taolive_bottom_bar)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, this.mContext.getResources().getDimensionPixelSize(R.dimen.taolive_default_progressbar_heigh_flexalocal));
    }

    public void showReplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a15fcb", new Object[]{this});
            return;
        }
        VideoInfo a2 = k.a(this.mLiveDataModel);
        if (a2 != null && a2.publishCommentsUseMtop && a2.fetchCommentsUseMtop) {
            initChat();
            initUserRecExp();
            initInput();
            initFavor();
        }
        initVirtualAnchor();
        initLiveAvatarNewCardFrame();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if (!FullScreenFrame.EVENT_ROOT_VIEW_CLICK.equals(str) || this.mViewPager.getCurrentItem() != 0) {
            return;
        }
        ddw.a().a(FullScreenFrame.EVENT_CLICK_ROOT_VIEW_FOR_REPLAY, null, this.mFrameContext.G());
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

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ddw.a().a(this);
        if (!hgs.c()) {
            return;
        }
        getMessageInfo();
    }

    private void destroy() {
        dds liveDetailMessInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        if (!hgs.c() || hkl.a().b() == null || hkl.a().b().getLiveDetailMessInfo(this.mFrameContext) == null || (liveDetailMessInfo = hkl.a().b().getLiveDetailMessInfo(this.mFrameContext)) == null) {
            return;
        }
        liveDetailMessInfo.a();
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void clearComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cab9b7", new Object[]{this});
        } else {
            super.clearComponent();
        }
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

    private void initVirtualAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff796af7", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_VIRTUAL_HOST_TAG, this.mFrameContext) || this.mLiveDetailData.roomType != 8888) {
        } else {
            BaseFrame virtualAnchorSignFrame = f.g().getVirtualAnchorSignFrame(this.mContext, this.mFrameContext);
            ViewStub viewStub = (ViewStub) findViewById(R.id.taolive_virtual_anchor_stub);
            if (viewStub == null && this.mFrontView != null) {
                viewStub = (ViewStub) this.mFrontView.findViewById(R.id.taolive_virtual_anchor_stub);
            }
            if (viewStub == null) {
                return;
            }
            virtualAnchorSignFrame.createView(viewStub);
            addComponent(virtualAnchorSignFrame);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else {
            super.handleMessage(message);
        }
    }
}
