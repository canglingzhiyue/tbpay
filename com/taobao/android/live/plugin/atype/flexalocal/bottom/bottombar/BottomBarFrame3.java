package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.ddx;
import tb.hfk;
import tb.hfl;
import tb.kge;
import tb.phg;
import tb.sst;
import tb.xkw;

/* loaded from: classes5.dex */
public class BottomBarFrame3 extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_GOODS_LIST_SHOWING = "com.taobao.taolive.room.goods_list_showing";
    private static final String EVENT_SEND_MORE_LIVE_STATUS = "taolive.more.live.status";
    private static final String EVENT_START_QUALITY = "com.taobao.taolive.room.start_quality";
    private static final String EVENT_START_REPORT = "com.taobao.taolive.room.start_report_from_btns";
    private static final String EVENT_TAOLIVE_ROOM_CLEAR_SCREEN = "com.taobao.taolive.room.clean_screen";
    private static final String TAG = "BottomBarFrame3";
    public static int sBottomBarBottomDP;
    public static int sBottomBarLeftDP;
    private boolean mIsCleanScreen;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;
    private DialogFragment qualityDialog;

    public static /* synthetic */ Object ipc$super(BottomBarFrame3 bottomBarFrame3, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "BottomBarFrame3";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-bottom-bar-native";
    }

    public static /* synthetic */ void access$000(BottomBarFrame3 bottomBarFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35031437", new Object[]{bottomBarFrame3});
        } else {
            bottomBarFrame3.initRewardFreeGift();
        }
    }

    public static /* synthetic */ void access$100(BottomBarFrame3 bottomBarFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0ad938", new Object[]{bottomBarFrame3});
        } else {
            bottomBarFrame3.initQualityDialog();
        }
    }

    static {
        kge.a(1327751183);
        kge.a(191318335);
        sBottomBarLeftDP = 12;
    }

    public BottomBarFrame3(Context context, a aVar) {
        super(context, aVar);
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomBarFrame3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                BottomBarFrame3.sBottomBarBottomDP = d.b(BottomBarFrame3.this.mContext, marginLayoutParams.topMargin + marginLayoutParams.height + marginLayoutParams.bottomMargin);
                if (BottomBarFrame3.this.mContainer == null) {
                    return;
                }
                BottomBarFrame3.this.mContainer.removeOnLayoutChangeListener(this);
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottombar_live_layout2_showcase_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        initGoodsIcon();
        initBottomInput();
        initFavorCount();
        initShare();
        initReward();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFrameContext.e().a(this);
        adjustLayoutParams();
        initMore();
        initMute();
        this.mContainer.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        if (getFrameContext() == null || StringUtils.isEmpty(getFrameContext().d) || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || StringUtils.equals(getFrameContext().d, tBLiveDataModel.mVideoInfo.liveId)) {
            return;
        }
        q.b("BottomBarFrame3", "liveId is not equals error liveId:" + tBLiveDataModel.mVideoInfo.liveId + " correct liveId：" + this.mFrameContext.d);
        phg.a().a(this.mFrameContext, "UpDownSwitchBottomBarError", (Map<String, String>) new HashMap());
    }

    private void adjustLayoutParams() {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        if (!phg.d().a() && this.mFrameContext != null && (o = this.mFrameContext.o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
            Float i = o.uiCompontent.a().i();
            if (i != null && i.floatValue() > 0.0f && i.floatValue() <= 500.0f) {
                marginLayoutParams.bottomMargin = (int) i.floatValue();
            }
            if (ad.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) && i != null && i.floatValue() > -200.0f && i.floatValue() <= 500.0f) {
                marginLayoutParams.bottomMargin = i.intValue();
            }
        }
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    private void initFavorCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530fd2a8", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_LIKE_BUTTON, this.mFrameContext)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-bottom-favor", (ViewStub) findViewById(R.id.taolive_bottombar_favor_count_stub));
        }
    }

    private void initShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b39b6", new Object[]{this});
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-bottom-share", (ViewStub) findViewById(R.id.taolive_bottombar_share_stub));
        }
    }

    private void initMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacddb50", new Object[]{this});
        } else if (phg.d().a() || !sst.a(this.mFrameContext)) {
        } else {
            MuteFrame muteFrame = new MuteFrame(this.mContext, this.mFrameContext);
            muteFrame.keepViewStubWithoutInflate((ViewStub) findViewById(R.id.taolive_bottom_mute_stub));
            addComponent(muteFrame);
        }
    }

    private void initMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fec68c", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        if (videoInfo == null) {
            return;
        }
        if ((videoInfo.status != 0 && videoInfo.status != 3 && videoInfo.status != 1) || ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_MORE_BUTTON, this.mFrameContext)) {
            return;
        }
        this.mFrameContext.k().a((BaseFrame) this, "tl-bottom-more", (ViewStub) findViewById(R.id.taolive_bottombar_more_stub));
    }

    private void initGoodsIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2098a6c6", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_GOOD_ENTRANCE, this.mFrameContext)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-bottom-goods-icon", (ViewStub) findViewById(R.id.taolive_bottombar_goods_icon_stub));
        }
    }

    private void initBottomInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367c3e36", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_COMMENT_INPUT_BUTTON, this.mFrameContext)) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-bottom-input", (ViewStub) findViewById(R.id.taolive_bottombar_iput_stub));
        }
    }

    private void initReward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4fd166", new Object[]{this});
        } else if (ComponentGroupConfig.componentEntranceHidden("BottomGroup", ComponentGroupConfig.BOTTOM_REWARD_BUTTON, this.mFrameContext) || !hfl.a()) {
        } else {
            this.mFrameContext.k().a((BaseFrame) this, "tl-bottom-reward", (ViewStub) findViewById(R.id.taolive_bottombar_reward_icon_stub));
            if (c.a().d()) {
                initRewardFreeGift();
            } else {
                c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomBarFrame3.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            BottomBarFrame3.access$000(BottomBarFrame3.this);
                        }
                    }
                });
            }
        }
    }

    private void initRewardFreeGift() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8977642", new Object[]{this});
            return;
        }
        ddx.a("tl-reward-free-gift", f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_FREE_GIFT_FRAME));
        this.mFrameContext.k().a((BaseFrame) this, "tl-reward-free-gift", (ViewStub) findViewById(R.id.taolive_bottombar_reward_free_gift_stub));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.e().b(this);
        if (this.mContainer == null) {
            return;
        }
        this.mContainer.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.start_report_from_btns".equals(str)) {
            showReport();
        } else if (!EVENT_START_QUALITY.equals(str)) {
        } else {
            if (c.a().d()) {
                initQualityDialog();
                showQualityDialog();
                return;
            }
            c.a().a(new c.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomBarFrame3.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.c.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        BottomBarFrame3.access$100(BottomBarFrame3.this);
                    }
                }
            });
        }
    }

    private void initQualityDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e7e4fe", new Object[]{this});
        } else if (this.mFrameContext == null || this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.liveId == null || com.taobao.taolive.sdk.playcontrol.c.e(this.mFrameContext) == null) {
        } else {
            DialogFragment dialogFragment = this.qualityDialog;
            if ((dialogFragment != null && dialogFragment.isVisible()) || f.o() == null) {
                return;
            }
            this.qualityDialog = f.o().createTaoliveQualityDialog(this.mFrameContext, this.mLiveDataModel.mVideoInfo.liveId);
        }
    }

    private void showQualityDialog() {
        DialogFragment dialogFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ca66b1", new Object[]{this});
        } else if (!(this.mContext instanceof FragmentActivity) || (dialogFragment = this.qualityDialog) == null) {
        } else {
            dialogFragment.show(((FragmentActivity) this.mContext).getSupportFragmentManager(), "qualityDialog");
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.start_report_from_btns", EVENT_SEND_MORE_LIVE_STATUS, EVENT_START_QUALITY, "com.taobao.taolive.room.clean_screen", EVENT_GOODS_LIST_SHOWING, xkw.EVENT_CLEAR_SCREEN_NEW};
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

    private void showReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20ffe98", new Object[]{this});
        } else {
            hfk.a(this.mContext, this.mLiveDataModel, this.mFrameContext.i().a(), this.mLandscape);
        }
    }
}
