package com.taobao.android.live.plugin.proxy.alphavideo;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.taolive.room.adapter.alphavideo.b;
import com.taobao.taolive.room.adapter.renderlayer.BaseEffectVideoTextLayout;
import tb.kge;

/* loaded from: classes6.dex */
public class AlphaVideoProxy extends g<IAlphaVideoProxy> implements IAlphaVideoProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AlphaVideoProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final AlphaVideoProxy f14090a;

        static {
            kge.a(1831793476);
            f14090a = new AlphaVideoProxy();
        }

        public static /* synthetic */ AlphaVideoProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AlphaVideoProxy) ipChange.ipc$dispatch("fc42fed", new Object[0]) : f14090a;
        }
    }

    static {
        kge.a(-1649896916);
        kge.a(309963501);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IAlphaVideoProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.AlphaVideoProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "AlphaVideo";
    }

    public static AlphaVideoProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlphaVideoProxy) ipChange.ipc$dispatch("b05cc97", new Object[0]) : a.a();
    }

    private AlphaVideoProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[AlphaVideoProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy
    public com.taobao.taolive.room.adapter.alphavideo.e createGLTextureViewPlayerController(Context context, LifecycleOwner lifecycleOwner, b.InterfaceC0898b interfaceC0898b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.room.adapter.alphavideo.e) ipChange.ipc$dispatch("12bc0c1c", new Object[]{this, context, lifecycleOwner, interfaceC0898b});
        }
        IAlphaVideoProxy real = getReal();
        com.taobao.taolive.room.adapter.alphavideo.e createGLTextureViewPlayerController = real != null ? real.createGLTextureViewPlayerController(context, lifecycleOwner, interfaceC0898b) : null;
        e.c("[AlphaVideoProxy#createGLTextureViewPlayerController]  value: " + createGLTextureViewPlayerController);
        return createGLTextureViewPlayerController;
    }

    @Override // com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy
    public com.taobao.taolive.room.adapter.alphavideo.a createDataSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.room.adapter.alphavideo.a) ipChange.ipc$dispatch("6092df4e", new Object[]{this});
        }
        IAlphaVideoProxy real = getReal();
        com.taobao.taolive.room.adapter.alphavideo.a createDataSource = real != null ? real.createDataSource() : null;
        e.c("[AlphaVideoProxy#createDataSource]  value: " + createDataSource);
        return createDataSource;
    }

    @Override // com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        IAlphaVideoProxy real = getReal();
        Class<? extends BaseFrame> frameClassMap = real != null ? real.getFrameClassMap(str) : null;
        e.c("[AlphaVideoProxy#getFrameClassMap]  value: " + frameClassMap);
        return frameClassMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy
    public BaseEffectVideoTextLayout createEffectVideoTextLayout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEffectVideoTextLayout) ipChange.ipc$dispatch("b8703ff1", new Object[]{this, context});
        }
        IAlphaVideoProxy real = getReal();
        BaseEffectVideoTextLayout createEffectVideoTextLayout = real != null ? real.createEffectVideoTextLayout(context) : null;
        e.c("[AlphaVideoProxy#createEffectVideoTextLayout]  value: " + createEffectVideoTextLayout);
        return createEffectVideoTextLayout;
    }
}
