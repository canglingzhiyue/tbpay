package com.taobao.android.live.plugin.proxy.officialLive;

import android.util.Pair;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface IOfficialLiveEntryProxy extends IProxy {
    public static final String KEY = "IOfficialLiveProxy";

    Pair<Long, bn> getOfficialLiveEntryDXHandler();

    Class<? extends BaseFrame> getOfficialLiveEntryFrameClass();
}
