package com.taobao.android.live.plugin.proxy.comments;

import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;

/* loaded from: classes6.dex */
public interface ICommentsProxy extends IProxy {
    public static final String KEY = "ICommentsProxy";

    /* loaded from: classes6.dex */
    public interface a {
        String getEnhancedTypeQuestionAnswer();
    }

    /* loaded from: classes6.dex */
    public interface b {
        Long getImportantMessageIntervalTime();

        Long getImportantMessageTimeoutTime();
    }

    Class<? extends BaseFrame> getChatFrame3Class();

    Class<? extends BaseFrame> getImportantEventFrameClass();

    Class<? extends BaseFrame> getMessageCardFrame3Class();
}
