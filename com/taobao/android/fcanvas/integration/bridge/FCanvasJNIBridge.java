package com.taobao.android.fcanvas.integration.bridge;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.adapter.b;
import com.taobao.android.fcanvas.integration.f;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.gix;
import tb.kge;

/* loaded from: classes5.dex */
public class FCanvasJNIBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FCanvas";
    private static final Map<String, WeakReference<Handler>> sCardJSHandlers;
    private static ExternalAdapterImageProvider sExternalAdapterImageProvider;
    private static volatile boolean sIsImageProviderInstalled;
    private static final Map<String, b> sOnCanvasFirstFrameListenerMap;
    private static final Map<String, OnCanvasTypeChangedListener> sOnCanvasTypeChangedListenerMap;
    private f mVsyncScheduler;
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativePlatformViewId;

    /* loaded from: classes5.dex */
    public static class ExternalTexture {
        public Surface surface;
        public SurfaceTextureWrapper surfaceTexture;

        static {
            kge.a(699904387);
        }

        public ExternalTexture(SurfaceTextureWrapper surfaceTextureWrapper) {
            this.surfaceTexture = surfaceTextureWrapper;
            this.surface = new Surface(this.surfaceTexture.surfaceTexture());
        }
    }

    /* loaded from: classes5.dex */
    public interface OnCanvasTypeChangedListener {
        void onCanvasTypeChanged(String str, boolean z);
    }

    public static native String dumpProfileInfo();

    public static native void nCreateNativeFCanvas(String str, int i, int i2, int i3, boolean z);

    private native Bitmap nMakeSnapshot(String str);

    public static native void nNotifyOnOnlineConfigChanged(String str);

    private native void nPause(long j);

    public static native void nPerformTaskOnJsThread(String str, long j);

    public static native void nRegisterCanvasNativeAPI(long j, String str);

    public static native void nResizeFCanvas(String str, int i, int i2, int i3, int i4);

    private native void nResume(long j);

    public static native void nUnRegisterCanvasNativeAPI(long j, String str);

    private native long nativeAttach(FCanvasJNIBridge fCanvasJNIBridge, String str);

    private native void nativeDestroy(long j, String str);

    public static native void nativeInitializeCanvasRuntime(float f, boolean z, int i, String str);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2);

    private native void nativeSurfaceChanged(long j, int i, int i2, String str, boolean z);

    private native void nativeSurfaceCreated(long j, Surface surface, String str, boolean z);

    private native void nativeSurfaceDestroyed(long j, String str, boolean z);

    private static native void notifyExternalAdapterImageProviderInstalled();

    private static native void notifyExternalTextureFrameAvailable(String str);

    public native void nativeOnVsync(long j, long j2);

    public native void notifyMemoryPressure(long j, String str);

    public native void setProfileEnabled(String str, boolean z, boolean z2);

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            notifyExternalTextureFrameAvailable(str);
        }
    }

    static {
        kge.a(-1074834057);
        sOnCanvasTypeChangedListenerMap = new HashMap(4);
        sOnCanvasFirstFrameListenerMap = new HashMap(4);
        sCardJSHandlers = new HashMap(8);
    }

    public void bindVsyncScheduler(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fde276", new Object[]{this, fVar});
        } else {
            this.mVsyncScheduler = fVar;
        }
    }

    public boolean isAttached() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue() : this.nativePlatformViewId != null;
    }

    public void attachToNative(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaa2f28", new Object[]{this, str});
            return;
        }
        ensureRunningOnMainThread();
        if (this.nativePlatformViewId != null) {
            return;
        }
        this.nativePlatformViewId = Long.valueOf(nativeAttach(this, str));
    }

    public void detachFromNativeAndReleaseResources(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79bf44b2", new Object[]{this, str});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l != null) {
            nativeDestroy(l.longValue(), StringUtils.isEmpty(str) ? "" : str);
        }
        this.nativePlatformViewId = null;
        com.taobao.android.fcanvas.integration.b.a().a(str);
    }

    public void notifyMemoryPressure(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7ccb60", new Object[]{this, str});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        notifyMemoryPressure(l.longValue(), str);
    }

    public void clearCallbacks(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbc2cd2", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            sOnCanvasTypeChangedListenerMap.remove(str);
            sOnCanvasFirstFrameListenerMap.remove(str);
        }
    }

    public void onSurfaceCreated(Surface surface, String str, FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cfbdca", new Object[]{this, surface, str, renderType});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        nativeSurfaceCreated(l.longValue(), surface, str, renderType == FCanvasInstance.RenderType.webGL);
    }

    public void onSurfaceChanged(int i, int i2, String str, FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545809ea", new Object[]{this, new Integer(i), new Integer(i2), str, renderType});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        nativeSurfaceChanged(l.longValue(), i, i2, str, renderType == FCanvasInstance.RenderType.webGL);
    }

    public void onSurfaceDestroyed(String str, FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894be3c5", new Object[]{this, str, renderType});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        long longValue = l.longValue();
        if (renderType != FCanvasInstance.RenderType.webGL) {
            z = false;
        }
        nativeSurfaceDestroyed(longValue, str, z);
    }

    public void setViewportMetrics(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9735d5e", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        ensureRunningOnMainThread();
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        nativeSetViewportMetrics(l.longValue(), f, i, i2);
    }

    public static void setOnCanvasFirstFrameListener(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64903227", new Object[]{str, bVar});
        } else if (StringUtils.isEmpty(str) || bVar == null) {
        } else {
            sOnCanvasFirstFrameListenerMap.put(str, bVar);
        }
    }

    public static void setOnCanvasTypeChangedListener(String str, OnCanvasTypeChangedListener onCanvasTypeChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8601cb", new Object[]{str, onCanvasTypeChangedListener});
        } else if (StringUtils.isEmpty(str) || onCanvasTypeChangedListener == null) {
        } else {
            sOnCanvasTypeChangedListenerMap.put(str, onCanvasTypeChangedListener);
        }
    }

    private void ensureRunningOnMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84845aa", new Object[]{this});
        } else if (Looper.myLooper() == this.mainLooper) {
        } else {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    public static void installExternalAdapterImageProvider(ExternalAdapterImageProvider externalAdapterImageProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee68f49c", new Object[]{externalAdapterImageProvider});
        } else if (externalAdapterImageProvider == null) {
        } else {
            sExternalAdapterImageProvider = externalAdapterImageProvider;
            if (sIsImageProviderInstalled) {
                return;
            }
            notifyExternalAdapterImageProviderInstalled();
            sIsImageProviderInstalled = true;
        }
    }

    public static ExternalAdapterImageProvider getExternalAdapterImageProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExternalAdapterImageProvider) ipChange.ipc$dispatch("f7a9ebdb", new Object[0]) : sExternalAdapterImageProvider;
    }

    public static void setJSHandlerForMWidget(String str, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb348b88", new Object[]{str, handler});
        } else if (StringUtils.isEmpty(str) || handler == null) {
        } else {
            sCardJSHandlers.put(str, new WeakReference<>(handler));
        }
    }

    public static void postTaskToJsThreadForMWidget(final String str, final long j) {
        WeakReference<Handler> weakReference;
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8476e718", new Object[]{str, new Long(j)});
        } else if (StringUtils.isEmpty(str) || (weakReference = sCardJSHandlers.get(str)) == null || (handler = weakReference.get()) == null) {
        } else {
            handler.post(new Runnable() { // from class: com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FCanvasJNIBridge.nPerformTaskOnJsThread(str, j);
                    }
                }
            });
        }
    }

    public static void notifyOnCanvasTypeChanged(String str, boolean z) {
        OnCanvasTypeChangedListener onCanvasTypeChangedListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5fa1a9", new Object[]{str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || (onCanvasTypeChangedListener = sOnCanvasTypeChangedListenerMap.get(str)) == null) {
        } else {
            onCanvasTypeChangedListener.onCanvasTypeChanged(str, z);
            sOnCanvasTypeChangedListenerMap.remove(str);
        }
    }

    public static void notifyOnFirstFrameFinish(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3814eb49", new Object[]{str});
        } else if (StringUtils.isEmpty(str) || (bVar = sOnCanvasFirstFrameListenerMap.get(str)) == null) {
        } else {
            bVar.a();
            sOnCanvasFirstFrameListenerMap.remove(str);
        }
    }

    public static String imagePixelsToBase64(byte[] bArr, int i, int i2, String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc5464a", new Object[]{bArr, new Integer(i), new Integer(i2), str, new Float(f)}) : gix.a(bArr, i, i2, i, i2, str, f);
    }

    public static String imageBitmapToBase64(String str, boolean z, String str2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a703459", new Object[]{str, new Boolean(z), str2, new Float(f)}) : gix.a(str, str2, f);
    }

    public static String imagePixelsToTempPath(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str2, float f, boolean z2) {
        String str3;
        String str4 = "png";
        if (!str4.equalsIgnoreCase(str2)) {
            str4 = com.taobao.android.litecreator.comprehension.f.FILE_TYPE_IMAGE_JPG;
        }
        String a2 = gix.a(str, z, i, i2, i3, i4, i5, i6, str4, f, z2);
        if (StringUtils.isEmpty(a2)) {
            return "";
        }
        try {
            Method declaredMethod = Class.forName("com.alibaba.triver.kit.api.utils.FileUtils").getDeclaredMethod("filePathToApUrl", String.class, String.class);
            declaredMethod.setAccessible(true);
            str3 = (String) declaredMethod.invoke(null, a2, "image");
        } catch (Throwable th) {
            Log.e("FCanvas", "error when call toTempFilePath:", th);
            str3 = "";
        }
        return a2 + "^" + str3;
    }

    /* loaded from: classes5.dex */
    public static class SurfaceTextureWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean released = false;
        private final SurfaceTexture surfaceTexture;

        static {
            kge.a(1071925624);
        }

        public static /* synthetic */ boolean access$000(SurfaceTextureWrapper surfaceTextureWrapper) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2aea732", new Object[]{surfaceTextureWrapper})).booleanValue() : surfaceTextureWrapper.released;
        }

        public SurfaceTextureWrapper(SurfaceTexture surfaceTexture) {
            this.surfaceTexture = surfaceTexture;
        }

        public SurfaceTexture surfaceTexture() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SurfaceTexture) ipChange.ipc$dispatch("78c76774", new Object[]{this}) : this.surfaceTexture;
        }

        public void updateTexImage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6464b64", new Object[]{this});
                return;
            }
            synchronized (this) {
                if (!this.released) {
                    this.surfaceTexture.updateTexImage();
                }
            }
        }

        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
                return;
            }
            synchronized (this) {
                if (!this.released) {
                    this.surfaceTexture.setOnFrameAvailableListener(null);
                    this.surfaceTexture.release();
                    this.released = true;
                }
            }
        }

        public void attachToGLContext(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("113d5032", new Object[]{this, new Integer(i)});
                return;
            }
            synchronized (this) {
                if (!this.released) {
                    this.surfaceTexture.attachToGLContext(i);
                }
            }
        }

        public void detachFromGLContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2ee5d4", new Object[]{this});
            } else {
                this.surfaceTexture.detachFromGLContext();
            }
        }

        public void getTransformMatrix(float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab63d569", new Object[]{this, fArr});
            } else {
                this.surfaceTexture.getTransformMatrix(fArr);
            }
        }

        public void setOnFrameAvailableListener(final SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdaa6c86", new Object[]{this, onFrameAvailableListener});
                return;
            }
            SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener2 = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge.SurfaceTextureWrapper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture});
                    } else if (SurfaceTextureWrapper.access$000(SurfaceTextureWrapper.this)) {
                    } else {
                        onFrameAvailableListener.onFrameAvailable(surfaceTexture);
                    }
                }
            };
            if (Build.VERSION.SDK_INT >= 21) {
                this.surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener2, new Handler(Looper.getMainLooper()));
            } else {
                this.surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener2);
            }
        }
    }

    public static ExternalTexture createExternalTexture(final String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExternalTexture) ipChange.ipc$dispatch("b9ba88dd", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        if (Build.VERSION.SDK_INT >= 16) {
            surfaceTexture.detachFromGLContext();
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture);
        surfaceTextureWrapper.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture2});
                } else {
                    FCanvasJNIBridge.access$100(str);
                }
            }
        });
        return new ExternalTexture(surfaceTextureWrapper);
    }

    public static void registerCanvasNativeAPI(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0c5bbf", new Object[]{new Long(j), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            nRegisterCanvasNativeAPI(j, str);
        }
    }

    public static void unRegisterCanvasNativeAPI(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433312b8", new Object[]{new Long(j), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            nUnRegisterCanvasNativeAPI(j, str);
            sCardJSHandlers.remove(str);
        }
    }

    public void stopVsyncIfExists() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce82af", new Object[]{this});
            return;
        }
        f fVar = this.mVsyncScheduler;
        if (fVar == null) {
            return;
        }
        fVar.b();
    }

    public void dispatchVsync(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8245c6", new Object[]{this, new Long(j)});
            return;
        }
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        nativeOnVsync(l.longValue(), j);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        nPause(l.longValue());
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        Long l = this.nativePlatformViewId;
        if (l == null) {
            return;
        }
        nResume(l.longValue());
    }

    public Bitmap makeSnapshot(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("76fd38c1", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && isAttached()) {
            return nMakeSnapshot(str);
        }
        return null;
    }
}
