package com.taobao.android.live.plugin.proxy.bottom;

import android.content.Context;
import android.view.ViewStub;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IBottomProxy extends IProxy {
    public static final String KEY = "IBottomProxy";
    public static final String KEY_FRAME_CLASS_BOTTOM_BAR_FRAME_3 = "BottomBarFrame3";
    public static final String KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME = "BottomInputFrame";
    public static final String KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3 = "DoubleClickFavFrame3";
    public static final String KEY_FRAME_CLASS_FARM_GUIDE_FRAME = "FarmGuideFrame";
    public static final String KEY_FRAME_CLASS_FAVOR_ANIM_FRAME_3 = "FavorAnimFrame3";
    public static final String KEY_FRAME_CLASS_FAVOR_COUNT_FRAME_3 = "FavorCountFrame3";
    public static final String KEY_FRAME_CLASS_GOODS_ICON_FRAME = "GoodsIconFrame";
    public static final String KEY_FRAME_CLASS_MORE_FRAME = "MoreFrame";
    public static final String KEY_FRAME_CLASS_QA_FRAME = "QAFrame";
    public static final String KEY_FRAME_CLASS_REWARD_FRAME = "RewardFrame";
    public static final String KEY_FRAME_CLASS_SHARE_FRAME = "ShareFrame";
    public static final String R_ID_TAOLIVE_BOTTOM_BAR_WARPPER = "R.id.taolive_bottom_bar_wrapper";
    public static final String R_ID_TAOLIVE_REWARD_X_CARD_FRAME = "R.id.taolive_reward_x_card_frame";
    public static final String R_ID_TAOLIVE_REWARD_X_ICON = "R.id.layout_taolive_reward";

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, String str2);

        void a(Map<String, String> map, String str);
    }

    BaseFrame createBottomBarFrame3(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ViewStub viewStub);

    a createShareFission();

    int getBottomBarBottomDP();

    int getBottomBarLeftDP();

    Class<? extends BaseFrame> getFrameClassMap(String str);

    Map<String, Integer> getIdMap();

    String getRewardGuideResponseDataActionOpenRewardPanel();

    String getShareFissionLiveShareActionInfoParams();

    boolean isShareEntryFold();
}
