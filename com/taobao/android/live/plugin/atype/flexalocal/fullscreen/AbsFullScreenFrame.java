package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.banner.TaoLiveBannerFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideGuideFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideNewGuideFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view.ClickableView;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view.PassEventViewPager;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopFakeBarFrame;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.morelive.TaoMoreLiveRoomFrame;
import com.taobao.taolive.sdk.morelive.TaoliveRoomRightGuideFrame;
import com.taobao.taolive.sdk.morelive.TaoliveRoomTab2RightGuideFrame;
import com.taobao.taolive.sdk.morelive.f;
import com.taobao.taolive.sdk.utils.d;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.deb;
import tb.dec;
import tb.hgs;
import tb.hkk;
import tb.hkl;
import tb.kge;
import tb.phg;
import tb.ply;
import tb.plz;
import tb.poy;
import tb.pqa;
import tb.xkw;

/* loaded from: classes5.dex */
public abstract class AbsFullScreenFrame extends FullScreenFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLEAR_SCREEN_GUIDE_HAS_SHOW = "clearScreenGuideHasShow";
    private static final String TAG = "AbsFullScreenFrame";
    private com.taobao.android.live.plugin.atype.flexalocal.clean.a clearScreenGuideDialog;
    private String immersiveScene;
    public BaseFrame mBlankFrame;
    public View mBottomBarView;
    public ViewStub mBottomNewGuide;
    private Handler mHandler;
    private f mInitListener;
    public boolean mIsNewCleanScreen;
    public int mLastPagePos;
    public TaoliveRoomRightGuideFrame mMoreLiveRightGuideFrame;
    public View.OnLongClickListener mNegativeFeedbackListener;
    public TaoliveRoomTab2RightGuideFrame mTab2MoreLiveRightGuideFrame;
    public TaoMoreLiveRoomFrame mTaoMoreLiveFrame;
    private Handler mainHandler;

    static {
        kge.a(-2129227448);
    }

    public static /* synthetic */ Object ipc$super(AbsFullScreenFrame absFullScreenFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
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
            case -309961236:
                super.onCleanUp();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 1998745205:
                super.initViewPager();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void addChatRoomLinView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45595a9", new Object[]{this});
        }
    }

    public void addMultiLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92f77fe", new Object[]{this});
        }
    }

    public void addPKLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d281e742", new Object[]{this});
        }
    }

    public void dismissNegativeFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c11c0b", new Object[]{this});
        }
    }

    public void hideLiveLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9dbf34", new Object[]{this});
        }
    }

    public boolean removeChatRoomLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea62ad61", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean removeMultiLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("488f5a7f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean removePKLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e505de9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void showLiveLinkView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31de6ef", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f6962", new Object[]{absFullScreenFrame});
        } else {
            absFullScreenFrame.showClearScreenGuide();
        }
    }

    public static /* synthetic */ boolean access$100(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4800ac05", new Object[]{absFullScreenFrame})).booleanValue() : absFullScreenFrame.isClickInSimpleLive();
    }

    public static /* synthetic */ void access$200(AbsFullScreenFrame absFullScreenFrame, com.taobao.taolive.sdk.morelive.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57402645", new Object[]{absFullScreenFrame, aVar});
        } else {
            absFullScreenFrame.initTab2MoreLiveRightComponentInternal(aVar);
        }
    }

    public static /* synthetic */ void access$300(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d343313f", new Object[]{absFullScreenFrame});
        } else {
            absFullScreenFrame.slideIntInternal();
        }
    }

    public static /* synthetic */ void access$400(AbsFullScreenFrame absFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e473de", new Object[]{absFullScreenFrame});
        } else {
            absFullScreenFrame.slideOutInternal();
        }
    }

    public AbsFullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mLastPagePos = 0;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.mNegativeFeedbackListener = new View.OnLongClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                ddw.a().a(FullScreenFrame.EVENT_SHOW_SCREEN_RECORD_BTN_FRAME, null, AbsFullScreenFrame.this.mFrameContext.G());
                return false;
            }
        };
        this.mIsNewCleanScreen = hgs.a();
        this.mHandler = new Handler();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
        } else {
            super.onDataReceived(tBLiveDataModel);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0b95f0", new Object[]{this});
            return;
        }
        if (!configCleanScreenEntranceHidden()) {
            q.b(TAG, "initClearScreen");
            initClearScreenOld();
        }
        if (!hkk.ad()) {
            return;
        }
        this.mainHandler.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (AbsFullScreenFrame.this.mLastPagePos != 0 || ad.c(AbsFullScreenFrame.CLEAR_SCREEN_GUIDE_HAS_SHOW)) {
                } else {
                    AbsFullScreenFrame.access$000(AbsFullScreenFrame.this);
                }
            }
        }, hkk.ae() * 1000);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBoottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8368573", new Object[]{this});
        } else if (plz.a(this.mLiveDetailData) || this.mLandscape || !this.mFrameContext.z || !hgs.o()) {
        } else {
            BottomSlideGuideFrame bottomSlideGuideFrame = new BottomSlideGuideFrame(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
            bottomSlideGuideFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_bottom_guide_stub));
            addComponent(bottomSlideGuideFrame);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initNewBottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93123f08", new Object[]{this});
            return;
        }
        this.mBottomNewGuide = (ViewStub) this.mFrontView.findViewById(R.id.taolive_bottom_guide_stub2);
        if (plz.a(this.mLiveDetailData) || this.mLandscape) {
            return;
        }
        BottomSlideNewGuideFrame bottomSlideNewGuideFrame = new BottomSlideNewGuideFrame(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
        bottomSlideNewGuideFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_bottom_guide_stub2));
        addComponent(bottomSlideNewGuideFrame);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
            return;
        }
        if (plz.a(this.mLiveDetailData) && !this.mLandscape) {
            TaoLiveBannerFrame taoLiveBannerFrame = new TaoLiveBannerFrame(this.mContext, this.mFrameContext);
            taoLiveBannerFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_taolive_banner_stub));
            addComponent(taoLiveBannerFrame);
        }
        if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_ACCOUNT_INFO, this.mFrameContext)) {
            this.mFrameContext.k().a((BaseFrame) this, "tl-top-bar", (ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub2));
        } else if (!TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.mFrameContext.n.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(this.mFrameContext.n.bizCode)) {
        } else {
            TopFakeBarFrame topFakeBarFrame = new TopFakeBarFrame(this.mContext, this.mFrameContext);
            topFakeBarFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub2));
            addComponent(topFakeBarFrame);
            this.mFrameContext.k().a((BaseFrame) this, "tl-top-bar", (ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub2));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInteractiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496cd19a", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_INTERACTION_ENTRANCE, this.mFrameContext) || hkl.a().b() == null || !hkl.a().b().liveInteractiveManagerNotNull(this.mLiveDataModel)) {
        } else {
            this.mFrameContext.k().a(this, "tl-interactive-entrance", (ViewGroup) this.mFrontView.findViewById(R.id.taolive_interactive_right_frame));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8650f", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_COMMENTS, this.mFrameContext)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-chat", (ViewStub) this.mFrontView.findViewById(R.id.taolive_msg_stub));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initUserRecExp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2eb0cf", new Object[]{this});
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-user-recommend-experience", (ViewStub) this.mFrontView.findViewById(R.id.taolive_ue_stub));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f214e095", new Object[]{this});
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-favor-anim", (ViewStub) this.mFrontView.findViewById(R.id.taolive_favor_stub3));
        }
    }

    public void initLiveAvatarNewCardFrame() {
        BaseFrame liveAvatarNewFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203e9539", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_LIVE_ANCHOR_PAGE, this.mFrameContext) || (liveAvatarNewFrame = com.taobao.android.live.plugin.proxy.f.g().getLiveAvatarNewFrame(this.mContext, this.mFrameContext)) == null) {
        } else {
            liveAvatarNewFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_live_avatar_card_container));
            addComponent(liveAvatarNewFrame);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6578b3f", new Object[]{this});
            return;
        }
        this.mBottomBarView = this.mFrontView.findViewById(R.id.taolive_bottom_bar);
        this.mFrameContext.k().a((BaseFrame) this, "tl-bottom-bar", (ViewStub) this.mFrontView.findViewById(R.id.taolive_bottombar_stub2));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initDoubleClickFavView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320960", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_DOUBLE_LIKE, this.mFrameContext)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-double-click", (ViewStub) this.mContainer.findViewById(R.id.taolive_room_double_click_fav));
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInput() {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2455421", new Object[]{this});
            return;
        }
        ViewStub viewStub = (ViewStub) this.mFrontView.findViewById(R.id.taolive_input_stub);
        if ((this.mFrameContext instanceof e) && (o = ((e) this.mFrameContext).o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
            View j = o.uiCompontent.a().j();
            if (j instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R.layout.taolive_open_liveroom_container_flexalocal, (ViewGroup) null);
                if (viewGroup != null) {
                    viewStub = (ViewStub) viewGroup.findViewById(R.id.taolive_input_stub);
                }
                ((ViewGroup) j).addView(viewGroup);
            }
        }
        this.mFrameContext.k().a((BaseFrame) this, "tl-input", viewStub, (dec) new deb() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                if (str.hashCode() == -1172824063) {
                    super.b((BaseFrame) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.deb, tb.dec
            public void b(BaseFrame baseFrame) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba182001", new Object[]{this, baseFrame});
                    return;
                }
                super.b(baseFrame);
                if (!(AbsFullScreenFrame.this.mContainer instanceof pqa) || hkl.a().b() == null) {
                    return;
                }
                ((pqa) AbsFullScreenFrame.this.mContainer).setAbsInputFrame2(com.taobao.android.live.plugin.proxy.f.f().getInputFrame3AndSetSendMessageListener(baseFrame, hkl.a().b().createSendMessageListener(AbsFullScreenFrame.this.mContext, AbsFullScreenFrame.this.mFrameContext)));
            }
        });
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
            return;
        }
        try {
            if (ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_WATER_MARK, this.mFrameContext)) {
                return;
            }
            this.mFrameContext.k().a((BaseFrame) this, "tl-watermark", (ViewStub) this.mFrontView.findViewById(R.id.taolive_room_watermark));
        } catch (Exception e) {
            q.b(TAG, "initRoomWatermark exp :" + e.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initH5Container() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
        } else if (hkl.a().b() == null || !hkl.a().b().liveInteractiveManagerNotNull(this.mLiveDataModel)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "dynamic_h5_sdk", (View) getH5RootView(this.mContext));
        }
    }

    public ViewStub getH5RootView(Context context) {
        ATaoLiveOpenEntity o;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("a378b54b", new Object[]{this, context});
        }
        if (this.mFrameContext != null && ((e) this.mFrameContext).o() != null && (o = ((e) this.mFrameContext).o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
            ViewStub viewStub = new ViewStub(this.mContext);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            View j = o.uiCompontent.a().j();
            if (j != null && (frameLayout = (FrameLayout) j.findViewById(hkl.a().a(IRRoomProxy.R_ID_TAOLIVE_OPEN_H_5_ROOT_VIEW_FRAME))) != null) {
                frameLayout.removeAllViews();
                frameLayout.addView(viewStub, layoutParams);
                return viewStub;
            }
        }
        return (ViewStub) this.mFrontView.findViewById(R.id.taolive_h5_container_fullscreen_stub);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initGoodListFrame() {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r11
            java.lang.String r2 = "a0091789"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.taobao.taolive.sdk.model.common.VideoInfo r0 = r11.mLiveDetailData
            if (r0 == 0) goto Le7
            com.taobao.alilive.aliliveframework.frame.a r0 = r11.mFrameContext
            boolean r0 = r0 instanceof com.taobao.taolive.sdk.core.e
            r1 = 0
            if (r0 == 0) goto L52
            com.taobao.alilive.aliliveframework.frame.a r0 = r11.mFrameContext
            com.taobao.taolive.sdk.core.e r0 = (com.taobao.taolive.sdk.core.e) r0
            com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity r0 = r0.o()
            if (r0 == 0) goto L52
            tb.pke r2 = r0.uiCompontent
            if (r2 == 0) goto L52
            tb.pke r2 = r0.uiCompontent
            tb.pkf r2 = r2.a()
            if (r2 == 0) goto L52
            tb.pke r0 = r0.uiCompontent
            tb.pkf r0 = r0.a()
            android.view.View r0 = r0.j()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L52
            tb.hkl r2 = tb.hkl.a()
            java.lang.String r3 = "R.id.taolive_open_goods_frame"
            int r2 = r2.a(r3)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L53
        L52:
            r0 = r1
        L53:
            if (r0 == 0) goto L74
            android.content.Context r2 = r11.mContext
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.taobao.taobao.R.layout.taolive_goods_list_container_flexalocal
            android.view.View r1 = r2.inflate(r3, r1)
            int r2 = com.taobao.taobao.R.id.taolive_goods_list_weex_container
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = com.taobao.taobao.R.id.taolive_goods_list_cover
            android.view.View r3 = r1.findViewById(r3)
            r0.addView(r1)
        L72:
            r9 = r3
            goto Lae
        L74:
            android.content.Context r0 = r11.mContext
            int r1 = com.taobao.taobao.R.id.taolive_goods_list_weex_container
            android.view.View r0 = com.taobao.taolive.sdk.controller.k.a(r0, r1)
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.content.Context r0 = r11.mContext
            int r1 = com.taobao.taobao.R.id.taolive_goods_list_cover
            android.view.View r3 = com.taobao.taolive.sdk.controller.k.a(r0, r1)
            if (r2 != 0) goto L72
            java.lang.String r0 = "initGoodListFrame | viewGroup is null."
            java.lang.String r1 = "AbsFullScreenFrame"
            com.taobao.taolive.sdk.utils.q.b(r1, r0)
            boolean r4 = tb.hgs.b()
            if (r4 == 0) goto L72
            android.view.View r2 = r11.mContainer
            int r3 = com.taobao.taobao.R.id.taolive_goods_list_weex_container
            android.view.View r2 = r2.findViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = r11.mContainer
            int r4 = com.taobao.taobao.R.id.taolive_goods_list_cover
            android.view.View r3 = r3.findViewById(r4)
            if (r2 != 0) goto L72
            com.taobao.taolive.sdk.utils.q.b(r1, r0)
            return
        Lae:
            com.taobao.android.live.plugin.proxy.good.IGoodProxy r4 = com.taobao.android.live.plugin.proxy.f.m()
            android.content.Context r0 = r11.mContext
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            com.taobao.taolive.sdk.model.common.VideoInfo r0 = r11.mLiveDetailData
            java.lang.String r6 = r0.liveId
            boolean r7 = r11.mLandscape
            com.taobao.taolive.sdk.model.TBLiveDataModel r8 = r11.mLiveDataModel
            com.taobao.alilive.aliliveframework.frame.a r10 = r11.mFrameContext
            com.taobao.taolive.sdk.goodlist.f r0 = r4.createGoodFrame(r5, r6, r7, r8, r9, r10)
            if (r2 == 0) goto Lda
            int r1 = com.taobao.taobao.R.id.taolive_goods_list_dx_container
            android.view.View r1 = r2.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r3 = com.taobao.taobao.R.id.taolive_goods_list_itemgroup_container
            android.view.View r2 = r2.findViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.setContainer(r1, r2)
        Lda:
            com.taobao.alilive.aliliveframework.frame.BaseFrame r1 = r0.getFrame()
            if (r1 == 0) goto Le7
            com.taobao.alilive.aliliveframework.frame.BaseFrame r0 = r0.getFrame()
            r11.addComponent(r0)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.initGoodListFrame():void");
    }

    private void initClearScreenOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12226905", new Object[]{this});
        } else if (!poy.v(this.mFrameContext)) {
        } else {
            final boolean aw = poy.aw(this.mFrameContext);
            this.mViewPager.setOnClearClickListener(new d.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.utils.d.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    q.b(AbsFullScreenFrame.TAG, "mViewPager, onSingleClickListener: mLastPagePos: " + AbsFullScreenFrame.this.mLastPagePos + " ,isNeedSingleClick: " + aw);
                    if (AbsFullScreenFrame.access$100(AbsFullScreenFrame.this) || AbsFullScreenFrame.this.mLastPagePos != 0 || !aw) {
                        return;
                    }
                    if (AbsFullScreenFrame.this.mIsNewCleanScreen) {
                        ddw.a().a(xkw.EVENT_CLEAR_SCREEN_NEW, Boolean.valueOf(!AbsFullScreenFrame.this.isClearScreen), AbsFullScreenFrame.this.observeUniqueIdentification());
                    } else {
                        ddw.a().a(FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, Boolean.valueOf(!AbsFullScreenFrame.this.isClearScreen), AbsFullScreenFrame.this.observeUniqueIdentification());
                    }
                }

                @Override // com.taobao.taolive.sdk.utils.d.b
                public void a(int i, PointF pointF) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d16f4e0c", new Object[]{this, new Integer(i), pointF});
                        return;
                    }
                    q.b("TBLVOpenShopCardComponent", "double click");
                    if (AbsFullScreenFrame.access$100(AbsFullScreenFrame.this)) {
                        return;
                    }
                    ddw.a().a("com.taolive.taolive.room.mediaplatform_addfavor", null, AbsFullScreenFrame.this.mFrameContext.G());
                    ddw.a().a("com.taolive.taolive.room.double_click_favor_show", pointF, AbsFullScreenFrame.this.mFrameContext.G());
                    if (phg.a() == null) {
                        return;
                    }
                    phg.a().a(AbsFullScreenFrame.this.mFrameContext, "doublelike_CLK", new String[0]);
                }
            }, this.mLandscape);
            if (!(this.mViewPagerBackground instanceof ClickableView)) {
                return;
            }
            ((ClickableView) this.mViewPagerBackground).setOnMultiClickListener(new d.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.utils.d.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    q.b(AbsFullScreenFrame.TAG, "mViewPagerBackground, onSingleClickListener: isNeedSingleClick:" + aw);
                    if (AbsFullScreenFrame.access$100(AbsFullScreenFrame.this) || !aw) {
                        return;
                    }
                    if (AbsFullScreenFrame.this.mIsNewCleanScreen) {
                        ddw.a().a(xkw.EVENT_CLEAR_SCREEN_NEW, false, AbsFullScreenFrame.this.observeUniqueIdentification());
                    } else {
                        ddw.a().a(FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, false, AbsFullScreenFrame.this.observeUniqueIdentification());
                    }
                }

                @Override // com.taobao.taolive.sdk.utils.d.b
                public void a(int i, PointF pointF) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d16f4e0c", new Object[]{this, new Integer(i), pointF});
                    } else if (AbsFullScreenFrame.access$100(AbsFullScreenFrame.this)) {
                    } else {
                        String G = AbsFullScreenFrame.this.mFrameContext.G();
                        ddw.a().a("com.taolive.taolive.room.mediaplatform_addfavor", null, G);
                        ddw.a().a("com.taolive.taolive.room.double_click_favor_show", pointF, G);
                        if (phg.a() == null) {
                            return;
                        }
                        phg.a().a("doublelike_CLK", new String[0]);
                    }
                }
            });
        }
    }

    private boolean isClickInSimpleLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4581126c", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.taolive.sdk.utils.ad.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            return false;
        }
        this.mFrameContext.o().accessListener(AccessListenerEnum.onClickCleanScreen, false);
        return true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        initViewPagerOld();
        if (!ply.d()) {
            return;
        }
        this.mViewPager.setOnLongClickListener(this.mNegativeFeedbackListener);
        this.mViewPagerBackground.setOnLongClickListener(this.mNegativeFeedbackListener);
    }

    private void initViewPagerOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b90660", new Object[]{this});
        } else if (this.mLandscape || poy.aj(this.mFrameContext) || this.mAdView == null) {
            super.initViewPager();
        } else {
            initAdapters();
            this.mViewPager = (PassEventViewPager) this.mContainer.findViewById(R.id.taolive_viewpager);
            if (this.mViewPager != null) {
                this.mViewPager.setFrameContext(this.mFrameContext);
            }
            this.mViewPagerBackground = this.mContainer.findViewById(R.id.taolive_viewpager_background);
            this.mViewPager.setAdapter(this.simpleAdapter);
            this.mViewPager.setCurrentItem(0);
            this.simpleAdapter.notifyDataSetChanged();
            initClearScreen();
            this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                        return;
                    }
                    q.b(AbsFullScreenFrame.TAG, "setCanShowPopFlag,onPageScrolled,position: " + i + " ,positionOffset: " + f + " ,positionOffsetPixels: " + i2);
                    AbsFullScreenFrame.this.dismissNegativeFeedback();
                    int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                    if (i3 > 0) {
                        AbsFullScreenFrame.this.hideLiveLinkView();
                    } else if (i != 0 || i3 != 0) {
                    } else {
                        AbsFullScreenFrame.this.showLiveLinkView();
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (i != 0) {
                        if (i == 1) {
                            if (AbsFullScreenFrame.this.mTaoMoreLiveFrame != null) {
                                AbsFullScreenFrame.this.mTaoMoreLiveFrame.pageShow(true);
                                if (AbsFullScreenFrame.this.mMoreLiveRightGuideFrame != null) {
                                    AbsFullScreenFrame.this.mMoreLiveRightGuideFrame.showMoreLiveFrame();
                                }
                                if (AbsFullScreenFrame.this.mContext instanceof com.taobao.taolive.room.ui.swipeback.a) {
                                    ((com.taobao.taolive.room.ui.swipeback.a) AbsFullScreenFrame.this.mContext).a(false);
                                }
                            }
                            AbsFullScreenFrame.this.showLiveLinkView();
                        }
                    } else if (AbsFullScreenFrame.this.mTaoMoreLiveFrame != null) {
                        AbsFullScreenFrame.this.mTaoMoreLiveFrame.pageShow(false);
                        if (AbsFullScreenFrame.this.mContext instanceof com.taobao.taolive.room.ui.swipeback.a) {
                            ((com.taobao.taolive.room.ui.swipeback.a) AbsFullScreenFrame.this.mContext).a(true);
                        }
                    }
                    AbsFullScreenFrame.this.mLastPagePos = i;
                    if (i != 0) {
                        return;
                    }
                    ddw.a().a(FullScreenFrame.EVENT_MEDIAPLATFORM_SCREEN_FLIPPED, false, AbsFullScreenFrame.this.observeUniqueIdentification());
                }
            });
            this.mViewPager.setPageTransformer(true, new ViewPager.PageTransformer() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.view.ViewPager.PageTransformer
                public void transformPage(View view, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
                    } else if (AbsFullScreenFrame.this.mLastPagePos == 1) {
                        if (f <= 0.0f || AbsFullScreenFrame.this.mViewPagerBackground == null) {
                            return;
                        }
                        AbsFullScreenFrame.this.mViewPagerBackground.setAlpha(1.0f - f);
                    } else if (AbsFullScreenFrame.this.mLastPagePos != 0 || f <= 0.0f || AbsFullScreenFrame.this.mViewPagerBackground == null) {
                    } else {
                        AbsFullScreenFrame.this.mViewPagerBackground.setAlpha(1.0f - f);
                    }
                }
            });
        }
    }

    private void showClearScreenGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c8a707", new Object[]{this});
        } else if (!(this.mContext instanceof Activity) || ((Activity) this.mContext).isFinishing() || ((Activity) this.mContext).isDestroyed() || !((Activity) this.mContext).getWindow().isActive()) {
        } else {
            try {
                this.clearScreenGuideDialog = new com.taobao.android.live.plugin.atype.flexalocal.clean.a(this.mContext);
                this.clearScreenGuideDialog.show();
                ae.a(CLEAR_SCREEN_GUIDE_HAS_SHOW, true);
            } catch (Exception e) {
                q.b(TAG, "showClearScreenGuide e:" + e.getMessage());
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initAdView() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32af1f", new Object[]{this});
        } else if (!u.P() || this.mFrameContext.m()) {
        } else {
            boolean z2 = (this.mContext.getResources().getConfiguration().screenLayout & 15) >= 3;
            boolean aj = poy.aj(this.mFrameContext);
            if (!z2 && !aj && !isLiveMoreEntranceHidden()) {
                z = true;
            }
            boolean isTab2LiveMoreEntranceShow = isTab2LiveMoreEntranceShow();
            if (!z) {
                if (!isTab2LiveMoreEntranceShow) {
                    return;
                }
                initTab2MoreLiveRightComponent(true);
                return;
            }
            HashMap hashMap = new HashMap();
            try {
                com.taobao.taolive.sdk.morelive.a c = com.taobao.taolive.sdk.morelive.e.a().c();
                if (c != null) {
                    this.mTaoMoreLiveFrame = c.b(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
                    this.mAdView = this.mTaoMoreLiveFrame.getContainerView();
                    addComponent(this.mTaoMoreLiveFrame);
                    initMoreLiveRightComponent();
                    hashMap.put("taoliveHomeBundleState", "installed");
                } else {
                    hashMap.put("taoliveHomeBundleState", "installing");
                }
                updatePageProperties(hashMap);
            } catch (Exception unused) {
                updatePageProperties(hashMap);
            }
        }
    }

    private void initTab2MoreLiveRightComponent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d956d13e", new Object[]{this, new Boolean(z)});
        } else if (!z || !u.Q() || this.mFrameContext.m()) {
        } else {
            com.taobao.taolive.sdk.morelive.a c = com.taobao.taolive.sdk.morelive.e.a().c();
            if (c != null) {
                initTab2MoreLiveRightComponentInternal(c);
            } else {
                initRealMoreInitListener();
            }
        }
    }

    private void initRealMoreInitListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09f91ce", new Object[]{this});
            return;
        }
        if (this.mInitListener == null) {
            this.mInitListener = new f() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.morelive.f
                public void a(final com.taobao.taolive.sdk.morelive.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab20937d", new Object[]{this, aVar});
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.10.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AbsFullScreenFrame.access$200(AbsFullScreenFrame.this, aVar);
                                }
                            }
                        });
                    }
                }
            };
        }
        com.taobao.taolive.sdk.morelive.e.a().a(this.mInitListener);
    }

    private void initTab2MoreLiveRightComponentInternal(com.taobao.taolive.sdk.morelive.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3028c252", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mTab2MoreLiveRightGuideFrame = aVar.c(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
            this.mTab2MoreLiveRightGuideFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_more_live_guide_stub));
            m.e(TAG, "更多直播，增加tab2更多直播入口组件");
            addComponent(this.mTab2MoreLiveRightGuideFrame);
        }
    }

    private void updatePageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
        } else if (phg.a() == null) {
        } else {
            phg.a().a(this.mFrameContext, this.mContext, map);
        }
    }

    private boolean isTab2LiveMoreEntranceShow() {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48faad06", new Object[]{this})).booleanValue();
        }
        if (this.mFrameContext != null && !phg.d().a() && (o = this.mFrameContext.o()) != null && o.eventCompontent != null) {
            boolean b = o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedMoreLive);
            boolean dB_ = (o.eventCompontent.a() == null || o.eventCompontent.a().d() == null) ? false : o.eventCompontent.a().d().dB_();
            boolean z = !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_TAB2_LIVE_MORE_ENTRANCE, this.mFrameContext);
            q.b(TAG, "更多直播间业务开关 = " + dB_ + " show = " + z + " abilitySwitch = " + b);
            if ((dB_ || b) && z) {
                return true;
            }
        }
        return false;
    }

    private boolean isLiveMoreEntranceHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b15b196", new Object[]{this})).booleanValue() : ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_MORE_ENTRANCE, this.mFrameContext);
    }

    private boolean configCleanScreenEntranceHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ec5cd5e", new Object[]{this})).booleanValue() : ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_CLEAN_SCREEN, this.mFrameContext);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initCleanView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f992ae5", new Object[]{this});
        } else if (configCleanScreenEntranceHidden() || !this.mIsNewCleanScreen) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-clear-screen", (ViewStub) this.mContainer.findViewById(R.id.taolive_blank_frame_stub), (dec) new deb() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass11 anonymousClass11, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1172824063) {
                        super.b((BaseFrame) objArr[0]);
                        return null;
                    } else if (hashCode != 757795042) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.a((BaseFrame) objArr[0]);
                        return null;
                    }
                }

                @Override // tb.deb, tb.dec
                public void a(BaseFrame baseFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d2b08e2", new Object[]{this, baseFrame});
                        return;
                    }
                    super.a(baseFrame);
                    AbsFullScreenFrame.this.mBlankFrame = baseFrame;
                }

                @Override // tb.deb, tb.dec
                public void b(BaseFrame baseFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba182001", new Object[]{this, baseFrame});
                        return;
                    }
                    super.b(baseFrame);
                    if (AbsFullScreenFrame.this.isClearScreen) {
                        com.taobao.android.live.plugin.proxy.f.g().blankFrame2Show(AbsFullScreenFrame.this.mBlankFrame);
                    } else {
                        com.taobao.android.live.plugin.proxy.f.g().blankFrame2Hide(AbsFullScreenFrame.this.mBlankFrame);
                    }
                }
            });
        }
    }

    public void initAdapters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d77cabb", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mFrontView);
        arrayList.add(this.mAdView);
        this.simpleAdapter = new FullScreenFrame.a(arrayList);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        if (!this.mIsNewCleanScreen) {
            return;
        }
        this.mFrameContext.e().a(xkw.EVENT_CLEAR_SCREEN_NEW, false, observeUniqueIdentification());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        dismissNegativeFeedback();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
            return;
        }
        super.clearComponents();
        this.mMoreLiveRightGuideFrame = null;
        this.mTaoMoreLiveFrame = null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, tb.ddv
    public void onEvent(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if ("com.taobao.taolive.room.ubee_for_morelive".equals(str)) {
            TaoliveRoomRightGuideFrame taoliveRoomRightGuideFrame = this.mMoreLiveRightGuideFrame;
            if (taoliveRoomRightGuideFrame == null) {
                return;
            }
            taoliveRoomRightGuideFrame.updateEntryData();
        } else if (xkw.EVENT_CLEAR_SCREEN_NEW.equals(str)) {
            if (!(obj instanceof Boolean)) {
                return;
            }
            Boolean bool = (Boolean) obj;
            if (bool.booleanValue() && this.mFrameContext != null && this.mFrameContext.z() != null && this.mFrameContext.z().M()) {
                ddw.a().a(xkw.d, "assembly", observeUniqueIdentification());
            }
            handleCleanScreen(bool.booleanValue());
            if (!(this.mFrameContext instanceof e) || ((e) this.mFrameContext).o() == null) {
                return;
            }
            ((e) this.mFrameContext).o().accessListener(AccessListenerEnum.onClickCleanScreen, bool);
        } else if (StringUtils.equals(str, FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN)) {
            TaoliveRoomRightGuideFrame taoliveRoomRightGuideFrame2 = this.mMoreLiveRightGuideFrame;
            if (taoliveRoomRightGuideFrame2 != null) {
                taoliveRoomRightGuideFrame2.updateClearScreenStatus(((Boolean) obj).booleanValue());
            }
            if (!(this.mFrameContext instanceof e) || ((e) this.mFrameContext).o() == null) {
                return;
            }
            ((e) this.mFrameContext).o().accessListener(AccessListenerEnum.onClickCleanScreen, false);
        } else if (StringUtils.equals(str, xkw.EVENT_TAB2_MORE_LIVE_RIGHT_GUIDE_FRAME_IS_SHOW)) {
            handleTab2MoreLiveShow(obj);
        } else if (StringUtils.equals(str, xkw.EVENT_CAN_SHOW_POP_LAYER)) {
            q.b(TAG, "setCanShowPopFlag，收到onEvent处理canShowPopFlag的消息");
            setCanShowPopFlag(obj);
        } else if (xkw.EVENT_CLEAR_SCREEN_IMMERSIVE.equals(str)) {
            if (phg.d().a() || !hkk.t() || this.immersiveScene != null || !(obj instanceof String)) {
                return;
            }
            this.immersiveScene = (String) obj;
            handleCleanScreen(true);
            q.b(TAG, "Clear Screen ImmersiveScene, immersiveScene = " + obj);
        } else if (!xkw.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER.equals(str) || phg.d().a() || (str2 = this.immersiveScene) == null || !(obj instanceof String) || !str2.equals(obj)) {
        } else {
            this.immersiveScene = null;
            handleCleanScreen(false);
            q.b(TAG, "Clear Screen Recover ImmersiveScene, immersiveScene = " + obj);
        }
    }

    private void setCanShowPopFlag(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe7d5d5", new Object[]{this, obj});
        } else if (!(obj instanceof Boolean) || this.mFrameContext == null) {
        } else {
            Boolean bool = (Boolean) obj;
            boolean booleanValue = bool.booleanValue();
            q.b(TAG, "setCanShowPopFlag，mFrameContext设置canShow标记 canShow= " + booleanValue);
            this.mFrameContext.e(bool.booleanValue());
        }
    }

    private void handleTab2MoreLiveShow(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63152f06", new Object[]{this, obj});
        } else if (this.mTab2MoreLiveRightGuideFrame == null || !(obj instanceof Map)) {
        } else {
            Object obj2 = ((Map) obj).get("isShow");
            if (!(obj2 instanceof Boolean)) {
                return;
            }
            this.mTab2MoreLiveRightGuideFrame.showMoreLiveFrame(((Boolean) obj2).booleanValue());
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        this.isClearScreen = false;
        ddw.a().a(xkw.EVENT_FULL_SCREEN_APPEAR);
        this.mViewPager.setVisibility(0);
        if (this.mTaoMoreLiveFrame == null) {
            return;
        }
        com.taobao.taolive.sdk.morelive.e.a().a(new com.taobao.taolive.sdk.morelive.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.morelive.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    AbsFullScreenFrame.access$300(AbsFullScreenFrame.this);
                }
            }

            @Override // com.taobao.taolive.sdk.morelive.d
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    AbsFullScreenFrame.access$400(AbsFullScreenFrame.this);
                }
            }
        });
    }

    private void slideIntInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7836462", new Object[]{this});
        } else if (this.mViewPager == null || this.mViewPager.getChildCount() <= 0 || this.mViewPager.getCurrentItem() != 0) {
        } else {
            this.mViewPager.setCurrentItem(1);
        }
    }

    private void slideOutInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb86541", new Object[]{this});
        } else if (this.mViewPager == null || this.mViewPager.getAdapter() == null || this.mViewPager.getAdapter().getCount() != 2 || 1 != this.mViewPager.getCurrentItem()) {
        } else {
            this.mViewPager.setCurrentItem(0, true);
        }
    }

    public void initMoreLiveRightComponent() {
        com.taobao.taolive.sdk.morelive.a c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636e7739", new Object[]{this});
        } else if (!u.Q() || this.mLandscape || this.mFrameContext.m() || (c = com.taobao.taolive.sdk.morelive.e.a().c()) == null || isLiveMoreEntranceHidden()) {
        } else {
            this.mMoreLiveRightGuideFrame = c.a(this.mContext, false, this.mLiveDataModel, this.mFrameContext);
            this.mMoreLiveRightGuideFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_more_live_guide_stub));
            addComponent(this.mMoreLiveRightGuideFrame);
        }
    }

    private void handleCleanScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252d1e80", new Object[]{this, new Boolean(z)});
        } else if (this.isClearScreen == z) {
        } else {
            this.isClearScreen = z;
            q.b(TAG, "handleCleanScreen: isClearScreen:" + z);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mViewPager, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(250L);
                ofFloat.start();
                ofFloat.addListener(new a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == -2145066406) {
                            super.onAnimationEnd((Animator) objArr[0]);
                            return null;
                        } else if (hashCode != -1868320925) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        } else {
                            super.onAnimationCancel((Animator) objArr[0]);
                            return null;
                        }
                    }

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.a, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            return;
                        }
                        super.onAnimationEnd(animator);
                        AbsFullScreenFrame.this.mViewPager.setVisibility(8);
                    }

                    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.a, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            return;
                        }
                        super.onAnimationCancel(animator);
                        AbsFullScreenFrame.this.mViewPager.setVisibility(8);
                    }
                });
                this.mEnterClearScreenTime = SystemClock.elapsedRealtime();
                trackEnterClearScreen();
                addMultiLinkView();
                addPKLinkView();
                addChatRoomLinView();
                if (this.mBlankFrame == null) {
                    return;
                }
                com.taobao.android.live.plugin.proxy.f.g().blankFrame2Show(this.mBlankFrame);
                return;
            }
            this.mViewPager.setVisibility(0);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mViewPager, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(250L);
            ofFloat2.start();
            ofFloat2.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

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
                    boolean z2 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    if (!AbsFullScreenFrame.this.removeMultiLinkView() && !AbsFullScreenFrame.this.removePKLinkView() && !AbsFullScreenFrame.this.removeChatRoomLinkView()) {
                        z2 = false;
                    }
                    if (!z2 || AbsFullScreenFrame.this.mBlankFrame == null) {
                        return;
                    }
                    com.taobao.android.live.plugin.proxy.f.g().blankFrame2Hide(AbsFullScreenFrame.this.mBlankFrame);
                }
            });
            trackLeaveClearScreen();
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2074357400);
            kge.a(1420754541);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        private a() {
        }
    }
}
