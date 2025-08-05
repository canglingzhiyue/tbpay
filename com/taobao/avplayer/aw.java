package com.taobao.avplayer;

/* loaded from: classes6.dex */
public interface aw {
    void onVideoClose();

    void onVideoComplete();

    void onVideoError(Object obj, int i, int i2);

    void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2);

    void onVideoPause(boolean z);

    void onVideoPlay();

    void onVideoPrepared(Object obj);

    void onVideoProgressChanged(int i, int i2, int i3);

    void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType);

    void onVideoSeekTo(int i);

    void onVideoStart();
}
