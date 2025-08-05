package com.uc.webview.export.media;

import android.view.Surface;
import android.view.View;

/* loaded from: classes9.dex */
public interface MediaController {

    /* loaded from: classes9.dex */
    public interface MediaPlayerControl {
        Object execute(String str, int i, int i2, Object obj);

        void notify(String str, long j, long j2, Object obj);

        void setSurface(Surface surface);
    }

    View asView();

    View getExtendView(int i, Object obj);

    View getSuperToolbar();

    void onMessage(String str, long j, long j2, Object obj);

    void setMediaPlayerControl(MediaPlayerControl mediaPlayerControl);
}
