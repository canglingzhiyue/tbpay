package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.VolumeShaper;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.h;
import com.taobao.trtc.utils.TrtcLog;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import tb.kge;
import tb.qvc;
import tb.riy;

/* loaded from: classes9.dex */
public class WebRtcAudioTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE;
    private static final String TAG = "WebRtcAudioTrack";
    private static int contentType;
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static volatile boolean speakerMute;
    private static int streamType;
    private static int usageAttribute;
    private final AudioManager audioManager;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
    private AudioTrack audioTrack = null;
    private AudioTrackThread audioThread = null;

    /* loaded from: classes9.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: classes9.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    /* loaded from: classes9.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b2fd9e0", new Object[]{this, new Integer(i)})).intValue() : i == 1 ? 4 : 12;
    }

    private static int getDefaultContentTypeAttributeOnLollipopOrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a74af8a", new Object[0])).intValue();
        }
        return 1;
    }

    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdc627bc", new Object[0])).intValue();
        }
        return 2;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeGetPlayoutData(int i, long j);

    public static /* synthetic */ AudioTrack access$000(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioTrack) ipChange.ipc$dispatch("9bfae20f", new Object[]{webRtcAudioTrack}) : webRtcAudioTrack.audioTrack;
    }

    public static /* synthetic */ void access$100(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ccc71c", new Object[]{new Boolean(z)});
        } else {
            assertTrue(z);
        }
    }

    public static /* synthetic */ ByteBuffer access$200(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("b882fcd5", new Object[]{webRtcAudioTrack}) : webRtcAudioTrack.byteBuffer;
    }

    public static /* synthetic */ long access$300(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c7d4367", new Object[]{webRtcAudioTrack})).longValue() : webRtcAudioTrack.nativeAudioTrack;
    }

    public static /* synthetic */ void access$400(WebRtcAudioTrack webRtcAudioTrack, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f23cf3", new Object[]{webRtcAudioTrack, new Integer(i), new Long(j)});
        } else {
            webRtcAudioTrack.nativeGetPlayoutData(i, j);
        }
    }

    public static /* synthetic */ boolean access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue() : speakerMute;
    }

    public static /* synthetic */ byte[] access$600(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("41c7f9cd", new Object[]{webRtcAudioTrack}) : webRtcAudioTrack.emptyBytes;
    }

    public static /* synthetic */ void access$700(WebRtcAudioTrack webRtcAudioTrack, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddfb6f9", new Object[]{webRtcAudioTrack, str});
        } else {
            webRtcAudioTrack.reportWebRtcAudioTrackError(str);
        }
    }

    static {
        kge.a(-1258980652);
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
        contentType = getDefaultContentType();
        streamType = 0;
        speakerMute = false;
        errorCallbackOld = null;
        errorCallback = null;
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cba47baa", new Object[]{new Integer(i)});
                return;
            }
            Logging.w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i);
            usageAttribute = i;
        }
    }

    private static int getDefaultUsageAttribute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2acca260", new Object[0])).intValue();
        }
        if (!WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return 0;
        }
        return getDefaultUsageAttributeOnLollipopOrHigher();
    }

    private static int getDefaultContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6783e4c2", new Object[0])).intValue();
        }
        if (!WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return 0;
        }
        return getDefaultContentTypeAttributeOnLollipopOrHigher();
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d49c74", new Object[]{webRtcAudioTrackErrorCallback});
            return;
        }
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6e10f2", new Object[]{errorCallback2});
            return;
        }
        Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    /* loaded from: classes9.dex */
    public class AudioTrackThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean keepAlive;

        static {
            kge.a(1159361903);
        }

        public static /* synthetic */ Object ipc$super(AudioTrackThread audioTrackThread, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int writePreLollipop;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.access$100(WebRtcAudioTrack.access$000(WebRtcAudioTrack.this).getPlayState() == 3);
            int capacity = WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).capacity();
            while (this.keepAlive) {
                try {
                    WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                    WebRtcAudioTrack.access$400(webRtcAudioTrack, capacity, WebRtcAudioTrack.access$300(webRtcAudioTrack));
                    WebRtcAudioTrack.access$100(capacity <= WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).remaining());
                    if (WebRtcAudioTrack.access$500()) {
                        WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).clear();
                        WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).put(WebRtcAudioTrack.access$600(WebRtcAudioTrack.this));
                        WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).position(0);
                    }
                    if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                        writePreLollipop = writeOnLollipop(WebRtcAudioTrack.access$000(WebRtcAudioTrack.this), WebRtcAudioTrack.access$200(WebRtcAudioTrack.this), capacity);
                    } else {
                        writePreLollipop = writePreLollipop(WebRtcAudioTrack.access$000(WebRtcAudioTrack.this), WebRtcAudioTrack.access$200(WebRtcAudioTrack.this), capacity);
                    }
                    if (writePreLollipop != capacity) {
                        Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writePreLollipop);
                        if (writePreLollipop < 0) {
                            this.keepAlive = false;
                            WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                            WebRtcAudioTrack.access$700(webRtcAudioTrack2, "AudioTrack.write failed: " + writePreLollipop);
                        }
                    }
                    WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).rewind();
                } catch (Throwable unused) {
                    Logging.e(WebRtcAudioTrack.TAG, "error for call nativeGetPlayoutData");
                    return;
                }
            }
        }

        private int writeOnLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d0e34ee4", new Object[]{this, audioTrack, byteBuffer, new Integer(i)})).intValue() : audioTrack.write(byteBuffer, i, 0);
        }

        private int writePreLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2cbc1e0a", new Object[]{this, audioTrack, byteBuffer, new Integer(i)})).intValue() : audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
        }

        public void stopThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3433c733", new Object[]{this});
                return;
            }
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(long j, boolean z) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "ctor " + WebRtcAudioUtils.getThreadInfo() + ", streamForMusic: " + z);
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                setAudioTrackUsageAttribute(1);
                contentType = 2;
            }
            streamType = 3;
        }
    }

    private boolean initPlayout(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        int i4 = 2;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8effc516", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(stream_type=" + i + ", sampleRate=" + i2 + ", channels=" + i3 + riy.BRACKET_END_STR);
        this.byteBuffer = ByteBuffer.allocateDirect((i3 << 1) * (i2 / 100));
        StringBuilder sb = new StringBuilder();
        sb.append("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        try {
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int channelCountToConfiguration = channelCountToConfiguration(i3);
            int minBufferSize = AudioTrack.getMinBufferSize(i2, channelCountToConfiguration, 2);
            Logging.d(TAG, "AudioTrack.getMinBufferSize: " + minBufferSize);
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                return false;
            } else if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                return false;
            } else {
                try {
                    if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        this.audioTrack = createAudioTrackOnLollipopOrHigher(i4, i2, channelCountToConfiguration, minBufferSize);
                    } else {
                        this.audioTrack = new AudioTrack(i, i2, channelCountToConfiguration, 2, minBufferSize, 1);
                    }
                    AudioTrack audioTrack = this.audioTrack;
                    if (audioTrack == null || audioTrack.getState() != 1) {
                        reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                        releaseAudioResources();
                        return false;
                    }
                    logMainParameters();
                    logMainParametersExtended();
                    return true;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioTrackInitError(e.getMessage());
                    releaseAudioResources();
                    return false;
                }
            }
        } catch (Throwable unused) {
            Logging.e(TAG, "error for call nativeCacheDirectBufferAddress");
            return false;
        }
    }

    private boolean startPlayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef96c163", new Object[]{this})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            if (Build.VERSION.SDK_INT >= 26 && streamType == 3 && qvc.a(h.TRTC_ORANGE_DEF_BOOL_AUDIO_VOLUME_SHARP_ENABLE, true)) {
                int a2 = qvc.a(h.TRTC_ORANGE_DEF_INT_AUDIO_VOLUME_SHARP_DURATION, 5000);
                this.audioTrack.createVolumeShaper(new VolumeShaper.Configuration.Builder().setInterpolatorType(1).setCurve(new float[]{0.0f, 0.5f, 1.0f}, new float[]{qvc.a(h.TRTC_ORANGE_DEF_FLOAT_AUDIO_VOLUME_SHARP_VOLUME1, 0.2f), qvc.a(h.TRTC_ORANGE_DEF_FLOAT_AUDIO_VOLUME_SHARP_VOLUME2, 0.5f), 1.0f}).setDuration(a2).build()).apply(VolumeShaper.Operation.PLAY);
                TrtcLog.d(TAG, "VolumeShaper start, duration: " + a2);
            }
        } catch (Throwable unused) {
        }
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            this.audioThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a5af9c3", new Object[]{this})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        }
        assertTrue(z);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.d(TAG, "AudioTrack.stop is done.");
            } catch (IllegalStateException e) {
                Logging.e(TAG, "AudioTrack.stop failed: " + e.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    private int getStreamMaxVolume() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cb95042", new Object[]{this})).intValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        if (this.audioManager != null) {
            z = true;
        }
        assertTrue(z);
        return this.audioManager.getStreamMaxVolume(streamType);
    }

    private boolean setStreamVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("942134a4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i + riy.BRACKET_END_STR);
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(streamType, i, 0);
        return true;
    }

    private boolean isVolumeFixed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d1997b", new Object[]{this})).booleanValue();
        }
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return this.audioManager.isVolumeFixed();
        }
        return false;
    }

    private int getStreamVolume() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc2581aa", new Object[]{this})).intValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        if (this.audioManager != null) {
            z = true;
        }
        assertTrue(z);
        return this.audioManager.getStreamVolume(streamType);
    }

    private void logMainParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5967b1ee", new Object[]{this});
            return;
        }
        Logging.d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioTrack) ipChange.ipc$dispatch("ed3c3911", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(streamType);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i2 != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        usageAttribute = i;
        if (i != DEFAULT_USAGE) {
            Logging.w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(contentType).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i2).setChannelMask(i3).build(), i4, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioTrack) ipChange.ipc$dispatch("a8909146", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)}) : new AudioTrack(streamType, i, i2, 2, i3, 1);
    }

    private void logMainParametersExtended() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35ad7c7", new Object[]{this});
            return;
        }
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            Logging.d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
        if (!WebRtcAudioUtils.runningOnNougatOrHigher()) {
            return;
        }
        Logging.d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
    }

    private void logUnderrunCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569d93bf", new Object[]{this});
        } else if (!WebRtcAudioUtils.runningOnNougatOrHigher()) {
        } else {
            Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private static void assertTrue(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74be8db9", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setSpeakerMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4761ff7", new Object[]{new Boolean(z)});
            return;
        }
        Logging.w(TAG, "setSpeakerMute(" + z + riy.BRACKET_END_STR);
        speakerMute = z;
    }

    private void releaseAudioResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7c385d", new Object[]{this});
            return;
        }
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return;
        }
        audioTrack.release();
        this.audioTrack = null;
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ef05d3", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 == null) {
            return;
        }
        errorCallback2.onWebRtcAudioTrackInitError(str);
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8498e4", new Object[]{this, audioTrackStartErrorCode, str});
            return;
        }
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 == null) {
            return;
        }
        errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
    }

    private void reportWebRtcAudioTrackError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f858f203", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 == null) {
            return;
        }
        errorCallback2.onWebRtcAudioTrackError(str);
    }
}
