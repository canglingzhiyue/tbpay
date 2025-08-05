package com.taobao.avplayer;

/* loaded from: classes6.dex */
public interface av {
    void onVideoClose();

    void onVideoComplete();

    void onVideoError(Object obj, int i, int i2);

    void onVideoFullScreen();

    void onVideoInfo(Object obj, int i, int i2);

    void onVideoNormalScreen();

    void onVideoPause(boolean z);

    void onVideoPlay();

    void onVideoPrepared(Object obj);

    void onVideoProgressChanged(int i, int i2, int i3);

    void onVideoSeekTo(int i);

    void onVideoStart();
}
