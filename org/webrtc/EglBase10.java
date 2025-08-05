package org.webrtc;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.android.alibaba.ip.runtime.IpChange;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;
import tb.kge;

/* loaded from: classes9.dex */
public class EglBase10 implements EglBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;
    private final EGL10 egl = (EGL10) EGLContext.getEGL();
    private EGLDisplay eglDisplay = getEglDisplay();

    static {
        kge.a(1515237379);
        kge.a(-780545308);
    }

    /* loaded from: classes9.dex */
    public static class Context implements EglBase.Context {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EGLContext eglContext;

        static {
            kge.a(185080302);
            kge.a(-1340814385);
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b1f44ad", new Object[]{this})).longValue();
            }
            return 0L;
        }

        public static /* synthetic */ EGLContext access$000(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (EGLContext) ipChange.ipc$dispatch("110e56cc", new Object[]{context}) : context.eglContext;
        }

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }
    }

    public EglBase10(Context context, int[] iArr) {
        this.eglConfig = getEglConfig(this.eglDisplay, iArr);
        this.eglContext = createEglContext(context, this.eglDisplay, this.eglConfig);
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2836a7e4", new Object[]{this, surface});
        } else {
            createSurfaceInternal(new SurfaceHolder(surface) { // from class: org.webrtc.EglBase10.1FakeSurfaceHolder
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final Surface surface;

                static {
                    kge.a(1368421748);
                    kge.a(-654636465);
                }

                @Override // android.view.SurfaceHolder
                public void addCallback(SurfaceHolder.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efe9cc7a", new Object[]{this, callback});
                    }
                }

                @Override // android.view.SurfaceHolder
                public Rect getSurfaceFrame() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Rect) ipChange2.ipc$dispatch("e77f3246", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.view.SurfaceHolder
                public boolean isCreating() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("2efde10e", new Object[]{this})).booleanValue();
                    }
                    return false;
                }

                @Override // android.view.SurfaceHolder
                public Canvas lockCanvas() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Canvas) ipChange2.ipc$dispatch("682e273f", new Object[]{this});
                    }
                    return null;
                }

                @Override // android.view.SurfaceHolder
                public Canvas lockCanvas(Rect rect) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Canvas) ipChange2.ipc$dispatch("6b5af8c4", new Object[]{this, rect});
                    }
                    return null;
                }

                @Override // android.view.SurfaceHolder
                public void removeCallback(SurfaceHolder.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9987af7", new Object[]{this, callback});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setFixedSize(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("414e683a", new Object[]{this, new Integer(i), new Integer(i2)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setFormat(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c456a403", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setKeepScreenOn(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("590d82db", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void setSizeFromLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4052bc5e", new Object[]{this});
                    }
                }

                @Override // android.view.SurfaceHolder
                @Deprecated
                public void setType(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // android.view.SurfaceHolder
                public void unlockCanvasAndPost(Canvas canvas) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f7596e3", new Object[]{this, canvas});
                    }
                }

                {
                    this.surface = surface;
                }

                @Override // android.view.SurfaceHolder
                public Surface getSurface() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Surface) ipChange2.ipc$dispatch("91c7c0e4", new Object[]{this}) : this.surface;
                }
            });
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
        } else if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        } else {
            checkIsNotReleased();
            if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
                throw new RuntimeException("Already has an EGLSurface");
            }
            this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
            if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
                return;
            }
            throw new RuntimeException("Failed to create window surface: 0x" + Integer.toHexString(this.egl.eglGetError()));
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
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        this.eglSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            return;
        }
        throw new RuntimeException("Failed to create pixel buffer surface with size " + i + "x" + i2 + ": 0x" + Integer.toHexString(this.egl.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    /* renamed from: getEglBaseContext */
    public EglBase.Context mo2430getEglBaseContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EglBase.Context) ipChange.ipc$dispatch("be063245", new Object[]{this}) : new Context(this.eglContext);
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a645a3be", new Object[]{this})).booleanValue() : this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56ce8513", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d34beae", new Object[]{this})).intValue();
        }
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        } else if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
        } else {
            this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
            this.eglSurface = EGL10.EGL_NO_SURFACE;
        }
    }

    private void checkIsNotReleased() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b84f05", new Object[]{this});
        } else if (this.eglDisplay != EGL10.EGL_NO_DISPLAY && this.eglContext != EGL10.EGL_NO_CONTEXT && this.eglConfig != null) {
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
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
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
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        synchronized (EglBase.lock) {
            if (!this.egl.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
                throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
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
        throw new RuntimeException("unsupported recoverLastContext");
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16103ed", new Object[]{this});
            return;
        }
        synchronized (EglBase.lock) {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
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
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f0d7fd", new Object[]{this, new Long(j)});
        } else {
            swapBuffers();
        }
    }

    private EGLDisplay getEglDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLDisplay) ipChange.ipc$dispatch("40fb53b6", new Object[]{this});
        }
        EGLDisplay eglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("Unable to get EGL10 display: 0x" + Integer.toHexString(this.egl.eglGetError()));
        } else if (this.egl.eglInitialize(eglGetDisplay, new int[2])) {
            return eglGetDisplay;
        } else {
            throw new RuntimeException("Unable to initialize EGL10: 0x" + Integer.toHexString(this.egl.eglGetError()));
        }
    }

    private EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLConfig) ipChange.ipc$dispatch("fe1a28ef", new Object[]{this, eGLDisplay, iArr});
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!this.egl.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, eGLConfigArr.length, iArr2)) {
            throw new RuntimeException("eglChooseConfig failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
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

    private EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EGLContext) ipChange.ipc$dispatch("43c6bdf7", new Object[]{this, context, eGLDisplay, eGLConfig});
        }
        if (context != null && Context.access$000(context) == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
        EGLContext access$000 = context == null ? EGL10.EGL_NO_CONTEXT : Context.access$000(context);
        synchronized (EglBase.lock) {
            eglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, access$000, iArr);
        }
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw new RuntimeException("Failed to create EGL context: 0x" + Integer.toHexString(this.egl.eglGetError()));
    }
}
