package org.webrtc.audio;

import android.media.AudioManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class VolumeLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    static {
        kge.a(1760314970);
    }

    public static /* synthetic */ AudioManager access$000(VolumeLogger volumeLogger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioManager) ipChange.ipc$dispatch("b774b6b3", new Object[]{volumeLogger}) : volumeLogger.audioManager;
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Logging.d(TAG, "start" + WebRtcAudioUtils.getThreadInfo());
        if (this.timer != null) {
            return;
        }
        Logging.d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        this.timer = new Timer(THREAD_NAME);
        this.timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    /* loaded from: classes9.dex */
    public class LogVolumeTask extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        static {
            kge.a(-595240647);
        }

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int mode = VolumeLogger.access$000(VolumeLogger.this).getMode();
            if (mode == 1) {
                Logging.d(VolumeLogger.TAG, "STREAM_RING stream volume: " + VolumeLogger.access$000(VolumeLogger.this).getStreamVolume(2) + " (max=" + this.maxRingVolume + riy.BRACKET_END_STR);
            } else if (mode != 3) {
            } else {
                Logging.d(VolumeLogger.TAG, "VOICE_CALL stream volume: " + VolumeLogger.access$000(VolumeLogger.this).getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + riy.BRACKET_END_STR);
            }
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Logging.d(TAG, "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer = this.timer;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.timer = null;
    }
}
