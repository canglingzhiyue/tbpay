package com.taobao.artc.api;

import android.view.Surface;
import tb.kge;

/* loaded from: classes6.dex */
public interface IArtcExternalVideoCapturer {

    /* loaded from: classes6.dex */
    public enum CapturerType {
        PRI,
        SUB
    }

    /* loaded from: classes6.dex */
    public static class FrameInfo {
        public int preCostMs;

        static {
            kge.a(46283067);
        }
    }

    /* loaded from: classes6.dex */
    public enum MixMode {
        NONE,
        NEED_MIX,
        NEED_SCALE,
        NEED_MIX_SCALE
    }

    /* loaded from: classes6.dex */
    public interface Observer {
        void onExternalVideoCaptureInitialized();

        void onExternalVideoCaptureMixMode(MixMode mixMode);

        void onExternalVideoCaptureStarted();

        void onExternalVideoCaptureStopped();
    }

    Surface getSurface(CapturerType capturerType);

    void setObserver(CapturerType capturerType, Observer observer);

    void setVideoSize(CapturerType capturerType, int i, int i2);

    void updateFrameInfo(CapturerType capturerType, FrameInfo frameInfo);
}
