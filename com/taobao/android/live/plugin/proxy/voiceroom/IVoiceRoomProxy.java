package com.taobao.android.live.plugin.proxy.voiceroom;

import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;

/* loaded from: classes6.dex */
public interface IVoiceRoomProxy extends IBTypeProxy {
    public static final String KEY = "IVoiceRoomProxy";

    BaseFrame getVoiceRoomFrame(Context context, a aVar);

    Class<? extends BaseFrame> getVoiceRoomFrameClass();
}
