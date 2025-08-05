package com.taobao.taobaoavsdk.widget.media;

import android.view.Surface;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public interface a {
    public static final int AR_16_9_FIT_PARENT = 4;
    public static final int AR_4_3_FIT_PARENT = 5;
    public static final int AR_ASPECT_FILL_PARENT = 1;
    public static final int AR_ASPECT_FIT_PARENT = 0;
    public static final int AR_ASPECT_WRAP_CONTENT = 2;
    public static final int AR_MATCH_PARENT = 3;

    /* renamed from: com.taobao.taobaoavsdk.widget.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0888a {
        void a(b bVar, int i, int i2);

        void a(b bVar, int i, int i2, int i3);

        void a(b bVar, boolean z);
    }

    /* loaded from: classes8.dex */
    public interface b {
        a a();

        void a(IMediaPlayer iMediaPlayer);

        Surface b();
    }

    void addRenderCallback(InterfaceC0888a interfaceC0888a);

    View getView();

    void removeRenderCallback(InterfaceC0888a interfaceC0888a);

    void setAspectRatio(int i);

    void setVideoRotation(int i);

    void setVideoSampleAspectRatio(int i, int i2);

    void setVideoSize(int i, int i2);
}
