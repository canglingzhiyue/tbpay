package com.taobao.android.live.plugin.proxy.gift;

import android.content.Context;
import android.view.ViewStub;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.android.tblive.gift.model.TBLiveGiftEntity;
import com.taobao.taolive.room.adapter.alphavideo.VideoGiftView;
import tb.bxg;
import tb.bxh;
import tb.jbv;
import tb.jby;
import tb.jca;
import tb.jcb;

/* loaded from: classes6.dex */
public interface IGiftProxy extends IProxy {
    public static final String KEY = "IGiftProxy";

    void adjustGiftBottomHeight(int i);

    void adjustSmallHeightInAliveScene(int i);

    void clearGiftQueue();

    bxg createResourceDownloaderManager();

    bxh createTBLiveGiftConfig(jca jcaVar, jbv jbvVar);

    void destroy();

    boolean enableBigGift();

    boolean enableMD5FileCheck();

    boolean enablePresaleScreenGift();

    void enableVideoGift(VideoGiftView videoGiftView);

    Class<? extends BaseFrame> getGiftFrameClass();

    void init(Context context, ViewStub viewStub, bxh bxhVar, jcb jcbVar);

    void sendGift(TBLiveGiftEntity tBLiveGiftEntity);

    void setGuestSendGiftEffectStatus(boolean z);

    void setLogImpl(jby jbyVar);
}
