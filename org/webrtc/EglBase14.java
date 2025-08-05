package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.EglBase;
import tb.kge;

/* loaded from: classes9.dex */
public class EglBase14 implements EglBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CURRENT_SDK_VERSION;
    private static final int EGLExt_SDK_VERSION = 18;
    private static final String TAG = "EglBase14";
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    private EGLDisplay eglDisplay = getEglDisplay();
    private EGLContext eglcontext_last = null;
    private EGLSurface eglSurface_last = null;
    private EGLDisplay display_last = null;

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue() : CURRENT_SDK_VERSION;
    }

    static {
        kge.a(1515237383);
        kge.a(-780545308);
        CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    }

    public static boolean isEGL14Supported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc40656", new Object[0])).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SDK version: ");
        sb.append(CURRENT_SDK_VERSION);
        sb.append(". isEGL14Supported: ");
        sb.append(CURRENT_SDK_VERSION >= 18);
        Logging.d(TAG, sb.toString());
        return CURRENT_SDK_VERSION >= 18;
    }

    /* loaded from: classes9.dex */
    public static class Context implements EglBase.Context {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EGLContext egl14Context;

        static {
            kge.a(1545197042);
            kge.a(-1340814385);
        }

        public static /* synthetic */ EGLContext access$100(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EGLContext) ipChange.ipc$dispatch("378d22e1", new Object[]{context}) : context.egl14Context;
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b1f44ad", new Object[]{this})).longValue() : EglBase14.access$000() >= 21 ? this.egl14Context.getNativeHandle() : this.egl14Context.getHandle();
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    public EglBase14(Context context, int[] iArr) {
        this.eglConfig = getEglConfig(this.eglDisplay, iArr);
        this.eglContext = createEglContext(context, this.eglDisplay, this.eglConfig);
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2836a7e4", new Object[]{this, surface});
        } else {
            createSurfaceInternal(surface);
        }
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf02d37", new Object[]{this, surfaceTexture});
        } else {
            createSurfaceInternal(surfaceTexture);
        }
    }

    private void createSurfaceInternal(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb545411", new Object[]{this, obj});
        } else if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        } else {
            checkIsNotReleased();
            if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
                throw new RuntimeException("Already has an EGLSurface");
            }
            this.eglSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
            if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
                return;
            }
            throw new RuntimeException("Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543ee10", new Object[]{this});
        } else {
            createPbufferSurface(1, 1);
        }
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f4a260", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        this.eglSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new RuntimeException("Failed to create pixel buffer surface with size " + i + "x" + i2 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    /* renamed from: getEglBaseContext  reason: collision with other method in class */
    public Context mo2430getEglBaseContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b8515242", new Object[]{this}) : new Context(this.eglContext);
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a645a3be", new Object[]{this})).booleanValue() : this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56ce8513", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d34beae", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        } else if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
        } else {
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    private void checkIsNotReleased() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b84f05", new Object[]{this});
        } else if (this.eglDisplay != EGL14.EGL_NO_DISPLAY && this.eglContext != EGL14.EGL_NO_CONTEXT && this.eglConfig != null) {
        } else {
            throw new RuntimeException("This object has been released");
        }
    }

    @Override // org.webrtc.EglBase
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187d1eb2", new Object[]{this});
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (EglBase.lock) {
            this.eglcontext_last = EGL14.eglGetCurrentContext();
            this.eglSurface_last = EGL14.eglGetCurrentSurface(12377);
            this.display_last = EGL14.eglGetCurrentDisplay();
            if (!EGL14.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
                throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void recoverLastContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2519c3c", new Object[]{this});
            return;
        }
        synchronized (EglBase.lock) {
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.display_last.getNativeHandle() != 0 && !EGL14.eglMakeCurrent(this.display_last, this.eglSurface_last, this.eglSurface_last, this.eglcontext_last)) {
                    throw new RuntimeException("recoverLastContext failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } else if (this.display_last.getHandle() != 0 && !EGL14.eglMakeCurrent(this.display_last, this.eglSurface_last, this.eglSurface_last, this.eglcontext_last)) {
                throw new RuntimeException("recoverLastContext failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16103ed", new Object[]{this});
            return;
        }
        synchronized (EglBase.lock) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405213a7", new Object[]{this});
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f0d7fd", new Object[]{this, new Long(j)});
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    private static EGLDisplay getEglDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLDisplay) ipChange.ipc$dispatch("9a01030e", new Object[0]);
        }
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new RuntimeException("Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLConfig) ipChange.ipc$dispatch("83a5623f", new Object[]{eGLDisplay, iArr});
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, eGLConfigArr.length, iArr2, 0)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        } else if (iArr2[0] <= 0) {
            throw new RuntimeException("Unable to find any matching EGL config");
        } else {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig == null) {
                throw new RuntimeException("eglChooseConfig returned null");
            }
            return eGLConfig;
        }
    }

    private static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLContext) ipChange.ipc$dispatch("ff5fc153", new Object[]{context, eGLDisplay, eGLConfig});
        }
        if (context != null && Context.access$100(context) == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {12440, 2, 12344};
        EGLContext access$100 = context == null ? EGL14.EGL_NO_CONTEXT : Context.access$100(context);
        synchronized (EglBase.lock) {
            eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, access$100, iArr, 0);
        }
        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }
}
