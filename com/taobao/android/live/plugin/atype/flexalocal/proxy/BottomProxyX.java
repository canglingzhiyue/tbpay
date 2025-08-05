package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomBarFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.BottomInputFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.DoubleClickFavFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.FavorAnimFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.FavorCountFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.GoodsIconFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MoreFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.RewardFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.ShareFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.b;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.hfm;
import tb.kge;

/* loaded from: classes6.dex */
public class BottomProxyX implements IBottomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Class<? extends BaseFrame>> frameClassMap = new HashMap<String, Class<? extends BaseFrame>>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.proxy.BottomProxyX.1
        {
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_FRAME_3, BottomBarFrame3.class);
            put(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME, BottomInputFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3, DoubleClickFavFrame3.class);
            put(IBottomProxy.KEY_FRAME_CLASS_FAVOR_COUNT_FRAME_3, FavorCountFrame3.class);
            put(IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME, GoodsIconFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_MORE_FRAME, MoreFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_REWARD_FRAME, RewardFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_SHARE_FRAME, ShareFrame.class);
            put(IBottomProxy.KEY_FRAME_CLASS_FAVOR_ANIM_FRAME_3, FavorAnimFrame3.class);
        }
    };

    static {
        kge.a(-1666023038);
        kge.a(385893681);
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getRewardGuideResponseDataActionOpenRewardPanel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b96a3a66", new Object[]{this}) : "openRewardPanel";
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getShareFissionLiveShareActionInfoParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81eaf378", new Object[]{this}) : b.LIVE_SHARE_ACTION_INFO_PARAMS;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str}) : this.frameClassMap.get(str);
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarLeftDP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c29ad29f", new Object[]{this})).intValue() : BottomBarFrame3.sBottomBarLeftDP;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarBottomDP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ffdab543", new Object[]{this})).intValue() : BottomBarFrame3.sBottomBarBottomDP;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createBottomBarFrame3(Context context, a aVar, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("20cb4468", new Object[]{this, context, aVar, viewStub});
        }
        BottomBarFrame3 bottomBarFrame3 = new BottomBarFrame3(context, aVar);
        bottomBarFrame3.createView(viewStub);
        return bottomBarFrame3;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public boolean isShareEntryFold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f4ff7c9", new Object[]{this})).booleanValue() : hfm.c();
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public IBottomProxy.a createShareFission() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBottomProxy.a) ipChange.ipc$dispatch("4554686e", new Object[]{this}) : new b();
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Map<String, Integer> getIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f99e47", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IBottomProxy.R_ID_TAOLIVE_BOTTOM_BAR_WARPPER, Integer.valueOf(R.id.taolive_bottom_bar_wrapper));
        hashMap.put(IBottomProxy.R_ID_TAOLIVE_REWARD_X_CARD_FRAME, Integer.valueOf(R.id.taolive_reward_x_card_frame));
        hashMap.put(IBottomProxy.R_ID_TAOLIVE_REWARD_X_ICON, Integer.valueOf(R.id.layout_taolive_reward));
        return hashMap;
    }
}
