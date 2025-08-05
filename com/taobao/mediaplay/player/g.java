package com.taobao.mediaplay.player;

import android.view.Surface;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public interface g {
    public static final int AR_16_9_FIT_PARENT = 4;
    public static final int AR_4_3_FIT_PARENT = 5;
    public static final int AR_ASPECT_FILL_PARENT = 1;
    public static final int AR_ASPECT_FIT_PARENT = 0;
    public static final int AR_ASPECT_WRAP_CONTENT = 2;
    public static final int AR_MATCH_PARENT = 3;

    /* loaded from: classes7.dex */
    public interface a {
        void T();

        void U();

        void a(b bVar);

        void a(b bVar, int i, int i2);

        void a(b bVar, int i, int i2, int i3);

        void a(b bVar, boolean z);

        void g(int i);
    }

    /* loaded from: classes7.dex */
    public interface b {
        g a();

        void a(IMediaPlayer iMediaPlayer);

        Surface b();

        boolean c();
    }

    void addRenderCallback(a aVar);

    float getDisplayAspectRatio();

    View getView();

    boolean isAvailable();

    void removeRenderCallback(a aVar);

    void requestLayout();

    void setAspectRatio(int i);

    void setBackground(boolean z);

    void setVideoRotation(int i);

    void setVideoSampleAspectRatio(int i, int i2);

    void setVideoSize(int i, int i2);
}
