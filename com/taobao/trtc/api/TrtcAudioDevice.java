package com.taobao.trtc.api;

import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes9.dex */
public interface TrtcAudioDevice {

    /* loaded from: classes9.dex */
    public interface a {
        void onAudioFrame(b bVar);
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f23031a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public int f;
        public ByteBuffer g;
        public int h;

        static {
            kge.a(-1533266684);
        }
    }

    void enableSpeakerphone(boolean z);

    TrtcDefines.TrtcAudioRouteDevice getCurrentDevice();

    void muteLocal(boolean z);

    void muteRemote(String str, boolean z);

    void setAEDEnable(boolean z);

    @Deprecated
    void setAudioEventObserver(ITrtcObserver.a aVar);

    void setAudioObserver(a aVar);

    void setAudioPlayoutObserver(a aVar);

    void setAudioProcessObserver(a aVar);
}
