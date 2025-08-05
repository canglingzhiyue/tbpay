package com.taobao.android.live.plugin.proxy.projectscreen;

import android.util.Pair;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface IProjectScreenProxy extends IProxy {
    public static final String KEY = "IProjectScreenProxy";

    Pair<Long, bn> getProjectScreenDXHandler();

    Class<? extends BaseFrame> getProjectScreenIconFrameClass();

    Class<? extends BaseFrame> getProjectScreenOptFrameClass();

    Class<? extends BaseFrame> getProjectScreenSearchFrameClass();
}
