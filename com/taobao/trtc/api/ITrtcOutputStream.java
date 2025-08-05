package com.taobao.trtc.api;

/* loaded from: classes9.dex */
public interface ITrtcOutputStream extends ITrtcDataStream {

    /* loaded from: classes9.dex */
    public interface a {
    }

    /* loaded from: classes9.dex */
    public interface b {
    }

    void setObserver(a aVar);

    void setStatsObserver(b bVar);

    String streamId();
}
