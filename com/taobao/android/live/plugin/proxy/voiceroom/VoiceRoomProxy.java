package com.taobao.android.live.plugin.proxy.voiceroom;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class VoiceRoomProxy extends g<IVoiceRoomProxy> implements IVoiceRoomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VoiceRoomProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final VoiceRoomProxy f14132a;

        static {
            kge.a(2067431232);
            f14132a = new VoiceRoomProxy();
        }

        public static /* synthetic */ VoiceRoomProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VoiceRoomProxy) ipChange.ipc$dispatch("5306e869", new Object[0]) : f14132a;
        }
    }

    static {
        kge.a(1701595568);
        kge.a(870344571);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IVoiceRoomProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.VoiceRoomProxyX";
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "多人语音房连麦";
    }

    public static VoiceRoomProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VoiceRoomProxy) ipChange.ipc$dispatch("d87ba793", new Object[0]) : a.a();
    }

    private VoiceRoomProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[VoiceRoomProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.voiceroom.IVoiceRoomProxy
    public Class<? extends BaseFrame> getVoiceRoomFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2dc2016", new Object[]{this});
        }
        IVoiceRoomProxy real = getReal();
        Class<? extends BaseFrame> voiceRoomFrameClass = real != null ? real.getVoiceRoomFrameClass() : null;
        e.c("[VoiceRoomProxy#getVoiceRoomFrameClass]  clazz: " + voiceRoomFrameClass);
        return voiceRoomFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.voiceroom.IVoiceRoomProxy
    public BaseFrame getVoiceRoomFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("a09c8874", new Object[]{this, context, aVar});
        }
        IVoiceRoomProxy real = getReal();
        BaseFrame voiceRoomFrame = real != null ? real.getVoiceRoomFrame(context, aVar) : null;
        e.c("[VoiceRoomProxy#getPkLinkFrame]  value: " + voiceRoomFrame);
        return voiceRoomFrame;
    }
}
