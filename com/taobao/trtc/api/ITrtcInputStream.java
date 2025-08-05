package com.taobao.trtc.api;

import android.view.Surface;
import com.taobao.trtc.api.TrtcDefines;

/* loaded from: classes9.dex */
public interface ITrtcInputStream extends ITrtcDataStream {

    /* loaded from: classes9.dex */
    public interface a {
    }

    /* loaded from: classes9.dex */
    public interface b {
        void a(TrtcDefines.i iVar);
    }

    void inputSei(String str, boolean z);

    void setStatsObserver(b bVar);

    TrtcStreamConfig streamConfig();

    String streamId();

    void update(boolean z, boolean z2, boolean z3);

    Surface videoInputSurface();
}
