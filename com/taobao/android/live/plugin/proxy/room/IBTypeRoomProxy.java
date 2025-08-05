package com.taobao.android.live.plugin.proxy.room;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes6.dex */
public interface IBTypeRoomProxy extends IBTypeProxy {
    public static final String KEY = "IBTypeRoomProxy";
    public static final String KEY_FRAME_CLASS_BOTTOM_CONTAINER_FRAME = "BottomContainerFrame";
    public static final String KEY_FRAME_CLASS_CONNECTION_FRAME_2 = "ConnectionFrame2";
    public static final String KEY_FRAME_CLASS_NOTICE_FRAME_2 = "NoticeFrame2";
    public static final String KEY_FRAME_CLASS_QA_EXPLAIN_FRAME = "QAExplainFrame";
    public static final String KEY_FRAME_CLASS_REWARD_FREE_GIFT_FRAME = "RewardPanelFreeGiftFrame";
    public static final String KEY_FRAME_CLASS_REWARD_PANEL_FRAME = "RewardPanelFrame";
    public static final String KEY_FRAME_CLASS_SUBSCRIBE_CARD_FRAME_2 = "SubscribeCardFrame2";

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a(int i, NetResponse netResponse, boolean z);
    }

    /* loaded from: classes6.dex */
    public interface d {
        boolean a(Activity activity, String str);

        boolean b();
    }

    /* loaded from: classes6.dex */
    public interface e {
        void a(Intent intent, com.taobao.android.nav.d dVar);

        void a(TBLiveDataModel tBLiveDataModel, g gVar);

        void a(TBLiveDataModel tBLiveDataModel, g gVar, a aVar);
    }

    void adjustBBConnectionVideoSize(Context context, a aVar, String str);

    boolean checkFollowFromCache(String str);

    boolean checkFollowFromCache(String str, c cVar);

    BaseFrame createConnectionFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar, ViewStub viewStub);

    AbsFavorCountFrame createFavorCountFrame(Context context, long j, String str, boolean z, ViewStub viewStub);

    BaseFrame createPrivateVipFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ViewStub viewStub);

    BaseFrame createRightBackwardTipsFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    BaseFrame createSubscribeCardFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, ViewGroup viewGroup);

    com.alilive.adapter.business.b createTBFollowBusiness(com.taobao.taolive.sdk.adapter.network.d dVar);

    com.alilive.adapter.business.b createTBFollowGuangBusiness(com.taobao.taolive.sdk.adapter.network.d dVar);

    b createTBLiveFollowBusiness(String str, int i, String str2, c cVar);

    e getBackwardX();

    Class<? extends BaseFrame> getFrameClassMap(String str);

    d getNonageServiceX();

    void initBTypeOtherFrame(BaseFrame baseFrame, Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    void updateFollow(String str, boolean z);

    /* loaded from: classes6.dex */
    public static abstract class AbsFavorCountFrame extends BaseFrame {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1233203797);
        }

        public abstract void updateFavorCount(long j);

        public AbsFavorCountFrame(Context context) {
            super(context);
        }

        public AbsFavorCountFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
            super(context, z, tBLiveDataModel);
        }
    }
}
