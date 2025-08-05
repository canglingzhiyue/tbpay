package com.taobao.android.live.plugin.proxy.topbar;

import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface ITopBarProxy extends IProxy {
    public static final String KEY = "ITopBarProxy";

    Class<? extends BaseFrame> getAnchorInfoFrameClass();

    Class<? extends BaseFrame> getTopBarFrame3Class();
}
