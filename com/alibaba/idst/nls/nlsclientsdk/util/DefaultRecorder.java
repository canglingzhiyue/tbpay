package com.alibaba.idst.nls.nlsclientsdk.util;

import android.media.AudioRecord;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class DefaultRecorder implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SAMPLE_RATE_16K = 16000;
    public static final int STATUS_FAILED = -1;
    public static final int STATUS_READY = 0;
    public static final int STATUS_STARTING = 1;
    public static final int STATUS_STOPPING = 7;
    public static final int STATUS_WORKING = 6;
    private static final String TAG = "AliSpeechSDK";
    private static long allowedRecordDuration;
    private RecorderCallbackWithStatus callback;
    private Thread thread;
    public int SAMPLES_PER_FRAME = 640;
    private AudioRecord mAudioRecorder = new AudioRecord(0, 16000, 16, 2, AudioRecord.getMinBufferSize(16000, 16, 2) << 1);
    private volatile int status = 0;

    static {
        kge.a(1110891227);
        kge.a(-1390502639);
        allowedRecordDuration = 60000L;
    }

    public DefaultRecorder(RecorderCallbackWithStatus recorderCallbackWithStatus) {
        this.callback = recorderCallbackWithStatus;
    }

    public int start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("810347dc", new Object[]{this})).intValue();
        }
        AudioRecord audioRecord = this.mAudioRecorder;
        if (audioRecord == null || audioRecord.getState() == 0) {
            this.status = -1;
            Log.e(TAG, "Failed to initialize AudioRecord!");
        }
        if (this.status == -1) {
            Log.e(TAG, "Failed to startDialog DefaultRecorder!" + this.status);
            return -1;
        } else if (this.status == 6 || this.status == 1) {
            return 0;
        } else {
            try {
                this.status = 1;
                this.mAudioRecorder.startRecording();
                this.status = 6;
                this.thread = new Thread(this);
                this.thread.start();
                return 0;
            } catch (IllegalStateException e) {
                this.status = -1;
                Log.e(TAG, "Failed to startDialog AudioRecorder!", e);
                return -1;
            }
        }
    }

    public int getRecordStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6dec4a13", new Object[]{this})).intValue() : this.status;
    }

    public int stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6623bb7c", new Object[]{this})).intValue();
        }
        if (this.status == 1 || this.status == 6) {
            this.status = 7;
        }
        return 0;
    }

    public void setMaxRecordDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e697075", new Object[]{this, new Integer(i)});
        } else {
            allowedRecordDuration = i;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.callback.onPre();
            byte[] bArr = new byte[this.SAMPLES_PER_FRAME];
            long currentTimeMillis = System.currentTimeMillis();
            while (this.status == 6) {
                int read = this.mAudioRecorder.read(bArr, 0, this.SAMPLES_PER_FRAME);
                if (read > 0 && this.status == 6) {
                    this.callback.onVoiceData(bArr, read);
                    this.callback.onVoiceVolume(calculateVolume(bArr, read));
                }
                if (System.currentTimeMillis() - currentTimeMillis >= allowedRecordDuration) {
                    String str = "Record runs over limited duration " + allowedRecordDuration + " ms, auto stop the request!";
                    break;
                }
            }
            try {
                this.mAudioRecorder.stop();
                this.mAudioRecorder.release();
                this.mAudioRecorder = null;
                this.status = 0;
            } catch (IllegalStateException e) {
                this.status = -1;
                Log.e(TAG, "Failed to stop AudioRecorder!", e);
            }
            this.callback.onPost();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private int calculateVolume(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b311b08", new Object[]{this, bArr, new Integer(i)})).intValue();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            int i4 = (bArr[i3] & 255) + ((bArr[i3 + 1] & 255) << 8);
            if (i4 >= 32768) {
                i4 = 65535 - i4;
            }
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return (int) ((i2 >> 7) / 2.55d);
    }
}
