package com.taobao.trtc.api;

import com.taobao.trtc.api.TrtcDefines;

/* loaded from: classes9.dex */
public interface ITrtcDataStream {

    /* loaded from: classes9.dex */
    public interface a {
        void a(TrtcDefines.f fVar);
    }

    void sendDataFrame(TrtcDefines.f fVar);

    void setDataStreamObserver(a aVar);
}
