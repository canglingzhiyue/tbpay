package com.taobao.android.live.plugin.proxy.panel;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* loaded from: classes6.dex */
public interface IPanelProxy extends IProxy {
    public static final String KEY = "IPanelProxy";

    void blankFrame2Hide(Object obj);

    void blankFrame2Show(Object obj);

    void destoryChatPreProcessor3(Object obj);

    Class<? extends BaseFrame> getBlankFrame2Class();

    BaseFrame getLiveAvatarNewFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar);

    BaseFrame getLiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel);

    Class<? extends BaseFrame> getLiveEndFrameClass();

    Class<? extends BaseFrame> getLiveReadyFrameClass();

    BaseFrame getShowcaseFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem);

    BaseFrame getTopFakeBarFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar);

    Class<? extends BaseFrame> getTopSelectCommentFrameClass();

    BaseFrame getVirtualAnchorSignFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar);

    Class<? extends BaseFrame> getVirtualAnchorSignFrameClass();

    Class<? extends BaseFrame> getWatermarkFrame3Class();

    Object iniChatPreProcessor3(com.taobao.alilive.aliliveframework.frame.a aVar, Context context);

    void preProcessChat(Object obj, String str, int i, a aVar);
}
