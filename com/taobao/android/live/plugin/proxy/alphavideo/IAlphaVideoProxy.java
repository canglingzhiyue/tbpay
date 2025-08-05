package com.taobao.android.live.plugin.proxy.alphavideo;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.room.adapter.alphavideo.a;
import com.taobao.taolive.room.adapter.alphavideo.b;
import com.taobao.taolive.room.adapter.alphavideo.e;
import com.taobao.taolive.room.adapter.renderlayer.BaseEffectVideoTextLayout;

/* loaded from: classes6.dex */
public interface IAlphaVideoProxy extends IBTypeProxy {
    public static final String KEY = "IAlphaVideoProxy";
    public static final String KEY_FRAME_CLASS_FAVOR_EFFECT_FRAME = "FavorEffectFrame";

    a createDataSource();

    BaseEffectVideoTextLayout createEffectVideoTextLayout(Context context);

    e createGLTextureViewPlayerController(Context context, LifecycleOwner lifecycleOwner, b.InterfaceC0898b interfaceC0898b);

    Class<? extends BaseFrame> getFrameClassMap(String str);
}
