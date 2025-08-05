package com.taobao.android.live.plugin.proxy.rank;

import android.util.Pair;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface IRankProxy extends IProxy {
    public static final String KEY = "IRankProxy";

    Pair<Long, bn> getRankEntranceDXHandler();

    Class<? extends BaseFrame> getRankEntranceFrameClass();

    Class<? extends BaseFrame> getRankFrameClass();
}
