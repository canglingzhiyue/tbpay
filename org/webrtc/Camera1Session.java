package org.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import tb.kge;

/* loaded from: classes9.dex */
public class Camera1Session implements CameraSession {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private static final Histogram camera1ResolutionHistogram;
    private static final Histogram camera1StartTimeMsHistogram;
    private static final Histogram camera1StopTimeMsHistogram;
    public static CameraSession.CreateSessionCallback sessionCallback;
    private final Context applicationContext;
    private VideoFrame blackFrame;
    private final Camera camera;
    private final int cameraId;
    private final int cameraOutFormat;
    private final Handler cameraThreadHandler;
    private final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private final Camera.CameraInfo info;
    private SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private boolean firstFrameReported = false;
    private volatile boolean enableBlack = false;

    /* renamed from: org.webrtc.Camera1Session$3  reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass3 implements Camera.PreviewCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, Camera camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
                return;
            }
            Camera1Session.access$200(Camera1Session.this);
            if (camera != Camera1Session.access$1200(Camera1Session.this)) {
                Logging.e(Camera1Session.TAG, "Callback from a different camera. This should never happen.");
            } else if (Camera1Session.access$300(Camera1Session.this) != SessionState.RUNNING) {
                Logging.d(Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
            } else {
                long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                if (!Camera1Session.access$400(Camera1Session.this)) {
                    Camera1Session.access$600().addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.access$500(Camera1Session.this)));
                    Camera1Session.access$402(Camera1Session.this, true);
                }
                VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.access$1300(Camera1Session.this).width, Camera1Session.access$1300(Camera1Session.this).height, new Runnable() { // from class: org.webrtc.Camera1Session.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Camera1Session.access$1100(Camera1Session.this).post(new Runnable() { // from class: org.webrtc.Camera1Session.3.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (Camera1Session.access$300(Camera1Session.this) != SessionState.RUNNING) {
                                    } else {
                                        Camera1Session.access$1200(Camera1Session.this).addCallbackBuffer(bArr);
                                    }
                                }
                            });
                        }
                    }
                }), Camera1Session.access$700(Camera1Session.this), nanos);
                Camera1Session.access$100(Camera1Session.this).onFrameCaptured(Camera1Session.this, videoFrame);
                videoFrame.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    public static /* synthetic */ void access$000(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21606c9", new Object[]{camera1Session});
        } else {
            camera1Session.stopInternal();
        }
    }

    public static /* synthetic */ CameraSession.Events access$100(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraSession.Events) ipChange.ipc$dispatch("f35c836", new Object[]{camera1Session}) : camera1Session.events;
    }

    public static /* synthetic */ VideoFrame access$1000(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame) ipChange.ipc$dispatch("ff735562", new Object[]{camera1Session}) : camera1Session.blackFrame;
    }

    public static /* synthetic */ VideoFrame access$1002(Camera1Session camera1Session, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame) ipChange.ipc$dispatch("ed19dbe8", new Object[]{camera1Session, videoFrame});
        }
        camera1Session.blackFrame = videoFrame;
        return videoFrame;
    }

    public static /* synthetic */ Handler access$1100(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("23b1dcd", new Object[]{camera1Session}) : camera1Session.cameraThreadHandler;
    }

    public static /* synthetic */ Camera access$1200(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Camera) ipChange.ipc$dispatch("57f33e7d", new Object[]{camera1Session}) : camera1Session.camera;
    }

    public static /* synthetic */ CameraEnumerationAndroid.CaptureFormat access$1300(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraEnumerationAndroid.CaptureFormat) ipChange.ipc$dispatch("73468ab", new Object[]{camera1Session}) : camera1Session.captureFormat;
    }

    public static /* synthetic */ void access$200(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c558f07", new Object[]{camera1Session});
        } else {
            camera1Session.checkIsOnCameraThread();
        }
    }

    public static /* synthetic */ SessionState access$300(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionState) ipChange.ipc$dispatch("d0071021", new Object[]{camera1Session}) : camera1Session.state;
    }

    public static /* synthetic */ boolean access$400(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6951749", new Object[]{camera1Session})).booleanValue() : camera1Session.firstFrameReported;
    }

    public static /* synthetic */ boolean access$402(Camera1Session camera1Session, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bdfc35", new Object[]{camera1Session, new Boolean(z)})).booleanValue();
        }
        camera1Session.firstFrameReported = z;
        return z;
    }

    public static /* synthetic */ long access$500(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b4db58", new Object[]{camera1Session})).longValue() : camera1Session.constructionTimeNs;
    }

    public static /* synthetic */ Histogram access$600() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Histogram) ipChange.ipc$dispatch("9166acbb", new Object[0]) : camera1StartTimeMsHistogram;
    }

    public static /* synthetic */ int access$700(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7df46395", new Object[]{camera1Session})).intValue() : camera1Session.getFrameOrientation();
    }

    public static /* synthetic */ Camera.CameraInfo access$800(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Camera.CameraInfo) ipChange.ipc$dispatch("2afb22f9", new Object[]{camera1Session}) : camera1Session.info;
    }

    public static /* synthetic */ boolean access$900(Camera1Session camera1Session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f833ebe4", new Object[]{camera1Session})).booleanValue() : camera1Session.enableBlack;
    }

    static {
        kge.a(331805249);
        kge.a(-2121644582);
        camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
        camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
        camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
        sessionCallback = null;
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, int i, Context context, SurfaceTextureHelper surfaceTextureHelper, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4a32a8", new Object[]{createSessionCallback, events, new Integer(i), context, surfaceTextureHelper, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        long nanoTime = System.nanoTime();
        if (i2 == -1) {
            Logging.e(TAG, "cameraId is invalid:" + i2);
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "camera id is invalid");
            return;
        }
        Logging.d(TAG, "Open camera " + i2);
        events.onCameraOpening();
        sessionCallback = createSessionCallback;
        if (i != 1 && i != 3) {
            z = false;
        }
        try {
            Camera open = Camera.open(i2);
            if (open == null) {
                CameraSession.FailureType failureType = CameraSession.FailureType.ERROR;
                createSessionCallback.onFailure(failureType, "android.hardware.Camera.open returned null for camera id = " + i2);
                return;
            }
            try {
                open.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                try {
                    Camera.Parameters parameters = open.getParameters();
                    CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i3, i4, i5);
                    updateCameraParameters(open, parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, i3, i4), z);
                    if (z) {
                        int frameSize = findClosestCaptureFormat.frameSize();
                        for (int i6 = 0; i6 < 3; i6++) {
                            open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                        }
                    }
                    open.setDisplayOrientation(0);
                    createSessionCallback.onDone(new Camera1Session(events, i, context, surfaceTextureHelper, i2, open, cameraInfo, findClosestCaptureFormat, nanoTime));
                } catch (RuntimeException e) {
                    open.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                }
            } catch (IOException | RuntimeException e2) {
                open.release();
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
            }
        } catch (RuntimeException e3) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
        }
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974faeac", new Object[]{camera, parameters, captureFormat, size, new Boolean(z)});
            return;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        parameters.setPreviewFpsRange(captureFormat.framerate.min, captureFormat.framerate.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (z) {
            Objects.requireNonNull(captureFormat);
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraEnumerationAndroid.CaptureFormat) ipChange.ipc$dispatch("becf006", new Object[]{parameters, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        Logging.d(TAG, "Available fps ranges: " + convertFramerates + ", config_fps:" + closestSupportedFramerateRange + ", size:" + closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Size) ipChange.ipc$dispatch("f76246ac", new Object[]{parameters, new Integer(i), new Integer(i2)}) : CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    private Camera1Session(CameraSession.Events events, int i, Context context, SurfaceTextureHelper surfaceTextureHelper, int i2, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j) {
        Logging.d(TAG, "Create new camera1 session on camera " + i2);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.cameraOutFormat = i;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i2;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Logging.d(TAG, "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            return;
        }
        long nanoTime = System.nanoTime();
        stopInternal();
        camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
    }

    @Override // org.webrtc.CameraSession
    public void setBlack(boolean z) {
        VideoFrame videoFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ee5c90", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enableBlack = z;
        if (z || (videoFrame = this.blackFrame) == null) {
            return;
        }
        videoFrame.release();
    }

    private void startCapturing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545bd048", new Object[]{this});
            return;
        }
        Logging.d(TAG, "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() { // from class: org.webrtc.Camera1Session.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i, Camera camera) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8843b162", new Object[]{this, new Integer(i), camera});
                    return;
                }
                if (i == 100) {
                    str = "Camera server died!";
                } else {
                    str = "Camera error: " + i;
                }
                Logging.e(Camera1Session.TAG, str);
                Camera1Session.access$000(Camera1Session.this);
                if (i == 2) {
                    Camera1Session.access$100(Camera1Session.this).onCameraDisconnected(Camera1Session.this);
                } else if (Camera1Session.sessionCallback == null) {
                    Camera1Session.access$100(Camera1Session.this).onCameraError(Camera1Session.this, str);
                } else {
                    Camera1Session.access$000(Camera1Session.this);
                    Camera1Session.sessionCallback.onFailure(CameraSession.FailureType.ERROR, str);
                }
            }
        });
        int i = this.cameraOutFormat;
        if (i == 2) {
            listenForTextureFrames();
        } else {
            if (i == 3) {
                listenForTextureFrames();
            }
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    private void stopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59650de6", new Object[]{this});
            return;
        }
        Logging.d(TAG, "Stop internal");
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            Logging.d(TAG, "Camera is already stopped");
            return;
        }
        this.state = SessionState.STOPPED;
        this.surfaceTextureHelper.stopListening();
        try {
            this.camera.stopPreview();
            this.camera.release();
            this.events.onCameraClosed(this);
            Logging.d(TAG, "Stop done");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private void listenForTextureFrames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc4e846", new Object[]{this});
        } else {
            this.surfaceTextureHelper.startListening(new VideoSink() { // from class: org.webrtc.Camera1Session.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.webrtc.VideoSink
                public void onFrame(VideoFrame videoFrame) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
                        return;
                    }
                    Camera1Session.access$200(Camera1Session.this);
                    if (Camera1Session.access$300(Camera1Session.this) != SessionState.RUNNING) {
                        Logging.d(Camera1Session.TAG, "Texture frame captured but camera is no longer running.");
                        return;
                    }
                    if (!Camera1Session.access$400(Camera1Session.this)) {
                        Camera1Session.access$600().addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.access$500(Camera1Session.this)));
                        Camera1Session.access$402(Camera1Session.this, true);
                    }
                    int access$700 = Camera1Session.access$700(Camera1Session.this);
                    if (Camera1Session.access$800(Camera1Session.this).facing != 1) {
                        z = false;
                    }
                    if (!Camera1Session.access$900(Camera1Session.this)) {
                        VideoFrame videoFrame2 = new VideoFrame(CameraSession.StaticMethod.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), z, access$700), 0, videoFrame.getTimestampNs());
                        Camera1Session.access$100(Camera1Session.this).onFrameCaptured(Camera1Session.this, videoFrame2);
                        videoFrame2.release();
                        return;
                    }
                    if (Camera1Session.access$1000(Camera1Session.this) == null) {
                        Camera1Session camera1Session = Camera1Session.this;
                        Camera1Session.access$1002(camera1Session, new VideoFrame(CameraSession.StaticMethod.createTextureBufferWithModifiedTransformMatrix(SurfaceTextureHelper.createSolidColorTexture2D(Camera1Session.access$1100(camera1Session), new byte[]{0, 0, 0, 1}, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight()), z, access$700), 0, videoFrame.getTimestampNs()));
                    } else {
                        Camera1Session.access$1000(Camera1Session.this).setTimestampNs(videoFrame.getTimestampNs());
                    }
                    CameraSession.Events access$100 = Camera1Session.access$100(Camera1Session.this);
                    Camera1Session camera1Session2 = Camera1Session.this;
                    access$100.onFrameCaptured(camera1Session2, Camera1Session.access$1000(camera1Session2));
                }
            });
        }
    }

    private void listenForBytebufferFrames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75627437", new Object[]{this});
        } else {
            this.camera.setPreviewCallbackWithBuffer(new AnonymousClass3());
        }
    }

    private int getFrameOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee193593", new Object[]{this})).intValue();
        }
        int deviceOrientation = CameraSession.StaticMethod.getDeviceOrientation(this.applicationContext);
        if (this.info.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.info.orientation + deviceOrientation) % 360;
    }

    private void checkIsOnCameraThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338bbe87", new Object[]{this});
        } else if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    @Override // org.webrtc.CameraSession
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
            return;
        }
        Camera camera = this.camera;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (z) {
            parameters.setFlashMode("torch");
        } else {
            parameters.setFlashMode("off");
        }
        this.camera.setParameters(parameters);
    }

    @Override // org.webrtc.CameraSession
    public void setBrightness(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be5c8e9", new Object[]{this, new Integer(i)});
        } else if (i > 100 || i < 0) {
            Logging.d(TAG, "setBrightness parameter error, brightness: " + i);
        } else {
            Camera camera = this.camera;
            if (camera == null) {
                return;
            }
            Camera.Parameters parameters = camera.getParameters();
            if (!parameters.isAutoExposureLockSupported()) {
                return;
            }
            int maxExposureCompensation = parameters.getMaxExposureCompensation();
            int minExposureCompensation = parameters.getMinExposureCompensation();
            if (maxExposureCompensation <= minExposureCompensation) {
                Logging.d(TAG, "setBrightness faild, maxExposure: " + maxExposureCompensation + ", minExposure: " + minExposureCompensation);
                return;
            }
            parameters.setAutoExposureLock(false);
            this.camera.setParameters(parameters);
            Camera.Parameters parameters2 = this.camera.getParameters();
            int i2 = (((maxExposureCompensation - minExposureCompensation) * i) / 100) + minExposureCompensation;
            parameters2.setExposureCompensation(i2);
            parameters2.setAutoExposureLock(true);
            this.camera.setParameters(parameters2);
            Camera.Parameters parameters3 = this.camera.getParameters();
            Logging.d(TAG, "setBrightness cameral parameters: " + parameters3.flatten());
            Logging.d(TAG, "setBrightness, minExposure: " + minExposureCompensation + ", maxExposure: " + maxExposureCompensation + ", exposure: " + i2 + ", brightness: " + i);
        }
    }

    @Override // org.webrtc.CameraSession
    public int getBrightness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64ceed41", new Object[]{this})).intValue();
        }
        Camera camera = this.camera;
        int i = -1;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            int exposureCompensation = parameters.getExposureCompensation();
            int maxExposureCompensation = parameters.getMaxExposureCompensation();
            int minExposureCompensation = parameters.getMinExposureCompensation();
            if (maxExposureCompensation > minExposureCompensation) {
                i = ((exposureCompensation - minExposureCompensation) * 100) / (maxExposureCompensation - minExposureCompensation);
            }
            Logging.d(TAG, "getBrightness, minExposure: " + minExposureCompensation + ", maxExposure: " + maxExposureCompensation + ", exposure: " + exposureCompensation + ", brightness: " + i);
        }
        return i;
    }

    public int getCameraOutFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c463884", new Object[]{this})).intValue() : this.cameraOutFormat;
    }
}
