package com.taobao.taolive.movehighlight.screen.frame;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.topbar.TopBarProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.TimeShiftItemTimeShiftDXFrame;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.TimeShiftSingFrame;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame;
import com.taobao.taolive.movehighlight.utils.TimeMovingType;
import com.taobao.taolive.movehighlight.utils.c;
import com.taobao.taolive.movehighlight.view.ClickableViewHighlight;
import com.taobao.taolive.movehighlight.view.PassEventViewPagerHighlight;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.d;
import java.util.ArrayList;
import tb.kge;
import tb.pfb;
import tb.pfh;
import tb.pgt;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class HighlightFullScreenFrame extends FullScreenFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ClearScreenDXFrame clearScreenDXFrame;
    private int mLastPagePos;

    static {
        kge.a(-180877213);
    }

    public static /* synthetic */ Object ipc$super(HighlightFullScreenFrame highlightFullScreenFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1664844779:
                super.handleRoomCleanScreen(objArr[0]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 1087027639:
                super.clearComponent();
                return null;
            case 1998745205:
                super.initViewPager();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int access$000(HighlightFullScreenFrame highlightFullScreenFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d3bab8d6", new Object[]{highlightFullScreenFrame})).intValue() : highlightFullScreenFrame.mLastPagePos;
    }

    public static /* synthetic */ void access$100(HighlightFullScreenFrame highlightFullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae39b24", new Object[]{highlightFullScreenFrame});
        } else {
            highlightFullScreenFrame.initTBLiveXBackFrameInner();
        }
    }

    public HighlightFullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mLastPagePos = 0;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_live_2_highlight, viewGroup);
        initAll();
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
        this.simpleAdapter = new pgt(arrayList);
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0b95f0", new Object[]{this});
            return;
        }
        final pfb a2 = pfb.a(this.mFrameContext);
        this.mViewPager.setOnClearClickListener(new d.a() { // from class: com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.utils.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (HighlightFullScreenFrame.access$000(HighlightFullScreenFrame.this) != 0 || a2.k() == null) {
                } else {
                    a2.k().a(Boolean.valueOf(!HighlightFullScreenFrame.this.isClearScreen));
                }
            }
        }, this.mLandscape);
        if (!(this.mViewPagerBackground instanceof ClickableViewHighlight)) {
            return;
        }
        ((ClickableViewHighlight) this.mViewPagerBackground).setOnSingleClickListener(new d.a() { // from class: com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.utils.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (a2.k() == null) {
                } else {
                    a2.k().a((Object) false);
                }
            }
        });
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
        } else if (this.mLandscape || poy.aj(this.mFrameContext) || this.mAdView == null) {
            super.initViewPager();
        } else {
            initAdapters();
            this.mViewPager = (PassEventViewPagerHighlight) this.mContainer.findViewById(R.id.taolive_viewpager_highlight);
            this.mViewPagerBackground = this.mContainer.findViewById(R.id.taolive_viewpager_background_highlight);
            this.mViewPager.setAdapter(this.simpleAdapter);
            this.mViewPager.setCurrentItem(0);
            this.simpleAdapter.notifyDataSetChanged();
            initClearScreen();
            this.mViewPager.setPageTransformer(true, new ViewPager.PageTransformer() { // from class: com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.view.ViewPager.PageTransformer
                public void transformPage(View view, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
                    } else if (HighlightFullScreenFrame.access$000(HighlightFullScreenFrame.this) == 1) {
                        if (f <= 0.0f || HighlightFullScreenFrame.this.mViewPagerBackground == null) {
                            return;
                        }
                        HighlightFullScreenFrame.this.mViewPagerBackground.setAlpha(1.0f - f);
                    } else if (HighlightFullScreenFrame.access$000(HighlightFullScreenFrame.this) != 0 || f <= 0.0f || HighlightFullScreenFrame.this.mViewPagerBackground == null) {
                    } else {
                        HighlightFullScreenFrame.this.mViewPagerBackground.setAlpha(1.0f - f);
                    }
                }
            });
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initHighligtFrame(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84011f5", new Object[]{this, videoInfo});
        } else if (!pmd.a().a("timeShift")) {
        } else {
            com.taobao.taolive.movehighlight.utils.d.d = false;
            if (c.b(poy.ac(this.mFrameContext)) && !TimeMovingType.checkContentTimeMove(videoInfo)) {
                initTimeShiftSingleDX();
                initClearScreenDXFrame();
            } else if (TimeMovingType.checkContentTimeMove(videoInfo)) {
                initTimeShiftContentFrame();
                com.taobao.taolive.movehighlight.utils.d.d = true;
            } else {
                initTimeShiftBabyListDX();
            }
        }
    }

    public void initTimeShiftContentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7ba0", new Object[]{this});
            return;
        }
        TimeShiftContentFrame timeShiftContentFrame = new TimeShiftContentFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
        timeShiftContentFrame.onCreateView2((ViewGroup) this.mFrontView.findViewById(R.id.taolive_timeshift_babylist_new_dx));
        addComponent(timeShiftContentFrame);
    }

    public void initTimeShiftSingleDX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37705488", new Object[]{this});
            return;
        }
        TimeShiftSingFrame timeShiftSingFrame = new TimeShiftSingFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
        timeShiftSingFrame.onCreateView2((ViewGroup) this.mFrontView.findViewById(R.id.taolive_timeshift_babylist_new_dx));
        addComponent(timeShiftSingFrame);
    }

    public void initTimeShiftBabyListDX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90358094", new Object[]{this});
            return;
        }
        TimeShiftItemTimeShiftDXFrame timeShiftItemTimeShiftDXFrame = new TimeShiftItemTimeShiftDXFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
        timeShiftItemTimeShiftDXFrame.onCreateView2((ViewGroup) this.mFrontView.findViewById(R.id.taolive_timeshift_babylist_new_dx));
        addComponent(timeShiftItemTimeShiftDXFrame);
    }

    public void initClearScreenDXFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17c63b7", new Object[]{this});
        } else if (this.clearScreenDXFrame != null) {
        } else {
            this.clearScreenDXFrame = new ClearScreenDXFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
            this.clearScreenDXFrame.onCreateView2((ViewGroup) this.mContainer.findViewById(R.id.taolive_highlight_clear_screen));
            addComponent(this.clearScreenDXFrame);
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void handleRoomCleanScreen(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc47c15", new Object[]{this, obj});
            return;
        }
        super.handleRoomCleanScreen(obj);
        ClearScreenDXFrame clearScreenDXFrame = this.clearScreenDXFrame;
        if (clearScreenDXFrame == null) {
            return;
        }
        clearScreenDXFrame.setVisibility(this.isClearScreen);
    }

    private void initAtypeTopBar() {
        Class<? extends BaseFrame> topBarFrame3Class = TopBarProxy.getInstance().getTopBarFrame3Class();
        if (topBarFrame3Class != null) {
            try {
                BaseFrame newInstance = topBarFrame3Class.getConstructor(Context.class, a.class).newInstance(this.mContext, this.mFrameContext);
                newInstance.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub));
                addComponent(newInstance);
            } catch (Exception unused) {
            }
        }
    }

    private void initTopFakeBarFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcb70db", new Object[]{this});
            return;
        }
        BaseFrame topFakeBarFrame = f.g().getTopFakeBarFrame(this.mContext, this.mFrameContext);
        if (topFakeBarFrame == null) {
            return;
        }
        topFakeBarFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_topbar_stub));
        addComponent(topFakeBarFrame);
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
        } else if (!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_ACCOUNT_INFO, this.mFrameContext)) {
            initAtypeTopBar();
        } else if (!TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.mFrameContext.n.bizCode)) {
        } else {
            initTopFakeBarFrame();
            initAtypeTopBar();
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initAvatarCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca50c940", new Object[]{this});
            return;
        }
        BaseFrame liveAvatarNewFrame = f.g().getLiveAvatarNewFrame(this.mContext, false, this.mLiveDataModel);
        liveAvatarNewFrame.createView((ViewStub) this.mContainer.findViewById(R.id.taolive_highlight_avatar_card_container));
        addComponent(liveAvatarNewFrame);
    }

    private void initATypeSubscribeCardFrame() {
        BaseFrame createSubscribeCardFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27450305", new Object[]{this});
        } else if (f.p() == null || (createSubscribeCardFrame = f.p().createSubscribeCardFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mContainer.findViewById(R.id.taolive_subscribe_card_cover), (ViewGroup) this.mContainer.findViewById(R.id.taolive_subscribe_card_detail_container))) == null) {
        } else {
            addComponent(createSubscribeCardFrame);
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initSubscribeCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9cebd1", new Object[]{this});
        } else {
            initATypeSubscribeCardFrame();
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
        this.mViewPager.setVisibility(0);
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        } else {
            super.onStatusChange(i, obj);
        }
    }

    private void initAtypeWaterMark() {
        Class<? extends BaseFrame> watermarkFrame3Class = f.g().getWatermarkFrame3Class();
        if (watermarkFrame3Class != null) {
            try {
                BaseFrame newInstance = watermarkFrame3Class.getConstructor(Context.class, a.class).newInstance(this.mContext, this.mFrameContext);
                newInstance.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_room_watermark));
                addComponent(newInstance);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
        } else {
            initAtypeWaterMark();
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initTBLiveXBackFrame(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b2a00e", new Object[]{this, videoInfo});
        } else if (!v.e(pmd.a().d().a("tblive", "enableLiveRoomBackward", "true"))) {
        } else {
            if (com.taobao.android.live.plugin.proxy.c.a().d()) {
                initTBLiveXBackFrameInner();
            } else {
                com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            HighlightFullScreenFrame.access$100(HighlightFullScreenFrame.this);
                        }
                    }
                });
            }
        }
    }

    @Override // com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame
    public void initGoodListFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0091789", new Object[]{this});
        } else if (this.mLiveDetailData == null) {
        } else {
            pfh pfhVar = new pfh((Activity) this.mContext, this.mFrameContext, this.mLiveDetailData.liveId, this.mLandscape, this.mLiveDataModel, this.mContainer.findViewById(R.id.taolive_goods_list_cover));
            pfhVar.a((ViewGroup) this.mContainer.findViewById(R.id.taolive_goods_list_weex_container));
            addComponent(pfhVar.a());
        }
    }

    private void initTBLiveXBackFrameInner() {
        BaseFrame createRightBackwardTipsFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db5ce65", new Object[]{this});
        } else if (f.p() == null || (createRightBackwardTipsFrame = f.p().createRightBackwardTipsFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) == null) {
        } else {
            createRightBackwardTipsFrame.onCreateView((ViewStub) this.mContainer.findViewById(R.id.taolive_x_back_frame_stub));
            addComponent(createRightBackwardTipsFrame);
        }
    }
}
