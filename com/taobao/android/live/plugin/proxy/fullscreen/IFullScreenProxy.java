package com.taobao.android.live.plugin.proxy.fullscreen;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IFullScreenProxy extends IProxy {
    public static final String KEY = "IFullScreenProxy";
    public static final String R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN = "R.id.taolive_room_top_close_btn";
    public static final String R_ID_TAOLIVE_ROOM_TOP_MORE_BTN = "R.id.taolive_room_top_more_btn";
    public static final String R_LAYOUT_TAOLIVE_CLOSE_BTN_LAYOUT = "R.layout.taolive_close_btn_layout";

    BaseFrame createFullScreenLiveFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    BaseFrame createFullScreenReplayFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    Map<String, Integer> getRealRIdMap();

    boolean isInstanceOfFullScreenFrame(Object obj);

    boolean isInstanceOfFullScreenLiveFrame2(Object obj);

    boolean isInstanceOfFullScreenReplayFrame2(Object obj);
}
