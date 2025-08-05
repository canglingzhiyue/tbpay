package io.unicorn.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.util.s;
import io.unicorn.embedding.engine.a;
import io.unicorn.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.unicorn.embedding.engine.renderer.SurfaceTextureWrapper;
import io.unicorn.plugin.common.j;
import io.unicorn.plugin.platform.PlatformViewsController;
import io.unicorn.view.AccessibilityBridge;
import io.unicorn.view.FlutterCallbackInformation;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;
import tb.rtd;
import tb.rth;
import tb.rtp;
import tb.rtu;

/* loaded from: classes9.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate;
    private static boolean loadLibraryCalled;
    private static String observatoryUri;
    private static float refreshRateFPS;
    private a accessibilityDelegate;
    private c mUpdateListener;
    private Long nativePlatformUniqueId;
    private Long nativeShellHolderId;
    private rth platformMessageHandler;
    private PlatformViewsController platformViewsController;
    private d shellSetupListener;
    private final Set<a.InterfaceC1058a> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.unicorn.embedding.engine.renderer.b> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    /* loaded from: classes9.dex */
    public interface a {
        void a(ByteBuffer byteBuffer, String[] strArr);

        void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);
    }

    /* loaded from: classes9.dex */
    public interface b {
        void a(long j);
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes9.dex */
    public interface d {
        void a();
    }

    static {
        kge.a(615827934);
        refreshRateFPS = 60.0f;
        loadLibraryCalled = false;
    }

    private static void asyncWaitForVsync(long j) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar != null) {
            bVar.a(j);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    private void handlePlatformMessageResponse(int i, byte[] bArr) {
        rth rthVar = this.platformMessageHandler;
        if (rthVar != null) {
            rthVar.a(i, bArr);
        }
    }

    private native long nativeAttach(FlutterJNI flutterJNI, String[] strArr);

    private native void nativeCleanOrRestoreImages(long j, boolean z);

    private native void nativeDestroy(long j, long j2);

    private native void nativeDetach(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native Bitmap nativeGetBitmap(long j);

    private native String nativeGetScreenshotPixelCheckInfo(long j);

    private native long nativeGetUnicornFirstScreenTimeInterval(long j);

    private native long nativeGetUnicornFirstScreenTimeStamp(long j);

    public static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j);

    public static native void nativeInstallFlutterExternalAdapterImageProvider();

    public static native void nativeInstallFlutterExternalAdapterNetworkProvider();

    private native void nativeInvalidGlContext(long j);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    public static native void nativeOnVsync(long j, long j2, long j3);

    private native long nativePlatformUniqueId(long j);

    public static native void nativePrefetchDefaultFontManager(boolean z);

    private native long nativeReattach(long j, String[] strArr);

    private native void nativeRegisterPlatformView(String str, long j);

    private native void nativeRegisterTexture(long j, long j2, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetAssetManager(long j, AssetManager assetManager);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private native FlutterJNI nativeSpawn(long j, String[] strArr);

    private native void nativeSurfaceChanged(long j, int i, int i2);

    private native void nativeSurfaceCreated(long j, Surface surface, boolean z);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface, boolean z);

    public static native void nativeSwitchTraceState(boolean z);

    private native void nativeUnregisterTexture(long j, long j2);

    private static native void nativeUpdateRefreshRate(float f);

    public static native void nativeWarmUpDefaultFont();

    private static void onLibraryLoad() {
        if (io.unicorn.embedding.engine.a.f24826a != null) {
            io.unicorn.embedding.engine.a.f24826a.a();
        }
    }

    public static void onLoadedLibrary() {
        loadLibraryCalled = true;
    }

    private void onPreEngineRestart() {
        for (a.InterfaceC1058a interfaceC1058a : this.engineLifecycleListeners) {
            interfaceC1058a.a();
        }
    }

    public static void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public static void setRefreshRateFPS(float f) {
        if (refreshRateFPS != f) {
            refreshRateFPS = f;
            updateRefreshRate();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.a(byteBuffer, strArr);
        }
    }

    public static void updateRefreshRate() {
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateRefreshRate(refreshRateFPS);
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.a(byteBuffer, strArr, byteBufferArr);
        }
    }

    WeexValue CallUINodeMethod(int i, String str, WeexValue[] weexValueArr) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.a(i, str, weexValueArr);
        }
        return null;
    }

    public void addEngineLifecycleListener(a.InterfaceC1058a interfaceC1058a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC1058a);
    }

    public void addIsDisplayingFlutterUiListener(io.unicorn.embedding.engine.renderer.b bVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(bVar);
    }

    public void addShellSetupListener(d dVar) {
        ensureRunningOnMainThread();
        this.shellSetupListener = dVar;
    }

    public void attachToNative(String[] strArr) {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.nativeShellHolderId = Long.valueOf(performNativeAttach(this, strArr));
        this.nativePlatformUniqueId = Long.valueOf(nativePlatformUniqueId(this.nativeShellHolderId.longValue()));
    }

    public void cleanOrRestoreImages(boolean z) {
        nativeCleanOrRestoreImages(this.nativeShellHolderId.longValue(), z);
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.i();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    long createPlatformView(String str, int i, int i2, WeexValue weexValue, WeexValue weexValue2, HashSet<String> hashSet) {
        ensureRunningOnMainThread();
        if (this.platformViewsController != null) {
            return this.platformViewsController.a(str, i, i2, com.taobao.android.weex.util.c.a(weexValue), com.taobao.android.weex.util.c.a(weexValue2), hashSet);
        }
        return -1L;
    }

    long createPlatformView(String str, int i, int i2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.a(str, i, i2, hashMap, hashMap2, hashSet);
        }
        return -1L;
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.j();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDestroy(this.nativeShellHolderId.longValue(), this.nativePlatformUniqueId.longValue());
        this.nativeShellHolderId = null;
    }

    void detachPlatformView(int i) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.m(i);
        }
    }

    public void detachToNative() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDetach(this.nativeShellHolderId.longValue());
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        rtd.d(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
            return;
        }
        rtd.d(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i, action, null);
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = j.INSTANCE.a(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, action.value, byteBuffer, i2);
    }

    void disposePlatformView(int i, int i2) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.a(i, i2);
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public String getScreenshotPixelCheckInfo() {
        return nativeGetScreenshotPixelCheckInfo(this.nativeShellHolderId.longValue());
    }

    public long getUnicornEngineId() {
        Long l = this.nativePlatformUniqueId;
        if (l == null || l.longValue() == 0) {
            return -1L;
        }
        return this.nativePlatformUniqueId.longValue();
    }

    public long getUnicornFirstScreenTimeInterval() {
        Long l = this.nativePlatformUniqueId;
        if (l == null || l.longValue() == 0) {
            return -1L;
        }
        return nativeGetUnicornFirstScreenTimeInterval(this.nativePlatformUniqueId.longValue());
    }

    public long getUnicornFirstScreenTimeStamp() {
        Long l = this.nativePlatformUniqueId;
        if (l == null || l.longValue() == 0) {
            return -1L;
        }
        return nativeGetUnicornFirstScreenTimeStamp(this.nativePlatformUniqueId.longValue());
    }

    public void handlePlatformMessage(String str, byte[] bArr, int i) {
        rth rthVar = this.platformMessageHandler;
        if (rthVar != null) {
            rthVar.a(str, bArr, i);
        }
    }

    public void invalidGlContext() {
        nativeInvalidGlContext(this.nativeShellHolderId.longValue());
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            return;
        }
        rtd.d(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
    }

    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
            return;
        }
        rtd.d(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public native boolean nativeFlutterTextUtilsIsEmoji(int i);

    public native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    public native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    public native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    public native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    void offsetPlatformView(int i, int i2, double d2, double d3) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.a(i, d2, d3);
        }
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.g();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.a(i, i2, i3, i4, i5);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack, int i8) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.a(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack, i8);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.h();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (io.unicorn.embedding.engine.renderer.b bVar : this.flutterUiDisplayListeners) {
            bVar.a();
        }
    }

    public void onNewFrameAvailable() {
        c cVar = this.mUpdateListener;
        if (cVar != null) {
            cVar.a();
        }
    }

    void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (io.unicorn.embedding.engine.renderer.b bVar : this.flutterUiDisplayListeners) {
            bVar.b();
        }
    }

    public void onShellSetupReady() {
        ensureRunningOnMainThread();
        s.a("onShellSetupReady");
        d dVar = this.shellSetupListener;
        if (dVar != null) {
            dVar.a();
        }
        s.b("onShellSetupReady");
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i2);
    }

    public void onSurfaceCreated(Surface surface) {
        onSurfaceCreated(surface, false);
    }

    public void onSurfaceCreated(Surface surface, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface, z);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface, z);
    }

    public long performNativeAttach(FlutterJNI flutterJNI, String[] strArr) {
        return nativeAttach(flutterJNI, strArr);
    }

    public void reattachToNative(String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.nativePlatformUniqueId = Long.valueOf(nativeReattach(this.nativeShellHolderId.longValue(), strArr));
    }

    public void registerPlatformView(String str) {
        nativeRegisterPlatformView(str, this.nativePlatformUniqueId.longValue());
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(a.InterfaceC1058a interfaceC1058a) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC1058a);
    }

    public void removeIsDisplayingFlutterUiListener(io.unicorn.embedding.engine.renderer.b bVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(bVar);
    }

    int resizePlatformView(int i, int i2, double d2, double d3) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.a(i, i2, d2, d3);
        }
        return 0;
    }

    void sendTouchEvents(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f2, int i8, int i9, int i10, int i11, long j, Object obj, Object obj2) {
        ensureRunningOnMainThread();
        rtp.a aVar = new rtp.a(i, Integer.valueOf(i2), Integer.valueOf(i3), i4, i5, obj, obj2, i6, i7, f, f2, i8, i9, i10, i11, j);
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.a(aVar);
        }
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAssetManager(AssetManager assetManager) {
        nativeSetAssetManager(this.nativeShellHolderId.longValue(), assetManager);
    }

    public void setOnFrameAvailableListener(c cVar) {
        this.mUpdateListener = cVar;
    }

    public void setPlatformMessageHandler(rth rthVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = rthVar;
    }

    public void setPlatformViewsController(PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public FlutterJNI spawn(String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), strArr);
        Long l = nativeSpawn.nativeShellHolderId;
        rtu.a((l == null || l.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    void updatePlatformViewAttrs(int i, WeexValue weexValue, int i2) {
        ensureRunningOnMainThread();
        if (this.platformViewsController != null) {
            this.platformViewsController.a(i, com.taobao.android.weex.util.c.a(weexValue), i2);
        }
    }

    void updatePlatformViewAttrs(int i, HashMap<String, String> hashMap, int i2) {
        ensureRunningOnMainThread();
        PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            platformViewsController.a(i, hashMap, i2);
        }
    }
}
