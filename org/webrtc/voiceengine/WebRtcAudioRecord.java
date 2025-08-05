package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcDeviceInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class WebRtcAudioRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    public static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG = "WebRtcAudioRecord";
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord = null;
    private AudioRecordThread audioThread = null;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;

    /* loaded from: classes9.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* loaded from: classes9.dex */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* loaded from: classes9.dex */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b2fd9e0", new Object[]{this, new Integer(i)})).intValue() : i == 1 ? 16 : 12;
    }

    private static int getDefaultAudioSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca57a00", new Object[0])).intValue();
        }
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeDataIsRecorded(int i, long j);

    public static /* synthetic */ AudioRecord access$000(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioRecord) ipChange.ipc$dispatch("4ec19813", new Object[]{webRtcAudioRecord}) : webRtcAudioRecord.audioRecord;
    }

    public static /* synthetic */ void access$100(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ccc71c", new Object[]{new Boolean(z)});
        } else {
            assertTrue(z);
        }
    }

    public static /* synthetic */ ByteBuffer access$200(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("abd1d01", new Object[]{webRtcAudioRecord}) : webRtcAudioRecord.byteBuffer;
    }

    public static /* synthetic */ boolean access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue() : microphoneMute;
    }

    public static /* synthetic */ byte[] access$400(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("fc9fb55b", new Object[]{webRtcAudioRecord}) : webRtcAudioRecord.emptyBytes;
    }

    public static /* synthetic */ long access$500(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("52025db7", new Object[]{webRtcAudioRecord})).longValue() : webRtcAudioRecord.nativeAudioRecord;
    }

    public static /* synthetic */ void access$600(WebRtcAudioRecord webRtcAudioRecord, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7b7ae5", new Object[]{webRtcAudioRecord, new Integer(i), new Long(j)});
        } else {
            webRtcAudioRecord.nativeDataIsRecorded(i, j);
        }
    }

    public static /* synthetic */ WebRtcAudioRecordSamplesReadyCallback access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebRtcAudioRecordSamplesReadyCallback) ipChange.ipc$dispatch("48894f4a", new Object[0]) : audioSamplesReadyCallback;
    }

    public static /* synthetic */ void access$900(WebRtcAudioRecord webRtcAudioRecord, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1598abd1", new Object[]{webRtcAudioRecord, str});
        } else {
            webRtcAudioRecord.reportWebRtcAudioRecordError(str);
        }
    }

    static {
        kge.a(-442887192);
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
        microphoneMute = false;
        errorCallback = null;
        audioSamplesReadyCallback = null;
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa768ea0", new Object[]{webRtcAudioRecordErrorCallback});
            return;
        }
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    /* loaded from: classes9.dex */
    public static class AudioSamples {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        static {
            kge.a(1349329583);
        }

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97239f31", new Object[]{this})).intValue() : this.audioFormat;
        }

        public int getChannelCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5937b3bc", new Object[]{this})).intValue() : this.channelCount;
        }

        public int getSampleRate() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da7fbe1a", new Object[]{this})).intValue() : this.sampleRate;
        }

        public byte[] getData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this}) : this.data;
        }
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4faf26e8", new Object[]{webRtcAudioRecordSamplesReadyCallback});
        } else {
            audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
        }
    }

    /* loaded from: classes9.dex */
    public class AudioRecordThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean keepAlive;

        static {
            kge.a(1396701909);
        }

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).getRecordingState() != 3) {
                z = false;
            }
            WebRtcAudioRecord.access$100(z);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).read(WebRtcAudioRecord.access$200(WebRtcAudioRecord.this), WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).capacity());
                if (read == WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).capacity()) {
                    if (WebRtcAudioRecord.access$300()) {
                        WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).clear();
                        WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).put(WebRtcAudioRecord.access$400(WebRtcAudioRecord.this));
                    }
                    if (this.keepAlive) {
                        try {
                            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                            WebRtcAudioRecord.access$600(webRtcAudioRecord, read, WebRtcAudioRecord.access$500(webRtcAudioRecord));
                        } catch (Throwable unused) {
                            Logging.e(WebRtcAudioRecord.TAG, "error for call nativeDataIsRecorded");
                        }
                    }
                    if (WebRtcAudioRecord.access$700() != null) {
                        WebRtcAudioRecord.access$700().onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.access$000(WebRtcAudioRecord.this), Arrays.copyOf(WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).array(), WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e(WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.access$900(WebRtcAudioRecord.this, str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.access$000(WebRtcAudioRecord.this) == null) {
                    return;
                }
                WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).stop();
            } catch (IllegalStateException e) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e.getMessage());
            }
        }

        public void stopThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3433c733", new Object[]{this});
                return;
            }
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioRecord(long j) {
        this.effects = null;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
    }

    private boolean enableBuiltInAEC(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18437f32", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Logging.d(TAG, "enableBuiltInAEC(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e(TAG, "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ad02f4c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Logging.d(TAG, "enableBuiltInNS(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e(TAG, "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z);
    }

    private int initRecording(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("189d22ce", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        Logging.d(TAG, "initRecording(sampleRate=" + i + ", channels=" + i2 + ", source:" + i3 + riy.BRACKET_END_STR);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i4 = i / 100;
        this.byteBuffer = ByteBuffer.allocateDirect((i2 << 1) * i4);
        Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        try {
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int channelCountToConfiguration = ArtcDeviceInfo.is_tmall_cc() ? 60 : channelCountToConfiguration(i2);
            int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
            if (minBufferSize == -1 || minBufferSize == -2) {
                reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
                return -1;
            }
            Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
            Logging.d(TAG, "bufferSizeInBytes: " + max);
            audioSource = i3 == 0 ? 7 : 1;
            if (ArtcDeviceInfo.is_tmall_cc()) {
                audioSource = 6;
            }
            try {
                this.audioRecord = new AudioRecord(audioSource, i, channelCountToConfiguration, 2, max);
                AudioRecord audioRecord = this.audioRecord;
                if (audioRecord == null || audioRecord.getState() != 1) {
                    reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                    releaseAudioResources();
                    return -1;
                }
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                return i4;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e.getMessage());
                releaseAudioResources();
                return -1;
            }
        } catch (Throwable unused) {
            Logging.e(TAG, "initRecording error for call nativeCacheDirectBufferAddress");
            return -1;
        }
    }

    private boolean startRecording() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca5bcba", new Object[]{this})).booleanValue();
        }
        Logging.d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                return false;
            }
            this.audioThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, "AudioRecord.startRecording failed: " + e.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("373d5d1a", new Object[]{this})).booleanValue();
        }
        Logging.d(TAG, "stopRecording");
        if (this.audioThread != null) {
            z = true;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }

    private void logMainParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5967b1ee", new Object[]{this});
            return;
        }
        Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35ad7c7", new Object[]{this});
        } else if (!WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
        } else {
            Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
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

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("955156ed", new Object[]{new Integer(i)});
                return;
            }
            Logging.w(TAG, "Audio source is changed from: " + audioSource + " to " + i);
            audioSource = i;
        }
    }

    public static void setMicrophoneMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93eda6e8", new Object[]{new Boolean(z)});
            return;
        }
        Logging.w(TAG, "setMicrophoneMute(" + z + riy.BRACKET_END_STR);
        microphoneMute = z;
    }

    private void releaseAudioResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7c385d", new Object[]{this});
            return;
        }
        Logging.d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            return;
        }
        audioRecord.release();
        this.audioRecord = null;
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff55e43", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback == null) {
            return;
        }
        webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3094c84e", new Object[]{this, audioRecordStartErrorCode, str});
            return;
        }
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback == null) {
            return;
        }
        webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
    }

    private void reportWebRtcAudioRecordError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd0273", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback == null) {
            return;
        }
        webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
    }
}
