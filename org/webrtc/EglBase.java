package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;
import tb.kge;

/* loaded from: classes9.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final int[] CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int[] CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EGL_RECORDABLE_ANDROID, 1, 12344};

    /* loaded from: classes9.dex */
    public interface Context {
        long getNativeEglContext();
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    /* renamed from: getEglBaseContext */
    Context mo2430getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void recoverLastContext();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    /* loaded from: classes9.dex */
    public static class StaticMethod {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(220118735);
        }

        public static EglBase create(Context context, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EglBase) ipChange.ipc$dispatch("fa3d0b30", new Object[]{context, iArr});
            }
            if (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) {
                return new EglBase14((EglBase14.Context) context, iArr);
            }
            return new EglBase10((EglBase10.Context) context, iArr);
        }

        public static EglBase create() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("59e935be", new Object[0]) : create(null, EglBase.CONFIG_PLAIN);
        }

        public static EglBase create(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("3f5c543e", new Object[]{context}) : create(context, EglBase.CONFIG_PLAIN);
        }

        public static EglBase createEgl10(int[] iArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("3d1032bf", new Object[]{iArr}) : new EglBase10(null, iArr);
        }

        public static EglBase createEgl10(EGLContext eGLContext, int[] iArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("ffb45603", new Object[]{eGLContext, iArr}) : new EglBase10(new EglBase10.Context(eGLContext), iArr);
        }

        public static EglBase createEgl14(int[] iArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("44757f3b", new Object[]{iArr}) : new EglBase14(null, iArr);
        }

        public static EglBase createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("5bb535af", new Object[]{eGLContext, iArr}) : new EglBase14(new EglBase14.Context(eGLContext), iArr);
        }
    }
}
