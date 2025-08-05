package com.taobao.android.live.plugin.proxy.notice;

import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface INoticeProxy extends IProxy {
    public static final String KEY = "INoticeProxy";

    Class<? extends BaseFrame> getNoticeFrame3Class();
}
